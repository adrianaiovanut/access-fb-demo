package main.java.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateFb {

    private static WebDriver driverF;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Navigating to FB...");
        System.setProperty("webdriver.gecko.driver", "C:/JavaRepository/src/main/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.firefox.bin", "C:/Program Files/Mozilla Firefox/firefox.exe");
        driverF = new FirefoxDriver();
        driverF.get("http://www.facebook.com/");
        System.out.println("Title of the  page is  " + driverF.getTitle());
        driverF.manage().window().maximize();
        Thread.sleep(3000);


        //introducing email address and password

        driverF.findElement(By.id("email")).sendKeys("gilnada007@gmail.com");
        driverF.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("gtgtgtgt");

        Thread.sleep(3000);

        //login
        driverF.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]")).click();
    }
}
