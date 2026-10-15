package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import base.BasePage

class SearchPage extends BasePage {

    // Method Input Kata Kunci
    public void enterSearchKeyword(String keyword) {
        WebUI.clearText(findTestObject('Object Repository/dashboard/searchBar_field'))
        WebUI.setText(findTestObject('Object Repository/dashboard/searchBar_field'), keyword)
    }
	
    // Method Klik Tombol Search
    public void clickSearchButton() {
        WebUI.click(findTestObject('Object Repository/dashboard/searchBar_btn'))
    }
	
    // Method Verifikasi Berdasarkan Status Pencarian
    public void verifySearchResultByStatus(String status, String expectedID, String expectedName, String expectedDesc) {
        if (status.equalsIgnoreCase("FOUND")) {
            // 1. Verifikasi Gambar Muncul
            boolean isImagePresent = WebUI.verifyElementPresent(
                findTestObject('Object Repository/catalog/productImg_img'), 5, FailureHandling.OPTIONAL)
            assert isImagePresent : "Gambar produk tidak ditemukan!"
			
            // 2. Verifikasi Product ID & Name
            String actualID = WebUI.getText(findTestObject('Object Repository/catalog/productID_txt'))
            WebUI.verifyMatch(actualID.trim(), expectedID.trim(), false)

            String actualName = WebUI.getText(findTestObject('Object Repository/catalog/productName_txt'))
            WebUI.verifyMatch(actualName.trim(), expectedName.trim(), false)
			
            // 3. Verifikasi Deskripsi
            String actualDesc = WebUI.getText(findTestObject('Object Repository/catalog/productDesc_txt'))
			WebUI.verifyMatch(actualDesc.trim(), expectedDesc.trim(), false)
			// WebUI.verifyMatch(actualDesc.trim(), ".*" + expectedDesc.trim() + ".*", true)

        } else if (status.equalsIgnoreCase("NOT_FOUND")) {
            // Verifikasi bahwa tabel hasil produk TIDAK MUNCUL di layar
            boolean isProductPresent = WebUI.verifyElementPresent(
                findTestObject('Object Repository/catalog/productID_txt'), 3, FailureHandling.OPTIONAL)
            assert !isProductPresent : "Harusnya produk tidak ditemukan, tetapi produk muncul di layar!"

        } else if (status.equalsIgnoreCase("EMPTY")) {
			WebUI.verifyElementPresent(findTestObject('Object Repository/catalog/emptySearch_txt'), 3)
			String  actualText = WebUI.getText(findTestObject('Object Repository/catalog/emptySearch_txt'))
			println ">>> TEKS DITEMUKAN DI SCREEN: " + actualText
			
        }
    }
}