package guice.sample.service.impl;

import com.google.inject.Singleton;
import guice.sample.service.AuthService;

@Singleton
public class SimpleAuthServiceImpl implements AuthService {

    @Override
    public boolean login(String username, String password) {
        if (username.equals("root") && password.equals("root")) {
            return true;
        }
        return false;
    }
}