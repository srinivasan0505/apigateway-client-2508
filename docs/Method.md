

# Method

 Represents a client-facing interface by which the client calls the API to access back-end resources. A Method resource is integrated with an Integration resource. Both consist of a request and one or more responses. The method request takes the client input that is passed to the back end through the integration request. A method response returns the output from the back end to the client through an integration response. A method request is embodied in a Method resource, whereas an integration request is embodied in an Integration resource. On the other hand, a method response is represented by a MethodResponse resource, whereas an integration response is represented by an IntegrationResponse resource. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**httpMethod** | [**String**](String.md) |  |  [optional] |
|**authorizationType** | [**String**](String.md) |  |  [optional] |
|**authorizerId** | [**String**](String.md) |  |  [optional] |
|**apiKeyRequired** | [**Boolean**](Boolean.md) |  |  [optional] |
|**requestValidatorId** | [**String**](String.md) |  |  [optional] |
|**operationName** | [**String**](String.md) |  |  [optional] |
|**requestParameters** | [**Map**](Map.md) |  |  [optional] |
|**requestModels** | [**Map**](Map.md) |  |  [optional] |
|**methodResponses** | [**Map**](Map.md) |  |  [optional] |
|**methodIntegration** | [**MethodMethodIntegration**](MethodMethodIntegration.md) |  |  [optional] |
|**authorizationScopes** | [**List**](List.md) |  |  [optional] |



