# LegalEntityPayScheduleApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByLegalEntityAndPaygroup**](LegalEntityPayScheduleApi.md#getByLegalEntityAndPaygroup) | **GET** /v1/legalentities/{legalEntityId}/payschedule | Get Legal Entity Pay Schedule by Legal Entity ID and Paygroup ID |


<a name="getByLegalEntityAndPaygroup"></a>
# **getByLegalEntityAndPaygroup**
> PagedResultOfPayPeriod getByLegalEntityAndPaygroup(legalEntityId).payGroupId(payGroupId).asOfDate(asOfDate).untilDate(untilDate).continuationToken(continuationToken).execute();

Get Legal Entity Pay Schedule by Legal Entity ID and Paygroup ID

This returns the schedule of regularly-scheduled payruns for a given Paygroup and date range.  * Tip: first list the Paygroups within a Legal Entity using GET Legal Entity Pay Groups, in order to populate the payGroupId parameter * Tip: You can take the returned Check Dates or Process Dates and pass into Get Employee Pay Stubs by EmployeeID  Note that query parameters PayGroupId, AsOfDate and UntilDate are required.  Data Access: View Pay Schedule Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityPayScheduleApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to get the Pay Schedule
    String payGroupId = "payGroupId_example"; // ID of the Paygroup for whom you want to get the Pay Schedule. Available via 'GET Legal Entity Pay Groups'
    OffsetDateTime asOfDate = OffsetDateTime.now(); // Acts as a 'start date' filter - looks for Payruns that are in-progress or unpaid as of this date
    OffsetDateTime untilDate = OffsetDateTime.now(); // Acts as an 'end date' filter - looks for Payruns that are in-progress or unpaid until this date
    String continuationToken = "continuationToken_example"; // Token to get the next set of Legal Entity Pay Schedule
    try {
      PagedResultOfPayPeriod result = client
              .legalEntityPaySchedule
              .getByLegalEntityAndPaygroup(legalEntityId)
              .payGroupId(payGroupId)
              .asOfDate(asOfDate)
              .untilDate(untilDate)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityPayScheduleApi#getByLegalEntityAndPaygroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfPayPeriod> response = client
              .legalEntityPaySchedule
              .getByLegalEntityAndPaygroup(legalEntityId)
              .payGroupId(payGroupId)
              .asOfDate(asOfDate)
              .untilDate(untilDate)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityPayScheduleApi#getByLegalEntityAndPaygroup");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to get the Pay Schedule | |
| **payGroupId** | **String**| ID of the Paygroup for whom you want to get the Pay Schedule. Available via &#39;GET Legal Entity Pay Groups&#39; | [optional] |
| **asOfDate** | **OffsetDateTime**| Acts as a &#39;start date&#39; filter - looks for Payruns that are in-progress or unpaid as of this date | [optional] |
| **untilDate** | **OffsetDateTime**| Acts as an &#39;end date&#39; filter - looks for Payruns that are in-progress or unpaid until this date | [optional] |
| **continuationToken** | **String**| Token to get the next set of Legal Entity Pay Schedule | [optional] |

### Return type

[**PagedResultOfPayPeriod**](PagedResultOfPayPeriod.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of Legal Entity Pay Schedules (payrun period dates) based on parameters provided |  -  |

