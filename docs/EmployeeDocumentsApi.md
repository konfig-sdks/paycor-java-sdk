# EmployeeDocumentsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadPayStub**](EmployeeDocumentsApi.md#downloadPayStub) | **GET** /v1/employees/{employeeId}/PayStubDocument/{documentId} | Download Employee Pay Stub Document |
| [**getPayStubDocumentByEmployeeId**](EmployeeDocumentsApi.md#getPayStubDocumentByEmployeeId) | **GET** /v1/employees/{employeeId}/paystubDocumentData | Get Employee Pay Stubs document link by EmployeeID |


<a name="downloadPayStub"></a>
# **downloadPayStub**
> File downloadPayStub(employeeId, documentId).execute();

Download Employee Pay Stub Document

Data Access: Download Employee Pay Stub Document

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDocumentsApi;
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
    String employeeId = "employeeId_example"; // Id of an Employee for whom you want to get the Pay Stub Document
    String documentId = "documentId_example"; // Id of Pay Stub Document
    try {
      File result = client
              .employeeDocuments
              .downloadPayStub(employeeId, documentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDocumentsApi#downloadPayStub");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .employeeDocuments
              .downloadPayStub(employeeId, documentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDocumentsApi#downloadPayStub");
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
| **employeeId** | **String**| Id of an Employee for whom you want to get the Pay Stub Document | |
| **documentId** | **String**| Id of Pay Stub Document | |

### Return type

[**File**](File.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Pay Stub Document that can be downloaded |  -  |

<a name="getPayStubDocumentByEmployeeId"></a>
# **getPayStubDocumentByEmployeeId**
> PagedResultOfPayStubFile getPayStubDocumentByEmployeeId(employeeId, startDate, endDate).continuationToken(continuationToken).execute();

Get Employee Pay Stubs document link by EmployeeID

Start Date and End Date are required parameters.  Data Access: Get Employee Pay Stub Document Link

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDocumentsApi;
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
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to get the Pay Stubs Document Link
    OffsetDateTime startDate = OffsetDateTime.now(); // Date that is earlier or equal to paycheck date
    OffsetDateTime endDate = OffsetDateTime.now(); // Date that is after or equal to paycheck date
    String continuationToken = "continuationToken_example"; // Token to get the next set of Employee Pay Stubs Document Links
    try {
      PagedResultOfPayStubFile result = client
              .employeeDocuments
              .getPayStubDocumentByEmployeeId(employeeId, startDate, endDate)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDocumentsApi#getPayStubDocumentByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfPayStubFile> response = client
              .employeeDocuments
              .getPayStubDocumentByEmployeeId(employeeId, startDate, endDate)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDocumentsApi#getPayStubDocumentByEmployeeId");
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
| **employeeId** | **String**| ID of an Employee for whom you want to get the Pay Stubs Document Link | |
| **startDate** | **OffsetDateTime**| Date that is earlier or equal to paycheck date | |
| **endDate** | **OffsetDateTime**| Date that is after or equal to paycheck date | |
| **continuationToken** | **String**| Token to get the next set of Employee Pay Stubs Document Links | [optional] |

### Return type

[**PagedResultOfPayStubFile**](PagedResultOfPayStubFile.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Employee Pay Stubs document link based on EmployeeID and date provided. |  -  |

