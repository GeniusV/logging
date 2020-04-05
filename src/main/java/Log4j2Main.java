import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.List;

/**
 * Created by GeniusV on 4/4/20.
 */
public class Log4j2Main {
    public static void main(String[] args) throws InterruptedException {
        Logger logger = LoggerFactory.getLogger("GeniusV Logger");

        logger.info("3");
        while (true) {
            logger.debug("test");
            logger.info("test");
            logger.warn("test");
            logger.error("test", new IllegalAccessException("test exception"));
            Thread.sleep(1000);

        }
    }
}
