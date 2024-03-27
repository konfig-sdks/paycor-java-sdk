# LegalEntityPayGroupsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listByLegalEntityId**](LegalEntityPayGroupsApi.md#listByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/payGroups | Get Pay Groups by Legal Entity ID |


<a name="listByLegalEntityId"></a>
# **listByLegalEntityId**
> PagedResultOfPayGroup listByLegalEntityId(legalEntityId).continuationToken(continuationToken).execute();

Get Pay Groups by Legal Entity ID

Data Access: View Legal Entity Pay Groups

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityPayGroupsApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to get the Pay Groups
    String continuationToken = "continuationToken_example"; // Token to get the next set of Legal Entity Pay Groups
    try {
      PagedResultOfPayGroup result = client
              .legalEntityPayGroups
              .listByLegalEntityId(legalEntityId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityPayGroupsApi#listByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfPayGroup> response = client
              .legalEntityPayGroups
              .listByLegalEntityId(legalEntityId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityPayGroupsApi#listByLegalEntityId");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to get the Pay Groups | |
| **continuationToken** | **String**| Token to get the next set of Legal Entity Pay Groups | [optional] |

### Return type

[**PagedResultOfPayGroup**](PagedResultOfPayGroup.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of the Pay Groups available for the Legal Entity ID provided. |  -  |

