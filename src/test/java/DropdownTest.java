import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class DropdownTest {


    public static final String URL = "http://the-internet.herokuapp.com/dropdown";

    @Test
    public void firstDropShouldBeSelected() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get(URL);
        WebElement dropdownElements = browser.findElement(By.id("dropdown"));
        dropdownElements.findElement(By.cssSelector(("[value='1']"))).click();
        assertTrue(dropdownElements.findElement(By.cssSelector(("[value='1']"))).isSelected());
        browser.quit();
    }

    @Test
    public void secondDropShouldBeSelected() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get(URL);
        WebElement dropdownElements = browser.findElement(By.id("dropdown"));
        dropdownElements.findElement(By.cssSelector(("[value='2']"))).click();
        assertTrue(dropdownElements.findElement(By.cssSelector(("[value='2']"))).isSelected());
        browser.quit();
    }
}
