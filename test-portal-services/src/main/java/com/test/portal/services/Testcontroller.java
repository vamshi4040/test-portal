package com.test.portal.services;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegister(Model model) {
		System.out.println("fbjdfnvkdfnbknbkncvbncnb,ncb,");
		return "djfgbsjgbksfbgksb";
	}
}
