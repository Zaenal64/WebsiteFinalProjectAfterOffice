package stepDefinitions

import io.cucumber.java.en.When
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import pages.SearchPage

public class SearchSteps {

	SearchPage searchPage = new SearchPage()

	@Given("user berada pada halaman dashboard")
	public void user_berada_pada_halaman_dashboard() {
		// Dibiarkan kosong karena proses buka browser & navigasi ke dashboard
		// sudah otomatis dijalankan oleh @Before di Hooks.groovy
	}

	@When("user melakukan input {string}")
	public void user_melakukan_input(String keyword) {
		searchPage.enterSearchKeyword(keyword)
	}

	@And("User menekan tombol search")
	public void user_menekan_tombol_search() {
		searchPage.clickSearchButton()
	}

	@Then("Verifikasi hasil search bar untuk status {string} dengan ID {string}, nama {string}, dan deskripsi {string}")
	public void verifikasi_hasil_search_bar_untuk_status_dengan_id_nama_dan_deskripsi(
			String status, String id, String name, String desc) {
		searchPage.verifySearchResultByStatus(status, id, name, desc)
	}
}