/**
 * MCP Server function for Creates a new BasePathMapping resource.
 */

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.function.Function;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

class Post_Domainnames_Domain_Name_BasepathmappingsMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getPost_Domainnames_Domain_Name_BasepathmappingsHandler(MCPServer.APIConfig config) {
        return (request) -> {
            try {
                Map<String, Object> args = request.getArguments();
                if (args == null) {
                    return new MCPServer.MCPToolResult("Invalid arguments object", true);
                }
                
                List<String> queryParams = new ArrayList<>();
        if (args.containsKey("X-Amz-Content-Sha256")) {
            queryParams.add("X-Amz-Content-Sha256=" + args.get("X-Amz-Content-Sha256"));
        }
        if (args.containsKey("X-Amz-Date")) {
            queryParams.add("X-Amz-Date=" + args.get("X-Amz-Date"));
        }
        if (args.containsKey("X-Amz-Algorithm")) {
            queryParams.add("X-Amz-Algorithm=" + args.get("X-Amz-Algorithm"));
        }
        if (args.containsKey("X-Amz-Credential")) {
            queryParams.add("X-Amz-Credential=" + args.get("X-Amz-Credential"));
        }
        if (args.containsKey("X-Amz-Security-Token")) {
            queryParams.add("X-Amz-Security-Token=" + args.get("X-Amz-Security-Token"));
        }
        if (args.containsKey("X-Amz-Signature")) {
            queryParams.add("X-Amz-Signature=" + args.get("X-Amz-Signature"));
        }
        if (args.containsKey("X-Amz-SignedHeaders")) {
            queryParams.add("X-Amz-SignedHeaders=" + args.get("X-Amz-SignedHeaders"));
        }
        if (args.containsKey("domain_name")) {
            queryParams.add("domain_name=" + args.get("domain_name"));
        }
        if (args.containsKey("basePath")) {
            queryParams.add("basePath=" + args.get("basePath"));
        }
        if (args.containsKey("restApiId")) {
            queryParams.add("restApiId=" + args.get("restApiId"));
        }
        if (args.containsKey("stage")) {
            queryParams.add("stage=" + args.get("stage"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/post_domainnames_domain_name_basepathmappings" + queryString;
                
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Authorization", "Bearer " + config.getApiKey())
                    .header("Accept", "application/json")
                    .GET()
                    .build();
                
                HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                
                if (response.statusCode() >= 400) {
                    return new MCPServer.MCPToolResult("API error: " + response.body(), true);
                }
                
                // Pretty print JSON
                ObjectMapper mapper = new ObjectMapper();
                JsonNode jsonNode = mapper.readTree(response.body());
                String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
                
                return new MCPServer.MCPToolResult(prettyJson);
                
            } catch (IOException | InterruptedException e) {
                return new MCPServer.MCPToolResult("Request failed: " + e.getMessage(), true);
            } catch (Exception e) {
                return new MCPServer.MCPToolResult("Unexpected error: " + e.getMessage(), true);
            }
        };
    }
    
    public static MCPServer.Tool createPost_Domainnames_Domain_Name_BasepathmappingsTool(MCPServer.APIConfig config) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("type", "object");
        Map<String, Object> properties = new HashMap<>();
        Map<String, Object> X-Amz-Content-Sha256Property = new HashMap<>();
        X-Amz-Content-Sha256Property.put("type", "string");
        X-Amz-Content-Sha256Property.put("required", false);
        X-Amz-Content-Sha256Property.put("description", "");
        properties.put("X-Amz-Content-Sha256", X-Amz-Content-Sha256Property);
        Map<String, Object> X-Amz-DateProperty = new HashMap<>();
        X-Amz-DateProperty.put("type", "string");
        X-Amz-DateProperty.put("required", false);
        X-Amz-DateProperty.put("description", "");
        properties.put("X-Amz-Date", X-Amz-DateProperty);
        Map<String, Object> X-Amz-AlgorithmProperty = new HashMap<>();
        X-Amz-AlgorithmProperty.put("type", "string");
        X-Amz-AlgorithmProperty.put("required", false);
        X-Amz-AlgorithmProperty.put("description", "");
        properties.put("X-Amz-Algorithm", X-Amz-AlgorithmProperty);
        Map<String, Object> X-Amz-CredentialProperty = new HashMap<>();
        X-Amz-CredentialProperty.put("type", "string");
        X-Amz-CredentialProperty.put("required", false);
        X-Amz-CredentialProperty.put("description", "");
        properties.put("X-Amz-Credential", X-Amz-CredentialProperty);
        Map<String, Object> X-Amz-Security-TokenProperty = new HashMap<>();
        X-Amz-Security-TokenProperty.put("type", "string");
        X-Amz-Security-TokenProperty.put("required", false);
        X-Amz-Security-TokenProperty.put("description", "");
        properties.put("X-Amz-Security-Token", X-Amz-Security-TokenProperty);
        Map<String, Object> X-Amz-SignatureProperty = new HashMap<>();
        X-Amz-SignatureProperty.put("type", "string");
        X-Amz-SignatureProperty.put("required", false);
        X-Amz-SignatureProperty.put("description", "");
        properties.put("X-Amz-Signature", X-Amz-SignatureProperty);
        Map<String, Object> X-Amz-SignedHeadersProperty = new HashMap<>();
        X-Amz-SignedHeadersProperty.put("type", "string");
        X-Amz-SignedHeadersProperty.put("required", false);
        X-Amz-SignedHeadersProperty.put("description", "");
        properties.put("X-Amz-SignedHeaders", X-Amz-SignedHeadersProperty);
        Map<String, Object> domain_nameProperty = new HashMap<>();
        domain_nameProperty.put("type", "string");
        domain_nameProperty.put("required", true);
        domain_nameProperty.put("description", "The domain name of the BasePathMapping resource to create.");
        properties.put("domain_name", domain_nameProperty);
        Map<String, Object> basePathProperty = new HashMap<>();
        basePathProperty.put("type", "string");
        basePathProperty.put("required", false);
        basePathProperty.put("description", "Input parameter: The base path name that callers of the API must provide as part of the URL after the domain name. This value must be unique for all of the mappings across a single API. Specify '(none)' if you do not want callers to specify a base path name after the domain name.");
        properties.put("basePath", basePathProperty);
        Map<String, Object> restApiIdProperty = new HashMap<>();
        restApiIdProperty.put("type", "string");
        restApiIdProperty.put("required", true);
        restApiIdProperty.put("description", "Input parameter: The string identifier of the associated RestApi.");
        properties.put("restApiId", restApiIdProperty);
        Map<String, Object> stageProperty = new HashMap<>();
        stageProperty.put("type", "string");
        stageProperty.put("required", false);
        stageProperty.put("description", "Input parameter: The name of the API's stage that you want to use for this mapping. Specify '(none)' if you want callers to explicitly specify the stage name after any base path name.");
        properties.put("stage", stageProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "post_domainnames_domain_name_basepathmappings",
            "Creates a new BasePathMapping resource.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getPost_Domainnames_Domain_Name_BasepathmappingsHandler(config));
    }
    
}