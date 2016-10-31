package guice.sample.service.impl;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.google.inject.Singleton;

import guice.sample.service.AuthService;

@Singleton
public class FileAuthServiceImpl implements AuthService {

	@Override
	public boolean login(String username, String password) {
		Resource resource = new ClassPathResource("auth.txt");
		List<String> lines = null;
		try {
			lines = Files.readAllLines(resource.getFile().toPath(), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String u = lines.get(0);
		String p = lines.get(1);
		if (username.equals(u) && password.equals(p)) {
			return true;
		}
		return false;
	}
}