# EmployeeEarningsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewEarning**](EmployeeEarningsApi.md#addNewEarning) | **POST** /v1/employees/{employeeId}/earnings | Add Earning to Employee |
| [**getByEmployeeAndEarning**](EmployeeEarningsApi.md#getByEmployeeAndEarning) | **GET** /v1/employees/{employeeId}/earnings/{employeeEarningId} | Get Employee Earning by EmployeeID and EmployeeEarningID |
| [**getByEmployeeId**](EmployeeEarningsApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/earnings | Get Employee Earnings by EmployeeID |
| [**updateData**](EmployeeEarningsApi.md#updateData) | **PUT** /v1/employees/{employeeId}/earnings | Update Employee Earning |


<a name="addNewEarning"></a>
# **addNewEarning**
> CreateOrUpdateResponse addNewEarning(employeeId, employeeEarning2).execute();

Add Earning to Employee

Data Access: Add Employee Earning

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeEarningsApi;
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
    String code = "code_example"; // Descriptive earning identifier which appears on paychecks. Only set at the legal entity or tenant level.
    List<EmployeeEarningAmount> amountData = Arrays.asList(); // List of the employee's earning rates, factors and amounts of type EmployeeEarningAmount.             
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to add an Earning
    PayFrequency frequency = PayFrequency.fromValue("EveryPayPeriod");
    Integer sequenceNumber = 56; // Order earnings are calculated based on sequence values. This is needed so earnings dependent on other earnings are calculated in the proper sequence.
    IncludeInPay includeInPay = IncludeInPay.fromValue("AddtlPayOnly");
    Boolean onHold = true; // Whether the employee earning should included in a paycheck. This is specified by the 'Calculate' checkbox in the Paycor UI.             
    try {
      CreateOrUpdateResponse result = client
              .employeeEarnings
              .addNewEarning(code, amountData, employeeId)
              .frequency(frequency)
              .sequenceNumber(sequenceNumber)
              .includeInPay(includeInPay)
              .onHold(onHold)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEarningsApi#addNewEarning");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeEarnings
              .addNewEarning(code, amountData, employeeId)
              .frequency(frequency)
              .sequenceNumber(sequenceNumber)
              .includeInPay(includeInPay)
              .onHold(onHold)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEarningsApi#addNewEarning");
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
| **employeeId** | **String**| ID of an Employee for whom you want to add an Earning | |
| **employeeEarning2** | [**EmployeeEarning2**](EmployeeEarning2.md)| Employee Earning object to insert | |

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

<a name="getByEmployeeAndEarning"></a>
# **getByEmployeeAndEarning**
> EmployeeEarning getByEmployeeAndEarning(employeeId, employeeEarningId).include(include).execute();

Get Employee Earning by EmployeeID and EmployeeEarningID

Data Access: View Employee Earning Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeEarningsApi;
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
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to get the Earning
    String employeeEarningId = "employeeEarningId_example"; // ID of an Employee Earning you want to get
    List<Includes5> include = Arrays.asList(); // Options to include more data: All, AmountData  Data Access required  AmountData = View Employee Earning Amounts
    try {
      EmployeeEarning result = client
              .employeeEarnings
              .getByEmployeeAndEarning(employeeId, employeeEarningId)
              .include(include)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCode());
      System.out.println(result.getDescription());
      System.out.println(result.getType());
      System.out.println(result.getFrequency());
      System.out.println(result.getSequenceNumber());
      System.out.println(result.getIncludeInPay());
      System.out.println(result.getOnHold());
      System.out.println(result.getEffectiveStartDate());
      System.out.println(result.getEffectiveEndDate());
      System.out.println(result.getAmountData());
      System.out.println(result.getEmployee());
      System.out.println(result.getLegalEntityEarning());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEarningsApi#getByEmployeeAndEarning");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeEarning> response = client
              .employeeEarnings
              .getByEmployeeAndEarning(employeeId, employeeEarningId)
              .include(include)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEarningsApi#getByEmployeeAndEarning");
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
| **employeeId** | **String**| ID of an Employee for whom you want to get the Earning | |
| **employeeEarningId** | **String**| ID of an Employee Earning you want to get | |
| **include** | [**List&lt;Includes5&gt;**](Includes5.md)| Options to include more data: All, AmountData  Data Access required  AmountData &#x3D; View Employee Earning Amounts | [optional] |

### Return type

[**EmployeeEarning**](EmployeeEarning.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an Employee Earning based on the EmployeeID and EmployeeEarningID provided. |  -  |

<a name="getByEmployeeId"></a>
# **getByEmployeeId**
> PagedResultOfEmployeeEarning getByEmployeeId(employeeId).include(include).continuationToken(continuationToken).execute();

Get Employee Earnings by EmployeeID

Data Access: View Employee Earnings Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeEarningsApi;
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
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to get the Earnings
    List<Includes6> include = Arrays.asList(); // Options to include more data: All, AmountData  Data Access required  AmountData = View Employee Earnings Amounts
    String continuationToken = "continuationToken_example"; // Token to get the next set of Employee Earnings
    try {
      PagedResultOfEmployeeEarning result = client
              .employeeEarnings
              .getByEmployeeId(employeeId)
              .include(include)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEarningsApi#getByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfEmployeeEarning> response = client
              .employeeEarnings
              .getByEmployeeId(employeeId)
              .include(include)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEarningsApi#getByEmployeeId");
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
| **employeeId** | **String**| ID of an Employee for whom you want to get the Earnings | |
| **include** | [**List&lt;Includes6&gt;**](Includes6.md)| Options to include more data: All, AmountData  Data Access required  AmountData &#x3D; View Employee Earnings Amounts | [optional] |
| **continuationToken** | **String**| Token to get the next set of Employee Earnings | [optional] |

### Return type

[**PagedResultOfEmployeeEarning**](PagedResultOfEmployeeEarning.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of Employee Earnings based on EmployeeID provided |  -  |

<a name="updateData"></a>
# **updateData**
> CreateOrUpdateResponse updateData(employeeId, employeeEarning3).execute();

Update Employee Earning

Data Access: Update Employee Earning

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeEarningsApi;
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
    String id = "id_example"; // The unique identifier of this employee earning generated in Paycor's system.
    String code = "code_example"; // Descriptive earning identifier which appears on paychecks. Only set at the legal entity or tenant level.
    PayFrequency frequency = PayFrequency.fromValue("EveryPayPeriod");
    IncludeInPay includeInPay = IncludeInPay.fromValue("AddtlPayOnly");
    Boolean onHold = true; // Whether the employee earning should included in a paycheck. This is specified by the 'Calculate' checkbox in the Paycor UI.             
    List<EmployeeEarningAmount> amountData = Arrays.asList(); // List of the employee's earning rates, factors and amounts of type EmployeeEarningAmount.             
    String employeeId = "employeeId_example"; // ID of an Employee that has the Earning you wish to update
    Integer sequenceNumber = 56; // Order earnings are calculated based on sequence values. This is needed so earnings dependent on other earnings are calculated in the proper sequence.
    try {
      CreateOrUpdateResponse result = client
              .employeeEarnings
              .updateData(id, code, frequency, includeInPay, onHold, amountData, employeeId)
              .sequenceNumber(sequenceNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEarningsApi#updateData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeEarnings
              .updateData(id, code, frequency, includeInPay, onHold, amountData, employeeId)
              .sequenceNumber(sequenceNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEarningsApi#updateData");
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
| **employeeId** | **String**| ID of an Employee that has the Earning you wish to update | |
| **employeeEarning3** | [**EmployeeEarning3**](EmployeeEarning3.md)| Employee Earning object with updated fields | |

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

