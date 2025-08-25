/**
 * MCP Server function for Add a method to an existing Resource resource.
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

class Put_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getPut_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("requestValidatorId")) {
            queryParams.add("requestValidatorId=" + args.get("requestValidatorId"));
        }
        if (args.containsKey("authorizationType")) {
            queryParams.add("authorizationType=" + args.get("authorizationType"));
        }
        if (args.containsKey("authorizerId")) {
            queryParams.add("authorizerId=" + args.get("authorizerId"));
        }
        if (args.containsKey("operationName")) {
            queryParams.add("operationName=" + args.get("operationName"));
        }
        if (args.containsKey("apiKeyRequired")) {
            queryParams.add("apiKeyRequired=" + args.get("apiKeyRequired"));
        }
        if (args.containsKey("requestModels")) {
            queryParams.add("requestModels=" + args.get("requestModels"));
        }
        if (args.containsKey("requestParameters")) {
            queryParams.add("requestParameters=" + args.get("requestParameters"));
        }
        if (args.containsKey("authorizationScopes")) {
            queryParams.add("authorizationScopes=" + args.get("authorizationScopes"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/put_restapis_restapi_id_resources_resource_id_methods_http_method" + queryString;
                
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
    
    public static MCPServer.Tool createPut_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodTool(MCPServer.APIConfig config) {
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
        resource_idProperty.put("description", "The Resource identifier for the new Method resource.");
        properties.put("resource_id", resource_idProperty);
        Map<String, Object> http_methodProperty = new HashMap<>();
        http_methodProperty.put("type", "string");
        http_methodProperty.put("required", true);
        http_methodProperty.put("description", "Specifies the method request's HTTP method type.");
        properties.put("http_method", http_methodProperty);
        Map<String, Object> requestValidatorIdProperty = new HashMap<>();
        requestValidatorIdProperty.put("type", "string");
        requestValidatorIdProperty.put("required", false);
        requestValidatorIdProperty.put("description", "Input parameter: The identifier of a RequestValidator for validating the method request.");
        properties.put("requestValidatorId", requestValidatorIdProperty);
        Map<String, Object> authorizationTypeProperty = new HashMap<>();
        authorizationTypeProperty.put("type", "string");
        authorizationTypeProperty.put("required", true);
        authorizationTypeProperty.put("description", "Input parameter: The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code> for using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or <code>COGNITO_USER_POOLS</code> for using a Cognito user pool.");
        properties.put("authorizationType", authorizationTypeProperty);
        Map<String, Object> authorizerIdProperty = new HashMap<>();
        authorizerIdProperty.put("type", "string");
        authorizerIdProperty.put("required", false);
        authorizerIdProperty.put("description", "Input parameter: Specifies the identifier of an Authorizer to use on this Method, if the type is CUSTOM or COGNITO_USER_POOLS. The authorizer identifier is generated by API Gateway when you created the authorizer.");
        properties.put("authorizerId", authorizerIdProperty);
        Map<String, Object> operationNameProperty = new HashMap<>();
        operationNameProperty.put("type", "string");
        operationNameProperty.put("required", false);
        operationNameProperty.put("description", "Input parameter: A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code> of <code>ListPets</code> for the <code>GET /pets</code> method in the <code>PetStore</code> example.");
        properties.put("operationName", operationNameProperty);
        Map<String, Object> apiKeyRequiredProperty = new HashMap<>();
        apiKeyRequiredProperty.put("type", "string");
        apiKeyRequiredProperty.put("required", false);
        apiKeyRequiredProperty.put("description", "Input parameter: Specifies whether the method required a valid ApiKey.");
        properties.put("apiKeyRequired", apiKeyRequiredProperty);
        Map<String, Object> requestModelsProperty = new HashMap<>();
        requestModelsProperty.put("type", "string");
        requestModelsProperty.put("required", false);
        requestModelsProperty.put("description", "Input parameter: Specifies the Model resources used for the request's content type. Request models are represented as a key/value map, with a content type as the key and a Model name as the value.");
        properties.put("requestModels", requestModelsProperty);
        Map<String, Object> requestParametersProperty = new HashMap<>();
        requestParametersProperty.put("type", "string");
        requestParametersProperty.put("required", false);
        requestParametersProperty.put("description", "Input parameter: A key-value map defining required or optional method request parameters that can be accepted by API Gateway. A key defines a method request parameter name matching the pattern of <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The value associated with the key is a Boolean flag indicating whether the parameter is required (<code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are available in Integration to be mapped to integration request parameters or body-mapping templates.");
        properties.put("requestParameters", requestParametersProperty);
        Map<String, Object> authorizationScopesProperty = new HashMap<>();
        authorizationScopesProperty.put("type", "string");
        authorizationScopesProperty.put("required", false);
        authorizationScopesProperty.put("description", "Input parameter: A list of authorization scopes configured on the method. The scopes are used with a <code>COGNITO_USER_POOLS</code> authorizer to authorize the method invocation. The authorization works by matching the method scopes against the scopes parsed from the access token in the incoming request. The method invocation is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the invocation is not authorized. When the method scope is configured, the client must provide an access token instead of an identity token for authorization purposes.");
        properties.put("authorizationScopes", authorizationScopesProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "put_restapis_restapi_id_resources_resource_id_methods_http_method",
            "Add a method to an existing Resource resource.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getPut_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodHandler(config));
    }
    
}