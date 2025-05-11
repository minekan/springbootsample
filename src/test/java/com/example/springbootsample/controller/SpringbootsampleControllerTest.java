package com.example.springbootsample.controller;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.servlet.ModelAndView;

import com.example.springbootsample.dbflute.exbhv.IdTestBhv;

@RunWith(JUnit4.class)
class SpringbootsampleControllerTest {
	

	@InjectMocks
	SpringbootsampleController controller = new SpringbootsampleController();
	@Mock
	IdTestBhv idBhvMock;
	AutoCloseable closeable;

	@BeforeTestClass
	void testInit() {
	}

	@BeforeEach
	public void setup() {
		closeable = MockitoAnnotations.openMocks(this);
		ReflectionTestUtils.setField(controller, "idBhv", idBhvMock);
	}
	@AfterEach  // JUnit4のアノテーション
	public void terminate() throws Exception {
		// Mockオブジェクトのリソースを解放
		closeable.close();
	}
	@Test
	void indexTest() throws Exception {
		assertThat(controller.index()).isEqualTo("index");
	}

	@Test
	void numTest() throws Exception {
	}

	@Test
	void mavnumTest() throws Exception {
	}

	@Test
	void mavformTest() throws Exception {
	}

	@Test
	void dblistTest() throws Exception {
		doReturn(2).when(idBhvMock).selectCount(any());
		ModelAndView mav = controller.dblist(new ModelAndView());
		assertThat(mav.getModel().get("msg")).hasToString("こんにちは2件です！");
	}
}


