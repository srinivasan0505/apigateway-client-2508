

# CreateDeploymentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stageName** | **String** | The name of the Stage resource for the Deployment resource to create. |  [optional] |
|**stageDescription** | **String** | The description of the Stage resource for the Deployment resource to create. |  [optional] |
|**description** | **String** | The description for the Deployment resource to create. |  [optional] |
|**cacheClusterEnabled** | **Boolean** | Enables a cache cluster for the Stage resource specified in the input. |  [optional] |
|**cacheClusterSize** | [**CacheClusterSizeEnum**](#CacheClusterSizeEnum) | Returns the size of the CacheCluster. |  [optional] |
|**variables** | **Map&lt;String, String&gt;** | A map that defines the stage variables for the Stage resource that is associated with the new deployment. Variable names can have alphanumeric and underscore characters, and the values must match &lt;code&gt;[A-Za-z0-9-._~:/?#&amp;amp;&#x3D;,]+&lt;/code&gt;. |  [optional] |
|**canarySettings** | [**CreateDeploymentRequestCanarySettings**](CreateDeploymentRequestCanarySettings.md) |  |  [optional] |
|**tracingEnabled** | **Boolean** | Specifies whether active tracing with X-ray is enabled for the Stage. |  [optional] |



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



