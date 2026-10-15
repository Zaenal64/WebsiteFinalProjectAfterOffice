<h1 align="center"> 🌐 Katalon Petstore Web Automation Testing (katalon-petstore-web) </h1> 

This repository contains an automated Web UI testing framework built with Katalon Studio for the JPetStore Demo Web Application (https://petstore.octoperf.com/actions/Catalog.action).
The project automates end-to-end web user scenarios including user authentication (Sign In), catalog navigation, product selection, shopping cart management, and checkout verification.

## 🛠️ Tech Stack & Prerequisites
*Testing Tool: Katalon Studio v11.x
* Language: Groovy / Java.
* Supported Browsers: Chrome, Firefox, Edge.
* Target Application: JPetStore Web Application.
* Version Control: Git & GitHub.

## 📂 Project Structure
```text
|   .classpath
|   .gitattributes
|   .gitignore
|   .project
|   build.gradle
|   console.properties
|   README.md
|   WebsiteAfterOffice.prj
|
+---.cache
|   \---Keywords
|           ..__Include__scripts__groovy__Hooks
|           ..__Include__scripts__groovy__hooks__Hooks
|           ..__Include__scripts__groovy__stepDefinitions__AddCartWithoutLoginSteps
|           ..__Include__scripts__groovy__stepDefinitions__EnterAllProductNavbar
|           ..__Include__scripts__groovy__stepDefinitions__EnterAllProductNavbarSteps
|           ..__Include__scripts__groovy__stepDefinitions__EnterAllProductSideBar
|           ..__Include__scripts__groovy__stepDefinitions__EnterAllProductSideBarSteps
|           ..__Include__scripts__groovy__stepDefinitions__LoginSteps
|           ..__Include__scripts__groovy__stepDefinitions__RegisterPageSteps
|           ..__Include__scripts__groovy__stepDefinitions__SearchSteps
|           ..__Scripts__TC04 - EnterProductNavbar__Script1791226966898
|           base
|           base__Base
|           base__BasePage
|           common
|           components__NavigationPage
|           pages__DashboardPage
|           pages__EnterAllProductSideBar
|           pages__EnterProductNavbarPage
|           pages__EnterProductSideBarPage
|           pages__LoginPage
|           pages__ProductPage
|           pages__RegisterPage
|           pages__SearchPage
|
+---.settings
|       io.cucumber.eclipse.java.prefs
|       org.eclipse.core.resources.prefs
|       org.eclipse.jdt.core.prefs
|       org.eclipse.jdt.groovy.core.prefs
|
+---bin
|   +---groovy
|   |   +---hooks
|   |   |       Hooks.class
|   |   |
|   |   \---stepDefinitions
|   |           EnterAllProductNavbarSteps.class
|   |           EnterAllProductSideBarSteps.class
|   |           LoginSteps.class
|   |           RegisterPageSteps.class
|   |           SearchSteps.class
|   |
|   +---keyword
|   |   +---base
|   |   |       BasePage.class
|   |   |
|   |   +---components
|   |   |       NavigationPage.class
|   |   |
|   |   \---pages
|   |           EnterProductNavbarPage.class
|   |           EnterProductSideBarPage.class
|   |           LoginPage.class
|   |           ProductPage.class
|   |           RegisterPage.class
|   |           SearchPage.class
|   |
|   +---lib
|   |   |   CustomKeywords.class
|   |   |   S1014_0.class
|   |   |
|   |   \---internal
|   |           GlobalVariable.class
|   |
|   +---listener
|   \---testcase
+---Checkpoints
+---Data Files
|   \---Database_MySql
|           .meta
|           loginDB.dat
|
+---Drivers
|       mysql-connector-j-26.7.0.jar
|
+---Include
|   +---config
|   |       log.properties
|   |
|   +---features
|   |       enterAllProductNavbar.feature
|   |       enterAllProductSideBar.feature
|   |       enterRegisterPage.feature
|   |       login.feature
|   |       search.feature
|   |
|   \---scripts
|       \---groovy
|           +---hooks
|           |       Hooks.groovy
|           |
|           \---stepDefinitions
|                   EnterAllProductNavbarSteps.groovy
|                   EnterAllProductSideBarSteps.groovy
|                   LoginSteps.groovy
|                   RegisterPageSteps.groovy
|                   SearchSteps.groovy
|
+---Keywords
|   +---base
|   |       BasePage.groovy
|   |
|   +---components
|   |       NavigationPage.groovy
|   |
|   \---pages
|           EnterProductNavbarPage.groovy
|           EnterProductSideBarPage.groovy
|           LoginPage.groovy
|           ProductPage.groovy
|           RegisterPage.groovy
|           SearchPage.groovy
|
+---Libs
|   |   CustomKeywords.groovy
|   |   S1014_0.groovy
|   |
|   \---internal
|           GlobalVariable.groovy
|
+---Object Repository
|   +---catalog
|   |       emptySearch_txt.rs
|   |       productDesc_txt.rs
|   |       productID_txt.rs
|   |       productImg_img.rs
|   |       productName_txt.rs
|   |       returnDashboard_btn.rs
|   |       titleProduct_txt.rs
|   |
|   +---dashboard
|   |       .meta
|   |       gambarDasboard_img.rs
|   |       navbarProduct_btn.rs
|   |       returnHome.rs
|   |       searchBar_btn.rs
|   |       searchBar_field.rs
|   |       SideBarCategory_btn.rs
|   |
|   +---loginPage
|   |       invalidLogin_txt.rs
|   |       login_btn.rs
|   |       passwordField.rs
|   |       register_btn.rs
|   |       signIn_btn.rs
|   |       titleLogin_txt.rs
|   |       titleSuccessLogin_txt.rs
|   |       usernameField.rs
|   |       welcome_txt.rs
|   |
|   \---registerPage
|           fieldRegisterPage.rs
|
+---Plugins
+---Profiles
|       default.glbl
|       Staging.glbl
|
+---Reports
|   +---20261006_151313
|   |   \---Final Project
|   |       \---Final Project After Office
|   |           \---20261006_151314
|   |               |   1791274760334.png
|   |               |   20261006_151314.csv
|   |               |   20261006_151314.html
|   |               |   console0.log
|   |               |   execution.properties
|   |               |   execution.uuid
|   |               |   execution0.log
|   |               |   JUnit_Report.xml
|   |               |   testCaseBinding
|   |               |   tsc_id.txt
|   |               |
|   |               \---cucumber_report
|   |                   +---1791274401548
|   |                   |       cucumber.html
|   |                   |       cucumber.json
|   |                   |       cucumber.xml
|   |                   |       k-cucumber.json
|   |                   |
|   |                   +---1791274442219
|   |                   |       cucumber.html
|   |                   |       cucumber.json
|   |                   |       cucumber.xml
|   |                   |       k-cucumber.json
|   |                   |
|   |                   +---1791274486778
|   |                   |       cucumber.html
|   |                   |       cucumber.json
|   |                   |       cucumber.xml
|   |                   |       k-cucumber.json
|   |                   |
|   |                   +---1791274549553
|   |                   |       cucumber.html
|   |                   |       cucumber.json
|   |                   |       cucumber.xml
|   |                   |       k-cucumber.json
|   |                   |
|   |                   \---1791274611513
|   |                           cucumber.html
|   |                           cucumber.json
|   |                           cucumber.xml
|   |                           k-cucumber.json
|   |
|   \---Self-healing
|           broken-test-objects-v2.json
|
+---Scripts
|   +---TC01 - Login
|   |       Script1790958640681.groovy
|   |
|   +---TC02 - Search
|   |       Script1791106803167.groovy
|   |
|   +---TC03 - EnterProductSideBar
|   |       Script1791189714955.groovy
|   |
|   +---TC04 - EnterProductNavbar
|   |       Script1791226966898.groovy
|   |
|   \---TC05 - EnterRegisterPage
|           Script1791271409656.groovy
|
+---settings
|   +---external
|   |       com.kms.katalon.composer.execution.settings.properties
|   |       com.kms.katalon.core.db.DatabaseSettings.properties
|   |       com.kms.katalon.integration.azure.properties
|   |
|   \---internal
|           com.katalon.cucumber.properties
|           com.kms.katalon.composer.project.properties
|           com.kms.katalon.composer.testcase.properties
|           com.kms.katalon.composer.testcase.settings.properties
|           com.kms.katalon.core.webservice.properties
|           com.kms.katalon.execution.properties
|           com.kms.katalon.execution.webservice.properties
|           com.kms.katalon.execution.webui.properties
|           com.kms.katalon.execution.windows.properties
|           com.kms.katalon.integration.qtest.properties
|
+---Test Cases
|       TC01 - Login.tc
|       TC02 - Search.tc
|       TC03 - EnterProductSideBar.tc
|       TC04 - EnterProductNavbar.tc
|       TC05 - EnterRegisterPage.tc
|
+---Test Listeners
\---Test Suites
    \---Final Project
            Final Project After Office.groovy
            Final Project After Office.ts
```
## 🚀 How to Run the Tests
1. Open Project in Katalon Studio
  1. Launch Katalon Studio.
  2. Go to File > Open Project > select the katalon-petstore-web folder.
2. Execution via Katalon GUI
  1. Open Test Suites > WebTestSuite.
  2. Click the Run button (Green Play Icon) on the top toolbar.
  3. Select your target browser (e.g., Chrome).

## 🧪 Test Suite & Test Coverage
| Nama Test Suite | Method | Expected Status | Status |
| --- | --- | --- | --- |
| Login, Search, Enter Produk Side Bar & Navbar, Enter Register Page  | E2e | 200 OK |🟢 PASSED |

## 🔒 Security & Best Practices
* Sensitive credentials or private keys are managed via Global Variables and excluded from public tracking.
* .gitignore is pre-configured to exclude build artifacts, logs, and temporary binary files.


