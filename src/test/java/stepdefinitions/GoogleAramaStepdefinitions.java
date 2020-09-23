package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GoogleAramaStepdefinitions {


    GooglePage googlePage = new GooglePage();


    @Given("kullanici google sayfasina gider")
    public void kullanici_google_sayfasina_gider() {
        System.out.println("Kullanici Google'a gider");

        Driver.getDriver().get(ConfigurationReader.getProperty("google_page"));

    }

    @Given("arama kutusuna techproeducation yazar")
    public void arama_kutusuna_techproeducation_yazar() {
        System.out.println("Kullanici techproeducation'a gider");
        googlePage.googleSearchBox.sendKeys("techproeducation"+ Keys.ENTER);
    }

    @Then("arama sonuclari sayfasinin basligini kontrol eder")
    public void arama_sonuclari_sayfasinin_basligini_kontrol_eder() throws InterruptedException {
        System.out.println("Kullanici sayfa basligini test etti");
        Thread.sleep(2000);
        String headr = Driver.getDriver().getTitle();
        boolean iceriyorMu = headr.contains("techproeducation");
        Assert.assertTrue(iceriyorMu);

    }

    @Given("arama kutusuna selenium yazar")
    public void arama_kutusuna_selenium_yazar() {
        System.out.println("Kullanici selenium yazar");

        googlePage.googleSearchBox.sendKeys("selenium"+Keys.ENTER);

    }
    @Then("arama sonuclari sayfasinin sonuc sayisini kontrol eder")
    public void arama_sonuclari_sayfasinin_sonuc_sayisini_kontrol_eder() {
        System.out.println("Kullanici sonuc sayisini test etti");
        String resultSelenium = googlePage.result.getText();
        System.out.println(resultSelenium);
    }


    @Given("kullanici {string} kelimesi arar")
    public void kullanici_kelimesi_arar(String string) {
       //string = webdriver
        googlePage.googleSearchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("kullanici sayfa basliginda {string} kelimesini kontrol eder")
    public void kullanici_sayfa_basliginda_kelimesini_kontrol_eder(String string) throws InterruptedException {
        Thread.sleep(2000);
        String sayfaBasligi = Driver.getDriver().getTitle();
        boolean iceriyorMu = sayfaBasligi.contains(string);
        Assert.assertTrue(iceriyorMu);
    }

    @Given("kullanici {string} arar")
    public void kullanici_arar(String string) {
        googlePage.googleSearchBox.sendKeys(string+Keys.ENTER);

    }

    @Then("kullanici sayfa basliginda {string} kontrol eder")
    public void kullanici_sayfa_basliginda_kontrol_eder(String string) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String baslik = Driver.getDriver().getTitle();
        boolean iceriyorMu = baslik.contains(string);
        Assert.assertTrue(iceriyorMu);
    }



}
