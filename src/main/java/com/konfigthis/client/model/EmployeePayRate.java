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
import com.konfigthis.client.model.PayType;
import com.konfigthis.client.model.ResourceReference;
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
 * The Pay Rates model represents information about the Employee&#39;s Pay Rate. Provides link to the Employee&#39;s information.             
 */
@ApiModel(description = "The Pay Rates model represents information about the Employee's Pay Rate. Provides link to the Employee's information.             ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeePayRate {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "EffectiveStartDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private OffsetDateTime effectiveStartDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "EffectiveEndDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private OffsetDateTime effectiveEndDate;

  public static final String SERIALIZED_NAME_SEQUENCE_NUMBER = "SequenceNumber";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NUMBER)
  private Integer sequenceNumber;

  public static final String SERIALIZED_NAME_PAY_RATE = "PayRate";
  @SerializedName(SERIALIZED_NAME_PAY_RATE)
  private Double payRate;

  public static final String SERIALIZED_NAME_ANNUAL_PAY_RATE = "AnnualPayRate";
  @SerializedName(SERIALIZED_NAME_ANNUAL_PAY_RATE)
  private Double annualPayRate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ANNUAL_HOURS = "AnnualHours";
  @SerializedName(SERIALIZED_NAME_ANNUAL_HOURS)
  private Integer annualHours;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private PayType type;

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_EMPLOYEES = "Employees";
  @SerializedName(SERIALIZED_NAME_EMPLOYEES)
  private ResourceReference employees;

  public EmployeePayRate() {
  }

  public EmployeePayRate id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the employee pay rate in Paycor&#39;s system. Generated by Paycor.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "75571ee9-d359-0000-0000-000066000000", value = "Unique identifier of the employee pay rate in Paycor's system. Generated by Paycor.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public EmployeePayRate effectiveStartDate(OffsetDateTime effectiveStartDate) {
    
    
    
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * Date when the employee pay rate takes effect. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-11-22T00:00Z", value = "Date when the employee pay rate takes effect. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              ")

  public OffsetDateTime getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(OffsetDateTime effectiveStartDate) {
    
    
    
    this.effectiveStartDate = effectiveStartDate;
  }


  public EmployeePayRate effectiveEndDate(OffsetDateTime effectiveEndDate) {
    
    
    
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * Date when the employee pay rate is no longer in effect, or NULL if rate is currently active. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-01T12:15Z", value = "Date when the employee pay rate is no longer in effect, or NULL if rate is currently active. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              ")

  public OffsetDateTime getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(OffsetDateTime effectiveEndDate) {
    
    
    
    this.effectiveEndDate = effectiveEndDate;
  }


  public EmployeePayRate sequenceNumber(Integer sequenceNumber) {
    
    
    
    
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * Orders how multiple earnings are calculated. Needed so earnings dependent on other earnings are calculated in the proper sequence.
   * @return sequenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Orders how multiple earnings are calculated. Needed so earnings dependent on other earnings are calculated in the proper sequence.")

  public Integer getSequenceNumber() {
    return sequenceNumber;
  }


  public void setSequenceNumber(Integer sequenceNumber) {
    
    
    
    this.sequenceNumber = sequenceNumber;
  }


  public EmployeePayRate payRate(Double payRate) {
    
    
    
    
    this.payRate = payRate;
    return this;
  }

  public EmployeePayRate payRate(Integer payRate) {
    
    
    
    
    this.payRate = payRate.doubleValue();
    return this;
  }

   /**
   * Employee&#39;s rate of pay (in dollars).  If Pay Type is Hourly, then Pay Rate is a Per-Hour dollar amount and is required.  If Pay Type is Salary, then Pay Rate is a Per-Pay dollar amount, and either Pay Rate or Annual Rate is required. Payrate can&#39;t have more than 6 decimal places and can&#39;t be negative.              
   * @return payRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25.52", value = "Employee's rate of pay (in dollars).  If Pay Type is Hourly, then Pay Rate is a Per-Hour dollar amount and is required.  If Pay Type is Salary, then Pay Rate is a Per-Pay dollar amount, and either Pay Rate or Annual Rate is required. Payrate can't have more than 6 decimal places and can't be negative.              ")

  public Double getPayRate() {
    return payRate;
  }


  public void setPayRate(Double payRate) {
    
    
    
    this.payRate = payRate;
  }


  public EmployeePayRate annualPayRate(Double annualPayRate) {
    
    
    
    
    this.annualPayRate = annualPayRate;
    return this;
  }

  public EmployeePayRate annualPayRate(Integer annualPayRate) {
    
    
    
    
    this.annualPayRate = annualPayRate.doubleValue();
    return this;
  }

   /**
   * Employee&#39;s annual amount of pay (in dollars).             
   * @return annualPayRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "53081.6", value = "Employee's annual amount of pay (in dollars).             ")

  public Double getAnnualPayRate() {
    return annualPayRate;
  }


  public void setAnnualPayRate(Double annualPayRate) {
    
    
    
    this.annualPayRate = annualPayRate;
  }


  public EmployeePayRate description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Brief description of the employee&#39;s pay rate.             
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Rate 1", value = "Brief description of the employee's pay rate.             ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public EmployeePayRate annualHours(Integer annualHours) {
    
    
    
    
    this.annualHours = annualHours;
    return this;
  }

   /**
   * Employee&#39;s annual working hours. Value defaults to 2080.
   * @return annualHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2080", value = "Employee's annual working hours. Value defaults to 2080.")

  public Integer getAnnualHours() {
    return annualHours;
  }


  public void setAnnualHours(Integer annualHours) {
    
    
    
    this.annualHours = annualHours;
  }


  public EmployeePayRate type(PayType type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayType getType() {
    return type;
  }


  public void setType(PayType type) {
    
    
    
    this.type = type;
  }


  public EmployeePayRate reason(String reason) {
    
    
    
    
    this.reason = reason;
    return this;
  }

   /**
   * Reason associated with the employee&#39;s pay rate.              
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Merit Increase.", value = "Reason associated with the employee's pay rate.              ")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    
    
    
    this.reason = reason;
  }


  public EmployeePayRate notes(String notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Notes associated with the employee&#39;s pay rate, which will be displayed on Pay Rate History page.   There is a known bug and would be fixed in coming release.  Value is always null due to existing issue and actual values in Paycor system may or may not be null based on the user input.             
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Notes associated with the employee's pay rate, which will be displayed on Pay Rate History page.   There is a known bug and would be fixed in coming release.  Value is always null due to existing issue and actual values in Paycor system may or may not be null based on the user input.             ")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    
    this.notes = notes;
  }


  public EmployeePayRate employees(ResourceReference employees) {
    
    
    
    
    this.employees = employees;
    return this;
  }

   /**
   * Get employees
   * @return employees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getEmployees() {
    return employees;
  }


  public void setEmployees(ResourceReference employees) {
    
    
    
    this.employees = employees;
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
   * @return the EmployeePayRate instance itself
   */
  public EmployeePayRate putAdditionalProperty(String key, Object value) {
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
    EmployeePayRate employeePayRate = (EmployeePayRate) o;
    return Objects.equals(this.id, employeePayRate.id) &&
        Objects.equals(this.effectiveStartDate, employeePayRate.effectiveStartDate) &&
        Objects.equals(this.effectiveEndDate, employeePayRate.effectiveEndDate) &&
        Objects.equals(this.sequenceNumber, employeePayRate.sequenceNumber) &&
        Objects.equals(this.payRate, employeePayRate.payRate) &&
        Objects.equals(this.annualPayRate, employeePayRate.annualPayRate) &&
        Objects.equals(this.description, employeePayRate.description) &&
        Objects.equals(this.annualHours, employeePayRate.annualHours) &&
        Objects.equals(this.type, employeePayRate.type) &&
        Objects.equals(this.reason, employeePayRate.reason) &&
        Objects.equals(this.notes, employeePayRate.notes) &&
        Objects.equals(this.employees, employeePayRate.employees)&&
        Objects.equals(this.additionalProperties, employeePayRate.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, effectiveStartDate, effectiveEndDate, sequenceNumber, payRate, annualPayRate, description, annualHours, type, reason, notes, employees, additionalProperties);
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
    sb.append("class EmployeePayRate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    payRate: ").append(toIndentedString(payRate)).append("\n");
    sb.append("    annualPayRate: ").append(toIndentedString(annualPayRate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    annualHours: ").append(toIndentedString(annualHours)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("EffectiveStartDate");
    openapiFields.add("EffectiveEndDate");
    openapiFields.add("SequenceNumber");
    openapiFields.add("PayRate");
    openapiFields.add("AnnualPayRate");
    openapiFields.add("Description");
    openapiFields.add("AnnualHours");
    openapiFields.add("Type");
    openapiFields.add("Reason");
    openapiFields.add("Notes");
    openapiFields.add("Employees");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeePayRate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeePayRate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeePayRate is not found in the empty JSON string", EmployeePayRate.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if (!jsonObj.get("Description").isJsonNull() && (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if (!jsonObj.get("Reason").isJsonNull() && (jsonObj.get("Reason") != null && !jsonObj.get("Reason").isJsonNull()) && !jsonObj.get("Reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Reason").toString()));
      }
      if (!jsonObj.get("Notes").isJsonNull() && (jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonNull()) && !jsonObj.get("Notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
      }
      // validate the optional field `Employees`
      if (jsonObj.get("Employees") != null && !jsonObj.get("Employees").isJsonNull()) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("Employees"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeePayRate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeePayRate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeePayRate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeePayRate.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeePayRate>() {
           @Override
           public void write(JsonWriter out, EmployeePayRate value) throws IOException {
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
           public EmployeePayRate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeePayRate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeePayRate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeePayRate
  * @throws IOException if the JSON string is invalid with respect to EmployeePayRate
  */
  public static EmployeePayRate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeePayRate.class);
  }

 /**
  * Convert an instance of EmployeePayRate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

