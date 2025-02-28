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
4. ```sh
   start target/cucumber-reports.html
    ```
