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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.GeneralLedgerReportType;
import com.konfigthis.client.model.Includes17;
import com.konfigthis.client.model.PagedResultOfGeneralLedger;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class GeneralLedgerApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GeneralLedgerApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public GeneralLedgerApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getByLegalEntityIdCall(Integer legalEntityId, String plannerId, GeneralLedgerReportType reportType, List<Includes17> include, String continuationToken, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/generalledger/legalentities/{legalEntityId}"
            .replace("{" + "legalEntityId" + "}", localVarApiClient.escapeString(legalEntityId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (plannerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("plannerId", plannerId));
        }

        if (reportType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reportType", reportType));
        }

        if (include != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "include", include));
        }

        if (continuationToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("continuationToken", continuationToken));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Access-Token", "Apim-Subscription-Key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getByLegalEntityIdValidateBeforeCall(Integer legalEntityId, String plannerId, GeneralLedgerReportType reportType, List<Includes17> include, String continuationToken, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'legalEntityId' is set
        if (legalEntityId == null) {
            throw new ApiException("Missing the required parameter 'legalEntityId' when calling getByLegalEntityId(Async)");
        }

        return getByLegalEntityIdCall(legalEntityId, plannerId, reportType, include, continuationToken, _callback);

    }


    private ApiResponse<PagedResultOfGeneralLedger> getByLegalEntityIdWithHttpInfo(Integer legalEntityId, String plannerId, GeneralLedgerReportType reportType, List<Includes17> include, String continuationToken) throws ApiException {
        okhttp3.Call localVarCall = getByLegalEntityIdValidateBeforeCall(legalEntityId, plannerId, reportType, include, continuationToken, null);
        Type localVarReturnType = new TypeToken<PagedResultOfGeneralLedger>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByLegalEntityIdAsync(Integer legalEntityId, String plannerId, GeneralLedgerReportType reportType, List<Includes17> include, String continuationToken, final ApiCallback<PagedResultOfGeneralLedger> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByLegalEntityIdValidateBeforeCall(legalEntityId, plannerId, reportType, include, continuationToken, _callback);
        Type localVarReturnType = new TypeToken<PagedResultOfGeneralLedger>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByLegalEntityIdRequestBuilder {
        private final Integer legalEntityId;
        private String plannerId;
        private GeneralLedgerReportType reportType;
        private List<Includes17> include;
        private String continuationToken;

        private GetByLegalEntityIdRequestBuilder(Integer legalEntityId) {
            this.legalEntityId = legalEntityId;
        }

        /**
         * Set plannerId
         * @param plannerId ID of planner, required if report type is regular (optional)
         * @return GetByLegalEntityIdRequestBuilder
         */
        public GetByLegalEntityIdRequestBuilder plannerId(String plannerId) {
            this.plannerId = plannerId;
            return this;
        }
        
        /**
         * Set reportType
         * @param reportType Type of General Ledger, Regular or Setup  (optional)
         * @return GetByLegalEntityIdRequestBuilder
         */
        public GetByLegalEntityIdRequestBuilder reportType(GeneralLedgerReportType reportType) {
            this.reportType = reportType;
            return this;
        }
        
        /**
         * Set include
         * @param include Options to include more data: EmployeeData (optional)
         * @return GetByLegalEntityIdRequestBuilder
         */
        public GetByLegalEntityIdRequestBuilder include(List<Includes17> include) {
            this.include = include;
            return this;
        }
        
        /**
         * Set continuationToken
         * @param continuationToken Token to get next set of General Ledger records (optional)
         * @return GetByLegalEntityIdRequestBuilder
         */
        public GetByLegalEntityIdRequestBuilder continuationToken(String continuationToken) {
            this.continuationToken = continuationToken;
            return this;
        }
        
        /**
         * Build call for getByLegalEntityId
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a paged list of General Ledger items. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getByLegalEntityIdCall(legalEntityId, plannerId, reportType, include, continuationToken, _callback);
        }


        /**
         * Execute getByLegalEntityId request
         * @return PagedResultOfGeneralLedger
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a paged list of General Ledger items. </td><td>  -  </td></tr>
         </table>
         */
        public PagedResultOfGeneralLedger execute() throws ApiException {
            ApiResponse<PagedResultOfGeneralLedger> localVarResp = getByLegalEntityIdWithHttpInfo(legalEntityId, plannerId, reportType, include, continuationToken);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getByLegalEntityId request with HTTP info returned
         * @return ApiResponse&lt;PagedResultOfGeneralLedger&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a paged list of General Ledger items. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PagedResultOfGeneralLedger> executeWithHttpInfo() throws ApiException {
            return getByLegalEntityIdWithHttpInfo(legalEntityId, plannerId, reportType, include, continuationToken);
        }

        /**
         * Execute getByLegalEntityId request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a paged list of General Ledger items. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PagedResultOfGeneralLedger> _callback) throws ApiException {
            return getByLegalEntityIdAsync(legalEntityId, plannerId, reportType, include, continuationToken, _callback);
        }
    }

    /**
     * Get General Ledger by Legal Entity ID
     * * Type of report can be Regular or Setup     * Setup report returns only department number, company department number, account name, account number, itemize, and sort sequence all other values are set to null.     * Regular report returns all data.  * Planner id is required if report type is set to regular  Data Access: View General Ledger
     * @param legalEntityId ID of the legal entity for which you want to get the general ledger items (required)
     * @return GetByLegalEntityIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a paged list of General Ledger items. </td><td>  -  </td></tr>
     </table>
     */
    public GetByLegalEntityIdRequestBuilder getByLegalEntityId(Integer legalEntityId) throws IllegalArgumentException {
        if (legalEntityId == null) throw new IllegalArgumentException("\"legalEntityId\" is required but got null");
        return new GetByLegalEntityIdRequestBuilder(legalEntityId);
    }
}
