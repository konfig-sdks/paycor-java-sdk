# EmployeePayScheduleApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUpcomingCheckDates**](EmployeePayScheduleApi.md#getUpcomingCheckDates) | **GET** /v1/employees/{employeeId}/payschedule | Get Employee Pay Schedule by EmployeeID |


<a name="getUpcomingCheckDates"></a>
# **getUpcomingCheckDates**
> PagedResultOfPayPeriod getUpcomingCheckDates(employeeId).periodStartDate(periodStartDate).periodEndDate(periodEndDate).continuationToken(continuationToken).include(include).execute();

Get Employee Pay Schedule by EmployeeID

This API will return upcoming pay scheduled for a given employee (upcoming check dates), or allow looking up the check date for specific pay period dates. * You must either specify the exact Period Start &amp; End Date, or leave them blank.    * Alternatively you may consider &#39;GET Legal Entity Pay Schedule&#39; which takes a range parameter.   * You can look up pay period dates from &#39;GET Legal Entity Pay Schedule&#39; (scheduled dates) or &#39;GET Legal Entity Pay Data&#39; (actual dates) * The actual pay dates may change depending on when the client admin processes payroll.  Data Access: View Employee Pay Schedule

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayScheduleApi;
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
    String employeeId = "employeeId_example"; // ID of the Employee for which you want to get the Pay Schedule
    OffsetDateTime periodStartDate = OffsetDateTime.now(); // Exact Period Start Date of Pay Schedule, to lookup specific payrun. 
    OffsetDateTime periodEndDate = OffsetDateTime.now(); // Exact Period End Date of Pay Schedule, if you wish to filter - defaults to showing upcoming (future) runs
    String continuationToken = "continuationToken_example"; // Token to get the next set of Employee Pay Schedule
    List<Includes8> include = Arrays.asList(); // Options to include more data: Additional Runs
    try {
      PagedResultOfPayPeriod result = client
              .employeePaySchedule
              .getUpcomingCheckDates(employeeId)
              .periodStartDate(periodStartDate)
              .periodEndDate(periodEndDate)
              .continuationToken(continuationToken)
              .include(include)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayScheduleApi#getUpcomingCheckDates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfPayPeriod> response = client
              .employeePaySchedule
              .getUpcomingCheckDates(employeeId)
              .periodStartDate(periodStartDate)
              .periodEndDate(periodEndDate)
              .continuationToken(continuationToken)
              .include(include)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayScheduleApi#getUpcomingCheckDates");
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
| **employeeId** | **String**| ID of the Employee for which you want to get the Pay Schedule | |
| **periodStartDate** | **OffsetDateTime**| Exact Period Start Date of Pay Schedule, to lookup specific payrun.  | [optional] |
| **periodEndDate** | **OffsetDateTime**| Exact Period End Date of Pay Schedule, if you wish to filter - defaults to showing upcoming (future) runs | [optional] |
| **continuationToken** | **String**| Token to get the next set of Employee Pay Schedule | [optional] |
| **include** | [**List&lt;Includes8&gt;**](Includes8.md)| Options to include more data: Additional Runs | [optional] |

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
| **200** | Returns a collection of Employee&#39;s Pay Schedules based on EmployeeID and filters provided |  -  |

