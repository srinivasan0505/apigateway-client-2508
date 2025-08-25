

# TestInvokeMethodRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pathWithQueryString** | **String** | The URI path, including query string, of the simulated invocation request. Use this to specify path parameters and query string parameters. |  [optional] |
|**body** | **String** | The simulated request body of an incoming invocation request. |  [optional] |
|**headers** | **Map&lt;String, String&gt;** | A key-value map of headers to simulate an incoming invocation request. |  [optional] |
|**multiValueHeaders** | **Map&lt;String, List&lt;String&gt;&gt;** | The headers as a map from string to list of values to simulate an incoming invocation request. |  [optional] |
|**clientCertificateId** | **String** | A ClientCertificate identifier to use in the test invocation. API Gateway will use the certificate when making the HTTPS request to the defined back-end endpoint. |  [optional] |
|**stageVariables** | **Map&lt;String, String&gt;** | A key-value map of stage variables to simulate an invocation on a deployed Stage. |  [optional] |



