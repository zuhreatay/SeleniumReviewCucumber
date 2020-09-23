Feature: Parametreli Arama
@webdriverArama
  Scenario: TC03 kullanici googleda arama yapar
    Given kullanici google sayfasina gider
    And kullanici "webdriver" kelimesi arar
    Then kullanici sayfa basliginda "webdriver" kelimesini kontrol eder

  #parametreli method olusturmak icin burada parametre olarak gondermek istedigimiz kelime tirnak icine alinir