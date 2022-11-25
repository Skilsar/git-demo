package com.Gleb.ta.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ShoesPage extends AbstractPage
{
    private final String BASE_URL = "https://pizhon.by/odezhda/";

    public ShoesPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ShoesPage openPage()
    {
        driver.navigate().to(BASE_URL);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);

        return this;
    }

    public ShoesPage chooseTheFirstPair(){
        driver.manage().window().maximize();



        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-lg-3 col-md-6 col-sm-5 mb-4 mb-sm-0 select-filter pl-0 d-none d-md-flex']")));
      driver.findElement(By.xpath("//div[@class='col-lg-3 col-md-6 col-sm-5 mb-4 mb-sm-0 select-filter pl-0 d-none d-md-flex']")).click();

        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[4]/div[4]/div[1]/div[4]/div/div[2]/ul/li[4]")));
      driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[4]/div[1]/div[4]/div/div[2]/ul/li[4]")).click();

 /*       new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-sort='ms|price']")));

        List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\"mse2_sort-styler\"]/div[2]/ul/li[4]"));
        elements.get(1).click();*/

        return this;
    }

}