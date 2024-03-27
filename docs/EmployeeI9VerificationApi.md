# EmployeeI9VerificationApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByEmployeeId**](EmployeeI9VerificationApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/I9Verification | Get Employee I9 Verification by EmployeeID |
| [**updateByEmployeeIdI9Verification**](EmployeeI9VerificationApi.md#updateByEmployeeIdI9Verification) | **PUT** /v1/employees/{employeeId}/I9Verification | Update I9 Verification by EmployeeID |


<a name="getByEmployeeId"></a>
# **getByEmployeeId**
> I9Verification getByEmployeeId(employeeId).include(include).execute();

Get Employee I9 Verification by EmployeeID

Data Access: View I9 Verification

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeI9VerificationApi;
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
    String employeeId = "employeeId_example"; // ID of the employee for whom you want to get the I9 information
    List<Includes7> include = Arrays.asList(); // Options to include more data: documents
    try {
      I9Verification result = client
              .employeeI9Verification
              .getByEmployeeId(employeeId)
              .include(include)
              .execute();
      System.out.println(result);
      System.out.println(result.getCitizenOfCountry());
      System.out.println(result.getWorkEligibility());
      System.out.println(result.getWorkVisaType());
      System.out.println(result.getWorkVisaExpirationDate());
      System.out.println(result.getAlienAdmissionNumber());
      System.out.println(result.getAlienAdmissionExpirationDate());
      System.out.println(result.getListA());
      System.out.println(result.getListB());
      System.out.println(result.getListC());
      System.out.println(result.getForeignPassportNumber());
      System.out.println(result.getCountryOfIssuance());
      System.out.println(result.getAdditionalInformation());
      System.out.println(result.getHireDate());
      System.out.println(result.getDateModified());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeI9VerificationApi#getByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<I9Verification> response = client
              .employeeI9Verification
              .getByEmployeeId(employeeId)
              .include(include)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeI9VerificationApi#getByEmployeeId");
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
| **employeeId** | **String**| ID of the employee for whom you want to get the I9 information | |
| **include** | [**List&lt;Includes7&gt;**](Includes7.md)| Options to include more data: documents | [optional] |

### Return type

[**I9Verification**](I9Verification.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of employee I9 verification docs based on EmployeeID provided |  -  |

<a name="updateByEmployeeIdI9Verification"></a>
# **updateByEmployeeIdI9Verification**
> CreateOrUpdateResponse updateByEmployeeIdI9Verification(employeeId, i9Verification2).execute();

Update I9 Verification by EmployeeID

Data Access: Edit I9 Verification

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeI9VerificationApi;
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
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to update the I9 Verification
    String citizenOfCountry = "citizenOfCountry_example"; // Country of which the employee is citizen of.             
    WorkEligibility workEligibility = WorkEligibility.fromValue("USCitizen");
    String workVisaType = "workVisaType_example"; // Work visa type of the employee. Maximum characters should be 20.             
    OffsetDateTime workVisaExpirationDate = OffsetDateTime.now(); // Expiration date of the work visa.             
    String alienAdmissionNumber = "alienAdmissionNumber_example"; // Alien admission number of the employee.             
    OffsetDateTime alienAdmissionExpirationDate = OffsetDateTime.now(); // Expiration date of the alien admission.             
    ListA listA = new ListA();
    ListB listB = new ListB();
    ListC listC = new ListC();
    String foreignPassportNumber = "foreignPassportNumber_example"; // Foreign passport number of the employee.             
    String countryOfIssuance = "countryOfIssuance_example"; // Country of issuance of the foreign passport. Accepted values ISO-3166 alpha2 or alpha3 codes for countries.             
    String additionalInformation = "additionalInformation_example"; // Additional information for the I9 verification. Must be under 768 characters.             
    try {
      CreateOrUpdateResponse result = client
              .employeeI9Verification
              .updateByEmployeeIdI9Verification(employeeId)
              .citizenOfCountry(citizenOfCountry)
              .workEligibility(workEligibility)
              .workVisaType(workVisaType)
              .workVisaExpirationDate(workVisaExpirationDate)
              .alienAdmissionNumber(alienAdmissionNumber)
              .alienAdmissionExpirationDate(alienAdmissionExpirationDate)
              .listA(listA)
              .listB(listB)
              .listC(listC)
              .foreignPassportNumber(foreignPassportNumber)
              .countryOfIssuance(countryOfIssuance)
              .additionalInformation(additionalInformation)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeI9VerificationApi#updateByEmployeeIdI9Verification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeI9Verification
              .updateByEmployeeIdI9Verification(employeeId)
              .citizenOfCountry(citizenOfCountry)
              .workEligibility(workEligibility)
              .workVisaType(workVisaType)
              .workVisaExpirationDate(workVisaExpirationDate)
              .alienAdmissionNumber(alienAdmissionNumber)
              .alienAdmissionExpirationDate(alienAdmissionExpirationDate)
              .listA(listA)
              .listB(listB)
              .listC(listC)
              .foreignPassportNumber(foreignPassportNumber)
              .countryOfIssuance(countryOfIssuance)
              .additionalInformation(additionalInformation)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeI9VerificationApi#updateByEmployeeIdI9Verification");
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
| **employeeId** | **String**| ID of an Employee for whom you want to update the I9 Verification | |
| **i9Verification2** | [**I9Verification2**](I9Verification2.md)| I9 Verification object | |

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

