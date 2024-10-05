package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class logs {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("logs.class");
        logger.trace("trace"); logger.debug("debug");

        logger.info("这是一条日志信息");
        logger.warn("warn");
        logger.error("error");
    }
}
