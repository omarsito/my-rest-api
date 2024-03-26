package com.oabraham.myrestapi;

import com.oabraham.myrestapi.pojo.RootAPI;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import com.oabraham.myrestapi.controller.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MyRestApiApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private RootAPIController rootAPIController;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	@Ignore
	void contextLoads() {
		assertThat(rootAPIController).isNotNull();
	}

	@Test
	@Ignore
	void testResponseEntityIsNotNull() {
		assertThat(testRestTemplate.getForEntity("http://localhost:" + port + "/", RootAPI.class)).isNotNull();
	}

	@Test
	@Ignore
	void testHttpStatusCodeEqual200() {
		assertThat(testRestTemplate.getForObject("http://localhost:" + port + "/", String.class)).contains("200");
	}

	@Test
	@Ignore
	void testHTTPStatusMsgIsPositive() {
		assertThat(testRestTemplate.getForObject("http://localhost:" + port + "/", String.class)).contains("Up & Running");
	}

	@Test
	@Ignore
	void testAppVersionIsWithCorrectFormat() {
		assertThat(testRestTemplate.getForObject("http://localhost:" + port + "/", RootAPI.class)).hasFieldOrProperty("appVersion");
		String regEx = "[0-9]\\.[0-9]\\.[0-9]-(SNAPSHOT|RELEASE)";
		assertThat(testRestTemplate.getForObject("http://localhost:" + port + "/", RootAPI.class)).extracting("appVersion").toString().matches(regEx);
	}

}