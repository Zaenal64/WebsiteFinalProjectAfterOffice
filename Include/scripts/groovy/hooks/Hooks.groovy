package hooks

import io.cucumber.java.Before
import io.cucumber.java.Scenario
import io.cucumber.java.After
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Hooks {

    @Before
    public void setupScenario(Scenario scenario) {
		WebUI.openBrowser('')
        WebUI.navigateToUrl(GlobalVariable.baseUrl)
		WebUI.maximizeWindow()
		

    }

    @After
    public void tearDown() {
        // Kode yang berjalan SETELAH setiap scenario selesai dieksekusi
        // Contoh: Menutup browser agar tidak menumpuk
        WebUI.closeBrowser()
    }
}