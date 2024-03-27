# LaborCodesApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLaborCodeToLegalEntity**](LaborCodesApi.md#addLaborCodeToLegalEntity) | **POST** /v1/legalentities/{legalEntityId}/laborcodes | Add Labor Code to Legal Entity |
| [**listByLegalEntityId**](LaborCodesApi.md#listByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/laborcodes | Get Labor Code By Legal Entity ID |
| [**updateSpecifiedLaborCode**](LaborCodesApi.md#updateSpecifiedLaborCode) | **PUT** /v1/legalentities/{legalEntityId}/laborcodes | Update Labor Code |


<a name="addLaborCodeToLegalEntity"></a>
# **addLaborCodeToLegalEntity**
> CreateOrUpdateResponse addLaborCodeToLegalEntity(legalEntityId, laborCode3).execute();

Add Labor Code to Legal Entity

This immediately creates a new labor code related to a Legal Entity in Paycor&#39;s system. There is no way to undo or reverse this operation. * Required body attributes:     * LaborCategoryId     * Code     * LaborCodeName       To make this call you will need the Job Costing or Workforce Management Service.  Data Access: Create and Update Labor Codes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LaborCodesApi;
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
    String laborCategoryId = "laborCategoryId_example"; // Id of the Labor Category 
    String laborCodeName = "laborCodeName_example"; // Unique name of labor code in the labor category
    String code = "code_example"; // textual code of labor code
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to create Labor Code
    String description = "description_example"; // Description of labor code
    OffsetDateTime effectiveStartDate = OffsetDateTime.now(); // Effective start date of labor code
    OffsetDateTime effectiveEndDate = OffsetDateTime.now(); // Effective end date of labor code
    try {
      CreateOrUpdateResponse result = client
              .laborCodes
              .addLaborCodeToLegalEntity(laborCategoryId, laborCodeName, code, legalEntityId)
              .description(description)
              .effectiveStartDate(effectiveStartDate)
              .effectiveEndDate(effectiveEndDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling LaborCodesApi#addLaborCodeToLegalEntity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .laborCodes
              .addLaborCodeToLegalEntity(laborCategoryId, laborCodeName, code, legalEntityId)
              .description(description)
              .effectiveStartDate(effectiveStartDate)
              .effectiveEndDate(effectiveEndDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LaborCodesApi#addLaborCodeToLegalEntity");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to create Labor Code | |
| **laborCode3** | [**LaborCode3**](LaborCode3.md)|  | |

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

<a name="listByLegalEntityId"></a>
# **listByLegalEntityId**
> LaborCode4 listByLegalEntityId(legalEntityId).continuationToken(continuationToken).execute();

Get Labor Code By Legal Entity ID

Returns list of all Labor Code items.  * Labor code is not active if effective start date is after current date or if effective end date is before current date.  To make this call you will need the Job Costing or Workforce Management Service.  Data Access: View Labor Codes by Legal Entity Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LaborCodesApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to get labor codes (also known as job codes)
    String continuationToken = "continuationToken_example";
    try {
      LaborCode4 result = client
              .laborCodes
              .listByLegalEntityId(legalEntityId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getLaborCodeId());
      System.out.println(result.getLaborCategoryId());
      System.out.println(result.getLegalEntityId());
      System.out.println(result.getLaborCodeName());
      System.out.println(result.getDescription());
      System.out.println(result.getCode());
      System.out.println(result.getEffectiveStartDate());
      System.out.println(result.getEffectiveEndDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling LaborCodesApi#listByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LaborCode4> response = client
              .laborCodes
              .listByLegalEntityId(legalEntityId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LaborCodesApi#listByLegalEntityId");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to get labor codes (also known as job codes) | |
| **continuationToken** | **String**|  | [optional] |

### Return type

[**LaborCode4**](LaborCode4.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns list of all Labor Code items. |  -  |

<a name="updateSpecifiedLaborCode"></a>
# **updateSpecifiedLaborCode**
> CreateOrUpdateResponse updateSpecifiedLaborCode(legalEntityId, laborCode5).execute();

Update Labor Code

This operation updates specified labor code in Paycor&#39;s system.  To make this call you will need the Job Costing or Workforce Management Service.  LaborCodeId is required.  Data Access: Create and Update Labor Codes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LaborCodesApi;
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
    String laborCodeId = "laborCodeId_example"; // Id of the Labor Code 
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to update Labor Code
    String laborCodeName = "laborCodeName_example"; // Unique name of labor code in the labor category
    String description = "description_example"; // Description of labor code
    String code = "code_example"; // textual code of labor code
    OffsetDateTime effectiveStartDate = OffsetDateTime.now(); // Effective start date of labor code
    OffsetDateTime effectiveEndDate = OffsetDateTime.now(); // Effective end date of labor code
    try {
      CreateOrUpdateResponse result = client
              .laborCodes
              .updateSpecifiedLaborCode(laborCodeId, legalEntityId)
              .laborCodeName(laborCodeName)
              .description(description)
              .code(code)
              .effectiveStartDate(effectiveStartDate)
              .effectiveEndDate(effectiveEndDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling LaborCodesApi#updateSpecifiedLaborCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .laborCodes
              .updateSpecifiedLaborCode(laborCodeId, legalEntityId)
              .laborCodeName(laborCodeName)
              .description(description)
              .code(code)
              .effectiveStartDate(effectiveStartDate)
              .effectiveEndDate(effectiveEndDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LaborCodesApi#updateSpecifiedLaborCode");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to update Labor Code | |
| **laborCode5** | [**LaborCode5**](LaborCode5.md)|  | |

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

