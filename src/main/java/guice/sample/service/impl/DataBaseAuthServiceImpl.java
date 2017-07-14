package guice.sample.service.impl;

import com.google.inject.Singleton;
import guice.sample.service.AuthService;

@Singleton
public class DataBaseAuthServiceImpl implements AuthService {

    @Override
    public boolean login(String username, String password) {
        return true;
    }
}