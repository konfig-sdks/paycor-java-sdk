# EventsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notifyEventDetails**](EventsApi.md#notifyEventDetails) | **POST** /v1/events/mockevent | Mock Event Notification |


<a name="notifyEventDetails"></a>
# **notifyEventDetails**
> Event notifyEventDetails(command).execute();

Mock Event Notification

Following body attributes are optionally required: * ItemId is required when EventType is Employee.Modified * LegalEntityId is required when EventType is LegalEntity.Modified

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventsApi;
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
    String applicationId = "applicationId_example"; // Unique Identifier of the Application that needs mock events.             
    String notificationURL = "notificationURL_example"; // URL where the Event Notification has to be sent.             
    String notificationSecret = "notificationSecret_example"; // Secret or Security Token required to authenticate above server.             
    String eventType = "eventType_example"; // Type of Event that needs to be triggered by Paycor's System.
    Integer tenantId = 56; // Unique Identifier of the Tenant in Paycor's system.
    String itemId = "itemId_example"; // Unique Identifier of the Resource change for the Event that is triggered by Paycor.             
    Integer legalEntityId = 56; // Unique Identifier of the Legal Entity in Paycor's system.             
    try {
      Event result = client
              .events
              .notifyEventDetails(applicationId, notificationURL, notificationSecret, eventType, tenantId)
              .itemId(itemId)
              .legalEntityId(legalEntityId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEventType());
      System.out.println(result.getEventId());
      System.out.println(result.getTenantId());
      System.out.println(result.getLegalEntityId());
      System.out.println(result.getItemId());
      System.out.println(result.getExtendedProperties());
      System.out.println(result.getChangedFields());
      System.out.println(result.getResource());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#notifyEventDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Event> response = client
              .events
              .notifyEventDetails(applicationId, notificationURL, notificationSecret, eventType, tenantId)
              .itemId(itemId)
              .legalEntityId(legalEntityId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#notifyEventDetails");
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
| **command** | [**Command**](Command.md)| Mock Event that user wants to trigger. | |

### Return type

[**Event**](Event.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the Event Notification Object that will be triggered by Paycor. |  -  |

