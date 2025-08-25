

# CreateAuthorizerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the authorizer. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The authorizer type. Valid values are &lt;code&gt;TOKEN&lt;/code&gt; for a Lambda function using a single authorization token submitted in a custom header, &lt;code&gt;REQUEST&lt;/code&gt; for a Lambda function using incoming request parameters, and &lt;code&gt;COGNITO_USER_POOLS&lt;/code&gt; for using an Amazon Cognito user pool. |  |
|**providerARNs** | **List&lt;String&gt;** | A list of the Amazon Cognito user pool ARNs for the &lt;code&gt;COGNITO_USER_POOLS&lt;/code&gt; authorizer. Each element is of this format: &lt;code&gt;arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}&lt;/code&gt;. For a &lt;code&gt;TOKEN&lt;/code&gt; or &lt;code&gt;REQUEST&lt;/code&gt; authorizer, this is not defined.  |  [optional] |
|**authType** | **String** | Optional customer-defined field, used in OpenAPI imports and exports without functional impact. |  [optional] |
|**authorizerUri** | **String** | Specifies the authorizer&#39;s Uniform Resource Identifier (URI). For &lt;code&gt;TOKEN&lt;/code&gt; or &lt;code&gt;REQUEST&lt;/code&gt; authorizers, this must be a well-formed Lambda function URI, for example, &lt;code&gt;arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations&lt;/code&gt;. In general, the URI has this form &lt;code&gt;arn:aws:apigateway:{region}:lambda:path/{service_api}&lt;/code&gt;, where &lt;code&gt;{region}&lt;/code&gt; is the same as the region hosting the Lambda function, &lt;code&gt;path&lt;/code&gt; indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial &lt;code&gt;/&lt;/code&gt;. For Lambda functions, this is usually of the form &lt;code&gt;/2015-03-31/functions/[FunctionARN]/invocations&lt;/code&gt;. |  [optional] |
|**authorizerCredentials** | **String** | Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role&#39;s Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null. |  [optional] |
|**identitySource** | **String** | The identity source for which authorization is requested. For a &lt;code&gt;TOKEN&lt;/code&gt; or &lt;code&gt;COGNITO_USER_POOLS&lt;/code&gt; authorizer, this is required and specifies the request header mapping expression for the custom header holding the authorization token submitted by the client. For example, if the token header name is &lt;code&gt;Auth&lt;/code&gt;, the header mapping expression is &lt;code&gt;method.request.header.Auth&lt;/code&gt;. For the &lt;code&gt;REQUEST&lt;/code&gt; authorizer, this is required when authorization caching is enabled. The value is a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an &lt;code&gt;Auth&lt;/code&gt; header, a &lt;code&gt;Name&lt;/code&gt; query string parameter are defined as identity sources, this value is &lt;code&gt;method.request.header.Auth, method.request.querystring.Name&lt;/code&gt;. These parameters will be used to derive the authorization caching key and to perform runtime validation of the &lt;code&gt;REQUEST&lt;/code&gt; authorizer by verifying all of the identity-related request parameters are present, not null and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified request parameters. When the authorization caching is not enabled, this property is optional. |  [optional] |
|**identityValidationExpression** | **String** | A validation expression for the incoming identity token. For &lt;code&gt;TOKEN&lt;/code&gt; authorizers, this value is a regular expression. For &lt;code&gt;COGNITO_USER_POOLS&lt;/code&gt; authorizers, API Gateway will match the &lt;code&gt;aud&lt;/code&gt; field of the incoming token from the client against the specified regular expression. It will invoke the authorizer&#39;s Lambda function when there is a match. Otherwise, it will return a 401 Unauthorized response without calling the Lambda function. The validation expression does not apply to the &lt;code&gt;REQUEST&lt;/code&gt; authorizer. |  [optional] |
|**authorizerResultTtlInSeconds** | **Integer** | The TTL in seconds of cached authorizer results. If it equals 0, authorization caching is disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300. The maximum value is 3600, or 1 hour. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TOKEN | &quot;TOKEN&quot; |
| REQUEST | &quot;REQUEST&quot; |
| COGNITO_USER_POOLS | &quot;COGNITO_USER_POOLS&quot; |



