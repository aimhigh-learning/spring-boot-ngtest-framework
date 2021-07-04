/**
 * 
 */
package org.ranasoftcraft.com;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

/**
 * @author sandeep.rana
 *
 */
public class Login {
	
	private Startup startup;
	
	public Login(Startup startup) {
		this.startup = startup;
	}
	
	
	@Test
	@DisplayName(value = "Login the componenet....")
	void doLogin() {
		startup.getWebDriver().findElement(By.id("login")).click();
		
	}
	
	
}
