package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.model.FailureHandling.CONTINUE_ON_FAILURE
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import base.BasePage
import internal.GlobalVariable

public class RegisterPage extends BasePage{

	private final TestObject Register_Button = findTestObject('Object Repository/loginPage/register_btn')
	private final TestObject SignIn_Button = findTestObject('Object Repository/loginPage/signIn_btn')
	
		// Method click register button
	public void clickRegister() {
		verifyPresent(Register_Button)
		click(Register_Button)
	}

	// Verify button SignIn
	public void verifySignIn() {
		boolean isSignInPresent = WebUI.verifyElementPresent(SignIn_Button, 5, FailureHandling.OPTIONAL)
		if(isSignInPresent) {
			println("Button SignIn Ditemukan !!")
		}else {
			println("Button SignIn Tidak Ditemukan !!")
		}
	}

	// Verify field di halaman registrasi
public void verifyFieldRegis(String label) {
    WebUI.delay(2)
    
    // Memanggil TestObject dengan dynamic property 'label'
    TestObject dynamicFields = findTestObject('Object Repository/registerPage/fieldRegisterPage', [('label') : label])
    
    // Gunakan CONTINUE_ON_FAILURE agar jika ada 1 field gagal, test tetap berjalan sampai selesai
    boolean isPresent = WebUI.verifyElementPresent(dynamicFields, 5, FailureHandling.CONTINUE_ON_FAILURE)
    
    if (isPresent) {
        println("Field: " + label + " Di temukan!")
    } else {
        println("Field: " + label + " Tidak Di temukan!")
    }
}
}
