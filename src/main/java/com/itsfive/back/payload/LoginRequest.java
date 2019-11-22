package com.itsfive.back.payload;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
	@NotBlank
    private String email;

    @NotBlank
    private String password;
    
    public LoginRequest(String email,String password) {
    	this.email = email;
    	this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String usernameOrEmail) {
        this.email = usernameOrEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
