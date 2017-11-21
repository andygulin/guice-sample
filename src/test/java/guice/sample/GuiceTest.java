package guice.sample;

import com.google.inject.Guice;
import com.google.inject.Injector;
import guice.sample.service.AuthService;
import guice.sample.service.HelloService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuiceTest {

    private static final Logger logger = LogManager.getLogger(GuiceTest.class);

    private Injector injector;

    @Before
    public void init() {
        injector = Guice.createInjector();
    }

    @Test
    public void helloServiceTest() {
        HelloService helloService = injector.getInstance(HelloService.class);
        Assert.assertEquals("HelloServiceImpl",helloService.getClass().getSimpleName());
        Assert.assertEquals("Hello World",helloService.sayHello("World"));
    }

    @Test
    public void authServiceTest() {
        AuthService authService = injector.getInstance(AuthService.class);
        Assert.assertEquals("FileAuthServiceImpl",authService.getClass().getSimpleName());
        Assert.assertTrue(authService.login("root", "root"));
    }
}