package logging;

import java.util.logging.Logger;

public class Demo {
    private static final Logger logger = LogFactory.getLogger();

    public static void main(String[] args) {
        logger.info("this is log");
        logger.info("this is log1");
    }
}
