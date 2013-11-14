package com.darkcanyon.web.filter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

public class AppInitializer implements ServletContextListener
{
	private static Logger log = Logger.getLogger(AppInitializer.class);
	
	public void contextInitialized(ServletContextEvent event)
	{
		log.debug("START App initialization.");
	}
	
	public void contextDestroyed(ServletContextEvent event)
	{
		log.debug("contextDestroyed");
	}
}
