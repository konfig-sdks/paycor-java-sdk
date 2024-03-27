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
import com.konfigthis.client.model.TimeOffRequestDay;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * Employee Time Off Request model represents information about time off requests for specific employee.
 */
@ApiModel(description = "Employee Time Off Request model represents information about time off requests for specific employee.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeTimeOffRequest {
  public static final String SERIALIZED_NAME_LEGAL_ENTITY_ID = "LegalEntityId";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_ID)
  private Integer legalEntityId;

  public static final String SERIALIZED_NAME_TIME_OFF_REQUEST_ID = "TimeOffRequestId";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_REQUEST_ID)
  private String timeOffRequestId;

  public static final String SERIALIZED_NAME_BENEFIT_CODE = "BenefitCode";
  @SerializedName(SERIALIZED_NAME_BENEFIT_CODE)
  private String benefitCode;

  public static final String SERIALIZED_NAME_TOTAL_HOURS = "TotalHours";
  @SerializedName(SERIALIZED_NAME_TOTAL_HOURS)
  private Double totalHours;

  public static final String SERIALIZED_NAME_DAYS = "Days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  private List<TimeOffRequestDay> days = null;

  public static final String SERIALIZED_NAME_COMMENT = "Comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATED_DATE = "CreatedDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_STATUS_UPDATE_TIME = "StatusUpdateTime";
  @SerializedName(SERIALIZED_NAME_STATUS_UPDATE_TIME)
  private OffsetDateTime statusUpdateTime;

  public static final String SERIALIZED_NAME_STATUS_UPDATE_BY_EMPLOYEE_ID = "StatusUpdateByEmployeeId";
  @SerializedName(SERIALIZED_NAME_STATUS_UPDATE_BY_EMPLOYEE_ID)
  private String statusUpdateByEmployeeId;

  public static final String SERIALIZED_NAME_CREATED_BY_EMPLOYEE_ID = "CreatedByEmployeeId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_EMPLOYEE_ID)
  private String createdByEmployeeId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "EmployeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public EmployeeTimeOffRequest() {
  }

  public EmployeeTimeOffRequest legalEntityId(Integer legalEntityId) {
    
    
    
    
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * Get legalEntityId
   * @return legalEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLegalEntityId() {
    return legalEntityId;
  }


  public void setLegalEntityId(Integer legalEntityId) {
    
    
    
    this.legalEntityId = legalEntityId;
  }


  public EmployeeTimeOffRequest timeOffRequestId(String timeOffRequestId) {
    
    
    
    
    this.timeOffRequestId = timeOffRequestId;
    return this;
  }

   /**
   * Unique identifier of this time off request.
   * @return timeOffRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "36f45f30-9a35-0000-0000-000001000000", value = "Unique identifier of this time off request.")

  public String getTimeOffRequestId() {
    return timeOffRequestId;
  }


  public void setTimeOffRequestId(String timeOffRequestId) {
    
    
    
    this.timeOffRequestId = timeOffRequestId;
  }


  public EmployeeTimeOffRequest benefitCode(String benefitCode) {
    
    
    
    
    this.benefitCode = benefitCode;
    return this;
  }

   /**
   * Get benefitCode
   * @return benefitCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBenefitCode() {
    return benefitCode;
  }


  public void setBenefitCode(String benefitCode) {
    
    
    
    this.benefitCode = benefitCode;
  }


  public EmployeeTimeOffRequest totalHours(Double totalHours) {
    
    
    
    
    this.totalHours = totalHours;
    return this;
  }

  public EmployeeTimeOffRequest totalHours(Integer totalHours) {
    
    
    
    
    this.totalHours = totalHours.doubleValue();
    return this;
  }

   /**
   * Total amount of hours inside this time off request.
   * @return totalHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14.5", value = "Total amount of hours inside this time off request.")

  public Double getTotalHours() {
    return totalHours;
  }


  public void setTotalHours(Double totalHours) {
    
    
    
    this.totalHours = totalHours;
  }


  public EmployeeTimeOffRequest days(List<TimeOffRequestDay> days) {
    
    
    
    
    this.days = days;
    return this;
  }

  public EmployeeTimeOffRequest addDaysItem(TimeOffRequestDay daysItem) {
    if (this.days == null) {
      this.days = new ArrayList<>();
    }
    this.days.add(daysItem);
    return this;
  }

   /**
   * Collection of days for this time off request.
   * @return days
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of days for this time off request.")

  public List<TimeOffRequestDay> getDays() {
    return days;
  }


  public void setDays(List<TimeOffRequestDay> days) {
    
    
    
    this.days = days;
  }


  public EmployeeTimeOffRequest comment(String comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

   /**
   * Additional comment for this time off request. Optional. Currently not available in Get Employee Time Off Requests by EmployeeId.
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional comment for this time off request. Optional. Currently not available in Get Employee Time Off Requests by EmployeeId.")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    
    
    
    this.comment = comment;
  }


  public EmployeeTimeOffRequest status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Status of this time off request. Status could be Pending, Approved, Denied, Removed, Canceled or empty
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Approved", value = "Status of this time off request. Status could be Pending, Approved, Denied, Removed, Canceled or empty")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public EmployeeTimeOffRequest createdDate(OffsetDateTime createdDate) {
    
    
    
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date and time when this time off request is created.
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-17T13:00Z", value = "Date and time when this time off request is created.")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    
    
    
    this.createdDate = createdDate;
  }


  public EmployeeTimeOffRequest statusUpdateTime(OffsetDateTime statusUpdateTime) {
    
    
    
    
    this.statusUpdateTime = statusUpdateTime;
    return this;
  }

   /**
   * Date and time when is the status of this time off request updated.
   * @return statusUpdateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-17T13:00Z", value = "Date and time when is the status of this time off request updated.")

  public OffsetDateTime getStatusUpdateTime() {
    return statusUpdateTime;
  }


  public void setStatusUpdateTime(OffsetDateTime statusUpdateTime) {
    
    
    
    this.statusUpdateTime = statusUpdateTime;
  }


  public EmployeeTimeOffRequest statusUpdateByEmployeeId(String statusUpdateByEmployeeId) {
    
    
    
    
    this.statusUpdateByEmployeeId = statusUpdateByEmployeeId;
    return this;
  }

   /**
   * Unique identifier of employee who is updated status.
   * @return statusUpdateByEmployeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "36f45f30-9a35-0000-0000-000001000000", value = "Unique identifier of employee who is updated status.")

  public String getStatusUpdateByEmployeeId() {
    return statusUpdateByEmployeeId;
  }


  public void setStatusUpdateByEmployeeId(String statusUpdateByEmployeeId) {
    
    
    
    this.statusUpdateByEmployeeId = statusUpdateByEmployeeId;
  }


  public EmployeeTimeOffRequest createdByEmployeeId(String createdByEmployeeId) {
    
    
    
    
    this.createdByEmployeeId = createdByEmployeeId;
    return this;
  }

   /**
   * Unique identifier of employee who is created this time off request.
   * @return createdByEmployeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "36f45f30-9a35-0000-0000-000001000000", value = "Unique identifier of employee who is created this time off request.")

  public String getCreatedByEmployeeId() {
    return createdByEmployeeId;
  }


  public void setCreatedByEmployeeId(String createdByEmployeeId) {
    
    
    
    this.createdByEmployeeId = createdByEmployeeId;
  }


  public EmployeeTimeOffRequest employeeId(String employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Unique identifier of this employee.
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "36f45f30-9a35-0000-0000-000001000000", value = "Unique identifier of this employee.")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    
    
    
    this.employeeId = employeeId;
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
   * @return the EmployeeTimeOffRequest instance itself
   */
  public EmployeeTimeOffRequest putAdditionalProperty(String key, Object value) {
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
    EmployeeTimeOffRequest employeeTimeOffRequest = (EmployeeTimeOffRequest) o;
    return Objects.equals(this.legalEntityId, employeeTimeOffRequest.legalEntityId) &&
        Objects.equals(this.timeOffRequestId, employeeTimeOffRequest.timeOffRequestId) &&
        Objects.equals(this.benefitCode, employeeTimeOffRequest.benefitCode) &&
        Objects.equals(this.totalHours, employeeTimeOffRequest.totalHours) &&
        Objects.equals(this.days, employeeTimeOffRequest.days) &&
        Objects.equals(this.comment, employeeTimeOffRequest.comment) &&
        Objects.equals(this.status, employeeTimeOffRequest.status) &&
        Objects.equals(this.createdDate, employeeTimeOffRequest.createdDate) &&
        Objects.equals(this.statusUpdateTime, employeeTimeOffRequest.statusUpdateTime) &&
        Objects.equals(this.statusUpdateByEmployeeId, employeeTimeOffRequest.statusUpdateByEmployeeId) &&
        Objects.equals(this.createdByEmployeeId, employeeTimeOffRequest.createdByEmployeeId) &&
        Objects.equals(this.employeeId, employeeTimeOffRequest.employeeId)&&
        Objects.equals(this.additionalProperties, employeeTimeOffRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalEntityId, timeOffRequestId, benefitCode, totalHours, days, comment, status, createdDate, statusUpdateTime, statusUpdateByEmployeeId, createdByEmployeeId, employeeId, additionalProperties);
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
    sb.append("class EmployeeTimeOffRequest {\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    timeOffRequestId: ").append(toIndentedString(timeOffRequestId)).append("\n");
    sb.append("    benefitCode: ").append(toIndentedString(benefitCode)).append("\n");
    sb.append("    totalHours: ").append(toIndentedString(totalHours)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    statusUpdateTime: ").append(toIndentedString(statusUpdateTime)).append("\n");
    sb.append("    statusUpdateByEmployeeId: ").append(toIndentedString(statusUpdateByEmployeeId)).append("\n");
    sb.append("    createdByEmployeeId: ").append(toIndentedString(createdByEmployeeId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
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
    openapiFields.add("TimeOffRequestId");
    openapiFields.add("BenefitCode");
    openapiFields.add("TotalHours");
    openapiFields.add("Days");
    openapiFields.add("Comment");
    openapiFields.add("Status");
    openapiFields.add("CreatedDate");
    openapiFields.add("StatusUpdateTime");
    openapiFields.add("StatusUpdateByEmployeeId");
    openapiFields.add("CreatedByEmployeeId");
    openapiFields.add("EmployeeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeTimeOffRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeTimeOffRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeTimeOffRequest is not found in the empty JSON string", EmployeeTimeOffRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("TimeOffRequestId") != null && !jsonObj.get("TimeOffRequestId").isJsonNull()) && !jsonObj.get("TimeOffRequestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TimeOffRequestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TimeOffRequestId").toString()));
      }
      if (!jsonObj.get("BenefitCode").isJsonNull() && (jsonObj.get("BenefitCode") != null && !jsonObj.get("BenefitCode").isJsonNull()) && !jsonObj.get("BenefitCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BenefitCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BenefitCode").toString()));
      }
      if (jsonObj.get("Days") != null && !jsonObj.get("Days").isJsonNull()) {
        JsonArray jsonArraydays = jsonObj.getAsJsonArray("Days");
        if (jsonArraydays != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Days").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Days` to be an array in the JSON string but got `%s`", jsonObj.get("Days").toString()));
          }

          // validate the optional field `Days` (array)
          for (int i = 0; i < jsonArraydays.size(); i++) {
            TimeOffRequestDay.validateJsonObject(jsonArraydays.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("Comment").isJsonNull() && (jsonObj.get("Comment") != null && !jsonObj.get("Comment").isJsonNull()) && !jsonObj.get("Comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Comment").toString()));
      }
      if (!jsonObj.get("Status").isJsonNull() && (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) && !jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
      if ((jsonObj.get("StatusUpdateByEmployeeId") != null && !jsonObj.get("StatusUpdateByEmployeeId").isJsonNull()) && !jsonObj.get("StatusUpdateByEmployeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StatusUpdateByEmployeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StatusUpdateByEmployeeId").toString()));
      }
      if ((jsonObj.get("CreatedByEmployeeId") != null && !jsonObj.get("CreatedByEmployeeId").isJsonNull()) && !jsonObj.get("CreatedByEmployeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CreatedByEmployeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CreatedByEmployeeId").toString()));
      }
      if ((jsonObj.get("EmployeeId") != null && !jsonObj.get("EmployeeId").isJsonNull()) && !jsonObj.get("EmployeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EmployeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EmployeeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeTimeOffRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeTimeOffRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeTimeOffRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeTimeOffRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeTimeOffRequest>() {
           @Override
           public void write(JsonWriter out, EmployeeTimeOffRequest value) throws IOException {
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
           public EmployeeTimeOffRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeTimeOffRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeTimeOffRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeTimeOffRequest
  * @throws IOException if the JSON string is invalid with respect to EmployeeTimeOffRequest
  */
  public static EmployeeTimeOffRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeTimeOffRequest.class);
  }

 /**
  * Convert an instance of EmployeeTimeOffRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

