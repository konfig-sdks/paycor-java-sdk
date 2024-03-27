# EmployeeCustomFieldsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByEmployeeId**](EmployeeCustomFieldsApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/customfields | Get Employee Custom Fields by EmployeeID |
| [**updateByEmployeeId**](EmployeeCustomFieldsApi.md#updateByEmployeeId) | **PUT** /v1/employees/{employeeId}/customfields | Update Custom Field by EmployeeID |


<a name="getByEmployeeId"></a>
# **getByEmployeeId**
> List&lt;EmployeeCustomField&gt; getByEmployeeId(employeeId).continuationToken(continuationToken).execute();

Get Employee Custom Fields by EmployeeID

Data Access: View Employee Custom Fields

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeCustomFieldsApi;
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
    String employeeId = "employeeId_example"; // ID of the employee for whom you want to get the custom fields
    String continuationToken = "continuationToken_example"; // Token to get the next set of employee custom fields
    try {
      List<EmployeeCustomField> result = client
              .employeeCustomFields
              .getByEmployeeId(employeeId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeCustomFieldsApi#getByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeCustomField>> response = client
              .employeeCustomFields
              .getByEmployeeId(employeeId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeCustomFieldsApi#getByEmployeeId");
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
| **employeeId** | **String**| ID of the employee for whom you want to get the custom fields | |
| **continuationToken** | **String**| Token to get the next set of employee custom fields | [optional] |

### Return type

[**List&lt;EmployeeCustomField&gt;**](EmployeeCustomField.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of employee custom fields based on EmployeeID provided |  -  |

<a name="updateByEmployeeId"></a>
# **updateByEmployeeId**
> CreateOrUpdateResponse updateByEmployeeId(employeeId, employeeCustomField2).execute();

Update Custom Field by EmployeeID

Data Access: Update Employee Custom Fields

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeCustomFieldsApi;
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
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to update the custom field
    try {
      CreateOrUpdateResponse result = client
              .employeeCustomFields
              .updateByEmployeeId(employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeCustomFieldsApi#updateByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeCustomFields
              .updateByEmployeeId(employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeCustomFieldsApi#updateByEmployeeId");
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
| **employeeId** | **String**| ID of an Employee for whom you want to update the custom field | |
| **employeeCustomField2** | [**List&lt;EmployeeCustomField2&gt;**](EmployeeCustomField2.md)| CustomFields object | |

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

