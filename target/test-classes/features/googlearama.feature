@googleArama
Feature: Google arama

  Background: kullanici google sayfasina gider
    Given kullanici google sayfasina gider
  @techproeducationArama
  Scenario: TC01_kullanici googleda techproeducation aramasi yapar
    And arama kutusuna techproeducation yazar
    Then arama sonuclari sayfasinin basligini kontrol eder



    @seleniumArama
    Scenario: TC02_Kullanici googleda selenium aramasi yapar
      And arama kutusuna selenium yazar
      Then arama sonuclari sayfasinin sonuc sayisini kontrol eder