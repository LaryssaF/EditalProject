package com.example.EditalProject.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/security_controller")
public class SecurityController {

  @GetMapping
  public ResponseEntity<String> securityToken() {
    return ResponseEntity.ok("token seguro");
  }

}