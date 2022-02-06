## web-automation

This is the web test automation project for testing. It was built using Java 11, Selenium 4, Cucumber and Selenide frameworks [http://selenide.org/index.html ].

## Features

Project has three feature files which represents the following scenarios:

 SignUp:
   * open  Home page
   * click SignUp button
   * check,I see CreateAccount page
   * input valid user data
   * click "I agree..."
   * click Create account button
   * check, I should see Homepage

Login (3 scenarios):

1) positive scenario
   * open  Home page
   * click Login button
   * check,I see Login page
   * input valid user data
   * click Login button
   * check, I see Home page
   * I hover on the User icon
   * Check,I see Log out item menu
   * I click on Log out item menu
   * check, I should see Homepage
   
2) negative scenario with invalid password (Examples table)
   * open  Home page
   * click Login button
   * check,I see Login page
   * input a valid email and an invalid password  from an Examples table
   * click Login button
   * check, a message is appeared
   
3) negative scenario with invalid e-mail from Faker  
   * open  Home page
   * click Login button
   * check,I see Login page
   * insert invalid Faker-email
   * click Login button
   * check, a message is appeared

Feature files location:
`src\test\resources\de\quandoo\`

## Prerequisites Software/Tools

1. Java Development Kit (Java 11)
   Java Runtime Environment
3. Maven [ http://maven.apache.org/ ]
4. Git [ http://git-scm.com/downloads ]
5. Chrome browser/ Chromedriver
6. JUnit

## Installation/Running Tests

`git clone https://github.com/IrynaAyguen/QA21_quandooCucumber.git`
`cd QA21_quandooCucumber/`
`mvn test`

## Contributors

Iryna Ayguen  iryna.ayguen2021@gmail.com
