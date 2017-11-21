package guice.sample.service.impl;

import com.google.inject.Singleton;
import guice.sample.service.AuthService;

import java.util.ResourceBundle;

@Singleton
public class FileAuthServiceImpl implements AuthService {

    @Override
    public boolean login(String username, String password) {
        ResourceBundle bundle = ResourceBundle.getBundle("auth");
        String name = bundle.getString("username");
        String pass = bundle.getString("password");
        return username.equals(name) && password.equals(pass);
    }
}