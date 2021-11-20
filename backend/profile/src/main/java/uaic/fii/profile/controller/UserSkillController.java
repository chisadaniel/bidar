package uaic.fii.profile.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.*;
import uaic.fii.profile.model.UserProfileDto;
import uaic.fii.profile.model.UserSkillDto;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserSkillController {

    @GetMapping("/profile/skill/{userId}")
    @Operation(description = "This will return all the skills for an user")
    @Parameter(in = ParameterIn.HEADER,
            description = "The Authorization header is mandatory and its valid must be provide JWT token in the form: Authorization: Bearer + <token>",
            name = "Authorization",
            required = true,
            content = @Content(schema = @Schema(type = "string")))
    public List<UserSkillDto> getUserSkills() {
        return new ArrayList<>();
    }

    @PostMapping("/profile/skill/{userId}")
    @Operation(description = "Add a skill for the user")
    @Parameter(in = ParameterIn.HEADER,
            description = "The Authorization header is mandatory and its valid must be provide JWT token in the form: Authorization: Bearer + <token>",
            name = "Authorization",
            required = true,
            content = @Content(schema = @Schema(type = "string")))
    public void addUserSkills(@RequestBody UserSkillDto userSkillDto) {
    }

    @DeleteMapping("/profile/skill/{userId}")
    @Operation(description = "Deletes a skill assigned to an user")
    @Parameter(in = ParameterIn.HEADER,
            description = "The Authorization header is mandatory and its valid must be provide JWT token in the form: Authorization: Bearer + <token>",
            name = "Authorization",
            required = true,
            content = @Content(schema = @Schema(type = "string")))
    public void deleteUserSkills(@RequestBody UserSkillDto userSkillDto) {
    }
}
