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
 * LaborCode4
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LaborCode4 {
  public static final String SERIALIZED_NAME_LABOR_CODE_ID = "LaborCodeId";
  @SerializedName(SERIALIZED_NAME_LABOR_CODE_ID)
  private String laborCodeId;

  public static final String SERIALIZED_NAME_LABOR_CATEGORY_ID = "LaborCategoryId";
  @SerializedName(SERIALIZED_NAME_LABOR_CATEGORY_ID)
  private String laborCategoryId;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY_ID = "LegalEntityId";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_ID)
  private Integer legalEntityId;

  public static final String SERIALIZED_NAME_LABOR_CODE_NAME = "LaborCodeName";
  @SerializedName(SERIALIZED_NAME_LABOR_CODE_NAME)
  private String laborCodeName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CODE = "Code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "EffectiveStartDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private OffsetDateTime effectiveStartDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "EffectiveEndDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private OffsetDateTime effectiveEndDate;

  public LaborCode4() {
  }

  public LaborCode4 laborCodeId(String laborCodeId) {
    
    
    
    
    this.laborCodeId = laborCodeId;
    return this;
  }

   /**
   * Id of the Labor Code 
   * @return laborCodeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12e0e1c9-e8dc-ec11-912c-0050569f27b8", value = "Id of the Labor Code ")

  public String getLaborCodeId() {
    return laborCodeId;
  }


  public void setLaborCodeId(String laborCodeId) {
    
    
    
    this.laborCodeId = laborCodeId;
  }


  public LaborCode4 laborCategoryId(String laborCategoryId) {
    
    
    
    
    this.laborCategoryId = laborCategoryId;
    return this;
  }

   /**
   * Id of the Labor Category 
   * @return laborCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12e0e1c9-e8dc-ec11-912c-0050569f27b8", value = "Id of the Labor Category ")

  public String getLaborCategoryId() {
    return laborCategoryId;
  }


  public void setLaborCategoryId(String laborCategoryId) {
    
    
    
    this.laborCategoryId = laborCategoryId;
  }


  public LaborCode4 legalEntityId(Integer legalEntityId) {
    
    
    
    
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * Unique identifyer of legal entity
   * @return legalEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "122900", value = "Unique identifyer of legal entity")

  public Integer getLegalEntityId() {
    return legalEntityId;
  }


  public void setLegalEntityId(Integer legalEntityId) {
    
    
    
    this.legalEntityId = legalEntityId;
  }


  public LaborCode4 laborCodeName(String laborCodeName) {
    
    
    
    
    this.laborCodeName = laborCodeName;
    return this;
  }

   /**
   * Unique name of labor code in the labor category
   * @return laborCodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IT", value = "Unique name of labor code in the labor category")

  public String getLaborCodeName() {
    return laborCodeName;
  }


  public void setLaborCodeName(String laborCodeName) {
    
    
    
    this.laborCodeName = laborCodeName;
  }


  public LaborCode4 description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Description of labor code
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "labor code effective until New year", value = "Description of labor code")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public LaborCode4 code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * textual code of labor code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "code 1", value = "textual code of labor code")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public LaborCode4 effectiveStartDate(OffsetDateTime effectiveStartDate) {
    
    
    
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * Effective start date of labor code
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Effective start date of labor code")

  public OffsetDateTime getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(OffsetDateTime effectiveStartDate) {
    
    
    
    this.effectiveStartDate = effectiveStartDate;
  }


  public LaborCode4 effectiveEndDate(OffsetDateTime effectiveEndDate) {
    
    
    
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * Effective end date of labor code
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Effective end date of labor code")

  public OffsetDateTime getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(OffsetDateTime effectiveEndDate) {
    
    
    
    this.effectiveEndDate = effectiveEndDate;
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
   * @return the LaborCode4 instance itself
   */
  public LaborCode4 putAdditionalProperty(String key, Object value) {
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
    LaborCode4 laborCode4 = (LaborCode4) o;
    return Objects.equals(this.laborCodeId, laborCode4.laborCodeId) &&
        Objects.equals(this.laborCategoryId, laborCode4.laborCategoryId) &&
        Objects.equals(this.legalEntityId, laborCode4.legalEntityId) &&
        Objects.equals(this.laborCodeName, laborCode4.laborCodeName) &&
        Objects.equals(this.description, laborCode4.description) &&
        Objects.equals(this.code, laborCode4.code) &&
        Objects.equals(this.effectiveStartDate, laborCode4.effectiveStartDate) &&
        Objects.equals(this.effectiveEndDate, laborCode4.effectiveEndDate)&&
        Objects.equals(this.additionalProperties, laborCode4.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(laborCodeId, laborCategoryId, legalEntityId, laborCodeName, description, code, effectiveStartDate, effectiveEndDate, additionalProperties);
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
    sb.append("class LaborCode4 {\n");
    sb.append("    laborCodeId: ").append(toIndentedString(laborCodeId)).append("\n");
    sb.append("    laborCategoryId: ").append(toIndentedString(laborCategoryId)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    laborCodeName: ").append(toIndentedString(laborCodeName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
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
    openapiFields.add("LaborCodeId");
    openapiFields.add("LaborCategoryId");
    openapiFields.add("LegalEntityId");
    openapiFields.add("LaborCodeName");
    openapiFields.add("Description");
    openapiFields.add("Code");
    openapiFields.add("EffectiveStartDate");
    openapiFields.add("EffectiveEndDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LaborCode4
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LaborCode4.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LaborCode4 is not found in the empty JSON string", LaborCode4.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("LaborCodeId") != null && !jsonObj.get("LaborCodeId").isJsonNull()) && !jsonObj.get("LaborCodeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LaborCodeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LaborCodeId").toString()));
      }
      if ((jsonObj.get("LaborCategoryId") != null && !jsonObj.get("LaborCategoryId").isJsonNull()) && !jsonObj.get("LaborCategoryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LaborCategoryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LaborCategoryId").toString()));
      }
      if (!jsonObj.get("LaborCodeName").isJsonNull() && (jsonObj.get("LaborCodeName") != null && !jsonObj.get("LaborCodeName").isJsonNull()) && !jsonObj.get("LaborCodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LaborCodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LaborCodeName").toString()));
      }
      if (!jsonObj.get("Description").isJsonNull() && (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if (!jsonObj.get("Code").isJsonNull() && (jsonObj.get("Code") != null && !jsonObj.get("Code").isJsonNull()) && !jsonObj.get("Code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LaborCode4.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LaborCode4' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LaborCode4> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LaborCode4.class));

       return (TypeAdapter<T>) new TypeAdapter<LaborCode4>() {
           @Override
           public void write(JsonWriter out, LaborCode4 value) throws IOException {
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
           public LaborCode4 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LaborCode4 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LaborCode4 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LaborCode4
  * @throws IOException if the JSON string is invalid with respect to LaborCode4
  */
  public static LaborCode4 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LaborCode4.class);
  }

 /**
  * Convert an instance of LaborCode4 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

