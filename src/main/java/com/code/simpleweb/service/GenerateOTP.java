package com.code.simpleweb.service;

import org.springframework.stereotype.Service;

@Service
public class GenerateOTP {

	public Integer getRandomNumber() {
		int randomPin   =(int) (Math.random()*9000)+1000;
        Integer otpNumber  = Integer.valueOf(randomPin);
		return otpNumber;
	}
}
