

# CreateRestApiRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the RestApi. |  |
|**description** | **String** | The description of the RestApi. |  [optional] |
|**version** | **String** | A version identifier for the API. |  [optional] |
|**cloneFrom** | **String** | The ID of the RestApi that you want to clone from. |  [optional] |
|**binaryMediaTypes** | **List&lt;String&gt;** | The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads. |  [optional] |
|**minimumCompressionSize** | **Integer** | A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero allows compression for any payload size. |  [optional] |
|**apiKeySource** | [**ApiKeySourceEnum**](#ApiKeySourceEnum) | The source of the API key for metering requests according to a usage plan. Valid values are: &amp;gt;&lt;code&gt;HEADER&lt;/code&gt; to read the API key from the &lt;code&gt;X-API-Key&lt;/code&gt; header of a request. &lt;code&gt;AUTHORIZER&lt;/code&gt; to read the API key from the &lt;code&gt;UsageIdentifierKey&lt;/code&gt; from a custom authorizer. |  [optional] |
|**endpointConfiguration** | [**CreateDomainNameRequestEndpointConfiguration**](CreateDomainNameRequestEndpointConfiguration.md) |  |  [optional] |
|**policy** | **String** | A stringified JSON policy document that applies to this RestApi regardless of the caller and Method configuration. |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | The key-value map of strings. The valid character set is [a-zA-Z+-&#x3D;._:/]. The tag key can be up to 128 characters and must not start with &lt;code&gt;aws:&lt;/code&gt;. The tag value can be up to 256 characters. |  [optional] |
|**disableExecuteApiEndpoint** | **Boolean** | Specifies whether clients can invoke your API by using the default &lt;code&gt;execute-api&lt;/code&gt; endpoint. By default, clients can invoke your API with the default &lt;code&gt;https://{api_id}.execute-api.{region}.amazonaws.com&lt;/code&gt; endpoint. To require that clients use a custom domain name to invoke your API, disable the default endpoint |  [optional] |



## Enum: ApiKeySourceEnum

| Name | Value |
|---- | -----|
| HEADER | &quot;HEADER&quot; |
| AUTHORIZER | &quot;AUTHORIZER&quot; |



