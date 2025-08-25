/**
 * MCP Server function for Creates a Deployment resource, which makes a specified RestApi callable over the internet.
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

class Post_Restapis_Restapi_Id_DeploymentsMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getPost_Restapis_Restapi_Id_DeploymentsHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("restapi_id")) {
            queryParams.add("restapi_id=" + args.get("restapi_id"));
        }
        if (args.containsKey("stageDescription")) {
            queryParams.add("stageDescription=" + args.get("stageDescription"));
        }
        if (args.containsKey("stageName")) {
            queryParams.add("stageName=" + args.get("stageName"));
        }
        if (args.containsKey("description")) {
            queryParams.add("description=" + args.get("description"));
        }
        if (args.containsKey("tracingEnabled")) {
            queryParams.add("tracingEnabled=" + args.get("tracingEnabled"));
        }
        if (args.containsKey("cacheClusterEnabled")) {
            queryParams.add("cacheClusterEnabled=" + args.get("cacheClusterEnabled"));
        }
        if (args.containsKey("variables")) {
            queryParams.add("variables=" + args.get("variables"));
        }
        if (args.containsKey("canarySettings")) {
            queryParams.add("canarySettings=" + args.get("canarySettings"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/post_restapis_restapi_id_deployments" + queryString;
                
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
    
    public static MCPServer.Tool createPost_Restapis_Restapi_Id_DeploymentsTool(MCPServer.APIConfig config) {
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
        Map<String, Object> restapi_idProperty = new HashMap<>();
        restapi_idProperty.put("type", "string");
        restapi_idProperty.put("required", true);
        restapi_idProperty.put("description", "The string identifier of the associated RestApi.");
        properties.put("restapi_id", restapi_idProperty);
        Map<String, Object> stageDescriptionProperty = new HashMap<>();
        stageDescriptionProperty.put("type", "string");
        stageDescriptionProperty.put("required", false);
        stageDescriptionProperty.put("description", "Input parameter: The description of the Stage resource for the Deployment resource to create.");
        properties.put("stageDescription", stageDescriptionProperty);
        Map<String, Object> stageNameProperty = new HashMap<>();
        stageNameProperty.put("type", "string");
        stageNameProperty.put("required", false);
        stageNameProperty.put("description", "Input parameter: The name of the Stage resource for the Deployment resource to create.");
        properties.put("stageName", stageNameProperty);
        Map<String, Object> descriptionProperty = new HashMap<>();
        descriptionProperty.put("type", "string");
        descriptionProperty.put("required", false);
        descriptionProperty.put("description", "Input parameter: The description for the Deployment resource to create.");
        properties.put("description", descriptionProperty);
        Map<String, Object> tracingEnabledProperty = new HashMap<>();
        tracingEnabledProperty.put("type", "string");
        tracingEnabledProperty.put("required", false);
        tracingEnabledProperty.put("description", "Input parameter: Specifies whether active tracing with X-ray is enabled for the Stage.");
        properties.put("tracingEnabled", tracingEnabledProperty);
        Map<String, Object> cacheClusterEnabledProperty = new HashMap<>();
        cacheClusterEnabledProperty.put("type", "string");
        cacheClusterEnabledProperty.put("required", false);
        cacheClusterEnabledProperty.put("description", "Input parameter: Enables a cache cluster for the Stage resource specified in the input.");
        properties.put("cacheClusterEnabled", cacheClusterEnabledProperty);
        Map<String, Object> variablesProperty = new HashMap<>();
        variablesProperty.put("type", "string");
        variablesProperty.put("required", false);
        variablesProperty.put("description", "Input parameter: A map that defines the stage variables for the Stage resource that is associated with the new deployment. Variable names can have alphanumeric and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.");
        properties.put("variables", variablesProperty);
        Map<String, Object> canarySettingsProperty = new HashMap<>();
        canarySettingsProperty.put("type", "string");
        canarySettingsProperty.put("required", false);
        canarySettingsProperty.put("description", "Input parameter: The input configuration for a canary deployment.");
        properties.put("canarySettings", canarySettingsProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "post_restapis_restapi_id_deployments",
            "Creates a Deployment resource, which makes a specified RestApi callable over the internet.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getPost_Restapis_Restapi_Id_DeploymentsHandler(config));
    }
    
}