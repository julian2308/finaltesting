package com.Tests;
import static org.junit.jupiter.api.Assertions.*;
import com.Base.BasePage;
import com.Pages.Page01;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

class Test01 {

	private static WebDriver webDriver;
	private static WebDriverWait wait;
	@BeforeAll
	static void setUp() {
		BasePage basePage = new BasePage();
		basePage.openApp();
		webDriver = basePage.getDriver();
	}
	@Test
	public void testPage1() throws InterruptedException {
		Page01 page01 = new Page01();


		page01.getMyAccount();
		Thread.sleep(3000);
		page01.getRegister();
		Thread.sleep(3000);
		page01.getFirstname();
		page01.getLastname();
		page01.getEmail();
		page01.getTelephone();
		page01.getPassword();
		page01.getConfirmPassword();
		page01.getNewsletter();
		page01.getPrivacyPolicy();
		page01.getBtnContinue();

	}
	@AfterAll
	static void cleanSetUp() {
		webDriver.quit();
	}
}
