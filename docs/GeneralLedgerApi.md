# GeneralLedgerApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByLegalEntityId**](GeneralLedgerApi.md#getByLegalEntityId) | **GET** /v1/generalledger/legalentities/{legalEntityId} | Get General Ledger by Legal Entity ID |


<a name="getByLegalEntityId"></a>
# **getByLegalEntityId**
> PagedResultOfGeneralLedger getByLegalEntityId(legalEntityId).plannerId(plannerId).reportType(reportType).include(include).continuationToken(continuationToken).execute();

Get General Ledger by Legal Entity ID

* Type of report can be Regular or Setup     * Setup report returns only department number, company department number, account name, account number, itemize, and sort sequence all other values are set to null.     * Regular report returns all data.  * Planner id is required if report type is set to regular  Data Access: View General Ledger

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GeneralLedgerApi;
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
    Integer legalEntityId = 56; // ID of the legal entity for which you want to get the general ledger items
    String plannerId = "plannerId_example"; // ID of planner, required if report type is regular
    GeneralLedgerReportType reportType = GeneralLedgerReportType.fromValue("Unknown"); // Type of General Ledger, Regular or Setup 
    List<Includes17> include = Arrays.asList(); // Options to include more data: EmployeeData
    String continuationToken = "continuationToken_example"; // Token to get next set of General Ledger records
    try {
      PagedResultOfGeneralLedger result = client
              .generalLedger
              .getByLegalEntityId(legalEntityId)
              .plannerId(plannerId)
              .reportType(reportType)
              .include(include)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralLedgerApi#getByLegalEntityId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfGeneralLedger> response = client
              .generalLedger
              .getByLegalEntityId(legalEntityId)
              .plannerId(plannerId)
              .reportType(reportType)
              .include(include)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralLedgerApi#getByLegalEntityId");
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
| **legalEntityId** | **Integer**| ID of the legal entity for which you want to get the general ledger items | |
| **plannerId** | **String**| ID of planner, required if report type is regular | [optional] |
| **reportType** | [**GeneralLedgerReportType**](.md)| Type of General Ledger, Regular or Setup  | [optional] [enum: Unknown, Setup, Regular] |
| **include** | [**List&lt;Includes17&gt;**](Includes17.md)| Options to include more data: EmployeeData | [optional] |
| **continuationToken** | **String**| Token to get next set of General Ledger records | [optional] |

### Return type

[**PagedResultOfGeneralLedger**](PagedResultOfGeneralLedger.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a paged list of General Ledger items. |  -  |

