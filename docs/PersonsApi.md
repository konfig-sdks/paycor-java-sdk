# PersonsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByEmployeeIdPerson**](PersonsApi.md#getByEmployeeIdPerson) | **GET** /v1/employees/{employeeId}/person | Get Person by EmployeeID |
| [**getByTenantAndPerson**](PersonsApi.md#getByTenantAndPerson) | **GET** /v1/tenants/{tenantId}/persons/{personId} | Get Person By TenantID And PersonID |
| [**listByLegalEntityId**](PersonsApi.md#listByLegalEntityId) | **GET** /v1/legalEntities/{legalEntityId}/persons | Get Persons by Legal Entity ID |
| [**listByTenantId**](PersonsApi.md#listByTenantId) | **GET** /v1/tenants/{tenantId}/persons | Get Persons By TenantID |


<a name="getByEmployeeIdPerson"></a>
# **getByEmployeeIdPerson**
> Person getByEmployeeIdPerson(employeeId).include(include).execute();

Get Person by EmployeeID

Data Access: View Employee Person

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonsApi;
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
    String employeeId = "employeeId_example"; // EmployeeID linked to the Person you want to get
    List<Includes21> include = Arrays.asList(); // Options to include more data: All, Demographic, Benefit, Military, SocialMedia, Addresses, EmployeeAssignments, EmergencyContact, SocialSecurityNumber, Phones
    try {
      Person result = client
              .persons
              .getByEmployeeIdPerson(employeeId)
              .include(include)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getPrefix());
      System.out.println(result.getFirstName());
      System.out.println(result.getMiddleName());
      System.out.println(result.getLastName());
      System.out.println(result.getSuffix());
      System.out.println(result.getLegalFirstName());
      System.out.println(result.getLegalLastName());
      System.out.println(result.getSocialSecurityNumber());
      System.out.println(result.getEmail());
      System.out.println(result.getDemographicData());
      System.out.println(result.getBenefitData());
      System.out.println(result.getEmergencyContactData());
      System.out.println(result.getMilitaryData());
      System.out.println(result.getSocialMediaData());
      System.out.println(result.getEmployeeAssignments());
      System.out.println(result.getAddresses());
      System.out.println(result.getPhones());
      System.out.println(result.getTenants());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#getByEmployeeIdPerson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Person> response = client
              .persons
              .getByEmployeeIdPerson(employeeId)
              .include(include)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#getByEmployeeIdPerson");
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
| **employeeId** | **String**| EmployeeID linked to the Person you want to get | |
| **include** | [**List&lt;Includes21&gt;**](Includes21.md)| Options to include more data: All, Demographic, Benefit, Military, SocialMedia, Addresses, EmployeeAssignments, EmergencyContact, SocialSecurityNumber, Phones | [optional] |

### Return type

[**Person**](Person.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Person based on the EmployeeID provided. |  -  |

<a name="getByTenantAndPerson"></a>
# **getByTenantAndPerson**
> Person getByTenantAndPerson(tenantId, personId).include(include).execute();

Get Person By TenantID And PersonID

Note that PersonID and TenantID must always be passed together.  Data Access: View Person Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonsApi;
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
    Integer tenantId = 56; // ID of the Tenant that the Person is in
    String personId = "personId_example"; // ID of the Person you want to get
    List<Includes20> include = Arrays.asList(); // Options to include more data:  All, Demographic, Benefit, Military, SocialMedia, Addresses, EmployeeAssignments, EmergencyContact, SocialSecurityNumber, Phones  Demographic = View Person Demographic Information  Benefit = View Person Disability and Tobacco Status  Military = View Person Military  SocialMedia = View Person Social Media  Addresses = View Person Addresses  EmployeeAssignments = View Employee Records  EmergencyContact = View Person Emergency Contacts  SocialSecurityNumber = View Person SSN  Phones = View Person Phone
    try {
      Person result = client
              .persons
              .getByTenantAndPerson(tenantId, personId)
              .include(include)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getPrefix());
      System.out.println(result.getFirstName());
      System.out.println(result.getMiddleName());
      System.out.println(result.getLastName());
      System.out.println(result.getSuffix());
      System.out.println(result.getLegalFirstName());
      System.out.println(result.getLegalLastName());
      System.out.println(result.getSocialSecurityNumber());
      System.out.println(result.getEmail());
      System.out.println(result.getDemographicData());
      System.out.println(result.getBenefitData());
      System.out.println(result.getEmergencyContactData());
      System.out.println(result.getMilitaryData());
      System.out.println(result.getSocialMediaData());
      System.out.println(result.getEmployeeAssignments());
      System.out.println(result.getAddresses());
      System.out.println(result.getPhones());
      System.out.println(result.getTenants());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#getByTenantAndPerson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Person> response = client
              .persons
              .getByTenantAndPerson(tenantId, personId)
              .include(include)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#getByTenantAndPerson");
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
| **tenantId** | **Integer**| ID of the Tenant that the Person is in | |
| **personId** | **String**| ID of the Person you want to get | |
| **include** | [**List&lt;Includes20&gt;**](Includes20.md)| Options to include more data:  All, Demographic, Benefit, Military, SocialMedia, Addresses, EmployeeAssignments, EmergencyContact, SocialSecurityNumber, Phones  Demographic &#x3D; View Person Demographic Information  Benefit &#x3D; View Person Disability and Tobacco Status  Military &#x3D; View Person Military  SocialMedia &#x3D; View Person Social Media  Addresses &#x3D; View Person Addresses  EmployeeAssignments &#x3D; View Employee Records  EmergencyContact &#x3D; View Person Emergency Contacts  SocialSecurityNumber &#x3D; View Person SSN  Phones &#x3D; View Person Phone | [optional] |

### Return type

[**Person**](Person.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Person Details based on the TenantID and PersonID provided, with some fields populated based on the Include parameter. |  -  |

<a name="listByLegalEntityId"></a>
# **listByLegalEntityId**
> PagedResultOfPerson listByLegalEntityId(legalEntityId).include(include).continuationToken(continuationToken).execute();

Get Persons by Legal Entity ID

Data Access: View Legal Entity Persons

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonsApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to get the persons
    List<IncludesList> include = Arrays.asList(); // Options to include more data: All, Demographic, Benefit, Military, SocialMedia, Addresses, EmployeeAssignments, SocialSecurityNumber, Phones  Data Access required  Demographic = View Person Demographic Information  Benefit = View Person Disability and Tobacco Status  Military = View Person Military  SocialMedia = View Person Social Media  Addresses = View Person Addresses  EmployeeAssignments = View Employee Records
    String continuationToken = "continuationToken_example"; // Token to get the next set of persons
    try {
      PagedResultOfPerson result = client
              .persons
              .listByLegalEntityId(legalEntityId)
              .include(include)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#listByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfPerson> response = client
              .persons
              .listByLegalEntityId(legalEntityId)
              .include(include)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#listByLegalEntityId");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to get the persons | |
| **include** | [**List&lt;IncludesList&gt;**](IncludesList.md)| Options to include more data: All, Demographic, Benefit, Military, SocialMedia, Addresses, EmployeeAssignments, SocialSecurityNumber, Phones  Data Access required  Demographic &#x3D; View Person Demographic Information  Benefit &#x3D; View Person Disability and Tobacco Status  Military &#x3D; View Person Military  SocialMedia &#x3D; View Person Social Media  Addresses &#x3D; View Person Addresses  EmployeeAssignments &#x3D; View Employee Records | [optional] |
| **continuationToken** | **String**| Token to get the next set of persons | [optional] |

### Return type

[**PagedResultOfPerson**](PagedResultOfPerson.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of Person objects, based on the Legal Entity ID &amp; Include provided.  This endpoint returns all Person details (based on Include parameter) except for Emergency Contact. Those fields are not currently available in bulk. |  -  |

<a name="listByTenantId"></a>
# **listByTenantId**
> PagedResultOfPersonList listByTenantId(tenantId).continuationToken(continuationToken).execute();

Get Persons By TenantID

PersonList provides a subset of the full Person fields.  Data Access: View Tenant Persons

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonsApi;
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
    Integer tenantId = 56; // ID of the Tenant for which you want to get persons
    String continuationToken = "continuationToken_example"; // Token to get the next set of persons
    try {
      PagedResultOfPersonList result = client
              .persons
              .listByTenantId(tenantId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#listByTenantId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfPersonList> response = client
              .persons
              .listByTenantId(tenantId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#listByTenantId");
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
| **tenantId** | **Integer**| ID of the Tenant for which you want to get persons | |
| **continuationToken** | **String**| Token to get the next set of persons | [optional] |

### Return type

[**PagedResultOfPersonList**](PagedResultOfPersonList.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of PersonList (a subset of Person fields) objects, based on the TenantID provided.  |  -  |

