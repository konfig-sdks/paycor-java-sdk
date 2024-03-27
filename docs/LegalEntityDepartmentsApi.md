# LegalEntityDepartmentsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewDepartment**](LegalEntityDepartmentsApi.md#createNewDepartment) | **POST** /v1/legalentities/{legalEntityId}/departments | Create Departments by Legal Entity Id |
| [**getById**](LegalEntityDepartmentsApi.md#getById) | **GET** /v1/legalentities/{legalEntityId}/departments/{departmentId} | Get Legal Entity Department by Legal Entity ID and Department ID |
| [**listByLegalEntityId**](LegalEntityDepartmentsApi.md#listByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/departments | Get Legal Entity Departments by Legal Entity ID |
| [**updateByLegalEntityId**](LegalEntityDepartmentsApi.md#updateByLegalEntityId) | **PUT** /v1/legalentities/{legalEntityId}/departments | Update Legal Entity Department by Legal Entity ID |


<a name="createNewDepartment"></a>
# **createNewDepartment**
> CreateOrUpdateResponse createNewDepartment(legalEntityId, department2).execute();

Create Departments by Legal Entity Id

Creates new Department for a Legal Entity. * the newly created Department will take at least 60 seconds to propagate through the system  Data Access: Create and Update Legal Entity Departments

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityDepartmentsApi;
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
    String code = "code_example"; // User defined department code. Only numeric characters are allowed and the limit is 14 characters.
    String parentId = "parentId_example"; // Id of the parent department (or payroll) under which new department will be created. When creating top level departments, payroll id should be used as parent id
    String description = "description_example"; // User defined description of the department.
    String workLocationId = "workLocationId_example"; // The ID of the Work Location to associate with new department.  * Must be an existing Work Location on the Legal Entity. Use API 'Get a list of Work Locations for a Legal Entity' to retrieve a list of valid IDs.              
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to create the Departments
    try {
      CreateOrUpdateResponse result = client
              .legalEntityDepartments
              .createNewDepartment(code, parentId, description, workLocationId, legalEntityId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityDepartmentsApi#createNewDepartment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .legalEntityDepartments
              .createNewDepartment(code, parentId, description, workLocationId, legalEntityId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityDepartmentsApi#createNewDepartment");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to create the Departments | |
| **department2** | [**Department2**](Department2.md)| Create department model | |

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
| **200** | Returns a CreateOrUpdateResponse object. |  -  |

<a name="getById"></a>
# **getById**
> Department getById(legalEntityId, departmentId).execute();

Get Legal Entity Department by Legal Entity ID and Department ID

Data Access: View Legal Entity Departments by Department Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityDepartmentsApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to get the Departments
    String departmentId = "departmentId_example"; // ID of the Department
    try {
      Department result = client
              .legalEntityDepartments
              .getById(legalEntityId, departmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCode());
      System.out.println(result.getDescription());
      System.out.println(result.getParentId());
      System.out.println(result.getLevel());
      System.out.println(result.getPayrollId());
      System.out.println(result.getPayrollDescription());
      System.out.println(result.getWorkLocationId());
      System.out.println(result.getWorkLocationName());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityDepartmentsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Department> response = client
              .legalEntityDepartments
              .getById(legalEntityId, departmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityDepartmentsApi#getById");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to get the Departments | |
| **departmentId** | **String**| ID of the Department | |

### Return type

[**Department**](Department.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Legal Entity Department based on the Legal Entity ID and Department ID provided. |  -  |

<a name="listByLegalEntityId"></a>
# **listByLegalEntityId**
> PagedResultOfDepartment listByLegalEntityId(legalEntityId).continuationToken(continuationToken).execute();

Get Legal Entity Departments by Legal Entity ID

Data Access: View Legal Entity Departments Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityDepartmentsApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to get the Departments
    String continuationToken = "continuationToken_example"; // Token to get the next set of Legal Entity Departments
    try {
      PagedResultOfDepartment result = client
              .legalEntityDepartments
              .listByLegalEntityId(legalEntityId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityDepartmentsApi#listByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfDepartment> response = client
              .legalEntityDepartments
              .listByLegalEntityId(legalEntityId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityDepartmentsApi#listByLegalEntityId");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to get the Departments | |
| **continuationToken** | **String**| Token to get the next set of Legal Entity Departments | [optional] |

### Return type

[**PagedResultOfDepartment**](PagedResultOfDepartment.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Legal Entity Departments based on the Legal Entity ID provided. |  -  |

<a name="updateByLegalEntityId"></a>
# **updateByLegalEntityId**
> PagedResultOfDepartment updateByLegalEntityId(legalEntityId, department3).execute();

Update Legal Entity Department by Legal Entity ID

Updates existing Department for a Legal Entity. * The update of the Department will take at least 60 seconds to propagate through the system * When updating top level departments, payroll id should be used as parent id  Data Access: Create and Update Legal Entity Departments

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityDepartmentsApi;
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
    String departmentId = "departmentId_example"; // Unique Identifier of the Department in Paycor's system.             
    String code = "code_example"; // User defined department code. Only numeric characters are allowed and the limit is 14 characters.
    String parentId = "parentId_example"; // Id of the parent department (or payroll) under which new department will be created. When updating top level departments, payroll id should be used as parent id
    String description = "description_example"; // User defined description of the department.
    String workLocationId = "workLocationId_example"; // The ID of the Work Location to associate with new department.  * Must be an existing Work Location on the Legal Entity. Use API 'Get a list of Work Locations for a Legal Entity' to retrieve a list of valid IDs.              
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to update the Department
    try {
      PagedResultOfDepartment result = client
              .legalEntityDepartments
              .updateByLegalEntityId(departmentId, code, parentId, description, workLocationId, legalEntityId)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityDepartmentsApi#updateByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfDepartment> response = client
              .legalEntityDepartments
              .updateByLegalEntityId(departmentId, code, parentId, description, workLocationId, legalEntityId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityDepartmentsApi#updateByLegalEntityId");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to update the Department | |
| **department3** | [**Department3**](Department3.md)| Update Department model | |

### Return type

[**PagedResultOfDepartment**](PagedResultOfDepartment.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a resource reference of work location |  -  |

