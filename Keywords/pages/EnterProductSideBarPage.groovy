package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import base.BasePage
import pages.ProductPage

public class EnterProductSideBarPage extends BasePage{
	
	private final TestObject Dashboard_image = findTestObject('Object Repository/dashboard/gambarDasboard_img')

	// 1. Method CLick Side Bar
	public void clickSideBar(String namaProduk) {
		String categoryId = namaProduk.toUpperCase()
		TestObject sideBarMenu = findTestObject('Object Repository/dashboard/SideBarCategory_btn', [('category') : categoryId])

		boolean isMenuPresent = WebUI.verifyElementPresent(sideBarMenu, 5, FailureHandling.OPTIONAL)
		
		if(isMenuPresent) {
			println "Menu dengan Kategori = "+ categoryId + " Ditemukan!!"
			click(sideBarMenu)
		}else {
			println "Menu dengan Kategori = "+ categoryId + " Tidak Ditemukan!!"
		}
	}
	


}
