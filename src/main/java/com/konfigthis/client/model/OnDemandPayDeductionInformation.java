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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.EmployeeStatusData2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * The On Demand Pay Deduction represents Employee level Deduction Information. Provides link to the associated Employee information.             
 */
@ApiModel(description = "The On Demand Pay Deduction represents Employee level Deduction Information. Provides link to the associated Employee information.             ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OnDemandPayDeductionInformation {
  public static final String SERIALIZED_NAME_LEGAL_ENTITY_ID = "LegalEntityId";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_ID)
  private Integer legalEntityId;

  public static final String SERIALIZED_NAME_CHECK_DATE = "CheckDate";
  @SerializedName(SERIALIZED_NAME_CHECK_DATE)
  private OffsetDateTime checkDate;

  public static final String SERIALIZED_NAME_PAY_IMPORT_ID = "PayImportId";
  @SerializedName(SERIALIZED_NAME_PAY_IMPORT_ID)
  private Integer payImportId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "EmployeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "EmployeeNumber";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  private Integer employeeNumber;

  public static final String SERIALIZED_NAME_EMPLOYEE_NAME = "EmployeeName";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NAME)
  private String employeeName;

  public static final String SERIALIZED_NAME_EMPLOYEE_STATUS = "EmployeeStatus";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_STATUS)
  private EmployeeStatusData2 employeeStatus;

  public static final String SERIALIZED_NAME_WAS_EMPLOYEE_PAID = "WasEmployeePaid";
  @SerializedName(SERIALIZED_NAME_WAS_EMPLOYEE_PAID)
  private Boolean wasEmployeePaid;

  public static final String SERIALIZED_NAME_RECEIVED_AMOUNT = "ReceivedAmount";
  @SerializedName(SERIALIZED_NAME_RECEIVED_AMOUNT)
  private Double receivedAmount;

  public static final String SERIALIZED_NAME_PAID_AMOUNT = "PaidAmount";
  @SerializedName(SERIALIZED_NAME_PAID_AMOUNT)
  private Double paidAmount;

  public static final String SERIALIZED_NAME_SHORTFALL_AMOUNT = "ShortfallAmount";
  @SerializedName(SERIALIZED_NAME_SHORTFALL_AMOUNT)
  private Double shortfallAmount;

  public static final String SERIALIZED_NAME_PAYRUN_STATUS = "PayrunStatus";
  @SerializedName(SERIALIZED_NAME_PAYRUN_STATUS)
  private String payrunStatus;

  public static final String SERIALIZED_NAME_PAYRUN_PROCESS_DATE = "PayrunProcessDate";
  @SerializedName(SERIALIZED_NAME_PAYRUN_PROCESS_DATE)
  private OffsetDateTime payrunProcessDate;

  public static final String SERIALIZED_NAME_PERIOD_START_DATE = "PeriodStartDate";
  @SerializedName(SERIALIZED_NAME_PERIOD_START_DATE)
  private OffsetDateTime periodStartDate;

  public static final String SERIALIZED_NAME_PERIOD_END_DATE = "PeriodEndDate";
  @SerializedName(SERIALIZED_NAME_PERIOD_END_DATE)
  private OffsetDateTime periodEndDate;

  public static final String SERIALIZED_NAME_IMPOUND_PROCESS_DATE = "ImpoundProcessDate";
  @SerializedName(SERIALIZED_NAME_IMPOUND_PROCESS_DATE)
  private OffsetDateTime impoundProcessDate;

  public static final String SERIALIZED_NAME_IMPOUND_REFERENCE_ID = "ImpoundReferenceId";
  @SerializedName(SERIALIZED_NAME_IMPOUND_REFERENCE_ID)
  private String impoundReferenceId;

  public static final String SERIALIZED_NAME_IMPOUNDED_AMOUNT = "ImpoundedAmount";
  @SerializedName(SERIALIZED_NAME_IMPOUNDED_AMOUNT)
  private Double impoundedAmount;

  public static final String SERIALIZED_NAME_IS_CLIENT_ACTIVE = "IsClientActive";
  @SerializedName(SERIALIZED_NAME_IS_CLIENT_ACTIVE)
  private Boolean isClientActive;

  public OnDemandPayDeductionInformation() {
  }

  public OnDemandPayDeductionInformation legalEntityId(Integer legalEntityId) {
    
    
    
    
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * Unique identifier of the Legal Entity in Paycor&#39;s system.
   * @return legalEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100289", value = "Unique identifier of the Legal Entity in Paycor's system.")

  public Integer getLegalEntityId() {
    return legalEntityId;
  }


  public void setLegalEntityId(Integer legalEntityId) {
    
    
    
    this.legalEntityId = legalEntityId;
  }


  public OnDemandPayDeductionInformation checkDate(OffsetDateTime checkDate) {
    
    
    
    
    this.checkDate = checkDate;
    return this;
  }

   /**
   * Flag that shows information of date of paycheck.
   * @return checkDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag that shows information of date of paycheck.")

  public OffsetDateTime getCheckDate() {
    return checkDate;
  }


  public void setCheckDate(OffsetDateTime checkDate) {
    
    
    
    this.checkDate = checkDate;
  }


  public OnDemandPayDeductionInformation payImportId(Integer payImportId) {
    
    
    
    
    this.payImportId = payImportId;
    return this;
  }

   /**
   * Unique identifier of import pay.             
   * @return payImportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "Unique identifier of import pay.             ")

  public Integer getPayImportId() {
    return payImportId;
  }


  public void setPayImportId(Integer payImportId) {
    
    
    
    this.payImportId = payImportId;
  }


  public OnDemandPayDeductionInformation employeeId(String employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Unique identifier of the employee in Paycor&#39;s system. Generated by Paycor.
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "df5566ef-196c-0000-0000-0007d5268Sa2", value = "Unique identifier of the employee in Paycor's system. Generated by Paycor.")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public OnDemandPayDeductionInformation employeeNumber(Integer employeeNumber) {
    
    
    
    
    this.employeeNumber = employeeNumber;
    return this;
  }

   /**
   * Unique number of the employee in the tenant. Generated by Paycor.             
   * @return employeeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "Unique number of the employee in the tenant. Generated by Paycor.             ")

  public Integer getEmployeeNumber() {
    return employeeNumber;
  }


  public void setEmployeeNumber(Integer employeeNumber) {
    
    
    
    this.employeeNumber = employeeNumber;
  }


  public OnDemandPayDeductionInformation employeeName(String employeeName) {
    
    
    
    
    this.employeeName = employeeName;
    return this;
  }

   /**
   * First and last name of the employee.
   * @return employeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Charles Dodgson", value = "First and last name of the employee.")

  public String getEmployeeName() {
    return employeeName;
  }


  public void setEmployeeName(String employeeName) {
    
    
    
    this.employeeName = employeeName;
  }


  public OnDemandPayDeductionInformation employeeStatus(EmployeeStatusData2 employeeStatus) {
    
    
    
    
    this.employeeStatus = employeeStatus;
    return this;
  }

   /**
   * Get employeeStatus
   * @return employeeStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeeStatusData2 getEmployeeStatus() {
    return employeeStatus;
  }


  public void setEmployeeStatus(EmployeeStatusData2 employeeStatus) {
    
    
    
    this.employeeStatus = employeeStatus;
  }


  public OnDemandPayDeductionInformation wasEmployeePaid(Boolean wasEmployeePaid) {
    
    
    
    
    this.wasEmployeePaid = wasEmployeePaid;
    return this;
  }

   /**
   * A flag that indicates that employee is paid.             
   * @return wasEmployeePaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "A flag that indicates that employee is paid.             ")

  public Boolean getWasEmployeePaid() {
    return wasEmployeePaid;
  }


  public void setWasEmployeePaid(Boolean wasEmployeePaid) {
    
    
    
    this.wasEmployeePaid = wasEmployeePaid;
  }


  public OnDemandPayDeductionInformation receivedAmount(Double receivedAmount) {
    
    
    
    
    this.receivedAmount = receivedAmount;
    return this;
  }

  public OnDemandPayDeductionInformation receivedAmount(Integer receivedAmount) {
    
    
    
    
    this.receivedAmount = receivedAmount.doubleValue();
    return this;
  }

   /**
   * Flag that shows information of Received amount.             
   * @return receivedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000.95", value = "Flag that shows information of Received amount.             ")

  public Double getReceivedAmount() {
    return receivedAmount;
  }


  public void setReceivedAmount(Double receivedAmount) {
    
    
    
    this.receivedAmount = receivedAmount;
  }


  public OnDemandPayDeductionInformation paidAmount(Double paidAmount) {
    
    
    
    
    this.paidAmount = paidAmount;
    return this;
  }

  public OnDemandPayDeductionInformation paidAmount(Integer paidAmount) {
    
    
    
    
    this.paidAmount = paidAmount.doubleValue();
    return this;
  }

   /**
   * Flag that shows information of paid amount.             
   * @return paidAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000.95", value = "Flag that shows information of paid amount.             ")

  public Double getPaidAmount() {
    return paidAmount;
  }


  public void setPaidAmount(Double paidAmount) {
    
    
    
    this.paidAmount = paidAmount;
  }


  public OnDemandPayDeductionInformation shortfallAmount(Double shortfallAmount) {
    
    
    
    
    this.shortfallAmount = shortfallAmount;
    return this;
  }

  public OnDemandPayDeductionInformation shortfallAmount(Integer shortfallAmount) {
    
    
    
    
    this.shortfallAmount = shortfallAmount.doubleValue();
    return this;
  }

   /**
   * Flag that shows information of shortfall amount.             
   * @return shortfallAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000.95", value = "Flag that shows information of shortfall amount.             ")

  public Double getShortfallAmount() {
    return shortfallAmount;
  }


  public void setShortfallAmount(Double shortfallAmount) {
    
    
    
    this.shortfallAmount = shortfallAmount;
  }


  public OnDemandPayDeductionInformation payrunStatus(String payrunStatus) {
    
    
    
    
    this.payrunStatus = payrunStatus;
    return this;
  }

   /**
   * Flag that shows status information of payrun.
   * @return payrunStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Expected To Run", value = "Flag that shows status information of payrun.")

  public String getPayrunStatus() {
    return payrunStatus;
  }


  public void setPayrunStatus(String payrunStatus) {
    
    
    
    this.payrunStatus = payrunStatus;
  }


  public OnDemandPayDeductionInformation payrunProcessDate(OffsetDateTime payrunProcessDate) {
    
    
    
    
    this.payrunProcessDate = payrunProcessDate;
    return this;
  }

   /**
   * Flag that shows information of date of payrun process.
   * @return payrunProcessDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-11-01T00:00Z", value = "Flag that shows information of date of payrun process.")

  public OffsetDateTime getPayrunProcessDate() {
    return payrunProcessDate;
  }


  public void setPayrunProcessDate(OffsetDateTime payrunProcessDate) {
    
    
    
    this.payrunProcessDate = payrunProcessDate;
  }


  public OnDemandPayDeductionInformation periodStartDate(OffsetDateTime periodStartDate) {
    
    
    
    
    this.periodStartDate = periodStartDate;
    return this;
  }

   /**
   * Flag that shows start date period.
   * @return periodStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-11-01T00:00Z", value = "Flag that shows start date period.")

  public OffsetDateTime getPeriodStartDate() {
    return periodStartDate;
  }


  public void setPeriodStartDate(OffsetDateTime periodStartDate) {
    
    
    
    this.periodStartDate = periodStartDate;
  }


  public OnDemandPayDeductionInformation periodEndDate(OffsetDateTime periodEndDate) {
    
    
    
    
    this.periodEndDate = periodEndDate;
    return this;
  }

   /**
   * Flag that shows end date period.
   * @return periodEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-11-01T00:00Z", value = "Flag that shows end date period.")

  public OffsetDateTime getPeriodEndDate() {
    return periodEndDate;
  }


  public void setPeriodEndDate(OffsetDateTime periodEndDate) {
    
    
    
    this.periodEndDate = periodEndDate;
  }


  public OnDemandPayDeductionInformation impoundProcessDate(OffsetDateTime impoundProcessDate) {
    
    
    
    
    this.impoundProcessDate = impoundProcessDate;
    return this;
  }

   /**
   * Flag that shows information of date of Impound process.
   * @return impoundProcessDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-11-01T00:00Z", value = "Flag that shows information of date of Impound process.")

  public OffsetDateTime getImpoundProcessDate() {
    return impoundProcessDate;
  }


  public void setImpoundProcessDate(OffsetDateTime impoundProcessDate) {
    
    
    
    this.impoundProcessDate = impoundProcessDate;
  }


  public OnDemandPayDeductionInformation impoundReferenceId(String impoundReferenceId) {
    
    
    
    
    this.impoundReferenceId = impoundReferenceId;
    return this;
  }

   /**
   * Unique number of impound reference.             
   * @return impoundReferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "Unique number of impound reference.             ")

  public String getImpoundReferenceId() {
    return impoundReferenceId;
  }


  public void setImpoundReferenceId(String impoundReferenceId) {
    
    
    
    this.impoundReferenceId = impoundReferenceId;
  }


  public OnDemandPayDeductionInformation impoundedAmount(Double impoundedAmount) {
    
    
    
    
    this.impoundedAmount = impoundedAmount;
    return this;
  }

  public OnDemandPayDeductionInformation impoundedAmount(Integer impoundedAmount) {
    
    
    
    
    this.impoundedAmount = impoundedAmount.doubleValue();
    return this;
  }

   /**
   * Flag that shows information of impounded amount.             
   * @return impoundedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "Flag that shows information of impounded amount.             ")

  public Double getImpoundedAmount() {
    return impoundedAmount;
  }


  public void setImpoundedAmount(Double impoundedAmount) {
    
    
    
    this.impoundedAmount = impoundedAmount;
  }


  public OnDemandPayDeductionInformation isClientActive(Boolean isClientActive) {
    
    
    
    
    this.isClientActive = isClientActive;
    return this;
  }

   /**
   * Flag that shows is the client active or not in Paycor system.             
   * @return isClientActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Flag that shows is the client active or not in Paycor system.             ")

  public Boolean getIsClientActive() {
    return isClientActive;
  }


  public void setIsClientActive(Boolean isClientActive) {
    
    
    
    this.isClientActive = isClientActive;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the OnDemandPayDeductionInformation instance itself
   */
  public OnDemandPayDeductionInformation putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnDemandPayDeductionInformation onDemandPayDeductionInformation = (OnDemandPayDeductionInformation) o;
    return Objects.equals(this.legalEntityId, onDemandPayDeductionInformation.legalEntityId) &&
        Objects.equals(this.checkDate, onDemandPayDeductionInformation.checkDate) &&
        Objects.equals(this.payImportId, onDemandPayDeductionInformation.payImportId) &&
        Objects.equals(this.employeeId, onDemandPayDeductionInformation.employeeId) &&
        Objects.equals(this.employeeNumber, onDemandPayDeductionInformation.employeeNumber) &&
        Objects.equals(this.employeeName, onDemandPayDeductionInformation.employeeName) &&
        Objects.equals(this.employeeStatus, onDemandPayDeductionInformation.employeeStatus) &&
        Objects.equals(this.wasEmployeePaid, onDemandPayDeductionInformation.wasEmployeePaid) &&
        Objects.equals(this.receivedAmount, onDemandPayDeductionInformation.receivedAmount) &&
        Objects.equals(this.paidAmount, onDemandPayDeductionInformation.paidAmount) &&
        Objects.equals(this.shortfallAmount, onDemandPayDeductionInformation.shortfallAmount) &&
        Objects.equals(this.payrunStatus, onDemandPayDeductionInformation.payrunStatus) &&
        Objects.equals(this.payrunProcessDate, onDemandPayDeductionInformation.payrunProcessDate) &&
        Objects.equals(this.periodStartDate, onDemandPayDeductionInformation.periodStartDate) &&
        Objects.equals(this.periodEndDate, onDemandPayDeductionInformation.periodEndDate) &&
        Objects.equals(this.impoundProcessDate, onDemandPayDeductionInformation.impoundProcessDate) &&
        Objects.equals(this.impoundReferenceId, onDemandPayDeductionInformation.impoundReferenceId) &&
        Objects.equals(this.impoundedAmount, onDemandPayDeductionInformation.impoundedAmount) &&
        Objects.equals(this.isClientActive, onDemandPayDeductionInformation.isClientActive)&&
        Objects.equals(this.additionalProperties, onDemandPayDeductionInformation.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalEntityId, checkDate, payImportId, employeeId, employeeNumber, employeeName, employeeStatus, wasEmployeePaid, receivedAmount, paidAmount, shortfallAmount, payrunStatus, payrunProcessDate, periodStartDate, periodEndDate, impoundProcessDate, impoundReferenceId, impoundedAmount, isClientActive, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnDemandPayDeductionInformation {\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    checkDate: ").append(toIndentedString(checkDate)).append("\n");
    sb.append("    payImportId: ").append(toIndentedString(payImportId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    employeeStatus: ").append(toIndentedString(employeeStatus)).append("\n");
    sb.append("    wasEmployeePaid: ").append(toIndentedString(wasEmployeePaid)).append("\n");
    sb.append("    receivedAmount: ").append(toIndentedString(receivedAmount)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    shortfallAmount: ").append(toIndentedString(shortfallAmount)).append("\n");
    sb.append("    payrunStatus: ").append(toIndentedString(payrunStatus)).append("\n");
    sb.append("    payrunProcessDate: ").append(toIndentedString(payrunProcessDate)).append("\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    impoundProcessDate: ").append(toIndentedString(impoundProcessDate)).append("\n");
    sb.append("    impoundReferenceId: ").append(toIndentedString(impoundReferenceId)).append("\n");
    sb.append("    impoundedAmount: ").append(toIndentedString(impoundedAmount)).append("\n");
    sb.append("    isClientActive: ").append(toIndentedString(isClientActive)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("LegalEntityId");
    openapiFields.add("CheckDate");
    openapiFields.add("PayImportId");
    openapiFields.add("EmployeeId");
    openapiFields.add("EmployeeNumber");
    openapiFields.add("EmployeeName");
    openapiFields.add("EmployeeStatus");
    openapiFields.add("WasEmployeePaid");
    openapiFields.add("ReceivedAmount");
    openapiFields.add("PaidAmount");
    openapiFields.add("ShortfallAmount");
    openapiFields.add("PayrunStatus");
    openapiFields.add("PayrunProcessDate");
    openapiFields.add("PeriodStartDate");
    openapiFields.add("PeriodEndDate");
    openapiFields.add("ImpoundProcessDate");
    openapiFields.add("ImpoundReferenceId");
    openapiFields.add("ImpoundedAmount");
    openapiFields.add("IsClientActive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnDemandPayDeductionInformation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OnDemandPayDeductionInformation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnDemandPayDeductionInformation is not found in the empty JSON string", OnDemandPayDeductionInformation.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("EmployeeId") != null && !jsonObj.get("EmployeeId").isJsonNull()) && !jsonObj.get("EmployeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EmployeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EmployeeId").toString()));
      }
      if (!jsonObj.get("EmployeeName").isJsonNull() && (jsonObj.get("EmployeeName") != null && !jsonObj.get("EmployeeName").isJsonNull()) && !jsonObj.get("EmployeeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EmployeeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EmployeeName").toString()));
      }
      // validate the optional field `EmployeeStatus`
      if (jsonObj.get("EmployeeStatus") != null && !jsonObj.get("EmployeeStatus").isJsonNull()) {
        EmployeeStatusData2.validateJsonObject(jsonObj.getAsJsonObject("EmployeeStatus"));
      }
      if (!jsonObj.get("PayrunStatus").isJsonNull() && (jsonObj.get("PayrunStatus") != null && !jsonObj.get("PayrunStatus").isJsonNull()) && !jsonObj.get("PayrunStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PayrunStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PayrunStatus").toString()));
      }
      if (!jsonObj.get("ImpoundReferenceId").isJsonNull() && (jsonObj.get("ImpoundReferenceId") != null && !jsonObj.get("ImpoundReferenceId").isJsonNull()) && !jsonObj.get("ImpoundReferenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ImpoundReferenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ImpoundReferenceId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnDemandPayDeductionInformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnDemandPayDeductionInformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnDemandPayDeductionInformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnDemandPayDeductionInformation.class));

       return (TypeAdapter<T>) new TypeAdapter<OnDemandPayDeductionInformation>() {
           @Override
           public void write(JsonWriter out, OnDemandPayDeductionInformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public OnDemandPayDeductionInformation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OnDemandPayDeductionInformation instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OnDemandPayDeductionInformation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnDemandPayDeductionInformation
  * @throws IOException if the JSON string is invalid with respect to OnDemandPayDeductionInformation
  */
  public static OnDemandPayDeductionInformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnDemandPayDeductionInformation.class);
  }

 /**
  * Convert an instance of OnDemandPayDeductionInformation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

