package stepDefinitions

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import pages.EnterProductNavbarPage
import pages.ProductPage


public class EnterAllProductNavbarSteps{
	EnterProductNavbarPage page = new EnterProductNavbarPage()
	
	@When ("user klik produk {string} di navbar")
	public void user_klik_produk_di_navbar(String namaProduk) {
		page.clickNavbar(namaProduk)
	}
	
	@Then("user diarahkan ke halaman produk {string}")
	public void user_diarahkan_ke_halaman_produk(String nama_produk) {
		ProductPage page = new ProductPage()
		page.verifyTitlePresent(nama_produk)
	}
}


