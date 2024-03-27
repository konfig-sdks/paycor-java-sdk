# JobTitlesApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listByTenantId**](JobTitlesApi.md#listByTenantId) | **GET** /v1/tenants/{tenantId}/jobtitles | Get All Job Titles by Tenant ID |


<a name="listByTenantId"></a>
# **listByTenantId**
> PagedResultOfTenantJobTitle listByTenantId(tenantId).continuationToken(continuationToken).execute();

Get All Job Titles by Tenant ID

Job Titles are configured at a Tenant level, unlike most other objects which are configured at a Legal Entity level.  Data Access: View Tenant Job Titles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobTitlesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://apis.paycor.com";
    
    configuration.accessToken  = "YOUR API KEY";
    
    configuration.apimSubscriptionKey  = "YOUR API KEY";
    Paycor client = new Paycor(configuration);
    Integer tenantId = 56; // ID of the Tenant you want to get Job Titles.
    String continuationToken = "continuationToken_example"; // Token to get the next set of Job Titles
    try {
      PagedResultOfTenantJobTitle result = client
              .jobTitles
              .listByTenantId(tenantId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitlesApi#listByTenantId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfTenantJobTitle> response = client
              .jobTitles
              .listByTenantId(tenantId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitlesApi#listByTenantId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **Integer**| ID of the Tenant you want to get Job Titles. | |
| **continuationToken** | **String**| Token to get the next set of Job Titles | [optional] |

### Return type

[**PagedResultOfTenantJobTitle**](PagedResultOfTenantJobTitle.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Tenant&#39;s Job Titles based on the TenantID provided. |  -  |

