# EmployeeOnboardingApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewEntry**](EmployeeOnboardingApi.md#addNewEntry) | **POST** /v1/employees/onboarding | Create Employee Onboarding |
| [**listOnboardingEmployees**](EmployeeOnboardingApi.md#listOnboardingEmployees) | **GET** /v1/legalentities/{legalEntityId}/onboardingemployees | Get employees in the onboarding state |


<a name="addNewEntry"></a>
# **addNewEntry**
> CreateOrUpdateResponse addNewEntry(simpleHire).execute();

Create Employee Onboarding

This will allow partners to add a new employee entry for pending hire  Data Access: Create Employee Onboarding

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeOnboardingApi;
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
    Integer legalEntityId = 56; // Legal Entity Id
    String firstName = "firstName_example"; // First name of the person. 
    String lastName = "lastName_example"; // Last name of the person.
    String homeEmailAddress = "homeEmailAddress_example"; // Email Information of the person.             
    String exportedByEmailAddress = "exportedByEmailAddress_example"; // Email of the user exporting records
    String preferredName = "preferredName_example"; // Preferred Name of the Person             
    String countryCode = "countryCode_example"; // Country in the address.             
    String zip = "zip_example"; // Zip code in the address.             
    String state = "state_example"; // State in the address.             
    String city = "city_example"; // City in the address.             
    String address1 = "address1_example"; // First line of street address information.             
    String address2 = "address2_example"; // Additional line of street address information.             
    String mobilePhone = "mobilePhone_example"; // Mobile phone number. 
    String homePhone = "homePhone_example"; // Home phone number. 
    Gender gender = Gender.fromValue("Male");
    EthnicityType ethnicity = EthnicityType.fromValue("AmerIndorAKNative");
    VeteranStatus veteranStatus = VeteranStatus.fromValue("true");
    OffsetDateTime startDate = OffsetDateTime.now(); // Date the employement start. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              
    String jobTitle = "jobTitle_example"; // Name of the Job Title to associate with new hire.             
    String departmentCode = "departmentCode_example"; // Code of the department in Paycor's system.  Can be retrieved by calling 'Get Legal Entity Departments by Legal Entity ID'
    DisabilityStatus disability = DisabilityStatus.fromValue("true");
    Double baseSalary = 3.4D; // Base Salary of new hire employee
    String salaryFrequency = "salaryFrequency_example"; // Salary Frequency of new hire employee
    String workLocationId = "workLocationId_example"; // Worklocation Id of new hire employee
    try {
      CreateOrUpdateResponse result = client
              .employeeOnboarding
              .addNewEntry(legalEntityId, firstName, lastName, homeEmailAddress)
              .exportedByEmailAddress(exportedByEmailAddress)
              .preferredName(preferredName)
              .countryCode(countryCode)
              .zip(zip)
              .state(state)
              .city(city)
              .address1(address1)
              .address2(address2)
              .mobilePhone(mobilePhone)
              .homePhone(homePhone)
              .gender(gender)
              .ethnicity(ethnicity)
              .veteranStatus(veteranStatus)
              .startDate(startDate)
              .jobTitle(jobTitle)
              .departmentCode(departmentCode)
              .disability(disability)
              .baseSalary(baseSalary)
              .salaryFrequency(salaryFrequency)
              .workLocationId(workLocationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeOnboardingApi#addNewEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeOnboarding
              .addNewEntry(legalEntityId, firstName, lastName, homeEmailAddress)
              .exportedByEmailAddress(exportedByEmailAddress)
              .preferredName(preferredName)
              .countryCode(countryCode)
              .zip(zip)
              .state(state)
              .city(city)
              .address1(address1)
              .address2(address2)
              .mobilePhone(mobilePhone)
              .homePhone(homePhone)
              .gender(gender)
              .ethnicity(ethnicity)
              .veteranStatus(veteranStatus)
              .startDate(startDate)
              .jobTitle(jobTitle)
              .departmentCode(departmentCode)
              .disability(disability)
              .baseSalary(baseSalary)
              .salaryFrequency(salaryFrequency)
              .workLocationId(workLocationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeOnboardingApi#addNewEntry");
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
| **simpleHire** | [**SimpleHire**](SimpleHire.md)|  | |

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

<a name="listOnboardingEmployees"></a>
# **listOnboardingEmployees**
> PagedResultOfOnboardingEmployee listOnboardingEmployees(legalEntityId).continuationToken(continuationToken).execute();

Get employees in the onboarding state

This endpoint allows partners to see the employees in the onboarding state.  Data Access: View Legal Entity Onboarding Employees

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeOnboardingApi;
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
    Integer legalEntityId = 56; // ID of the legal entity for which you want to get the employees in the onboarding state
    String continuationToken = "continuationToken_example"; // Token to get next set of Onboarding Employee records
    try {
      PagedResultOfOnboardingEmployee result = client
              .employeeOnboarding
              .listOnboardingEmployees(legalEntityId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeOnboardingApi#listOnboardingEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfOnboardingEmployee> response = client
              .employeeOnboarding
              .listOnboardingEmployees(legalEntityId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeOnboardingApi#listOnboardingEmployees");
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
| **legalEntityId** | **Integer**| ID of the legal entity for which you want to get the employees in the onboarding state | |
| **continuationToken** | **String**| Token to get next set of Onboarding Employee records | [optional] |

### Return type

[**PagedResultOfOnboardingEmployee**](PagedResultOfOnboardingEmployee.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a paged list of Onboarding Employee items. |  -  |

