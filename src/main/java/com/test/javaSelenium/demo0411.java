package com.test.javaSelenium;

import com.model.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo0411 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\support\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.baidu.com");
//        driver.findElement(By.id("kw")).sendKeys("selenium");
//        // 获取搜索框元素
//        WebElement inputElem = driver.findElement(By.id("kw"));
//
//        // clear()方法，清空输入框内容
//        inputElem.clear();
//
//        // sendKeys()方法，在搜索框中输入搜索内容
//        inputElem.sendKeys("selenium");
//
//        driver.findElement(By.id("su")).click();
//
//        try {
//            Thread.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        CommonUtils.open("http://129.226.174.57:8080");
        driver.get("http://129.226.174.57:8080");
        CommonUtils.sleep(5);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/section/aside/ul/li/ul/li[3]")).click();

        CommonUtils.sleep(3);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/section/section/main/form/div[1]/div/div/input")).sendKeys(CommonUtils.getRandomString(5));
        driver.findElement(By.xpath("//*[@id=\"nav\"]/section/section/main/form/div[2]/div/div/input")).sendKeys(CommonUtils.getRandomInt(2));

        driver.findElement(By.xpath("//*[@id=\"nav\"]/section/section/main/form/div[3]/div/button[1]/span")).click();

        driver.quit();
    }


}
