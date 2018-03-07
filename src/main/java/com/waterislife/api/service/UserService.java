package com.waterislife.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.waterislife.api.domain.User;
import com.waterislife.api.dto.UserNewDto;
import com.waterislife.api.repository.UserRepository;
import com.waterislife.api.service.exception.DataIntegrityException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public User save(User user) {
		User curr = userRepository.findByEmail(user.getEmail());
		
		if (curr != null) {
			throw new DataIntegrityException("This email is already registered");
		}
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	public User fromDto(UserNewDto userNewDto) {
		return new User(null, userNewDto.getName(), userNewDto.getEmail(), userNewDto.getPassword());
	}
}
