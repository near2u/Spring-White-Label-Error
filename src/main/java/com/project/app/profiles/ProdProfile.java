package com.project.app.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdProfile implements EvnBasedConfig {

	@Override
	public void setup() {
		// TODO Auto-generated method stub
		System.out.println("Production based Profile");
	}

}
