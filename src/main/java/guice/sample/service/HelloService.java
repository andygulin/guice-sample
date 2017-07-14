package guice.sample.service;

import com.google.inject.ImplementedBy;
import guice.sample.service.impl.HelloServiceImpl;

@ImplementedBy(HelloServiceImpl.class)
public interface HelloService {

    String sayHello(String name);
}