import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by User on 27.02.2017.
 */
public class КотикиТест {
    @Test
    public void testName() throws Exception {

        assertEquals("Mya", Котики.голос());
    }
}
