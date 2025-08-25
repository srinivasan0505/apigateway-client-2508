

# CreateVpcLinkRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name used to label and identify the VPC link. |  |
|**description** | **String** | The description of the VPC link. |  [optional] |
|**targetArns** | **List&lt;String&gt;** | The ARN of the network load balancer of the VPC targeted by the VPC link. The network load balancer must be owned by the same AWS account of the API owner. |  |
|**tags** | **Map&lt;String, String&gt;** | The key-value map of strings. The valid character set is [a-zA-Z+-&#x3D;._:/]. The tag key can be up to 128 characters and must not start with &lt;code&gt;aws:&lt;/code&gt;. The tag value can be up to 256 characters. |  [optional] |



