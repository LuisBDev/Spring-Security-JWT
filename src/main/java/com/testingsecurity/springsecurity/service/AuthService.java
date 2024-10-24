package com.testingsecurity.springsecurity.service;

import com.testingsecurity.springsecurity.dto.AuthResponse;
import com.testingsecurity.springsecurity.dto.LoginRequest;
import com.testingsecurity.springsecurity.dto.RegisterRequest;

public interface AuthService {

     AuthResponse register(RegisterRequest registerRequest);

     AuthResponse login(LoginRequest loginRequest);



}
