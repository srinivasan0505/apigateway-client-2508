/**
 * Main MCP Server - Handles MCP JSON-RPC protocol
 */

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.concurrent.CompletableFuture;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

// Import Patch_Apikeys_Api_KeyMCPTool - included in same package
// Import Delete_Apikeys_Api_KeyMCPTool - included in same package
// Import Post_ApikeysMCPTool - included in same package
// Import Get_Apikeys_Api_KeyMCPTool - included in same package
// Import Get_ApikeysMCPTool - included in same package
// Import Put_Tags_Resource_ArnMCPTool - included in same package
// Import Get_Tags_Resource_ArnMCPTool - included in same package
// Import Delete_Tags_Resource_Arn_Tag_KeysMCPTool - included in same package
// Import Patch_Domainnames_Domain_Name_Basepathmappings_Base_PathMCPTool - included in same package
// Import Get_Domainnames_Domain_Name_Basepathmappings_Base_PathMCPTool - included in same package
// Import Delete_Domainnames_Domain_NameMCPTool - included in same package
// Import Post_Domainnames_Domain_Name_BasepathmappingsMCPTool - included in same package
// Import Delete_Domainnames_Domain_Name_Basepathmappings_Base_PathMCPTool - included in same package
// Import Patch_Domainnames_Domain_NameMCPTool - included in same package
// Import Post_DomainnamesMCPTool - included in same package
// Import Get_DomainnamesMCPTool - included in same package
// Import Get_Domainnames_Domain_NameMCPTool - included in same package
// Import Get_Domainnames_Domain_Name_BasepathmappingsMCPTool - included in same package
// Import Patch_Vpclinks_Vpclink_IdMCPTool - included in same package
// Import Get_VpclinksMCPTool - included in same package
// Import Post_VpclinksMCPTool - included in same package
// Import Delete_Vpclinks_Vpclink_IdMCPTool - included in same package
// Import Get_Vpclinks_Vpclink_IdMCPTool - included in same package
// Import Post_Restapis_Mode_ImportMCPTool - included in same package
// Import Post_Apikeys_Mode_Import_FormatMCPTool - included in same package
// Import Patch_Restapis_Restapi_Id_Deployments_Deployment_IdMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Authorizers_Authorizer_IdMCPTool - included in same package
// Import Patch_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationMCPTool - included in same package
// Import Put_Restapis_Restapi_IdMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Deployments_Deployment_IdMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Documentation_Parts_Part_IdMCPTool - included in same package
// Import Delete_Restapis_Restapi_IdMCPTool - included in same package
// Import Post_Restapis_Restapi_Id_ModelsMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Integration_Responses_Status_CodeMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Gatewayresponses_Response_TypeMCPTool - included in same package
// Import Patch_Restapis_Restapi_Id_Documentation_Parts_Part_IdMCPTool - included in same package
// Import Patch_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Integration_Responses_Status_CodeMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_GatewayresponsesMCPTool - included in same package
// Import Put_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Responses_Status_CodeMCPTool - included in same package
// Import Post_Restapis_Restapi_Id_AuthorizersMCPTool - included in same package
// Import Patch_Restapis_Restapi_IdMCPTool - included in same package
// Import Patch_Restapis_Restapi_Id_Documentation_Versions_Doc_VersionMCPTool - included in same package
// Import Post_Restapis_Restapi_Id_DeploymentsMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationMCPTool - included in same package
// Import Put_Restapis_Restapi_Id_Gatewayresponses_Response_TypeMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Stages_Stage_Name_Sdks_Sdk_TypeMCPTool - included in same package
// Import Patch_Restapis_Restapi_Id_Resources_Resource_IdMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Stages_Stage_Name_Cache_DataMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Documentation_PartsMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_ResourcesMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Stages_Stage_Name_Cache_AuthorizersMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_AuthorizersMCPTool - included in same package
// Import Patch_Restapis_Restapi_Id_Models_Model_NameMCPTool - included in same package
// Import Patch_Restapis_Restapi_Id_Authorizers_Authorizer_IdMCPTool - included in same package
// Import Patch_Restapis_Restapi_Id_Stages_Stage_NameMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Gatewayresponses_Response_TypeMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Stages_Stage_Name_Exports_Export_TypeMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Stages_Stage_NameMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_StagesMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Models_Model_NameMCPTool - included in same package
// Import Post_Restapis_Restapi_Id_Documentation_VersionsMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_ModelsMCPTool - included in same package
// Import Put_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Models_Model_Name_Default_TemplateMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Requestvalidators_Requestvalidator_IdMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Documentation_VersionsMCPTool - included in same package
// Import Put_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Documentation_Versions_Doc_VersionMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_RequestvalidatorsMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Resources_Resource_IdMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_DeploymentsMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Resources_Resource_IdMCPTool - included in same package
// Import Post_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodMCPTool - included in same package
// Import Get_RestapisMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Deployments_Deployment_IdMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Stages_Stage_NameMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Authorizers_Authorizer_IdMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Requestvalidators_Requestvalidator_IdMCPTool - included in same package
// Import Patch_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Responses_Status_CodeMCPTool - included in same package
// Import Put_Restapis_Restapi_Id_Documentation_PartsMCPTool - included in same package
// Import Get_Restapis_Restapi_IdMCPTool - included in same package
// Import Post_Restapis_Restapi_Id_Documentation_PartsMCPTool - included in same package
// Import Patch_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodMCPTool - included in same package
// Import Post_Restapis_Restapi_Id_StagesMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Models_Model_NameMCPTool - included in same package
// Import Patch_Restapis_Restapi_Id_Requestvalidators_Requestvalidator_IdMCPTool - included in same package
// Import Post_Restapis_Restapi_Id_RequestvalidatorsMCPTool - included in same package
// Import Post_Restapis_Restapi_Id_Authorizers_Authorizer_IdMCPTool - included in same package
// Import Post_RestapisMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Responses_Status_CodeMCPTool - included in same package
// Import Delete_Restapis_Restapi_Id_Documentation_Versions_Doc_VersionMCPTool - included in same package
// Import Post_Restapis_Restapi_Id_Resources_Parent_IdMCPTool - included in same package
// Import Patch_Restapis_Restapi_Id_Gatewayresponses_Response_TypeMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Documentation_Parts_Part_IdMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Responses_Status_CodeMCPTool - included in same package
// Import Put_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Integration_Responses_Status_CodeMCPTool - included in same package
// Import Get_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Integration_Responses_Status_CodeMCPTool - included in same package
// Import Patch_Clientcertificates_Clientcertificate_IdMCPTool - included in same package
// Import Get_ClientcertificatesMCPTool - included in same package
// Import Post_ClientcertificatesMCPTool - included in same package
// Import Get_Clientcertificates_Clientcertificate_IdMCPTool - included in same package
// Import Delete_Clientcertificates_Clientcertificate_IdMCPTool - included in same package
// Import Get_SdktypesMCPTool - included in same package
// Import Get_Sdktypes_Sdktype_IdMCPTool - included in same package
// Import Get_UsageplansMCPTool - included in same package
// Import Post_Usageplans_Usageplan_Id_KeysMCPTool - included in same package
// Import Delete_Usageplans_Usageplan_Id_Keys_Key_IdMCPTool - included in same package
// Import Post_UsageplansMCPTool - included in same package
// Import Get_Usageplans_Usageplan_Id_Keys_Key_IdMCPTool - included in same package
// Import Get_Usageplans_Usageplan_IdMCPTool - included in same package
// Import Get_Usageplans_Usageplan_Id_KeysMCPTool - included in same package
// Import Patch_Usageplans_Usageplan_IdMCPTool - included in same package
// Import Patch_Usageplans_Usageplan_Id_Keys_Key_Id_UsageMCPTool - included in same package
// Import Delete_Usageplans_Usageplan_IdMCPTool - included in same package
// Import Get_Usageplans_Usageplan_Id_Usage_Start_Date_End_DateMCPTool - included in same package
// Import Patch_AccountMCPTool - included in same package
// Import Get_AccountMCPTool - included in same package

public class MCPServer {
    
    // Common classes that all tool classes use
    public static class APIConfig {
        private final String baseUrl;
        private final String apiKey;
        
        public APIConfig(String baseUrl, String apiKey) {
            this.baseUrl = baseUrl;
            this.apiKey = apiKey;
        }
        
        public String getBaseUrl() { return baseUrl; }
        public String getApiKey() { return apiKey; }
    }
    
    public static class MCPRequest {
        private Map<String, Object> params;
        
        public Map<String, Object> getParams() { return params; }
        public void setParams(Map<String, Object> params) { this.params = params; }
        
        @SuppressWarnings("unchecked")
        public Map<String, Object> getArguments() {
            if (params != null && params.containsKey("arguments")) {
                return (Map<String, Object>) params.get("arguments");
            }
            return new HashMap<>();
        }
    }
    
    public static class MCPToolResult {
        private final String content;
        private final boolean isError;
        
        public MCPToolResult(String content, boolean isError) {
            this.content = content;
            this.isError = isError;
        }
        
        public MCPToolResult(String content) {
            this(content, false);
        }
        
        public String getContent() { return content; }
        public boolean isError() { return isError; }
    }
    
    public static class ToolDefinition {
        private final String name;
        private final String description;
        private final Map<String, Object> parameters;
        
        public ToolDefinition(String name, String description, Map<String, Object> parameters) {
            this.name = name;
            this.description = description;
            this.parameters = parameters;
        }
        
        public String getName() { return name; }
        public String getDescription() { return description; }
        public Map<String, Object> getParameters() { return parameters; }
    }
    
    public static class Tool {
        private final ToolDefinition definition;
        private final Function<MCPRequest, MCPToolResult> handler;
        
        public Tool(ToolDefinition definition, Function<MCPRequest, MCPToolResult> handler) {
            this.definition = definition;
            this.handler = handler;
        }
        
        public ToolDefinition getDefinition() { return definition; }
        public Function<MCPRequest, MCPToolResult> getHandler() { return handler; }
    }
    
    private static final ObjectMapper mapper = new ObjectMapper();
    private static List<Tool> tools = new ArrayList<>();
    private static APIConfig config;
    
    public static void main(String[] args) {
        try {
            // Initialize configuration
            String baseUrl = System.getenv("API_BASE_URL");
            String apiKey = System.getenv("API_KEY");
            
            if (baseUrl == null || apiKey == null) {
                System.err.println("Error: Please set API_BASE_URL and API_KEY environment variables");
                System.exit(1);
            }
            
            config = new APIConfig(baseUrl, apiKey);
            
            // Register all tools
            tools = Arrays.asList(
            Patch_Apikeys_Api_KeyMCPTool.createPatch_Apikeys_Api_KeyTool(config),
            Delete_Apikeys_Api_KeyMCPTool.createDelete_Apikeys_Api_KeyTool(config),
            Post_ApikeysMCPTool.createPost_ApikeysTool(config),
            Get_Apikeys_Api_KeyMCPTool.createGet_Apikeys_Api_KeyTool(config),
            Get_ApikeysMCPTool.createGet_ApikeysTool(config),
            Put_Tags_Resource_ArnMCPTool.createPut_Tags_Resource_ArnTool(config),
            Get_Tags_Resource_ArnMCPTool.createGet_Tags_Resource_ArnTool(config),
            Delete_Tags_Resource_Arn_Tag_KeysMCPTool.createDelete_Tags_Resource_Arn_Tag_KeysTool(config),
            Patch_Domainnames_Domain_Name_Basepathmappings_Base_PathMCPTool.createPatch_Domainnames_Domain_Name_Basepathmappings_Base_PathTool(config),
            Get_Domainnames_Domain_Name_Basepathmappings_Base_PathMCPTool.createGet_Domainnames_Domain_Name_Basepathmappings_Base_PathTool(config),
            Delete_Domainnames_Domain_NameMCPTool.createDelete_Domainnames_Domain_NameTool(config),
            Post_Domainnames_Domain_Name_BasepathmappingsMCPTool.createPost_Domainnames_Domain_Name_BasepathmappingsTool(config),
            Delete_Domainnames_Domain_Name_Basepathmappings_Base_PathMCPTool.createDelete_Domainnames_Domain_Name_Basepathmappings_Base_PathTool(config),
            Patch_Domainnames_Domain_NameMCPTool.createPatch_Domainnames_Domain_NameTool(config),
            Post_DomainnamesMCPTool.createPost_DomainnamesTool(config),
            Get_DomainnamesMCPTool.createGet_DomainnamesTool(config),
            Get_Domainnames_Domain_NameMCPTool.createGet_Domainnames_Domain_NameTool(config),
            Get_Domainnames_Domain_Name_BasepathmappingsMCPTool.createGet_Domainnames_Domain_Name_BasepathmappingsTool(config),
            Patch_Vpclinks_Vpclink_IdMCPTool.createPatch_Vpclinks_Vpclink_IdTool(config),
            Get_VpclinksMCPTool.createGet_VpclinksTool(config),
            Post_VpclinksMCPTool.createPost_VpclinksTool(config),
            Delete_Vpclinks_Vpclink_IdMCPTool.createDelete_Vpclinks_Vpclink_IdTool(config),
            Get_Vpclinks_Vpclink_IdMCPTool.createGet_Vpclinks_Vpclink_IdTool(config),
            Post_Restapis_Mode_ImportMCPTool.createPost_Restapis_Mode_ImportTool(config),
            Post_Apikeys_Mode_Import_FormatMCPTool.createPost_Apikeys_Mode_Import_FormatTool(config),
            Patch_Restapis_Restapi_Id_Deployments_Deployment_IdMCPTool.createPatch_Restapis_Restapi_Id_Deployments_Deployment_IdTool(config),
            Delete_Restapis_Restapi_Id_Authorizers_Authorizer_IdMCPTool.createDelete_Restapis_Restapi_Id_Authorizers_Authorizer_IdTool(config),
            Patch_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationMCPTool.createPatch_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationTool(config),
            Put_Restapis_Restapi_IdMCPTool.createPut_Restapis_Restapi_IdTool(config),
            Delete_Restapis_Restapi_Id_Deployments_Deployment_IdMCPTool.createDelete_Restapis_Restapi_Id_Deployments_Deployment_IdTool(config),
            Delete_Restapis_Restapi_Id_Documentation_Parts_Part_IdMCPTool.createDelete_Restapis_Restapi_Id_Documentation_Parts_Part_IdTool(config),
            Delete_Restapis_Restapi_IdMCPTool.createDelete_Restapis_Restapi_IdTool(config),
            Post_Restapis_Restapi_Id_ModelsMCPTool.createPost_Restapis_Restapi_Id_ModelsTool(config),
            Delete_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Integration_Responses_Status_CodeMCPTool.createDelete_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Integration_Responses_Status_CodeTool(config),
            Get_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodMCPTool.createGet_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodTool(config),
            Get_Restapis_Restapi_Id_Gatewayresponses_Response_TypeMCPTool.createGet_Restapis_Restapi_Id_Gatewayresponses_Response_TypeTool(config),
            Patch_Restapis_Restapi_Id_Documentation_Parts_Part_IdMCPTool.createPatch_Restapis_Restapi_Id_Documentation_Parts_Part_IdTool(config),
            Patch_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Integration_Responses_Status_CodeMCPTool.createPatch_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Integration_Responses_Status_CodeTool(config),
            Get_Restapis_Restapi_Id_GatewayresponsesMCPTool.createGet_Restapis_Restapi_Id_GatewayresponsesTool(config),
            Put_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Responses_Status_CodeMCPTool.createPut_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Responses_Status_CodeTool(config),
            Post_Restapis_Restapi_Id_AuthorizersMCPTool.createPost_Restapis_Restapi_Id_AuthorizersTool(config),
            Patch_Restapis_Restapi_IdMCPTool.createPatch_Restapis_Restapi_IdTool(config),
            Patch_Restapis_Restapi_Id_Documentation_Versions_Doc_VersionMCPTool.createPatch_Restapis_Restapi_Id_Documentation_Versions_Doc_VersionTool(config),
            Post_Restapis_Restapi_Id_DeploymentsMCPTool.createPost_Restapis_Restapi_Id_DeploymentsTool(config),
            Delete_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationMCPTool.createDelete_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationTool(config),
            Put_Restapis_Restapi_Id_Gatewayresponses_Response_TypeMCPTool.createPut_Restapis_Restapi_Id_Gatewayresponses_Response_TypeTool(config),
            Get_Restapis_Restapi_Id_Stages_Stage_Name_Sdks_Sdk_TypeMCPTool.createGet_Restapis_Restapi_Id_Stages_Stage_Name_Sdks_Sdk_TypeTool(config),
            Patch_Restapis_Restapi_Id_Resources_Resource_IdMCPTool.createPatch_Restapis_Restapi_Id_Resources_Resource_IdTool(config),
            Get_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationMCPTool.createGet_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationTool(config),
            Delete_Restapis_Restapi_Id_Stages_Stage_Name_Cache_DataMCPTool.createDelete_Restapis_Restapi_Id_Stages_Stage_Name_Cache_DataTool(config),
            Get_Restapis_Restapi_Id_Documentation_PartsMCPTool.createGet_Restapis_Restapi_Id_Documentation_PartsTool(config),
            Get_Restapis_Restapi_Id_ResourcesMCPTool.createGet_Restapis_Restapi_Id_ResourcesTool(config),
            Delete_Restapis_Restapi_Id_Stages_Stage_Name_Cache_AuthorizersMCPTool.createDelete_Restapis_Restapi_Id_Stages_Stage_Name_Cache_AuthorizersTool(config),
            Get_Restapis_Restapi_Id_AuthorizersMCPTool.createGet_Restapis_Restapi_Id_AuthorizersTool(config),
            Patch_Restapis_Restapi_Id_Models_Model_NameMCPTool.createPatch_Restapis_Restapi_Id_Models_Model_NameTool(config),
            Patch_Restapis_Restapi_Id_Authorizers_Authorizer_IdMCPTool.createPatch_Restapis_Restapi_Id_Authorizers_Authorizer_IdTool(config),
            Patch_Restapis_Restapi_Id_Stages_Stage_NameMCPTool.createPatch_Restapis_Restapi_Id_Stages_Stage_NameTool(config),
            Delete_Restapis_Restapi_Id_Gatewayresponses_Response_TypeMCPTool.createDelete_Restapis_Restapi_Id_Gatewayresponses_Response_TypeTool(config),
            Get_Restapis_Restapi_Id_Stages_Stage_Name_Exports_Export_TypeMCPTool.createGet_Restapis_Restapi_Id_Stages_Stage_Name_Exports_Export_TypeTool(config),
            Delete_Restapis_Restapi_Id_Stages_Stage_NameMCPTool.createDelete_Restapis_Restapi_Id_Stages_Stage_NameTool(config),
            Get_Restapis_Restapi_Id_StagesMCPTool.createGet_Restapis_Restapi_Id_StagesTool(config),
            Get_Restapis_Restapi_Id_Models_Model_NameMCPTool.createGet_Restapis_Restapi_Id_Models_Model_NameTool(config),
            Post_Restapis_Restapi_Id_Documentation_VersionsMCPTool.createPost_Restapis_Restapi_Id_Documentation_VersionsTool(config),
            Get_Restapis_Restapi_Id_ModelsMCPTool.createGet_Restapis_Restapi_Id_ModelsTool(config),
            Put_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationMCPTool.createPut_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_IntegrationTool(config),
            Get_Restapis_Restapi_Id_Models_Model_Name_Default_TemplateMCPTool.createGet_Restapis_Restapi_Id_Models_Model_Name_Default_TemplateTool(config),
            Delete_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodMCPTool.createDelete_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodTool(config),
            Delete_Restapis_Restapi_Id_Requestvalidators_Requestvalidator_IdMCPTool.createDelete_Restapis_Restapi_Id_Requestvalidators_Requestvalidator_IdTool(config),
            Get_Restapis_Restapi_Id_Documentation_VersionsMCPTool.createGet_Restapis_Restapi_Id_Documentation_VersionsTool(config),
            Put_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodMCPTool.createPut_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodTool(config),
            Get_Restapis_Restapi_Id_Documentation_Versions_Doc_VersionMCPTool.createGet_Restapis_Restapi_Id_Documentation_Versions_Doc_VersionTool(config),
            Get_Restapis_Restapi_Id_RequestvalidatorsMCPTool.createGet_Restapis_Restapi_Id_RequestvalidatorsTool(config),
            Delete_Restapis_Restapi_Id_Resources_Resource_IdMCPTool.createDelete_Restapis_Restapi_Id_Resources_Resource_IdTool(config),
            Get_Restapis_Restapi_Id_DeploymentsMCPTool.createGet_Restapis_Restapi_Id_DeploymentsTool(config),
            Get_Restapis_Restapi_Id_Resources_Resource_IdMCPTool.createGet_Restapis_Restapi_Id_Resources_Resource_IdTool(config),
            Post_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodMCPTool.createPost_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodTool(config),
            Get_RestapisMCPTool.createGet_RestapisTool(config),
            Get_Restapis_Restapi_Id_Deployments_Deployment_IdMCPTool.createGet_Restapis_Restapi_Id_Deployments_Deployment_IdTool(config),
            Get_Restapis_Restapi_Id_Stages_Stage_NameMCPTool.createGet_Restapis_Restapi_Id_Stages_Stage_NameTool(config),
            Get_Restapis_Restapi_Id_Authorizers_Authorizer_IdMCPTool.createGet_Restapis_Restapi_Id_Authorizers_Authorizer_IdTool(config),
            Get_Restapis_Restapi_Id_Requestvalidators_Requestvalidator_IdMCPTool.createGet_Restapis_Restapi_Id_Requestvalidators_Requestvalidator_IdTool(config),
            Patch_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Responses_Status_CodeMCPTool.createPatch_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Responses_Status_CodeTool(config),
            Put_Restapis_Restapi_Id_Documentation_PartsMCPTool.createPut_Restapis_Restapi_Id_Documentation_PartsTool(config),
            Get_Restapis_Restapi_IdMCPTool.createGet_Restapis_Restapi_IdTool(config),
            Post_Restapis_Restapi_Id_Documentation_PartsMCPTool.createPost_Restapis_Restapi_Id_Documentation_PartsTool(config),
            Patch_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodMCPTool.createPatch_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_MethodTool(config),
            Post_Restapis_Restapi_Id_StagesMCPTool.createPost_Restapis_Restapi_Id_StagesTool(config),
            Delete_Restapis_Restapi_Id_Models_Model_NameMCPTool.createDelete_Restapis_Restapi_Id_Models_Model_NameTool(config),
            Patch_Restapis_Restapi_Id_Requestvalidators_Requestvalidator_IdMCPTool.createPatch_Restapis_Restapi_Id_Requestvalidators_Requestvalidator_IdTool(config),
            Post_Restapis_Restapi_Id_RequestvalidatorsMCPTool.createPost_Restapis_Restapi_Id_RequestvalidatorsTool(config),
            Post_Restapis_Restapi_Id_Authorizers_Authorizer_IdMCPTool.createPost_Restapis_Restapi_Id_Authorizers_Authorizer_IdTool(config),
            Post_RestapisMCPTool.createPost_RestapisTool(config),
            Delete_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Responses_Status_CodeMCPTool.createDelete_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Responses_Status_CodeTool(config),
            Delete_Restapis_Restapi_Id_Documentation_Versions_Doc_VersionMCPTool.createDelete_Restapis_Restapi_Id_Documentation_Versions_Doc_VersionTool(config),
            Post_Restapis_Restapi_Id_Resources_Parent_IdMCPTool.createPost_Restapis_Restapi_Id_Resources_Parent_IdTool(config),
            Patch_Restapis_Restapi_Id_Gatewayresponses_Response_TypeMCPTool.createPatch_Restapis_Restapi_Id_Gatewayresponses_Response_TypeTool(config),
            Get_Restapis_Restapi_Id_Documentation_Parts_Part_IdMCPTool.createGet_Restapis_Restapi_Id_Documentation_Parts_Part_IdTool(config),
            Get_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Responses_Status_CodeMCPTool.createGet_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Responses_Status_CodeTool(config),
            Put_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Integration_Responses_Status_CodeMCPTool.createPut_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Integration_Responses_Status_CodeTool(config),
            Get_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Integration_Responses_Status_CodeMCPTool.createGet_Restapis_Restapi_Id_Resources_Resource_Id_Methods_Http_Method_Integration_Responses_Status_CodeTool(config),
            Patch_Clientcertificates_Clientcertificate_IdMCPTool.createPatch_Clientcertificates_Clientcertificate_IdTool(config),
            Get_ClientcertificatesMCPTool.createGet_ClientcertificatesTool(config),
            Post_ClientcertificatesMCPTool.createPost_ClientcertificatesTool(config),
            Get_Clientcertificates_Clientcertificate_IdMCPTool.createGet_Clientcertificates_Clientcertificate_IdTool(config),
            Delete_Clientcertificates_Clientcertificate_IdMCPTool.createDelete_Clientcertificates_Clientcertificate_IdTool(config),
            Get_SdktypesMCPTool.createGet_SdktypesTool(config),
            Get_Sdktypes_Sdktype_IdMCPTool.createGet_Sdktypes_Sdktype_IdTool(config),
            Get_UsageplansMCPTool.createGet_UsageplansTool(config),
            Post_Usageplans_Usageplan_Id_KeysMCPTool.createPost_Usageplans_Usageplan_Id_KeysTool(config),
            Delete_Usageplans_Usageplan_Id_Keys_Key_IdMCPTool.createDelete_Usageplans_Usageplan_Id_Keys_Key_IdTool(config),
            Post_UsageplansMCPTool.createPost_UsageplansTool(config),
            Get_Usageplans_Usageplan_Id_Keys_Key_IdMCPTool.createGet_Usageplans_Usageplan_Id_Keys_Key_IdTool(config),
            Get_Usageplans_Usageplan_IdMCPTool.createGet_Usageplans_Usageplan_IdTool(config),
            Get_Usageplans_Usageplan_Id_KeysMCPTool.createGet_Usageplans_Usageplan_Id_KeysTool(config),
            Patch_Usageplans_Usageplan_IdMCPTool.createPatch_Usageplans_Usageplan_IdTool(config),
            Patch_Usageplans_Usageplan_Id_Keys_Key_Id_UsageMCPTool.createPatch_Usageplans_Usageplan_Id_Keys_Key_Id_UsageTool(config),
            Delete_Usageplans_Usageplan_IdMCPTool.createDelete_Usageplans_Usageplan_IdTool(config),
            Get_Usageplans_Usageplan_Id_Usage_Start_Date_End_DateMCPTool.createGet_Usageplans_Usageplan_Id_Usage_Start_Date_End_DateTool(config),
            Patch_AccountMCPTool.createPatch_AccountTool(config),
            Get_AccountMCPTool.createGet_AccountTool(config)
            );
            
            System.err.println("MCP Server started with " + tools.size() + " tools");
            
            // Start JSON-RPC server
            runServer();
            
        } catch (Exception e) {
            System.err.println("Failed to start MCP server: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
    
    private static void runServer() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        while ((line = reader.readLine()) != null) {
            JsonNode request = null;
            try {
                request = mapper.readTree(line);
                JsonNode response = handleRequest(request);
                
                if (response != null) {
                    System.out.println(mapper.writeValueAsString(response));
                }
                
            } catch (Exception e) {
                // Send error response
                ObjectNode errorResponse = mapper.createObjectNode();
                errorResponse.put("jsonrpc", "2.0");
                if (request != null && request.has("id")) {
                    errorResponse.put("id", request.get("id").asText());
                } else {
                    errorResponse.putNull("id");
                }
                
                ObjectNode error = mapper.createObjectNode();
                error.put("code", -32603);
                error.put("message", "Internal error: " + e.getMessage());
                errorResponse.set("error", error);
                
                System.out.println(mapper.writeValueAsString(errorResponse));
            }
        }
    }
    
    private static JsonNode handleRequest(JsonNode request) {
        if (!request.has("method")) {
            return createErrorResponse(request, -32600, "Invalid Request");
        }
        
        String method = request.get("method").asText();
        JsonNode params = request.get("params");
        String id = request.has("id") ? request.get("id").asText() : null;
        
        switch (method) {
            case "initialize":
                return handleInitialize(id);
            case "tools/list":
                return handleToolsList(id);
            case "tools/call":
                return handleToolsCall(id, params);
            default:
                return createErrorResponse(request, -32601, "Method not found");
        }
    }
    
    private static JsonNode handleInitialize(String id) {
        ObjectNode response = mapper.createObjectNode();
        response.put("jsonrpc", "2.0");
        response.put("id", id);
        
        ObjectNode result = mapper.createObjectNode();
        result.put("protocolVersion", "2024-11-05");
        
        ObjectNode capabilities = mapper.createObjectNode();
        ObjectNode toolsCapability = mapper.createObjectNode();
        toolsCapability.put("listChanged", false);
        capabilities.set("tools", toolsCapability);
        result.set("capabilities", capabilities);
        
        ObjectNode serverInfo = mapper.createObjectNode();
        serverInfo.put("name", "Opsera MCP Server");
        serverInfo.put("version", "1.0.0");
        result.set("serverInfo", serverInfo);
        
        response.set("result", result);
        return response;
    }
    
    private static JsonNode handleToolsList(String id) {
        ObjectNode response = mapper.createObjectNode();
        response.put("jsonrpc", "2.0");
        response.put("id", id);
        
        ObjectNode result = mapper.createObjectNode();
        ArrayNode toolsArray = mapper.createArrayNode();
        
        for (Tool tool : tools) {
            ObjectNode toolDef = mapper.createObjectNode();
            toolDef.put("name", tool.getDefinition().getName());
            toolDef.put("description", tool.getDefinition().getDescription());
            
            // Convert parameters to JSON
            ObjectNode inputSchema = mapper.valueToTree(tool.getDefinition().getParameters());
            toolDef.set("inputSchema", inputSchema);
            
            toolsArray.add(toolDef);
        }
        
        result.set("tools", toolsArray);
        response.set("result", result);
        return response;
    }
    
    private static JsonNode handleToolsCall(String id, JsonNode params) {
        if (!params.has("name")) {
            return createErrorResponse(null, -32602, "Invalid params: missing 'name'");
        }
        
        String toolName = params.get("name").asText();
        JsonNode arguments = params.has("arguments") ? params.get("arguments") : mapper.createObjectNode();
        
        // Find the tool
        Tool tool = null;
        for (Tool t : tools) {
            if (t.getDefinition().getName().equals(toolName)) {
                tool = t;
                break;
            }
        }
        
        if (tool == null) {
            return createErrorResponse(null, -32602, "Tool not found: " + toolName);
        }
        
        try {
            // Convert arguments to Map
            Map<String, Object> argsMap = mapper.convertValue(arguments, Map.class);
            
            // Create MCP request
            MCPRequest mcpRequest = new MCPRequest();
            Map<String, Object> requestParams = new HashMap<>();
            requestParams.put("arguments", argsMap);
            mcpRequest.setParams(requestParams);
            
            // Execute tool
            MCPToolResult result = tool.getHandler().apply(mcpRequest);
            
            // Create response
            ObjectNode response = mapper.createObjectNode();
            response.put("jsonrpc", "2.0");
            response.put("id", id);
            
            ObjectNode resultObj = mapper.createObjectNode();
            ArrayNode content = mapper.createArrayNode();
            
            ObjectNode textContent = mapper.createObjectNode();
            textContent.put("type", "text");
            textContent.put("text", result.getContent());
            content.add(textContent);
            
            resultObj.set("content", content);
            resultObj.put("isError", result.isError());
            
            response.set("result", resultObj);
            return response;
            
        } catch (Exception e) {
            return createErrorResponse(null, -32603, "Tool execution failed: " + e.getMessage());
        }
    }
    
    private static JsonNode createErrorResponse(JsonNode request, int code, String message) {
        ObjectNode response = mapper.createObjectNode();
        response.put("jsonrpc", "2.0");
        response.put("id", request != null && request.has("id") ? request.get("id").asText() : null);
        
        ObjectNode error = mapper.createObjectNode();
        error.put("code", code);
        error.put("message", message);
        response.set("error", error);
        
        return response;
    }
}