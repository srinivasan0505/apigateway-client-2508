/**
 * MCP Server function for Simulate the invocation of a Method in your RestApi with headers, parameters, and an incoming request body.
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

class Post_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getPost_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("resource_id")) {
            queryParams.add("resource_id=" + args.get("resource_id"));
        }
        if (args.containsKey("http_method")) {
            queryParams.add("http_method=" + args.get("http_method"));
        }
        if (args.containsKey("body")) {
            queryParams.add("body=" + args.get("body"));
        }
        if (args.containsKey("clientCertificateId")) {
            queryParams.add("clientCertificateId=" + args.get("clientCertificateId"));
        }
        if (args.containsKey("pathWithQueryString")) {
            queryParams.add("pathWithQueryString=" + args.get("pathWithQueryString"));
        }
        if (args.containsKey("headers")) {
            queryParams.add("headers=" + args.get("headers"));
        }
        if (args.containsKey("multiValueHeaders")) {
            queryParams.add("multiValueHeaders=" + args.get("multiValueHeaders"));
        }
        if (args.containsKey("stageVariables")) {
            queryParams.add("stageVariables=" + args.get("stageVariables"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/post_restapis_restapi_id_resources_resource_id_methods_http_method" + queryString;
                
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
    
    public static MCPServer.Tool createPost_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodTool(MCPServer.APIConfig config) {
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
        Map<String, Object> resource_idProperty = new HashMap<>();
        resource_idProperty.put("type", "string");
        resource_idProperty.put("required", true);
        resource_idProperty.put("description", "Specifies a test invoke method request's resource ID.");
        properties.put("resource_id", resource_idProperty);
        Map<String, Object> http_methodProperty = new HashMap<>();
        http_methodProperty.put("type", "string");
        http_methodProperty.put("required", true);
        http_methodProperty.put("description", "Specifies a test invoke method request's HTTP method.");
        properties.put("http_method", http_methodProperty);
        Map<String, Object> bodyProperty = new HashMap<>();
        bodyProperty.put("type", "string");
        bodyProperty.put("required", false);
        bodyProperty.put("description", "Input parameter: The simulated request body of an incoming invocation request.");
        properties.put("body", bodyProperty);
        Map<String, Object> clientCertificateIdProperty = new HashMap<>();
        clientCertificateIdProperty.put("type", "string");
        clientCertificateIdProperty.put("required", false);
        clientCertificateIdProperty.put("description", "Input parameter: A ClientCertificate identifier to use in the test invocation. API Gateway will use the certificate when making the HTTPS request to the defined back-end endpoint.");
        properties.put("clientCertificateId", clientCertificateIdProperty);
        Map<String, Object> pathWithQueryStringProperty = new HashMap<>();
        pathWithQueryStringProperty.put("type", "string");
        pathWithQueryStringProperty.put("required", false);
        pathWithQueryStringProperty.put("description", "Input parameter: The URI path, including query string, of the simulated invocation request. Use this to specify path parameters and query string parameters.");
        properties.put("pathWithQueryString", pathWithQueryStringProperty);
        Map<String, Object> headersProperty = new HashMap<>();
        headersProperty.put("type", "string");
        headersProperty.put("required", false);
        headersProperty.put("description", "Input parameter: A key-value map of headers to simulate an incoming invocation request.");
        properties.put("headers", headersProperty);
        Map<String, Object> multiValueHeadersProperty = new HashMap<>();
        multiValueHeadersProperty.put("type", "string");
        multiValueHeadersProperty.put("required", false);
        multiValueHeadersProperty.put("description", "Input parameter: The headers as a map from string to list of values to simulate an incoming invocation request.");
        properties.put("multiValueHeaders", multiValueHeadersProperty);
        Map<String, Object> stageVariablesProperty = new HashMap<>();
        stageVariablesProperty.put("type", "string");
        stageVariablesProperty.put("required", false);
        stageVariablesProperty.put("description", "Input parameter: A key-value map of stage variables to simulate an invocation on a deployed Stage.");
        properties.put("stageVariables", stageVariablesProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "post_restapis_restapi_id_resources_resource_id_methods_http_method",
            "Simulate the invocation of a Method in your RestApi with headers, parameters, and an incoming request body.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getPost_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodHandler(config));
    }
    
}