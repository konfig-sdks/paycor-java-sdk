# LegalEntityPayrollProcessingDataApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByLegalEntity**](LegalEntityPayrollProcessingDataApi.md#getByLegalEntity) | **GET** /v1/legalentities/{legalEntityId}/payrollProcessing | GET Payroll Processing Data by Legal Entity |


<a name="getByLegalEntity"></a>
# **getByLegalEntity**
> PagedResultOfPayPeriod2 getByLegalEntity(legalEntityId, fromCheckDate).toCheckDate(toCheckDate).continuationToken(continuationToken).execute();

GET Payroll Processing Data by Legal Entity

* If fromCheckDate is not provided, current date will be used.  Data Access: View Legal Entity Payroll Processing Data

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalEntityPayrollProcessingDataApi;
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
    Integer legalEntityId = 56; // ID of the Legal Entity for which you want to get the Pay Groups
    OffsetDateTime fromCheckDate = OffsetDateTime.now(); // Date range filter, From Check Date 
    OffsetDateTime toCheckDate = OffsetDateTime.now(); // Date range filter, To Check Date
    String continuationToken = "continuationToken_example"; // Token to get the next set of Legal Entity Payroll Processing Data
    try {
      PagedResultOfPayPeriod2 result = client
              .legalEntityPayrollProcessingData
              .getByLegalEntity(legalEntityId, fromCheckDate)
              .toCheckDate(toCheckDate)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityPayrollProcessingDataApi#getByLegalEntity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfPayPeriod2> response = client
              .legalEntityPayrollProcessingData
              .getByLegalEntity(legalEntityId, fromCheckDate)
              .toCheckDate(toCheckDate)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntityPayrollProcessingDataApi#getByLegalEntity");
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
| **legalEntityId** | **Integer**| ID of the Legal Entity for which you want to get the Pay Groups | |
| **fromCheckDate** | **OffsetDateTime**| Date range filter, From Check Date  | |
| **toCheckDate** | **OffsetDateTime**| Date range filter, To Check Date | [optional] |
| **continuationToken** | **String**| Token to get the next set of Legal Entity Payroll Processing Data | [optional] |

### Return type

[**PagedResultOfPayPeriod2**](PagedResultOfPayPeriod2.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of the Pay Periods available for the Legal Entity ID provided. |  -  |

