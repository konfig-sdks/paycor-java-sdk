# EmployeePayStubsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByEmployeeId**](EmployeePayStubsApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/paystubs | Get Employee Pay Stubs by EmployeeID |
| [**getByLegalEntity**](EmployeePayStubsApi.md#getByLegalEntity) | **GET** /v1/legalentities/{legalEntityId}/paystubs | Get Employee Pay Stubs by Legal Entity ID |
| [**getYtdByEmployeeId**](EmployeePayStubsApi.md#getYtdByEmployeeId) | **GET** /v1/employees/{employeeId}/paystubsytd | Get Employee Pay Stubs YTD by EmployeeID |
| [**getYtdByLegalEntity**](EmployeePayStubsApi.md#getYtdByLegalEntity) | **GET** /v1/legalentities/{legalEntityId}/paystubsytd | Get Employee Pay Stubs YTD by Legal entity ID |


<a name="getByEmployeeId"></a>
# **getByEmployeeId**
> PagedResultOfPayStub getByEmployeeId(employeeId).checkDate(checkDate).processDate(processDate).plannerId(plannerId).include(include).continuationToken(continuationToken).execute();

Get Employee Pay Stubs by EmployeeID

Note: Either CheckDate, ProcessDate or PlannerId is required as a parameter. You can find a list of valid dates by calling &#39;GET Legal Entity Pay Data by Legal Entity ID&#39;.  Data Access: View Paystub Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayStubsApi;
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
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to get the Pay Stubs
    OffsetDateTime checkDate = OffsetDateTime.now(); // Check Date of Pay Stubs - required (unless processDate supplied)
    OffsetDateTime processDate = OffsetDateTime.now(); // Process Date of Pay Stubs - required (unless checkDate supplied)
    String plannerId = "plannerId_example"; // ID of the Planner for which you want to get the Pay Stubs.
    List<Includes9> include = Arrays.asList(); // Options to include more data: All, GrossAmount, NetAmount, Earnings, Taxes, Deductions  Data Access required  GrossAmount = View Paystub Gross Pay Information  NetAmount = View Paystub Net Pay Information  Earnings = View Paystub Earning Information  Taxes = View Paystub Tax Information  Deductions = View Paystub Deduction Information
    String continuationToken = "continuationToken_example"; // Token to get the next set of Employee Pay Stubs
    try {
      PagedResultOfPayStub result = client
              .employeePayStubs
              .getByEmployeeId(employeeId)
              .checkDate(checkDate)
              .processDate(processDate)
              .plannerId(plannerId)
              .include(include)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayStubsApi#getByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfPayStub> response = client
              .employeePayStubs
              .getByEmployeeId(employeeId)
              .checkDate(checkDate)
              .processDate(processDate)
              .plannerId(plannerId)
              .include(include)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayStubsApi#getByEmployeeId");
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
| **employeeId** | **String**| ID of an Employee for whom you want to get the Pay Stubs | |
| **checkDate** | **OffsetDateTime**| Check Date of Pay Stubs - required (unless processDate supplied) | [optional] |
| **processDate** | **OffsetDateTime**| Process Date of Pay Stubs - required (unless checkDate supplied) | [optional] |
| **plannerId** | **String**| ID of the Planner for which you want to get the Pay Stubs. | [optional] |
| **include** | [**List&lt;Includes9&gt;**](Includes9.md)| Options to include more data: All, GrossAmount, NetAmount, Earnings, Taxes, Deductions  Data Access required  GrossAmount &#x3D; View Paystub Gross Pay Information  NetAmount &#x3D; View Paystub Net Pay Information  Earnings &#x3D; View Paystub Earning Information  Taxes &#x3D; View Paystub Tax Information  Deductions &#x3D; View Paystub Deduction Information | [optional] |
| **continuationToken** | **String**| Token to get the next set of Employee Pay Stubs | [optional] |

### Return type

[**PagedResultOfPayStub**](PagedResultOfPayStub.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of Employee Pay Stubs based on EmployeeID and date provided, with properties populated based on Include parameter |  -  |

<a name="getByLegalEntity"></a>
# **getByLegalEntity**
> PagedResultOfPayStub2 getByLegalEntity(legalEntityId).checkDate(checkDate).processDate(processDate).plannerId(plannerId).include(include).continuationToken(continuationToken).execute();

Get Employee Pay Stubs by Legal Entity ID

Note: Either CheckDate, ProcessDate or PlannerId is required as a parameter.  Data Access: View Paystub Information by Legal Entity Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayStubsApi;
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
    Integer legalEntityId = 56; // ID of a Legal entity for which you want to get the Pay Stubs
    OffsetDateTime checkDate = OffsetDateTime.now(); // Check Date of Pay Stubs - required (unless processDate supplied)
    OffsetDateTime processDate = OffsetDateTime.now(); // Process Date of Pay Stubs - required (unless checkDate supplied)
    String plannerId = "plannerId_example"; // ID of the Planner for which you want to get the Pay Stubs.
    List<Includes10> include = Arrays.asList(); // Options to include more data: All, GrossAmount, NetAmount, Earnings, Taxes, Deductions  Data Access required  GrossAmount = View Paystub Gross Pay Information  NetAmount = View Paystub Net Pay Information  Earnings = View Paystub Earning Information  Taxes = View Paystub Tax Information  Deductions = View Paystub Deduction Information
    String continuationToken = "continuationToken_example"; // Token to get the next set of Employee Pay Stubs
    try {
      PagedResultOfPayStub2 result = client
              .employeePayStubs
              .getByLegalEntity(legalEntityId)
              .checkDate(checkDate)
              .processDate(processDate)
              .plannerId(plannerId)
              .include(include)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayStubsApi#getByLegalEntity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfPayStub2> response = client
              .employeePayStubs
              .getByLegalEntity(legalEntityId)
              .checkDate(checkDate)
              .processDate(processDate)
              .plannerId(plannerId)
              .include(include)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayStubsApi#getByLegalEntity");
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
| **legalEntityId** | **Integer**| ID of a Legal entity for which you want to get the Pay Stubs | |
| **checkDate** | **OffsetDateTime**| Check Date of Pay Stubs - required (unless processDate supplied) | [optional] |
| **processDate** | **OffsetDateTime**| Process Date of Pay Stubs - required (unless checkDate supplied) | [optional] |
| **plannerId** | **String**| ID of the Planner for which you want to get the Pay Stubs. | [optional] |
| **include** | [**List&lt;Includes10&gt;**](Includes10.md)| Options to include more data: All, GrossAmount, NetAmount, Earnings, Taxes, Deductions  Data Access required  GrossAmount &#x3D; View Paystub Gross Pay Information  NetAmount &#x3D; View Paystub Net Pay Information  Earnings &#x3D; View Paystub Earning Information  Taxes &#x3D; View Paystub Tax Information  Deductions &#x3D; View Paystub Deduction Information | [optional] |
| **continuationToken** | **String**| Token to get the next set of Employee Pay Stubs | [optional] |

### Return type

[**PagedResultOfPayStub2**](PagedResultOfPayStub2.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of Employee Pay Stubs based on Legal Entity ID and date provided, with properties populated based on Include parameter |  -  |

<a name="getYtdByEmployeeId"></a>
# **getYtdByEmployeeId**
> EmployeePayStubHistory getYtdByEmployeeId(employeeId, toCheckDate).include(include).execute();

Get Employee Pay Stubs YTD by EmployeeID

* To Check Date is required parameter.   * To get a list of check dates, you can use the GET Legal Entity Pay data endpoint.  Data Access: View Paystub Information YTD

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayStubsApi;
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
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to get the Pay Stubs
    OffsetDateTime toCheckDate = OffsetDateTime.now(); // Check Date of latest Pay Stub for YTD data. 
    List<Includes11> include = Arrays.asList(); // Options to include more data: All, Earnings, Taxes, Deductions  Data Access required  Earnings = View Paystub Earning Information YTD  Taxes = View Paystub Tax Information YTD  Deductions = View Paystub Deduction Information YTD
    try {
      EmployeePayStubHistory result = client
              .employeePayStubs
              .getYtdByEmployeeId(employeeId, toCheckDate)
              .include(include)
              .execute();
      System.out.println(result);
      System.out.println(result.getLegalEntityId());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getEarnings());
      System.out.println(result.getDeductions());
      System.out.println(result.getTaxes());
      System.out.println(result.getEmployee());
      System.out.println(result.getLegalEntity());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayStubsApi#getYtdByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeePayStubHistory> response = client
              .employeePayStubs
              .getYtdByEmployeeId(employeeId, toCheckDate)
              .include(include)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayStubsApi#getYtdByEmployeeId");
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
| **employeeId** | **String**| ID of an Employee for whom you want to get the Pay Stubs | |
| **toCheckDate** | **OffsetDateTime**| Check Date of latest Pay Stub for YTD data.  | |
| **include** | [**List&lt;Includes11&gt;**](Includes11.md)| Options to include more data: All, Earnings, Taxes, Deductions  Data Access required  Earnings &#x3D; View Paystub Earning Information YTD  Taxes &#x3D; View Paystub Tax Information YTD  Deductions &#x3D; View Paystub Deduction Information YTD | [optional] |

### Return type

[**EmployeePayStubHistory**](EmployeePayStubHistory.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Employee Pay Stubs based on EmployeeID and date provided, with properties populated based on Include parameter |  -  |

<a name="getYtdByLegalEntity"></a>
# **getYtdByLegalEntity**
> PagedResultOfEmployeePayStubHistory getYtdByLegalEntity(legalEntityId, toCheckDate).include(include).execute();

Get Employee Pay Stubs YTD by Legal entity ID

* To Check Date is required parameter.   * To get a list of check dates, you can use the GET Legal Entity Pay data endpoint.  Data Access: View Paystub Information YTD By Legal Entity

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayStubsApi;
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
    Integer legalEntityId = 56; // ID of a Legal entity for which you want to get the Pay Stubs
    OffsetDateTime toCheckDate = OffsetDateTime.now(); // Check Date of latest Pay Stub for YTD data. 
    List<Includes12> include = Arrays.asList(); // Options to include more data: All, Earnings, Taxes, Deductions  Data Access required  Earnings = View Paystub Earning Information YTD By Legal Entity  Taxes = View Paystub Tax Information YTD By Legal Entity  Deductions = View Paystub Deduction Information YTD By Legal Entity
    try {
      PagedResultOfEmployeePayStubHistory result = client
              .employeePayStubs
              .getYtdByLegalEntity(legalEntityId, toCheckDate)
              .include(include)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayStubsApi#getYtdByLegalEntity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfEmployeePayStubHistory> response = client
              .employeePayStubs
              .getYtdByLegalEntity(legalEntityId, toCheckDate)
              .include(include)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayStubsApi#getYtdByLegalEntity");
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
| **legalEntityId** | **Integer**| ID of a Legal entity for which you want to get the Pay Stubs | |
| **toCheckDate** | **OffsetDateTime**| Check Date of latest Pay Stub for YTD data.  | |
| **include** | [**List&lt;Includes12&gt;**](Includes12.md)| Options to include more data: All, Earnings, Taxes, Deductions  Data Access required  Earnings &#x3D; View Paystub Earning Information YTD By Legal Entity  Taxes &#x3D; View Paystub Tax Information YTD By Legal Entity  Deductions &#x3D; View Paystub Deduction Information YTD By Legal Entity | [optional] |

### Return type

[**PagedResultOfEmployeePayStubHistory**](PagedResultOfEmployeePayStubHistory.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Employee Pay Stubs based on Legal Entity ID and date provided, with properties populated based on Include parameter |  -  |

