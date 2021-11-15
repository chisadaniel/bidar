package uaic.fii.main.model;

import lombok.Data;

import java.util.Map;

@Data
public class ResourceDiffDto {
    private Map<String, String> diffMetadata;
}
