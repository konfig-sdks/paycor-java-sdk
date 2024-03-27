# LegalEntityTimeDataApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTimeOffRequestErrorLogsByTrackingId**](LegalEntityTimeDataApi.md#getTimeOffRequestErrorLogsByTrackingId) | **GET** /v1/legalentities/{legalEntityId}/timeoffRequestserrorlog/{trackingId} | Get Employee Timeoff Request error logs by Legal Entity Id And Tracking Id |


<a name="getTimeOffRequestErrorLogsByTrackingId"></a>
# **getTimeOffRequestErrorLogsByTrackingId**
> TimeOffRequestsErrorLog getTimeOffRequestErrorLogsByTrackingId(legalEntityId, trackingId).execute();

Get Employee Timeoff Request error logs by Legal Entity Id And Tracking Id

Data Access: View Timeoff Requests by Timeoff Request Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityTimeDataApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to get the Timeoff Request.
    String trackingId = "trackingId_example"; // ID of the Employee Timeoff Request failure result.
    try {
      TimeOffRequestsErrorLog result = client
              .legalEntityTimeData
              .getTimeOffRequestErrorLogsByTrackingId(legalEntityId, trackingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTrackingId());
      System.out.println(result.getToRDetail());
      System.out.println(result.getErrorDetail());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityTimeDataApi#getTimeOffRequestErrorLogsByTrackingId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffRequestsErrorLog> response = client
              .legalEntityTimeData
              .getTimeOffRequestErrorLogsByTrackingId(legalEntityId, trackingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityTimeDataApi#getTimeOffRequestErrorLogsByTrackingId");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to get the Timeoff Request. | |
| **trackingId** | **String**| ID of the Employee Timeoff Request failure result. | |

### Return type

[**TimeOffRequestsErrorLog**](TimeOffRequestsErrorLog.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |            Returns Timeoff Request Error log for specific Legal Entity and tracking ID             |  -  |

