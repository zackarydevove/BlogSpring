package com.server.utils;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    private final String JWT_SECRET = "yourSecretKey"; // This should be in a properties file

    // Generate token for user authentication
    public String generateToken(UserDetails userDetails) {
        // Set claims and other properties and then return a compact serialized JWT
    }

    // Validate the token
    public Boolean validateToken(String token, UserDetails userDetails) {
        // Validate the token here and return the result
    }

    // Extract username from the token
    public String extractUsername(String token) {
        // Extract and return username
    }
	
}
