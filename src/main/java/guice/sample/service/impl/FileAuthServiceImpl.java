package guice.sample.service.impl;

import java.util.ResourceBundle;

import com.google.inject.Singleton;

import guice.sample.service.AuthService;

@Singleton
public class FileAuthServiceImpl implements AuthService {

	@Override
	public boolean login(String username, String password) {
		ResourceBundle bundle = ResourceBundle.getBundle("auth");
		String name = bundle.getString("username");
		String pass = bundle.getString("password");
		if (username.equals(name) && password.equals(pass)) {
			return true;
		}
		return false;
	}
}