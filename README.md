# Reverb API Test Suite (JUnit + RestAssured)

A lightweight and maintainable **API test framework built with JUnit 5 and RestAssured**, designed for real-world validation using production-like traffic captured via HAR files. This project emphasizes test clarity, performance, and easy portability — ideal for showcasing automation architecture skills in Java-based environments.

---

## 🔍 Overview

This project demonstrates:
- Modular API client creation (`ReverbAPIClient`)
- Config centralization (`TestConfig`)
- Real-world scenario testing using browser-captured HAR files
- Lightweight, framework-free execution (no Spring Boot)

Built with portability in mind, it runs seamlessly from any workstation or CI/CD environment with minimal setup.

---

## ⚙️ Tech Stack

- **Java 17+**
- **JUnit 5** – Test lifecycle and assertions
- **RestAssured** – HTTP request/response handling
- **AssertJ** – Fluent assertion library
- **Maven** – Dependency and build management
- **Maven Wrapper** – Run without installing Maven locally

---

## 🚀 Getting Started (Local Execution)

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/reverb-api-testing.git
cd reverb-api-testing
```

### 2. Run the Test Suite
```bash
./mvnw clean test         # Mac/Linux
mvnw.cmd clean test       # Windows
```

> ☑️ No need to install Maven — the wrapper is included.

### 3. Run Specific Tests in IntelliJ or VSCode
- Open `ReverbListingsTest.java`
- Right-click any test method → **Run**

---

## 🧪 Test Coverage Summary

| Test Method                          | Description                                                              |
|-------------------------------------|--------------------------------------------------------------------------|
| `testRecentlyFeaturedArticles()`    | Validates Reverb's featured articles API returns expected content        |
| `testSellGearRedirectsToSellPage()` | Simulates "Sell Your Gear" click, validates redirect behavior or access  |
| `testSellPageTitleFromHAR()`        | Verifies that the static HTML from the HAR includes the correct title    |

---

## 📁 Project Structure

```
src/
├── main/java/automation/reverb/
│   ├── config/       # TestConfig with base URI
│   └── utils/        # ReverbAPIClient for HTTP interactions
├── test/java/automation/reverb/
│   ├── assertions/   # Custom assertion logic using AssertJ
│   └── tests/        # JUnit test classes
```

---
