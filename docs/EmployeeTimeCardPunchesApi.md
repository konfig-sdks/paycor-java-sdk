# EmployeeTimeCardPunchesApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByEmployeeId**](EmployeeTimeCardPunchesApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/punches | Get Legal Entity Employees Time Card Punches by Employee ID |
| [**getByLegalEntityId**](EmployeeTimeCardPunchesApi.md#getByLegalEntityId) | **GET** /v1/legalEntities/{legalEntityId}/punches | Get Legal Entity Employees Time Card Punches by Legal Entity ID |


<a name="getByEmployeeId"></a>
# **getByEmployeeId**
> PagedResultOfTimeCardV3 getByEmployeeId(employeeId).startDate(startDate).endDate(endDate).continuationToken(continuationToken).execute();

Get Legal Entity Employees Time Card Punches by Employee ID

This pulls Punches data from Paycor&#39;s Perform Time system for one employee. * Clients *do not* need to run payroll before hours are returned by this endpoint. * Our Public API currently does not include whether the hours have already been Approved or not. * Time Card punches may be delayed by 20 minutes.  Date requirements: * Start Date and End Date must not be more than one year ago * Start Date must not be in future * Start date and end date range can be no greater than 90 days  Data Access: View Employee Time Card Punches

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTimeCardPunchesApi;
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
    String employeeId = "employeeId_example"; // ID of employee for which you want to get hours
    OffsetDateTime startDate = OffsetDateTime.now(); // Date range filter, showing which records to return
    OffsetDateTime endDate = OffsetDateTime.now(); // Date range filter, showing which records to return
    String continuationToken = "continuationToken_example"; // Token to get next set of Employee Time Cards. ContinuationToken would be valid only for 24 hours. If a call is made after 24 hours with old continuationToken, no data will be retrieved.
    try {
      PagedResultOfTimeCardV3 result = client
              .employeeTimeCardPunches
              .getByEmployeeId(employeeId)
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
      System.err.println("Exception when calling EmployeeTimeCardPunchesApi#getByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfTimeCardV3> response = client
              .employeeTimeCardPunches
              .getByEmployeeId(employeeId)
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
      System.err.println("Exception when calling EmployeeTimeCardPunchesApi#getByEmployeeId");
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
| **employeeId** | **String**| ID of employee for which you want to get hours | |
| **startDate** | **OffsetDateTime**| Date range filter, showing which records to return | [optional] |
| **endDate** | **OffsetDateTime**| Date range filter, showing which records to return | [optional] |
| **continuationToken** | **String**| Token to get next set of Employee Time Cards. ContinuationToken would be valid only for 24 hours. If a call is made after 24 hours with old continuationToken, no data will be retrieved. | [optional] |

### Return type

[**PagedResultOfTimeCardV3**](PagedResultOfTimeCardV3.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Employee Time Card collection, based on Legal Entity Id and provided date ranges |  -  |

<a name="getByLegalEntityId"></a>
# **getByLegalEntityId**
> PagedResultOfTimeCardV3 getByLegalEntityId(legalEntityId).startDate(startDate).endDate(endDate).continuationToken(continuationToken).execute();

Get Legal Entity Employees Time Card Punches by Legal Entity ID

This pulls Punches data from Paycor&#39;s Perform Time system, for one legal entity. * Clients *do not* need to run payroll before hours are returned by this endpoint. * Our Public API currently does not include whether the hours have already been Approved or not. * Time Card hours may be delayed by 20 minutes.  Date requirements: * Start Date and End Date must not be more than one year ago * Start Date must not be in future * Start date and end date range can be no greater than 90 days  Data Access: View Employee Time Card Punches By Legal Entity Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTimeCardPunchesApi;
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
    Integer legalEntityId = 56; // ID of legal entity for which you want to get hours
    OffsetDateTime startDate = OffsetDateTime.now(); // Date range filter, showing which records to return
    OffsetDateTime endDate = OffsetDateTime.now(); // Date range filter, showing which records to return
    String continuationToken = "continuationToken_example"; // Token to get next set of Employee Time Cards. ContinuationToken would be valid only for 24 hours. If a call is made after 24 hours with old continuationToken, no data will be retrieved.
    try {
      PagedResultOfTimeCardV3 result = client
              .employeeTimeCardPunches
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
      System.err.println("Exception when calling EmployeeTimeCardPunchesApi#getByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfTimeCardV3> response = client
              .employeeTimeCardPunches
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
      System.err.println("Exception when calling EmployeeTimeCardPunchesApi#getByLegalEntityId");
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
| **legalEntityId** | **Integer**| ID of legal entity for which you want to get hours | |
| **startDate** | **OffsetDateTime**| Date range filter, showing which records to return | [optional] |
| **endDate** | **OffsetDateTime**| Date range filter, showing which records to return | [optional] |
| **continuationToken** | **String**| Token to get next set of Employee Time Cards. ContinuationToken would be valid only for 24 hours. If a call is made after 24 hours with old continuationToken, no data will be retrieved. | [optional] |

### Return type

[**PagedResultOfTimeCardV3**](PagedResultOfTimeCardV3.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Employee Time Card collection, based on Legal Entity Id and provided date ranges |  -  |

