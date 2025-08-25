/**
 * MCP Server function for Creates a new RestApi resource.
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

class Post_RestapisMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getPost_RestapisHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("description")) {
            queryParams.add("description=" + args.get("description"));
        }
        if (args.containsKey("policy")) {
            queryParams.add("policy=" + args.get("policy"));
        }
        if (args.containsKey("name")) {
            queryParams.add("name=" + args.get("name"));
        }
        if (args.containsKey("cloneFrom")) {
            queryParams.add("cloneFrom=" + args.get("cloneFrom"));
        }
        if (args.containsKey("version")) {
            queryParams.add("version=" + args.get("version"));
        }
        if (args.containsKey("apiKeySource")) {
            queryParams.add("apiKeySource=" + args.get("apiKeySource"));
        }
        if (args.containsKey("minimumCompressionSize")) {
            queryParams.add("minimumCompressionSize=" + args.get("minimumCompressionSize"));
        }
        if (args.containsKey("disableExecuteApiEndpoint")) {
            queryParams.add("disableExecuteApiEndpoint=" + args.get("disableExecuteApiEndpoint"));
        }
        if (args.containsKey("endpointConfiguration")) {
            queryParams.add("endpointConfiguration=" + args.get("endpointConfiguration"));
        }
        if (args.containsKey("tags")) {
            queryParams.add("tags=" + args.get("tags"));
        }
        if (args.containsKey("binaryMediaTypes")) {
            queryParams.add("binaryMediaTypes=" + args.get("binaryMediaTypes"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/post_restapis" + queryString;
                
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
    
    public static MCPServer.Tool createPost_RestapisTool(MCPServer.APIConfig config) {
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
        Map<String, Object> descriptionProperty = new HashMap<>();
        descriptionProperty.put("type", "string");
        descriptionProperty.put("required", false);
        descriptionProperty.put("description", "Input parameter: The description of the RestApi.");
        properties.put("description", descriptionProperty);
        Map<String, Object> policyProperty = new HashMap<>();
        policyProperty.put("type", "string");
        policyProperty.put("required", false);
        policyProperty.put("description", "Input parameter: A stringified JSON policy document that applies to this RestApi regardless of the caller and Method configuration.");
        properties.put("policy", policyProperty);
        Map<String, Object> nameProperty = new HashMap<>();
        nameProperty.put("type", "string");
        nameProperty.put("required", true);
        nameProperty.put("description", "Input parameter: The name of the RestApi.");
        properties.put("name", nameProperty);
        Map<String, Object> cloneFromProperty = new HashMap<>();
        cloneFromProperty.put("type", "string");
        cloneFromProperty.put("required", false);
        cloneFromProperty.put("description", "Input parameter: The ID of the RestApi that you want to clone from.");
        properties.put("cloneFrom", cloneFromProperty);
        Map<String, Object> versionProperty = new HashMap<>();
        versionProperty.put("type", "string");
        versionProperty.put("required", false);
        versionProperty.put("description", "Input parameter: A version identifier for the API.");
        properties.put("version", versionProperty);
        Map<String, Object> apiKeySourceProperty = new HashMap<>();
        apiKeySourceProperty.put("type", "string");
        apiKeySourceProperty.put("required", false);
        apiKeySourceProperty.put("description", "Input parameter: The source of the API key for metering requests according to a usage plan. Valid values are: &gt;<code>HEADER</code> to read the API key from the <code>X-API-Key</code> header of a request. <code>AUTHORIZER</code> to read the API key from the <code>UsageIdentifierKey</code> from a custom authorizer.");
        properties.put("apiKeySource", apiKeySourceProperty);
        Map<String, Object> minimumCompressionSizeProperty = new HashMap<>();
        minimumCompressionSizeProperty.put("type", "string");
        minimumCompressionSizeProperty.put("required", false);
        minimumCompressionSizeProperty.put("description", "Input parameter: A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero allows compression for any payload size.");
        properties.put("minimumCompressionSize", minimumCompressionSizeProperty);
        Map<String, Object> disableExecuteApiEndpointProperty = new HashMap<>();
        disableExecuteApiEndpointProperty.put("type", "string");
        disableExecuteApiEndpointProperty.put("required", false);
        disableExecuteApiEndpointProperty.put("description", "Input parameter: Specifies whether clients can invoke your API by using the default <code>execute-api</code> endpoint. By default, clients can invoke your API with the default <code>https://{api_id}.execute-api.{region}.amazonaws.com</code> endpoint. To require that clients use a custom domain name to invoke your API, disable the default endpoint");
        properties.put("disableExecuteApiEndpoint", disableExecuteApiEndpointProperty);
        Map<String, Object> endpointConfigurationProperty = new HashMap<>();
        endpointConfigurationProperty.put("type", "string");
        endpointConfigurationProperty.put("required", false);
        endpointConfigurationProperty.put("description", "Input parameter: The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom domain name (DomainName) has.");
        properties.put("endpointConfiguration", endpointConfigurationProperty);
        Map<String, Object> tagsProperty = new HashMap<>();
        tagsProperty.put("type", "string");
        tagsProperty.put("required", false);
        tagsProperty.put("description", "Input parameter: The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.");
        properties.put("tags", tagsProperty);
        Map<String, Object> binaryMediaTypesProperty = new HashMap<>();
        binaryMediaTypesProperty.put("type", "string");
        binaryMediaTypesProperty.put("required", false);
        binaryMediaTypesProperty.put("description", "Input parameter: The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.");
        properties.put("binaryMediaTypes", binaryMediaTypesProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "post_restapis",
            "Creates a new RestApi resource.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getPost_RestapisHandler(config));
    }
    
}