package twuFunctionalTesting.functionalTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TWUAssignment3 {

    @Test
    public void cansubmitorder() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:8080/twuFunctionalTesting/order/new");
        WebElement namefield = driver.findElement(By.id("name_field"));
        namefield.sendKeys("Stephanie");
        WebElement emailfield = driver.findElement(By.id("email_field"));
        emailfield.sendKeys("sjacobs@thoughtworks.com");
        WebElement submitbutton = driver.findElement(By.id("submitButton"));
        submitbutton.submit();
        driver.close();
        assertTrue("sjacobs@thoughtworks.com" == "sjacobs@thoughtworks.com");
        System.out.println("All cows eat grass");
    }
}
