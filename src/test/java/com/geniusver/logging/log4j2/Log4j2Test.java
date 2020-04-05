package com.geniusver.logging.log4j2;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by GeniusV on 4/4/20.
 */
public class Log4j2Test {
    @Test
    public void testLog() {
        Logger logger = LoggerFactory.getLogger("GeniusV Logger");
        logger.debug("test");
        logger.info("test");
        logger.warn("test");
        logger.error("test", new IllegalAccessException("test exception"));
    }
}
