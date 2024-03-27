# TimeOffRequestsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTimeoffRequestById**](TimeOffRequestsApi.md#getTimeoffRequestById) | **GET** /v1/legalentities/{legalEntityId}/timeoffRequests/{timeoffRequestId} | Get Employee Timeoff Request by Legal Entity Id And Timeoff Request Id |
| [**listByEmployeeId**](TimeOffRequestsApi.md#listByEmployeeId) | **GET** /v1/employees/{employeeId}/timeoffrequests | Get Employee Time Off Requests by EmployeeId |
| [**listByLegalEntityId**](TimeOffRequestsApi.md#listByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/timeoffrequests | Get Employee Time Off Requests by Legal Entity Id |


<a name="getTimeoffRequestById"></a>
# **getTimeoffRequestById**
> EmployeeTimeOffRequest getTimeoffRequestById(legalEntityId, timeoffRequestId).execute();

Get Employee Timeoff Request by Legal Entity Id And Timeoff Request Id

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
import com.konfigthis.client.api.TimeOffRequestsApi;
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
    String timeoffRequestId = "timeoffRequestId_example"; // ID of the Employee Timeoff Request.
    try {
      EmployeeTimeOffRequest result = client
              .timeOffRequests
              .getTimeoffRequestById(legalEntityId, timeoffRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLegalEntityId());
      System.out.println(result.getTimeOffRequestId());
      System.out.println(result.getBenefitCode());
      System.out.println(result.getTotalHours());
      System.out.println(result.getDays());
      System.out.println(result.getComment());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getStatusUpdateTime());
      System.out.println(result.getStatusUpdateByEmployeeId());
      System.out.println(result.getCreatedByEmployeeId());
      System.out.println(result.getEmployeeId());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffRequestsApi#getTimeoffRequestById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTimeOffRequest> response = client
              .timeOffRequests
              .getTimeoffRequestById(legalEntityId, timeoffRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffRequestsApi#getTimeoffRequestById");
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
| **timeoffRequestId** | **String**| ID of the Employee Timeoff Request. | |

### Return type

[**EmployeeTimeOffRequest**](EmployeeTimeOffRequest.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an Employee Timeoff Request for specific Legal Entity |  -  |

<a name="listByEmployeeId"></a>
# **listByEmployeeId**
> PagedResultOfEmployeeTimeOffRequest listByEmployeeId(employeeId, startDate, endDate).continuationToken(continuationToken).execute();

Get Employee Time Off Requests by EmployeeId

Date requirements: * Start Date and End Date must not be more than one year ago * Start date and end date range can be no greater than 90 days  Data Access: View Timeoff Requests by Employee Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffRequestsApi;
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
    String employeeId = "employeeId_example"; // ID of the Employee for which you want to get the Time Off Requests.
    OffsetDateTime startDate = OffsetDateTime.now(); // Date range filter, showing which records to return.
    OffsetDateTime endDate = OffsetDateTime.now(); // Date range filter, showing which records to return.
    String continuationToken = "continuationToken_example"; // Token to get the next set of results.
    try {
      PagedResultOfEmployeeTimeOffRequest result = client
              .timeOffRequests
              .listByEmployeeId(employeeId, startDate, endDate)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffRequestsApi#listByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfEmployeeTimeOffRequest> response = client
              .timeOffRequests
              .listByEmployeeId(employeeId, startDate, endDate)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffRequestsApi#listByEmployeeId");
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
| **employeeId** | **String**| ID of the Employee for which you want to get the Time Off Requests. | |
| **startDate** | **OffsetDateTime**| Date range filter, showing which records to return. | |
| **endDate** | **OffsetDateTime**| Date range filter, showing which records to return. | |
| **continuationToken** | **String**| Token to get the next set of results. | [optional] |

### Return type

[**PagedResultOfEmployeeTimeOffRequest**](PagedResultOfEmployeeTimeOffRequest.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Time Off Requests for specific Employee. |  -  |

<a name="listByLegalEntityId"></a>
# **listByLegalEntityId**
> PagedResultOfEmployeeTimeOffRequest listByLegalEntityId(legalEntityId, startDate, endDate).continuationToken(continuationToken).execute();

Get Employee Time Off Requests by Legal Entity Id

Date requirements: * Start Date and End Date must not be more than one year ago * Start date and end date range can be no greater than 90 days  Data Access: View Timeoff Requests by Legal Entity Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffRequestsApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to get the Time Off Requests.
    OffsetDateTime startDate = OffsetDateTime.now(); // Date range filter, showing which records to return.
    OffsetDateTime endDate = OffsetDateTime.now(); // Date range filter, showing which records to return.
    String continuationToken = "continuationToken_example"; // Token to get the next set of results.
    try {
      PagedResultOfEmployeeTimeOffRequest result = client
              .timeOffRequests
              .listByLegalEntityId(legalEntityId, startDate, endDate)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffRequestsApi#listByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfEmployeeTimeOffRequest> response = client
              .timeOffRequests
              .listByLegalEntityId(legalEntityId, startDate, endDate)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffRequestsApi#listByLegalEntityId");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to get the Time Off Requests. | |
| **startDate** | **OffsetDateTime**| Date range filter, showing which records to return. | |
| **endDate** | **OffsetDateTime**| Date range filter, showing which records to return. | |
| **continuationToken** | **String**| Token to get the next set of results. | [optional] |

### Return type

[**PagedResultOfEmployeeTimeOffRequest**](PagedResultOfEmployeeTimeOffRequest.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of Time Off Requests of Employees for specific Legal Entity |  -  |

