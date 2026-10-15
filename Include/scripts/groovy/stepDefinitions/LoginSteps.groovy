package stepDefinitions

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import io.cucumber.java.en.Given
import io.cucumber.java.en.When
import io.cucumber.java.en.Then
import io.cucumber.java.en.And

import com.kms.katalon.core.testdata.TestData
import components.NavigationPage
import pages.LoginPage

public class LoginSteps {

	LoginPage loginPage = new LoginPage()
	NavigationPage navigationPage = new NavigationPage()

	TestData dbData = findTestData('Data Files/Database_Mysql/loginDB')

	@Given("User membuka browser dan mengakses halaman login JPetStore")
	public void user_membuka_browser_dan_mengakses_halaman_login() {
		navigationPage.clickSignInMenu()
	}

	@When("User mengambil kredensial login dari data file baris ke {int}")
	public void user_mengambil_kredensial_login_dari_data_file_baris_ke(int rowIndex) {
		String username = dbData.getValue('username', rowIndex)
		String password = dbData.getValue('password', rowIndex)

		loginPage.enterCredentials(username, password)
	}

	@And("User menekan tombol Login")
	public void user_menekan_tombol_login() {
		loginPage.clickLogin()
	}

	@Then("Verifikasi hasil login untuk baris ke {int}")
    public void verifikasi_hasil_login_untuk_baris_ke(int rowIndex) {
        String testType = dbData.getValue('testType', rowIndex)
        String expectedMessage = dbData.getValue('expected', rowIndex)
        
        // Memanggil logika verifikasi langsung dari LoginPage
        loginPage.verifyLoginResult(testType, expectedMessage)
    }
}
