

# CreateUsagePlanRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the usage plan. |  |
|**description** | **String** | The description of the usage plan. |  [optional] |
|**apiStages** | [**List&lt;ApiStage&gt;**](ApiStage.md) | The associated API stages of the usage plan. |  [optional] |
|**throttle** | [**CreateUsagePlanRequestThrottle**](CreateUsagePlanRequestThrottle.md) |  |  [optional] |
|**quota** | [**CreateUsagePlanRequestQuota**](CreateUsagePlanRequestQuota.md) |  |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | The key-value map of strings. The valid character set is [a-zA-Z+-&#x3D;._:/]. The tag key can be up to 128 characters and must not start with &lt;code&gt;aws:&lt;/code&gt;. The tag value can be up to 256 characters. |  [optional] |



