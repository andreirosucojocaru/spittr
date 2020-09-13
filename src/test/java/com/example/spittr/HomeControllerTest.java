package com.example.spittr;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.example.spittr.web.HomeController;

public class HomeControllerTest {
    @Test
    public void testHomePage() {
        HomeController controller = new HomeController();
        assertEquals("home", controller.home());
    }
}
