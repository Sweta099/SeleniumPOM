package com.cg.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.base.TestBase;

public class BookReview extends TestBase {
	@FindBy(xpath = "//a[contains(text(),'Shop')]")
	WebElement shopClick;
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement homeClick;
	WebElement element;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='product-165']/div[3]/ul[1]/li[2]")
	WebElement clickReview;
	@FindBy(xpath = "//a[contains(text(),'4')]")
	WebElement rating;
	@FindBy(xpath = "//textarea[@id='comment']")
	WebElement addReview;
	@FindBy(xpath = "//input[@id='author']")
	WebElement addName;
	@FindBy(xpath = "//input[@id='email']")
	WebElement addEmail;
	@FindBy(xpath = "//input[@id='submit']")
	WebElement clickSubmit;
	@FindBy(xpath = "//div[@id='comments']")
	WebElement viewReview;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public BookReview() {
		init();
		PageFactory.initElements(driver, this);
	}

	public void clickShop() {
		shopClick.click();
	}

	public void clickHome() {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		homeClick.click();
	}

	public void checkArrival() {

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		List<WebElement> arrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
		for (WebElement list : arrivals) {
			List<WebElement> books = driver.findElements(By.tagName("h3"));

			if (books.size() == 3) {
				System.out.println("There are only three arrivals in the home page");
			}
		}
	}

	public void confirm() {

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		List<WebElement> arrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));

		List<WebElement> books = driver.findElements(By.tagName("h3"));

		Assert.assertTrue(books.size() == 3);

	}

	public void clickOnImage() {

		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

		List<WebElement> imageClick = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
		for (WebElement image : imageClick) {
			if (image.getText().contains("Mastering JavaScript")) {
				image.findElement(By.xpath("//h3[contains(text(),'Mastering JavaScript')]")).click();
			}
		}
	}

	public void checkingNavigation() {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Assert.assertTrue(driver.getTitle().contains("JavaScript"));
	}

	public void addToBasket() {
		driver.findElement(By.xpath("//button[contains(text(),'Add to basket')]")).click();
	}

	public void checkingBasket() {
		element = driver.findElement(
				By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[1]"));
		Assert.assertTrue(element.getText().contains("added"));
	}

	public void clickingReview() {
		clickReview.click();
		js.executeScript("window.scrollBy(0,500)");
	}

	public void addReview(String reviews, String name, String email) {
		rating.click();
		addReview.sendKeys(reviews);
		addName.sendKeys(name);
		addEmail.sendKeys(email);
	}

	public void submitReview() {
		clickSubmit.click();
	}
	
	public void viewReview() {
		Assert.assertTrue(viewReview.getText().contains("Reviews"));
		js.executeScript("window.scrollBy(0,-250)");
	}

}
