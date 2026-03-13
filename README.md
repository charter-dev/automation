# Automation Testing Project

This project is an **automation testing framework built with Spring Boot** and several modern testing tools.
It is designed for browser automation, test execution, and reporting.

## Tech Stack

* Java 17
* Spring Boot 3.5.11
* Selenium 4.21
* TestNG
* WebDriverManager
* Allure Report
* ExtentReports

## Dependencies

Main libraries used in this project:

* **Spring Boot Starter** – base framework
* **Selenium Java** – browser automation
* **WebDriverManager** – automatic browser driver management
* **TestNG** – test framework
* **Allure TestNG** – advanced test reporting
* **ExtentReports** – HTML test reporting
* **Apache Commons IO** – file utilities

## Requirements

Make sure the following tools are installed:

* Java 17+
* Maven 3.8+
* Chrome / Firefox browser

## Project Structure

Example structure:

```
src
 ├── main
 │   └── java
 │
 └── test
     └── java
         └── tests
```

## Running Tests

Run tests using Maven:

```
mvn clean test
```

## Generate Allure Report

After running tests:

```
allure serve target/allure-results
```

## Features

* Browser automation with Selenium
* Automatic driver setup using WebDriverManager
* Test execution using TestNG
* Reporting with Allure and ExtentReports
* Maven-based build system

## Build Project

```
mvn clean install
```

## Author

Automation Testing Project

## License

This project is open-source and available under the MIT License.
