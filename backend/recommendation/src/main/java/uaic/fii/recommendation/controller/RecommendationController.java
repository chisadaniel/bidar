package uaic.fii.recommendation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uaic.fii.recommendation.model.ResourceDto;

import java.util.List;

@RestController
public class RecommandationController {

    @GetMapping("/recommandation")
    @Operation(description = "This will return all the resources for the given request")
    @Parameter(in = ParameterIn.HEADER,
            description = "The Authorization header is mandatory and its valid must be provide JWT token in the form: Authorization: Bearer + <token>",
            name = "Authorization",
            required = true,
            content = @Content(schema = @Schema(type = "string")))
    public List<ResourceDto>
}
