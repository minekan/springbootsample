package com.example.springbootsample.controller;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.dbflute.optional.OptionalEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.servlet.ModelAndView;

import com.example.springbootsample.dbflute.exbhv.IdTestBhv;
import com.example.springbootsample.dbflute.exentity.IdTest;

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

	@Test
	void detailTest() throws Exception {
		@SuppressWarnings("unchecked")
		// selectByPKの結果
		OptionalEntity<IdTest> resultSet = mock(OptionalEntity.class);
		// selectByPKの結果.get()の結果
		IdTest entity = new  IdTest();
		entity.setId("id1");
		entity.setVal("val1");

		// 結果用Mockの設定
		doReturn(entity).when(resultSet).get();
		doReturn(resultSet).when(idBhvMock).selectByPK(any());
		
		// テスト対象メソッド実行
		ModelAndView mav = controller.detail("1", new ModelAndView());
		
		// 実行結果の確認（戻り値）
		assertThat(mav.getModel().get("msg")).hasToString("こんにちはIdTest:{id1, val1}@edfb13d1件です！");
		
		// 内部使用メソッド(selectByPK)の引数取得
		ArgumentCaptor<String> pkCaptor = ArgumentCaptor.forClass(String.class);
		verify(idBhvMock, times(1)).selectByPK(pkCaptor.capture());
		String param = pkCaptor.getValue();

		// 実行結果の確認（内部使用メソッドの引数）
		assertThat(param).hasToString("1");
		
	}
}


