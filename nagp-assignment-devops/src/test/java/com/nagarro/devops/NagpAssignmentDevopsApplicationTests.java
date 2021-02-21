package com.nagarro.devops;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class NagpAssignmentDevopsApplicationTests {

	@Test
	public void testSample() {
      MatcherAssert.assertThat("chetanmahajan", CoreMatchers.is("chetanmahajan"));     
 	}

}
