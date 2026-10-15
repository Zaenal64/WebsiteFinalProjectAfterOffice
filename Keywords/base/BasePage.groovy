package base

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory

import org.openqa.selenium.WebDriver
import org.openqa.selenium.JavascriptExecutor

public class BasePage {

    protected static final int TIMEOUT = 10

    // --- Driver & Object Resolver ---
    
    protected WebDriver getDriver() {
        return DriverFactory.getWebDriver()
    }

    // --- Basic Actions --- 
	
	protected void clearText(TestObject object) {
		WebUI.waitForElementPresent(object, TIMEOUT, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(object)
	}
	
    
    protected void click(TestObject object) {
        WebUI.waitForElementPresent(object, TIMEOUT, FailureHandling.STOP_ON_FAILURE)
        WebUI.click(object)
    }

    protected void type(TestObject object, String text) {
        WebUI.waitForElementPresent(object, TIMEOUT, FailureHandling.STOP_ON_FAILURE)
        WebUI.setText(object, text)
    }


    protected String getText(TestObject object) {
        WebUI.waitForElementPresent(object, TIMEOUT, FailureHandling.STOP_ON_FAILURE)
        return WebUI.getText(object)
    }

    // --- Waiting ---
    
    protected void waitVisible(TestObject object) {
        WebUI.waitForElementVisible(object, TIMEOUT, FailureHandling.STOP_ON_FAILURE)
    }

    protected void waitNotVisible(TestObject object) {
        WebUI.waitForElementNotVisible(object, TIMEOUT)
    }

    // --- Verification ---
    
    protected void verifyExist(TestObject object) {
        WebUI.verifyElementPresent(object, TIMEOUT)
    }

    protected void verifyNotExist(TestObject object) {
        WebUI.verifyElementNotPresent(object, TIMEOUT)
    }

    protected void verifyVisible(TestObject object) {
        WebUI.verifyElementVisible(object, TIMEOUT)
    }

    protected void verifyNotVisible(TestObject object) {
        WebUI.verifyElementNotVisible(object, TIMEOUT)
    }
	
	protected void verifyPresent(TestObject object, int timeOut = TIMEOUT) {
		WebUI.verifyElementPresent(object, TIMEOUT)
	}

	protected void verifyNotPresent(TestObject object, int timeOut = TIMEOUT) {
		WebUI.verifyElementNotPresent(object, TIMEOUT)
	}

    protected void verifyEqual(Object actual, Object expected) {
        WebUI.verifyEqual(actual, expected)
    }

    // --- Navigation & Web Actions ---
    
    protected void openBrowser(String url) {
        WebUI.openBrowser(url)
        WebUI.maximizeWindow()
    }

    protected void closeBrowser() {
        WebUI.closeBrowser()
    }

    protected void back() {
        WebUI.back()
    }

    protected void scrollToElement(TestObject object) {
        WebUI.scrollToElement(object, TIMEOUT)
    }


}