package guice.sample;

import com.google.inject.Guice;
import com.google.inject.Injector;
import guice.sample.service.AuthService;
import guice.sample.service.HelloService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuiceTest {

    private static final Logger logger = LogManager.getLogger(GuiceTest.class);

    private Injector injector;

    @BeforeEach
    public void init() {
        injector = Guice.createInjector();
    }

    @Test
    public void helloServiceTest() {
        HelloService helloService = injector.getInstance(HelloService.class);
        assertEquals("HelloServiceImpl", helloService.getClass().getSimpleName());
        assertEquals("Hello World", helloService.sayHello("World"));
    }

    @Test
    public void authServiceTest() {
        AuthService authService = injector.getInstance(AuthService.class);
        assertEquals("FileAuthServiceImpl", authService.getClass().getSimpleName());
        assertTrue(authService.login("root", "root"));
    }
}