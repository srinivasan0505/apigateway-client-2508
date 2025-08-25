

# Integration

Represents an HTTP, HTTP_PROXY, AWS, AWS_PROXY, or Mock integration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**IntegrationType**](IntegrationType.md) |  |  [optional] |
|**httpMethod** | [**String**](String.md) |  |  [optional] |
|**uri** | [**String**](String.md) |  |  [optional] |
|**connectionType** | [**ConnectionType**](ConnectionType.md) |  |  [optional] |
|**connectionId** | [**String**](String.md) |  |  [optional] |
|**credentials** | [**String**](String.md) |  |  [optional] |
|**requestParameters** | [**Map**](Map.md) |  |  [optional] |
|**requestTemplates** | [**Map**](Map.md) |  |  [optional] |
|**passthroughBehavior** | [**String**](String.md) |  |  [optional] |
|**contentHandling** | [**ContentHandlingStrategy**](ContentHandlingStrategy.md) |  |  [optional] |
|**timeoutInMillis** | [**Integer**](Integer.md) |  |  [optional] |
|**cacheNamespace** | [**String**](String.md) |  |  [optional] |
|**cacheKeyParameters** | [**List**](List.md) |  |  [optional] |
|**integrationResponses** | [**Map**](Map.md) |  |  [optional] |
|**tlsConfig** | [**IntegrationTlsConfig**](IntegrationTlsConfig.md) |  |  [optional] |



