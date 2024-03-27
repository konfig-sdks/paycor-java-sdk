# LegalEntitiesApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](LegalEntitiesApi.md#getById) | **GET** /v1/legalentities/{legalEntityId} |  |
| [**getTenantList**](LegalEntitiesApi.md#getTenantList) | **GET** /v1/legalentities/ActivatedLegalEntityTenantList | Get Legal Entities/Tenants for the user logged in |


<a name="getById"></a>
# **getById**
> LegalEntity getById(legalEntityId).include(include).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntitiesApi;
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
    Integer legalEntityId = 56;
    List<Includes19> include = Arrays.asList();
    try {
      LegalEntity result = client
              .legalEntities
              .getById(legalEntityId)
              .include(include)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getFederalId());
      System.out.println(result.getType());
      System.out.println(result.getIsLost());
      System.out.println(result.getBusinessNames());
      System.out.println(result.getTenant());
      System.out.println(result.getEmployees());
      System.out.println(result.getPersons());
      System.out.println(result.getEarnings());
      System.out.println(result.getDeductions());
      System.out.println(result.getTaxes());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LegalEntity> response = client
              .legalEntities
              .getById(legalEntityId)
              .include(include)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#getById");
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
| **legalEntityId** | **Integer**|  | |
| **include** | [**List&lt;Includes19&gt;**](Includes19.md)|  | [optional] |

### Return type

[**LegalEntity**](LegalEntity.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getTenantList"></a>
# **getTenantList**
> UserInfo getTenantList().execute();

Get Legal Entities/Tenants for the user logged in

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntitiesApi;
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
    try {
      UserInfo result = client
              .legalEntities
              .getTenantList()
              .execute();
      System.out.println(result);
      System.out.println(result.getUserLegalEntities());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#getTenantList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserInfo> response = client
              .legalEntities
              .getTenantList()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#getTenantList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserInfo**](UserInfo.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns list of Legal Entities/Tenant that user has access to  |  -  |

