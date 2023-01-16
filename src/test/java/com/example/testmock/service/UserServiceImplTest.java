package com.example.testmock.service;

import com.example.testmock.entity.User;
import com.example.testmock.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
public class UserServiceImplTest {

	@InjectMocks
	private UserServiceImpl userService;

	@Mock
	private UserRepository userRepository;

	@Before
	public void setUp() {
		User user = new User(1, "Manh");
		User user1 = new User(2, "DucManh");
		Mockito.when(userRepository.findByName(user.getName())).thenReturn(user);
		List<User> users = Arrays.asList(user, user1);
		Mockito.when(userRepository.findAll()).thenReturn(users);
	}

	@Test
	public void getUserByName() {
		String name = "Manh";
		User user = userService.getUserByName(name);
		Assert.assertEquals(user.getName(), name);
	}

	@Test
	public void saveUser() {
		User user = new User();
		user.setId(3);
		user.setName("Pham Manh");
		userService.saveUser(user);
		verify(userRepository, times(1)).save(user);
	}

	@Test
	public void getAllUsers() {
		List<User> users = userService.getAllUsers();
		Assert.assertEquals(users.size(), 2);
	}
}
