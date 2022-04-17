package com.test.javaSelenium;

import com.model.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TxcDeleteUser {
    public static String url = "http://129.226.174.57:8080";
    public static void main(String[] args) {
        WebDriver driver = CommonUtils.open(url, false);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 所有用户
        driver.findElement(By.xpath("//*[@id=\"nav\"]/section/aside/ul/li/ul/li[2]")).click();

        // 删除
        driver.findElement(By.xpath("//*[@id=\"nav\"]/section/section/main/div/div[1]/div[3]/table/tbody/tr[1]/td[4]/div/button[2]/span")).click();

        String createResult = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/p")).getText();

        System.out.println(createResult);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button/span")).click();



        driver.quit();
    }
}
