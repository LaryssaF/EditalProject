package com.example.EditalProject.services;

import com.example.EditalProject.Entity.User;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.EditalProject.Auth.AuthenticationRequest;
import com.example.EditalProject.Auth.AuthenticationResponse;
import com.example.EditalProject.Auth.RegisterRequest;
import com.example.EditalProject.Entity.Role;
import com.example.EditalProject.Repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
	
	private final UserRepository repository;
	private final PasswordEncoder passwordEncoder;
	private final JwtService jwtService;
	private final AuthenticationManager authenticationManager;
	
	public AuthenticationResponse register(RegisterRequest request) {
		var user = User.builder()
				.name(request.getName())
				.email(request.getEmail())
				.password(passwordEncoder.encode(request.getPassword()))
				.role(Role.USER)
				.build();
		repository.save(user);
		var jwtToken = jwtService.generateToken(user);
		return AuthenticationResponse.builder().token(jwtToken).build();
				
	}

	public AuthenticationResponse authenticate(AuthenticationRequest request) {
		authenticationManager.authenticate(
			new UsernamePasswordAuthenticationToken(
					request.getEmail(),
					request.getPassword()
					)	
		);
		var user = repository.findByEmail(request.getEmail())
				.orElseThrow();
		var jwtToken = jwtService.generateToken(user);
		return AuthenticationResponse.builder()
				.token(jwtToken)
				.build();
	}
	
	public AuthenticationResponse registerCoordenadorPesquisa(RegisterRequest request) {
		var user = User.builder()
		.name(request.getName())
		.email(request.getEmail())
		.password(passwordEncoder.encode(request.getPassword()))
		.role(Role.COORDENADORPESQUISA)
		.build();
		repository.save(user);
		var jwtToken = jwtService.generateToken(user);
		return AuthenticationResponse.builder()
		.token(jwtToken)
		.build();
		}
	
	public AuthenticationResponse registerCoordenadorExtensao(RegisterRequest request) {
		var user = User.builder()
		.name(request.getName())
		.email(request.getEmail())
		.password(passwordEncoder.encode(request.getPassword()))
		.role(Role.COORDENADOREXTENSAO)
		.build();
		repository.save(user);
		var jwtToken = jwtService.generateToken(user);
		return AuthenticationResponse.builder()
		.token(jwtToken)
		.build();
		}
	
	public AuthenticationResponse registerCoordenadorInovacao(RegisterRequest request) {
		var user = User.builder()
		.name(request.getName())
		.email(request.getEmail())
		.password(passwordEncoder.encode(request.getPassword()))
		.role(Role.COORDENADORINOVACAO)
		.build();
		repository.save(user);
		var jwtToken = jwtService.generateToken(user);
		return AuthenticationResponse.builder()
		.token(jwtToken)
		.build();
		}

}
