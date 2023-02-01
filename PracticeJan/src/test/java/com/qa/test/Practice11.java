package com.qa.test;

import com.qa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;


public class Practice11 extends BaseTest {

    WebDriver driver;
    @Test
    public void m7() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options=new ChromeOptions();
        DesiredCapabilities capabilities=new DesiredCapabilities();
        options.addArguments("start-maximized");
        // options.addArguments("incognito");
        options.addArguments("disable-popup-blocking");

         driver=new ChromeDriver(options);
         log.info("driver stareted");
        driver.get("https://www.google.co.in/");
        log.info("website  opened");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));




           try {

                By ww=By.xpath("//canvas[@id='ctaCanvas123']");
                wait.until(ExpectedConditions.presenceOfElementLocated(ww));
                System.out.println("===============");
                //driver.findElement(ww);


//                FluentWait ff=new FluentWait<>(driver);
//                ff.withTimeout(Duration.ofSeconds(5));
//                ff.ignoring(NoSuchElementException.class);
//                ff.until(ExpectedConditions.visibilityOf(ee));
               // System.out.println(driver.findElement(ww).isDisplayed());


                System.out.println("+++_=========+++++++++++");



           }catch (Exception e){
               System.out.println("++++++++++++++++++start$$$$$$$$$$$$$");
               log.error(e.getMessage());
               e.printStackTrace();
               log.fatal("fatal log");
               System.out.println("+++++++++++++++++++++++++++++++++END$$$$$$$$$$$$$");
               System.out.println("++++++++++++++++++start$###############");
               System.out.println(e.getMessage());
               System.out.println("++++++++++++++++++start$###############");

               Assert.assertTrue(false);
           }finally {
                Thread.sleep(3000);
                driver.quit();
            }







        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Chrome Options & Desired Capabilities in Selenium Webdriver']")));
    }

    public boolean gg(){
        boolean flag=false;
        try {
            driver.findElement(By.xpath("//img[@alt='Google123']"));
            flag=true;
        }catch(Exception e){
            flag=false;
        }


        return flag;
    }

    public void m10() throws IOException {
        Integer a=null;
        Integer b=15;

        try {

            if(a>b){
                System.out.println("hello");
            }
            log.error("bosedk@");
        }catch (AssertionError e){

            e.printStackTrace();

            log.info("fail1");

        }
    }

    public void m8() throws IOException {
        int a=10;
        int b=13;
        try {
            Assert.assertTrue(a==b);
        }catch (Exception e){
            log.error("fail");

        }

    }

    @Test
    public void m9() throws IOException {
        int a=10;
        int b=10;
          String s1="ArrowGAPLogo Sports Tape Pique Polo Shirt In StretchRs. 2,499";
          s1.toLowerCase();
        System.out.println(s1);

    }

}