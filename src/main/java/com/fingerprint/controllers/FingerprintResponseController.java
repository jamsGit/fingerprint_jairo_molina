package com.fingerprint.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fingerprint.models.FingerprintResponse;


import io.reactivex.Single;

@RestController
@RequestMapping(path = "/core/fingerprints")
public class FingerprintResponseController {
  @Value("${entityName}")
  String entityName;
  @Value("${success}")
  boolean success;

  @PostMapping("/validate")
  public Single<FingerprintResponse> responseFingerprint(@RequestBody String document) {
    return (Single.just(new FingerprintResponse(entityName, success)));
  }
  
 

}
