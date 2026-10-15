package components

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import base.BasePage

class NavigationPage extends BasePage {

    private final TestObject Menu_Login = findTestObject('Object Repository/loginPage/signIn_btn')
	 

    // 1. Method Open LoginPage
    public void clickSignInMenu() {
        waitVisible(Menu_Login)
		click(Menu_Login)
    }
	

}