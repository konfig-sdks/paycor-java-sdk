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


import com.konfigthis.client.model.Services;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class LegalEntityServicesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LegalEntityServicesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public LegalEntityServicesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getSubscribedServicesCall(Integer legalEntityId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/legalentities/{legalEntityId}/services"
            .replace("{" + "legalEntityId" + "}", localVarApiClient.escapeString(legalEntityId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getSubscribedServicesValidateBeforeCall(Integer legalEntityId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'legalEntityId' is set
        if (legalEntityId == null) {
            throw new ApiException("Missing the required parameter 'legalEntityId' when calling getSubscribedServices(Async)");
        }

        return getSubscribedServicesCall(legalEntityId, _callback);

    }


    private ApiResponse<Services> getSubscribedServicesWithHttpInfo(Integer legalEntityId) throws ApiException {
        okhttp3.Call localVarCall = getSubscribedServicesValidateBeforeCall(legalEntityId, null);
        Type localVarReturnType = new TypeToken<Services>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSubscribedServicesAsync(Integer legalEntityId, final ApiCallback<Services> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSubscribedServicesValidateBeforeCall(legalEntityId, _callback);
        Type localVarReturnType = new TypeToken<Services>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSubscribedServicesRequestBuilder {
        private final Integer legalEntityId;

        private GetSubscribedServicesRequestBuilder(Integer legalEntityId) {
            this.legalEntityId = legalEntityId;
        }

        /**
         * Build call for getSubscribedServices
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A listing of services for the specified Legal Entity </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSubscribedServicesCall(legalEntityId, _callback);
        }


        /**
         * Execute getSubscribedServices request
         * @return Services
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A listing of services for the specified Legal Entity </td><td>  -  </td></tr>
         </table>
         */
        public Services execute() throws ApiException {
            ApiResponse<Services> localVarResp = getSubscribedServicesWithHttpInfo(legalEntityId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSubscribedServices request with HTTP info returned
         * @return ApiResponse&lt;Services&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A listing of services for the specified Legal Entity </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Services> executeWithHttpInfo() throws ApiException {
            return getSubscribedServicesWithHttpInfo(legalEntityId);
        }

        /**
         * Execute getSubscribedServices request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A listing of services for the specified Legal Entity </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Services> _callback) throws ApiException {
            return getSubscribedServicesAsync(legalEntityId, _callback);
        }
    }

    /**
     * Get subscribed services for Legal Entity
     * Data Access: View Legal Entity Services
     * @param legalEntityId ID of the Legal Entity you want to get (synonymous to Paycor&#39;s ClientID) (required)
     * @return GetSubscribedServicesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A listing of services for the specified Legal Entity </td><td>  -  </td></tr>
     </table>
     */
    public GetSubscribedServicesRequestBuilder getSubscribedServices(Integer legalEntityId) throws IllegalArgumentException {
        if (legalEntityId == null) throw new IllegalArgumentException("\"legalEntityId\" is required but got null");
        return new GetSubscribedServicesRequestBuilder(legalEntityId);
    }
}
