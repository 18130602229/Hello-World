package se.labs.springboot;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OurConrollerTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void test(){
        logger.info("===========uuu========");
        assert (true);
    }

    @Test
    public void exTest(){
        int a = 1/0;
        assert (a > 0);
    }
    @Test
    public void test2() throws Exception {
        throw  new Exception("is a error");
    }
}
