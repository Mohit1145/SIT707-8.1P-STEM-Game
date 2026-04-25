package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class STEMGameFunctionalTest {

    @Test
    public void testFullStemGameHappyPath() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/login");

        driver.findElement(By.id("username")).sendKeys("ahsan");
        driver.findElement(By.id("passwd")).sendKeys("ahsan_pass");
        driver.findElement(By.id("dob")).sendKeys("01/01/2000");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/q1"));

        driver.findElement(By.id("number1")).sendKeys("3");
        driver.findElement(By.id("number2")).sendKeys("4");
        driver.findElement(By.id("result")).sendKeys("7");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/q2"));

        driver.findElement(By.id("number1")).sendKeys("10");
        driver.findElement(By.id("number2")).sendKeys("4");
        driver.findElement(By.id("result")).sendKeys("6");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/q3"));

        driver.findElement(By.id("number1")).sendKeys("4");
        driver.findElement(By.id("number2")).sendKeys("5");
        driver.findElement(By.id("result")).sendKeys("20");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        Thread.sleep(1000);

        WebElement body = driver.findElement(By.tagName("body"));
        Assert.assertTrue(body.getText().contains("Correct answer"));

        driver.quit();
    }
}