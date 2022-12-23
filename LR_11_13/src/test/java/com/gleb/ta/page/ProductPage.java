package com.gleb.ta.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends AbstractPage
{
    private final String BASE_URL = "https://pizhon.by/odezhda/";
    private final String PRODUCT_URL = "https://pizhon.by/odezhda/svitera/sviter-sherstyanoj-chernyj-l67-01.html";
    private final Logger logger = LogManager.getRootLogger();

    public ProductPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ProductPage openPage()
    {
        driver.navigate().to(BASE_URL);
/*        driver.findElement(By.xpath("//button[@data-var='acceptBtn1']")).click();
        driver.findElement(By.xpath("//*[@data-type='click_geoMismatchDismiss']")).click();*/
        return this;
    }

    public ProductPage addToBag(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"css-xf3ahq\"]")));
        driver.findElement(By.xpath("//*[@class=\"css-xf3ahq\"]")).click();
        logger.info("Successful sizing");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,700)", "");
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Add to Bag']")));
        driver.findElement(By.xpath("//button[@aria-label='Add to Bag']")).click();
        logger.info("Element add success");
        return this;
    }

    public ProductPage changeCurrency() throws InterruptedException {
        driver.findElement(By.xpath("//*[@class=\"msmc-toggle\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/div/a[3]")).click();
        Thread.sleep(11000);
        return this;
    }

    public ProductPage openProductPage()
    {
        driver.navigate().to(PRODUCT_URL);
        return this;
    }

    public ProductPage addToCart() throws InterruptedException {
        logger.info("Successful sizing");
        driver.findElement(By.xpath("//*[@id=\"msProduct\"]/div[2]/form/div/div[5]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@class=\"button-modal-cart\"]")).click();
        Thread.sleep(3000);
        logger.info("Element add success");
        return this;
    }

    public ProductPage DelToCart() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"msProduct\"]/div[2]/form/div/div[5]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@class=\"button-modal-close\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[1]/div[1]/div[4]/div/div[3]")).click();
        Thread.sleep(700);
        logger.info("Element delete success");
        /*driver.findElement(By.xpath("//*[@id=\"msMiniCart\"]/div[2]/div[1]/div/form/button")).click();*/
        return this;
    }

}