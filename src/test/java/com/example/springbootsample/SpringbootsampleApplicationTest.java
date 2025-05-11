package com.example.springbootsample;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.assertj.MockMvcTester;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
class SpringbootsampleApplicationTest {
    @Autowired
    ObjectMapper objectMapper;
    
	@Test
	void indexTest(@Autowired MockMvcTester mvc) throws Exception {
		assertThat(mvc.get().uri("/sample/")).hasStatusOk().bodyText().contains("Hello World");
	}

	@Test
	void numTest(@Autowired MockMvcTester mvc) throws Exception {
		assertThat(mvc.get().uri("/sample/2")).hasStatusOk().bodyText().contains("3");
	}

	@Test
	void mavnumTest(@Autowired MockMvcTester mvc) throws Exception {
		assertThat(mvc.get().uri("/sample/mav/3")).hasStatusOk().bodyText().contains("6");
	}

	@Test
	void mavformTest(@Autowired MockMvcTester mvc) throws Exception {
		assertThat(mvc.post().param("text1","aaaa")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED).uri("/sample/mavform")).hasStatusOk().bodyText().contains("aaaa");
	}

	@Test
	void dblistTest(@Autowired MockMvcTester mvc) throws Exception {
		assertThat(mvc.get().uri("/sample/dblist")).hasStatusOk().bodyText().contains("3件");
	}
}


