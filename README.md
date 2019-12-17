Sample Selenide UI Automation Test Framework [![Build Status](https://travis-ci.com/vikmaksimenko/sample-selenide-automation.svg?branch=master)](https://travis-ci.com/vikmaksimenko/sample-selenide-automation)
=====================================================

This is a project for running Cucumber Selenide automated UI tests on TestContainers 

### Required tools
 
* JDK 8
* Maven
* Docker 

### How to run


0. Start Docker service 
1. Run tests:
```
mvn clean test
```
3. Build reports to temp folder and view in browser:    
```
mvn allure:serve
```
4. Build reports and save to `target/site`
```
mvn allure:report
```

Sample Allure report can be found on http://sample-selenide-automation.surge.sh

### Travis CI Integration

This project is integrated with Travis CI, see https://travis-ci.com/vikmaksimenko/sample-selenide-automation 
