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
public class Home {
	
	private Startup startup;
	
	public Home(Startup startup) {
		this.startup = startup;
	}
	
	
	@Test
	@DisplayName(value = "Test the home section ....")
	void testHome() {
		startup.getWebDriver().findElement(By.className("main-home-section")).click();
	}

}
