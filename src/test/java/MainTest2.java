import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainTest2 {

    public static Logger logger = LoggerFactory.getLogger(MainTest2.class);

    @Test
    public void contextLoader(){
        logger.info("Test case execution...");
        assertEquals(true,true);
    }
}
