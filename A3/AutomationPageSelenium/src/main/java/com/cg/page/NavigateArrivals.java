package com.cg.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.base.TestBase;

public class NavigateArrivals extends TestBase{
	
	@FindBy(xpath = "//a[contains(text(),'Shop')]")
	WebElement shop;
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement home;
	WebElement element;
	
		public NavigateArrivals() {
			init();
			PageFactory.initElements(driver, this);
		}
		
		public void clickShop() {
			shop.click();
		}
		
		public void clickHome() {
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			home.click();
		}
	
		public void checkArrival() {
			
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			List<WebElement> a = driver.findElements(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));	
			for(WebElement list:a) {
				List<WebElement> books = driver.findElements(By.tagName("h3"));
				
				if(books.size()==3) {
					System.out.println("There are only three arrivals in the home page");
				}
				}
		}
		
		public void confirm() {
			
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
				
				List<WebElement> a = driver.findElements(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));	
				
				List<WebElement> books = driver.findElements(By.tagName("h3"));
				
				Assert.assertTrue(books.size()==3);
				
		}
		
		public void clickOnImage() {
			
			driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
			
			List<WebElement> a = driver.findElements(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));	
			for(WebElement image:a) {
				if(image.getText().contains("Mastering JavaScript")) {
					image.findElement(By.xpath("//h3[contains(text(),'Mastering JavaScript')]")).click();
				}
			}
		}
		
		public void checkNavigation() {
			
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			Assert.assertTrue(driver.getTitle().contains("JavaScript"));
			
		}
		
		public void addToBasket() {
			driver.findElement(By.xpath("//button[contains(text(),'Add to basket')]")).click();
		}
		
		public void checkBasket() {
			element = driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[1]"));
			Assert.assertTrue(element.getText().contains("added"));
		}
		

}
