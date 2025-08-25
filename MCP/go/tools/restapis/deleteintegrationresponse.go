package tools

import (
	"context"
	"encoding/json"
	"fmt"
	"io"
	"net/http"

	"github.com/amazon-api-gateway/mcp-server/config"
	"github.com/amazon-api-gateway/mcp-server/models"
	"github.com/mark3labs/mcp-go/mcp"
)

func DeleteintegrationresponseHandler(cfg *config.APIConfig) func(ctx context.Context, request mcp.CallToolRequest) (*mcp.CallToolResult, error) {
	return func(ctx context.Context, request mcp.CallToolRequest) (*mcp.CallToolResult, error) {
		args, ok := request.Params.Arguments.(map[string]any)
		if !ok {
			return mcp.NewToolResultError("Invalid arguments object"), nil
		}
		restapi_idVal, ok := args["restapi_id"]
		if !ok {
			return mcp.NewToolResultError("Missing required path parameter: restapi_id"), nil
		}
		restapi_id, ok := restapi_idVal.(string)
		if !ok {
			return mcp.NewToolResultError("Invalid path parameter: restapi_id"), nil
		}
		resource_idVal, ok := args["resource_id"]
		if !ok {
			return mcp.NewToolResultError("Missing required path parameter: resource_id"), nil
		}
		resource_id, ok := resource_idVal.(string)
		if !ok {
			return mcp.NewToolResultError("Invalid path parameter: resource_id"), nil
		}
		http_methodVal, ok := args["http_method"]
		if !ok {
			return mcp.NewToolResultError("Missing required path parameter: http_method"), nil
		}
		http_method, ok := http_methodVal.(string)
		if !ok {
			return mcp.NewToolResultError("Invalid path parameter: http_method"), nil
		}
		status_codeVal, ok := args["status_code"]
		if !ok {
			return mcp.NewToolResultError("Missing required path parameter: status_code"), nil
		}
		status_code, ok := status_codeVal.(string)
		if !ok {
			return mcp.NewToolResultError("Invalid path parameter: status_code"), nil
		}
		url := fmt.Sprintf("%s/restapis/%s/resources/%s/methods/%s/integration/responses/%s", cfg.BaseURL, restapi_id, resource_id, http_method, status_code)
		req, err := http.NewRequest("DELETE", url, nil)
		if err != nil {
			return mcp.NewToolResultErrorFromErr("Failed to create request", err), nil
		}
		// Set authentication based on auth type
		// Handle multiple authentication parameters
		if cfg.BearerToken != "" {
			req.Header.Set("X-Amz-Security-Token", cfg.BearerToken)
		}
		req.Header.Set("Accept", "application/json")
		if val, ok := args["X-Amz-Content-Sha256"]; ok {
			req.Header.Set("X-Amz-Content-Sha256", fmt.Sprintf("%v", val))
		}
		if val, ok := args["X-Amz-Date"]; ok {
			req.Header.Set("X-Amz-Date", fmt.Sprintf("%v", val))
		}
		if val, ok := args["X-Amz-Algorithm"]; ok {
			req.Header.Set("X-Amz-Algorithm", fmt.Sprintf("%v", val))
		}
		if val, ok := args["X-Amz-Credential"]; ok {
			req.Header.Set("X-Amz-Credential", fmt.Sprintf("%v", val))
		}
		if val, ok := args["X-Amz-Security-Token"]; ok {
			req.Header.Set("X-Amz-Security-Token", fmt.Sprintf("%v", val))
		}
		if val, ok := args["X-Amz-Signature"]; ok {
			req.Header.Set("X-Amz-Signature", fmt.Sprintf("%v", val))
		}
		if val, ok := args["X-Amz-SignedHeaders"]; ok {
			req.Header.Set("X-Amz-SignedHeaders", fmt.Sprintf("%v", val))
		}

		resp, err := http.DefaultClient.Do(req)
		if err != nil {
			return mcp.NewToolResultErrorFromErr("Request failed", err), nil
		}
		defer resp.Body.Close()

		body, err := io.ReadAll(resp.Body)
		if err != nil {
			return mcp.NewToolResultErrorFromErr("Failed to read response body", err), nil
		}

		if resp.StatusCode >= 400 {
			return mcp.NewToolResultError(fmt.Sprintf("API error: %s", body)), nil
		}
		// Use properly typed response
		var result map[string]interface{}
		if err := json.Unmarshal(body, &result); err != nil {
			// Fallback to raw text if unmarshaling fails
			return mcp.NewToolResultText(string(body)), nil
		}

		prettyJSON, err := json.MarshalIndent(result, "", "  ")
		if err != nil {
			return mcp.NewToolResultErrorFromErr("Failed to format JSON", err), nil
		}

		return mcp.NewToolResultText(string(prettyJSON)), nil
	}
}

func CreateDeleteintegrationresponseTool(cfg *config.APIConfig) models.Tool {
	tool := mcp.NewTool("delete_restapis_restapi_id_resources_resource_id_methods_http_method_integration_responses_status_code",
		mcp.WithDescription("Represents a delete integration response."),
		mcp.WithString("X-Amz-Content-Sha256", mcp.Description("")),
		mcp.WithString("X-Amz-Date", mcp.Description("")),
		mcp.WithString("X-Amz-Algorithm", mcp.Description("")),
		mcp.WithString("X-Amz-Credential", mcp.Description("")),
		mcp.WithString("X-Amz-Security-Token", mcp.Description("")),
		mcp.WithString("X-Amz-Signature", mcp.Description("")),
		mcp.WithString("X-Amz-SignedHeaders", mcp.Description("")),
		mcp.WithString("restapi_id", mcp.Required(), mcp.Description("The string identifier of the associated RestApi.")),
		mcp.WithString("resource_id", mcp.Required(), mcp.Description("Specifies a delete integration response request's resource identifier.")),
		mcp.WithString("http_method", mcp.Required(), mcp.Description("Specifies a delete integration response request's HTTP method.")),
		mcp.WithString("status_code", mcp.Required(), mcp.Description("Specifies a delete integration response request's status code.")),
	)

	return models.Tool{
		Definition: tool,
		Handler:    DeleteintegrationresponseHandler(cfg),
	}
}
