package com.pageItems;

public class PageXpath {
	
	public static final String URL="http://moshujia.cn";
	
	//登陆界面
	public static final String LOGIN_PWD="//input[@id='psd']";
	public static final String LOGIN="//input[@id='login']";
	public static final String BRANCH="//img[@id='wanzheng_img']";
	
	//简化界面
	//无线设置
	public static final String CONFIG_WIFI="//td[contains(text(),'无线设置')]";
	public static final String SENIOR_CONFIG="//td[@class='mobile_biankuang3unselect']";
	public static final String SIGNAL_5G="//select[@id='ap_txpower_5g']";
	public static final String CHANNEL_5G="//select[@id='ap_chan_5g']";
	public static final String SAVE="//input[@id='save']";
	
	
	//简化版页面
	public static final String WIFI_SWITCH="//td[@id='wifi_state']";
	
	//专业版界面
	//frame
	public static final String CONTENTS="contents";
	public static final String BANNER="banner";
	public static final String MAIN_SECEEN="main_screen";
	public static final String CHILDSUBMIT="childsubmit";
	
	//系统监控
	public static final String SYSTEM_CONTROL="//td[contains(text(),'系统监控')]";
	
	//运行信息:RI
	//基本信息
	public static final String BASIC_INFORMATION="//a[contains(text(),'基本信息')]";
	public static final String RI_CPU="//td[contains(text(),'系统资源')]/following-sibling::td[2]";
	public static final String RI_TIME="//a[@title='点击进入时间设置页面']";
	
	//设备管理
	public static final String EQIPMENT="//img[@name='pic_sysinfo']]";
	//基本管理
	//时间设置：TC
	public static final String TC="//a[contains(text(),'时间设置')]";
	public static final String TIME_HAND="//td[contains(text(),'手工设置系统时间')]/input[@type='radio']";
	public static final String YEAR="//select[@name='systime_year']";
	public static final String MONTH="//select[@name='systime_month']";
	public static final String DAY="//select[@name='systime_day']";
	public static final String CONFIRM="//input[@id='id_confirm']";
}
