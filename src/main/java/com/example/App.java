package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
    public static void main( String[] args )
    {
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.google.com/");
        Driver.manage().window().maximize();
    }
}
