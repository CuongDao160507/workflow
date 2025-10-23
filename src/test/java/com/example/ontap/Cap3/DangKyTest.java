package com.example.ontap.Cap3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DangKyTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void DangKyTest() {
    driver.get("https://hoctotlamhay.vn/register");
    driver.findElement(By.id("name")).sendKeys("tuannt99");
    driver.findElement(By.id("user_email")).sendKeys("tuannt99@gmai.com");
    driver.findElement(By.id("password")).sendKeys("16052007");
    driver.findElement(By.cssSelector(".btn.btn-primary.w-100")).click();
    System.out.println("Bach hoc hay khong");
    }

    @Test
    public void DangNhapTest() {
        driver.get("https://hoctotlamhay.vn/login");
        driver.findElement(By.id("user_email")).sendKeys("tuannt99@gmai.com");
        driver.findElement(By.id("password")).sendKeys("16052007");
        driver.findElement(By.linkText("Đăng nhập")).click();
        System.out.println("Tu anh hoc hay khong");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
