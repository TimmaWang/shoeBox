import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Description:
 * @Author: hzwangzhichao1@corp.netease.com
 * @Date: 2017/11/21
 */
public class LogTest {

    public final static Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        logger.info("test");
        logger.debug("debug test");
        logger.warn("warn test");
    }
}
