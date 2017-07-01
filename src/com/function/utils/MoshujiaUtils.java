package com.function.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import com.pageItems.PageText;
import com.pageItems.PageXpath;

public class MoshujiaUtils {
	
	public static WebDriver driver;
	
	public static WebDriver startMoshujia(){
		//打开火狐浏览器
		ProfilesIni pi=new ProfilesIni();
		FirefoxProfile profile=pi.getProfile("default");
		driver=new FirefoxDriver(profile);
		//打开魔术家管理地址
		driver.get(PageXpath.URL);
		//当不处于目标页面时，找不到元素，没有返回值，直接报错，因此用try-catch-finally
		try {
			whereXpath(PageXpath.WIFI_SWITCH);
		} catch (Exception e) {
			
			whereXpath(PageXpath.LOGIN_PWD).sendKeys(PageText.PWD);
			whereXpath(PageXpath.LOGIN).click();
			
//		}finally {
//			whereXpath(PageXpath.BRANCH).click();
		}
		return driver;
	}
	
	//跳转不同的frame
	public static void switchFrame(String Frame){
		driver.switchTo().defaultContent();
		driver.switchTo().frame(Frame);
	} 
	
	public static WebElement whereXpath(String Xpath){
		WebElement e=driver.findElement(By.xpath(Xpath));
		return e;
	}

}
