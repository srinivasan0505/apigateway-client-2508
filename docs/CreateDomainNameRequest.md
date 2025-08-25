

# CreateDomainNameRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domainName** | **String** | The name of the DomainName resource. |  |
|**certificateName** | **String** | The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain name. |  [optional] |
|**certificateBody** | **String** | [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this domain name provided by your certificate authority. |  [optional] |
|**certificatePrivateKey** | **String** | [Deprecated] Your edge-optimized endpoint&#39;s domain name certificate&#39;s private key. |  [optional] |
|**certificateChain** | **String** | [Deprecated] The intermediate certificates and optionally the root certificate, one after the other without any blank lines, used by an edge-optimized endpoint for this domain name. If you include the root certificate, your certificate chain must start with intermediate certificates and end with the root certificate. Use the intermediate certificates that were provided by your certificate authority. Do not include any intermediaries that are not in the chain of trust path. |  [optional] |
|**certificateArn** | **String** | The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source. |  [optional] |
|**regionalCertificateName** | **String** | The user-friendly name of the certificate that will be used by regional endpoint for this domain name. |  [optional] |
|**regionalCertificateArn** | **String** | The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name. AWS Certificate Manager is the only supported source. |  [optional] |
|**endpointConfiguration** | [**CreateDomainNameRequestEndpointConfiguration**](CreateDomainNameRequestEndpointConfiguration.md) |  |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | The key-value map of strings. The valid character set is [a-zA-Z+-&#x3D;._:/]. The tag key can be up to 128 characters and must not start with &lt;code&gt;aws:&lt;/code&gt;. The tag value can be up to 256 characters. |  [optional] |
|**securityPolicy** | [**SecurityPolicyEnum**](#SecurityPolicyEnum) | The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are &lt;code&gt;TLS_1_0&lt;/code&gt; and &lt;code&gt;TLS_1_2&lt;/code&gt;. |  [optional] |
|**mutualTlsAuthentication** | [**CreateDomainNameRequestMutualTlsAuthentication**](CreateDomainNameRequestMutualTlsAuthentication.md) |  |  [optional] |
|**ownershipVerificationCertificateArn** | **String** | The ARN of the public certificate issued by ACM to validate ownership of your custom domain. Only required when configuring mutual TLS and using an ACM imported or private CA certificate ARN as the regionalCertificateArn. |  [optional] |



## Enum: SecurityPolicyEnum

| Name | Value |
|---- | -----|
| _0 | &quot;TLS_1_0&quot; |
| _2 | &quot;TLS_1_2&quot; |



