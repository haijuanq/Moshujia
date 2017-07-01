package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.function.utils.MoshujiaUtils;
import com.pageItems.PageXpath;


public class Test_Time_Hand {
	private WebDriver driver;
	
	@BeforeClass
	public void beforeclass(){
		driver=MoshujiaUtils.startMoshujia();
		MoshujiaUtils.whereXpath(PageXpath.BRANCH).click();
	}
	
	@Test
	public void Test_TimeHand() throws Exception{
		MoshujiaUtils.switchFrame(PageXpath.MAIN_SECEEN);
		MoshujiaUtils.whereXpath(PageXpath.RI_TIME).click();
		MoshujiaUtils.whereXpath(PageXpath.TIME_HAND).click();
		//选择下拉框
		
		/*
		 * org.openqa.selenium.WebDriverException: Permission denied to access property "valueOf"问题没解决
		 */
		Select year=new Select(MoshujiaUtils.whereXpath(PageXpath.YEAR));
		year.selectByVisibleText("2010");
		Select month=new Select(MoshujiaUtils.whereXpath(PageXpath.MONTH));
		month.selectByVisibleText("6");
		Select day=new Select(MoshujiaUtils.whereXpath(PageXpath.DAY));
		day.selectByVisibleText("2");
		MoshujiaUtils.whereXpath(PageXpath.CONFIRM).click();
		
//		//判断在基本信息页面，时间是否和手工设置的一致
//		//点击系统监控
//		MoshujiaUtils.switchFrame(PageXpath.CONTENTS);
//		MoshujiaUtils.whereXpath(PageXpath.SYSTEM_CONTROL);
//		//获取系统时间，将其split
//		MoshujiaUtils.switchFrame(PageXpath.MAIN_SECEEN);
//		String str=MoshujiaUtils.whereXpath(PageXpath.RI_TIME).getText();
//		String time[]=str.split("年|月|日");
//		String finally_year=time[0];
//		char finally_month=time[1].charAt(2);
//		char finally_day=time[2].charAt(2);
//		System.out.println(finally_year+"==="+finally_month+"===="+finally_day);
		
	}
	
	@AfterClass
	public void afterclass(){
		driver.close();
	}
}
