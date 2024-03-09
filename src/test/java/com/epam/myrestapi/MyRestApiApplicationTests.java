package com.epam.myrestapi;

import com.epam.myrestapi.controller.RootAPIController;
import com.epam.myrestapi.pojo.RootAPI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

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
	void contextLoads() {
		assertThat(rootAPIController).isNotNull();
	}

	@Test
	void testResponseEntityIsNotNull() {
		assertThat(testRestTemplate.getForEntity("http://localhost:" + port + "/", RootAPI.class)).isNotNull();
	}

	@Test
	void testHttpStatusCodeEqual200() {
		assertThat(testRestTemplate.getForObject("http://localhost:" + port + "/", String.class)).contains("200");
	}

	@Test
	void testHTTPStatusMsgIsPositive() {
		assertThat(testRestTemplate.getForObject("http://localhost:" + port + "/", String.class)).contains("Up & Running");
	}

	@Test
	void testAppVersionIsWithCorrectFormat() {
		assertThat(testRestTemplate.getForObject("http://localhost:" + port + "/", RootAPI.class)).hasFieldOrProperty("appVersion");
		assertThat(testRestTemplate.getForObject("http://localhost:" + port + "/", RootAPI.class)).extracting("appVersion").isEqualTo("0.2.0-SNAPSHOT");
	}

}
