package week3.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		WebElement Count = driver.findElement(By.xpath("//div[@class='length']"));
		String CNT = Count.getText();
		System.out.println("Totally there are "+CNT);
		
		System.out.println("=========================================================");
		List<WebElement> brand = new ArrayList<WebElement>();
		brand = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Total Brands available: "+brand.size());
		System.out.println("Different brands displayed are:");
		for (WebElement eachBrand : brand) {
			String BR = eachBrand.getText();
			System.out.println(BR);
			}
		System.out.println("=========================================================");
		List<WebElement> name = new ArrayList<WebElement>();
		name = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("Total Bag Names available: "+name.size());
		System.out.println("Different Bag Names are:");
		for (WebElement eachName : name) {
			String NM = eachName.getText();
			System.out.println(NM);
			
		}
	}

}
