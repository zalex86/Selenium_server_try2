import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SimpleTest {

    /*public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\git\\sf_git\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(); - попытки по другим видосам*/
     // WebDriver driver = new ChromeDriver(); // - для запуска хрома
    WebDriver driver = new FirefoxDriver(); // - для запуска фф
        //driver.get("https://selenium.dev"); - сайт с видоса в ютьюб
    @Test
    public void simpleTest() throws Exception {
        this.driver.get("https://google.com");
            // do nothing for 10 seconds
        try {Thread.sleep(1000);} catch (Exception e) {}
        WebElement input = this.driver.findElement(new By.ByCssSelector(".gLFyf.gsfi"));
        try {Thread.sleep(1000);} catch (Exception e) {}
        input.click();
        try {Thread.sleep(1000);} catch (Exception e) {}
        input.sendKeys("SkillFactory");
        try {Thread.sleep(1000);} catch (Exception e) {}
        WebElement submit = this.driver.findElement(new By.ByCssSelector(".gNO89b"));
        submit.click();
        try {Thread.sleep(2000);} catch (Exception e) {}
    }
    @AfterClass
    public void closeSeleniumSession() {
        this.driver.close();
        //this.driver.quit(); - для сервера
    }
        //driver.quit(); - это как в ютьюб было
    }
