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
import com.konfigthis.client.model.Manager;
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
 * The Employee Position Data model represents the Employee&#39;s Position related data.
 */
@ApiModel(description = "The Employee Position Data model represents the Employee's Position related data.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeePositionData {
  public static final String SERIALIZED_NAME_JOB_TITLE = "JobTitle";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private String jobTitle;

  public static final String SERIALIZED_NAME_JOB_CODE = "JobCode";
  @SerializedName(SERIALIZED_NAME_JOB_CODE)
  private String jobCode;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "EffectiveStartDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private OffsetDateTime effectiveStartDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "EffectiveEndDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private OffsetDateTime effectiveEndDate;

  public static final String SERIALIZED_NAME_PAY_GROUP_ID = "PayGroupId";
  @SerializedName(SERIALIZED_NAME_PAY_GROUP_ID)
  private String payGroupId;

  public static final String SERIALIZED_NAME_MANAGER = "Manager";
  @SerializedName(SERIALIZED_NAME_MANAGER)
  private Manager manager;

  public EmployeePositionData() {
  }

  public EmployeePositionData jobTitle(String jobTitle) {
    
    
    
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Name of the employee&#39;s job title.             
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Software Engineer", value = "Name of the employee's job title.             ")

  public String getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(String jobTitle) {
    
    
    
    this.jobTitle = jobTitle;
  }


  public EmployeePositionData jobCode(String jobCode) {
    
    
    
    
    this.jobCode = jobCode;
    return this;
  }

   /**
   * Code of the employee&#39;s job.             
   * @return jobCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "P2", value = "Code of the employee's job.             ")

  public String getJobCode() {
    return jobCode;
  }


  public void setJobCode(String jobCode) {
    
    
    
    this.jobCode = jobCode;
  }


  public EmployeePositionData effectiveStartDate(OffsetDateTime effectiveStartDate) {
    
    
    
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * Date the employee position data takes effect. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-11-01T00:00Z", value = "Date the employee position data takes effect. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              ")

  public OffsetDateTime getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(OffsetDateTime effectiveStartDate) {
    
    
    
    this.effectiveStartDate = effectiveStartDate;
  }


  public EmployeePositionData effectiveEndDate(OffsetDateTime effectiveEndDate) {
    
    
    
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * Date the employee position data is no longer in effect. This property will not return values for Active employees Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-01T00:00Z", value = "Date the employee position data is no longer in effect. This property will not return values for Active employees Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              ")

  public OffsetDateTime getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(OffsetDateTime effectiveEndDate) {
    
    
    
    this.effectiveEndDate = effectiveEndDate;
  }


  public EmployeePositionData payGroupId(String payGroupId) {
    
    
    
    
    this.payGroupId = payGroupId;
    return this;
  }

   /**
   * Unique identifier of the pay group in Paycor&#39;s system. Generated by Paycor.
   * @return payGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52a2s23-0000-0000-0000-0007d0009840", value = "Unique identifier of the pay group in Paycor's system. Generated by Paycor.")

  public String getPayGroupId() {
    return payGroupId;
  }


  public void setPayGroupId(String payGroupId) {
    
    
    
    this.payGroupId = payGroupId;
  }


  public EmployeePositionData manager(Manager manager) {
    
    
    
    
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Manager getManager() {
    return manager;
  }


  public void setManager(Manager manager) {
    
    
    
    this.manager = manager;
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
   * @return the EmployeePositionData instance itself
   */
  public EmployeePositionData putAdditionalProperty(String key, Object value) {
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
    EmployeePositionData employeePositionData = (EmployeePositionData) o;
    return Objects.equals(this.jobTitle, employeePositionData.jobTitle) &&
        Objects.equals(this.jobCode, employeePositionData.jobCode) &&
        Objects.equals(this.effectiveStartDate, employeePositionData.effectiveStartDate) &&
        Objects.equals(this.effectiveEndDate, employeePositionData.effectiveEndDate) &&
        Objects.equals(this.payGroupId, employeePositionData.payGroupId) &&
        Objects.equals(this.manager, employeePositionData.manager)&&
        Objects.equals(this.additionalProperties, employeePositionData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobTitle, jobCode, effectiveStartDate, effectiveEndDate, payGroupId, manager, additionalProperties);
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
    sb.append("class EmployeePositionData {\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    jobCode: ").append(toIndentedString(jobCode)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    payGroupId: ").append(toIndentedString(payGroupId)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
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
    openapiFields.add("JobTitle");
    openapiFields.add("JobCode");
    openapiFields.add("EffectiveStartDate");
    openapiFields.add("EffectiveEndDate");
    openapiFields.add("PayGroupId");
    openapiFields.add("Manager");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeePositionData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeePositionData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeePositionData is not found in the empty JSON string", EmployeePositionData.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("JobTitle").isJsonNull() && (jsonObj.get("JobTitle") != null && !jsonObj.get("JobTitle").isJsonNull()) && !jsonObj.get("JobTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JobTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JobTitle").toString()));
      }
      if (!jsonObj.get("JobCode").isJsonNull() && (jsonObj.get("JobCode") != null && !jsonObj.get("JobCode").isJsonNull()) && !jsonObj.get("JobCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JobCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JobCode").toString()));
      }
      if ((jsonObj.get("PayGroupId") != null && !jsonObj.get("PayGroupId").isJsonNull()) && !jsonObj.get("PayGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PayGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PayGroupId").toString()));
      }
      // validate the optional field `Manager`
      if (jsonObj.get("Manager") != null && !jsonObj.get("Manager").isJsonNull()) {
        Manager.validateJsonObject(jsonObj.getAsJsonObject("Manager"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeePositionData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeePositionData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeePositionData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeePositionData.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeePositionData>() {
           @Override
           public void write(JsonWriter out, EmployeePositionData value) throws IOException {
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
           public EmployeePositionData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeePositionData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeePositionData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeePositionData
  * @throws IOException if the JSON string is invalid with respect to EmployeePositionData
  */
  public static EmployeePositionData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeePositionData.class);
  }

 /**
  * Convert an instance of EmployeePositionData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

