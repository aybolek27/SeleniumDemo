package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aybolek\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.get("https://google.com");
			
	}

}
