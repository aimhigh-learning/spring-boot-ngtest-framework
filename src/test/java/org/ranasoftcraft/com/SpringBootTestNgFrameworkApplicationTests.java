package org.ranasoftcraft.com;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author sandeep.rana
 *
 */
@SpringBootTest
class SpringBootTestNgFrameworkApplicationTests {
	
	// test the main section 
	public static void main(String[] args) {
		
		// basic setup and login 
		final Startup startup = new Startup();
		
		// test login section 
		final Login login = new Login(startup);
		
		/// test home section 
		final Home home = new Home(startup);
		
		
		
	}
	
}
