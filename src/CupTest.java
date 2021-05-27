import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


    class CupTest {

        @Test
        void  getMaterial() {
            Cup cup = new Cup("porcelain", 25);
            assertEquals("porcelain" , cup.getMaterial());
        }


    }

