package uaic.fii.main.model;

import lombok.Data;
import org.apache.jena.rdf.model.Resource;

import java.util.Map;

@Data
public class ResourceDto {
    private String category;
    private Resource resourceUrl;
    private Map<String, String> resourceMetaData;
}
