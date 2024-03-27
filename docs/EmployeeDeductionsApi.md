# EmployeeDeductionsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDeductionToEmployee**](EmployeeDeductionsApi.md#addDeductionToEmployee) | **POST** /v1/employees/{employeeId}/deductions | Add Deduction to Employee |
| [**getByEmployeeId**](EmployeeDeductionsApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/deductions | Get Employee Deductions by EmployeeID |
| [**getByEmployeeIdAndDeductionId**](EmployeeDeductionsApi.md#getByEmployeeIdAndDeductionId) | **GET** /v1/employees/{employeeId}/deductions/{employeeDeductionId} | Get Employee Deduction by EmployeeID and EmployeeDeductionID |
| [**updateByEmployeeId**](EmployeeDeductionsApi.md#updateByEmployeeId) | **PUT** /v1/employees/{employeeId}/deductions | Update Employee Deduction by EmployeeID |


<a name="addDeductionToEmployee"></a>
# **addDeductionToEmployee**
> List&lt;CreateOrUpdateResponse&gt; addDeductionToEmployee(employeeId, employeeDeduction2).execute();

Add Deduction to Employee

Tip: first call \&quot;Get Legal Entity Deductions by Legal Entity ID\&quot; to get the valid Deduction Codes  Data Access: Add Employee Deduction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDeductionsApi;
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
    String code = "code_example"; // Unique deduction code set at the legal entity or tenant level.  
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to add the deduction
    Boolean onHold = true; // Specifies whether the deduction should be deducted in a paycheck.             
    PayFrequency frequency = PayFrequency.fromValue("EveryPayPeriod");
    IncludeInPay includeInPay = IncludeInPay.fromValue("AddtlPayOnly");
    List<EmployeeDeductionAmount2> amountData = Arrays.asList(); // Specifies the rate and amount for the employee deduction.             
    try {
      List<CreateOrUpdateResponse> result = client
              .employeeDeductions
              .addDeductionToEmployee(code, employeeId)
              .onHold(onHold)
              .frequency(frequency)
              .includeInPay(includeInPay)
              .amountData(amountData)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDeductionsApi#addDeductionToEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CreateOrUpdateResponse>> response = client
              .employeeDeductions
              .addDeductionToEmployee(code, employeeId)
              .onHold(onHold)
              .frequency(frequency)
              .includeInPay(includeInPay)
              .amountData(amountData)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDeductionsApi#addDeductionToEmployee");
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
| **employeeId** | **String**| ID of an Employee for whom you want to add the deduction | |
| **employeeDeduction2** | [**EmployeeDeduction2**](EmployeeDeduction2.md)| EmployeeDeduction object | |

### Return type

[**List&lt;CreateOrUpdateResponse&gt;**](CreateOrUpdateResponse.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="getByEmployeeId"></a>
# **getByEmployeeId**
> PagedResultOfEmployeeDeduction getByEmployeeId(employeeId).include(include).continuationToken(continuationToken).execute();

Get Employee Deductions by EmployeeID

Data Access: View Employee Deductions Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDeductionsApi;
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
    String employeeId = "employeeId_example"; // ID of the employee for whom you want to get the deductions
    List<Includes4> include = Arrays.asList(); // Options to include more data: All, AmountData  Data Access required  AmountData = View Employee Deductions Amounts
    String continuationToken = "continuationToken_example"; // Token to get the next set of employee earnings
    try {
      PagedResultOfEmployeeDeduction result = client
              .employeeDeductions
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
      System.err.println("Exception when calling EmployeeDeductionsApi#getByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfEmployeeDeduction> response = client
              .employeeDeductions
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
      System.err.println("Exception when calling EmployeeDeductionsApi#getByEmployeeId");
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
| **employeeId** | **String**| ID of the employee for whom you want to get the deductions | |
| **include** | [**List&lt;Includes4&gt;**](Includes4.md)| Options to include more data: All, AmountData  Data Access required  AmountData &#x3D; View Employee Deductions Amounts | [optional] |
| **continuationToken** | **String**| Token to get the next set of employee earnings | [optional] |

### Return type

[**PagedResultOfEmployeeDeduction**](PagedResultOfEmployeeDeduction.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of employee deductions based on EmployeeID provided |  -  |

<a name="getByEmployeeIdAndDeductionId"></a>
# **getByEmployeeIdAndDeductionId**
> EmployeeDeduction getByEmployeeIdAndDeductionId(employeeId, employeeDeductionId).include(include).execute();

Get Employee Deduction by EmployeeID and EmployeeDeductionID

Data Access: View Employee Deduction Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDeductionsApi;
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
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to get the deduction.
    String employeeDeductionId = "employeeDeductionId_example"; // ID of the Employee Deduction you want to get.
    List<Includes3> include = Arrays.asList(); // Options to include more data: All, AmountData  Data Access required  AmountData = View Employee Deduction Amounts
    try {
      EmployeeDeduction result = client
              .employeeDeductions
              .getByEmployeeIdAndDeductionId(employeeId, employeeDeductionId)
              .include(include)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCode());
      System.out.println(result.getDescription());
      System.out.println(result.getType());
      System.out.println(result.getFrequency());
      System.out.println(result.getIncludeInPay());
      System.out.println(result.getOnHold());
      System.out.println(result.getEffectiveStartDate());
      System.out.println(result.getEffectiveEndDate());
      System.out.println(result.getAmountData());
      System.out.println(result.getEmployee());
      System.out.println(result.getLegalEntityDeduction());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDeductionsApi#getByEmployeeIdAndDeductionId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeDeduction> response = client
              .employeeDeductions
              .getByEmployeeIdAndDeductionId(employeeId, employeeDeductionId)
              .include(include)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDeductionsApi#getByEmployeeIdAndDeductionId");
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
| **employeeId** | **String**| ID of an Employee for whom you want to get the deduction. | |
| **employeeDeductionId** | **String**| ID of the Employee Deduction you want to get. | |
| **include** | [**List&lt;Includes3&gt;**](Includes3.md)| Options to include more data: All, AmountData  Data Access required  AmountData &#x3D; View Employee Deduction Amounts | [optional] |

### Return type

[**EmployeeDeduction**](EmployeeDeduction.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an Employee Deduction based on the EmployeeID and DeductionID provided.  |  -  |

<a name="updateByEmployeeId"></a>
# **updateByEmployeeId**
> CreateOrUpdateResponse updateByEmployeeId(employeeId, employeeDeduction3).execute();

Update Employee Deduction by EmployeeID

Data Access: Update Employee Deduction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDeductionsApi;
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
    String id = "id_example"; // The unique identifier of this employee deduction generated in Paycor's system. Used as the Key for Update (PUT) endpoint. 
    String employeeId = "employeeId_example"; // ID of an Employee that has the Deduction you wish to update
    IncludeInPay includeInPay = IncludeInPay.fromValue("AddtlPayOnly");
    PayFrequency frequency = PayFrequency.fromValue("EveryPayPeriod");
    Boolean onHold = true; // Specifies whether the deduction should be deducted in a paycheck. Required, defaults to false (meaning it should be deducted).             
    List<EmployeeDeductionAmount3> amountData = Arrays.asList(); // Specifies the rate and amount for the employee deduction.             
    try {
      CreateOrUpdateResponse result = client
              .employeeDeductions
              .updateByEmployeeId(id, employeeId)
              .includeInPay(includeInPay)
              .frequency(frequency)
              .onHold(onHold)
              .amountData(amountData)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDeductionsApi#updateByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeDeductions
              .updateByEmployeeId(id, employeeId)
              .includeInPay(includeInPay)
              .frequency(frequency)
              .onHold(onHold)
              .amountData(amountData)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDeductionsApi#updateByEmployeeId");
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
| **employeeId** | **String**| ID of an Employee that has the Deduction you wish to update | |
| **employeeDeduction3** | [**EmployeeDeduction3**](EmployeeDeduction3.md)| EmployeeDeduction with ID set and fields updated | |

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

