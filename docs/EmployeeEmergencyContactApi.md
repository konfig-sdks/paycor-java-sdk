# EmployeeEmergencyContactApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUpdate**](EmployeeEmergencyContactApi.md#createUpdate) | **POST** /v1/employees/{employeeId}/emergencycontact |  |


<a name="createUpdate"></a>
# **createUpdate**
> CreateOrUpdateResponse createUpdate(employeeId, emergencyContact).execute();



Either Home Phone, Work Phone or Mobile Phone must be specified  Data Access: Create Emergency Contact

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeEmergencyContactApi;
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
    String firstName = "firstName_example"; // First name of the emergency contact.
    String lastName = "lastName_example"; // Last name of the emergency contact.
    String employeeId = "employeeId_example";
    String middleName = "middleName_example"; // Middle name of the emergency contact.
    Relationship relationship = Relationship.fromValue("Daughter");
    String homePhone = "homePhone_example"; // Home Phone of the emergency contact. Must be 10 characters.             
    String workPhone = "workPhone_example"; // Work Phone of the emergency contact. Must be 10 characters.             
    String workPhoneExtension = "workPhoneExtension_example"; // Work Phone extension of the emergency contact.             
    String mobilePhone = "mobilePhone_example"; // Mobile Phone of the emergency contact. Must be 10 characters.             
    String emailAddress = "emailAddress_example"; // Email Address of the emergency contact.             
    try {
      CreateOrUpdateResponse result = client
              .employeeEmergencyContact
              .createUpdate(firstName, lastName, employeeId)
              .middleName(middleName)
              .relationship(relationship)
              .homePhone(homePhone)
              .workPhone(workPhone)
              .workPhoneExtension(workPhoneExtension)
              .mobilePhone(mobilePhone)
              .emailAddress(emailAddress)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEmergencyContactApi#createUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeEmergencyContact
              .createUpdate(firstName, lastName, employeeId)
              .middleName(middleName)
              .relationship(relationship)
              .homePhone(homePhone)
              .workPhone(workPhone)
              .workPhoneExtension(workPhoneExtension)
              .mobilePhone(mobilePhone)
              .emailAddress(emailAddress)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEmergencyContactApi#createUpdate");
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
| **employeeId** | **String**|  | |
| **emergencyContact** | [**EmergencyContact**](EmergencyContact.md)|  | |

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

