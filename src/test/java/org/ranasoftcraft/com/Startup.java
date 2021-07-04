/**
 * 
 */
package org.ranasoftcraft.com;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;

/**
 * @author sandeep.rana
 *
 */
public class Startup {
	
	
	@Value("${project.host.url}")
	private String url;
	
	@Getter
	private WebDriver webDriver;
	
	public Startup() {
		init();
	}
	
	private void init() {
		/**
		 * 1. load the driver 
		 * 2. and user this.url as a variable 
		 * 3. assign the webDriver into the this.webDriver
		 */
	}
	
}
