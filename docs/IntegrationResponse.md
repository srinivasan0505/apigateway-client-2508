

# IntegrationResponse

Represents an integration response. The status code must map to an existing MethodResponse, and parameters and templates can be used to transform the back-end response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**statusCode** | [**String**](String.md) |  |  [optional] |
|**selectionPattern** | [**String**](String.md) |  |  [optional] |
|**responseParameters** | [**Map**](Map.md) |  |  [optional] |
|**responseTemplates** | [**Map**](Map.md) |  |  [optional] |
|**contentHandling** | [**ContentHandlingStrategy**](ContentHandlingStrategy.md) |  |  [optional] |



