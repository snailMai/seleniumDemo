package com.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Random;

public class CommonUtils {
    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static String getRandomInt(int length){
        String str="0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(10);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static WebDriver open(String url){
        System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\support\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }

    public static WebDriver open(String url, boolean browserDisplay){
        System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\support\\webdriver\\chromedriver.exe");
        if (browserDisplay){
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            return driver;
        }else {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("headless");
            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.get(url);
            return driver;
        }
    }
}
