package com.cislibrary.library;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.cislibrary.library.controller.MemberController;
import com.cislibrary.library.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = { MemberController.class, MemberService.class})
class LibraryServiceApplicationTests {

	@Test
	void contextLoads() {

	}

}
