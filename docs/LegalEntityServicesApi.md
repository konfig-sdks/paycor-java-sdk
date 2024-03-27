# LegalEntityServicesApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSubscribedServices**](LegalEntityServicesApi.md#getSubscribedServices) | **GET** /v1/legalentities/{legalEntityId}/services | Get subscribed services for Legal Entity |


<a name="getSubscribedServices"></a>
# **getSubscribedServices**
> Services getSubscribedServices(legalEntityId).execute();

Get subscribed services for Legal Entity

Data Access: View Legal Entity Services

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityServicesApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity you want to get (synonymous to Paycor's ClientID)
    try {
      Services result = client
              .legalEntityServices
              .getSubscribedServices(legalEntityId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTimeService());
      System.out.println(result.getTimeOnDemand());
      System.out.println(result.getPerformTime());
      System.out.println(result.getPerformTimeScheduling());
      System.out.println(result.getPaycorScheduling());
      System.out.println(result.getPaycorSchedulingPro());
      System.out.println(result.getPerformAccruals());
      System.out.println(result.getResellerAccruals());
      System.out.println(result.getPerformTimeOff());
      System.out.println(result.getIntegrationPayrollTimePartner());
      System.out.println(result.getWorkforceManagement());
      System.out.println(result.getJobCosting());
      System.out.println(result.getOnboarding());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityServicesApi#getSubscribedServices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Services> response = client
              .legalEntityServices
              .getSubscribedServices(legalEntityId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityServicesApi#getSubscribedServices");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity you want to get (synonymous to Paycor&#39;s ClientID) | |

### Return type

[**Services**](Services.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A listing of services for the specified Legal Entity |  -  |

