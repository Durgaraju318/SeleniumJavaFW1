package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLog4j {

	private static Logger logger = LogManager.getLogger(DemoLog4j.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n.....Hello World....!\n");
		
		logger.trace("This is an trace msg");

		logger.info("This is information message");
		logger.error("This is an error msg");
		logger.warn("This is an error msg");
		logger.fatal("This is an error msg");
		System.out.println("completed");
		
		
		
		
	}

}
