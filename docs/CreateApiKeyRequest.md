

# CreateApiKeyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the ApiKey. |  [optional] |
|**description** | **String** | The description of the ApiKey. |  [optional] |
|**enabled** | **Boolean** | Specifies whether the ApiKey can be used by callers. |  [optional] |
|**generateDistinctId** | **Boolean** | Specifies whether (&lt;code&gt;true&lt;/code&gt;) or not (&lt;code&gt;false&lt;/code&gt;) the key identifier is distinct from the created API key value. This parameter is deprecated and should not be used. |  [optional] |
|**value** | **String** | Specifies a value of the API key. |  [optional] |
|**stageKeys** | [**List&lt;StageKey&gt;**](StageKey.md) | DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key. |  [optional] |
|**customerId** | **String** | An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace. |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | The key-value map of strings. The valid character set is [a-zA-Z+-&#x3D;._:/]. The tag key can be up to 128 characters and must not start with &lt;code&gt;aws:&lt;/code&gt;. The tag value can be up to 256 characters. |  [optional] |



