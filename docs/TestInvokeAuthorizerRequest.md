

# TestInvokeAuthorizerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**headers** | **Map&lt;String, String&gt;** | A key-value map of headers to simulate an incoming invocation request. This is where the incoming authorization token, or identity source, should be specified. |  [optional] |
|**multiValueHeaders** | **Map&lt;String, List&lt;String&gt;&gt;** | The headers as a map from string to list of values to simulate an incoming invocation request. This is where the incoming authorization token, or identity source, may be specified. |  [optional] |
|**pathWithQueryString** | **String** | The URI path, including query string, of the simulated invocation request. Use this to specify path parameters and query string parameters. |  [optional] |
|**body** | **String** | The simulated request body of an incoming invocation request. |  [optional] |
|**stageVariables** | **Map&lt;String, String&gt;** | A key-value map of stage variables to simulate an invocation on a deployed Stage. |  [optional] |
|**additionalContext** | **Map&lt;String, String&gt;** | A key-value map of additional context variables. |  [optional] |



