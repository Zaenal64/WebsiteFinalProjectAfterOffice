package stepDefinitions

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import pages.EnterProductSideBarPage
import pages.ProductPage


public class EnterAllProductSideBarSteps{
	EnterProductSideBarPage page = new EnterProductSideBarPage()
	
	
	@When("user klik produk {string} di side bar")
	public void user_klik_produk_di_side_bar(String namaProduk) {
		page.clickSideBar(namaProduk)
	}
}


