package guice.sample.service;

import com.google.inject.ImplementedBy;

import guice.sample.service.impl.FileAuthServiceImpl;

@ImplementedBy(FileAuthServiceImpl.class)
public interface AuthService {

	boolean login(String username, String password);
}
