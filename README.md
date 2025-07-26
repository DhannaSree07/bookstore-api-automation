# 📚 Bookstore API Automation

This project automates test cases for the Bookstore API using REST Assured, JUnit, and Maven. The main goal of this project is to explore and integrate n8n automation with real-world CI/CD workflows.

## 🎯 Project Objective

The core objective of this project is to build hands-on experience with:
📌 API Test Automation using REST Assured
🔁 CI/CD using GitHub Actions
📩 Automated failure alerts via n8n workflows
If the tests fail, an automated email alert is triggered via n8n.

This project helped solidify my understanding of event-driven automation and how to integrate it with testing pipelines

## 🔧 Tools Used
- Java + Maven
- REST Assured
- JUnit 5
- GitHub Actions (CI/CD)
- n8n - for custom automation and alerting
  
## ▶️ Running the Tests
```bash
mvn clean test
```


## 🚀 GitHub Actions
The tests run automatically on every push to `main` via `.github/workflows/run-tests.yml`.

## 🌐 API Reference
Public API: https://demoqa.com/BookStore/v1/Books
      
## 📬 n8n Integration
n8n listens for webhook calls from GitHub
If the test suite fails, it sends an email notification with the failure details
This enables proactive monitoring of CI pipeline results without manual checking
<img width="875" height="389" alt="Screenshot 2025-07-17 125550" src="https://github.com/user-attachments/assets/02e4af43-b94c-4b93-827d-12ac2361e608" />
<img width="1140" height="544" alt="image" src="https://github.com/user-attachments/assets/cff453bc-32e7-4674-8cd7-fc57b5d0abe8" />


## ✅ Author
Dhanna Sree V S
Passionate QA Automation Engineer | Exploring DevOps & Automation Tools

