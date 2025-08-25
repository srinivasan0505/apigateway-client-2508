

# PutMethodResponseRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseParameters** | **Map&lt;String, Boolean&gt;** | A key-value map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header name and the associated value is a Boolean flag indicating whether the method response parameter is required or not. The method response header names must match the pattern of &lt;code&gt;method.response.header.{name}&lt;/code&gt;, where &lt;code&gt;name&lt;/code&gt; is a valid and unique header name. The response parameter names defined here are available in the integration response to be mapped from an integration response header expressed in &lt;code&gt;integration.response.header.{name}&lt;/code&gt;, a static value enclosed within a pair of single quotes (e.g., &lt;code&gt;&#39;application/json&#39;&lt;/code&gt;), or a JSON expression from the back-end response payload in the form of &lt;code&gt;integration.response.body.{JSON-expression}&lt;/code&gt;, where &lt;code&gt;JSON-expression&lt;/code&gt; is a valid JSON expression without the &lt;code&gt;$&lt;/code&gt; prefix.) |  [optional] |
|**responseModels** | **Map&lt;String, String&gt;** | Specifies the Model resources used for the response&#39;s content type. Response models are represented as a key/value map, with a content type as the key and a Model name as the value. |  [optional] |



