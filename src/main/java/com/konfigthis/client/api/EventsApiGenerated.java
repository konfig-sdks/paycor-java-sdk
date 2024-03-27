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


import com.konfigthis.client.model.Command;
import com.konfigthis.client.model.Event;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EventsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EventsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public EventsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call notifyEventDetailsCall(Command command, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = command;

        // create path and map variables
        String localVarPath = "/v1/events/mockevent";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Access-Token", "Apim-Subscription-Key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call notifyEventDetailsValidateBeforeCall(Command command, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'command' is set
        if (command == null) {
            throw new ApiException("Missing the required parameter 'command' when calling notifyEventDetails(Async)");
        }

        return notifyEventDetailsCall(command, _callback);

    }


    private ApiResponse<Event> notifyEventDetailsWithHttpInfo(Command command) throws ApiException {
        okhttp3.Call localVarCall = notifyEventDetailsValidateBeforeCall(command, null);
        Type localVarReturnType = new TypeToken<Event>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call notifyEventDetailsAsync(Command command, final ApiCallback<Event> _callback) throws ApiException {

        okhttp3.Call localVarCall = notifyEventDetailsValidateBeforeCall(command, _callback);
        Type localVarReturnType = new TypeToken<Event>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class NotifyEventDetailsRequestBuilder {
        private final String applicationId;
        private final String notificationURL;
        private final String notificationSecret;
        private final String eventType;
        private final Integer tenantId;
        private String itemId;
        private Integer legalEntityId;

        private NotifyEventDetailsRequestBuilder(String applicationId, String notificationURL, String notificationSecret, String eventType, Integer tenantId) {
            this.applicationId = applicationId;
            this.notificationURL = notificationURL;
            this.notificationSecret = notificationSecret;
            this.eventType = eventType;
            this.tenantId = tenantId;
        }

        /**
         * Set itemId
         * @param itemId Unique Identifier of the Resource change for the Event that is triggered by Paycor.              (optional)
         * @return NotifyEventDetailsRequestBuilder
         */
        public NotifyEventDetailsRequestBuilder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        
        /**
         * Set legalEntityId
         * @param legalEntityId Unique Identifier of the Legal Entity in Paycor&#39;s system.              (optional)
         * @return NotifyEventDetailsRequestBuilder
         */
        public NotifyEventDetailsRequestBuilder legalEntityId(Integer legalEntityId) {
            this.legalEntityId = legalEntityId;
            return this;
        }
        
        /**
         * Build call for notifyEventDetails
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Returns the Event Notification Object that will be triggered by Paycor. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            Command command = buildBodyParams();
            return notifyEventDetailsCall(command, _callback);
        }

        private Command buildBodyParams() {
            Command command = new Command();
            command.applicationId(this.applicationId);
            command.notificationURL(this.notificationURL);
            command.notificationSecret(this.notificationSecret);
            command.eventType(this.eventType);
            command.itemId(this.itemId);
            command.legalEntityId(this.legalEntityId);
            command.tenantId(this.tenantId);
            return command;
        }

        /**
         * Execute notifyEventDetails request
         * @return Event
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Returns the Event Notification Object that will be triggered by Paycor. </td><td>  -  </td></tr>
         </table>
         */
        public Event execute() throws ApiException {
            Command command = buildBodyParams();
            ApiResponse<Event> localVarResp = notifyEventDetailsWithHttpInfo(command);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute notifyEventDetails request with HTTP info returned
         * @return ApiResponse&lt;Event&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Returns the Event Notification Object that will be triggered by Paycor. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Event> executeWithHttpInfo() throws ApiException {
            Command command = buildBodyParams();
            return notifyEventDetailsWithHttpInfo(command);
        }

        /**
         * Execute notifyEventDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Returns the Event Notification Object that will be triggered by Paycor. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Event> _callback) throws ApiException {
            Command command = buildBodyParams();
            return notifyEventDetailsAsync(command, _callback);
        }
    }

    /**
     * Mock Event Notification
     * Following body attributes are optionally required: * ItemId is required when EventType is Employee.Modified * LegalEntityId is required when EventType is LegalEntity.Modified
     * @param command Mock Event that user wants to trigger. (required)
     * @return NotifyEventDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the Event Notification Object that will be triggered by Paycor. </td><td>  -  </td></tr>
     </table>
     */
    public NotifyEventDetailsRequestBuilder notifyEventDetails(String applicationId, String notificationURL, String notificationSecret, String eventType, Integer tenantId) throws IllegalArgumentException {
        if (applicationId == null) throw new IllegalArgumentException("\"applicationId\" is required but got null");
            if (applicationId != null && applicationId.length() < 1) {
              throw new IllegalArgumentException("Invalid value for applicationId. Length must be greater than or equal to 1.");
            }

        if (notificationURL == null) throw new IllegalArgumentException("\"notificationURL\" is required but got null");
            if (notificationURL != null && notificationURL.length() < 1) {
              throw new IllegalArgumentException("Invalid value for notificationURL. Length must be greater than or equal to 1.");
            }

        if (notificationSecret == null) throw new IllegalArgumentException("\"notificationSecret\" is required but got null");
            if (notificationSecret != null && notificationSecret.length() < 1) {
              throw new IllegalArgumentException("Invalid value for notificationSecret. Length must be greater than or equal to 1.");
            }

        if (eventType == null) throw new IllegalArgumentException("\"eventType\" is required but got null");
            if (eventType != null && eventType.length() < 1) {
              throw new IllegalArgumentException("Invalid value for eventType. Length must be greater than or equal to 1.");
            }

        if (tenantId == null) throw new IllegalArgumentException("\"tenantId\" is required but got null");
        return new NotifyEventDetailsRequestBuilder(applicationId, notificationURL, notificationSecret, eventType, tenantId);
    }
}
