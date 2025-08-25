/**
 * MCP Server function for Gets the usage data of a usage plan in a specified time interval.
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

class Get_Usageplans_Usageplan_Id_Usage_Start_Date_End_DateMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getGet_Usageplans_Usageplan_Id_Usage_Start_Date_End_DateHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("usageplanId")) {
            queryParams.add("usageplanId=" + args.get("usageplanId"));
        }
        if (args.containsKey("keyId")) {
            queryParams.add("keyId=" + args.get("keyId"));
        }
        if (args.containsKey("startDate")) {
            queryParams.add("startDate=" + args.get("startDate"));
        }
        if (args.containsKey("endDate")) {
            queryParams.add("endDate=" + args.get("endDate"));
        }
        if (args.containsKey("position")) {
            queryParams.add("position=" + args.get("position"));
        }
        if (args.containsKey("limit")) {
            queryParams.add("limit=" + args.get("limit"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/get_usageplans_usageplan_id_usage_start_date_end_date" + queryString;
                
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
    
    public static MCPServer.Tool createGet_Usageplans_Usageplan_Id_Usage_Start_Date_End_DateTool(MCPServer.APIConfig config) {
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
        Map<String, Object> usageplanIdProperty = new HashMap<>();
        usageplanIdProperty.put("type", "string");
        usageplanIdProperty.put("required", true);
        usageplanIdProperty.put("description", "The Id of the usage plan associated with the usage data.");
        properties.put("usageplanId", usageplanIdProperty);
        Map<String, Object> keyIdProperty = new HashMap<>();
        keyIdProperty.put("type", "string");
        keyIdProperty.put("required", false);
        keyIdProperty.put("description", "The Id of the API key associated with the resultant usage data.");
        properties.put("keyId", keyIdProperty);
        Map<String, Object> startDateProperty = new HashMap<>();
        startDateProperty.put("type", "string");
        startDateProperty.put("required", true);
        startDateProperty.put("description", "The starting date (e.g., 2016-01-01) of the usage data.");
        properties.put("startDate", startDateProperty);
        Map<String, Object> endDateProperty = new HashMap<>();
        endDateProperty.put("type", "string");
        endDateProperty.put("required", true);
        endDateProperty.put("description", "The ending date (e.g., 2016-12-31) of the usage data.");
        properties.put("endDate", endDateProperty);
        Map<String, Object> positionProperty = new HashMap<>();
        positionProperty.put("type", "string");
        positionProperty.put("required", false);
        positionProperty.put("description", "The current pagination position in the paged result set.");
        properties.put("position", positionProperty);
        Map<String, Object> limitProperty = new HashMap<>();
        limitProperty.put("type", "string");
        limitProperty.put("required", false);
        limitProperty.put("description", "The maximum number of returned results per page. The default value is 25 and the maximum value is 500.");
        properties.put("limit", limitProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "get_usageplans_usageplan_id_usage_start_date_end_date",
            "Gets the usage data of a usage plan in a specified time interval.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getGet_Usageplans_Usageplan_Id_Usage_Start_Date_End_DateHandler(config));
    }
    
}