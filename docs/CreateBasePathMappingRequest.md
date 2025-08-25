

# CreateBasePathMappingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**basePath** | **String** | The base path name that callers of the API must provide as part of the URL after the domain name. This value must be unique for all of the mappings across a single API. Specify &#39;(none)&#39; if you do not want callers to specify a base path name after the domain name. |  [optional] |
|**restApiId** | **String** | The string identifier of the associated RestApi. |  |
|**stage** | **String** | The name of the API&#39;s stage that you want to use for this mapping. Specify &#39;(none)&#39; if you want callers to explicitly specify the stage name after any base path name. |  [optional] |



