package com.example.bookstore;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class BookStoreTest {

	    static {
	        RestAssured.baseURI = "https://demoqa.com/BookStore/v1";
	    }

	    // GET - Fetch all books
	    @Test
	    public void testGetBooks() {
	        given()
	        .when()
	            .get("/Books")
	        .then()
	            .statusCode(200)
	            .body("books", not(empty()));
	        System.out.println("Get Request completed");
	    }

	    // POST - Add a book to the user (mock)
	    @Test
	    public void testAddBook() {
	        String payload = """
	        {
	            "userId": "12345678",
	            "collectionOfIsbns": [
	                {
	                    "isbn": "9781449325862"
	                }
	            ]
	        }""";

	        given()
	            .contentType(ContentType.JSON)
	            .body(payload)
	        .when()
	            .post("/Books")
	        .then()
	            .statusCode(401); // Unauthorized without token (expected)
	        System.out.println("Post Request completed");
	    }

	    // PUT - Update book entry (this API may not support PUT, for demo)
	    @Test
	    public void testUpdateBook() {
	        String payload = """
	        {
	            "isbn": "9781449325862",
	            "userId": "12345678"
	        }""";

	        given()
	            .contentType(ContentType.JSON)
	            .body(payload)
	        .when()
	            .put("/Books/9781449325862")
	        .then()
	            .statusCode(anyOf(is(401), is(405))); // Unauthorized or Not Allowed
	        System.out.println("PUT Request completed");
	    }

	    // DELETE - Delete a book
	    @Test
	    public void testDeleteBook() {
	        String payload = """
	        {
	            "isbn": "9781449325862",
	            "userId": "12345678"
	        }""";

	        given()
	            .contentType(ContentType.JSON)
	            .body(payload)
	        .when()
	            .delete("/Book")
	        .then()
	            .statusCode(401); // Unauthorized again (expected)
	        System.out.println("Delete Request completed");
	        
	    }
	@Test
public void testBookSearchFails() {
    Assert.assertEquals(1, 2);  // force failure done
}



	}

