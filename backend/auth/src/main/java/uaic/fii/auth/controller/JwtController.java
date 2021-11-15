package uaic.fii.auth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import uaic.fii.auth.model.UserCredentials;

@RestController
public class JwtController {

    @PostMapping(value = "/auth", produces = "text/plain")
    @ResponseStatus(code = HttpStatus.OK)
    public String getJwtToken(@RequestBody UserCredentials userCredentials) {
        return "";
    }
}

