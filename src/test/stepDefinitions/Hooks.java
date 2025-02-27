package stepDefinitions;

import classTestSetup.ClassTestSetupWeb;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends ClassTestSetupWeb {

    @Before
    public void setUp() {
        ClassTestSetupWeb.initialize();
    }

    @After
    public static void tearDown() {
        ClassTestSetupWeb.closeBrowser();
    }
}
