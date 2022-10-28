package com;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class RegisterIDAndCss
{


    @Test
    public void openAnAccountId() throws InterruptedException

    {

        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.get("https://secure.sahibinden.com/kayit/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Melek");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surname")));
        WebElement surname = driver.findElement(By.id("surname"));
        surname.sendKeys("Akturk");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("meluslussid" + (Math.random() *20 + "@sahibinden.com"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456aB");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#endUserLicenceAgreement').click()");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signUpButton")));
        WebElement signUpButton = driver.findElement(By.id("signUpButton"));
        signUpButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmSubmit")));
        WebElement confirmSubmit = driver.findElement(By.id("confirmSubmit"));
        confirmSubmit.click();

        Thread.sleep(10 * 3000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("email")));
        WebElement emailText = driver.findElement(By.className("email"));
        System.out.println(emailText.getText() + " adresinize gönderdigimiz e-postadan hesap talebinizi onaylayın");

        driver.quit();


    }

    @Test
    public void openAnAccountCss() throws InterruptedException

    {

        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.get("https://secure.sahibinden.com/kayit/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        WebElement name = driver.findElement(By.cssSelector("#name"));
        name.sendKeys("Melek");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#surname")));
        WebElement surname = driver.findElement(By.cssSelector("#surname"));
        surname.sendKeys("Akturk");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("melusluscss" + (Math.random() *20 + "@sahibinden.com"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("123456aB");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#endUserLicenceAgreement').click()");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#signUpButton")));
        WebElement signUpButton = driver.findElement(By.cssSelector("#signUpButton"));
        signUpButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#confirmSubmit")));
        WebElement confirmSubmit = driver.findElement(By.cssSelector("#confirmSubmit"));
        confirmSubmit.click();

        Thread.sleep(10 * 3000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("email")));
        WebElement emailText = driver.findElement(By.className("email"));
        System.out.println(emailText.getText() + " adresinize gönderdigimiz e-postadan hesap talebinizi onaylayın");

        driver.quit();
    }

    }
