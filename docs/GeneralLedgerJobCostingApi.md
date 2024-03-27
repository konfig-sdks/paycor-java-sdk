# GeneralLedgerJobCostingApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByLegalEntityId**](GeneralLedgerJobCostingApi.md#getByLegalEntityId) | **GET** /v1/generalledger/jobcosting/legalentities/{legalEntityId} | Get General Ledger Job Costing by Legal Entity ID |


<a name="getByLegalEntityId"></a>
# **getByLegalEntityId**
> PagedResultOfJobCosting getByLegalEntityId(legalEntityId, plannerId).include(include).continuationToken(continuationToken).execute();

Get General Ledger Job Costing by Legal Entity ID

Data Access: View General Ledger Job Costing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GeneralLedgerJobCostingApi;
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
    Integer legalEntityId = 56; // ID of the legal entity for which you want to get the job costing items.
    String plannerId = "plannerId_example"; // ID of planner.
    List<Includes18> include = Arrays.asList(); // Options to include more data: EmployeeData
    String continuationToken = "continuationToken_example"; // Token to get next set of Job Costing records.
    try {
      PagedResultOfJobCosting result = client
              .generalLedgerJobCosting
              .getByLegalEntityId(legalEntityId, plannerId)
              .include(include)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralLedgerJobCostingApi#getByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfJobCosting> response = client
              .generalLedgerJobCosting
              .getByLegalEntityId(legalEntityId, plannerId)
              .include(include)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralLedgerJobCostingApi#getByLegalEntityId");
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
| **legalEntityId** | **Integer**| ID of the legal entity for which you want to get the job costing items. | |
| **plannerId** | **String**| ID of planner. | |
| **include** | [**List&lt;Includes18&gt;**](Includes18.md)| Options to include more data: EmployeeData | [optional] |
| **continuationToken** | **String**| Token to get next set of Job Costing records. | [optional] |

### Return type

[**PagedResultOfJobCosting**](PagedResultOfJobCosting.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a paged list of JobCosting items. |  -  |

