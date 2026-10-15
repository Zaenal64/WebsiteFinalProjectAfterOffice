package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

public class ProductPage extends BasePage {
	
	private final TestObject Return_Button = findTestObject('Object Repository/catalog/returnDashboard_btn')
	private final TestObject Dashboad_Image = findTestObject('Object Repository/dashboard/gambarDasboard_img')
	
	
	//. Method Click Return Button
	public void clickReturnButton() {
		verifyPresent(Return_Button)
		click(Return_Button)
	}
	
	//3. Verify Title product
	public void verifyTitlePresent(String title) {
		WebUI.delay(3)

		String formattedTitle = title.substring(0, 1).toUpperCase() + title.substring(1).toLowerCase()

		TestObject titleProduk = findTestObject('Object Repository/catalog/titleProduct_txt', [('category') : formattedTitle])

		boolean isTitlePresent = WebUI.verifyElementPresent(titleProduk, 5, FailureHandling.OPTIONAL)
		if(isTitlePresent) {
			String actualTitle = getText(titleProduk)
			println ">>> TEKS DITEMUKAN DI SCREEN: " + actualTitle
		clickReturnButton()
		}else {
			println ">>> TEKS " + formattedTitle + " TIDAK DI TEMUKAN, USER MASIH DI HALAMAN DASHBOARD"
			verifyPresent(Dashboad_Image, 3)
		}
	}
}
