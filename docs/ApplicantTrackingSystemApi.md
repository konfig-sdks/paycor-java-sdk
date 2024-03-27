# ApplicantTrackingSystemApi

All URIs are relative to *https://apis.paycor.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccountJobs**](ApplicantTrackingSystemApi.md#getAccountJobs) | **GET** /v1/legalEntities/{legalEntityId}/ats/{atsAccountId}/jobs | Get a list of ATS Account jobs for ATS Account Id |
| [**getJobByJobId**](ApplicantTrackingSystemApi.md#getJobByJobId) | **GET** /v1/legalEntities/{legalEntityId}/ats/{atsAccountId}/jobs/{atsJobId} | Get an ATS Account Job for ATS Account Id |
| [**listAtsAccountsByLegalEntity**](ApplicantTrackingSystemApi.md#listAtsAccountsByLegalEntity) | **GET** /v1/legalEntities/{legalEntityId}/ats/accounts | Get a list of ATS Accounts for Legal Entity |


<a name="getAccountJobs"></a>
# **getAccountJobs**
> PagedResultOfJob getAccountJobs(legalEntityId, atsAccountId).include(include).postedToCareers(postedToCareers).status(status).continuationToken(continuationToken).execute();

Get a list of ATS Account jobs for ATS Account Id

Data Access: View ATS Account jobs by ATS Account ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantTrackingSystemApi;
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
    Integer legalEntityId = 56; // Paycor Legal Entity ID of the legal entity for which you want to get the ATS account jobs
    String atsAccountId = "atsAccountId_example"; // ATS account ID of for which you want to get the ATS account jobs
    List<Includes> include = Arrays.asList(); // Options to include more data: All, Hiring managers, Recruiters, Team members, Executives
    Boolean postedToCareers = true; // Option to filter jobs based on if they are posted to the careers page
    JobStatus status = JobStatus.fromValue("ACTIVE"); // Option to filter jobs by status
    String continuationToken = "continuationToken_example";
    try {
      PagedResultOfJob result = client
              .applicantTrackingSystem
              .getAccountJobs(legalEntityId, atsAccountId)
              .include(include)
              .postedToCareers(postedToCareers)
              .status(status)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMoreResults());
      System.out.println(result.getContinuationToken());
      System.out.println(result.getAdditionalResultsUrl());
      System.out.println(result.getRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingSystemApi#getAccountJobs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedResultOfJob> response = client
              .applicantTrackingSystem
              .getAccountJobs(legalEntityId, atsAccountId)
              .include(include)
              .postedToCareers(postedToCareers)
              .status(status)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingSystemApi#getAccountJobs");
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
| **legalEntityId** | **Integer**| Paycor Legal Entity ID of the legal entity for which you want to get the ATS account jobs | |
| **atsAccountId** | **String**| ATS account ID of for which you want to get the ATS account jobs | |
| **include** | [**List&lt;Includes&gt;**](Includes.md)| Options to include more data: All, Hiring managers, Recruiters, Team members, Executives | [optional] |
| **postedToCareers** | **Boolean**| Option to filter jobs based on if they are posted to the careers page | [optional] |
| **status** | [**JobStatus**](.md)| Option to filter jobs by status | [optional] [enum: ACTIVE, ACTIVATING, APPROVING, CLOSED, DENIED, DRAFT, FILLED, REVIEWING] |
| **continuationToken** | **String**|  | [optional] |

### Return type

[**PagedResultOfJob**](PagedResultOfJob.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of ATS Account jobs for ATS Account Id |  -  |

<a name="getJobByJobId"></a>
# **getJobByJobId**
> Job getJobByJobId(legalEntityId, atsAccountId, atsJobId).include(include).execute();

Get an ATS Account Job for ATS Account Id

Data Access: View ATS Account Job by ATS Job Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantTrackingSystemApi;
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
    Integer legalEntityId = 56; // Paycor Legal Entity ID of the legal entity for which you want to get the ATS account job
    String atsAccountId = "atsAccountId_example"; // ATS account ID of for which you want to get the ATS account job
    String atsJobId = "atsJobId_example"; // ATS Job ID
    List<Includes2> include = Arrays.asList(); // Options to include more data: All, Hiring managers, Recruiters, Team members, Executives
    try {
      Job result = client
              .applicantTrackingSystem
              .getJobByJobId(legalEntityId, atsAccountId, atsJobId)
              .include(include)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAtSAccountId());
      System.out.println(result.getNumber());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getStatus());
      System.out.println(result.getOpenings());
      System.out.println(result.getPriority());
      System.out.println(result.getConfidential());
      System.out.println(result.getInternal());
      System.out.println(result.getTimeToFill());
      System.out.println(result.getRemoteStatus());
      System.out.println(result.getEeoCategory());
      System.out.println(result.getPayRange());
      System.out.println(result.getAtSLocation());
      System.out.println(result.getAtSDepartment());
      System.out.println(result.getHiringManagers());
      System.out.println(result.getRecruiters());
      System.out.println(result.getTeamMembers());
      System.out.println(result.getExecutives());
      System.out.println(result.getActivatedDate());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getModifiedDate());
      System.out.println(result.getPostedToCareers());
      System.out.println(result.getPostedToIndeed());
      System.out.println(result.getPostedToSmartSourcing());
      System.out.println(result.getPostedToLinkedIn());
      System.out.println(result.getPostedToZipRecruiter());
      System.out.println(result.getPostedToGravity());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingSystemApi#getJobByJobId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Job> response = client
              .applicantTrackingSystem
              .getJobByJobId(legalEntityId, atsAccountId, atsJobId)
              .include(include)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingSystemApi#getJobByJobId");
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
| **legalEntityId** | **Integer**| Paycor Legal Entity ID of the legal entity for which you want to get the ATS account job | |
| **atsAccountId** | **String**| ATS account ID of for which you want to get the ATS account job | |
| **atsJobId** | **String**| ATS Job ID | |
| **include** | [**List&lt;Includes2&gt;**](Includes2.md)| Options to include more data: All, Hiring managers, Recruiters, Team members, Executives | [optional] |

### Return type

[**Job**](Job.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an Account job for an ATS Account Id |  -  |

<a name="listAtsAccountsByLegalEntity"></a>
# **listAtsAccountsByLegalEntity**
> ATSAccount listAtsAccountsByLegalEntity(legalEntityId).continuationToken(continuationToken).execute();

Get a list of ATS Accounts for Legal Entity

Data Access: View ATS Accounts By Legal Entity Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paycor;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantTrackingSystemApi;
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
    Integer legalEntityId = 56; // Paycor Legal Entity ID of the legal entity for which you want to get the ATS accounts
    String continuationToken = "continuationToken_example";
    try {
      ATSAccount result = client
              .applicantTrackingSystem
              .listAtsAccountsByLegalEntity(legalEntityId)
              .continuationToken(continuationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getTitle());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingSystemApi#listAtsAccountsByLegalEntity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ATSAccount> response = client
              .applicantTrackingSystem
              .listAtsAccountsByLegalEntity(legalEntityId)
              .continuationToken(continuationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingSystemApi#listAtsAccountsByLegalEntity");
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
| **legalEntityId** | **Integer**| Paycor Legal Entity ID of the legal entity for which you want to get the ATS accounts | |
| **continuationToken** | **String**|  | [optional] |

### Return type

[**ATSAccount**](ATSAccount.md)

### Authorization

[Access-Token](../README.md#Access-Token), [Apim-Subscription-Key](../README.md#Apim-Subscription-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of ATS Accounts for Legal Entity |  -  |

