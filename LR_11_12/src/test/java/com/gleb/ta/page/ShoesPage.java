package com.gleb.ta.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoesPage extends AbstractPage
{
    private final String BASE_URL = "https://pizhon.by/";
    private final Logger logger = LogManager.getRootLogger();

    public ShoesPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ShoesPage openPage()
    {
        driver.navigate().to(BASE_URL);
        logger.info("open success");
        return this;
    }

    //смена категории по полу
    public ShoesPage changeSex() throws InterruptedException {
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[1]/div[1]/div[2]/div[2]/span[2]/a")).click();
        Thread.sleep(3000);
        return this;
    }
}