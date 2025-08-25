

# UsagePlan

Represents a usage plan used to specify who can assess associated API stages. Optionally, target request rate and quota limits can be set. In some cases clients can exceed the targets that you set. Don’t rely on usage plans to control costs. Consider using <a href=\"https://docs.aws.amazon.com/cost-management/latest/userguide/budgets-managing-costs.html\">Amazon Web Services Budgets</a> to monitor costs and <a href=\"https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html\">WAF</a> to manage API requests.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**String**](String.md) |  |  [optional] |
|**name** | [**String**](String.md) |  |  [optional] |
|**description** | [**String**](String.md) |  |  [optional] |
|**apiStages** | [**List**](List.md) |  |  [optional] |
|**throttle** | [**UsagePlanThrottle**](UsagePlanThrottle.md) |  |  [optional] |
|**quota** | [**UsagePlanQuota**](UsagePlanQuota.md) |  |  [optional] |
|**productCode** | [**String**](String.md) |  |  [optional] |
|**tags** | [**Map**](Map.md) |  |  [optional] |



