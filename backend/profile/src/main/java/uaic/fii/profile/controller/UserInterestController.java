package uaic.fii.profile.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import uaic.fii.profile.model.UserInterestDto;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserInterestController {

    @GetMapping("/profile/interest/{userId}")
    @Operation(description = "This will return all the interest for an user")
    @Parameter(in = ParameterIn.HEADER,
            description = "The Authorization header is mandatory and its valid must be provide JWT token in the form: Authorization: Bearer + <token>",
            name = "Authorization",
            required = true,
            content = @Content(schema = @Schema(type = "string")))
    public List<UserInterestDto> getUserInterests() {
        return new ArrayList<>();
    }

    @PostMapping("/profile/interest/{userId}")
    @Operation(description = "Add an interest for an user")
    @Parameter(in = ParameterIn.HEADER,
            description = "The Authorization header is mandatory and its valid must be provide JWT token in the form: Authorization: Bearer + <token>",
            name = "Authorization",
            required = true,
            content = @Content(schema = @Schema(type = "string")))
    public void addUserInterests() {
    }

    @DeleteMapping("/profile/interest/{userId}")
    @Operation(description = "Deletes an interest assigned to an user")
    @Parameter(in = ParameterIn.HEADER,
            description = "The Authorization header is mandatory and its valid must be provide JWT token in the form: Authorization: Bearer + <token>",
            name = "Authorization",
            required = true,
            content = @Content(schema = @Schema(type = "string")))
    public void deleteUserInterests() {
    }
}
