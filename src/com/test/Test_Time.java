package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.function.utils.MoshujiaUtils;
import com.pageItems.PageXpath;

public class Test_Time {
	
private WebDriver driver;
	
	@BeforeClass
	public void beforeclass(){
		driver=MoshujiaUtils.startMoshujia();
		MoshujiaUtils.whereXpath(PageXpath.BRANCH).click();
	}
	@Test
	public void testTime(){
		MoshujiaUtils.switchFrame(PageXpath.MAIN_SECEEN);
		String str=MoshujiaUtils.whereXpath(PageXpath.RI_TIME).getText();
		String time[]=str.split("年|月|日");
		String finally_year=time[0];
		//charAt()获取字符串指定下标的字符，返回值为char
		char finally_month=time[1].charAt(2);
		char finally_day=time[2].charAt(2);
		System.out.println(finally_year+"==="+finally_month+"===="+finally_day);
	}
	
	
	@AfterClass
	public void afterclass(){
		driver.close();
	}

}
