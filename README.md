# Reverb API Test Suite (JUnit + RestAssured)

This project is a lean, fast, and maintainable **API test framework built with JUnit 5 and RestAssured**.  
It reflects real-world API validation scenarios — including tests driven from captured HAR files (browser activity) — and is designed for easy execution on any developer or QA workstation.

---

## 🧑‍💻 About This Project

Built to demonstrate both technical precision and test maintainability, this project shows how:
- To create modular API clients (`ReverbAPIClient`)
- To centralize configuration (`TestConfig`)
- To validate real-world browser activity (`HAR`-driven assertions)
- To run tests without Spring or external dependencies — fully portable, CLI/IDE-friendly

---

## ⚙️ Tech Stack

- Java 17+
- JUnit 5
- RestAssured
- AssertJ (for fluent assertions)
- Maven (with optional Maven Wrapper)

---

## 🚀 How to Run This Project Locally

### ✅ 1. **Clone the repository**
```bash
git clone https://github.com/your-username/reverb-api-testing.git
cd reverb-api-testing
```

### ✅ 2. **Build and run tests using Maven**
```bash
./mvnw clean test         # if using Maven Wrapper (recommended)
# OR
mvn clean test            # if Maven is already installed on your system
```

### ✅ 3. **Run a specific test class in IntelliJ or VSCode**
- Open `ReverbListingsTest.java`
- Right-click any test method → **Run**

---

## 🧪 Included Test Coverage

| Test Case | Purpose |
|----------|---------|
| `testRecentlyFeaturedArticles()` | Verifies API availability and content on Reverb’s featured articles |
| `testSellGearRedirectsToSellPage()` | Simulates “Sell Your Gear” click and validates redirect |
| `testSellPageTitleFromHAR()` | Validates static HTML content (e.g. page title) from HAR file |

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

## 🔧 Optional Improvements (Already Partially Supported)

To make onboarding even easier:
- ✅ Add `mvnw`/`mvnw.cmd` (Maven Wrapper) to eliminate Maven dependency
- ✅ Include `.editorconfig` or code style guidelines
- ✅ Create `/resources` folder to store sample HAR files and reference HTML

---

## 📜 License

MIT or as applicable.
