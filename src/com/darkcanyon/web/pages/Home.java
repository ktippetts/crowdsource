package com.darkcanyon.web.pages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class Home extends WebPage 
{
	public Home()
	{
		add(new Label("helloMessage", "Crowdsource Home"));
	}
}
