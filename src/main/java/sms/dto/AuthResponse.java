package sms.dto;

public record AuthResponse (
        String token,
        String tokenType
){}
