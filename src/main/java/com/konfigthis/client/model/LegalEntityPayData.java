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
 * Each instance of this object represents an Employee being paid on a specific date.   Provides link to the associated Legal Entity information.
 */
@ApiModel(description = "Each instance of this object represents an Employee being paid on a specific date.   Provides link to the associated Legal Entity information.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LegalEntityPayData {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "EmployeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_CHECK_DATE = "CheckDate";
  @SerializedName(SERIALIZED_NAME_CHECK_DATE)
  private OffsetDateTime checkDate;

  public static final String SERIALIZED_NAME_PROCESS_DATE = "ProcessDate";
  @SerializedName(SERIALIZED_NAME_PROCESS_DATE)
  private OffsetDateTime processDate;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY = "LegalEntity";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY)
  private ResourceReference legalEntity;

  public static final String SERIALIZED_NAME_EMPLOYEE_PAYSTUB = "EmployeePaystub";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_PAYSTUB)
  private ResourceReference employeePaystub;

  public LegalEntityPayData() {
  }

  public LegalEntityPayData employeeId(String employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Unique identifier of this employee who was paid.
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "36f45f30-9a35-0000-0000-000001000000", value = "Unique identifier of this employee who was paid.")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public LegalEntityPayData checkDate(OffsetDateTime checkDate) {
    
    
    
    
    this.checkDate = checkDate;
    return this;
  }

   /**
   * The paycheck date for this employee. Also referred to as Pay Date.
   * @return checkDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The paycheck date for this employee. Also referred to as Pay Date.")

  public OffsetDateTime getCheckDate() {
    return checkDate;
  }


  public void setCheckDate(OffsetDateTime checkDate) {
    
    
    
    this.checkDate = checkDate;
  }


  public LegalEntityPayData processDate(OffsetDateTime processDate) {
    
    
    
    
    this.processDate = processDate;
    return this;
  }

   /**
   * The internal pay processing date for this employee. 
   * @return processDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The internal pay processing date for this employee. ")

  public OffsetDateTime getProcessDate() {
    return processDate;
  }


  public void setProcessDate(OffsetDateTime processDate) {
    
    
    
    this.processDate = processDate;
  }


  public LegalEntityPayData legalEntity(ResourceReference legalEntity) {
    
    
    
    
    this.legalEntity = legalEntity;
    return this;
  }

   /**
   * Get legalEntity
   * @return legalEntity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getLegalEntity() {
    return legalEntity;
  }


  public void setLegalEntity(ResourceReference legalEntity) {
    
    
    
    this.legalEntity = legalEntity;
  }


  public LegalEntityPayData employeePaystub(ResourceReference employeePaystub) {
    
    
    
    
    this.employeePaystub = employeePaystub;
    return this;
  }

   /**
   * Get employeePaystub
   * @return employeePaystub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getEmployeePaystub() {
    return employeePaystub;
  }


  public void setEmployeePaystub(ResourceReference employeePaystub) {
    
    
    
    this.employeePaystub = employeePaystub;
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
   * @return the LegalEntityPayData instance itself
   */
  public LegalEntityPayData putAdditionalProperty(String key, Object value) {
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
    LegalEntityPayData legalEntityPayData = (LegalEntityPayData) o;
    return Objects.equals(this.employeeId, legalEntityPayData.employeeId) &&
        Objects.equals(this.checkDate, legalEntityPayData.checkDate) &&
        Objects.equals(this.processDate, legalEntityPayData.processDate) &&
        Objects.equals(this.legalEntity, legalEntityPayData.legalEntity) &&
        Objects.equals(this.employeePaystub, legalEntityPayData.employeePaystub)&&
        Objects.equals(this.additionalProperties, legalEntityPayData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, checkDate, processDate, legalEntity, employeePaystub, additionalProperties);
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
    sb.append("class LegalEntityPayData {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    checkDate: ").append(toIndentedString(checkDate)).append("\n");
    sb.append("    processDate: ").append(toIndentedString(processDate)).append("\n");
    sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
    sb.append("    employeePaystub: ").append(toIndentedString(employeePaystub)).append("\n");
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
    openapiFields.add("EmployeeId");
    openapiFields.add("CheckDate");
    openapiFields.add("ProcessDate");
    openapiFields.add("LegalEntity");
    openapiFields.add("EmployeePaystub");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LegalEntityPayData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LegalEntityPayData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LegalEntityPayData is not found in the empty JSON string", LegalEntityPayData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("EmployeeId") != null && !jsonObj.get("EmployeeId").isJsonNull()) && !jsonObj.get("EmployeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EmployeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EmployeeId").toString()));
      }
      // validate the optional field `LegalEntity`
      if (jsonObj.get("LegalEntity") != null && !jsonObj.get("LegalEntity").isJsonNull()) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("LegalEntity"));
      }
      // validate the optional field `EmployeePaystub`
      if (jsonObj.get("EmployeePaystub") != null && !jsonObj.get("EmployeePaystub").isJsonNull()) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("EmployeePaystub"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LegalEntityPayData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LegalEntityPayData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LegalEntityPayData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LegalEntityPayData.class));

       return (TypeAdapter<T>) new TypeAdapter<LegalEntityPayData>() {
           @Override
           public void write(JsonWriter out, LegalEntityPayData value) throws IOException {
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
           public LegalEntityPayData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LegalEntityPayData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LegalEntityPayData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LegalEntityPayData
  * @throws IOException if the JSON string is invalid with respect to LegalEntityPayData
  */
  public static LegalEntityPayData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LegalEntityPayData.class);
  }

 /**
  * Convert an instance of LegalEntityPayData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

