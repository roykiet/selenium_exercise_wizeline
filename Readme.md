## Introduction
    - This project is a automation project to support for regression test the website (/http://testapp.galenframework.com) [GitHub](http://github.com)

## Techical approach
    - The project uses Selenium Webdriver 2.53.1 and TestNG to perform actions on the websites as normal users automatically. From that, we go through usecases and workflows as
    much as possible to verify the main functions and some negative cases.
    - The project uses Maven for build so that we can manage our dependencies easily.
    - Because I quite busy in this time by my work, I just used the page object factory framework which is supported with selenium for this automation instead of a better framework.
    - By the framework we will work with Page Object pattern. (each of page in website will be an Object with elements are properties)
    - During run time, each of page will work as a singleton instance to help us save the memory.
    - During our automation, we use only one Webdriver instance.
    - For more details please refer the source code.

## Test results
    After the automation is run completely, the result will be generated automatically. We can review the result with the page by path "target/surefire-reports/index.html"

## Notes
    - Because the framework is using Selenium Webdriver 2.53.1, we need to run with Firefox 46.0.
    - To run with later Firefox version. Please following instruction
        + Update the Selenium Webdriver version to 3.0 in pom.xml file.
        + Download Gecko driver
        + Update setupTest() function in BaseFlowTest class to use Gecko driver.

## How to run
#### Install JDK 1.8
    - Download JDK 1.8 by link [http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html]
    - Run downloaded file to install

#### Install Maven
    - Refer the link [https://www.mkyong.com/maven/how-to-install-maven-in-windows/] to install maven

#### Run automation
    - Download source code.
    - Open command line windows
    - Go to the project folder.
    - Type the command
        "mvn test"
