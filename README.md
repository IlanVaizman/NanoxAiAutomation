# Demoblaze Automation

This is a Selenium-based test automation framework using Cucumber and Java.

## Project Structure

- **`src/test/java/pages/`** – Page Object Model (POM) classes.
- **`src/test/java/stepDefinitions/`** – Step definitions for Cucumber feature files.
- **`src/test/java/runner/`** – Test runner using Cucumber.
- **`src/test/resources/features/`** – Cucumber feature files.
- **`target/`** – Generated test reports and compiled output.

## Running Tests

1. **Clone the repository:**
 
   ```sh
   git clone https://github.com/IlanVaizman/NanoxAiAutomation.git
   ```

2. **Run via Maven:**
   Navigate to the project directory and execute:

   ```sh
   mvn clean test 
   ```
   
3. **View the test report:** 
   Open the `index.html` file located in the `target/cucumber-reports` directory.
   ```sh
    start target/cucumber-reports.html
   ```
   
## 3-Month Automation Strategy Plan
### Tool Enhancements
- Add Selenide framework for better stability and readability.
- Add Allure report for test results history.

### Test Coverage Expansion
- Add API tests to validate the backend.
- Add network logs to find any failed requests.
- Add connection to DB to validate data and also prepare/clean data for tests.

### Performance Improvements
- Add parallel test execution.

### Continuous Integration
- Integrate tests with CI/CD pipelines.

## Critical Test Implementation
- Automate regression tests for frequently used features.
- Prioritize smoke and sanity tests to ensure core functionalities work.

## Expanding coverage and edge cases
- Validate data consistency between frontend, backend, and database.
- Add negative scenarios to test error handling(UI and API).

## Understanding the system that is being tested
- Manually explore the application to understand  user workflows, and key functionalities.
- Review existing documentation, user stories, and requirements to understand the system's functionality and expected behavior.
- Talk to developers, product owners, and QA to gather insights and clarify any doubts about the system.

