/*
 * Paycor Public API
 *  Welcome to Paycor's Public API! This document is a reference for the APIs Paycor has available, and acts as a complement to the \"Guides\" section.   # Getting Started  <strong>To learn more about getting started with Paycor's Public APIs, check out our <a href=\"/guides\">Guides.</a></strong>  # GET, PUT, POST  * When requesting object, use GET endpoints. All list endpoints support paging, as described [in the other doc].  * When creating an object, use POST endpoints. Your code will need to create an object and send it to Paycor in your API call request body as JSON. You can use the \"request sample\" body as a starting point. Our endpoints will return a reference to the created object (the ID and GET API URL) for your system. * When updating an object, you will use PUT endpoints. The general flow would be to: GET the object you want to update, modify the fields as desired, then PUT the object (as JSON in the request body) to our endpoints. Some fields like the object's ID cannot be updated because they are system-set.'   # Error Handling  * 400: Please consult the response text to correct your request information.  * 401 with response \"Access denied due to missing subscription key\": Please include your APIM Subscription Key as header Ocp-Apim-Subscription-Key or querystring parameter subscription-key.  * 401 with no response: Please ensure you included a valid & current Access Token in the Authorization header. * 403: Please ensure your Access Token's scope has all the relevant access you need, on the AppCreator Data Access screen.  * 404: Please validate the API route you are using. If that is correct, one of your IDs most likely does not exist or is not in a valid state.  * 429: Paycor implements rate limits for our Public API. Each customer (implemented via APIM subscription key) has a limited number of calls. The number of calls is counted across all APIs, not per individual API. Please use bulk endpoints where available and spread your calls over a wider timespan.   * The default rate limit is up to 1000 API calls per minute (total across all our Public APIs).  * 500: Please contact Paycor. When you make a POST or PUT call and receive a 500, please do not retry the call automatically - this may result in double-posting. GETs can be safely retried.   # IDs  * ClientId = LegalEntityId * TenantId = CompanyId * EmployeeId is not visible in Paycor's UI, you must retrieve it from the Public API  # Earnings, Deductions, Taxes  This section describes the domain model for Paycor's Earnings, Deductions, and Taxes. This will provide background for many paydata-related Public API endpoints.   Paycor stores Earnings, Deductions, and Taxes each at three levels: * Global: Same data across all legal entities. Setup by Paycor for customers to choose from. Sample Codes (note these will not be setup on every Legal Entity):   * Earnings: REG, OT   * Taxes: FITWH, SOC, SOCER, OHCIN   * Deductions: 401k, KMat, H125, UWay * Legal Entity or Tenant: Codes setup &amp; customized on the legal entity or Tenant level. Must be tied to a Global Code.    * Perform UI allows creating Deduction and Earning codes on Tenant level (under Configure Company nav menu). These will be returned by the Legal Entity Public API endpoints.  * Employee: codes setup on a particular employee, tied to a Legal Entity-level or Tenant-level code   * Employee Earnings/Deductions/Taxes are applied during payroll. Many properties are inherited from the Legal Entity or Global levels, but some can be overridden.   # Authentication  <!-- ReDoc-Inject: <security-definitions> -->
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CreateOrUpdateResponse;
import com.konfigthis.client.model.EmployeeDeduction;
import com.konfigthis.client.model.EmployeeDeduction2;
import com.konfigthis.client.model.EmployeeDeduction3;
import com.konfigthis.client.model.EmployeeDeductionAmount2;
import com.konfigthis.client.model.EmployeeDeductionAmount3;
import com.konfigthis.client.model.IncludeInPay;
import com.konfigthis.client.model.Includes3;
import com.konfigthis.client.model.Includes4;
import com.konfigthis.client.model.PagedResultOfEmployeeDeduction;
import com.konfigthis.client.model.PayFrequency;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmployeeDeductionsApi
 */
@Disabled
public class EmployeeDeductionsApiTest {

    private static EmployeeDeductionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EmployeeDeductionsApi(apiClient);
    }

    /**
     * Add Deduction to Employee
     *
     * Tip: first call \&quot;Get Legal Entity Deductions by Legal Entity ID\&quot; to get the valid Deduction Codes  Data Access: Add Employee Deduction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addDeductionToEmployeeTest() throws ApiException {
        String code = null;
        String employeeId = null;
        Boolean onHold = null;
        PayFrequency frequency = null;
        IncludeInPay includeInPay = null;
        List<EmployeeDeductionAmount2> amountData = null;
        List<CreateOrUpdateResponse> response = api.addDeductionToEmployee(code, employeeId)
                .onHold(onHold)
                .frequency(frequency)
                .includeInPay(includeInPay)
                .amountData(amountData)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Employee Deductions by EmployeeID
     *
     * Data Access: View Employee Deductions Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByEmployeeIdTest() throws ApiException {
        String employeeId = null;
        List<Includes4> include = null;
        String continuationToken = null;
        PagedResultOfEmployeeDeduction response = api.getByEmployeeId(employeeId)
                .include(include)
                .continuationToken(continuationToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Employee Deduction by EmployeeID and EmployeeDeductionID
     *
     * Data Access: View Employee Deduction Information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByEmployeeIdAndDeductionIdTest() throws ApiException {
        String employeeId = null;
        String employeeDeductionId = null;
        List<Includes3> include = null;
        EmployeeDeduction response = api.getByEmployeeIdAndDeductionId(employeeId, employeeDeductionId)
                .include(include)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Employee Deduction by EmployeeID
     *
     * Data Access: Update Employee Deduction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByEmployeeIdTest() throws ApiException {
        String id = null;
        String employeeId = null;
        IncludeInPay includeInPay = null;
        PayFrequency frequency = null;
        Boolean onHold = null;
        List<EmployeeDeductionAmount3> amountData = null;
        CreateOrUpdateResponse response = api.updateByEmployeeId(id, employeeId)
                .includeInPay(includeInPay)
                .frequency(frequency)
                .onHold(onHold)
                .amountData(amountData)
                .execute();
        // TODO: test validations
    }

}
