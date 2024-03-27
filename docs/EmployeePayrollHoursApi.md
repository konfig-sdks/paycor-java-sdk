# EmployeePayrollHoursApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addHoursAndEarningsToPaygrid**](EmployeePayrollHoursApi.md#addHoursAndEarningsToPaygrid) | **POST** /v1/legalentities/{legalEntityId}/payrollhours | Add Employee Hours And Earnings To Paygrid |
| [**importToEmployee**](EmployeePayrollHoursApi.md#importToEmployee) | **POST** /v1/employees/{employeeId}/payrollhours | Import Payroll Hours to Employee |


<a name="addHoursAndEarningsToPaygrid"></a>
# **addHoursAndEarningsToPaygrid**
> Object addHoursAndEarningsToPaygrid(legalEntityId, importPayrollHours).replaceData(replaceData).appendData(appendData).execute();

Add Employee Hours And Earnings To Paygrid

Required parameters in body are: IntegrationVendor, ProcessId, LegalEntityId, EmployeeNumber, DepartmentCode, EarningCode, BusinessStartDate  Data Access: Import Employee Hours and Earnings to Paygrid

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayrollHoursApi;
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
    String integrationVendor = "integrationVendor_example"; // Required freeform field for tracking purposes. You can input your company or application name.
    String processId = "processId_example"; // Unique identifier of the transaction to prevent double-posting in Paycor's systems.  Please generate a new GUID (using any method) for every API call. Use the same GUID only when you want to replace existing data.
    List<ImportEmployee> importEmployees = Arrays.asList(); // List of Employees, with nested lists of Earnings, to import into Paycor's Paygrid system. 
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to set employee hours and earnings
    Boolean replaceData = true; // If \"True\" is passed for this query parameter and a matching ProcessID is passed, then the system will fully replace the entire record that was previously added.
    Boolean appendData = true; // If \"True\" is passed for this query parameter, then the system will NOT replace any record that was previously added.
    try {
      Object result = client
              .employeePayrollHours
              .addHoursAndEarningsToPaygrid(integrationVendor, processId, importEmployees, legalEntityId)
              .replaceData(replaceData)
              .appendData(appendData)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayrollHoursApi#addHoursAndEarningsToPaygrid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .employeePayrollHours
              .addHoursAndEarningsToPaygrid(integrationVendor, processId, importEmployees, legalEntityId)
              .replaceData(replaceData)
              .appendData(appendData)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayrollHoursApi#addHoursAndEarningsToPaygrid");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to set employee hours and earnings | |
| **importPayrollHours** | [**ImportPayrollHours**](ImportPayrollHours.md)|  | |
| **replaceData** | **Boolean**| If \&quot;True\&quot; is passed for this query parameter and a matching ProcessID is passed, then the system will fully replace the entire record that was previously added. | [optional] |
| **appendData** | **Boolean**| If \&quot;True\&quot; is passed for this query parameter, then the system will NOT replace any record that was previously added. | [optional] |

### Return type

**Object**

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="importToEmployee"></a>
# **importToEmployee**
> Object importToEmployee(employeeId, employeeTimeCard2).execute();

Import Payroll Hours to Employee

Data Access: Import Payroll Hours to Employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayrollHoursApi;
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
    String integrationVendor = "integrationVendor_example"; // Required freeform field for tracking purposes. You can input your company or application name.
    String processId = "processId_example"; // Unique identifier of the transaction to prevent double-posting in Paycor's systems.  Please generate a new GUID (using any method) for every API call.
    Integer employeeNumber = 56; // Unique number of the employee in the tenant. Generated by Paycor. You can use any GET Employee endpoint to retrieve.
    Long departmentCode = 56L; // Department code that the Hours should be paid under. You can use GET Legal Entity Departments to retrieve valid Code values. 
    List<TimeCardData> timeCardData = Arrays.asList(); // List of the employee's earning rates, factors and amounts of type EmployeeEarningAmount.             
    String employeeId = "employeeId_example"; // ID of an Employee for whom you want to add the payroll hours
    String appId = "appId_example"; // Optional field that can be used for tracking purposes. Not required for payroll processing. 
    Integer legalEntityId = 56; // Unique identifier of the Legal Entity in Paycor's system.
    String jobCode = "jobCode_example"; // JobCode parameter is not currently used - included for future functionality. 
    try {
      Object result = client
              .employeePayrollHours
              .importToEmployee(integrationVendor, processId, employeeNumber, departmentCode, timeCardData, employeeId)
              .appId(appId)
              .legalEntityId(legalEntityId)
              .jobCode(jobCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayrollHoursApi#importToEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .employeePayrollHours
              .importToEmployee(integrationVendor, processId, employeeNumber, departmentCode, timeCardData, employeeId)
              .appId(appId)
              .legalEntityId(legalEntityId)
              .jobCode(jobCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayrollHoursApi#importToEmployee");
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
| **employeeId** | **String**| ID of an Employee for whom you want to add the payroll hours | |
| **employeeTimeCard2** | [**EmployeeTimeCard2**](EmployeeTimeCard2.md)| Employee Hours object | |

### Return type

**Object**

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

