

# CreateStageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stageName** | **String** | The name for the Stage resource. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters. |  |
|**deploymentId** | **String** | The identifier of the Deployment resource for the Stage resource. |  |
|**description** | **String** | The description of the Stage resource. |  [optional] |
|**cacheClusterEnabled** | **Boolean** | Whether cache clustering is enabled for the stage. |  [optional] |
|**cacheClusterSize** | [**CacheClusterSizeEnum**](#CacheClusterSizeEnum) | Returns the size of the CacheCluster. |  [optional] |
|**variables** | **Map&lt;String, String&gt;** | A map that defines the stage variables for the new Stage resource. Variable names can have alphanumeric and underscore characters, and the values must match &lt;code&gt;[A-Za-z0-9-._~:/?#&amp;amp;&#x3D;,]+&lt;/code&gt;. |  [optional] |
|**documentationVersion** | **String** | The version of the associated API documentation. |  [optional] |
|**canarySettings** | [**CreateStageRequestCanarySettings**](CreateStageRequestCanarySettings.md) |  |  [optional] |
|**tracingEnabled** | **Boolean** | Specifies whether active tracing with X-ray is enabled for the Stage. |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | The key-value map of strings. The valid character set is [a-zA-Z+-&#x3D;._:/]. The tag key can be up to 128 characters and must not start with &lt;code&gt;aws:&lt;/code&gt;. The tag value can be up to 256 characters. |  [optional] |



## Enum: CacheClusterSizeEnum

| Name | Value |
|---- | -----|
| _0_5 | &quot;0.5&quot; |
| _1_6 | &quot;1.6&quot; |
| _6_1 | &quot;6.1&quot; |
| _13_5 | &quot;13.5&quot; |
| _28_4 | &quot;28.4&quot; |
| _58_2 | &quot;58.2&quot; |
| _118 | &quot;118&quot; |
| _237 | &quot;237&quot; |



