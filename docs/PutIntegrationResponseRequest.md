

# PutIntegrationResponseRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**selectionPattern** | **String** | Specifies the selection pattern of a put integration response. |  [optional] |
|**responseParameters** | **Map&lt;String, String&gt;** | A key-value map specifying response parameters that are passed to the method response from the back end. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of &lt;code&gt;method.response.header.{name}&lt;/code&gt;, where &lt;code&gt;name&lt;/code&gt; is a valid and unique header name. The mapped non-static value must match the pattern of &lt;code&gt;integration.response.header.{name}&lt;/code&gt; or &lt;code&gt;integration.response.body.{JSON-expression}&lt;/code&gt;, where &lt;code&gt;name&lt;/code&gt; must be a valid and unique response header name and &lt;code&gt;JSON-expression&lt;/code&gt; a valid JSON expression without the &lt;code&gt;$&lt;/code&gt; prefix. |  [optional] |
|**responseTemplates** | **Map&lt;String, String&gt;** | Specifies a put integration response&#39;s templates. |  [optional] |
|**contentHandling** | [**ContentHandlingEnum**](#ContentHandlingEnum) | &lt;p&gt;Specifies how to handle response payload content type conversions. Supported values are &lt;code&gt;CONVERT_TO_BINARY&lt;/code&gt; and &lt;code&gt;CONVERT_TO_TEXT&lt;/code&gt;, with the following behaviors:&lt;/p&gt; &lt;p&gt;If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.&lt;/p&gt; |  [optional] |



## Enum: ContentHandlingEnum

| Name | Value |
|---- | -----|
| BINARY | &quot;CONVERT_TO_BINARY&quot; |
| TEXT | &quot;CONVERT_TO_TEXT&quot; |



