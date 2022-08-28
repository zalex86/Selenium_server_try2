import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SimpleTest {

    //public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","D:\\git\\sf_git\\chromedriver.exe");
        //ChromeDriver driver = new ChromeDriver();
     // WebDriver driver = new ChromeDriver();
    WebDriver driver = new FirefoxDriver();
        //driver.get("https://selenium.dev");
    @Test
    public void simpleTest() throws Exception {
        this.driver.get("https://google.com");
            // do nothing for 10 seconds
        try {
            Thread.sleep(10000);
        } catch (Exception e) {}
    }
    @AfterClass
    public void closeSeleniumSession() {
        this.driver.close();
        this.driver.quit();
    }
        //driver.quit();
    }
