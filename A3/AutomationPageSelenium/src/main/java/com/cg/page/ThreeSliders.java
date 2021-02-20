package com.cg.page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.base.TestBase;

public class ThreeSliders extends TestBase{
	
	@FindBy(xpath = "//a[contains(text(),'Shop')]")
	WebElement shop;
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement home;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]")
	List<WebElement> slides;
	Actions action;
	@FindBy(tagName = "img")
	List<WebElement> imagetags;
	
	
	public ThreeSliders() {
		init();
		PageFactory.initElements(driver, this);
	}
	
	public void clickShop() {
		shop.click();
	}
	
	public void clickHome() {
		home.click();
	}
	
	public void checkSlider() {

		for (WebElement image : slides) {
			List<WebElement> images = imagetags;
		}
	}

	public void confirmSlider() {
		for (WebElement image : slides) {
			List<WebElement> images = imagetags;
			Assert.assertTrue(images.size() == 10);
		}

	}
	public String getTitle() {
		return driver.getTitle();
	}

}
