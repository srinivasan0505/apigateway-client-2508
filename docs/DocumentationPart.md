

# DocumentationPart

A documentation part for a targeted API entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**String**](String.md) |  |  [optional] |
|**location** | [**DocumentationPartLocation**](DocumentationPartLocation.md) |  |  [optional] |
|**properties** | **Object** | A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., &lt;code&gt;\&quot;{ \\\&quot;description\\\&quot;: \\\&quot;The API does ...\\\&quot; }\&quot;&lt;/code&gt;. Only OpenAPI-compliant documentation-related fields from the properties map are exported and, hence, published as part of the API entity definitions, while the original documentation parts are exported in a OpenAPI extension of &lt;code&gt;x-amazon-apigateway-documentation&lt;/code&gt;. |  [optional] |



