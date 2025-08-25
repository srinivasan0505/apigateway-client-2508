

# Authorizer

Represents an authorization layer for methods. If enabled on a method, API Gateway will activate the authorizer when a client calls the method.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**String**](String.md) |  |  [optional] |
|**name** | [**String**](String.md) |  |  [optional] |
|**type** | [**AuthorizerType**](AuthorizerType.md) |  |  [optional] |
|**providerARNs** | [**List**](List.md) |  |  [optional] |
|**authType** | [**String**](String.md) |  |  [optional] |
|**authorizerUri** | [**String**](String.md) |  |  [optional] |
|**authorizerCredentials** | [**String**](String.md) |  |  [optional] |
|**identitySource** | [**String**](String.md) |  |  [optional] |
|**identityValidationExpression** | [**String**](String.md) |  |  [optional] |
|**authorizerResultTtlInSeconds** | [**Integer**](Integer.md) |  |  [optional] |



