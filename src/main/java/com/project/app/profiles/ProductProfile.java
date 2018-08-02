package com.project.app.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class ProductProfile implements EvnBasedConfig{

	@Override
	public void setup() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Bean created Devloper profile");
		
		
	}

	
	

}
