/**
 * MCP Server function for Sets up a method's integration.
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

class Put_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getPut_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("uri")) {
            queryParams.add("uri=" + args.get("uri"));
        }
        if (args.containsKey("credentials")) {
            queryParams.add("credentials=" + args.get("credentials"));
        }
        if (args.containsKey("type")) {
            queryParams.add("type=" + args.get("type"));
        }
        if (args.containsKey("connectionType")) {
            queryParams.add("connectionType=" + args.get("connectionType"));
        }
        if (args.containsKey("contentHandling")) {
            queryParams.add("contentHandling=" + args.get("contentHandling"));
        }
        if (args.containsKey("cacheNamespace")) {
            queryParams.add("cacheNamespace=" + args.get("cacheNamespace"));
        }
        if (args.containsKey("httpMethod")) {
            queryParams.add("httpMethod=" + args.get("httpMethod"));
        }
        if (args.containsKey("passthroughBehavior")) {
            queryParams.add("passthroughBehavior=" + args.get("passthroughBehavior"));
        }
        if (args.containsKey("connectionId")) {
            queryParams.add("connectionId=" + args.get("connectionId"));
        }
        if (args.containsKey("timeoutInMillis")) {
            queryParams.add("timeoutInMillis=" + args.get("timeoutInMillis"));
        }
        if (args.containsKey("tlsConfig")) {
            queryParams.add("tlsConfig=" + args.get("tlsConfig"));
        }
        if (args.containsKey("requestParameters")) {
            queryParams.add("requestParameters=" + args.get("requestParameters"));
        }
        if (args.containsKey("requestTemplates")) {
            queryParams.add("requestTemplates=" + args.get("requestTemplates"));
        }
        if (args.containsKey("cacheKeyParameters")) {
            queryParams.add("cacheKeyParameters=" + args.get("cacheKeyParameters"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/put_restapis_restapi_id_resources_resource_id_methods_http_method_integration" + queryString;
                
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
    
    public static MCPServer.Tool createPut_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationTool(MCPServer.APIConfig config) {
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
        resource_idProperty.put("description", "Specifies a put integration request's resource ID.");
        properties.put("resource_id", resource_idProperty);
        Map<String, Object> http_methodProperty = new HashMap<>();
        http_methodProperty.put("type", "string");
        http_methodProperty.put("required", true);
        http_methodProperty.put("description", "Specifies the HTTP method for the integration.");
        properties.put("http_method", http_methodProperty);
        Map<String, Object> uriProperty = new HashMap<>();
        uriProperty.put("type", "string");
        uriProperty.put("required", false);
        uriProperty.put("description", "Input parameter: Specifies Uniform Resource Identifier (URI) of the integration endpoint. For HTTP or <code>HTTP_PROXY</code> integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where <code>connectionType</code> is not <code>VPC_LINK</code>, or private integration, where <code>connectionType</code> is <code>VPC_LINK</code>. For a private HTTP integration, the URI is not used for routing. For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the URI is of the form <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api</code>}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated Amazon Web Services service (e.g., s3); and {subdomain} is a designated subdomain supported by certain Amazon Web Services service for fast host-name lookup. action can be used for an Amazon Web Services service action-based API, using an Action={name}&amp;{p1}={v1}&amp;p2={v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an Amazon Web Services service path-based API. The ensuing service_api refers to the path to an Amazon Web Services service resource, including the region of the integrated Amazon Web Services service, if applicable. For example, for integration with the S3 API of <code>GetObject</code>, the <code>uri</code> can be either <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code> or <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>.");
        properties.put("uri", uriProperty);
        Map<String, Object> credentialsProperty = new HashMap<>();
        credentialsProperty.put("type", "string");
        credentialsProperty.put("required", false);
        credentialsProperty.put("description", "Input parameter: Specifies whether credentials are required for a put integration.");
        properties.put("credentials", credentialsProperty);
        Map<String, Object> typeProperty = new HashMap<>();
        typeProperty.put("type", "string");
        typeProperty.put("required", true);
        typeProperty.put("description", "Input parameter: The integration type. The valid value is <code>HTTP</code> for integrating an API method with an HTTP backend; <code>AWS</code> with any AWS service endpoints; <code>MOCK</code> for testing without actually invoking the backend; <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration; <code>AWS_PROXY</code> for integrating with the Lambda proxy integration.");
        properties.put("type", typeProperty);
        Map<String, Object> connectionTypeProperty = new HashMap<>();
        connectionTypeProperty.put("type", "string");
        connectionTypeProperty.put("required", false);
        connectionTypeProperty.put("description", "Input parameter: The type of the network connection to the integration endpoint. The valid value is <code>INTERNET</code> for connections through the public routable internet or <code>VPC_LINK</code> for private connections between API Gateway and a network load balancer in a VPC. The default value is <code>INTERNET</code>.");
        properties.put("connectionType", connectionTypeProperty);
        Map<String, Object> contentHandlingProperty = new HashMap<>();
        contentHandlingProperty.put("type", "string");
        contentHandlingProperty.put("required", false);
        contentHandlingProperty.put("description", "Input parameter: <p>Specifies how to handle request payload content type conversions. Supported values are <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p> <p>If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the <code>passthroughBehavior</code> is configured to support payload pass-through.</p>");
        properties.put("contentHandling", contentHandlingProperty);
        Map<String, Object> cacheNamespaceProperty = new HashMap<>();
        cacheNamespaceProperty.put("type", "string");
        cacheNamespaceProperty.put("required", false);
        cacheNamespaceProperty.put("description", "Input parameter: Specifies a group of related cached parameters. By default, API Gateway uses the resource ID as the <code>cacheNamespace</code>. You can specify the same <code>cacheNamespace</code> across resources to return the same cached data for requests to different resources.");
        properties.put("cacheNamespace", cacheNamespaceProperty);
        Map<String, Object> httpMethodProperty = new HashMap<>();
        httpMethodProperty.put("type", "string");
        httpMethodProperty.put("required", false);
        httpMethodProperty.put("description", "Input parameter: The HTTP method for the integration.");
        properties.put("httpMethod", httpMethodProperty);
        Map<String, Object> passthroughBehaviorProperty = new HashMap<>();
        passthroughBehaviorProperty.put("type", "string");
        passthroughBehaviorProperty.put("required", false);
        passthroughBehaviorProperty.put("description", "Input parameter: Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the <code>requestTemplates</code> property on the Integration resource. There are three valid values: <code>WHEN_NO_MATCH</code>, <code>WHEN_NO_TEMPLATES</code>, and <code>NEVER</code>.");
        properties.put("passthroughBehavior", passthroughBehaviorProperty);
        Map<String, Object> connectionIdProperty = new HashMap<>();
        connectionIdProperty.put("type", "string");
        connectionIdProperty.put("required", false);
        connectionIdProperty.put("description", "Input parameter: The ID of the VpcLink used for the integration. Specify this value only if you specify <code>VPC_LINK</code> as the connection type.");
        properties.put("connectionId", connectionIdProperty);
        Map<String, Object> timeoutInMillisProperty = new HashMap<>();
        timeoutInMillisProperty.put("type", "string");
        timeoutInMillisProperty.put("required", false);
        timeoutInMillisProperty.put("description", "Input parameter: Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.");
        properties.put("timeoutInMillis", timeoutInMillisProperty);
        Map<String, Object> tlsConfigProperty = new HashMap<>();
        tlsConfigProperty.put("type", "string");
        tlsConfigProperty.put("required", false);
        tlsConfigProperty.put("description", "Input parameter: Specifies the TLS configuration for an integration.");
        properties.put("tlsConfig", tlsConfigProperty);
        Map<String, Object> requestParametersProperty = new HashMap<>();
        requestParametersProperty.put("type", "string");
        requestParametersProperty.put("required", false);
        requestParametersProperty.put("description", "Input parameter: A key-value map specifying request parameters that are passed from the method request to the back end. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the back end. The method request parameter value must match the pattern of <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and <code>name</code> must be a valid and unique method request parameter name.");
        properties.put("requestParameters", requestParametersProperty);
        Map<String, Object> requestTemplatesProperty = new HashMap<>();
        requestTemplatesProperty.put("type", "string");
        requestTemplatesProperty.put("required", false);
        requestTemplatesProperty.put("description", "Input parameter: Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value.");
        properties.put("requestTemplates", requestTemplatesProperty);
        Map<String, Object> cacheKeyParametersProperty = new HashMap<>();
        cacheKeyParametersProperty.put("type", "string");
        cacheKeyParametersProperty.put("required", false);
        cacheKeyParametersProperty.put("description", "Input parameter: A list of request parameters whose values API Gateway caches. To be valid values for <code>cacheKeyParameters</code>, these parameters must also be specified for Method <code>requestParameters</code>.");
        properties.put("cacheKeyParameters", cacheKeyParametersProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "put_restapis_restapi_id_resources_resource_id_methods_http_method_integration",
            "Sets up a method's integration.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getPut_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationHandler(config));
    }
    
}