package in;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	protected static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {

		logger.info("in");
		logger.debug("in");
		logger.warn("in");
		logger.error("in");

	}
}
