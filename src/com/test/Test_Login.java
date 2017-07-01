package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.function.utils.MoshujiaUtils;
import com.pageItems.PageXpath;


public class Test_Login {
	private WebDriver driver;
	
	@BeforeClass
	public void beforeclass(){
		driver=MoshujiaUtils.startMoshujia();
		MoshujiaUtils.whereXpath(PageXpath.BRANCH).click();
		
	}
	
	@Test
	public void Test_login(){
//		driver.switchTo().defaultContent();
		MoshujiaUtils.switchFrame(PageXpath.BANNER);
		WebElement systemControl=MoshujiaUtils.whereXpath(PageXpath.BASIC_INFORMATION);
		Assert.assertTrue(systemControl.isDisplayed());
		
	}
	
	@AfterClass
	public void afterclass(){
		driver.close();
	}

}
