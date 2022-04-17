package com.test.javaSelenium;

import com.model.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TxcCreateUser {
    public static String url = "http://129.226.174.57:8080";
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\support\\webdriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://129.226.174.57:8080");
//        WebDriver driver = CommonUtils.open(url);
        WebDriver driver = CommonUtils.open(url, false);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        CommonUtils.sleep(10);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/section/aside/ul/li/ul/li[3]")).click();

//        CommonUtils.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/section/section/main/form/div[1]/div/div/input")).sendKeys(CommonUtils.getRandomString(5));
//        CommonUtils.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/section/section/main/form/div[2]/div/div/input")).sendKeys(CommonUtils.getRandomInt(2));
//        CommonUtils.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/section/section/main/form/div[3]/div/button[1]/span")).click();

//        CommonUtils.sleep(5000);
        String createResult = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/p")).getText();
        System.out.println(createResult);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button/span")).click();



        driver.quit();
    }
}
