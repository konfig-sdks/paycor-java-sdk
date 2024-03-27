# EmployeeDirectDepositsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addByEmployeeId**](EmployeeDirectDepositsApi.md#addByEmployeeId) | **POST** /v1/employees/{employeeId}/DirectDeposits | Add Employee Direct Deposits by EmployeeID |
| [**addByEmployeeIdHsa**](EmployeeDirectDepositsApi.md#addByEmployeeIdHsa) | **POST** /v1/employees/{employeeId}/HSAaccounts | Add Employee HSA Direct Deposits by EmployeeID |
| [**getByEmployeeAndDepositId**](EmployeeDirectDepositsApi.md#getByEmployeeAndDepositId) | **GET** /v1/employees/{employeeId}/DirectDeposits/{directDepositId} | Get Employee Direct Deposit by EmployeeID and DirectDepositID |
| [**getByEmployeeId**](EmployeeDirectDepositsApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/DirectDeposits | Get Employee Direct Deposits by EmployeeID |
| [**getByEmployeeIdHSA**](EmployeeDirectDepositsApi.md#getByEmployeeIdHSA) | **GET** /v1/employees/{employeeId}/HSAaccounts | Get Employee HSA Direct Deposits by EmployeeID |
| [**updateByEmployeeIdDDD**](EmployeeDirectDepositsApi.md#updateByEmployeeIdDDD) | **PUT** /v1/employees/{employeeId}/DirectDeposits | Update Employee Direct Deposits by EmployeeID |
| [**updateHsaDirectDepositsByEmployeeId**](EmployeeDirectDepositsApi.md#updateHsaDirectDepositsByEmployeeId) | **PUT** /v1/employees/{employeeId}/HSAaccounts | Update Employee HSA Direct Deposits by EmployeeID |


<a name="addByEmployeeId"></a>
# **addByEmployeeId**
> CreateOrUpdateResponse addByEmployeeId(employeeId, employeeDirectDeposit2).execute();

Add Employee Direct Deposits by EmployeeID

Data Access: Add Employee Direct Deposit

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDirectDepositsApi;
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
    AccountType accountType = AccountType.fromValue("Checking");
    PayFrequency frequency = PayFrequency.fromValue("EveryPayPeriod");
    Boolean onHold = true; // Whether any money should be deposited into the direct deposit account.
    String employeeId = "employeeId_example"; // Id of employee for which you want to add Direct Deposits
    String accountNumber = "accountNumber_example"; // The bank account number where the direct deposit is directed.             
    String routingNumber = "routingNumber_example"; // The bank routing number where the direct deposit is directed.              
    String deductionCode = "deductionCode_example";
    DirectDepositType directDepositType = DirectDepositType.fromValue("Net");
    Double amount = 3.4D; // Fixed, recurring dollar amount.             
    Double rate = 3.4D; // Percentage of the paycheck to be deposited into the direct deposit account             
    try {
      CreateOrUpdateResponse result = client
              .employeeDirectDeposits
              .addByEmployeeId(accountType, frequency, onHold, employeeId)
              .accountNumber(accountNumber)
              .routingNumber(routingNumber)
              .deductionCode(deductionCode)
              .directDepositType(directDepositType)
              .amount(amount)
              .rate(rate)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#addByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeDirectDeposits
              .addByEmployeeId(accountType, frequency, onHold, employeeId)
              .accountNumber(accountNumber)
              .routingNumber(routingNumber)
              .deductionCode(deductionCode)
              .directDepositType(directDepositType)
              .amount(amount)
              .rate(rate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#addByEmployeeId");
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
| **employeeId** | **String**| Id of employee for which you want to add Direct Deposits | |
| **employeeDirectDeposit2** | [**EmployeeDirectDeposit2**](EmployeeDirectDeposit2.md)| Direct Deposit object to insert | |

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

<a name="addByEmployeeIdHsa"></a>
# **addByEmployeeIdHsa**
> CreateOrUpdateResponse addByEmployeeIdHsa(employeeId, employeeHsaDirectDeposit).execute();

Add Employee HSA Direct Deposits by EmployeeID

Data Access: Add Employee HSA Account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDirectDepositsApi;
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
    AccountType accountType = AccountType.fromValue("Checking");
    PayFrequency frequency = PayFrequency.fromValue("EveryPayPeriod");
    String deductionCode = "deductionCode_example"; // Unique deduction code set at the legal entity or tenant level.  
    Boolean onHold = true; // Whether any money should be deposited into the HSA direct deposit account.
    String employeeId = "employeeId_example"; // ID of employee for which you want to add HSA Direct Deposits
    String accountNumber = "accountNumber_example"; // The bank account number where the HSA direct deposit is directed.             
    String routingNumber = "routingNumber_example"; // The bank routing number where the HSA direct deposit is directed.              
    Double amount = 3.4D; // Fixed, recurring dollar amount.             
    Double rate = 3.4D; // Percentage of the paycheck to be deposited into the HSA direct deposit account             
    try {
      CreateOrUpdateResponse result = client
              .employeeDirectDeposits
              .addByEmployeeIdHsa(accountType, frequency, deductionCode, onHold, employeeId)
              .accountNumber(accountNumber)
              .routingNumber(routingNumber)
              .amount(amount)
              .rate(rate)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#addByEmployeeIdHsa");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeDirectDeposits
              .addByEmployeeIdHsa(accountType, frequency, deductionCode, onHold, employeeId)
              .accountNumber(accountNumber)
              .routingNumber(routingNumber)
              .amount(amount)
              .rate(rate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#addByEmployeeIdHsa");
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
| **employeeId** | **String**| ID of employee for which you want to add HSA Direct Deposits | |
| **employeeHsaDirectDeposit** | [**EmployeeHsaDirectDeposit**](EmployeeHsaDirectDeposit.md)| HSA Direct Deposit object to insert | |

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

<a name="getByEmployeeAndDepositId"></a>
# **getByEmployeeAndDepositId**
> EmployeeDirectDeposit getByEmployeeAndDepositId(employeeId, directDepositId).execute();

Get Employee Direct Deposit by EmployeeID and DirectDepositID

Data Access: View Employee Direct Deposit Information by Direct Deposit Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDirectDepositsApi;
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
    String employeeId = "employeeId_example"; // ID of employee for which you want to get Direct Deposits
    String directDepositId = "directDepositId_example"; // ID of an employee direct deposit which you want to retrieve
    try {
      EmployeeDirectDeposit result = client
              .employeeDirectDeposits
              .getByEmployeeAndDepositId(employeeId, directDepositId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAccountType());
      System.out.println(result.getMaskedAccountNumber());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getBankName());
      System.out.println(result.getFrequency());
      System.out.println(result.getDeductionCode());
      System.out.println(result.getDirectDepositType());
      System.out.println(result.getOnHold());
      System.out.println(result.getAmount());
      System.out.println(result.getRate());
      System.out.println(result.getEmployee());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#getByEmployeeAndDepositId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeDirectDeposit> response = client
              .employeeDirectDeposits
              .getByEmployeeAndDepositId(employeeId, directDepositId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#getByEmployeeAndDepositId");
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
| **employeeId** | **String**| ID of employee for which you want to get Direct Deposits | |
| **directDepositId** | **String**| ID of an employee direct deposit which you want to retrieve | |

### Return type

[**EmployeeDirectDeposit**](EmployeeDirectDeposit.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Direct Deposits based on EmployeeID |  -  |

<a name="getByEmployeeId"></a>
# **getByEmployeeId**
> PagedResultOfEmployeeDirectDeposit getByEmployeeId(employeeId).continuationToken(continuationToken).execute();

Get Employee Direct Deposits by EmployeeID

Data Access: View Employee Direct Deposit Information by Employee Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDirectDepositsApi;
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
    String employeeId = "employeeId_example"; // ID of employee for which you want to get Direct Deposits
    String continuationToken = "continuationToken_example"; // Token to get next set of direct deposits
    try {
      PagedResultOfEmployeeDirectDeposit result = client
              .employeeDirectDeposits
              .getByEmployeeId(employeeId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#getByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfEmployeeDirectDeposit> response = client
              .employeeDirectDeposits
              .getByEmployeeId(employeeId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#getByEmployeeId");
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
| **employeeId** | **String**| ID of employee for which you want to get Direct Deposits | |
| **continuationToken** | **String**| Token to get next set of direct deposits | [optional] |

### Return type

[**PagedResultOfEmployeeDirectDeposit**](PagedResultOfEmployeeDirectDeposit.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Direct Deposits based on EmployeeID |  -  |

<a name="getByEmployeeIdHSA"></a>
# **getByEmployeeIdHSA**
> PagedResultOfEmployeeDirectDeposit getByEmployeeIdHSA(employeeId).continuationToken(continuationToken).execute();

Get Employee HSA Direct Deposits by EmployeeID

Data Access: View Employee HSA Account Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDirectDepositsApi;
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
    String employeeId = "employeeId_example"; // ID of employee for whom you want to get HSA Direct Deposits
    String continuationToken = "continuationToken_example"; // Token to get next set of HSA Direct Deposits
    try {
      PagedResultOfEmployeeDirectDeposit result = client
              .employeeDirectDeposits
              .getByEmployeeIdHSA(employeeId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#getByEmployeeIdHSA");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfEmployeeDirectDeposit> response = client
              .employeeDirectDeposits
              .getByEmployeeIdHSA(employeeId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#getByEmployeeIdHSA");
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
| **employeeId** | **String**| ID of employee for whom you want to get HSA Direct Deposits | |
| **continuationToken** | **String**| Token to get next set of HSA Direct Deposits | [optional] |

### Return type

[**PagedResultOfEmployeeDirectDeposit**](PagedResultOfEmployeeDirectDeposit.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns HSA Direct Deposits based on EmployeeID |  -  |

<a name="updateByEmployeeIdDDD"></a>
# **updateByEmployeeIdDDD**
> CreateOrUpdateResponse updateByEmployeeIdDDD(employeeId, employeeDirectDeposit3).execute();

Update Employee Direct Deposits by EmployeeID

Data Access: Update Employee Direct Deposit Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDirectDepositsApi;
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
    String id = "id_example"; // Unique identifier of the employee direct deposit in Paycor's system. Generated by Paycor.             
    AccountType accountType = AccountType.fromValue("Checking");
    String accountNumber = "accountNumber_example"; // The bank account number where the direct deposit is directed.             
    String routingNumber = "routingNumber_example"; // The bank routing number where the direct deposit is directed.              
    PayFrequency frequency = PayFrequency.fromValue("EveryPayPeriod");
    Boolean onHold = true; // Whether any money should be deposited into the direct deposit account.
    String employeeId = "employeeId_example"; // ID of employee for which you want to update Direct Deposit
    DirectDepositType directDepositType = DirectDepositType.fromValue("Net");
    Double amount = 3.4D; // Fixed, recurring dollar amount.             
    Double rate = 3.4D; // Percentage of the paycheck to be deposited into the direct deposit account             
    try {
      CreateOrUpdateResponse result = client
              .employeeDirectDeposits
              .updateByEmployeeIdDDD(id, accountType, accountNumber, routingNumber, frequency, onHold, employeeId)
              .directDepositType(directDepositType)
              .amount(amount)
              .rate(rate)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#updateByEmployeeIdDDD");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeDirectDeposits
              .updateByEmployeeIdDDD(id, accountType, accountNumber, routingNumber, frequency, onHold, employeeId)
              .directDepositType(directDepositType)
              .amount(amount)
              .rate(rate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#updateByEmployeeIdDDD");
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
| **employeeId** | **String**| ID of employee for which you want to update Direct Deposit | |
| **employeeDirectDeposit3** | [**EmployeeDirectDeposit3**](EmployeeDirectDeposit3.md)| Employee Direct Deposit object with updated fields | |

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

<a name="updateHsaDirectDepositsByEmployeeId"></a>
# **updateHsaDirectDepositsByEmployeeId**
> CreateOrUpdateResponse updateHsaDirectDepositsByEmployeeId(employeeId, employeeHsaDirectDeposit2).execute();

Update Employee HSA Direct Deposits by EmployeeID

Data Access: Update Employee HSA Account Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDirectDepositsApi;
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
    String id = "id_example"; // Unique identifier of the employee hsa direct deposit in Paycor's system. Generated by Paycor.             
    AccountType accountType = AccountType.fromValue("Checking");
    String accountNumber = "accountNumber_example"; // The bank account number where the HSA direct deposit is directed.             
    String routingNumber = "routingNumber_example"; // The bank routing number where the HSA direct deposit is directed.              
    PayFrequency frequency = PayFrequency.fromValue("EveryPayPeriod");
    Boolean onHold = true; // Whether any money should be deposited into the HSA direct deposit account.
    String employeeId = "employeeId_example"; // ID of employee for which you want to update HSA Direct Deposits
    Double amount = 3.4D; // Fixed, recurring dollar amount.             
    Double rate = 3.4D; // Percentage of the paycheck to be deposited into the HSA direct deposit account             
    try {
      CreateOrUpdateResponse result = client
              .employeeDirectDeposits
              .updateHsaDirectDepositsByEmployeeId(id, accountType, accountNumber, routingNumber, frequency, onHold, employeeId)
              .amount(amount)
              .rate(rate)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#updateHsaDirectDepositsByEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .employeeDirectDeposits
              .updateHsaDirectDepositsByEmployeeId(id, accountType, accountNumber, routingNumber, frequency, onHold, employeeId)
              .amount(amount)
              .rate(rate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDirectDepositsApi#updateHsaDirectDepositsByEmployeeId");
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
| **employeeId** | **String**| ID of employee for which you want to update HSA Direct Deposits | |
| **employeeHsaDirectDeposit2** | [**EmployeeHsaDirectDeposit2**](EmployeeHsaDirectDeposit2.md)| HSA Employee Direct Deposit object with updated fields | |

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

