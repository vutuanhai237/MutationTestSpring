package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		int a = 4 + 1;
		assert 5 == a;
	}

	@Test
	void mutate() {
		int i = 3;
		String k;
		if (i >= 0 ) {
			k = "foo";
		} else {
			k = "bar";
		}
		assert k == "foo";
	}

}
