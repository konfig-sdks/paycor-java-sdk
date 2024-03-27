# EmployeeTimeOffAccrualsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByEmployeeId**](EmployeeTimeOffAccrualsApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/timeoffaccruals | Get Employee Accruals by EmployeeID |
| [**getByLegalEntityId**](EmployeeTimeOffAccrualsApi.md#getByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/timeoffaccruals | Get Employee Accruals by Legal Entity ID |


<a name="getByEmployeeId"></a>
# **getByEmployeeId**
> PagedResultOfEmployeeBalance getByEmployeeId(employeeId).continuationToken(continuationToken).execute();

Get Employee Accruals by EmployeeID

Data Access: View Employee Timeoff Accruals by Employee Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTimeOffAccrualsApi;
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
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to get the Balances
    String continuationToken = "continuationToken_example"; // Token to get the next set of Employee Balances
    try {
      PagedResultOfEmployeeBalance result = client
              .employeeTimeOffAccruals
              .getByEmployeeId(employeeId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTimeOffAccrualsApi#getByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfEmployeeBalance> response = client
              .employeeTimeOffAccruals
              .getByEmployeeId(employeeId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTimeOffAccrualsApi#getByEmployeeId");
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
| **employeeId** | **String**| ID of an Employee for whom you want to get the Balances | |
| **continuationToken** | **String**| Token to get the next set of Employee Balances | [optional] |

### Return type

[**PagedResultOfEmployeeBalance**](PagedResultOfEmployeeBalance.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of Employee Accrual Balances based on EmployeeID provided |  -  |

<a name="getByLegalEntityId"></a>
# **getByLegalEntityId**
> PagedResultOfEmployeeBalance getByLegalEntityId(legalEntityId).continuationToken(continuationToken).execute();

Get Employee Accruals by Legal Entity ID

Data Access: View Employee Timeoff Accruals by Legal Entity Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTimeOffAccrualsApi;
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
    Integer legalEntityId = 56; // Legal entity ID for which you want to get the balances
    String continuationToken = "continuationToken_example"; // Token to get the next set of employee balances
    try {
      PagedResultOfEmployeeBalance result = client
              .employeeTimeOffAccruals
              .getByLegalEntityId(legalEntityId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTimeOffAccrualsApi#getByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfEmployeeBalance> response = client
              .employeeTimeOffAccruals
              .getByLegalEntityId(legalEntityId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTimeOffAccrualsApi#getByLegalEntityId");
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
| **legalEntityId** | **Integer**| Legal entity ID for which you want to get the balances | |
| **continuationToken** | **String**| Token to get the next set of employee balances | [optional] |

### Return type

[**PagedResultOfEmployeeBalance**](PagedResultOfEmployeeBalance.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of Employee Accrual Balances based on legal entity ID provided |  -  |

