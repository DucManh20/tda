package com.example.testmock.controller;

import com.example.testmock.entity.User;
import com.example.testmock.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UserRestController.class)
class UserRestControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private UserService userService;

	@Test
	public void getUserByName() throws Exception {

		User user = new User(1, "Manh");
		when(userService.getUserByName("Manh")).thenReturn(user);

		mvc.perform(get("/api/user/Manh").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$.name").value("Manh"));

	}

	@Test
	public void saveUSer() throws Exception {

		User user = new User(1, "Manh");

		when(userService.saveUser(user)).thenReturn(user);

		mvc.perform(MockMvcRequestBuilders.post("/api/user").content(asJsonString(user))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}

	@Test
	public void getAllUsers() throws Exception {

		User user = new User(1, "Manh");
		User user1 = new User(2, "DucManh");
		List<User> users = Arrays.asList(user, user1);

		when(userService.getAllUsers()).thenReturn(users);

		mvc.perform(get("/api/user").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(2));

	}

	public static String asJsonString(final Object obj) throws JsonProcessingException {

		return new ObjectMapper().writeValueAsString(obj);

	}
}