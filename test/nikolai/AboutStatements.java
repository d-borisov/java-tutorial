package nikolai;

import junit.framework.Assert;
import org.junit.Test;

public class AboutStatements extends Assert {

    @Test
    public void aboutStatements() {
        assertFalse(8 + 2 / 2 == 5);
        assertTrue((8 + 2) / 2 == 5);
    }
}
