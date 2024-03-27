# LegalEntityStatusReasonApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getList**](LegalEntityStatusReasonApi.md#getList) | **GET** /v1/legalentities/{legalEntityId}/statusReasons/{statusCategory} | Get Legal Entity Status Reason values |


<a name="getList"></a>
# **getList**
> List&lt;StatusReason&gt; getList(legalEntityId, statusCategory).execute();

Get Legal Entity Status Reason values

Data Access: Legal Entity Status Reason

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityStatusReasonApi;
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
    Integer legalEntityId = 56; // ID of the legal entity for which you want to get the status reasons items
    StatusCategory2 statusCategory = StatusCategory2.fromValue("TerminationReason"); // Status category of status reasons.
    try {
      List<StatusReason> result = client
              .legalEntityStatusReason
              .getList(legalEntityId, statusCategory)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityStatusReasonApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<StatusReason>> response = client
              .legalEntityStatusReason
              .getList(legalEntityId, statusCategory)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityStatusReasonApi#getList");
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
| **legalEntityId** | **Integer**| ID of the legal entity for which you want to get the status reasons items | |
| **statusCategory** | [**StatusCategory2**](.md)| Status category of status reasons. | [enum: TerminationReason, LeaveReason, ReturnReason] |

### Return type

[**List&lt;StatusReason&gt;**](StatusReason.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns collection of status reasons by status category. |  -  |

