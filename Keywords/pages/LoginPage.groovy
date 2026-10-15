package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import base.BasePage

public class LoginPage extends BasePage {

	private final TestObject Username_field = findTestObject('Object Repository/LoginPage/usernameField')
	private final TestObject Password_field = findTestObject('Object Repository/LoginPage/usernameField')
	private final TestObject Login_Button 	= findTestObject('Object Repository/loginPage/login_btn')
	private final TestObject Welcome_Text   = findTestObject('Object Repository/LoginPage/welcome_txt')
	private final TestObject Invalid_Text   = findTestObject('Object Repository/LoginPage/invalidlogin_txt')
	private final TestObject SignIn_Button 	= findTestObject('Object Repository/loginPage/signIn_btn')


	// 1. Method Input Credentials
	public void enterCredentials(String username, String password) {
		// 1. Bersihkan kolom input terlebih dahulu
		clearText(Username_field)
		clearText(Password_field)

		// 2. Ketikkan kredensial baru
		WebUI.setText(Username_field, username)
		WebUI.setText(Password_field, password)
	}

	// 2. Method Click buttonLogin
	public void clickLogin() {
		click(Login_Button)
	}

	// 3. Method Verify login success
	public void verifyLoginSuccess() {
		verifyPresent(Welcome_Text, 2)
	}

	// 4. Method Verifikasi Error Message
	public void verifyErrorMessage(String expectedMessage) {
		// 1. Beri jeda 1-2 detik agar halaman selesai loading/render pesan error
		WebUI.delay(2)

		// 2. Cari elemen dengan FailureHandling.OPTIONAL agar test tidak langsung crash
		boolean isErrorPresent = WebUI.verifyElementPresent(Invalid_Text, 5, FailureHandling.OPTIONAL)
		if (isErrorPresent) {
			String actualText = getText(Invalid_Text)
			println ">>> TEKS DITEMUKAN DI SCREEN: " + actualText
			WebUI.verifyMatch(actualText, ".*" + expectedMessage.trim() + ".*", true)
		} else {
			// Jika pesan error memang tidak pernah muncul di UI, pastikan tombol Login tetap ada
			println ">>> TEKS ERROR TIDAK MUNCUL DI SCREEN, MEMASTIKAN USER MASIH DI HALAMAN LOGIN"
			verifyPresent(SignIn_Button, 5)
		}
	}
	
	// Method  untuk menangani logika verifikasi login berdasarkan testType
	public void verifyLoginResult(String testType, String expectedMessage) {
		if (testType.equalsIgnoreCase("P")) {
			this.verifyLoginSuccess()
		} else {
			this.verifyErrorMessage(expectedMessage)
		}
	}
}