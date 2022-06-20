package com.bit.test;

import org.junit.Test;

import pages.HomePage;
import utility.Helper;

public class SmokeTest extends BaseTest  q		{

	@Test
	public void test1() {
		HomePage hp=new HomePage(dr);
		hp.clickMenMenu();
	}
}
