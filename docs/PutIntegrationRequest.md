

# PutIntegrationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The integration type. The valid value is &lt;code&gt;HTTP&lt;/code&gt; for integrating an API method with an HTTP backend; &lt;code&gt;AWS&lt;/code&gt; with any AWS service endpoints; &lt;code&gt;MOCK&lt;/code&gt; for testing without actually invoking the backend; &lt;code&gt;HTTP_PROXY&lt;/code&gt; for integrating with the HTTP proxy integration; &lt;code&gt;AWS_PROXY&lt;/code&gt; for integrating with the Lambda proxy integration.  |  |
|**httpMethod** | **String** | The HTTP method for the integration. |  [optional] |
|**uri** | **String** | Specifies Uniform Resource Identifier (URI) of the integration endpoint. For HTTP or &lt;code&gt;HTTP_PROXY&lt;/code&gt; integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where &lt;code&gt;connectionType&lt;/code&gt; is not &lt;code&gt;VPC_LINK&lt;/code&gt;, or private integration, where &lt;code&gt;connectionType&lt;/code&gt; is &lt;code&gt;VPC_LINK&lt;/code&gt;. For a private HTTP integration, the URI is not used for routing. For &lt;code&gt;AWS&lt;/code&gt; or &lt;code&gt;AWS_PROXY&lt;/code&gt; integrations, the URI is of the form &lt;code&gt;arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api&lt;/code&gt;}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated Amazon Web Services service (e.g., s3); and {subdomain} is a designated subdomain supported by certain Amazon Web Services service for fast host-name lookup. action can be used for an Amazon Web Services service action-based API, using an Action&#x3D;{name}&amp;amp;{p1}&#x3D;{v1}&amp;amp;p2&#x3D;{v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an Amazon Web Services service path-based API. The ensuing service_api refers to the path to an Amazon Web Services service resource, including the region of the integrated Amazon Web Services service, if applicable. For example, for integration with the S3 API of &lt;code&gt;GetObject&lt;/code&gt;, the &lt;code&gt;uri&lt;/code&gt; can be either &lt;code&gt;arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;amp;Bucket&#x3D;{bucket}&amp;amp;Key&#x3D;{key}&lt;/code&gt; or &lt;code&gt;arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}&lt;/code&gt;. |  [optional] |
|**connectionType** | [**ConnectionTypeEnum**](#ConnectionTypeEnum) | The type of the network connection to the integration endpoint. The valid value is &lt;code&gt;INTERNET&lt;/code&gt; for connections through the public routable internet or &lt;code&gt;VPC_LINK&lt;/code&gt; for private connections between API Gateway and a network load balancer in a VPC. The default value is &lt;code&gt;INTERNET&lt;/code&gt;. |  [optional] |
|**connectionId** | **String** | The ID of the VpcLink used for the integration. Specify this value only if you specify &lt;code&gt;VPC_LINK&lt;/code&gt; as the connection type. |  [optional] |
|**credentials** | **String** | Specifies whether credentials are required for a put integration. |  [optional] |
|**requestParameters** | **Map&lt;String, String&gt;** | A key-value map specifying request parameters that are passed from the method request to the back end. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the back end. The method request parameter value must match the pattern of &lt;code&gt;method.request.{location}.{name}&lt;/code&gt;, where &lt;code&gt;location&lt;/code&gt; is &lt;code&gt;querystring&lt;/code&gt;, &lt;code&gt;path&lt;/code&gt;, or &lt;code&gt;header&lt;/code&gt; and &lt;code&gt;name&lt;/code&gt; must be a valid and unique method request parameter name. |  [optional] |
|**requestTemplates** | **Map&lt;String, String&gt;** | Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value. |  [optional] |
|**passthroughBehavior** | **String** | Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the &lt;code&gt;requestTemplates&lt;/code&gt; property on the Integration resource. There are three valid values: &lt;code&gt;WHEN_NO_MATCH&lt;/code&gt;, &lt;code&gt;WHEN_NO_TEMPLATES&lt;/code&gt;, and &lt;code&gt;NEVER&lt;/code&gt;.  |  [optional] |
|**cacheNamespace** | **String** | Specifies a group of related cached parameters. By default, API Gateway uses the resource ID as the &lt;code&gt;cacheNamespace&lt;/code&gt;. You can specify the same &lt;code&gt;cacheNamespace&lt;/code&gt; across resources to return the same cached data for requests to different resources. |  [optional] |
|**cacheKeyParameters** | **List&lt;String&gt;** | A list of request parameters whose values API Gateway caches. To be valid values for &lt;code&gt;cacheKeyParameters&lt;/code&gt;, these parameters must also be specified for Method &lt;code&gt;requestParameters&lt;/code&gt;. |  [optional] |
|**contentHandling** | [**ContentHandlingEnum**](#ContentHandlingEnum) | &lt;p&gt;Specifies how to handle request payload content type conversions. Supported values are &lt;code&gt;CONVERT_TO_BINARY&lt;/code&gt; and &lt;code&gt;CONVERT_TO_TEXT&lt;/code&gt;, with the following behaviors:&lt;/p&gt; &lt;p&gt;If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the &lt;code&gt;passthroughBehavior&lt;/code&gt; is configured to support payload pass-through.&lt;/p&gt; |  [optional] |
|**timeoutInMillis** | **Integer** | Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds. |  [optional] |
|**tlsConfig** | [**PutIntegrationRequestTlsConfig**](PutIntegrationRequestTlsConfig.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| HTTP | &quot;HTTP&quot; |
| AWS | &quot;AWS&quot; |
| MOCK | &quot;MOCK&quot; |
| HTTP_PROXY | &quot;HTTP_PROXY&quot; |
| AWS_PROXY | &quot;AWS_PROXY&quot; |



## Enum: ConnectionTypeEnum

| Name | Value |
|---- | -----|
| INTERNET | &quot;INTERNET&quot; |
| VPC_LINK | &quot;VPC_LINK&quot; |



## Enum: ContentHandlingEnum

| Name | Value |
|---- | -----|
| BINARY | &quot;CONVERT_TO_BINARY&quot; |
| TEXT | &quot;CONVERT_TO_TEXT&quot; |



