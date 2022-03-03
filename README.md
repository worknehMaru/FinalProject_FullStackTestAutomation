# FinalProject_FullStackTestAutomation

This project created to demonstrate my knowledge and skills in Automation Testing

About:

The project demonstrates a smart automation infrastructure. It is built in hierarchy order of modules. The modules contain number of classes with methods.
There are main/common/helpers/action/pageObject_moduls.
In this way the test can be created in a very simple way with minimum lines code.
Also, the infrastructure allows to work with different kinds of Applications 

Project Overview:

The project is an example of infrastructure for Automation testing of different kinds of applications 
Such:
- Web based application
- Mobile application
- Web API
- Electron application
- Desktop application
- DB

Infrastructure Project includes using of:

- Page Object Design Pattern 
- Project Layers (Extensions /Work Flows / Test Cases 
- Support Different Clients/Browsers 
- Failure Mechanism
- Common Functionality
- External Files Support like (DDT Files, config Files)
- Reporting System (Screenshot, Screen Recorder)
- Visual Testing 
- DB Support 
- CI Support

List Of Applications were used in this project

- Grafana webpage - Web based application
- Mortgage calculator - Mobile Application
- Grafana API - Web API
- Electron application
- Windows calculator - Desktop application

Tools and Frameworks used in the project:

- TestNG - Testing Framework
- Event Listeners: interface used to generate logs and customize the TestNG reports 
- https://remotemysql.com/ - Free online DB - used for login to Grafana Web Page 
- Jenkins - for test execution
- REST Assured - for API Testing 
- Allure - as the main reporting system

Test Execution:

Each of the applications has a few tests for demonstration purpose.
Theses tests can be developed in a very simple way due to a lot of work with the infrastructure. [Sanity]

Known Issues:

Sometimes can be conflict with some dependencies the application are using. Hence, the project is for DEMO purpose ONLY.
In production it should be divided in to several project that solved the conflicts dependencies 


