# EmployeeCertificationsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewCertification**](EmployeeCertificationsApi.md#addNewCertification) | **POST** /v1/employees/{employeeId}/certifications | Add Employee Certification |
| [**listByEmployeeId**](EmployeeCertificationsApi.md#listByEmployeeId) | **GET** /v1/employees/{employeeId}/certifications | Get a list of Employee Certifications for an employee |
| [**updateCertification**](EmployeeCertificationsApi.md#updateCertification) | **PUT** /v1/employees/{employeeId}/certifications | Update Employee Certification |


<a name="addNewCertification"></a>
# **addNewCertification**
> CreateOrUpdateResponse addNewCertification(employeeId, certification).execute();

Add Employee Certification

Data Access: Create and Update Certification

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeCertificationsApi;
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
    String certificationName = "certificationName_example"; // Name of certification             
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to add the certification
    OffsetDateTime effectiveDate = OffsetDateTime.now(); // Effective date of certification             
    OffsetDateTime expirationDate = OffsetDateTime.now(); // Expiration date of certification             
    String certificationNumber = "certificationNumber_example"; // Number of certification             
    String certificationOrganizationName = "certificationOrganizationName_example"; // Name of certification organization             
    String notes = "notes_example"; // Note on certification             
    try {
      CreateOrUpdateResponse result = client
              .employeeCertifications
              .addNewCertification(certificationName, employeeId)
              .effectiveDate(effectiveDate)
              .expirationDate(expirationDate)
              .certificationNumber(certificationNumber)
              .certificationOrganizationName(certificationOrganizationName)
              .notes(notes)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeCertificationsApi#addNewCertification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeCertifications
              .addNewCertification(certificationName, employeeId)
              .effectiveDate(effectiveDate)
              .expirationDate(expirationDate)
              .certificationNumber(certificationNumber)
              .certificationOrganizationName(certificationOrganizationName)
              .notes(notes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeCertificationsApi#addNewCertification");
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
| **employeeId** | **String**| ID of an Employee for whom you want to add the certification | |
| **certification** | [**Certification**](Certification.md)| Certification object | |

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

<a name="listByEmployeeId"></a>
# **listByEmployeeId**
> PagedResultOfEmployeeCertification listByEmployeeId(employeeId).continuationToken(continuationToken).execute();

Get a list of Employee Certifications for an employee

Data Access: View Certification Information for Employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeCertificationsApi;
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
    String employeeId = "employeeId_example"; // ID of the employee for which you want to get the certifications
    String continuationToken = "continuationToken_example";
    try {
      PagedResultOfEmployeeCertification result = client
              .employeeCertifications
              .listByEmployeeId(employeeId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeCertificationsApi#listByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfEmployeeCertification> response = client
              .employeeCertifications
              .listByEmployeeId(employeeId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeCertificationsApi#listByEmployeeId");
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
| **employeeId** | **String**| ID of the employee for which you want to get the certifications | |
| **continuationToken** | **String**|  | [optional] |

### Return type

[**PagedResultOfEmployeeCertification**](PagedResultOfEmployeeCertification.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Employee Certifications for an employee |  -  |

<a name="updateCertification"></a>
# **updateCertification**
> CreateOrUpdateResponse updateCertification(employeeId, employeeCertification2).execute();

Update Employee Certification

Data Access: Create and Update Certification

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeCertificationsApi;
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
    String employeeCertificationId = "employeeCertificationId_example"; // Id of employee certification             
    String employeeId = "employeeId_example"; // ID of the employee for which you want to update the certifications
    String certificationNumber = "certificationNumber_example"; // Number of certification             
    OffsetDateTime effectiveDate = OffsetDateTime.now(); // Effective date of certification             
    OffsetDateTime expirationDate = OffsetDateTime.now(); // Expiration date of certification             
    String notes = "notes_example"; // Note on certification             
    try {
      CreateOrUpdateResponse result = client
              .employeeCertifications
              .updateCertification(employeeCertificationId, employeeId)
              .certificationNumber(certificationNumber)
              .effectiveDate(effectiveDate)
              .expirationDate(expirationDate)
              .notes(notes)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeCertificationsApi#updateCertification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeCertifications
              .updateCertification(employeeCertificationId, employeeId)
              .certificationNumber(certificationNumber)
              .effectiveDate(effectiveDate)
              .expirationDate(expirationDate)
              .notes(notes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeCertificationsApi#updateCertification");
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
| **employeeId** | **String**| ID of the employee for which you want to update the certifications | |
| **employeeCertification2** | [**EmployeeCertification2**](EmployeeCertification2.md)|  | |

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
| **200** | Returns a resource reference for employee certifications |  -  |

