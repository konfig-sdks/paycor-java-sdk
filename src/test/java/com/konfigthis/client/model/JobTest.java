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


package com.konfigthis.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.JobDepartment;
import com.konfigthis.client.model.JobLocation;
import com.konfigthis.client.model.JobPayRange;
import com.konfigthis.client.model.JobPriority;
import com.konfigthis.client.model.JobRemoteStatus;
import com.konfigthis.client.model.JobStatus;
import com.konfigthis.client.model.JobUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for Job
 */
public class JobTest {
    private final Job model = new Job();

    /**
     * Model tests for Job
     */
    @Test
    public void testJob() {
        // TODO: test Job
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'atSAccountId'
     */
    @Test
    public void atSAccountIdTest() {
        // TODO: test atSAccountId
    }

    /**
     * Test the property 'number'
     */
    @Test
    public void numberTest() {
        // TODO: test number
    }

    /**
     * Test the property 'title'
     */
    @Test
    public void titleTest() {
        // TODO: test title
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'openings'
     */
    @Test
    public void openingsTest() {
        // TODO: test openings
    }

    /**
     * Test the property 'priority'
     */
    @Test
    public void priorityTest() {
        // TODO: test priority
    }

    /**
     * Test the property 'confidential'
     */
    @Test
    public void confidentialTest() {
        // TODO: test confidential
    }

    /**
     * Test the property 'internal'
     */
    @Test
    public void internalTest() {
        // TODO: test internal
    }

    /**
     * Test the property 'timeToFill'
     */
    @Test
    public void timeToFillTest() {
        // TODO: test timeToFill
    }

    /**
     * Test the property 'remoteStatus'
     */
    @Test
    public void remoteStatusTest() {
        // TODO: test remoteStatus
    }

    /**
     * Test the property 'eeoCategory'
     */
    @Test
    public void eeoCategoryTest() {
        // TODO: test eeoCategory
    }

    /**
     * Test the property 'payRange'
     */
    @Test
    public void payRangeTest() {
        // TODO: test payRange
    }

    /**
     * Test the property 'atSLocation'
     */
    @Test
    public void atSLocationTest() {
        // TODO: test atSLocation
    }

    /**
     * Test the property 'atSDepartment'
     */
    @Test
    public void atSDepartmentTest() {
        // TODO: test atSDepartment
    }

    /**
     * Test the property 'hiringManagers'
     */
    @Test
    public void hiringManagersTest() {
        // TODO: test hiringManagers
    }

    /**
     * Test the property 'recruiters'
     */
    @Test
    public void recruitersTest() {
        // TODO: test recruiters
    }

    /**
     * Test the property 'teamMembers'
     */
    @Test
    public void teamMembersTest() {
        // TODO: test teamMembers
    }

    /**
     * Test the property 'executives'
     */
    @Test
    public void executivesTest() {
        // TODO: test executives
    }

    /**
     * Test the property 'activatedDate'
     */
    @Test
    public void activatedDateTest() {
        // TODO: test activatedDate
    }

    /**
     * Test the property 'createdDate'
     */
    @Test
    public void createdDateTest() {
        // TODO: test createdDate
    }

    /**
     * Test the property 'modifiedDate'
     */
    @Test
    public void modifiedDateTest() {
        // TODO: test modifiedDate
    }

    /**
     * Test the property 'postedToCareers'
     */
    @Test
    public void postedToCareersTest() {
        // TODO: test postedToCareers
    }

    /**
     * Test the property 'postedToIndeed'
     */
    @Test
    public void postedToIndeedTest() {
        // TODO: test postedToIndeed
    }

    /**
     * Test the property 'postedToSmartSourcing'
     */
    @Test
    public void postedToSmartSourcingTest() {
        // TODO: test postedToSmartSourcing
    }

    /**
     * Test the property 'postedToLinkedIn'
     */
    @Test
    public void postedToLinkedInTest() {
        // TODO: test postedToLinkedIn
    }

    /**
     * Test the property 'postedToZipRecruiter'
     */
    @Test
    public void postedToZipRecruiterTest() {
        // TODO: test postedToZipRecruiter
    }

    /**
     * Test the property 'postedToGravity'
     */
    @Test
    public void postedToGravityTest() {
        // TODO: test postedToGravity
    }

}
