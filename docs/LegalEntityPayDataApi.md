# LegalEntityPayDataApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPayDates**](LegalEntityPayDataApi.md#getPayDates) | **GET** /v1/legalentities/{legalEntityId}/paydata | Get Legal Entity Pay Data by Legal Entity ID |


<a name="getPayDates"></a>
# **getPayDates**
> PagedResultOfLegalEntityPayData getPayDates(legalEntityId).employeeId(employeeId).fromCheckDate(fromCheckDate).toCheckDate(toCheckDate).processDate(processDate).plannerId(plannerId).continuationToken(continuationToken).execute();

Get Legal Entity Pay Data by Legal Entity ID

This endpoint returns the dates that particular employees were actually paid. * You can retrieve all employees by not passing EmployeeId, or you can pass EmployeeId to filter. * The returned values (Check Date or Process Date) can be used as an input for GET Employee Pay Stubs. * Only dates from provided fromCheckDate and toCheckDate are used. * Requires exactly one filtering parameter to be passed in. Choose *one* of these three:   * Check Date range: parameters fromCheckDate and toCheckDate   * Process Date: the single date the payrun was processed.   * PlannerID: You can retrieve your Planner ID by using the Legal Entity Payroll Processing Data endpoint. * Returns one object per pay date, even if there were multiple paychecks on that same date. * Does include Additional Payruns, which don&#39;t have to follow the schedule and can be used for bonuses.  Data Access: View Paydata Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityPayDataApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to get the Pay Data
    String employeeId = "employeeId_example"; // ID of an Employee, if you want to filter to paydata from a specific Employee
    OffsetDateTime fromCheckDate = OffsetDateTime.now(); // Filter Option 1: Date Range, From Check Date of Payrun
    OffsetDateTime toCheckDate = OffsetDateTime.now(); // Filter Option 1: Date Range, To Check Date of Payrun
    OffsetDateTime processDate = OffsetDateTime.now(); // Filter Option 2: Process Date of Payrun
    String plannerId = "plannerId_example"; // Filter Option 3: ID of the Planner for which you want to get the Pay Data.
    String continuationToken = "continuationToken_example"; // Token to get the next set of Legal Entity Pay Data
    try {
      PagedResultOfLegalEntityPayData result = client
              .legalEntityPayData
              .getPayDates(legalEntityId)
              .employeeId(employeeId)
              .fromCheckDate(fromCheckDate)
              .toCheckDate(toCheckDate)
              .processDate(processDate)
              .plannerId(plannerId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityPayDataApi#getPayDates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfLegalEntityPayData> response = client
              .legalEntityPayData
              .getPayDates(legalEntityId)
              .employeeId(employeeId)
              .fromCheckDate(fromCheckDate)
              .toCheckDate(toCheckDate)
              .processDate(processDate)
              .plannerId(plannerId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityPayDataApi#getPayDates");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to get the Pay Data | |
| **employeeId** | **String**| ID of an Employee, if you want to filter to paydata from a specific Employee | [optional] |
| **fromCheckDate** | **OffsetDateTime**| Filter Option 1: Date Range, From Check Date of Payrun | [optional] |
| **toCheckDate** | **OffsetDateTime**| Filter Option 1: Date Range, To Check Date of Payrun | [optional] |
| **processDate** | **OffsetDateTime**| Filter Option 2: Process Date of Payrun | [optional] |
| **plannerId** | **String**| Filter Option 3: ID of the Planner for which you want to get the Pay Data. | [optional] |
| **continuationToken** | **String**| Token to get the next set of Legal Entity Pay Data | [optional] |

### Return type

[**PagedResultOfLegalEntityPayData**](PagedResultOfLegalEntityPayData.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of Legal Entity Pay Data based on Legal Entity ID, EmployeeID, and filter provided. |  -  |

