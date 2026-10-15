package stepDefinitions

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import io.cucumber.java.en.Given
import io.cucumber.java.en.When
import io.cucumber.java.en.Then
import io.cucumber.java.en.And

import com.kms.katalon.core.testdata.TestData
import components.NavigationPage
import pages.LoginPage
import pages.RegisterPage

public class  RegisterPageSteps{
	
	RegisterPage register = new RegisterPage()
	NavigationPage navigation = new NavigationPage()
	
	@When("user klik register button")
	public void user_klik_register_button(){
		navigation.clickSignInMenu()
		register.clickRegister()
	}
	
@Then("user verifikasi field {string} terdapat pada halaman register")
public void user_verifikasi_field_terdapat_pada_halaman_register(String label) {
    register.verifyFieldRegis(label)
}
	
	@And("user melihat masih terdapat button login")
	public void user_melihat_masih_terdapat_button_login() {
		register.verifySignIn()
	}
	
}

