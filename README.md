## web-automation

This is the web test automation project for testing. It was built using Java 11, Selenium 4, Cucumber and Selenide frameworks [http://selenide.org/index.html ].

## Features

Project has three feature files which represents the following scenarios:

 SignUp:
   * open  Home page
   * click SignUp button
   * input valid user data
   * click "I agree..."
   * click Create account button
   * check, SignOut tab displayed

Login:
   * open  Home page
   * click Login button
   * input valid user data
   * click Login button
   * check, SignOut tab displayed

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
