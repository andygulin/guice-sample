package guice.sample.service.impl;

import com.google.inject.Singleton;
import guice.sample.service.HelloService;

@Singleton
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return String.format("Hello %s", name);
    }
}