package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.function.utils.MoshujiaUtils;
import com.pageItems.PageXpath;

public class Test_GetCPU {
	private WebDriver driver;
	
	@BeforeClass
	public void beforeclass(){
		driver=MoshujiaUtils.startMoshujia();
		MoshujiaUtils.whereXpath(PageXpath.BRANCH).click();
	}
	
	@Test
	public void testGetCPU(){

		MoshujiaUtils.switchFrame(PageXpath.MAIN_SECEEN);
		String s=MoshujiaUtils.whereXpath(PageXpath.RI_CPU).getText();
		System.out.println(s);
	}
	
	@AfterClass
	public void afterclass(){
		driver.close();
	}

}
