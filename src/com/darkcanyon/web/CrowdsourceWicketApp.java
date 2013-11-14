package com.darkcanyon.web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

import com.darkcanyon.web.pages.Home;

public class CrowdsourceWicketApp extends WebApplication
{
	public Class<? extends WebPage> getHomePage()
	{
		return Home.class;
	}
	
	public void init()
	{
		super.init();
	}
}
