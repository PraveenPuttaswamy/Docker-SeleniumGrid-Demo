package docker.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Tests {
	
	
	@Test
	public void Test1() throws MalformedURLException {
		
		DesiredCapabilities dC = DesiredCapabilities.chrome();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dC);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
	
	
	@Test
	public void Test2() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dC = DesiredCapabilities.firefox();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dC);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#btnLogin")).click();
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
