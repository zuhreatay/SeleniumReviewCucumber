package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.FhcTripKayitPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class fhcTripStepDefinitions {

    FhcTripKayitPage fhcTripKayitPage = new FhcTripKayitPage();
    @Given("kullanici fhctrip kayit sayfasina gider")
    public void kullanici_fhctrip_kayit_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhcTrip_Resigter"));
    }
    @Given("kullanici username {string} girer")
    public void kullanici_username_girer(String string) {
        fhcTripKayitPage.usernameKutusu.sendKeys(string);
    }
    @Given("kullanici email {string} girer")
    public void kullanici_email_girer(String string) {
        fhcTripKayitPage.emailKutusu.sendKeys(string);
    }
    @Given("kullanici fullname {string} girer")
    public void kullanici_fullname_girer(String string) {
        fhcTripKayitPage.fullnameKutusu.sendKeys(string);
    }


}
