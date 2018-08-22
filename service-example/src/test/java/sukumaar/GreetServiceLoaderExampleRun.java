package sukumaar;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple ServiceLoaderExample.
 */
public class GreetServiceLoaderExampleRun {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void asgardThorGreeting() {
        String[] args = {"asgardThor", "Sukumaar"};
        ServiceLoaderExample.main(args);
    }

    @Test
    public void earthThorGreeting() {
        String[] args = {"earthThor", "Sukumaar"};
        ServiceLoaderExample.main(args);
    }
}
