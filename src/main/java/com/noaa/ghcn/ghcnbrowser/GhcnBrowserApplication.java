package com.noaa.ghcn.ghcnbrowser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/integration/noaa-integration-context.xml")
public class GhcnBrowserApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhcnBrowserApplication.class, args);
	}
}
