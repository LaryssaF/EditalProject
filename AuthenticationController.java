package com.example.EditalProject.Controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EditalProject.Auth.AuthenticationRequest;
import com.example.EditalProject.Auth.AuthenticationResponse;
import com.example.EditalProject.Auth.RegisterRequest;
import com.example.EditalProject.services.AuthenticationService;


@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

  private final AuthenticationService service;

  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponse> register(
      @RequestBody RegisterRequest request
  ) {
    return ResponseEntity.ok(service.register(request));
  }
  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(
      @RequestBody AuthenticationRequest request
  ) {
    return ResponseEntity.ok(service.authenticate(request));
  }
 
  @PostMapping("/register/coordenadorExtensao")
  public ResponseEntity<AuthenticationResponse> CoordenadorExtensaoRegister(
      @RequestBody RegisterRequest request
  ) {
    return ResponseEntity.ok(service.registerCoordenadorExtensao(request));
  }
  
  @PostMapping("/register/coordenadorPesquisa")
  public ResponseEntity<AuthenticationResponse> CoordenadorPesquisaRegister(
      @RequestBody RegisterRequest request
  ) {
    return ResponseEntity.ok(service.registerCoordenadorPesquisa(request));
  }
  
  @PostMapping("/register/coordenadorInovacao")
  public ResponseEntity<AuthenticationResponse> CoordenadorInovacaoRegister(
      @RequestBody RegisterRequest request
  ) {
    return ResponseEntity.ok(service.registerCoordenadorInovacao(request));
  }
}
  