package com;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CorporateRegisterIDAndCss
{
        @Test
        public void openAnAccountCorporateId() throws InterruptedException

        {

            System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");
            ChromeDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, 30);
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("headless");
            chromeOptions.addArguments("window-size=1000,500");
            chromeOptions.addArguments("pageLoadStrategy=eager");

            driver.get("https://secure.sahibinden.com/kayit/kurumsal/");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
            driver.findElement(By.id("name")).sendKeys("Melek");

            WebElement inputName = driver.findElement(By.id("name"));
            System.out.println(inputName.getText()+ "Melek");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surname")));
            driver.findElement(By.id("surname")).sendKeys("Akturk");

            WebElement inputSurname = driver.findElement(By.id("surname"));
            System.out.println(inputSurname.getText()+ "Akturk");


            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
            WebElement email = driver.findElement(By.id("email"));
            email.sendKeys("melusid" + (Math.random() * 20 + "@sahibinden.com"));
            System.out.println(email.getText());

            WebElement inputEmail = driver.findElement(By.id("email"));
            System.out.println(inputEmail.getText()+ "melusid" + (Math.random() * 20 + "@sahibinden.com"));

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
            driver.findElement(By.id("password")).sendKeys("123456aB");

            WebElement inputPassword = driver.findElement(By.id("password"));
            System.out.println(inputPassword.getText()+ "123456aB");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
            driver.findElement(By.id("phone")).sendKeys("2163884552");

            WebElement inputPhone = driver.findElement(By.id("phone"));
            System.out.println(inputPhone.getText()+ "2163884552");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("category")));
            Select realEstateSelect = new Select(driver.findElement(By.id("category")));
            realEstateSelect.selectByValue("200002");


            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
            Select citySelect = new Select(driver.findElement(By.id("city")));
            citySelect.selectByValue("34");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("town")));
            WebElement town = driver.findElement(By.id("town"));

            Thread.sleep(3000);
            String isDisabledTown = town.getAttribute("disabled");
            System.out.println(isDisabledTown);

            if (isDisabledTown == null)
            {
                Select townSelect = new Select(town);
                townSelect.selectByVisibleText("Adalar");
            }

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("quarter")));
            WebElement quarter = driver.findElement(By.id("quarter"));
            Thread.sleep(3000);

            String isDisabledQuarter = quarter.getAttribute("disabled");
            System.out.println(isDisabledQuarter);

            if (isDisabledQuarter == null)
            {
                Select quarterSelect = new Select(quarter);
                quarterSelect.selectByVisibleText("Burgazada Mh.");
            }

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Limited veya Anonim Şirketi']")));
            driver.findElement(By.xpath("//label[text()='Limited veya Anonim Şirketi']")).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taxOfficeCity")));
            Select taxOfficeCitySelect = new Select(driver.findElement(By.id("taxOfficeCity")));
            taxOfficeCitySelect.selectByValue("34");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taxOffice")));
            WebElement taxOffice = driver.findElement(By.id("taxOffice"));
            Thread.sleep(3000);

            String isDisabledTaxOffice = taxOffice.getAttribute("disabled");
            System.out.println(isDisabledTaxOffice);

            if (isDisabledTaxOffice == null)
            {
                Select quarterSelect = new Select(taxOffice);
                quarterSelect.selectByVisibleText("Kartal Vergi Dairesi");
                Thread.sleep(3000);

            }

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taxNumber")));
            driver.findElement(By.id("taxNumber")).sendKeys("7298729861");

            WebElement inputTaxNumber = driver.findElement(By.id("taxNumber"));
            System.out.println(inputTaxNumber.getText()+ "4698874811");

            /**
             *    Şahıs Şirketi seçilince girilen tckn bilgisi aşağıdadır, yukarıda limited şirketi kullandığım için bu kısmı yoruma aldım,css methodunda cssSelector haliyle kullanıcam.
             *    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idNumber")));
             *    driver.findElement(By.id("idNumber")).sendKeys("76097164482");
             */

            driver.executeScript("document.getElementById('endUserLicenceAgreement').click()");

            wait.until(ExpectedConditions.elementToBeClickable(By.id("signUpButton")));
            driver.findElement(By.id("signUpButton")).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmSubmit")));
            WebElement confirmSubmit = driver.findElement(By.id("confirmSubmit"));
            confirmSubmit.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("email")));
            WebElement emailText = driver.findElement(By.className("email"));
            System.out.println("Hesap işlemlerine devam edebilmeniz için " + emailText.getText() + " adresine gönderdiğimiz linki onaylamanızı bekliyoruz.");


            driver.quit();
            // Thread.sleep(10 * 3000);

        }



    @Test
    public void openAnAccountCorporateCss() throws InterruptedException
    {

        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");
        chromeOptions.addArguments("window-size=1000,500");
        chromeOptions.addArguments("pageLoadStrategy=eager");

        driver.get("https://secure.sahibinden.com/kayit/kurumsal/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        driver.findElement(By.cssSelector("#name")).sendKeys("Melek");

        WebElement inputName = driver.findElement(By.cssSelector("#name"));
        System.out.println(inputName.getText()+ "Melek");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#surname")));
        driver.findElement(By.cssSelector("#surname")).sendKeys("Akturk");

        WebElement inputSurname = driver.findElement(By.cssSelector("#surname"));
        System.out.println(inputSurname.getText()+ "Akturk");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("melusscss" + (Math.random() * 20 + "@sahibinden.com"));
        System.out.println(email.getText());

        WebElement inputEmail = driver.findElement(By.cssSelector("#email"));
        System.out.println(inputEmail.getText()+ "meluscss" + (Math.random() * 20 + "@sahibinden.com"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
        driver.findElement(By.cssSelector("#password")).sendKeys("123456aB");

        WebElement inputPassword = driver.findElement(By.cssSelector("#password"));
        System.out.println(inputPassword.getText()+ "123456aB");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#phone")));
        driver.findElement(By.cssSelector("#phone")).sendKeys("2163884552");

        WebElement inputPhone = driver.findElement(By.cssSelector("#phone"));
        System.out.println(inputPhone.getText()+ "2163884552");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#category")));
        Select realEstateSelect = new Select(driver.findElement(By.cssSelector("#category")));
        realEstateSelect.selectByValue("200002");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#city")));
        Select citySelect = new Select(driver.findElement(By.cssSelector("#city")));
        citySelect.selectByValue("34");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#town")));
        WebElement town = driver.findElement(By.cssSelector("#town"));
        Thread.sleep(3000);

        String isDisabledTown = town.getAttribute("disabled");
        System.out.println(isDisabledTown);

        if (isDisabledTown == null)
        {
            Select townSelect = new Select(town);
            townSelect.selectByVisibleText("Adalar");
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#quarter")));
        WebElement quarter = driver.findElement(By.cssSelector("#quarter"));
        Thread.sleep(3000);

        String isDisabledQuarter = quarter.getAttribute("disabled");
        System.out.println(isDisabledQuarter);

        if (isDisabledQuarter == null)
        {
            Select quarterSelect = new Select(quarter);
            quarterSelect.selectByVisibleText("Heybeliada Mah.");
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Şahıs Şirketi']")));
        driver.findElement(By.xpath("//label[text()='Şahıs Şirketi']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#taxOfficeCity")));
        Select taxOfficeCitySelect = new Select(driver.findElement(By.cssSelector("#taxOfficeCity")));
        taxOfficeCitySelect.selectByValue("34");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#taxOffice")));
        WebElement taxOffice = driver.findElement(By.cssSelector("#taxOffice"));
        Thread.sleep(3000);

        String isDisabledTaxOffice = taxOffice.getAttribute("disabled");
        System.out.println(isDisabledTaxOffice);

        if (isDisabledTaxOffice == null)
        {
            Select quarterSelect = new Select(taxOffice);
            quarterSelect.selectByVisibleText("Kadıköy Vergi Dairesi");
            Thread.sleep(3000);

        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#taxNumber")));
        driver.findElement(By.cssSelector("#taxNumber")).sendKeys("7298729861");

        WebElement inputTaxNumber = driver.findElement(By.cssSelector("#taxNumber"));
        System.out.println(inputTaxNumber.getText()+ "4698874811");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#idNumber")));
        driver.findElement(By.cssSelector("#idNumber")).sendKeys("76097164482");


        driver.executeScript("document.getElementById('endUserLicenceAgreement').click()");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#signUpButton")));
        driver.findElement(By.cssSelector("#signUpButton")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#confirmSubmit")));
        WebElement confirmSubmit = driver.findElement(By.cssSelector("#confirmSubmit"));
        confirmSubmit.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("email")));
        WebElement emailText = driver.findElement(By.className("email"));
        System.out.println("Hesap işlemlerine devam edebilmeniz için " + emailText.getText() + " adresine gönderdiğimiz linki onaylamanızı bekliyoruz.");

       // Thread.sleep(10 * 3000);

        driver.quit();



    }

        }







