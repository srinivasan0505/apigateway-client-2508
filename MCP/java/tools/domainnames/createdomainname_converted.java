/**
 * MCP Server function for Creates a new domain name.
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

class Post_DomainnamesMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getPost_DomainnamesHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("regionalCertificateName")) {
            queryParams.add("regionalCertificateName=" + args.get("regionalCertificateName"));
        }
        if (args.containsKey("regionalCertificateArn")) {
            queryParams.add("regionalCertificateArn=" + args.get("regionalCertificateArn"));
        }
        if (args.containsKey("certificatePrivateKey")) {
            queryParams.add("certificatePrivateKey=" + args.get("certificatePrivateKey"));
        }
        if (args.containsKey("ownershipVerificationCertificateArn")) {
            queryParams.add("ownershipVerificationCertificateArn=" + args.get("ownershipVerificationCertificateArn"));
        }
        if (args.containsKey("certificateBody")) {
            queryParams.add("certificateBody=" + args.get("certificateBody"));
        }
        if (args.containsKey("certificateChain")) {
            queryParams.add("certificateChain=" + args.get("certificateChain"));
        }
        if (args.containsKey("certificateName")) {
            queryParams.add("certificateName=" + args.get("certificateName"));
        }
        if (args.containsKey("domainName")) {
            queryParams.add("domainName=" + args.get("domainName"));
        }
        if (args.containsKey("securityPolicy")) {
            queryParams.add("securityPolicy=" + args.get("securityPolicy"));
        }
        if (args.containsKey("certificateArn")) {
            queryParams.add("certificateArn=" + args.get("certificateArn"));
        }
        if (args.containsKey("endpointConfiguration")) {
            queryParams.add("endpointConfiguration=" + args.get("endpointConfiguration"));
        }
        if (args.containsKey("tags")) {
            queryParams.add("tags=" + args.get("tags"));
        }
        if (args.containsKey("mutualTlsAuthentication")) {
            queryParams.add("mutualTlsAuthentication=" + args.get("mutualTlsAuthentication"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/post_domainnames" + queryString;
                
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
    
    public static MCPServer.Tool createPost_DomainnamesTool(MCPServer.APIConfig config) {
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
        Map<String, Object> regionalCertificateNameProperty = new HashMap<>();
        regionalCertificateNameProperty.put("type", "string");
        regionalCertificateNameProperty.put("required", false);
        regionalCertificateNameProperty.put("description", "Input parameter: The user-friendly name of the certificate that will be used by regional endpoint for this domain name.");
        properties.put("regionalCertificateName", regionalCertificateNameProperty);
        Map<String, Object> regionalCertificateArnProperty = new HashMap<>();
        regionalCertificateArnProperty.put("type", "string");
        regionalCertificateArnProperty.put("required", false);
        regionalCertificateArnProperty.put("description", "Input parameter: The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name. AWS Certificate Manager is the only supported source.");
        properties.put("regionalCertificateArn", regionalCertificateArnProperty);
        Map<String, Object> certificatePrivateKeyProperty = new HashMap<>();
        certificatePrivateKeyProperty.put("type", "string");
        certificatePrivateKeyProperty.put("required", false);
        certificatePrivateKeyProperty.put("description", "Input parameter: [Deprecated] Your edge-optimized endpoint's domain name certificate's private key.");
        properties.put("certificatePrivateKey", certificatePrivateKeyProperty);
        Map<String, Object> ownershipVerificationCertificateArnProperty = new HashMap<>();
        ownershipVerificationCertificateArnProperty.put("type", "string");
        ownershipVerificationCertificateArnProperty.put("required", false);
        ownershipVerificationCertificateArnProperty.put("description", "Input parameter: The ARN of the public certificate issued by ACM to validate ownership of your custom domain. Only required when configuring mutual TLS and using an ACM imported or private CA certificate ARN as the regionalCertificateArn.");
        properties.put("ownershipVerificationCertificateArn", ownershipVerificationCertificateArnProperty);
        Map<String, Object> certificateBodyProperty = new HashMap<>();
        certificateBodyProperty.put("type", "string");
        certificateBodyProperty.put("required", false);
        certificateBodyProperty.put("description", "Input parameter: [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this domain name provided by your certificate authority.");
        properties.put("certificateBody", certificateBodyProperty);
        Map<String, Object> certificateChainProperty = new HashMap<>();
        certificateChainProperty.put("type", "string");
        certificateChainProperty.put("required", false);
        certificateChainProperty.put("description", "Input parameter: [Deprecated] The intermediate certificates and optionally the root certificate, one after the other without any blank lines, used by an edge-optimized endpoint for this domain name. If you include the root certificate, your certificate chain must start with intermediate certificates and end with the root certificate. Use the intermediate certificates that were provided by your certificate authority. Do not include any intermediaries that are not in the chain of trust path.");
        properties.put("certificateChain", certificateChainProperty);
        Map<String, Object> certificateNameProperty = new HashMap<>();
        certificateNameProperty.put("type", "string");
        certificateNameProperty.put("required", false);
        certificateNameProperty.put("description", "Input parameter: The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain name.");
        properties.put("certificateName", certificateNameProperty);
        Map<String, Object> domainNameProperty = new HashMap<>();
        domainNameProperty.put("type", "string");
        domainNameProperty.put("required", true);
        domainNameProperty.put("description", "Input parameter: The name of the DomainName resource.");
        properties.put("domainName", domainNameProperty);
        Map<String, Object> securityPolicyProperty = new HashMap<>();
        securityPolicyProperty.put("type", "string");
        securityPolicyProperty.put("required", false);
        securityPolicyProperty.put("description", "Input parameter: The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are <code>TLS_1_0</code> and <code>TLS_1_2</code>.");
        properties.put("securityPolicy", securityPolicyProperty);
        Map<String, Object> certificateArnProperty = new HashMap<>();
        certificateArnProperty.put("type", "string");
        certificateArnProperty.put("required", false);
        certificateArnProperty.put("description", "Input parameter: The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.");
        properties.put("certificateArn", certificateArnProperty);
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
        Map<String, Object> mutualTlsAuthenticationProperty = new HashMap<>();
        mutualTlsAuthenticationProperty.put("type", "string");
        mutualTlsAuthenticationProperty.put("required", false);
        mutualTlsAuthenticationProperty.put("description", "Input parameter: The mutual TLS authentication configuration for a custom domain name. If specified, API Gateway performs two-way authentication between the client and the server. Clients must present a trusted certificate to access your API.");
        properties.put("mutualTlsAuthentication", mutualTlsAuthenticationProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "post_domainnames",
            "Creates a new domain name.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getPost_DomainnamesHandler(config));
    }
    
}