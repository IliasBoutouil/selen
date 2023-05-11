package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    public static final String FORM = "//form/div[1]/";
    public static final String INPUT1 = FORM + "div[1]/div/input";
    public static final String INPUT2 = FORM + "div[2]/div/input";

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://moncredit.sgmaroc.com/");
        driver.findElement(By.xpath("//div[1]/section[1]/div/a/span")).click();
        waitForElement();
        driver.findElement(By.xpath(FORM + "div/div[1]/div/label/div")).click();
        nextStep(driver);
        waitForElement();
        driver.findElement(By.xpath(INPUT1)).sendKeys("15000");
        driver.findElement(By.xpath(INPUT2)).sendKeys("0");
        nextStep(driver);
        waitForElement();
        driver.findElement(By.xpath(INPUT1)).sendKeys("0");
        driver.findElement(By.xpath(INPUT2)).sendKeys("0");
        nextStep(driver);
        waitForElement();
        driver.findElement(By.xpath(FORM + "div/div/div/div[1]/span/span[1]/button[1]")).click();
        driver.findElement(By.xpath(FORM + "div/div/div/div[1]/span/span[3]/input")).sendKeys("75000");
        driver.findElement(By.xpath(FORM + "div/div/div/div[1]/span/span[1]/button[2]")).click();
        nextStep(driver);
        waitForElement();
        driver.findElement(By.xpath(INPUT1)).sendKeys("27121987");
        driver.findElement(By.xpath(FORM + "div[2]/div/div[1]/span/span[1]/button[1]")).click();
        driver.findElement(By.xpath(FORM + "div[2]/div/div[1]/span/span[3]/input")).sendKeys("65");
        driver.findElement(By.xpath(FORM + "div[2]/div/div[1]/span/span[1]/button[2]")).click();
        nextStep(driver);
        waitForElement();
        driver.findElement(By.xpath(INPUT1)).sendKeys("Selen");
        driver.findElement(By.xpath(INPUT2)).sendKeys("Doe");
        nextStep(driver);
        waitForElement();
        driver.findElement(By.xpath(INPUT1)).sendKeys("selen.doe@gmail.com");
        nextStep(driver);
        waitForElement();
        driver.findElement(By.xpath(FORM + "div/div[2]/input")).sendKeys("612004567");
        nextStep(driver);
        waitForElement();
        driver.findElement(By.xpath("//div[3]/div/div/div/div[2]/div[1]/div[1]/label")).click();
        driver.findElement(By.xpath("//div[3]/div/div/div/div[3]/div/button[2]")).click();
    }

    public static void waitForElement() throws InterruptedException {
        Thread.sleep(3000);
    }

    private static void nextStep(WebDriver driver) {
        driver.findElement(By.xpath("//form/div[2]/div/button")).click();
    }

}