package sms.controller;


import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/profile")
    public Map<String, String> profile(
            Authentication authentication
    ) {
        return Map.of(
                "message", "Authenticated successfully",
                "username", authentication.getName()
        );
    }
}
