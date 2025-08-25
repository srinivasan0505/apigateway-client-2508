/**
 * MCP Server function for A feature of the API Gateway control service for creating a new API from an external API definition file.
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

class Post_Restapis_Mode_ImportMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getPost_Restapis_Mode_ImportHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("mode")) {
            queryParams.add("mode=" + args.get("mode"));
        }
        if (args.containsKey("body")) {
            queryParams.add("body=" + args.get("body"));
        }
        if (args.containsKey("failonwarnings")) {
            queryParams.add("failonwarnings=" + args.get("failonwarnings"));
        }
        if (args.containsKey("parameters")) {
            queryParams.add("parameters=" + args.get("parameters"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/post_restapis_mode_import" + queryString;
                
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
    
    public static MCPServer.Tool createPost_Restapis_Mode_ImportTool(MCPServer.APIConfig config) {
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
        Map<String, Object> modeProperty = new HashMap<>();
        modeProperty.put("type", "string");
        modeProperty.put("required", true);
        modeProperty.put("description", "");
        properties.put("mode", modeProperty);
        Map<String, Object> bodyProperty = new HashMap<>();
        bodyProperty.put("type", "string");
        bodyProperty.put("required", true);
        bodyProperty.put("description", "Input parameter: The POST request body containing external API definitions. Currently, only OpenAPI definition JSON/YAML files are supported. The maximum size of the API definition file is 6MB.");
        properties.put("body", bodyProperty);
        Map<String, Object> failonwarningsProperty = new HashMap<>();
        failonwarningsProperty.put("type", "string");
        failonwarningsProperty.put("required", false);
        failonwarningsProperty.put("description", "A query parameter to indicate whether to rollback the API creation (<code>true</code>) or not (<code>false</code>) when a warning is encountered. The default value is <code>false</code>.");
        properties.put("failonwarnings", failonwarningsProperty);
        Map<String, Object> parametersProperty = new HashMap<>();
        parametersProperty.put("type", "string");
        parametersProperty.put("required", false);
        parametersProperty.put("description", "<p>A key-value map of context-specific query string parameters specifying the behavior of different API importing operations. The following shows operation-specific parameters and their supported values.</p> <p> To exclude DocumentationParts from the import, set <code>parameters</code> as <code>ignore=documentation</code>.</p> <p> To configure the endpoint type, set <code>parameters</code> as <code>endpointConfigurationTypes=EDGE</code>, <code>endpointConfigurationTypes=REGIONAL</code>, or <code>endpointConfigurationTypes=PRIVATE</code>. The default endpoint type is <code>EDGE</code>.</p> <p> To handle imported <code>basepath</code>, set <code>parameters</code> as <code>basepath=ignore</code>, <code>basepath=prepend</code> or <code>basepath=split</code>.</p> <p>For example, the AWS CLI command to exclude documentation from the imported API is:</p> <p>The AWS CLI command to set the regional endpoint on the imported API is:</p>");
        properties.put("parameters", parametersProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "post_restapis_mode_import",
            "A feature of the API Gateway control service for creating a new API from an external API definition file.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getPost_Restapis_Mode_ImportHandler(config));
    }
    
}