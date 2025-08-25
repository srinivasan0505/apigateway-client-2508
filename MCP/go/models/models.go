package models

import (
	"context"
	"github.com/mark3labs/mcp-go/mcp"
)

type Tool struct {
	Definition mcp.Tool
	Handler    func(ctx context.Context, req mcp.CallToolRequest) (*mcp.CallToolResult, error)
}

// Authorizer represents the Authorizer schema from the OpenAPI specification
type Authorizer struct {
	TypeField interface{} `json:"type,omitempty"`
	Authorizercredentials interface{} `json:"authorizerCredentials,omitempty"`
	Authorizeruri interface{} `json:"authorizerUri,omitempty"`
	Authtype interface{} `json:"authType,omitempty"`
	Identityvalidationexpression interface{} `json:"identityValidationExpression,omitempty"`
	Name interface{} `json:"name,omitempty"`
	Authorizerresultttlinseconds interface{} `json:"authorizerResultTtlInSeconds,omitempty"`
	Providerarns interface{} `json:"providerARNs,omitempty"`
	Id interface{} `json:"id,omitempty"`
	Identitysource interface{} `json:"identitySource,omitempty"`
}

// ImportApiKeysRequest represents the ImportApiKeysRequest schema from the OpenAPI specification
type ImportApiKeysRequest struct {
	Body interface{} `json:"body"`
}

// TagResourcerequest represents the TagResourcerequest schema from the OpenAPI specification
type TagResourcerequest struct {
	Tags map[string]interface{} `json:"tags"` // The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
}

// BasePathMappings represents the BasePathMappings schema from the OpenAPI specification
type BasePathMappings struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// UpdateApiKeyRequest represents the UpdateApiKeyRequest schema from the OpenAPI specification
type UpdateApiKeyRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// MethodSnapshot represents the MethodSnapshot schema from the OpenAPI specification
type MethodSnapshot struct {
	Authorizationtype interface{} `json:"authorizationType,omitempty"`
	Apikeyrequired interface{} `json:"apiKeyRequired,omitempty"`
}

// UpdateClientCertificateRequest represents the UpdateClientCertificateRequest schema from the OpenAPI specification
type UpdateClientCertificateRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// PutIntegrationResponseRequest represents the PutIntegrationResponseRequest schema from the OpenAPI specification
type PutIntegrationResponseRequest struct {
	Contenthandling interface{} `json:"contentHandling,omitempty"`
	Responseparameters interface{} `json:"responseParameters,omitempty"`
	Responsetemplates interface{} `json:"responseTemplates,omitempty"`
	Selectionpattern interface{} `json:"selectionPattern,omitempty"`
}

// CreateBasePathMappingRequest represents the CreateBasePathMappingRequest schema from the OpenAPI specification
type CreateBasePathMappingRequest struct {
	Basepath interface{} `json:"basePath,omitempty"`
	Restapiid interface{} `json:"restApiId"`
	Stage interface{} `json:"stage,omitempty"`
}

// MapOfStringToList represents the MapOfStringToList schema from the OpenAPI specification
type MapOfStringToList struct {
}

// UsagePlanquota represents the UsagePlanquota schema from the OpenAPI specification
type UsagePlanquota struct {
	Period interface{} `json:"period,omitempty"`
	Limit interface{} `json:"limit,omitempty"`
	Offset interface{} `json:"offset,omitempty"`
}

// UpdateApiKeyrequest represents the UpdateApiKeyrequest schema from the OpenAPI specification
type UpdateApiKeyrequest struct {
	Patchoperations []PatchOperation `json:"patchOperations,omitempty"` // A list of operations describing the updates to apply to the specified resource. The patches are applied in the order specified in the list.
}

// CreateRestApiRequest represents the CreateRestApiRequest schema from the OpenAPI specification
type CreateRestApiRequest struct {
	Policy interface{} `json:"policy,omitempty"`
	Apikeysource interface{} `json:"apiKeySource,omitempty"`
	Description interface{} `json:"description,omitempty"`
	Name interface{} `json:"name"`
	Disableexecuteapiendpoint interface{} `json:"disableExecuteApiEndpoint,omitempty"`
	Minimumcompressionsize interface{} `json:"minimumCompressionSize,omitempty"`
	Tags interface{} `json:"tags,omitempty"`
	Version interface{} `json:"version,omitempty"`
	Clonefrom interface{} `json:"cloneFrom,omitempty"`
	Endpointconfiguration RestApiendpointConfiguration `json:"endpointConfiguration,omitempty"`
	Binarymediatypes interface{} `json:"binaryMediaTypes,omitempty"`
}

// MapOfMethod represents the MapOfMethod schema from the OpenAPI specification
type MapOfMethod struct {
}

// PutMethodResponserequest represents the PutMethodResponserequest schema from the OpenAPI specification
type PutMethodResponserequest struct {
	Responsemodels map[string]interface{} `json:"responseModels,omitempty"` // Specifies the Model resources used for the response's content type. Response models are represented as a key/value map, with a content type as the key and a Model name as the value.
	Responseparameters map[string]interface{} `json:"responseParameters,omitempty"` // A key-value map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header name and the associated value is a Boolean flag indicating whether the method response parameter is required or not. The method response header names must match the pattern of <code>method.response.header.{name}</code>, where <code>name</code> is a valid and unique header name. The response parameter names defined here are available in the integration response to be mapped from an integration response header expressed in <code>integration.response.header.{name}</code>, a static value enclosed within a pair of single quotes (e.g., <code>'application/json'</code>), or a JSON expression from the back-end response payload in the form of <code>integration.response.body.{JSON-expression}</code>, where <code>JSON-expression</code> is a valid JSON expression without the <code>$</code> prefix.)
}

// DomainNameendpointConfiguration represents the DomainNameendpointConfiguration schema from the OpenAPI specification
type DomainNameendpointConfiguration struct {
	Vpcendpointids interface{} `json:"vpcEndpointIds,omitempty"`
	Types interface{} `json:"types,omitempty"`
}

// GetVpcLinkRequest represents the GetVpcLinkRequest schema from the OpenAPI specification
type GetVpcLinkRequest struct {
}

// CreateUsagePlanrequestthrottle represents the CreateUsagePlanrequestthrottle schema from the OpenAPI specification
type CreateUsagePlanrequestthrottle struct {
	Ratelimit interface{} `json:"rateLimit,omitempty"`
	Burstlimit interface{} `json:"burstLimit,omitempty"`
}

// AccountthrottleSettings represents the AccountthrottleSettings schema from the OpenAPI specification
type AccountthrottleSettings struct {
	Burstlimit interface{} `json:"burstLimit,omitempty"`
	Ratelimit interface{} `json:"rateLimit,omitempty"`
}

// DomainNamemutualTlsAuthentication represents the DomainNamemutualTlsAuthentication schema from the OpenAPI specification
type DomainNamemutualTlsAuthentication struct {
	Truststoreuri interface{} `json:"truststoreUri,omitempty"`
	Truststoreversion interface{} `json:"truststoreVersion,omitempty"`
	Truststorewarnings interface{} `json:"truststoreWarnings,omitempty"`
}

// UpdateIntegrationResponseRequest represents the UpdateIntegrationResponseRequest schema from the OpenAPI specification
type UpdateIntegrationResponseRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// GenerateClientCertificaterequest represents the GenerateClientCertificaterequest schema from the OpenAPI specification
type GenerateClientCertificaterequest struct {
	Description string `json:"description,omitempty"` // The description of the ClientCertificate.
	Tags map[string]interface{} `json:"tags,omitempty"` // The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
}

// GetUsagePlansRequest represents the GetUsagePlansRequest schema from the OpenAPI specification
type GetUsagePlansRequest struct {
}

// PathToMapOfMethodSnapshot represents the PathToMapOfMethodSnapshot schema from the OpenAPI specification
type PathToMapOfMethodSnapshot struct {
}

// UsagePlanKeys represents the UsagePlanKeys schema from the OpenAPI specification
type UsagePlanKeys struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// MapOfStringToBoolean represents the MapOfStringToBoolean schema from the OpenAPI specification
type MapOfStringToBoolean struct {
}

// GetAccountRequest represents the GetAccountRequest schema from the OpenAPI specification
type GetAccountRequest struct {
}

// GetSdkTypeRequest represents the GetSdkTypeRequest schema from the OpenAPI specification
type GetSdkTypeRequest struct {
}

// ApiStage represents the ApiStage schema from the OpenAPI specification
type ApiStage struct {
	Apiid interface{} `json:"apiId,omitempty"`
	Stage interface{} `json:"stage,omitempty"`
	Throttle interface{} `json:"throttle,omitempty"`
}

// Usage represents the Usage schema from the OpenAPI specification
type Usage struct {
	Enddate interface{} `json:"endDate,omitempty"`
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
	Startdate interface{} `json:"startDate,omitempty"`
	Usageplanid interface{} `json:"usagePlanId,omitempty"`
}

// DeleteUsagePlanKeyRequest represents the DeleteUsagePlanKeyRequest schema from the OpenAPI specification
type DeleteUsagePlanKeyRequest struct {
}

// GetMethodResponseRequest represents the GetMethodResponseRequest schema from the OpenAPI specification
type GetMethodResponseRequest struct {
}

// GetGatewayResponsesRequest represents the GetGatewayResponsesRequest schema from the OpenAPI specification
type GetGatewayResponsesRequest struct {
}

// PutMethodRequest represents the PutMethodRequest schema from the OpenAPI specification
type PutMethodRequest struct {
	Requestvalidatorid interface{} `json:"requestValidatorId,omitempty"`
	Apikeyrequired interface{} `json:"apiKeyRequired,omitempty"`
	Authorizationscopes interface{} `json:"authorizationScopes,omitempty"`
	Authorizationtype interface{} `json:"authorizationType"`
	Authorizerid interface{} `json:"authorizerId,omitempty"`
	Operationname interface{} `json:"operationName,omitempty"`
	Requestmodels interface{} `json:"requestModels,omitempty"`
	Requestparameters interface{} `json:"requestParameters,omitempty"`
}

// MethodmethodIntegration represents the MethodmethodIntegration schema from the OpenAPI specification
type MethodmethodIntegration struct {
	Httpmethod interface{} `json:"httpMethod,omitempty"`
	Requesttemplates interface{} `json:"requestTemplates,omitempty"`
	Tlsconfig IntegrationtlsConfig `json:"tlsConfig,omitempty"`
	Uri interface{} `json:"uri,omitempty"`
	Cachenamespace interface{} `json:"cacheNamespace,omitempty"`
	Connectionid interface{} `json:"connectionId,omitempty"`
	Connectiontype interface{} `json:"connectionType,omitempty"`
	Integrationresponses interface{} `json:"integrationResponses,omitempty"`
	Timeoutinmillis interface{} `json:"timeoutInMillis,omitempty"`
	Cachekeyparameters interface{} `json:"cacheKeyParameters,omitempty"`
	Passthroughbehavior interface{} `json:"passthroughBehavior,omitempty"`
	Requestparameters interface{} `json:"requestParameters,omitempty"`
	Contenthandling interface{} `json:"contentHandling,omitempty"`
	TypeField interface{} `json:"type,omitempty"`
	Credentials interface{} `json:"credentials,omitempty"`
}

// CreateDeploymentRequest represents the CreateDeploymentRequest schema from the OpenAPI specification
type CreateDeploymentRequest struct {
	Canarysettings CreateDeploymentRequestcanarySettings `json:"canarySettings,omitempty"`
	Description interface{} `json:"description,omitempty"`
	Stagedescription interface{} `json:"stageDescription,omitempty"`
	Stagename interface{} `json:"stageName,omitempty"`
	Tracingenabled interface{} `json:"tracingEnabled,omitempty"`
	Variables interface{} `json:"variables,omitempty"`
	Cacheclusterenabled interface{} `json:"cacheClusterEnabled,omitempty"`
	Cacheclustersize interface{} `json:"cacheClusterSize,omitempty"`
}

// GetStagesRequest represents the GetStagesRequest schema from the OpenAPI specification
type GetStagesRequest struct {
}

// GetSdkTypesRequest represents the GetSdkTypesRequest schema from the OpenAPI specification
type GetSdkTypesRequest struct {
}

// Tags represents the Tags schema from the OpenAPI specification
type Tags struct {
	Tags interface{} `json:"tags,omitempty"`
}

// GetStageRequest represents the GetStageRequest schema from the OpenAPI specification
type GetStageRequest struct {
}

// DeploymentCanarySettings represents the DeploymentCanarySettings schema from the OpenAPI specification
type DeploymentCanarySettings struct {
	Percenttraffic interface{} `json:"percentTraffic,omitempty"`
	Stagevariableoverrides interface{} `json:"stageVariableOverrides,omitempty"`
	Usestagecache interface{} `json:"useStageCache,omitempty"`
}

// CanarySettings represents the CanarySettings schema from the OpenAPI specification
type CanarySettings struct {
	Deploymentid interface{} `json:"deploymentId,omitempty"`
	Percenttraffic interface{} `json:"percentTraffic,omitempty"`
	Stagevariableoverrides interface{} `json:"stageVariableOverrides,omitempty"`
	Usestagecache interface{} `json:"useStageCache,omitempty"`
}

// FlushStageAuthorizersCacheRequest represents the FlushStageAuthorizersCacheRequest schema from the OpenAPI specification
type FlushStageAuthorizersCacheRequest struct {
}

// AccessLogSettings represents the AccessLogSettings schema from the OpenAPI specification
type AccessLogSettings struct {
	Destinationarn interface{} `json:"destinationArn,omitempty"`
	Format interface{} `json:"format,omitempty"`
}

// UntagResourceRequest represents the UntagResourceRequest schema from the OpenAPI specification
type UntagResourceRequest struct {
}

// TestInvokeMethodResponse represents the TestInvokeMethodResponse schema from the OpenAPI specification
type TestInvokeMethodResponse struct {
	Headers interface{} `json:"headers,omitempty"`
	Latency interface{} `json:"latency,omitempty"`
	Log interface{} `json:"log,omitempty"`
	Multivalueheaders interface{} `json:"multiValueHeaders,omitempty"`
	Status interface{} `json:"status,omitempty"`
	Body interface{} `json:"body,omitempty"`
}

// UpdateDocumentationPartRequest represents the UpdateDocumentationPartRequest schema from the OpenAPI specification
type UpdateDocumentationPartRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// UpdateAccountRequest represents the UpdateAccountRequest schema from the OpenAPI specification
type UpdateAccountRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// CreateDomainNameRequest represents the CreateDomainNameRequest schema from the OpenAPI specification
type CreateDomainNameRequest struct {
	Certificatebody interface{} `json:"certificateBody,omitempty"`
	Certificatename interface{} `json:"certificateName,omitempty"`
	Domainname interface{} `json:"domainName"`
	Mutualtlsauthentication MutualTlsAuthenticationInput `json:"mutualTlsAuthentication,omitempty"` // The mutual TLS authentication configuration for a custom domain name. If specified, API Gateway performs two-way authentication between the client and the server. Clients must present a trusted certificate to access your API.
	Ownershipverificationcertificatearn interface{} `json:"ownershipVerificationCertificateArn,omitempty"`
	Regionalcertificatename interface{} `json:"regionalCertificateName,omitempty"`
	Certificatearn interface{} `json:"certificateArn,omitempty"`
	Certificatechain interface{} `json:"certificateChain,omitempty"`
	Certificateprivatekey interface{} `json:"certificatePrivateKey,omitempty"`
	Endpointconfiguration DomainNameendpointConfiguration `json:"endpointConfiguration,omitempty"`
	Regionalcertificatearn interface{} `json:"regionalCertificateArn,omitempty"`
	Securitypolicy interface{} `json:"securityPolicy,omitempty"`
	Tags interface{} `json:"tags,omitempty"`
}

// PutRestApirequest represents the PutRestApirequest schema from the OpenAPI specification
type PutRestApirequest struct {
	Body string `json:"body"` // The PUT request body containing external API definitions. Currently, only OpenAPI definition JSON/YAML files are supported. The maximum size of the API definition file is 6MB.
}

// DeleteRequestValidatorRequest represents the DeleteRequestValidatorRequest schema from the OpenAPI specification
type DeleteRequestValidatorRequest struct {
}

// TestInvokeAuthorizerrequest represents the TestInvokeAuthorizerrequest schema from the OpenAPI specification
type TestInvokeAuthorizerrequest struct {
	Headers map[string]interface{} `json:"headers,omitempty"` // A key-value map of headers to simulate an incoming invocation request. This is where the incoming authorization token, or identity source, should be specified.
	Multivalueheaders map[string]interface{} `json:"multiValueHeaders,omitempty"` // The headers as a map from string to list of values to simulate an incoming invocation request. This is where the incoming authorization token, or identity source, may be specified.
	Pathwithquerystring string `json:"pathWithQueryString,omitempty"` // The URI path, including query string, of the simulated invocation request. Use this to specify path parameters and query string parameters.
	Stagevariables map[string]interface{} `json:"stageVariables,omitempty"` // A key-value map of stage variables to simulate an invocation on a deployed Stage.
	Additionalcontext map[string]interface{} `json:"additionalContext,omitempty"` // A key-value map of additional context variables.
	Body string `json:"body,omitempty"` // The simulated request body of an incoming invocation request.
}

// MapOfApiStageThrottleSettings represents the MapOfApiStageThrottleSettings schema from the OpenAPI specification
type MapOfApiStageThrottleSettings struct {
}

// Integration represents the Integration schema from the OpenAPI specification
type Integration struct {
	Passthroughbehavior interface{} `json:"passthroughBehavior,omitempty"`
	Requestparameters interface{} `json:"requestParameters,omitempty"`
	Contenthandling interface{} `json:"contentHandling,omitempty"`
	TypeField interface{} `json:"type,omitempty"`
	Credentials interface{} `json:"credentials,omitempty"`
	Httpmethod interface{} `json:"httpMethod,omitempty"`
	Requesttemplates interface{} `json:"requestTemplates,omitempty"`
	Tlsconfig IntegrationtlsConfig `json:"tlsConfig,omitempty"`
	Uri interface{} `json:"uri,omitempty"`
	Cachenamespace interface{} `json:"cacheNamespace,omitempty"`
	Connectionid interface{} `json:"connectionId,omitempty"`
	Connectiontype interface{} `json:"connectionType,omitempty"`
	Integrationresponses interface{} `json:"integrationResponses,omitempty"`
	Timeoutinmillis interface{} `json:"timeoutInMillis,omitempty"`
	Cachekeyparameters interface{} `json:"cacheKeyParameters,omitempty"`
}

// FlushStageCacheRequest represents the FlushStageCacheRequest schema from the OpenAPI specification
type FlushStageCacheRequest struct {
}

// DomainName represents the DomainName schema from the OpenAPI specification
type DomainName struct {
	Securitypolicy interface{} `json:"securityPolicy,omitempty"`
	Certificateuploaddate interface{} `json:"certificateUploadDate,omitempty"`
	Mutualtlsauthentication DomainNamemutualTlsAuthentication `json:"mutualTlsAuthentication,omitempty"`
	Certificatename interface{} `json:"certificateName,omitempty"`
	Domainnamestatusmessage interface{} `json:"domainNameStatusMessage,omitempty"`
	Distributionhostedzoneid interface{} `json:"distributionHostedZoneId,omitempty"`
	Ownershipverificationcertificatearn interface{} `json:"ownershipVerificationCertificateArn,omitempty"`
	Regionaldomainname interface{} `json:"regionalDomainName,omitempty"`
	Distributiondomainname interface{} `json:"distributionDomainName,omitempty"`
	Regionalcertificatearn interface{} `json:"regionalCertificateArn,omitempty"`
	Tags interface{} `json:"tags,omitempty"`
	Domainnamestatus interface{} `json:"domainNameStatus,omitempty"`
	Endpointconfiguration DomainNameendpointConfiguration `json:"endpointConfiguration,omitempty"`
	Regionalcertificatename interface{} `json:"regionalCertificateName,omitempty"`
	Domainname interface{} `json:"domainName,omitempty"`
	Regionalhostedzoneid interface{} `json:"regionalHostedZoneId,omitempty"`
	Certificatearn interface{} `json:"certificateArn,omitempty"`
}

// GetUsagePlanKeysRequest represents the GetUsagePlanKeysRequest schema from the OpenAPI specification
type GetUsagePlanKeysRequest struct {
}

// PutRestApiRequest represents the PutRestApiRequest schema from the OpenAPI specification
type PutRestApiRequest struct {
	Body interface{} `json:"body"`
}

// DeleteBasePathMappingRequest represents the DeleteBasePathMappingRequest schema from the OpenAPI specification
type DeleteBasePathMappingRequest struct {
}

// ApiKeyIds represents the ApiKeyIds schema from the OpenAPI specification
type ApiKeyIds struct {
	Warnings interface{} `json:"warnings,omitempty"`
	Ids interface{} `json:"ids,omitempty"`
}

// GetUsagePlanKeyRequest represents the GetUsagePlanKeyRequest schema from the OpenAPI specification
type GetUsagePlanKeyRequest struct {
}

// GenerateClientCertificateRequest represents the GenerateClientCertificateRequest schema from the OpenAPI specification
type GenerateClientCertificateRequest struct {
	Description interface{} `json:"description,omitempty"`
	Tags interface{} `json:"tags,omitempty"`
}

// GetMethodRequest represents the GetMethodRequest schema from the OpenAPI specification
type GetMethodRequest struct {
}

// TestInvokeMethodrequest represents the TestInvokeMethodrequest schema from the OpenAPI specification
type TestInvokeMethodrequest struct {
	Pathwithquerystring string `json:"pathWithQueryString,omitempty"` // The URI path, including query string, of the simulated invocation request. Use this to specify path parameters and query string parameters.
	Stagevariables map[string]interface{} `json:"stageVariables,omitempty"` // A key-value map of stage variables to simulate an invocation on a deployed Stage.
	Body string `json:"body,omitempty"` // The simulated request body of an incoming invocation request.
	Clientcertificateid string `json:"clientCertificateId,omitempty"` // A ClientCertificate identifier to use in the test invocation. API Gateway will use the certificate when making the HTTPS request to the defined back-end endpoint.
	Headers map[string]interface{} `json:"headers,omitempty"` // A key-value map of headers to simulate an incoming invocation request.
	Multivalueheaders map[string]interface{} `json:"multiValueHeaders,omitempty"` // The headers as a map from string to list of values to simulate an incoming invocation request.
}

// DeleteVpcLinkRequest represents the DeleteVpcLinkRequest schema from the OpenAPI specification
type DeleteVpcLinkRequest struct {
}

// Method represents the Method schema from the OpenAPI specification
type Method struct {
	Authorizationtype interface{} `json:"authorizationType,omitempty"`
	Authorizerid interface{} `json:"authorizerId,omitempty"`
	Methodresponses interface{} `json:"methodResponses,omitempty"`
	Httpmethod interface{} `json:"httpMethod,omitempty"`
	Methodintegration MethodmethodIntegration `json:"methodIntegration,omitempty"`
	Operationname interface{} `json:"operationName,omitempty"`
	Requestmodels interface{} `json:"requestModels,omitempty"`
	Apikeyrequired interface{} `json:"apiKeyRequired,omitempty"`
	Authorizationscopes interface{} `json:"authorizationScopes,omitempty"`
	Requestvalidatorid interface{} `json:"requestValidatorId,omitempty"`
	Requestparameters interface{} `json:"requestParameters,omitempty"`
}

// DeleteClientCertificateRequest represents the DeleteClientCertificateRequest schema from the OpenAPI specification
type DeleteClientCertificateRequest struct {
}

// GetModelTemplateRequest represents the GetModelTemplateRequest schema from the OpenAPI specification
type GetModelTemplateRequest struct {
}

// MapOfMethodSnapshot represents the MapOfMethodSnapshot schema from the OpenAPI specification
type MapOfMethodSnapshot struct {
}

// UpdateBasePathMappingRequest represents the UpdateBasePathMappingRequest schema from the OpenAPI specification
type UpdateBasePathMappingRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// DeleteMethodRequest represents the DeleteMethodRequest schema from the OpenAPI specification
type DeleteMethodRequest struct {
}

// CreateDocumentationPartRequestlocation represents the CreateDocumentationPartRequestlocation schema from the OpenAPI specification
type CreateDocumentationPartRequestlocation struct {
	Statuscode interface{} `json:"statusCode,omitempty"`
	TypeField interface{} `json:"type"`
	Method interface{} `json:"method,omitempty"`
	Name interface{} `json:"name,omitempty"`
	Path interface{} `json:"path,omitempty"`
}

// PutIntegrationrequest represents the PutIntegrationrequest schema from the OpenAPI specification
type PutIntegrationrequest struct {
	Timeoutinmillis int `json:"timeoutInMillis,omitempty"` // Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
	Cachekeyparameters []string `json:"cacheKeyParameters,omitempty"` // A list of request parameters whose values API Gateway caches. To be valid values for <code>cacheKeyParameters</code>, these parameters must also be specified for Method <code>requestParameters</code>.
	Cachenamespace string `json:"cacheNamespace,omitempty"` // Specifies a group of related cached parameters. By default, API Gateway uses the resource ID as the <code>cacheNamespace</code>. You can specify the same <code>cacheNamespace</code> across resources to return the same cached data for requests to different resources.
	Httpmethod string `json:"httpMethod,omitempty"` // The HTTP method for the integration.
	Passthroughbehavior string `json:"passthroughBehavior,omitempty"` // Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the <code>requestTemplates</code> property on the Integration resource. There are three valid values: <code>WHEN_NO_MATCH</code>, <code>WHEN_NO_TEMPLATES</code>, and <code>NEVER</code>.
	Connectionid string `json:"connectionId,omitempty"` // The ID of the VpcLink used for the integration. Specify this value only if you specify <code>VPC_LINK</code> as the connection type.
	Tlsconfig PutIntegrationrequesttlsConfig `json:"tlsConfig,omitempty"` // Specifies the TLS configuration for an integration.
	Uri string `json:"uri,omitempty"` // Specifies Uniform Resource Identifier (URI) of the integration endpoint. For HTTP or <code>HTTP_PROXY</code> integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where <code>connectionType</code> is not <code>VPC_LINK</code>, or private integration, where <code>connectionType</code> is <code>VPC_LINK</code>. For a private HTTP integration, the URI is not used for routing. For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the URI is of the form <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api</code>}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated Amazon Web Services service (e.g., s3); and {subdomain} is a designated subdomain supported by certain Amazon Web Services service for fast host-name lookup. action can be used for an Amazon Web Services service action-based API, using an Action={name}&amp;{p1}={v1}&amp;p2={v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an Amazon Web Services service path-based API. The ensuing service_api refers to the path to an Amazon Web Services service resource, including the region of the integrated Amazon Web Services service, if applicable. For example, for integration with the S3 API of <code>GetObject</code>, the <code>uri</code> can be either <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code> or <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>.
	Credentials string `json:"credentials,omitempty"` // Specifies whether credentials are required for a put integration.
	Requestparameters map[string]interface{} `json:"requestParameters,omitempty"` // A key-value map specifying request parameters that are passed from the method request to the back end. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the back end. The method request parameter value must match the pattern of <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and <code>name</code> must be a valid and unique method request parameter name.
	Requesttemplates map[string]interface{} `json:"requestTemplates,omitempty"` // Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value.
	TypeField string `json:"type"` // The integration type. The valid value is <code>HTTP</code> for integrating an API method with an HTTP backend; <code>AWS</code> with any AWS service endpoints; <code>MOCK</code> for testing without actually invoking the backend; <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration; <code>AWS_PROXY</code> for integrating with the Lambda proxy integration.
	Connectiontype string `json:"connectionType,omitempty"` // The type of the network connection to the integration endpoint. The valid value is <code>INTERNET</code> for connections through the public routable internet or <code>VPC_LINK</code> for private connections between API Gateway and a network load balancer in a VPC. The default value is <code>INTERNET</code>.
	Contenthandling string `json:"contentHandling,omitempty"` // <p>Specifies how to handle request payload content type conversions. Supported values are <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p> <p>If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the <code>passthroughBehavior</code> is configured to support payload pass-through.</p>
}

// UpdateGatewayResponseRequest represents the UpdateGatewayResponseRequest schema from the OpenAPI specification
type UpdateGatewayResponseRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// GetResourcesRequest represents the GetResourcesRequest schema from the OpenAPI specification
type GetResourcesRequest struct {
}

// GetBasePathMappingRequest represents the GetBasePathMappingRequest schema from the OpenAPI specification
type GetBasePathMappingRequest struct {
}

// DocumentationPart represents the DocumentationPart schema from the OpenAPI specification
type DocumentationPart struct {
	Id interface{} `json:"id,omitempty"`
	Location DocumentationPartlocation `json:"location,omitempty"`
	Properties interface{} `json:"properties,omitempty"` // A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., <code>"{ \"description\": \"The API does ...\" }"</code>. Only OpenAPI-compliant documentation-related fields from the properties map are exported and, hence, published as part of the API entity definitions, while the original documentation parts are exported in a OpenAPI extension of <code>x-amazon-apigateway-documentation</code>.
}

// CreateUsagePlanrequestquota represents the CreateUsagePlanrequestquota schema from the OpenAPI specification
type CreateUsagePlanrequestquota struct {
	Limit interface{} `json:"limit,omitempty"`
	Offset interface{} `json:"offset,omitempty"`
	Period interface{} `json:"period,omitempty"`
}

// ImportApiKeysrequest represents the ImportApiKeysrequest schema from the OpenAPI specification
type ImportApiKeysrequest struct {
	Body string `json:"body"` // The payload of the POST request to import API keys. For the payload format, see API Key File Format.
}

// PutIntegrationrequesttlsConfig represents the PutIntegrationrequesttlsConfig schema from the OpenAPI specification
type PutIntegrationrequesttlsConfig struct {
	Insecureskipverification interface{} `json:"insecureSkipVerification,omitempty"`
}

// CreateStagerequest represents the CreateStagerequest schema from the OpenAPI specification
type CreateStagerequest struct {
	Cacheclustersize string `json:"cacheClusterSize,omitempty"` // Returns the size of the CacheCluster.
	Documentationversion string `json:"documentationVersion,omitempty"` // The version of the associated API documentation.
	Cacheclusterenabled bool `json:"cacheClusterEnabled,omitempty"` // Whether cache clustering is enabled for the stage.
	Canarysettings CreateStagerequestcanarySettings `json:"canarySettings,omitempty"` // Configuration settings of a canary deployment.
	Stagename string `json:"stageName"` // The name for the Stage resource. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
	Tracingenabled bool `json:"tracingEnabled,omitempty"` // Specifies whether active tracing with X-ray is enabled for the Stage.
	Description string `json:"description,omitempty"` // The description of the Stage resource.
	Variables map[string]interface{} `json:"variables,omitempty"` // A map that defines the stage variables for the new Stage resource. Variable names can have alphanumeric and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
	Deploymentid string `json:"deploymentId"` // The identifier of the Deployment resource for the Stage resource.
	Tags map[string]interface{} `json:"tags,omitempty"` // The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
}

// VpcLinks represents the VpcLinks schema from the OpenAPI specification
type VpcLinks struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// PutIntegrationRequest represents the PutIntegrationRequest schema from the OpenAPI specification
type PutIntegrationRequest struct {
	Connectiontype interface{} `json:"connectionType,omitempty"`
	Requestparameters interface{} `json:"requestParameters,omitempty"`
	Requesttemplates interface{} `json:"requestTemplates,omitempty"`
	Timeoutinmillis interface{} `json:"timeoutInMillis,omitempty"`
	Cachenamespace interface{} `json:"cacheNamespace,omitempty"`
	Connectionid interface{} `json:"connectionId,omitempty"`
	Integrationhttpmethod interface{} `json:"integrationHttpMethod,omitempty"`
	Tlsconfig TlsConfig `json:"tlsConfig,omitempty"` // Specifies the TLS configuration for an integration.
	TypeField interface{} `json:"type"`
	Uri interface{} `json:"uri,omitempty"`
	Cachekeyparameters interface{} `json:"cacheKeyParameters,omitempty"`
	Contenthandling interface{} `json:"contentHandling,omitempty"`
	Credentials interface{} `json:"credentials,omitempty"`
	Passthroughbehavior interface{} `json:"passthroughBehavior,omitempty"`
}

// DeleteAuthorizerRequest represents the DeleteAuthorizerRequest schema from the OpenAPI specification
type DeleteAuthorizerRequest struct {
}

// ImportDocumentationPartsrequest represents the ImportDocumentationPartsrequest schema from the OpenAPI specification
type ImportDocumentationPartsrequest struct {
	Body string `json:"body"` // Raw byte array representing the to-be-imported documentation parts. To import from an OpenAPI file, this is a JSON object.
}

// DeleteDocumentationVersionRequest represents the DeleteDocumentationVersionRequest schema from the OpenAPI specification
type DeleteDocumentationVersionRequest struct {
}

// RestApis represents the RestApis schema from the OpenAPI specification
type RestApis struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// RequestValidators represents the RequestValidators schema from the OpenAPI specification
type RequestValidators struct {
	Position string `json:"position,omitempty"`
	Items interface{} `json:"items,omitempty"`
}

// TestInvokeMethodRequest represents the TestInvokeMethodRequest schema from the OpenAPI specification
type TestInvokeMethodRequest struct {
	Stagevariables interface{} `json:"stageVariables,omitempty"`
	Body interface{} `json:"body,omitempty"`
	Clientcertificateid interface{} `json:"clientCertificateId,omitempty"`
	Headers interface{} `json:"headers,omitempty"`
	Multivalueheaders interface{} `json:"multiValueHeaders,omitempty"`
	Pathwithquerystring interface{} `json:"pathWithQueryString,omitempty"`
}

// StageaccessLogSettings represents the StageaccessLogSettings schema from the OpenAPI specification
type StageaccessLogSettings struct {
	Format interface{} `json:"format,omitempty"`
	Destinationarn interface{} `json:"destinationArn,omitempty"`
}

// DocumentationVersions represents the DocumentationVersions schema from the OpenAPI specification
type DocumentationVersions struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// UpdateModelRequest represents the UpdateModelRequest schema from the OpenAPI specification
type UpdateModelRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// ExportResponse represents the ExportResponse schema from the OpenAPI specification
type ExportResponse struct {
	Body interface{} `json:"body,omitempty"`
}

// DeleteMethodResponseRequest represents the DeleteMethodResponseRequest schema from the OpenAPI specification
type DeleteMethodResponseRequest struct {
}

// Stages represents the Stages schema from the OpenAPI specification
type Stages struct {
	Item interface{} `json:"item,omitempty"`
}

// TestInvokeAuthorizerRequest represents the TestInvokeAuthorizerRequest schema from the OpenAPI specification
type TestInvokeAuthorizerRequest struct {
	Headers interface{} `json:"headers,omitempty"`
	Multivalueheaders interface{} `json:"multiValueHeaders,omitempty"`
	Pathwithquerystring interface{} `json:"pathWithQueryString,omitempty"`
	Stagevariables interface{} `json:"stageVariables,omitempty"`
	Additionalcontext interface{} `json:"additionalContext,omitempty"`
	Body interface{} `json:"body,omitempty"`
}

// GetRestApiRequest represents the GetRestApiRequest schema from the OpenAPI specification
type GetRestApiRequest struct {
}

// PutGatewayResponseRequest represents the PutGatewayResponseRequest schema from the OpenAPI specification
type PutGatewayResponseRequest struct {
	Responsetemplates interface{} `json:"responseTemplates,omitempty"`
	Statuscode interface{} `json:"statusCode,omitempty"`
	Responseparameters interface{} `json:"responseParameters,omitempty"`
}

// DeleteResourceRequest represents the DeleteResourceRequest schema from the OpenAPI specification
type DeleteResourceRequest struct {
}

// CreateStagerequestcanarySettings represents the CreateStagerequestcanarySettings schema from the OpenAPI specification
type CreateStagerequestcanarySettings struct {
	Deploymentid interface{} `json:"deploymentId,omitempty"`
	Percenttraffic interface{} `json:"percentTraffic,omitempty"`
	Stagevariableoverrides interface{} `json:"stageVariableOverrides,omitempty"`
	Usestagecache interface{} `json:"useStageCache,omitempty"`
}

// CreateDomainNamerequest represents the CreateDomainNamerequest schema from the OpenAPI specification
type CreateDomainNamerequest struct {
	Certificatename string `json:"certificateName,omitempty"` // The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain name.
	Domainname string `json:"domainName"` // The name of the DomainName resource.
	Securitypolicy string `json:"securityPolicy,omitempty"` // The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are <code>TLS_1_0</code> and <code>TLS_1_2</code>.
	Certificatearn string `json:"certificateArn,omitempty"` // The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
	Endpointconfiguration CreateDomainNamerequestendpointConfiguration `json:"endpointConfiguration,omitempty"` // The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom domain name (DomainName) has.
	Regionalcertificatename string `json:"regionalCertificateName,omitempty"` // The user-friendly name of the certificate that will be used by regional endpoint for this domain name.
	Regionalcertificatearn string `json:"regionalCertificateArn,omitempty"` // The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name. AWS Certificate Manager is the only supported source.
	Tags map[string]interface{} `json:"tags,omitempty"` // The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
	Certificateprivatekey string `json:"certificatePrivateKey,omitempty"` // [Deprecated] Your edge-optimized endpoint's domain name certificate's private key.
	Mutualtlsauthentication CreateDomainNamerequestmutualTlsAuthentication `json:"mutualTlsAuthentication,omitempty"` // The mutual TLS authentication configuration for a custom domain name. If specified, API Gateway performs two-way authentication between the client and the server. Clients must present a trusted certificate to access your API.
	Ownershipverificationcertificatearn string `json:"ownershipVerificationCertificateArn,omitempty"` // The ARN of the public certificate issued by ACM to validate ownership of your custom domain. Only required when configuring mutual TLS and using an ACM imported or private CA certificate ARN as the regionalCertificateArn.
	Certificatebody string `json:"certificateBody,omitempty"` // [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this domain name provided by your certificate authority.
	Certificatechain string `json:"certificateChain,omitempty"` // [Deprecated] The intermediate certificates and optionally the root certificate, one after the other without any blank lines, used by an edge-optimized endpoint for this domain name. If you include the root certificate, your certificate chain must start with intermediate certificates and end with the root certificate. Use the intermediate certificates that were provided by your certificate authority. Do not include any intermediaries that are not in the chain of trust path.
}

// Resource represents the Resource schema from the OpenAPI specification
type Resource struct {
	Parentid interface{} `json:"parentId,omitempty"`
	Path interface{} `json:"path,omitempty"`
	Pathpart interface{} `json:"pathPart,omitempty"`
	Resourcemethods interface{} `json:"resourceMethods,omitempty"`
	Id interface{} `json:"id,omitempty"`
}

// CreateUsagePlanKeyrequest represents the CreateUsagePlanKeyrequest schema from the OpenAPI specification
type CreateUsagePlanKeyrequest struct {
	Keyid string `json:"keyId"` // The identifier of a UsagePlanKey resource for a plan customer.
	Keytype string `json:"keyType"` // The type of a UsagePlanKey resource for a plan customer.
}

// MapOfIntegrationResponse represents the MapOfIntegrationResponse schema from the OpenAPI specification
type MapOfIntegrationResponse struct {
}

// CreateModelrequest represents the CreateModelrequest schema from the OpenAPI specification
type CreateModelrequest struct {
	Contenttype string `json:"contentType"` // The content-type for the model.
	Description string `json:"description,omitempty"` // The description of the model.
	Name string `json:"name"` // The name of the model. Must be alphanumeric.
	Schema string `json:"schema,omitempty"` // The schema for the model. For <code>application/json</code> models, this should be JSON schema draft 4 model.
}

// CreateDocumentationPartrequestlocation represents the CreateDocumentationPartrequestlocation schema from the OpenAPI specification
type CreateDocumentationPartrequestlocation struct {
	TypeField interface{} `json:"type,omitempty"`
	Method interface{} `json:"method,omitempty"`
	Name interface{} `json:"name,omitempty"`
	Path interface{} `json:"path,omitempty"`
	Statuscode interface{} `json:"statusCode,omitempty"`
}

// MapOfMethodSettings represents the MapOfMethodSettings schema from the OpenAPI specification
type MapOfMethodSettings struct {
}

// UsagePlanthrottle represents the UsagePlanthrottle schema from the OpenAPI specification
type UsagePlanthrottle struct {
	Burstlimit interface{} `json:"burstLimit,omitempty"`
	Ratelimit interface{} `json:"rateLimit,omitempty"`
}

// CreateDeploymentrequestcanarySettings represents the CreateDeploymentrequestcanarySettings schema from the OpenAPI specification
type CreateDeploymentrequestcanarySettings struct {
	Percenttraffic interface{} `json:"percentTraffic,omitempty"`
	Stagevariableoverrides interface{} `json:"stageVariableOverrides,omitempty"`
	Usestagecache interface{} `json:"useStageCache,omitempty"`
}

// DeleteRestApiRequest represents the DeleteRestApiRequest schema from the OpenAPI specification
type DeleteRestApiRequest struct {
}

// CreateDocumentationVersionrequest represents the CreateDocumentationVersionrequest schema from the OpenAPI specification
type CreateDocumentationVersionrequest struct {
	Documentationversion string `json:"documentationVersion"` // The version identifier of the new snapshot.
	Stagename string `json:"stageName,omitempty"` // The stage name to be associated with the new documentation snapshot.
	Description string `json:"description,omitempty"` // A description about the new documentation snapshot.
}

// UpdateDocumentationVersionRequest represents the UpdateDocumentationVersionRequest schema from the OpenAPI specification
type UpdateDocumentationVersionRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// UpdateStageRequest represents the UpdateStageRequest schema from the OpenAPI specification
type UpdateStageRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// DeleteDocumentationPartRequest represents the DeleteDocumentationPartRequest schema from the OpenAPI specification
type DeleteDocumentationPartRequest struct {
}

// PatchOperation represents the PatchOperation schema from the OpenAPI specification
type PatchOperation struct {
	From interface{} `json:"from,omitempty"`
	Op interface{} `json:"op,omitempty"`
	Path interface{} `json:"path,omitempty"`
	Value interface{} `json:"value,omitempty"`
}

// MethodSetting represents the MethodSetting schema from the OpenAPI specification
type MethodSetting struct {
	Throttlingburstlimit interface{} `json:"throttlingBurstLimit,omitempty"`
	Unauthorizedcachecontrolheaderstrategy interface{} `json:"unauthorizedCacheControlHeaderStrategy,omitempty"`
	Datatraceenabled interface{} `json:"dataTraceEnabled,omitempty"`
	Logginglevel interface{} `json:"loggingLevel,omitempty"`
	Requireauthorizationforcachecontrol interface{} `json:"requireAuthorizationForCacheControl,omitempty"`
	Cachedataencrypted interface{} `json:"cacheDataEncrypted,omitempty"`
	Metricsenabled interface{} `json:"metricsEnabled,omitempty"`
	Throttlingratelimit interface{} `json:"throttlingRateLimit,omitempty"`
	Cachettlinseconds interface{} `json:"cacheTtlInSeconds,omitempty"`
	Cachingenabled interface{} `json:"cachingEnabled,omitempty"`
}

// GetModelRequest represents the GetModelRequest schema from the OpenAPI specification
type GetModelRequest struct {
}

// MethodResponse represents the MethodResponse schema from the OpenAPI specification
type MethodResponse struct {
	Statuscode interface{} `json:"statusCode,omitempty"`
	Responsemodels interface{} `json:"responseModels,omitempty"`
	Responseparameters interface{} `json:"responseParameters,omitempty"`
}

// CreateStageRequest represents the CreateStageRequest schema from the OpenAPI specification
type CreateStageRequest struct {
	Variables interface{} `json:"variables,omitempty"`
	Documentationversion interface{} `json:"documentationVersion,omitempty"`
	Tags interface{} `json:"tags,omitempty"`
	Tracingenabled interface{} `json:"tracingEnabled,omitempty"`
	Cacheclusterenabled interface{} `json:"cacheClusterEnabled,omitempty"`
	Canarysettings CreateStageRequestcanarySettings `json:"canarySettings,omitempty"`
	Stagename interface{} `json:"stageName"`
	Cacheclustersize interface{} `json:"cacheClusterSize,omitempty"`
	Deploymentid interface{} `json:"deploymentId"`
	Description interface{} `json:"description,omitempty"`
}

// UpdateUsagePlanRequest represents the UpdateUsagePlanRequest schema from the OpenAPI specification
type UpdateUsagePlanRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// SdkTypes represents the SdkTypes schema from the OpenAPI specification
type SdkTypes struct {
	Position string `json:"position,omitempty"`
	Items interface{} `json:"items,omitempty"`
}

// GetExportRequest represents the GetExportRequest schema from the OpenAPI specification
type GetExportRequest struct {
}

// ImportRestApiRequest represents the ImportRestApiRequest schema from the OpenAPI specification
type ImportRestApiRequest struct {
	Body interface{} `json:"body"`
}

// GetIntegrationRequest represents the GetIntegrationRequest schema from the OpenAPI specification
type GetIntegrationRequest struct {
}

// Models represents the Models schema from the OpenAPI specification
type Models struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// GetClientCertificatesRequest represents the GetClientCertificatesRequest schema from the OpenAPI specification
type GetClientCertificatesRequest struct {
}

// MapOfMethodResponse represents the MapOfMethodResponse schema from the OpenAPI specification
type MapOfMethodResponse struct {
}

// UpdateVpcLinkRequest represents the UpdateVpcLinkRequest schema from the OpenAPI specification
type UpdateVpcLinkRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// TestInvokeAuthorizerResponse represents the TestInvokeAuthorizerResponse schema from the OpenAPI specification
type TestInvokeAuthorizerResponse struct {
	Log interface{} `json:"log,omitempty"`
	Policy interface{} `json:"policy,omitempty"`
	Principalid interface{} `json:"principalId,omitempty"`
	Authorization interface{} `json:"authorization,omitempty"`
	Claims interface{} `json:"claims,omitempty"`
	Clientstatus interface{} `json:"clientStatus,omitempty"`
	Latency interface{} `json:"latency,omitempty"`
}

// CreateDomainNamerequestmutualTlsAuthentication represents the CreateDomainNamerequestmutualTlsAuthentication schema from the OpenAPI specification
type CreateDomainNamerequestmutualTlsAuthentication struct {
	Truststoreuri interface{} `json:"truststoreUri,omitempty"`
	Truststoreversion interface{} `json:"truststoreVersion,omitempty"`
}

// QuotaSettings represents the QuotaSettings schema from the OpenAPI specification
type QuotaSettings struct {
	Limit interface{} `json:"limit,omitempty"`
	Offset interface{} `json:"offset,omitempty"`
	Period interface{} `json:"period,omitempty"`
}

// CreateUsagePlanRequestquota represents the CreateUsagePlanRequestquota schema from the OpenAPI specification
type CreateUsagePlanRequestquota struct {
	Limit interface{} `json:"limit,omitempty"`
	Offset interface{} `json:"offset,omitempty"`
	Period interface{} `json:"period,omitempty"`
}

// GetGatewayResponseRequest represents the GetGatewayResponseRequest schema from the OpenAPI specification
type GetGatewayResponseRequest struct {
}

// Account represents the Account schema from the OpenAPI specification
type Account struct {
	Throttlesettings AccountthrottleSettings `json:"throttleSettings,omitempty"`
	Apikeyversion interface{} `json:"apiKeyVersion,omitempty"`
	Cloudwatchrolearn interface{} `json:"cloudwatchRoleArn,omitempty"`
	Features interface{} `json:"features,omitempty"`
}

// DeleteGatewayResponseRequest represents the DeleteGatewayResponseRequest schema from the OpenAPI specification
type DeleteGatewayResponseRequest struct {
}

// DeleteModelRequest represents the DeleteModelRequest schema from the OpenAPI specification
type DeleteModelRequest struct {
}

// CreateDocumentationPartrequest represents the CreateDocumentationPartrequest schema from the OpenAPI specification
type CreateDocumentationPartrequest struct {
	Location CreateDocumentationPartrequestlocation `json:"location"` // Specifies the target API entity to which the documentation applies.
	Properties string `json:"properties"` // The new documentation content map of the targeted API entity. Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be exported and, hence, published.
}

// PutMethodResponseRequest represents the PutMethodResponseRequest schema from the OpenAPI specification
type PutMethodResponseRequest struct {
	Responsemodels interface{} `json:"responseModels,omitempty"`
	Responseparameters interface{} `json:"responseParameters,omitempty"`
}

// GetApiKeyRequest represents the GetApiKeyRequest schema from the OpenAPI specification
type GetApiKeyRequest struct {
}

// CreateUsagePlanKeyRequest represents the CreateUsagePlanKeyRequest schema from the OpenAPI specification
type CreateUsagePlanKeyRequest struct {
	Keyid interface{} `json:"keyId"`
	Keytype interface{} `json:"keyType"`
}

// GetRequestValidatorRequest represents the GetRequestValidatorRequest schema from the OpenAPI specification
type GetRequestValidatorRequest struct {
}

// MapOfStringToString represents the MapOfStringToString schema from the OpenAPI specification
type MapOfStringToString struct {
}

// ApiKeys represents the ApiKeys schema from the OpenAPI specification
type ApiKeys struct {
	Position string `json:"position,omitempty"`
	Warnings interface{} `json:"warnings,omitempty"`
	Items interface{} `json:"items,omitempty"`
}

// GetDomainNamesRequest represents the GetDomainNamesRequest schema from the OpenAPI specification
type GetDomainNamesRequest struct {
}

// UsagePlan represents the UsagePlan schema from the OpenAPI specification
type UsagePlan struct {
	Throttle UsagePlanthrottle `json:"throttle,omitempty"`
	Apistages interface{} `json:"apiStages,omitempty"`
	Description interface{} `json:"description,omitempty"`
	Id interface{} `json:"id,omitempty"`
	Name interface{} `json:"name,omitempty"`
	Productcode interface{} `json:"productCode,omitempty"`
	Quota UsagePlanquota `json:"quota,omitempty"`
	Tags interface{} `json:"tags,omitempty"`
}

// TlsConfig represents the TlsConfig schema from the OpenAPI specification
type TlsConfig struct {
	Insecureskipverification interface{} `json:"insecureSkipVerification,omitempty"`
}

// CreateVpcLinkRequest represents the CreateVpcLinkRequest schema from the OpenAPI specification
type CreateVpcLinkRequest struct {
	Name interface{} `json:"name"`
	Tags interface{} `json:"tags,omitempty"`
	Targetarns interface{} `json:"targetArns"`
	Description interface{} `json:"description,omitempty"`
}

// Deployment represents the Deployment schema from the OpenAPI specification
type Deployment struct {
	Description interface{} `json:"description,omitempty"`
	Id interface{} `json:"id,omitempty"`
	Apisummary interface{} `json:"apiSummary,omitempty"`
	Createddate interface{} `json:"createdDate,omitempty"`
}

// BasePathMapping represents the BasePathMapping schema from the OpenAPI specification
type BasePathMapping struct {
	Basepath interface{} `json:"basePath,omitempty"`
	Restapiid interface{} `json:"restApiId,omitempty"`
	Stage interface{} `json:"stage,omitempty"`
}

// CreateUsagePlanRequestthrottle represents the CreateUsagePlanRequestthrottle schema from the OpenAPI specification
type CreateUsagePlanRequestthrottle struct {
	Burstlimit interface{} `json:"burstLimit,omitempty"`
	Ratelimit interface{} `json:"rateLimit,omitempty"`
}

// ThrottleSettings represents the ThrottleSettings schema from the OpenAPI specification
type ThrottleSettings struct {
	Burstlimit interface{} `json:"burstLimit,omitempty"`
	Ratelimit interface{} `json:"rateLimit,omitempty"`
}

// StageKey represents the StageKey schema from the OpenAPI specification
type StageKey struct {
	Restapiid interface{} `json:"restApiId,omitempty"`
	Stagename interface{} `json:"stageName,omitempty"`
}

// TagResourceRequest represents the TagResourceRequest schema from the OpenAPI specification
type TagResourceRequest struct {
	Tags interface{} `json:"tags"`
}

// CreateUsagePlanrequest represents the CreateUsagePlanrequest schema from the OpenAPI specification
type CreateUsagePlanrequest struct {
	Tags map[string]interface{} `json:"tags,omitempty"` // The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
	Throttle CreateUsagePlanrequestthrottle `json:"throttle,omitempty"` // The API request rate limits.
	Apistages []ApiStage `json:"apiStages,omitempty"` // The associated API stages of the usage plan.
	Description string `json:"description,omitempty"` // The description of the usage plan.
	Name string `json:"name"` // The name of the usage plan.
	Quota CreateUsagePlanrequestquota `json:"quota,omitempty"` // Quotas configured for a usage plan.
}

// DocumentationPartIds represents the DocumentationPartIds schema from the OpenAPI specification
type DocumentationPartIds struct {
	Warnings interface{} `json:"warnings,omitempty"`
	Ids interface{} `json:"ids,omitempty"`
}

// GetAuthorizersRequest represents the GetAuthorizersRequest schema from the OpenAPI specification
type GetAuthorizersRequest struct {
}

// VpcLink represents the VpcLink schema from the OpenAPI specification
type VpcLink struct {
	Statusmessage interface{} `json:"statusMessage,omitempty"`
	Tags interface{} `json:"tags,omitempty"`
	Targetarns interface{} `json:"targetArns,omitempty"`
	Description interface{} `json:"description,omitempty"`
	Id interface{} `json:"id,omitempty"`
	Name interface{} `json:"name,omitempty"`
	Status interface{} `json:"status,omitempty"`
}

// GetRestApisRequest represents the GetRestApisRequest schema from the OpenAPI specification
type GetRestApisRequest struct {
}

// GetSdkRequest represents the GetSdkRequest schema from the OpenAPI specification
type GetSdkRequest struct {
}

// GetTagsRequest represents the GetTagsRequest schema from the OpenAPI specification
type GetTagsRequest struct {
}

// UpdateRequestValidatorRequest represents the UpdateRequestValidatorRequest schema from the OpenAPI specification
type UpdateRequestValidatorRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// GetDocumentationPartRequest represents the GetDocumentationPartRequest schema from the OpenAPI specification
type GetDocumentationPartRequest struct {
}

// RequestValidator represents the RequestValidator schema from the OpenAPI specification
type RequestValidator struct {
	Id interface{} `json:"id,omitempty"`
	Name interface{} `json:"name,omitempty"`
	Validaterequestbody interface{} `json:"validateRequestBody,omitempty"`
	Validaterequestparameters interface{} `json:"validateRequestParameters,omitempty"`
}

// GetDomainNameRequest represents the GetDomainNameRequest schema from the OpenAPI specification
type GetDomainNameRequest struct {
}

// GetUsagePlanRequest represents the GetUsagePlanRequest schema from the OpenAPI specification
type GetUsagePlanRequest struct {
}

// GetDeploymentRequest represents the GetDeploymentRequest schema from the OpenAPI specification
type GetDeploymentRequest struct {
}

// GetApiKeysRequest represents the GetApiKeysRequest schema from the OpenAPI specification
type GetApiKeysRequest struct {
}

// SdkType represents the SdkType schema from the OpenAPI specification
type SdkType struct {
	Id interface{} `json:"id,omitempty"`
	Configurationproperties interface{} `json:"configurationProperties,omitempty"`
	Description interface{} `json:"description,omitempty"`
	Friendlyname interface{} `json:"friendlyName,omitempty"`
}

// DocumentationPartlocation represents the DocumentationPartlocation schema from the OpenAPI specification
type DocumentationPartlocation struct {
	Path interface{} `json:"path,omitempty"`
	Statuscode interface{} `json:"statusCode,omitempty"`
	TypeField interface{} `json:"type"`
	Method interface{} `json:"method,omitempty"`
	Name interface{} `json:"name,omitempty"`
}

// UpdateAuthorizerRequest represents the UpdateAuthorizerRequest schema from the OpenAPI specification
type UpdateAuthorizerRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// CreateResourcerequest represents the CreateResourcerequest schema from the OpenAPI specification
type CreateResourcerequest struct {
	Pathpart string `json:"pathPart"` // The last path segment for this resource.
}

// CreateModelRequest represents the CreateModelRequest schema from the OpenAPI specification
type CreateModelRequest struct {
	Contenttype interface{} `json:"contentType"`
	Description interface{} `json:"description,omitempty"`
	Name interface{} `json:"name"`
	Schema interface{} `json:"schema,omitempty"`
}

// UpdateDomainNameRequest represents the UpdateDomainNameRequest schema from the OpenAPI specification
type UpdateDomainNameRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// Template represents the Template schema from the OpenAPI specification
type Template struct {
	Value interface{} `json:"value,omitempty"`
}

// UpdateResourceRequest represents the UpdateResourceRequest schema from the OpenAPI specification
type UpdateResourceRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// GetResourceRequest represents the GetResourceRequest schema from the OpenAPI specification
type GetResourceRequest struct {
}

// IntegrationResponse represents the IntegrationResponse schema from the OpenAPI specification
type IntegrationResponse struct {
	Selectionpattern interface{} `json:"selectionPattern,omitempty"`
	Statuscode interface{} `json:"statusCode,omitempty"`
	Contenthandling interface{} `json:"contentHandling,omitempty"`
	Responseparameters interface{} `json:"responseParameters,omitempty"`
	Responsetemplates interface{} `json:"responseTemplates,omitempty"`
}

// CreateRestApirequest represents the CreateRestApirequest schema from the OpenAPI specification
type CreateRestApirequest struct {
	Binarymediatypes []string `json:"binaryMediaTypes,omitempty"` // The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
	Description string `json:"description,omitempty"` // The description of the RestApi.
	Disableexecuteapiendpoint bool `json:"disableExecuteApiEndpoint,omitempty"` // Specifies whether clients can invoke your API by using the default <code>execute-api</code> endpoint. By default, clients can invoke your API with the default <code>https://{api_id}.execute-api.{region}.amazonaws.com</code> endpoint. To require that clients use a custom domain name to invoke your API, disable the default endpoint
	Policy string `json:"policy,omitempty"` // A stringified JSON policy document that applies to this RestApi regardless of the caller and Method configuration.
	Minimumcompressionsize int `json:"minimumCompressionSize,omitempty"` // A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero allows compression for any payload size.
	Name string `json:"name"` // The name of the RestApi.
	Clonefrom string `json:"cloneFrom,omitempty"` // The ID of the RestApi that you want to clone from.
	Endpointconfiguration CreateDomainNamerequestendpointConfiguration `json:"endpointConfiguration,omitempty"` // The endpoint configuration to indicate the types of endpoints an API (RestApi) or its custom domain name (DomainName) has.
	Tags map[string]interface{} `json:"tags,omitempty"` // The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
	Version string `json:"version,omitempty"` // A version identifier for the API.
	Apikeysource string `json:"apiKeySource,omitempty"` // The source of the API key for metering requests according to a usage plan. Valid values are: &gt;<code>HEADER</code> to read the API key from the <code>X-API-Key</code> header of a request. <code>AUTHORIZER</code> to read the API key from the <code>UsageIdentifierKey</code> from a custom authorizer.
}

// UpdateIntegrationRequest represents the UpdateIntegrationRequest schema from the OpenAPI specification
type UpdateIntegrationRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// UpdateUsageRequest represents the UpdateUsageRequest schema from the OpenAPI specification
type UpdateUsageRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// DeleteIntegrationRequest represents the DeleteIntegrationRequest schema from the OpenAPI specification
type DeleteIntegrationRequest struct {
}

// UpdateRestApiRequest represents the UpdateRestApiRequest schema from the OpenAPI specification
type UpdateRestApiRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// Authorizers represents the Authorizers schema from the OpenAPI specification
type Authorizers struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// DomainNames represents the DomainNames schema from the OpenAPI specification
type DomainNames struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// CreateUsagePlanRequest represents the CreateUsagePlanRequest schema from the OpenAPI specification
type CreateUsagePlanRequest struct {
	Apistages interface{} `json:"apiStages,omitempty"`
	Description interface{} `json:"description,omitempty"`
	Name interface{} `json:"name"`
	Quota CreateUsagePlanRequestquota `json:"quota,omitempty"`
	Tags interface{} `json:"tags,omitempty"`
	Throttle CreateUsagePlanRequestthrottle `json:"throttle,omitempty"`
}

// CreateRequestValidatorrequest represents the CreateRequestValidatorrequest schema from the OpenAPI specification
type CreateRequestValidatorrequest struct {
	Name string `json:"name,omitempty"` // The name of the to-be-created RequestValidator.
	Validaterequestbody bool `json:"validateRequestBody,omitempty"` // A Boolean flag to indicate whether to validate request body according to the configured model schema for the method (<code>true</code>) or not (<code>false</code>).
	Validaterequestparameters bool `json:"validateRequestParameters,omitempty"` // A Boolean flag to indicate whether to validate request parameters, <code>true</code>, or not <code>false</code>.
}

// EndpointConfiguration represents the EndpointConfiguration schema from the OpenAPI specification
type EndpointConfiguration struct {
	Types interface{} `json:"types,omitempty"`
	Vpcendpointids interface{} `json:"vpcEndpointIds,omitempty"`
}

// GetAuthorizerRequest represents the GetAuthorizerRequest schema from the OpenAPI specification
type GetAuthorizerRequest struct {
}

// MapOfKeyUsages represents the MapOfKeyUsages schema from the OpenAPI specification
type MapOfKeyUsages struct {
}

// CreateApiKeyRequest represents the CreateApiKeyRequest schema from the OpenAPI specification
type CreateApiKeyRequest struct {
	Name interface{} `json:"name,omitempty"`
	Stagekeys interface{} `json:"stageKeys,omitempty"`
	Tags interface{} `json:"tags,omitempty"`
	Value interface{} `json:"value,omitempty"`
	Customerid interface{} `json:"customerId,omitempty"`
	Description interface{} `json:"description,omitempty"`
	Enabled interface{} `json:"enabled,omitempty"`
	Generatedistinctid interface{} `json:"generateDistinctId,omitempty"`
}

// UsagePlans represents the UsagePlans schema from the OpenAPI specification
type UsagePlans struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// CreateResourceRequest represents the CreateResourceRequest schema from the OpenAPI specification
type CreateResourceRequest struct {
	Pathpart interface{} `json:"pathPart"`
}

// CreateDeploymentrequest represents the CreateDeploymentrequest schema from the OpenAPI specification
type CreateDeploymentrequest struct {
	Description string `json:"description,omitempty"` // The description for the Deployment resource to create.
	Stagedescription string `json:"stageDescription,omitempty"` // The description of the Stage resource for the Deployment resource to create.
	Stagename string `json:"stageName,omitempty"` // The name of the Stage resource for the Deployment resource to create.
	Tracingenabled bool `json:"tracingEnabled,omitempty"` // Specifies whether active tracing with X-ray is enabled for the Stage.
	Variables map[string]interface{} `json:"variables,omitempty"` // A map that defines the stage variables for the Stage resource that is associated with the new deployment. Variable names can have alphanumeric and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
	Cacheclusterenabled bool `json:"cacheClusterEnabled,omitempty"` // Enables a cache cluster for the Stage resource specified in the input.
	Cacheclustersize string `json:"cacheClusterSize,omitempty"` // Returns the size of the CacheCluster.
	Canarysettings CreateDeploymentrequestcanarySettings `json:"canarySettings,omitempty"` // The input configuration for a canary deployment.
}

// GatewayResponses represents the GatewayResponses schema from the OpenAPI specification
type GatewayResponses struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// GetDocumentationVersionsRequest represents the GetDocumentationVersionsRequest schema from the OpenAPI specification
type GetDocumentationVersionsRequest struct {
}

// DeleteDomainNameRequest represents the DeleteDomainNameRequest schema from the OpenAPI specification
type DeleteDomainNameRequest struct {
}

// GetBasePathMappingsRequest represents the GetBasePathMappingsRequest schema from the OpenAPI specification
type GetBasePathMappingsRequest struct {
}

// RestApiendpointConfiguration represents the RestApiendpointConfiguration schema from the OpenAPI specification
type RestApiendpointConfiguration struct {
	Types interface{} `json:"types,omitempty"`
	Vpcendpointids interface{} `json:"vpcEndpointIds,omitempty"`
}

// Resources represents the Resources schema from the OpenAPI specification
type Resources struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// MutualTlsAuthentication represents the MutualTlsAuthentication schema from the OpenAPI specification
type MutualTlsAuthentication struct {
	Truststoreuri interface{} `json:"truststoreUri,omitempty"`
	Truststoreversion interface{} `json:"truststoreVersion,omitempty"`
	Truststorewarnings interface{} `json:"truststoreWarnings,omitempty"`
}

// CreateDomainNamerequestendpointConfiguration represents the CreateDomainNamerequestendpointConfiguration schema from the OpenAPI specification
type CreateDomainNamerequestendpointConfiguration struct {
	Vpcendpointids interface{} `json:"vpcEndpointIds,omitempty"`
	Types interface{} `json:"types,omitempty"`
}

// ApiKey represents the ApiKey schema from the OpenAPI specification
type ApiKey struct {
	Id interface{} `json:"id,omitempty"`
	Value interface{} `json:"value,omitempty"`
	Lastupdateddate interface{} `json:"lastUpdatedDate,omitempty"`
	Stagekeys interface{} `json:"stageKeys,omitempty"`
	Enabled interface{} `json:"enabled,omitempty"`
	Customerid interface{} `json:"customerId,omitempty"`
	Name interface{} `json:"name,omitempty"`
	Tags interface{} `json:"tags,omitempty"`
	Createddate interface{} `json:"createdDate,omitempty"`
	Description interface{} `json:"description,omitempty"`
}

// CreateVpcLinkrequest represents the CreateVpcLinkrequest schema from the OpenAPI specification
type CreateVpcLinkrequest struct {
	Tags map[string]interface{} `json:"tags,omitempty"` // The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
	Targetarns []string `json:"targetArns"` // The ARN of the network load balancer of the VPC targeted by the VPC link. The network load balancer must be owned by the same AWS account of the API owner.
	Description string `json:"description,omitempty"` // The description of the VPC link.
	Name string `json:"name"` // The name used to label and identify the VPC link.
}

// MutualTlsAuthenticationInput represents the MutualTlsAuthenticationInput schema from the OpenAPI specification
type MutualTlsAuthenticationInput struct {
	Truststoreuri interface{} `json:"truststoreUri,omitempty"`
	Truststoreversion interface{} `json:"truststoreVersion,omitempty"`
}

// IntegrationtlsConfig represents the IntegrationtlsConfig schema from the OpenAPI specification
type IntegrationtlsConfig struct {
	Insecureskipverification interface{} `json:"insecureSkipVerification,omitempty"`
}

// DeleteUsagePlanRequest represents the DeleteUsagePlanRequest schema from the OpenAPI specification
type DeleteUsagePlanRequest struct {
}

// DeleteApiKeyRequest represents the DeleteApiKeyRequest schema from the OpenAPI specification
type DeleteApiKeyRequest struct {
}

// DocumentationParts represents the DocumentationParts schema from the OpenAPI specification
type DocumentationParts struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// CreateRequestValidatorRequest represents the CreateRequestValidatorRequest schema from the OpenAPI specification
type CreateRequestValidatorRequest struct {
	Name interface{} `json:"name,omitempty"`
	Validaterequestbody interface{} `json:"validateRequestBody,omitempty"`
	Validaterequestparameters interface{} `json:"validateRequestParameters,omitempty"`
}

// CreateBasePathMappingrequest represents the CreateBasePathMappingrequest schema from the OpenAPI specification
type CreateBasePathMappingrequest struct {
	Basepath string `json:"basePath,omitempty"` // The base path name that callers of the API must provide as part of the URL after the domain name. This value must be unique for all of the mappings across a single API. Specify '(none)' if you do not want callers to specify a base path name after the domain name.
	Restapiid string `json:"restApiId"` // The string identifier of the associated RestApi.
	Stage string `json:"stage,omitempty"` // The name of the API's stage that you want to use for this mapping. Specify '(none)' if you want callers to explicitly specify the stage name after any base path name.
}

// DocumentationPartLocation represents the DocumentationPartLocation schema from the OpenAPI specification
type DocumentationPartLocation struct {
	Name interface{} `json:"name,omitempty"`
	Path interface{} `json:"path,omitempty"`
	Statuscode interface{} `json:"statusCode,omitempty"`
	TypeField interface{} `json:"type"`
	Method interface{} `json:"method,omitempty"`
}

// GetDeploymentsRequest represents the GetDeploymentsRequest schema from the OpenAPI specification
type GetDeploymentsRequest struct {
}

// DeleteIntegrationResponseRequest represents the DeleteIntegrationResponseRequest schema from the OpenAPI specification
type DeleteIntegrationResponseRequest struct {
}

// GetVpcLinksRequest represents the GetVpcLinksRequest schema from the OpenAPI specification
type GetVpcLinksRequest struct {
}

// CreateStageRequestcanarySettings represents the CreateStageRequestcanarySettings schema from the OpenAPI specification
type CreateStageRequestcanarySettings struct {
	Deploymentid interface{} `json:"deploymentId,omitempty"`
	Percenttraffic interface{} `json:"percentTraffic,omitempty"`
	Stagevariableoverrides interface{} `json:"stageVariableOverrides,omitempty"`
	Usestagecache interface{} `json:"useStageCache,omitempty"`
}

// SdkConfigurationProperty represents the SdkConfigurationProperty schema from the OpenAPI specification
type SdkConfigurationProperty struct {
	Name interface{} `json:"name,omitempty"`
	Required interface{} `json:"required,omitempty"`
	Defaultvalue interface{} `json:"defaultValue,omitempty"`
	Description interface{} `json:"description,omitempty"`
	Friendlyname interface{} `json:"friendlyName,omitempty"`
}

// ImportRestApirequest represents the ImportRestApirequest schema from the OpenAPI specification
type ImportRestApirequest struct {
	Body string `json:"body"` // The POST request body containing external API definitions. Currently, only OpenAPI definition JSON/YAML files are supported. The maximum size of the API definition file is 6MB.
}

// ImportDocumentationPartsRequest represents the ImportDocumentationPartsRequest schema from the OpenAPI specification
type ImportDocumentationPartsRequest struct {
	Body interface{} `json:"body"`
}

// UsagePlanKey represents the UsagePlanKey schema from the OpenAPI specification
type UsagePlanKey struct {
	Id interface{} `json:"id,omitempty"`
	Name interface{} `json:"name,omitempty"`
	TypeField interface{} `json:"type,omitempty"`
	Value interface{} `json:"value,omitempty"`
}

// GetClientCertificateRequest represents the GetClientCertificateRequest schema from the OpenAPI specification
type GetClientCertificateRequest struct {
}

// GetIntegrationResponseRequest represents the GetIntegrationResponseRequest schema from the OpenAPI specification
type GetIntegrationResponseRequest struct {
}

// PutMethodrequest represents the PutMethodrequest schema from the OpenAPI specification
type PutMethodrequest struct {
	Requestmodels map[string]interface{} `json:"requestModels,omitempty"` // Specifies the Model resources used for the request's content type. Request models are represented as a key/value map, with a content type as the key and a Model name as the value.
	Requestparameters map[string]interface{} `json:"requestParameters,omitempty"` // A key-value map defining required or optional method request parameters that can be accepted by API Gateway. A key defines a method request parameter name matching the pattern of <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The value associated with the key is a Boolean flag indicating whether the parameter is required (<code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are available in Integration to be mapped to integration request parameters or body-mapping templates.
	Requestvalidatorid string `json:"requestValidatorId,omitempty"` // The identifier of a RequestValidator for validating the method request.
	Apikeyrequired bool `json:"apiKeyRequired,omitempty"` // Specifies whether the method required a valid ApiKey.
	Authorizationscopes []string `json:"authorizationScopes,omitempty"` // A list of authorization scopes configured on the method. The scopes are used with a <code>COGNITO_USER_POOLS</code> authorizer to authorize the method invocation. The authorization works by matching the method scopes against the scopes parsed from the access token in the incoming request. The method invocation is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the invocation is not authorized. When the method scope is configured, the client must provide an access token instead of an identity token for authorization purposes.
	Authorizationtype string `json:"authorizationType"` // The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code> for using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or <code>COGNITO_USER_POOLS</code> for using a Cognito user pool.
	Authorizerid string `json:"authorizerId,omitempty"` // Specifies the identifier of an Authorizer to use on this Method, if the type is CUSTOM or COGNITO_USER_POOLS. The authorizer identifier is generated by API Gateway when you created the authorizer.
	Operationname string `json:"operationName,omitempty"` // A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code> of <code>ListPets</code> for the <code>GET /pets</code> method in the <code>PetStore</code> example.
}

// PutIntegrationResponserequest represents the PutIntegrationResponserequest schema from the OpenAPI specification
type PutIntegrationResponserequest struct {
	Contenthandling string `json:"contentHandling,omitempty"` // <p>Specifies how to handle response payload content type conversions. Supported values are <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p> <p>If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.</p>
	Responseparameters map[string]interface{} `json:"responseParameters,omitempty"` // A key-value map specifying response parameters that are passed to the method response from the back end. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of <code>method.response.header.{name}</code>, where <code>name</code> is a valid and unique header name. The mapped non-static value must match the pattern of <code>integration.response.header.{name}</code> or <code>integration.response.body.{JSON-expression}</code>, where <code>name</code> must be a valid and unique response header name and <code>JSON-expression</code> a valid JSON expression without the <code>$</code> prefix.
	Responsetemplates map[string]interface{} `json:"responseTemplates,omitempty"` // Specifies a put integration response's templates.
	Selectionpattern string `json:"selectionPattern,omitempty"` // Specifies the selection pattern of a put integration response.
}

// CreateApiKeyrequest represents the CreateApiKeyrequest schema from the OpenAPI specification
type CreateApiKeyrequest struct {
	Value string `json:"value,omitempty"` // Specifies a value of the API key.
	Customerid string `json:"customerId,omitempty"` // An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
	Description string `json:"description,omitempty"` // The description of the ApiKey.
	Enabled bool `json:"enabled,omitempty"` // Specifies whether the ApiKey can be used by callers.
	Generatedistinctid bool `json:"generateDistinctId,omitempty"` // Specifies whether (<code>true</code>) or not (<code>false</code>) the key identifier is distinct from the created API key value. This parameter is deprecated and should not be used.
	Name string `json:"name,omitempty"` // The name of the ApiKey.
	Stagekeys []StageKey `json:"stageKeys,omitempty"` // DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
	Tags map[string]interface{} `json:"tags,omitempty"` // The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
}

// GatewayResponse represents the GatewayResponse schema from the OpenAPI specification
type GatewayResponse struct {
	Responsetype interface{} `json:"responseType,omitempty"`
	Statuscode interface{} `json:"statusCode,omitempty"`
	Defaultresponse interface{} `json:"defaultResponse,omitempty"`
	Responseparameters interface{} `json:"responseParameters,omitempty"`
	Responsetemplates interface{} `json:"responseTemplates,omitempty"`
}

// RestApi represents the RestApi schema from the OpenAPI specification
type RestApi struct {
	Apikeysource interface{} `json:"apiKeySource,omitempty"`
	Policy interface{} `json:"policy,omitempty"`
	Binarymediatypes interface{} `json:"binaryMediaTypes,omitempty"`
	Createddate interface{} `json:"createdDate,omitempty"`
	Description interface{} `json:"description,omitempty"`
	Name interface{} `json:"name,omitempty"`
	Endpointconfiguration RestApiendpointConfiguration `json:"endpointConfiguration,omitempty"`
	Minimumcompressionsize interface{} `json:"minimumCompressionSize,omitempty"`
	Version interface{} `json:"version,omitempty"`
	Disableexecuteapiendpoint interface{} `json:"disableExecuteApiEndpoint,omitempty"`
	Id interface{} `json:"id,omitempty"`
	Tags interface{} `json:"tags,omitempty"`
	Warnings interface{} `json:"warnings,omitempty"`
}

// DeleteDeploymentRequest represents the DeleteDeploymentRequest schema from the OpenAPI specification
type DeleteDeploymentRequest struct {
}

// Stage represents the Stage schema from the OpenAPI specification
type Stage struct {
	Canarysettings StagecanarySettings `json:"canarySettings,omitempty"`
	Tracingenabled interface{} `json:"tracingEnabled,omitempty"`
	Description interface{} `json:"description,omitempty"`
	Methodsettings interface{} `json:"methodSettings,omitempty"`
	Cacheclusterstatus interface{} `json:"cacheClusterStatus,omitempty"`
	Documentationversion interface{} `json:"documentationVersion,omitempty"`
	Deploymentid interface{} `json:"deploymentId,omitempty"`
	Lastupdateddate interface{} `json:"lastUpdatedDate,omitempty"`
	Stagename interface{} `json:"stageName,omitempty"`
	Tags interface{} `json:"tags,omitempty"`
	Clientcertificateid interface{} `json:"clientCertificateId,omitempty"`
	Accesslogsettings StageaccessLogSettings `json:"accessLogSettings,omitempty"`
	Createddate interface{} `json:"createdDate,omitempty"`
	Webaclarn interface{} `json:"webAclArn,omitempty"`
	Cacheclusterenabled interface{} `json:"cacheClusterEnabled,omitempty"`
	Variables interface{} `json:"variables,omitempty"`
	Cacheclustersize interface{} `json:"cacheClusterSize,omitempty"`
}

// PutGatewayResponserequest represents the PutGatewayResponserequest schema from the OpenAPI specification
type PutGatewayResponserequest struct {
	Statuscode string `json:"statusCode,omitempty"` // The status code.
	Responseparameters map[string]interface{} `json:"responseParameters,omitempty"` // Response parameters (paths, query strings and headers) of the GatewayResponse as a string-to-string map of key-value pairs.
	Responsetemplates map[string]interface{} `json:"responseTemplates,omitempty"` // Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
}

// UpdateDeploymentRequest represents the UpdateDeploymentRequest schema from the OpenAPI specification
type UpdateDeploymentRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// DeleteStageRequest represents the DeleteStageRequest schema from the OpenAPI specification
type DeleteStageRequest struct {
}

// ClientCertificate represents the ClientCertificate schema from the OpenAPI specification
type ClientCertificate struct {
	Tags interface{} `json:"tags,omitempty"`
	Clientcertificateid interface{} `json:"clientCertificateId,omitempty"`
	Createddate interface{} `json:"createdDate,omitempty"`
	Description interface{} `json:"description,omitempty"`
	Expirationdate interface{} `json:"expirationDate,omitempty"`
	Pemencodedcertificate interface{} `json:"pemEncodedCertificate,omitempty"`
}

// GetUsageRequest represents the GetUsageRequest schema from the OpenAPI specification
type GetUsageRequest struct {
}

// GetDocumentationPartsRequest represents the GetDocumentationPartsRequest schema from the OpenAPI specification
type GetDocumentationPartsRequest struct {
}

// ClientCertificates represents the ClientCertificates schema from the OpenAPI specification
type ClientCertificates struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// CreateAuthorizerRequest represents the CreateAuthorizerRequest schema from the OpenAPI specification
type CreateAuthorizerRequest struct {
	Authorizerresultttlinseconds interface{} `json:"authorizerResultTtlInSeconds,omitempty"`
	Authorizeruri interface{} `json:"authorizerUri,omitempty"`
	Identityvalidationexpression interface{} `json:"identityValidationExpression,omitempty"`
	Identitysource interface{} `json:"identitySource,omitempty"`
	Providerarns interface{} `json:"providerARNs,omitempty"`
	TypeField interface{} `json:"type"`
	Authorizercredentials interface{} `json:"authorizerCredentials,omitempty"`
	Name interface{} `json:"name"`
	Authtype interface{} `json:"authType,omitempty"`
}

// Deployments represents the Deployments schema from the OpenAPI specification
type Deployments struct {
	Items interface{} `json:"items,omitempty"`
	Position string `json:"position,omitempty"`
}

// GetModelsRequest represents the GetModelsRequest schema from the OpenAPI specification
type GetModelsRequest struct {
}

// DocumentationVersion represents the DocumentationVersion schema from the OpenAPI specification
type DocumentationVersion struct {
	Description interface{} `json:"description,omitempty"`
	Version interface{} `json:"version,omitempty"`
	Createddate interface{} `json:"createdDate,omitempty"`
}

// GetDocumentationVersionRequest represents the GetDocumentationVersionRequest schema from the OpenAPI specification
type GetDocumentationVersionRequest struct {
}

// UpdateMethodResponseRequest represents the UpdateMethodResponseRequest schema from the OpenAPI specification
type UpdateMethodResponseRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// Model represents the Model schema from the OpenAPI specification
type Model struct {
	Contenttype interface{} `json:"contentType,omitempty"`
	Description interface{} `json:"description,omitempty"`
	Id interface{} `json:"id,omitempty"`
	Name interface{} `json:"name,omitempty"`
	Schema interface{} `json:"schema,omitempty"`
}

// GetRequestValidatorsRequest represents the GetRequestValidatorsRequest schema from the OpenAPI specification
type GetRequestValidatorsRequest struct {
}

// StagecanarySettings represents the StagecanarySettings schema from the OpenAPI specification
type StagecanarySettings struct {
	Percenttraffic interface{} `json:"percentTraffic,omitempty"`
	Stagevariableoverrides interface{} `json:"stageVariableOverrides,omitempty"`
	Usestagecache interface{} `json:"useStageCache,omitempty"`
	Deploymentid interface{} `json:"deploymentId,omitempty"`
}

// CreateAuthorizerrequest represents the CreateAuthorizerrequest schema from the OpenAPI specification
type CreateAuthorizerrequest struct {
	Identitysource string `json:"identitySource,omitempty"` // The identity source for which authorization is requested. For a <code>TOKEN</code> or <code>COGNITO_USER_POOLS</code> authorizer, this is required and specifies the request header mapping expression for the custom header holding the authorization token submitted by the client. For example, if the token header name is <code>Auth</code>, the header mapping expression is <code>method.request.header.Auth</code>. For the <code>REQUEST</code> authorizer, this is required when authorization caching is enabled. The value is a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an <code>Auth</code> header, a <code>Name</code> query string parameter are defined as identity sources, this value is <code>method.request.header.Auth, method.request.querystring.Name</code>. These parameters will be used to derive the authorization caching key and to perform runtime validation of the <code>REQUEST</code> authorizer by verifying all of the identity-related request parameters are present, not null and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified request parameters. When the authorization caching is not enabled, this property is optional.
	Providerarns []string `json:"providerARNs,omitempty"` // A list of the Amazon Cognito user pool ARNs for the <code>COGNITO_USER_POOLS</code> authorizer. Each element is of this format: <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>. For a <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is not defined.
	Authorizercredentials string `json:"authorizerCredentials,omitempty"` // Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null.
	Name string `json:"name"` // The name of the authorizer.
	Authtype string `json:"authType,omitempty"` // Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
	TypeField string `json:"type"` // The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single authorization token submitted in a custom header, <code>REQUEST</code> for a Lambda function using incoming request parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
	Authorizerresultttlinseconds int `json:"authorizerResultTtlInSeconds,omitempty"` // The TTL in seconds of cached authorizer results. If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300. The maximum value is 3600, or 1 hour.
	Authorizeruri string `json:"authorizerUri,omitempty"` // Specifies the authorizer's Uniform Resource Identifier (URI). For <code>TOKEN</code> or <code>REQUEST</code> authorizers, this must be a well-formed Lambda function URI, for example, <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>. In general, the URI has this form <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>, where <code>{region}</code> is the same as the region hosting the Lambda function, <code>path</code> indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial <code>/</code>. For Lambda functions, this is usually of the form <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
	Identityvalidationexpression string `json:"identityValidationExpression,omitempty"` // A validation expression for the incoming identity token. For <code>TOKEN</code> authorizers, this value is a regular expression. For <code>COGNITO_USER_POOLS</code> authorizers, API Gateway will match the <code>aud</code> field of the incoming token from the client against the specified regular expression. It will invoke the authorizer's Lambda function when there is a match. Otherwise, it will return a 401 Unauthorized response without calling the Lambda function. The validation expression does not apply to the <code>REQUEST</code> authorizer.
}

// UpdateMethodRequest represents the UpdateMethodRequest schema from the OpenAPI specification
type UpdateMethodRequest struct {
	Patchoperations interface{} `json:"patchOperations,omitempty"`
}

// CreateDeploymentRequestcanarySettings represents the CreateDeploymentRequestcanarySettings schema from the OpenAPI specification
type CreateDeploymentRequestcanarySettings struct {
	Percenttraffic interface{} `json:"percentTraffic,omitempty"`
	Stagevariableoverrides interface{} `json:"stageVariableOverrides,omitempty"`
	Usestagecache interface{} `json:"useStageCache,omitempty"`
}

// SdkResponse represents the SdkResponse schema from the OpenAPI specification
type SdkResponse struct {
	Body interface{} `json:"body,omitempty"`
}

// CreateDocumentationVersionRequest represents the CreateDocumentationVersionRequest schema from the OpenAPI specification
type CreateDocumentationVersionRequest struct {
	Description interface{} `json:"description,omitempty"`
	Documentationversion interface{} `json:"documentationVersion"`
	Stagename interface{} `json:"stageName,omitempty"`
}

// CreateDocumentationPartRequest represents the CreateDocumentationPartRequest schema from the OpenAPI specification
type CreateDocumentationPartRequest struct {
	Location CreateDocumentationPartRequestlocation `json:"location"`
	Properties interface{} `json:"properties"` // The new documentation content map of the targeted API entity. Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be exported and, hence, published.
}
