package com.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
        
     WebDriver driver=new ChromeDriver();
     driver.get("http://www.gmail.com");
     driver.manage().window().maximize();
     

	}

}
