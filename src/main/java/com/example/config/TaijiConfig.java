package com.example.config;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("TaijiConfig")
public class TaijiConfig {
	
	private boolean enabled;
	private InetAddress remoteAddress;
	private final Security security = new Security();

	
	public static class Security {
		private String username;
		private String password;
		private List<String> roles = new ArrayList<>(Collections.singleton("USER"));
	}

}
