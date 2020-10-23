package com.fingerprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiFingerprintApplication {

  public static void main(String[] args) {
    SpringApplication.run(ApiFingerprintApplication.class, args);
  }

}
