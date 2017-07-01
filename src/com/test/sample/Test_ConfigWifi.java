package com.test.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.function.utils.MoshujiaUtils;
import com.pageItems.PageXpath;

public class Test_ConfigWifi {
	private WebDriver driver;
	
	@BeforeClass
	public void beforeclass(){
		driver=MoshujiaUtils.startMoshujia();
	}
	@Test
	public void testConfigWifi(){
		//点击无线设置
		MoshujiaUtils.whereXpath(PageXpath.CONFIG_WIFI).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//点击高级设置
		/*
		 * firbug中可以定位到元素，运行代码提示无法定位，没有frame
		 * 这是由于在未选中到状态下，其Xpath与选中状态下不一致
		 * 
		 * 无法解决org.openqa.selenium.WebDriverException: Permission denied to access property "valueOf"问题
		 * 
		 */
		MoshujiaUtils.whereXpath(PageXpath.SENIOR_CONFIG).click();
		//5G信号强度选择标准
		Select signalPow=new Select(MoshujiaUtils.whereXpath(PageXpath.SIGNAL_5G));
		signalPow.selectByVisibleText("标准");
		//信道选择36
		Select channel=new Select(MoshujiaUtils.whereXpath(PageXpath.CHANNEL_5G));
		channel.selectByVisibleText("36");
		//点击保存
		MoshujiaUtils.whereXpath(PageXpath.SAVE).click();;
	}
	
	@AfterClass
	public void afterclass(){
		driver.close();
	}

	

}
