package com.RickMorty;

import com.RickMorty.P4.service.P4Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RickMortyApplicationTests {

	@Test
	void contextLoads() {
	}


	@Autowired
	private P4Service p4Service;

	@Test
	public void testSumNaturalNumbers() {

		int n = 5;
		int expectedSum = 15;
		assertEquals(expectedSum, p4Service.sumN(n));

		n = 10;
		expectedSum = 55;
		assertEquals(expectedSum, p4Service.sumN(n));
	}
}
