# EmployeeLegacyPerformTimeSchedulesApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToEmployee**](EmployeeLegacyPerformTimeSchedulesApi.md#addToEmployee) | **POST** /v1/employees/{employeeId}/schedules | Add Schedule to Employee |
| [**deleteLegacySchedule**](EmployeeLegacyPerformTimeSchedulesApi.md#deleteLegacySchedule) | **DELETE** /v1/employees/{employeeId}/schedules/{scheduleId} | Delete Employee Schedule |
| [**getByEmployeeId**](EmployeeLegacyPerformTimeSchedulesApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/schedules | Get Employee Schedules by EmployeeID |
| [**getByLegalEntityId**](EmployeeLegacyPerformTimeSchedulesApi.md#getByLegalEntityId) | **GET** /v1/legalEntities/{legalEntityId}/schedules | Get Employee Schedules by Legal Entity ID |


<a name="addToEmployee"></a>
# **addToEmployee**
> CreateOrUpdateResponse addToEmployee(employeeId, schedule2).execute();

Add Schedule to Employee

Data Access: Create Legacy/Perform Time Employee Schedule

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeLegacyPerformTimeSchedulesApi;
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
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to add a schedule
    OffsetDateTime startDateTime = OffsetDateTime.now(); // Date and time the employee will begin work. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)             
    OffsetDateTime endDateTime = OffsetDateTime.now(); // Date and time the employee will stop work. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)             
    Integer beforeStartTimeInMinutes = 56; // Punches will be tied to the schedule if employee clocks in this many Minutes before shift starts.
    Integer afterEndTimeInMinutes = 56; // Punches will be tied to the schedule if employee clocks out this many Minutes after shift ends.
    String label = "label_example"; // This is the label that will be assigned to the shift.             
    String shiftDepeartmentId = "shiftDepeartmentId_example"; // Unique identifier of the Department where the employee's timecard will be created.
    try {
      CreateOrUpdateResponse result = client
              .employeeLegacyPerformTimeSchedules
              .addToEmployee(employeeId)
              .startDateTime(startDateTime)
              .endDateTime(endDateTime)
              .beforeStartTimeInMinutes(beforeStartTimeInMinutes)
              .afterEndTimeInMinutes(afterEndTimeInMinutes)
              .label(label)
              .shiftDepeartmentId(shiftDepeartmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeLegacyPerformTimeSchedulesApi#addToEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeLegacyPerformTimeSchedules
              .addToEmployee(employeeId)
              .startDateTime(startDateTime)
              .endDateTime(endDateTime)
              .beforeStartTimeInMinutes(beforeStartTimeInMinutes)
              .afterEndTimeInMinutes(afterEndTimeInMinutes)
              .label(label)
              .shiftDepeartmentId(shiftDepeartmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeLegacyPerformTimeSchedulesApi#addToEmployee");
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
| **employeeId** | **String**| ID of an Employee for whom you want to add a schedule | |
| **schedule2** | [**Schedule2**](Schedule2.md)| Employee Schedule object to insert | |

### Return type

[**CreateOrUpdateResponse**](CreateOrUpdateResponse.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="deleteLegacySchedule"></a>
# **deleteLegacySchedule**
> deleteLegacySchedule(employeeId, scheduleId).execute();

Delete Employee Schedule

Data Access: Delete Legacy/Perform Time Employee Schedule

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeLegacyPerformTimeSchedulesApi;
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
    String employeeId = "employeeId_example"; // Employee ID of the schedule record you want to delete
    String scheduleId = "scheduleId_example"; // Schedule ID to delete
    try {
      client
              .employeeLegacyPerformTimeSchedules
              .deleteLegacySchedule(employeeId, scheduleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeLegacyPerformTimeSchedulesApi#deleteLegacySchedule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeLegacyPerformTimeSchedules
              .deleteLegacySchedule(employeeId, scheduleId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeLegacyPerformTimeSchedulesApi#deleteLegacySchedule");
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
| **employeeId** | **String**| Employee ID of the schedule record you want to delete | |
| **scheduleId** | **String**| Schedule ID to delete | |

### Return type

null (empty response body)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

<a name="getByEmployeeId"></a>
# **getByEmployeeId**
> List&lt;EmployeeSchedule&gt; getByEmployeeId(employeeId).startDate(startDate).endDate(endDate).execute();

Get Employee Schedules by EmployeeID

Date requirements: * Start Date and End Date must not be more than one year ago * Start Date must not be in future * Start date and end date range can be no greater than 90 days  Data Access: View Legacy/Perform Employee Schedules by Employee Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeLegacyPerformTimeSchedulesApi;
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
    String employeeId = "employeeId_example"; // ID of employee for which you want to get schedules
    OffsetDateTime startDate = OffsetDateTime.now(); // Date range filter, showing which records to return
    OffsetDateTime endDate = OffsetDateTime.now(); // Date range filter, showing which records to return
    try {
      List<EmployeeSchedule> result = client
              .employeeLegacyPerformTimeSchedules
              .getByEmployeeId(employeeId)
              .startDate(startDate)
              .endDate(endDate)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeLegacyPerformTimeSchedulesApi#getByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeSchedule>> response = client
              .employeeLegacyPerformTimeSchedules
              .getByEmployeeId(employeeId)
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeLegacyPerformTimeSchedulesApi#getByEmployeeId");
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
| **employeeId** | **String**| ID of employee for which you want to get schedules | |
| **startDate** | **OffsetDateTime**| Date range filter, showing which records to return | [optional] |
| **endDate** | **OffsetDateTime**| Date range filter, showing which records to return | [optional] |

### Return type

[**List&lt;EmployeeSchedule&gt;**](EmployeeSchedule.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Collection of Employee Schedules, based on EmployeeID and provided date ranges |  -  |

<a name="getByLegalEntityId"></a>
# **getByLegalEntityId**
> PagedResultOfEmployeeSchedule getByLegalEntityId(legalEntityId).startDate(startDate).endDate(endDate).continuationToken(continuationToken).execute();

Get Employee Schedules by Legal Entity ID

Date requirements: * Start Date and End Date must not be more than one year ago * Start Date must not be in future * Start date and end date range can be no greater than 90 days  Data Access: View Legacy/Perform Employee Schedules by Legal Entity Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeLegacyPerformTimeSchedulesApi;
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
    Integer legalEntityId = 56; // ID of Legal Entity for which you want to get schedules
    OffsetDateTime startDate = OffsetDateTime.now(); // Date range filter, showing which records to return
    OffsetDateTime endDate = OffsetDateTime.now(); // Date range filter, showing which records to return
    String continuationToken = "continuationToken_example";
    try {
      PagedResultOfEmployeeSchedule result = client
              .employeeLegacyPerformTimeSchedules
              .getByLegalEntityId(legalEntityId)
              .startDate(startDate)
              .endDate(endDate)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeLegacyPerformTimeSchedulesApi#getByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfEmployeeSchedule> response = client
              .employeeLegacyPerformTimeSchedules
              .getByLegalEntityId(legalEntityId)
              .startDate(startDate)
              .endDate(endDate)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeLegacyPerformTimeSchedulesApi#getByLegalEntityId");
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
| **legalEntityId** | **Integer**| ID of Legal Entity for which you want to get schedules | |
| **startDate** | **OffsetDateTime**| Date range filter, showing which records to return | [optional] |
| **endDate** | **OffsetDateTime**| Date range filter, showing which records to return | [optional] |
| **continuationToken** | **String**|  | [optional] |

### Return type

[**PagedResultOfEmployeeSchedule**](PagedResultOfEmployeeSchedule.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Collection of Employee Schedules, based on Legal Entity ID and provided date ranges |  -  |

