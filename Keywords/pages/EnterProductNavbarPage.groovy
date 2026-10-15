package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import base.BasePage
import pages.ProductPage

public class EnterProductNavbarPage extends BasePage{

	private final TestObject Dashboard_image = findTestObject('Object Repository/dashboard/gambarDasboard_img')

	//1. Method untuk navbar
	public void clickNavbar(String namaProduk) {
		String catagoryId = namaProduk.toUpperCase()
		TestObject navbar = findTestObject('Object Repository/dashboard/navbarProduct_btn', [('category') : catagoryId] )

		boolean isMenuPresent = WebUI.verifyElementPresent(navbar, 5, FailureHandling.OPTIONAL)

		if(isMenuPresent) {
			println "Menu dengan Kategori = "+ catagoryId + " Ditemukan!!"
			click(navbar)
		}else {
			println "Menu dengan Kategori = "+ catagoryId + " Tidak Ditemukan!!"
		}
	}
	
	
	
}
