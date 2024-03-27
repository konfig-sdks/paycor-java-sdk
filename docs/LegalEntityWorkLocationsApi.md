# LegalEntityWorkLocationsApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addByLegalEntityId**](LegalEntityWorkLocationsApi.md#addByLegalEntityId) | **POST** /v1/legalentities/{legalEntityId}/worklocations | Add Work Location By Legal Entity ID |
| [**deleteByLegalEntityAndWorkLocationId**](LegalEntityWorkLocationsApi.md#deleteByLegalEntityAndWorkLocationId) | **DELETE** /v1/legalentities/{legalEntityId}/worklocations/{workLocationId} | Delete Work Location By Work Location ID And Legal Entity ID |
| [**getByLegalEntityAndLocation**](LegalEntityWorkLocationsApi.md#getByLegalEntityAndLocation) | **GET** /v1/legalentities/{legalEntityId}/worklocations/{workLocationId} | Get a Work Location for a Legal Entity By Legal Entity ID and Work Location ID |
| [**list**](LegalEntityWorkLocationsApi.md#list) | **GET** /v1/legalentities/{legalEntityId}/worklocations | Get a list of Work Locations for a Legal Entity |
| [**updateByLegalEntityId**](LegalEntityWorkLocationsApi.md#updateByLegalEntityId) | **PUT** /v1/legalentities/{legalEntityId}/worklocations | Update Work Location By Legal Entity ID |


<a name="addByLegalEntityId"></a>
# **addByLegalEntityId**
> CreateOrUpdateResponse addByLegalEntityId(legalEntityId, workLocation).addressData(addressData).execute();

Add Work Location By Legal Entity ID

Data Access: Create Legal Entity Work Location

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityWorkLocationsApi;
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
    String name = "name_example"; // Name of the work location.
    List<WorkLocationAddress> addresses = Arrays.asList(); // A list of work location's addresses.
    Integer legalEntityId = 56;
    String storeId = "storeId_example"; // Unique identifier of the work location store. StoreId is used for clients with WOTC Service only, defaults to Worklocation name if not provided.
    Boolean isFmlaEligible = true; // Flag which determines if work location is FMLA eligible (Family and Medical Leave Act).
    List<WorkLocationPhoneNumber> phoneNumbers = Arrays.asList(); // A list of the work location's phone numbers.             
    Boolean addressData = true; // Use Physical Address as mailing address?
    try {
      CreateOrUpdateResponse result = client
              .legalEntityWorkLocations
              .addByLegalEntityId(name, addresses, legalEntityId)
              .storeId(storeId)
              .isFmlaEligible(isFmlaEligible)
              .phoneNumbers(phoneNumbers)
              .addressData(addressData)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityWorkLocationsApi#addByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .legalEntityWorkLocations
              .addByLegalEntityId(name, addresses, legalEntityId)
              .storeId(storeId)
              .isFmlaEligible(isFmlaEligible)
              .phoneNumbers(phoneNumbers)
              .addressData(addressData)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityWorkLocationsApi#addByLegalEntityId");
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
| **workLocation** | [**WorkLocation**](WorkLocation.md)| Create Work Location model | |
| **addressData** | **Boolean**| Use Physical Address as mailing address? | [optional] |

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

<a name="deleteByLegalEntityAndWorkLocationId"></a>
# **deleteByLegalEntityAndWorkLocationId**
> CreateOrUpdateResponse deleteByLegalEntityAndWorkLocationId(legalEntityId, workLocationId).execute();

Delete Work Location By Work Location ID And Legal Entity ID

Data Access: Delete Legal Entity Work Location

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityWorkLocationsApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to delete Work Location
    String workLocationId = "workLocationId_example"; // ID of the Work Location
    try {
      CreateOrUpdateResponse result = client
              .legalEntityWorkLocations
              .deleteByLegalEntityAndWorkLocationId(legalEntityId, workLocationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityWorkLocationsApi#deleteByLegalEntityAndWorkLocationId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .legalEntityWorkLocations
              .deleteByLegalEntityAndWorkLocationId(legalEntityId, workLocationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityWorkLocationsApi#deleteByLegalEntityAndWorkLocationId");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to delete Work Location | |
| **workLocationId** | **String**| ID of the Work Location | |

### Return type

[**CreateOrUpdateResponse**](CreateOrUpdateResponse.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Status Code only |  -  |

<a name="getByLegalEntityAndLocation"></a>
# **getByLegalEntityAndLocation**
> LegalEntityWorkLocation getByLegalEntityAndLocation(legalEntityId, workLocationId).execute();

Get a Work Location for a Legal Entity By Legal Entity ID and Work Location ID

Data Access: View Legal Entity Work Location

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityWorkLocationsApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to get the work location
    String workLocationId = "workLocationId_example"; // ID of the Work Location
    try {
      LegalEntityWorkLocation result = client
              .legalEntityWorkLocations
              .getByLegalEntityAndLocation(legalEntityId, workLocationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getAddresses());
      System.out.println(result.getPhones());
      System.out.println(result.getLocationNumber());
      System.out.println(result.getStoreId());
      System.out.println(result.getIsFmlaEligible());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityWorkLocationsApi#getByLegalEntityAndLocation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LegalEntityWorkLocation> response = client
              .legalEntityWorkLocations
              .getByLegalEntityAndLocation(legalEntityId, workLocationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityWorkLocationsApi#getByLegalEntityAndLocation");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to get the work location | |
| **workLocationId** | **String**| ID of the Work Location | |

### Return type

[**LegalEntityWorkLocation**](LegalEntityWorkLocation.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Legal Entity Work Location |  -  |

<a name="list"></a>
# **list**
> PagedResultOfLegalEntityWorkLocation list(legalEntityId).continuationToken(continuationToken).execute();

Get a list of Work Locations for a Legal Entity

Data Access: View Legal Entity Work Locations

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityWorkLocationsApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to get the work locations
    String continuationToken = "continuationToken_example"; // Token to get the next set of work locations
    try {
      PagedResultOfLegalEntityWorkLocation result = client
              .legalEntityWorkLocations
              .list(legalEntityId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityWorkLocationsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfLegalEntityWorkLocation> response = client
              .legalEntityWorkLocations
              .list(legalEntityId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityWorkLocationsApi#list");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to get the work locations | |
| **continuationToken** | **String**| Token to get the next set of work locations | [optional] |

### Return type

[**PagedResultOfLegalEntityWorkLocation**](PagedResultOfLegalEntityWorkLocation.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Work Locations for a Legal Entity |  -  |

<a name="updateByLegalEntityId"></a>
# **updateByLegalEntityId**
> CreateOrUpdateResponse updateByLegalEntityId(legalEntityId, workLocation2).execute();

Update Work Location By Legal Entity ID

Data Access: Update Legal Entity Work Location

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityWorkLocationsApi;
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
    String id = "id_example"; // Unique identifier of the work location in Paycor's system. Generated by Paycor.
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to get the work locations
    List<WorkLocationAddressUpdate> addresses = Arrays.asList(); // A list of work location's addresses.
    List<WorkLocationPhoneNumber> phoneNumbers = Arrays.asList(); // A list of the work location's phone numbers.             
    String timeZone = "timeZone_example"; // Time zone.             
    Boolean isFmlaEligible = true; // Is FmlaEligible.             
    Boolean isDefault = true; // Is default             
    try {
      CreateOrUpdateResponse result = client
              .legalEntityWorkLocations
              .updateByLegalEntityId(id, legalEntityId)
              .addresses(addresses)
              .phoneNumbers(phoneNumbers)
              .timeZone(timeZone)
              .isFmlaEligible(isFmlaEligible)
              .isDefault(isDefault)
              .execute();
      System.out.println(result);
      System.out.println(result.getResourceUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityWorkLocationsApi#updateByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrUpdateResponse> response = client
              .legalEntityWorkLocations
              .updateByLegalEntityId(id, legalEntityId)
              .addresses(addresses)
              .phoneNumbers(phoneNumbers)
              .timeZone(timeZone)
              .isFmlaEligible(isFmlaEligible)
              .isDefault(isDefault)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityWorkLocationsApi#updateByLegalEntityId");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to get the work locations | |
| **workLocation2** | [**WorkLocation2**](WorkLocation2.md)| Update Work Location model | |

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
| **201** | Returns a resource reference for work location |  -  |

