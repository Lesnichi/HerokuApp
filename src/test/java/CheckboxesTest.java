import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class CheckboxesTest {

    public static final String URL = "http://the-internet.herokuapp.com/checkboxes";

    @Test
    public void firstCheckboxShouldBeUnchecked() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get(URL);
        List<WebElement> checkboxesElements = browser.findElements(By.cssSelector("[type='checkbox']"));
        assertTrue(!checkboxesElements.get(0).isSelected());
        browser.quit();
    }

    @Test
    public void firstCheckboxesShouldBeChecked() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get(URL);
        List<WebElement> checkboxesElements = browser.findElements(By.cssSelector("[type='checkbox']"));
        checkboxesElements.get(0).click();
        assertTrue(checkboxesElements.get(0).isSelected());
        browser.quit();
    }

    @Test
    public void secondCheckboxShouldBeChecked() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get(URL);
        List<WebElement> checkboxesElements = browser.findElements(By.cssSelector("[type='checkbox']"));
        assertTrue(checkboxesElements.get(1).isSelected());
        browser.quit();
    }

    @Test
    public void secondCheckboxShouldBeUnchecked() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get(URL);
        List<WebElement> checkboxesElements = browser.findElements(By.cssSelector("[type='checkbox']"));
        checkboxesElements.get(1).click();
        assertTrue(!checkboxesElements.get(1).isSelected());
        browser.quit();
    }
}
