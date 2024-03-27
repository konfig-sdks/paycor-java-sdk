<div align="left">

[![Visit Paycor](./header.png)](https://paycor.com)

# [Paycor](https://paycor.com)


Welcome to Paycor's Public API! This document is a reference for the APIs Paycor has available, and acts as a complement to the "Guides" section. 

# Getting Started

<strong>To learn more about getting started with Paycor's Public APIs, check out our <a href="/guides">Guides.</a></strong>

# GET, PUT, POST

* When requesting object, use GET endpoints. All list endpoints support paging, as described [in the other doc]. 
* When creating an object, use POST endpoints. Your code will need to create an object and send it to Paycor in your API call request body as JSON. You can use the "request sample" body as a starting point. Our endpoints will return a reference to the created object (the ID and GET API URL) for your system.
* When updating an object, you will use PUT endpoints. The general flow would be to: GET the object you want to update, modify the fields as desired, then PUT the object (as JSON in the request body) to our endpoints. Some fields like the object's ID cannot be updated because they are system-set.'


# Error Handling

* 400: Please consult the response text to correct your request information. 
* 401 with response "Access denied due to missing subscription key": Please include your APIM Subscription Key as header Ocp-Apim-Subscription-Key or querystring parameter subscription-key. 
* 401 with no response: Please ensure you included a valid & current Access Token in the Authorization header.
* 403: Please ensure your Access Token's scope has all the relevant access you need, on the AppCreator Data Access screen. 
* 404: Please validate the API route you are using. If that is correct, one of your IDs most likely does not exist or is not in a valid state. 
* 429: Paycor implements rate limits for our Public API. Each customer (implemented via APIM subscription key) has a limited number of calls. The number of calls is counted across all APIs, not per individual API. Please use bulk endpoints where available and spread your calls over a wider timespan.
  * The default rate limit is up to 1000 API calls per minute (total across all our Public APIs). 
* 500: Please contact Paycor. When you make a POST or PUT call and receive a 500, please do not retry the call automatically - this may result in double-posting. GETs can be safely retried.


# IDs

* ClientId = LegalEntityId
* TenantId = CompanyId
* EmployeeId is not visible in Paycor's UI, you must retrieve it from the Public API

# Earnings, Deductions, Taxes

This section describes the domain model for Paycor's Earnings, Deductions, and Taxes. This will provide background for many paydata-related Public API endpoints. 

Paycor stores Earnings, Deductions, and Taxes each at three levels:
* Global: Same data across all legal entities. Setup by Paycor for customers to choose from. Sample Codes (note these will not be setup on every Legal Entity):
  * Earnings: REG, OT
  * Taxes: FITWH, SOC, SOCER, OHCIN
  * Deductions: 401k, KMat, H125, UWay
* Legal Entity or Tenant: Codes setup &amp; customized on the legal entity or Tenant level. Must be tied to a Global Code. 
  * Perform UI allows creating Deduction and Earning codes on Tenant level (under Configure Company nav menu). These will be returned by the Legal Entity Public API endpoints. 
* Employee: codes setup on a particular employee, tied to a Legal Entity-level or Tenant-level code
  * Employee Earnings/Deductions/Taxes are applied during payroll. Many properties are inherited from the Legal Entity or Global levels, but some can be overridden. 

# Authentication

<!-- ReDoc-Inject: <security-definitions> -->

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Paycor&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>paycor-java-sdk</artifactId>
  <version></version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:paycor-java-sdk:"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/paycor-java-sdk-.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://apis.paycor.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*LegalEntityTaxesApi* | [**getByLegalEntityId**](docs/LegalEntityTaxesApi.md#getByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/taxes | Get Legal Entity Taxes by Legal Entity ID
*ApplicantTrackingSystemApi* | [**getAccountJobs**](docs/ApplicantTrackingSystemApi.md#getAccountJobs) | **GET** /v1/legalEntities/{legalEntityId}/ats/{atsAccountId}/jobs | Get a list of ATS Account jobs for ATS Account Id
*ApplicantTrackingSystemApi* | [**getJobByJobId**](docs/ApplicantTrackingSystemApi.md#getJobByJobId) | **GET** /v1/legalEntities/{legalEntityId}/ats/{atsAccountId}/jobs/{atsJobId} | Get an ATS Account Job for ATS Account Id
*ApplicantTrackingSystemApi* | [**listAtsAccountsByLegalEntity**](docs/ApplicantTrackingSystemApi.md#listAtsAccountsByLegalEntity) | **GET** /v1/legalEntities/{legalEntityId}/ats/accounts | Get a list of ATS Accounts for Legal Entity
*EmployeeLegacyPerformTimeSchedulesApi* | [**addToEmployee**](docs/EmployeeLegacyPerformTimeSchedulesApi.md#addToEmployee) | **POST** /v1/employees/{employeeId}/schedules | Add Schedule to Employee
*EmployeeLegacyPerformTimeSchedulesApi* | [**deleteLegacySchedule**](docs/EmployeeLegacyPerformTimeSchedulesApi.md#deleteLegacySchedule) | **DELETE** /v1/employees/{employeeId}/schedules/{scheduleId} | Delete Employee Schedule
*EmployeeLegacyPerformTimeSchedulesApi* | [**getByEmployeeId**](docs/EmployeeLegacyPerformTimeSchedulesApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/schedules | Get Employee Schedules by EmployeeID
*EmployeeLegacyPerformTimeSchedulesApi* | [**getByLegalEntityId**](docs/EmployeeLegacyPerformTimeSchedulesApi.md#getByLegalEntityId) | **GET** /v1/legalEntities/{legalEntityId}/schedules | Get Employee Schedules by Legal Entity ID
*EmployeeCertificationsApi* | [**addNewCertification**](docs/EmployeeCertificationsApi.md#addNewCertification) | **POST** /v1/employees/{employeeId}/certifications | Add Employee Certification
*EmployeeCertificationsApi* | [**listByEmployeeId**](docs/EmployeeCertificationsApi.md#listByEmployeeId) | **GET** /v1/employees/{employeeId}/certifications | Get a list of Employee Certifications for an employee
*EmployeeCertificationsApi* | [**updateCertification**](docs/EmployeeCertificationsApi.md#updateCertification) | **PUT** /v1/employees/{employeeId}/certifications | Update Employee Certification
*EmployeeCustomFieldsApi* | [**getByEmployeeId**](docs/EmployeeCustomFieldsApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/customfields | Get Employee Custom Fields by EmployeeID
*EmployeeCustomFieldsApi* | [**updateByEmployeeId**](docs/EmployeeCustomFieldsApi.md#updateByEmployeeId) | **PUT** /v1/employees/{employeeId}/customfields | Update Custom Field by EmployeeID
*EmployeeDeductionsApi* | [**addDeductionToEmployee**](docs/EmployeeDeductionsApi.md#addDeductionToEmployee) | **POST** /v1/employees/{employeeId}/deductions | Add Deduction to Employee
*EmployeeDeductionsApi* | [**getByEmployeeId**](docs/EmployeeDeductionsApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/deductions | Get Employee Deductions by EmployeeID
*EmployeeDeductionsApi* | [**getByEmployeeIdAndDeductionId**](docs/EmployeeDeductionsApi.md#getByEmployeeIdAndDeductionId) | **GET** /v1/employees/{employeeId}/deductions/{employeeDeductionId} | Get Employee Deduction by EmployeeID and EmployeeDeductionID
*EmployeeDeductionsApi* | [**updateByEmployeeId**](docs/EmployeeDeductionsApi.md#updateByEmployeeId) | **PUT** /v1/employees/{employeeId}/deductions | Update Employee Deduction by EmployeeID
*EmployeeDirectDepositsApi* | [**addByEmployeeId**](docs/EmployeeDirectDepositsApi.md#addByEmployeeId) | **POST** /v1/employees/{employeeId}/DirectDeposits | Add Employee Direct Deposits by EmployeeID
*EmployeeDirectDepositsApi* | [**addByEmployeeIdHsa**](docs/EmployeeDirectDepositsApi.md#addByEmployeeIdHsa) | **POST** /v1/employees/{employeeId}/HSAaccounts | Add Employee HSA Direct Deposits by EmployeeID
*EmployeeDirectDepositsApi* | [**getByEmployeeAndDepositId**](docs/EmployeeDirectDepositsApi.md#getByEmployeeAndDepositId) | **GET** /v1/employees/{employeeId}/DirectDeposits/{directDepositId} | Get Employee Direct Deposit by EmployeeID and DirectDepositID
*EmployeeDirectDepositsApi* | [**getByEmployeeId**](docs/EmployeeDirectDepositsApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/DirectDeposits | Get Employee Direct Deposits by EmployeeID
*EmployeeDirectDepositsApi* | [**getByEmployeeIdHSA**](docs/EmployeeDirectDepositsApi.md#getByEmployeeIdHSA) | **GET** /v1/employees/{employeeId}/HSAaccounts | Get Employee HSA Direct Deposits by EmployeeID
*EmployeeDirectDepositsApi* | [**updateByEmployeeIdDDD**](docs/EmployeeDirectDepositsApi.md#updateByEmployeeIdDDD) | **PUT** /v1/employees/{employeeId}/DirectDeposits | Update Employee Direct Deposits by EmployeeID
*EmployeeDirectDepositsApi* | [**updateHsaDirectDepositsByEmployeeId**](docs/EmployeeDirectDepositsApi.md#updateHsaDirectDepositsByEmployeeId) | **PUT** /v1/employees/{employeeId}/HSAaccounts | Update Employee HSA Direct Deposits by EmployeeID
*EmployeeDocumentsApi* | [**downloadPayStub**](docs/EmployeeDocumentsApi.md#downloadPayStub) | **GET** /v1/employees/{employeeId}/PayStubDocument/{documentId} | Download Employee Pay Stub Document
*EmployeeDocumentsApi* | [**getPayStubDocumentByEmployeeId**](docs/EmployeeDocumentsApi.md#getPayStubDocumentByEmployeeId) | **GET** /v1/employees/{employeeId}/paystubDocumentData | Get Employee Pay Stubs document link by EmployeeID
*EmployeeEarningsApi* | [**addNewEarning**](docs/EmployeeEarningsApi.md#addNewEarning) | **POST** /v1/employees/{employeeId}/earnings | Add Earning to Employee
*EmployeeEarningsApi* | [**getByEmployeeAndEarning**](docs/EmployeeEarningsApi.md#getByEmployeeAndEarning) | **GET** /v1/employees/{employeeId}/earnings/{employeeEarningId} | Get Employee Earning by EmployeeID and EmployeeEarningID
*EmployeeEarningsApi* | [**getByEmployeeId**](docs/EmployeeEarningsApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/earnings | Get Employee Earnings by EmployeeID
*EmployeeEarningsApi* | [**updateData**](docs/EmployeeEarningsApi.md#updateData) | **PUT** /v1/employees/{employeeId}/earnings | Update Employee Earning
*EmployeeEmergencyContactApi* | [**createUpdate**](docs/EmployeeEmergencyContactApi.md#createUpdate) | **POST** /v1/employees/{employeeId}/emergencycontact | 
*EmployeeI9VerificationApi* | [**getByEmployeeId**](docs/EmployeeI9VerificationApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/I9Verification | Get Employee I9 Verification by EmployeeID
*EmployeeI9VerificationApi* | [**updateByEmployeeIdI9Verification**](docs/EmployeeI9VerificationApi.md#updateByEmployeeIdI9Verification) | **PUT** /v1/employees/{employeeId}/I9Verification | Update I9 Verification by EmployeeID
*EmployeeOnboardingApi* | [**addNewEntry**](docs/EmployeeOnboardingApi.md#addNewEntry) | **POST** /v1/employees/onboarding | Create Employee Onboarding
*EmployeeOnboardingApi* | [**listOnboardingEmployees**](docs/EmployeeOnboardingApi.md#listOnboardingEmployees) | **GET** /v1/legalentities/{legalEntityId}/onboardingemployees | Get employees in the onboarding state
*EmployeePayRatesApi* | [**addNewRate**](docs/EmployeePayRatesApi.md#addNewRate) | **POST** /v1/employees/{employeeId}/payrates | Add Payrate to Employee
*EmployeePayRatesApi* | [**getByEmployeeId**](docs/EmployeePayRatesApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/payrates | Get Employee Payrates by EmployeeID
*EmployeePayRatesApi* | [**updateByEmployeeIdAndPayrateId**](docs/EmployeePayRatesApi.md#updateByEmployeeIdAndPayrateId) | **PUT** /v1/employees/{employeeId}/payrates/{payrateId} | Update Employee Payrate by EmployeeID
*EmployeePayScheduleApi* | [**getUpcomingCheckDates**](docs/EmployeePayScheduleApi.md#getUpcomingCheckDates) | **GET** /v1/employees/{employeeId}/payschedule | Get Employee Pay Schedule by EmployeeID
*EmployeePayStubsApi* | [**getByEmployeeId**](docs/EmployeePayStubsApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/paystubs | Get Employee Pay Stubs by EmployeeID
*EmployeePayStubsApi* | [**getByLegalEntity**](docs/EmployeePayStubsApi.md#getByLegalEntity) | **GET** /v1/legalentities/{legalEntityId}/paystubs | Get Employee Pay Stubs by Legal Entity ID
*EmployeePayStubsApi* | [**getYtdByEmployeeId**](docs/EmployeePayStubsApi.md#getYtdByEmployeeId) | **GET** /v1/employees/{employeeId}/paystubsytd | Get Employee Pay Stubs YTD by EmployeeID
*EmployeePayStubsApi* | [**getYtdByLegalEntity**](docs/EmployeePayStubsApi.md#getYtdByLegalEntity) | **GET** /v1/legalentities/{legalEntityId}/paystubsytd | Get Employee Pay Stubs YTD by Legal entity ID
*EmployeePayrollHoursApi* | [**addHoursAndEarningsToPaygrid**](docs/EmployeePayrollHoursApi.md#addHoursAndEarningsToPaygrid) | **POST** /v1/legalentities/{legalEntityId}/payrollhours | Add Employee Hours And Earnings To Paygrid
*EmployeePayrollHoursApi* | [**importToEmployee**](docs/EmployeePayrollHoursApi.md#importToEmployee) | **POST** /v1/employees/{employeeId}/payrollhours | Import Payroll Hours to Employee
*EmployeeTaxesApi* | [**addByEmployeeId**](docs/EmployeeTaxesApi.md#addByEmployeeId) | **POST** /v1/employees/{employeeId}/taxes | Add Tax by EmployeeID
*EmployeeTaxesApi* | [**getByEmployeeId**](docs/EmployeeTaxesApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/taxes | Get Employee Taxes by EmployeeID
*EmployeeTaxesApi* | [**getFilingStatusByTaxCode**](docs/EmployeeTaxesApi.md#getFilingStatusByTaxCode) | **GET** /v1/employees/taxes/filingStatus/{taxCode} | Get Filing Status by Tax Code
*EmployeeTaxesApi* | [**getTaxFieldsByTaxCode**](docs/EmployeeTaxesApi.md#getTaxFieldsByTaxCode) | **GET** /v1/employees/taxes/taxFields/{taxCode} | Get Tax Fields by Tax Code
*EmployeeTaxesApi* | [**updateByEmployeeId**](docs/EmployeeTaxesApi.md#updateByEmployeeId) | **PUT** /v1/employees/{employeeId}/taxes | Update Tax by EmployeeID
*EmployeeTimeCardPunchesApi* | [**getByEmployeeId**](docs/EmployeeTimeCardPunchesApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/punches | Get Legal Entity Employees Time Card Punches by Employee ID
*EmployeeTimeCardPunchesApi* | [**getByLegalEntityId**](docs/EmployeeTimeCardPunchesApi.md#getByLegalEntityId) | **GET** /v1/legalEntities/{legalEntityId}/punches | Get Legal Entity Employees Time Card Punches by Legal Entity ID
*EmployeeTimeOffAccrualsApi* | [**getByEmployeeId**](docs/EmployeeTimeOffAccrualsApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId}/timeoffaccruals | Get Employee Accruals by EmployeeID
*EmployeeTimeOffAccrualsApi* | [**getByLegalEntityId**](docs/EmployeeTimeOffAccrualsApi.md#getByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/timeoffaccruals | Get Employee Accruals by Legal Entity ID
*EmployeesApi* | [**createNewEmployee**](docs/EmployeesApi.md#createNewEmployee) | **POST** /v1/employees | Create Employee
*EmployeesApi* | [**getByEmployeeId**](docs/EmployeesApi.md#getByEmployeeId) | **GET** /v1/employees/{employeeId} | Get Employee by EmployeeID
*EmployeesApi* | [**getIdentifyingData**](docs/EmployeesApi.md#getIdentifyingData) | **GET** /v1/legalentities/{legalEntityId}/employeesIdentifyingData | GET Identifying Employee Data by Legal Entity Id
*EmployeesApi* | [**listByLegalEntityId**](docs/EmployeesApi.md#listByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/employees | Get Employees by Legal Entity ID
*EmployeesApi* | [**listByTenantId**](docs/EmployeesApi.md#listByTenantId) | **GET** /v1/tenants/{tenantId}/employees | Get Employees By TenantID
*EmployeesApi* | [**updateContact**](docs/EmployeesApi.md#updateContact) | **PUT** /v1/employees/{employeeId} | Update Employee Contact
*EmployeesApi* | [**updatePaygroup**](docs/EmployeesApi.md#updatePaygroup) | **PUT** /v1/employees/{employeeId}/Paygroup | Update Employee Paygroup
*EmployeesApi* | [**updatePersonalData**](docs/EmployeesApi.md#updatePersonalData) | **PUT** /v1/employees/{employeeId}/identifyingdata | Update Employee Personal data
*EmployeesApi* | [**updatePositionAndStatusData**](docs/EmployeesApi.md#updatePositionAndStatusData) | **PUT** /v1/employees/{employeeId}/positionandstatus | Update Employee Position and Status data
*EmployeesApi* | [**updatePositionData**](docs/EmployeesApi.md#updatePositionData) | **PUT** /v1/employees/{employeeId}/position | Update Employee Position data
*EmployeesApi* | [**updateStatusData**](docs/EmployeesApi.md#updateStatusData) | **PUT** /v1/employees/{employeeId}/status | Update Employee Status data
*EventsApi* | [**notifyEventDetails**](docs/EventsApi.md#notifyEventDetails) | **POST** /v1/events/mockevent | Mock Event Notification
*GeneralLedgerApi* | [**getByLegalEntityId**](docs/GeneralLedgerApi.md#getByLegalEntityId) | **GET** /v1/generalledger/legalentities/{legalEntityId} | Get General Ledger by Legal Entity ID
*GeneralLedgerJobCostingApi* | [**getByLegalEntityId**](docs/GeneralLedgerJobCostingApi.md#getByLegalEntityId) | **GET** /v1/generalledger/jobcosting/legalentities/{legalEntityId} | Get General Ledger Job Costing by Legal Entity ID
*JobTitlesApi* | [**listByTenantId**](docs/JobTitlesApi.md#listByTenantId) | **GET** /v1/tenants/{tenantId}/jobtitles | Get All Job Titles by Tenant ID
*LaborCategoriesApi* | [**byLegalEntityIdGet**](docs/LaborCategoriesApi.md#byLegalEntityIdGet) | **GET** /v1/legalentities/{legalEntityId}/laborcategories | Get Labor Categories by Legal Entity ID
*LaborCodesApi* | [**addLaborCodeToLegalEntity**](docs/LaborCodesApi.md#addLaborCodeToLegalEntity) | **POST** /v1/legalentities/{legalEntityId}/laborcodes | Add Labor Code to Legal Entity
*LaborCodesApi* | [**listByLegalEntityId**](docs/LaborCodesApi.md#listByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/laborcodes | Get Labor Code By Legal Entity ID
*LaborCodesApi* | [**updateSpecifiedLaborCode**](docs/LaborCodesApi.md#updateSpecifiedLaborCode) | **PUT** /v1/legalentities/{legalEntityId}/laborcodes | Update Labor Code
*LegalEntitiesApi* | [**getById**](docs/LegalEntitiesApi.md#getById) | **GET** /v1/legalentities/{legalEntityId} | 
*LegalEntitiesApi* | [**getTenantList**](docs/LegalEntitiesApi.md#getTenantList) | **GET** /v1/legalentities/ActivatedLegalEntityTenantList | Get Legal Entities/Tenants for the user logged in
*LegalEntityActivityTypesApi* | [**getByLegalEntityId**](docs/LegalEntityActivityTypesApi.md#getByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/activitytypes | Get Legal Entity Activity Types by Legal Entity ID
*LegalEntityCertificationsApi* | [**list**](docs/LegalEntityCertificationsApi.md#list) | **GET** /v1/legalentities/{legalEntityId}/certifications | Get a list of Certifications for a Legal Entity
*LegalEntityCertificationsApi* | [**listCertificationOrganizations**](docs/LegalEntityCertificationsApi.md#listCertificationOrganizations) | **GET** /v1/legalentities/{legalEntityId}/certificationOrganizations | Get a list of Certification Organizations for a Legal Entity
*LegalEntityDeductionsApi* | [**viewEmployeesData**](docs/LegalEntityDeductionsApi.md#viewEmployeesData) | **GET** /v1/legalentities/{legalEntityId}/deductions | Get Legal Entity Deductions by Legal Entity ID
*LegalEntityDepartmentsApi* | [**createNewDepartment**](docs/LegalEntityDepartmentsApi.md#createNewDepartment) | **POST** /v1/legalentities/{legalEntityId}/departments | Create Departments by Legal Entity Id
*LegalEntityDepartmentsApi* | [**getById**](docs/LegalEntityDepartmentsApi.md#getById) | **GET** /v1/legalentities/{legalEntityId}/departments/{departmentId} | Get Legal Entity Department by Legal Entity ID and Department ID
*LegalEntityDepartmentsApi* | [**listByLegalEntityId**](docs/LegalEntityDepartmentsApi.md#listByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/departments | Get Legal Entity Departments by Legal Entity ID
*LegalEntityDepartmentsApi* | [**updateByLegalEntityId**](docs/LegalEntityDepartmentsApi.md#updateByLegalEntityId) | **PUT** /v1/legalentities/{legalEntityId}/departments | Update Legal Entity Department by Legal Entity ID
*LegalEntityEarningsApi* | [**getByLegalEntityId**](docs/LegalEntityEarningsApi.md#getByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/earnings | 
*LegalEntityJobTitlesApi* | [**listByLegalEntityId**](docs/LegalEntityJobTitlesApi.md#listByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/jobtitles | Get Job Titles by Legal Entity ID
*LegalEntityPayDataApi* | [**getPayDates**](docs/LegalEntityPayDataApi.md#getPayDates) | **GET** /v1/legalentities/{legalEntityId}/paydata | Get Legal Entity Pay Data by Legal Entity ID
*LegalEntityPayGroupsApi* | [**listByLegalEntityId**](docs/LegalEntityPayGroupsApi.md#listByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/payGroups | Get Pay Groups by Legal Entity ID
*LegalEntityPayScheduleApi* | [**getByLegalEntityAndPaygroup**](docs/LegalEntityPayScheduleApi.md#getByLegalEntityAndPaygroup) | **GET** /v1/legalentities/{legalEntityId}/payschedule | Get Legal Entity Pay Schedule by Legal Entity ID and Paygroup ID
*LegalEntityPayrollProcessingDataApi* | [**getByLegalEntity**](docs/LegalEntityPayrollProcessingDataApi.md#getByLegalEntity) | **GET** /v1/legalentities/{legalEntityId}/payrollProcessing | GET Payroll Processing Data by Legal Entity
*LegalEntityScheduleGroupsApi* | [**getByLegalEntityId**](docs/LegalEntityScheduleGroupsApi.md#getByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/schedulegroups | Get Schedules Groups for Legal Entity
*LegalEntityServicesApi* | [**getSubscribedServices**](docs/LegalEntityServicesApi.md#getSubscribedServices) | **GET** /v1/legalentities/{legalEntityId}/services | Get subscribed services for Legal Entity
*LegalEntityStatusReasonApi* | [**getList**](docs/LegalEntityStatusReasonApi.md#getList) | **GET** /v1/legalentities/{legalEntityId}/statusReasons/{statusCategory} | Get Legal Entity Status Reason values
*LegalEntityTimeDataApi* | [**getTimeOffRequestErrorLogsByTrackingId**](docs/LegalEntityTimeDataApi.md#getTimeOffRequestErrorLogsByTrackingId) | **GET** /v1/legalentities/{legalEntityId}/timeoffRequestserrorlog/{trackingId} | Get Employee Timeoff Request error logs by Legal Entity Id And Tracking Id
*LegalEntityTimeOffTypesApi* | [**viewTimeOffTypes**](docs/LegalEntityTimeOffTypesApi.md#viewTimeOffTypes) | **GET** /v1/legalentities/{legalEntityId}/timeofftypes | Get Legal Entity Time Off Types
*LegalEntityWorkLocationsApi* | [**addByLegalEntityId**](docs/LegalEntityWorkLocationsApi.md#addByLegalEntityId) | **POST** /v1/legalentities/{legalEntityId}/worklocations | Add Work Location By Legal Entity ID
*LegalEntityWorkLocationsApi* | [**deleteByLegalEntityAndWorkLocationId**](docs/LegalEntityWorkLocationsApi.md#deleteByLegalEntityAndWorkLocationId) | **DELETE** /v1/legalentities/{legalEntityId}/worklocations/{workLocationId} | Delete Work Location By Work Location ID And Legal Entity ID
*LegalEntityWorkLocationsApi* | [**getByLegalEntityAndLocation**](docs/LegalEntityWorkLocationsApi.md#getByLegalEntityAndLocation) | **GET** /v1/legalentities/{legalEntityId}/worklocations/{workLocationId} | Get a Work Location for a Legal Entity By Legal Entity ID and Work Location ID
*LegalEntityWorkLocationsApi* | [**list**](docs/LegalEntityWorkLocationsApi.md#list) | **GET** /v1/legalentities/{legalEntityId}/worklocations | Get a list of Work Locations for a Legal Entity
*LegalEntityWorkLocationsApi* | [**updateByLegalEntityId**](docs/LegalEntityWorkLocationsApi.md#updateByLegalEntityId) | **PUT** /v1/legalentities/{legalEntityId}/worklocations | Update Work Location By Legal Entity ID
*LegalEntityWorkSitesApi* | [**getByLegalEntityId**](docs/LegalEntityWorkSitesApi.md#getByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/worksites | Get Work Sites for Legal Entity
*PersonsApi* | [**getByEmployeeIdPerson**](docs/PersonsApi.md#getByEmployeeIdPerson) | **GET** /v1/employees/{employeeId}/person | Get Person by EmployeeID
*PersonsApi* | [**getByTenantAndPerson**](docs/PersonsApi.md#getByTenantAndPerson) | **GET** /v1/tenants/{tenantId}/persons/{personId} | Get Person By TenantID And PersonID
*PersonsApi* | [**listByLegalEntityId**](docs/PersonsApi.md#listByLegalEntityId) | **GET** /v1/legalEntities/{legalEntityId}/persons | Get Persons by Legal Entity ID
*PersonsApi* | [**listByTenantId**](docs/PersonsApi.md#listByTenantId) | **GET** /v1/tenants/{tenantId}/persons | Get Persons By TenantID
*TenantsApi* | [**getById**](docs/TenantsApi.md#getById) | **GET** /v1/tenants/{tenantId} | Get Tenant by TenantID
*TenantsApi* | [**getWorkLocationsByTenantId**](docs/TenantsApi.md#getWorkLocationsByTenantId) | **GET** /v1/tenants/{tenantId}/worklocations | Get Tenant Work Locations by TenantID
*TimeOffRequestsApi* | [**getTimeoffRequestById**](docs/TimeOffRequestsApi.md#getTimeoffRequestById) | **GET** /v1/legalentities/{legalEntityId}/timeoffRequests/{timeoffRequestId} | Get Employee Timeoff Request by Legal Entity Id And Timeoff Request Id
*TimeOffRequestsApi* | [**listByEmployeeId**](docs/TimeOffRequestsApi.md#listByEmployeeId) | **GET** /v1/employees/{employeeId}/timeoffrequests | Get Employee Time Off Requests by EmployeeId
*TimeOffRequestsApi* | [**listByLegalEntityId**](docs/TimeOffRequestsApi.md#listByLegalEntityId) | **GET** /v1/legalentities/{legalEntityId}/timeoffrequests | Get Employee Time Off Requests by Legal Entity Id


## Documentation for Models

 - [ATSAccount](docs/ATSAccount.md)
 - [AccountType](docs/AccountType.md)
 - [AccrualBalanceData](docs/AccrualBalanceData.md)
 - [ActivityType](docs/ActivityType.md)
 - [AddressType](docs/AddressType.md)
 - [AddressType2](docs/AddressType2.md)
 - [AdjustWithholdingType](docs/AdjustWithholdingType.md)
 - [BenefitData](docs/BenefitData.md)
 - [BusinessName](docs/BusinessName.md)
 - [BusinessNameType](docs/BusinessNameType.md)
 - [CancelOnDemandPayResult](docs/CancelOnDemandPayResult.md)
 - [CancelPayAdvances](docs/CancelPayAdvances.md)
 - [Certification](docs/Certification.md)
 - [CheckType](docs/CheckType.md)
 - [ClientDataType](docs/ClientDataType.md)
 - [Command](docs/Command.md)
 - [CorporationType](docs/CorporationType.md)
 - [CreateOrUpdateResponse](docs/CreateOrUpdateResponse.md)
 - [CustomFieldDataType](docs/CustomFieldDataType.md)
 - [DeductionType](docs/DeductionType.md)
 - [DemographicData](docs/DemographicData.md)
 - [Department](docs/Department.md)
 - [Department2](docs/Department2.md)
 - [Department3](docs/Department3.md)
 - [DepositFrequencyType](docs/DepositFrequencyType.md)
 - [DirectDepositType](docs/DirectDepositType.md)
 - [DisabilityStatus](docs/DisabilityStatus.md)
 - [EarningCodeLight](docs/EarningCodeLight.md)
 - [EarningType](docs/EarningType.md)
 - [EligibleForRehire](docs/EligibleForRehire.md)
 - [Email](docs/Email.md)
 - [EmailType](docs/EmailType.md)
 - [EmailTypeOptions](docs/EmailTypeOptions.md)
 - [EmailTypeOptions2](docs/EmailTypeOptions2.md)
 - [EmergencyContact](docs/EmergencyContact.md)
 - [EmergencyContactData](docs/EmergencyContactData.md)
 - [Employee](docs/Employee.md)
 - [Employee2](docs/Employee2.md)
 - [EmployeeAssignment](docs/EmployeeAssignment.md)
 - [EmployeeBalance](docs/EmployeeBalance.md)
 - [EmployeeCertification](docs/EmployeeCertification.md)
 - [EmployeeCertification2](docs/EmployeeCertification2.md)
 - [EmployeeContact](docs/EmployeeContact.md)
 - [EmployeeCustomField](docs/EmployeeCustomField.md)
 - [EmployeeCustomField2](docs/EmployeeCustomField2.md)
 - [EmployeeDeduction](docs/EmployeeDeduction.md)
 - [EmployeeDeduction2](docs/EmployeeDeduction2.md)
 - [EmployeeDeduction3](docs/EmployeeDeduction3.md)
 - [EmployeeDeductionAmount](docs/EmployeeDeductionAmount.md)
 - [EmployeeDeductionAmount2](docs/EmployeeDeductionAmount2.md)
 - [EmployeeDeductionAmount3](docs/EmployeeDeductionAmount3.md)
 - [EmployeeDeductionHistoryItem](docs/EmployeeDeductionHistoryItem.md)
 - [EmployeeDeductionsHistory](docs/EmployeeDeductionsHistory.md)
 - [EmployeeDirectDeposit](docs/EmployeeDirectDeposit.md)
 - [EmployeeDirectDeposit2](docs/EmployeeDirectDeposit2.md)
 - [EmployeeDirectDeposit3](docs/EmployeeDirectDeposit3.md)
 - [EmployeeEarning](docs/EmployeeEarning.md)
 - [EmployeeEarning2](docs/EmployeeEarning2.md)
 - [EmployeeEarning3](docs/EmployeeEarning3.md)
 - [EmployeeEarningAmount](docs/EmployeeEarningAmount.md)
 - [EmployeeEarningHistoryItem](docs/EmployeeEarningHistoryItem.md)
 - [EmployeeEarningsHistory](docs/EmployeeEarningsHistory.md)
 - [EmployeeEmailType](docs/EmployeeEmailType.md)
 - [EmployeeExemptions](docs/EmployeeExemptions.md)
 - [EmployeeHsaDirectDeposit](docs/EmployeeHsaDirectDeposit.md)
 - [EmployeeHsaDirectDeposit2](docs/EmployeeHsaDirectDeposit2.md)
 - [EmployeeIdentifyingData](docs/EmployeeIdentifyingData.md)
 - [EmployeeInformation](docs/EmployeeInformation.md)
 - [EmployeeList](docs/EmployeeList.md)
 - [EmployeePayRate](docs/EmployeePayRate.md)
 - [EmployeePayRate2](docs/EmployeePayRate2.md)
 - [EmployeePayRate3](docs/EmployeePayRate3.md)
 - [EmployeePayStubHistory](docs/EmployeePayStubHistory.md)
 - [EmployeePayrollHours](docs/EmployeePayrollHours.md)
 - [EmployeePosition](docs/EmployeePosition.md)
 - [EmployeePositionAndStatus](docs/EmployeePositionAndStatus.md)
 - [EmployeePositionData](docs/EmployeePositionData.md)
 - [EmployeePunch](docs/EmployeePunch.md)
 - [EmployeeRecord](docs/EmployeeRecord.md)
 - [EmployeeReturnItem](docs/EmployeeReturnItem.md)
 - [EmployeeReturnItem2](docs/EmployeeReturnItem2.md)
 - [EmployeeReturnItem2AllOf](docs/EmployeeReturnItem2AllOf.md)
 - [EmployeeReturnItemAllOf](docs/EmployeeReturnItemAllOf.md)
 - [EmployeeSchedule](docs/EmployeeSchedule.md)
 - [EmployeeSearchRequest](docs/EmployeeSearchRequest.md)
 - [EmployeeShortfallConfiguration](docs/EmployeeShortfallConfiguration.md)
 - [EmployeeStatusData](docs/EmployeeStatusData.md)
 - [EmployeeStatusData2](docs/EmployeeStatusData2.md)
 - [EmployeeStatusUpdate](docs/EmployeeStatusUpdate.md)
 - [EmployeeTax](docs/EmployeeTax.md)
 - [EmployeeTax2](docs/EmployeeTax2.md)
 - [EmployeeTax3](docs/EmployeeTax3.md)
 - [EmployeeTaxCredit](docs/EmployeeTaxCredit.md)
 - [EmployeeTaxHistoryItem](docs/EmployeeTaxHistoryItem.md)
 - [EmployeeTaxesHistory](docs/EmployeeTaxesHistory.md)
 - [EmployeeTimeCard](docs/EmployeeTimeCard.md)
 - [EmployeeTimeCard2](docs/EmployeeTimeCard2.md)
 - [EmployeeTimeOffRequest](docs/EmployeeTimeOffRequest.md)
 - [EmployeeWorkLocationData](docs/EmployeeWorkLocationData.md)
 - [EmployeesIdentifyingData](docs/EmployeesIdentifyingData.md)
 - [EmployeesSearchResult](docs/EmployeesSearchResult.md)
 - [EmploymentDateData](docs/EmploymentDateData.md)
 - [EmploymentStatus](docs/EmploymentStatus.md)
 - [EmploymentStatus2](docs/EmploymentStatus2.md)
 - [EmploymentStatus3](docs/EmploymentStatus3.md)
 - [EmploymentStatusIdentifyingData](docs/EmploymentStatusIdentifyingData.md)
 - [EmploymentType](docs/EmploymentType.md)
 - [EthnicityType](docs/EthnicityType.md)
 - [Event](docs/Event.md)
 - [ExportFileType](docs/ExportFileType.md)
 - [FilingStatus](docs/FilingStatus.md)
 - [FilingStatus2](docs/FilingStatus2.md)
 - [FlsaType](docs/FlsaType.md)
 - [Gender](docs/Gender.md)
 - [GeneralLedger](docs/GeneralLedger.md)
 - [GeneralLedgerReportType](docs/GeneralLedgerReportType.md)
 - [GenericAddress](docs/GenericAddress.md)
 - [GlobalTaxForm](docs/GlobalTaxForm.md)
 - [I9Verification](docs/I9Verification.md)
 - [I9Verification2](docs/I9Verification2.md)
 - [ImpersonatedUser](docs/ImpersonatedUser.md)
 - [ImportEarning](docs/ImportEarning.md)
 - [ImportEmployee](docs/ImportEmployee.md)
 - [ImportPayrollHours](docs/ImportPayrollHours.md)
 - [IncludeInPay](docs/IncludeInPay.md)
 - [Includes](docs/Includes.md)
 - [Includes10](docs/Includes10.md)
 - [Includes11](docs/Includes11.md)
 - [Includes12](docs/Includes12.md)
 - [Includes13](docs/Includes13.md)
 - [Includes14](docs/Includes14.md)
 - [Includes15](docs/Includes15.md)
 - [Includes16](docs/Includes16.md)
 - [Includes17](docs/Includes17.md)
 - [Includes18](docs/Includes18.md)
 - [Includes19](docs/Includes19.md)
 - [Includes2](docs/Includes2.md)
 - [Includes20](docs/Includes20.md)
 - [Includes21](docs/Includes21.md)
 - [Includes3](docs/Includes3.md)
 - [Includes4](docs/Includes4.md)
 - [Includes5](docs/Includes5.md)
 - [Includes6](docs/Includes6.md)
 - [Includes7](docs/Includes7.md)
 - [Includes8](docs/Includes8.md)
 - [Includes9](docs/Includes9.md)
 - [IncludesList](docs/IncludesList.md)
 - [Job](docs/Job.md)
 - [JobCosting](docs/JobCosting.md)
 - [JobDepartment](docs/JobDepartment.md)
 - [JobLocation](docs/JobLocation.md)
 - [JobPayRange](docs/JobPayRange.md)
 - [JobPriority](docs/JobPriority.md)
 - [JobRemoteStatus](docs/JobRemoteStatus.md)
 - [JobStatus](docs/JobStatus.md)
 - [JobUser](docs/JobUser.md)
 - [LaborCategories](docs/LaborCategories.md)
 - [LaborCode](docs/LaborCode.md)
 - [LaborCode2](docs/LaborCode2.md)
 - [LaborCode3](docs/LaborCode3.md)
 - [LaborCode4](docs/LaborCode4.md)
 - [LaborCode5](docs/LaborCode5.md)
 - [LaborCode6](docs/LaborCode6.md)
 - [LaborCodeV2](docs/LaborCodeV2.md)
 - [LegalEntity](docs/LegalEntity.md)
 - [LegalEntityAddress](docs/LegalEntityAddress.md)
 - [LegalEntityAddressType](docs/LegalEntityAddressType.md)
 - [LegalEntityDeduction](docs/LegalEntityDeduction.md)
 - [LegalEntityEarning](docs/LegalEntityEarning.md)
 - [LegalEntityPayData](docs/LegalEntityPayData.md)
 - [LegalEntityTax](docs/LegalEntityTax.md)
 - [LegalEntityTenant](docs/LegalEntityTenant.md)
 - [LegalEntityWorkLocation](docs/LegalEntityWorkLocation.md)
 - [LegalEntityWorkLocationAddress](docs/LegalEntityWorkLocationAddress.md)
 - [ListA](docs/ListA.md)
 - [ListADocument](docs/ListADocument.md)
 - [ListB](docs/ListB.md)
 - [ListBDocument](docs/ListBDocument.md)
 - [ListC](docs/ListC.md)
 - [ListCDocument](docs/ListCDocument.md)
 - [Manager](docs/Manager.md)
 - [MaritalStatus](docs/MaritalStatus.md)
 - [MilitaryData](docs/MilitaryData.md)
 - [OnDemandPayDeductionInformation](docs/OnDemandPayDeductionInformation.md)
 - [OnboardingEmployee](docs/OnboardingEmployee.md)
 - [PagedResultOfActivityType](docs/PagedResultOfActivityType.md)
 - [PagedResultOfDepartment](docs/PagedResultOfDepartment.md)
 - [PagedResultOfEmployeeBalance](docs/PagedResultOfEmployeeBalance.md)
 - [PagedResultOfEmployeeCertification](docs/PagedResultOfEmployeeCertification.md)
 - [PagedResultOfEmployeeDeduction](docs/PagedResultOfEmployeeDeduction.md)
 - [PagedResultOfEmployeeDirectDeposit](docs/PagedResultOfEmployeeDirectDeposit.md)
 - [PagedResultOfEmployeeEarning](docs/PagedResultOfEmployeeEarning.md)
 - [PagedResultOfEmployeeList](docs/PagedResultOfEmployeeList.md)
 - [PagedResultOfEmployeePayRate](docs/PagedResultOfEmployeePayRate.md)
 - [PagedResultOfEmployeePayStubHistory](docs/PagedResultOfEmployeePayStubHistory.md)
 - [PagedResultOfEmployeeReturnItem](docs/PagedResultOfEmployeeReturnItem.md)
 - [PagedResultOfEmployeeSchedule](docs/PagedResultOfEmployeeSchedule.md)
 - [PagedResultOfEmployeeTimeOffRequest](docs/PagedResultOfEmployeeTimeOffRequest.md)
 - [PagedResultOfEmployeesIdentifyingData](docs/PagedResultOfEmployeesIdentifyingData.md)
 - [PagedResultOfGeneralLedger](docs/PagedResultOfGeneralLedger.md)
 - [PagedResultOfImpersonatedUser](docs/PagedResultOfImpersonatedUser.md)
 - [PagedResultOfJob](docs/PagedResultOfJob.md)
 - [PagedResultOfJobCosting](docs/PagedResultOfJobCosting.md)
 - [PagedResultOfLaborCategories](docs/PagedResultOfLaborCategories.md)
 - [PagedResultOfLegalEntityDeduction](docs/PagedResultOfLegalEntityDeduction.md)
 - [PagedResultOfLegalEntityPayData](docs/PagedResultOfLegalEntityPayData.md)
 - [PagedResultOfLegalEntityWorkLocation](docs/PagedResultOfLegalEntityWorkLocation.md)
 - [PagedResultOfOnDemandPayDeductionInformation](docs/PagedResultOfOnDemandPayDeductionInformation.md)
 - [PagedResultOfOnboardingEmployee](docs/PagedResultOfOnboardingEmployee.md)
 - [PagedResultOfPayGroup](docs/PagedResultOfPayGroup.md)
 - [PagedResultOfPayPeriod](docs/PagedResultOfPayPeriod.md)
 - [PagedResultOfPayPeriod2](docs/PagedResultOfPayPeriod2.md)
 - [PagedResultOfPayStub](docs/PagedResultOfPayStub.md)
 - [PagedResultOfPayStub2](docs/PagedResultOfPayStub2.md)
 - [PagedResultOfPayStubFile](docs/PagedResultOfPayStubFile.md)
 - [PagedResultOfPerson](docs/PagedResultOfPerson.md)
 - [PagedResultOfPersonList](docs/PagedResultOfPersonList.md)
 - [PagedResultOfReportBuilder](docs/PagedResultOfReportBuilder.md)
 - [PagedResultOfScheduleGroup](docs/PagedResultOfScheduleGroup.md)
 - [PagedResultOfSmartlinxEmployeeMapping](docs/PagedResultOfSmartlinxEmployeeMapping.md)
 - [PagedResultOfTaxFile](docs/PagedResultOfTaxFile.md)
 - [PagedResultOfTemplateCustomParameter](docs/PagedResultOfTemplateCustomParameter.md)
 - [PagedResultOfTenantCertificationOrganization](docs/PagedResultOfTenantCertificationOrganization.md)
 - [PagedResultOfTenantJobTitle](docs/PagedResultOfTenantJobTitle.md)
 - [PagedResultOfTenantWorkLocation](docs/PagedResultOfTenantWorkLocation.md)
 - [PagedResultOfTimeCardV3](docs/PagedResultOfTimeCardV3.md)
 - [PagedResultOfTimeCardv2](docs/PagedResultOfTimeCardv2.md)
 - [PagedResultOfTimeOffType](docs/PagedResultOfTimeOffType.md)
 - [PagedResultOfWorkSite](docs/PagedResultOfWorkSite.md)
 - [PayAdvance](docs/PayAdvance.md)
 - [PayAdvance2](docs/PayAdvance2.md)
 - [PayFrequency](docs/PayFrequency.md)
 - [PayGroup](docs/PayGroup.md)
 - [PayPeriod](docs/PayPeriod.md)
 - [PayPeriod2](docs/PayPeriod2.md)
 - [PayStub](docs/PayStub.md)
 - [PayStub2](docs/PayStub2.md)
 - [PayStubDeduction](docs/PayStubDeduction.md)
 - [PayStubDeduction2](docs/PayStubDeduction2.md)
 - [PayStubDeductionItem](docs/PayStubDeductionItem.md)
 - [PayStubDeductionItem2](docs/PayStubDeductionItem2.md)
 - [PayStubEarning](docs/PayStubEarning.md)
 - [PayStubEarning2](docs/PayStubEarning2.md)
 - [PayStubEarningItem](docs/PayStubEarningItem.md)
 - [PayStubEarningItem2](docs/PayStubEarningItem2.md)
 - [PayStubFile](docs/PayStubFile.md)
 - [PayStubTax](docs/PayStubTax.md)
 - [PayStubTax2](docs/PayStubTax2.md)
 - [PayStubTaxItem](docs/PayStubTaxItem.md)
 - [PayStubTaxItem2](docs/PayStubTaxItem2.md)
 - [PayType](docs/PayType.md)
 - [PayrollStatus](docs/PayrollStatus.md)
 - [PayrunAccrualData](docs/PayrunAccrualData.md)
 - [Person](docs/Person.md)
 - [PersonAddress](docs/PersonAddress.md)
 - [PersonEmail](docs/PersonEmail.md)
 - [PersonEmailAllOf](docs/PersonEmailAllOf.md)
 - [PersonEmailType](docs/PersonEmailType.md)
 - [PersonList](docs/PersonList.md)
 - [Phone](docs/Phone.md)
 - [PhoneNumberType](docs/PhoneNumberType.md)
 - [PhoneType](docs/PhoneType.md)
 - [Prefix](docs/Prefix.md)
 - [ProductivityType](docs/ProductivityType.md)
 - [PunchStatusType](docs/PunchStatusType.md)
 - [ReciprocityType](docs/ReciprocityType.md)
 - [RefreshToken](docs/RefreshToken.md)
 - [Relationship](docs/Relationship.md)
 - [ReportBuilder](docs/ReportBuilder.md)
 - [ReportCustomParameter](docs/ReportCustomParameter.md)
 - [ReportFieldType](docs/ReportFieldType.md)
 - [ResourceReference](docs/ResourceReference.md)
 - [Schedule](docs/Schedule.md)
 - [Schedule2](docs/Schedule2.md)
 - [ScheduleGroup](docs/ScheduleGroup.md)
 - [Services](docs/Services.md)
 - [SimpleHire](docs/SimpleHire.md)
 - [SimplifiedClientField](docs/SimplifiedClientField.md)
 - [SmartlinxEmployeeMapping](docs/SmartlinxEmployeeMapping.md)
 - [SocialMediaData](docs/SocialMediaData.md)
 - [SocialMediaType](docs/SocialMediaType.md)
 - [StatusCategory](docs/StatusCategory.md)
 - [StatusCategory2](docs/StatusCategory2.md)
 - [StatusReason](docs/StatusReason.md)
 - [Suffix](docs/Suffix.md)
 - [TaxFile](docs/TaxFile.md)
 - [TaxType](docs/TaxType.md)
 - [TemplateCustomParameter](docs/TemplateCustomParameter.md)
 - [Tenant](docs/Tenant.md)
 - [TenantCertification](docs/TenantCertification.md)
 - [TenantCertificationOrganization](docs/TenantCertificationOrganization.md)
 - [TenantJobTitle](docs/TenantJobTitle.md)
 - [TenantWorkLocation](docs/TenantWorkLocation.md)
 - [TimeCard](docs/TimeCard.md)
 - [TimeCardData](docs/TimeCardData.md)
 - [TimeCardV3](docs/TimeCardV3.md)
 - [TimeCardv2](docs/TimeCardv2.md)
 - [TimeCardv2AllOf](docs/TimeCardv2AllOf.md)
 - [TimeOffRequestDay](docs/TimeOffRequestDay.md)
 - [TimeOffRequestsErrorLog](docs/TimeOffRequestsErrorLog.md)
 - [TimeOffType](docs/TimeOffType.md)
 - [TypeBalance](docs/TypeBalance.md)
 - [UserInfo](docs/UserInfo.md)
 - [VeteranStatus](docs/VeteranStatus.md)
 - [WorkEligibility](docs/WorkEligibility.md)
 - [WorkEmailExample](docs/WorkEmailExample.md)
 - [WorkEmailExample2](docs/WorkEmailExample2.md)
 - [WorkEmailExampleAllOf](docs/WorkEmailExampleAllOf.md)
 - [WorkLocation](docs/WorkLocation.md)
 - [WorkLocation2](docs/WorkLocation2.md)
 - [WorkLocationAddress](docs/WorkLocationAddress.md)
 - [WorkLocationAddressType](docs/WorkLocationAddressType.md)
 - [WorkLocationAddressType2](docs/WorkLocationAddressType2.md)
 - [WorkLocationAddressUpdate](docs/WorkLocationAddressUpdate.md)
 - [WorkLocationPhone](docs/WorkLocationPhone.md)
 - [WorkLocationPhoneAllOf](docs/WorkLocationPhoneAllOf.md)
 - [WorkLocationPhoneNumber](docs/WorkLocationPhoneNumber.md)
 - [WorkLocationPhoneType](docs/WorkLocationPhoneType.md)
 - [WorkSite](docs/WorkSite.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
