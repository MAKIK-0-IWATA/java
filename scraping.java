public class ExTest {

  WebDriver driver;

  @BeforeClass
  pu」blic void setup() {
      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
  }

  public void init(){
      driver = new ChromeDriver();
  }

  @Test
  public void test1() {
      this.init();
      driver.get("https://www.google.co.jp/");
  }

  public void exit(){
      driver.quit();
  }
}
