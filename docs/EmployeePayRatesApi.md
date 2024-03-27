# EmployeePayRatesApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewRate**](EmployeePayRatesApi.md#addNewRate) | **POST** /v1/employees/{employeeId}/payrates | Add Payrate to Employee |
| [**getByEmployeeId**](EmployeePayRatesApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/payrates | Get Employee Payrates by EmployeeID |
| [**updateByEmployeeIdAndPayrateId**](EmployeePayRatesApi.md#updateByEmployeeIdAndPayrateId) | **PUT** /v1/employees/{employeeId}/payrates/{payrateId} | Update Employee Payrate by EmployeeID |


<a name="addNewRate"></a>
# **addNewRate**
> CreateOrUpdateResponse addNewRate(employeeId, employeePayRate2).execute();

Add Payrate to Employee

This immediately creates a new payrate related to an Employee in Paycor&#39;s system. There is no way to undo or reverse this operation.   Data Access: Create Employee PayRates Sequence numbers must be consecutive and unique

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayRatesApi;
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
    OffsetDateTime effectiveStartDate = OffsetDateTime.now(); // Represents the date that the payrate goes into effect.  You can pass in future dates to take effect in future, or today's date to take effect immediately.  Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              
    Integer sequenceNumber = 56; // Orders how multiple earnings are calculated. Needed so earnings dependent on other earnings are calculated in the proper sequence. Must be unique and be ascending without gaps (ie 1, 2, 3…). Use GET Payrates to identify existing sequences.
    String description = "description_example"; // Required. Brief description of the employee's pay rate. Defaults to \\\"Rate {SequenceNumber}\\\" Must be 20 characters or less             
    String employeeId = "employeeId_example"; // ID of the Employee you wish to create the payrate for
    OffsetDateTime effectiveEndDate = OffsetDateTime.now(); // Date when the employee pay rate is no longer in effect. Default to null. Only pass in a date if the payrate is no longer active. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              
    Double payRate = 3.4D; // Employee's rate of pay (in dollars).  If Pay Type is Hourly, then Pay Rate is a Per-Hour dollar amount and is required.  If Pay Type is Salary, then Pay Rate is a Per-Pay dollar amount, and either Pay Rate or Annual Rate is required. Payrate can't have more than 6 decimal places and can't be negative.              
    Double annualPayRate = 3.4D; // Employee's annual pay amount (in dollars). Only used if Type=Salary.  * For Salary Type, AnnualPayRate overrides payRate if passed into API call. The value not provided will be calculated based on Employee's Annual Hours setup on Employee's Profile. * For Hourly Type, this parameter is ignored - Paycor calculates based on Employee's Annual Hours setup on Employee's Profile.             
    PayType type = PayType.fromValue("Salary");
    String reason = "reason_example"; // Reason associated with the employee's pay rate. Optional.              
    String notes = "notes_example"; // Notes associated with the employee's pay rate, which will be displayed on Pay Rate History page.  Must be 512 characters or less. Optional.              
    try {
      CreateOrUpdateResponse result = client
              .employeePayRates
              .addNewRate(effectiveStartDate, sequenceNumber, description, employeeId)
              .effectiveEndDate(effectiveEndDate)
              .payRate(payRate)
              .annualPayRate(annualPayRate)
              .type(type)
              .reason(reason)
              .notes(notes)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayRatesApi#addNewRate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeePayRates
              .addNewRate(effectiveStartDate, sequenceNumber, description, employeeId)
              .effectiveEndDate(effectiveEndDate)
              .payRate(payRate)
              .annualPayRate(annualPayRate)
              .type(type)
              .reason(reason)
              .notes(notes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayRatesApi#addNewRate");
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
| **employeeId** | **String**| ID of the Employee you wish to create the payrate for | |
| **employeePayRate2** | [**EmployeePayRate2**](EmployeePayRate2.md)| Create Payrate model | |

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
| **201** | Returns a CreateOrUpdateResponse object. |  -  |

<a name="getByEmployeeId"></a>
# **getByEmployeeId**
> PagedResultOfEmployeePayRate getByEmployeeId(employeeId).continuationToken(continuationToken).execute();

Get Employee Payrates by EmployeeID

Data Access: View Employee Payrates

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayRatesApi;
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
    String employeeId = "employeeId_example"; // ID of employee for which you want to get payrates
    String continuationToken = "continuationToken_example"; // Token to get next set of payrates
    try {
      PagedResultOfEmployeePayRate result = client
              .employeePayRates
              .getByEmployeeId(employeeId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayRatesApi#getByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfEmployeePayRate> response = client
              .employeePayRates
              .getByEmployeeId(employeeId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayRatesApi#getByEmployeeId");
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
| **employeeId** | **String**| ID of employee for which you want to get payrates | |
| **continuationToken** | **String**| Token to get next set of payrates | [optional] |

### Return type

[**PagedResultOfEmployeePayRate**](PagedResultOfEmployeePayRate.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns payrates based on EmployeeID |  -  |

<a name="updateByEmployeeIdAndPayrateId"></a>
# **updateByEmployeeIdAndPayrateId**
> CreateOrUpdateResponse updateByEmployeeIdAndPayrateId(employeeId, payrateId, employeePayRate3).execute();

Update Employee Payrate by EmployeeID

Data Access: Update Employee PayRates

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayRatesApi;
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
    OffsetDateTime effectiveStartDate = OffsetDateTime.now(); // Represents the date that the payrate goes into effect.  PUT requires EffectiveStartDate value to be unique for this PayRateId.              
    Double payRate = 3.4D; // Employee's rate of pay (in dollars).  If Pay Type is Hourly, then Pay Rate is a Per-Hour dollar amount and is required.  If Pay Type is Salary, then Pay Rate is a Per-Pay dollar amount, and either Pay Rate or Annual Rate is required. Payrate can't have more than 6 decimal places and can't be negative.              
    String description = "description_example"; // Required. Brief description of the employee's pay rate. Defaults to \\\"Rate {SequenceNumber}\\\" Must be 20 characters or less             
    String employeeId = "employeeId_example"; // ID of an Employee that has the Payrate you wish to update
    String payrateId = "payrateId_example"; // ID of the Payrate you wish to update
    Integer sequenceNumber = 56; // Orders how multiple earnings are calculated. Needed so earnings dependent on other earnings are calculated in the proper sequence. For PUT, this should match an existing SequenceNumber (retrieved via GET Employee PayRates).
    Double annualPayRate = 3.4D; // Employee's annual pay amount (in dollars). Only used if Type=Salary.  * For Salary Type, AnnualPayRate overrides payRate if passed into API call. The value not provided will be calculated based on Employee's Annual Hours setup on Employee's Profile. * For Hourly Type, this parameter is ignored - Paycor calculates based on Employee's Annual Hours setup on Employee's Profile.             
    PayType type = PayType.fromValue("Salary");
    String reason = "reason_example"; // Reason associated with the employee's pay rate. Optional.              
    String notes = "notes_example"; // Notes associated with the employee's pay rate, which will be displayed on Pay Rate History page.  Must be 512 characters or less. Optional.              
    try {
      CreateOrUpdateResponse result = client
              .employeePayRates
              .updateByEmployeeIdAndPayrateId(effectiveStartDate, payRate, description, employeeId, payrateId)
              .sequenceNumber(sequenceNumber)
              .annualPayRate(annualPayRate)
              .type(type)
              .reason(reason)
              .notes(notes)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayRatesApi#updateByEmployeeIdAndPayrateId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeePayRates
              .updateByEmployeeIdAndPayrateId(effectiveStartDate, payRate, description, employeeId, payrateId)
              .sequenceNumber(sequenceNumber)
              .annualPayRate(annualPayRate)
              .type(type)
              .reason(reason)
              .notes(notes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayRatesApi#updateByEmployeeIdAndPayrateId");
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
| **employeeId** | **String**| ID of an Employee that has the Payrate you wish to update | |
| **payrateId** | **String**| ID of the Payrate you wish to update | |
| **employeePayRate3** | [**EmployeePayRate3**](EmployeePayRate3.md)| EmployeePayRate with ID set and fields updated | |

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
| **200** |  |  -  |

