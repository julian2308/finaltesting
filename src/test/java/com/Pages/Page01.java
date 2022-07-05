package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Page01 extends BasePage {
    private static final String myAccount = "hidden-xs";
    private static final String register = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a";
    private static final String firstname = "input-firstname";
    private static final String lastname = "input-lastname";
    private static final String email = "input-email";
    private static final String telephone = "input-telephone";
    private static final String password = "input-password";
    private static final String confirmPassword = "input-confirm";
    private static final String newsletter = "newsletter";
    private static final String privacyPolicy = "agree";
    private static final String btnContinue = "btn btn-primary";

    public void getMyAccount(){
        WebElement btnMyAccount = getWebElement(By.className(myAccount));
        btnMyAccount.click();
    }
    public void getRegister (){
        WebElement btnRegister = getWebElement(By.xpath(register));
        btnRegister.click();
    }

    public void getFirstname(){
        WebElement getName = getWebElement(By.className(firstname));
        getName.clear();
        getName.sendKeys("Sergio");
    }
    public void getLastname(){
        WebElement getLastName = getWebElement(By.className(lastname));
        getLastName.clear();
        getLastName.sendKeys("Martines");
    }
    public void getEmail(){
        WebElement searchInputEmail = getWebElement(By.className(email));
        searchInputEmail.clear();
        searchInputEmail.sendKeys("example@gmail.com");
    }
    public void getTelephone(){
        WebElement getTelephone = getWebElement(By.className(telephone));
        getTelephone.clear();
        getTelephone.sendKeys("261123456");
    }
    public void getPassword(){
        WebElement getPassword = getWebElement(By.className(password));
        getPassword.clear();
        getPassword.sendKeys("contraseña123");
    }
    public void getConfirmPassword(){
        WebElement getConfirmPassword = getWebElement(By.className(confirmPassword));
        getConfirmPassword.clear();
        getConfirmPassword.sendKeys("contraseña123");
    }
    public void getNewsletter() {
        WebElement getNewsletter= getWebElement(By.className(newsletter));
        getNewsletter.click();
    }
    public void getPrivacyPolicy() {
        WebElement getPrivacyPolicy= getWebElement(By.name(privacyPolicy));
        getPrivacyPolicy.click();
    }
    public void getBtnContinue() {
        WebElement getBtnContinue= getWebElement(By.className(btnContinue));
        getBtnContinue.click();
    }
}
