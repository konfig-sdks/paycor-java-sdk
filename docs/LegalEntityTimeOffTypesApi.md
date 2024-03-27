# LegalEntityTimeOffTypesApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**viewTimeOffTypes**](LegalEntityTimeOffTypesApi.md#viewTimeOffTypes) | **GET** /v1/legalentities/{legalEntityId}/timeofftypes | Get Legal Entity Time Off Types |


<a name="viewTimeOffTypes"></a>
# **viewTimeOffTypes**
> PagedResultOfTimeOffType viewTimeOffTypes(legalEntityId).continuationToken(continuationToken).execute();

Get Legal Entity Time Off Types

Data Access: View Time Off Types

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityTimeOffTypesApi;
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
    Integer legalEntityId = 56; // ID of an Legal Entity for which you want to get the Time Off Types
    String continuationToken = "continuationToken_example"; // Token to get the next set of results
    try {
      PagedResultOfTimeOffType result = client
              .legalEntityTimeOffTypes
              .viewTimeOffTypes(legalEntityId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityTimeOffTypesApi#viewTimeOffTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfTimeOffType> response = client
              .legalEntityTimeOffTypes
              .viewTimeOffTypes(legalEntityId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityTimeOffTypesApi#viewTimeOffTypes");
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
| **legalEntityId** | **Integer**| ID of an Legal Entity for which you want to get the Time Off Types | |
| **continuationToken** | **String**| Token to get the next set of results | [optional] |

### Return type

[**PagedResultOfTimeOffType**](PagedResultOfTimeOffType.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of Time Off Types based on Legal Entity Id provided |  -  |

