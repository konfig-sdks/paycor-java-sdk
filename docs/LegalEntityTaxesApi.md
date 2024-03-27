# LegalEntityTaxesApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByLegalEntityId**](LegalEntityTaxesApi.md#getByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/taxes | Get Legal Entity Taxes by Legal Entity ID |


<a name="getByLegalEntityId"></a>
# **getByLegalEntityId**
> List&lt;LegalEntityTax&gt; getByLegalEntityId(legalEntityId).continuationToken(continuationToken).execute();

Get Legal Entity Taxes by Legal Entity ID

Data access: View Legal Entity Taxes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityTaxesApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity you want to get (synonymous to Paycor's ClientID) the taxes
    String continuationToken = "continuationToken_example"; // Token to get the next set of Legal Entity taxes
    try {
      List<LegalEntityTax> result = client
              .legalEntityTaxes
              .getByLegalEntityId(legalEntityId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityTaxesApi#getByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<LegalEntityTax>> response = client
              .legalEntityTaxes
              .getByLegalEntityId(legalEntityId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityTaxesApi#getByLegalEntityId");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity you want to get (synonymous to Paycor&#39;s ClientID) the taxes | |
| **continuationToken** | **String**| Token to get the next set of Legal Entity taxes | [optional] |

### Return type

[**List&lt;LegalEntityTax&gt;**](LegalEntityTax.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of the taxes available for the Legal Entity ID provided. |  -  |

