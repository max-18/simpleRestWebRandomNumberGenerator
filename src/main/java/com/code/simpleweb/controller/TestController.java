package com.code.simpleweb.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.code.simpleweb.service.GenerateOTP;

@RestController
public class TestController {
	
	@Autowired
	private GenerateOTP generateOtp;
	
	@RequestMapping(value = "/otp", method = RequestMethod.GET)
	public Map loginPage(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> otpMap = new HashMap<>();
		otpMap.put("otp", String.valueOf(generateOtp.getRandomNumber()));
		return otpMap;
	}
}