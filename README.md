# SIT707 8.1P STEM Game Web Application

This project is a Java Spring Boot web application developed for SIT707 Software Quality and Testing. The application turns a login-based web system into a STEM learning game for Grade 4–6 students.

## Features

- Login page with user authentication
- Q1 Addition question
- Q2 Subtraction question
- Q3 Multiplication question
- Correct answer navigation from Q1 to Q2 to Q3
- Error message for wrong answers
- Final success message after completing the game
- JUnit unit testing for math operations
- Selenium functional testing for full user flow

## Login Details

Username: ahsan  
Password: ahsan_pass  
DOB: 01/01/2000

## Test Questions

Q1: 3 + 4 = 7  
Q2: 10 - 4 = 6  
Q3: 4 × 5 = 20

## Technologies Used

- Java
- Spring Boot
- JSP
- Maven
- JUnit
- Selenium WebDriver
- WebDriverManager

## Testing

Unit testing was completed using JUnit for the MathQuestionService class. Functional testing was completed using Selenium WebDriver to test the complete application flow from login to final STEM game completion.

## How to Run

1. Import the project as a Maven project in Eclipse.
2. Run `MyServer.java`.
3. Open `http://localhost:8080/login`.
4. Enter valid login details.
5. Complete Q1, Q2, and Q3.
6. Run JUnit tests from `src/test/java`.

