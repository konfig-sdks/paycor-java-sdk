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
 * PayStubEarningItem
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayStubEarningItem {
  public static final String SERIALIZED_NAME_EARNING_CODE = "EarningCode";
  @SerializedName(SERIALIZED_NAME_EARNING_CODE)
  private String earningCode;

  public static final String SERIALIZED_NAME_EARNING_DESCRIPTION = "EarningDescription";
  @SerializedName(SERIALIZED_NAME_EARNING_DESCRIPTION)
  private String earningDescription;

  public static final String SERIALIZED_NAME_GLOBAL_EARNING_CODE = "GlobalEarningCode";
  @SerializedName(SERIALIZED_NAME_GLOBAL_EARNING_CODE)
  private String globalEarningCode;

  public static final String SERIALIZED_NAME_EARNING_AMOUNT = "EarningAmount";
  @SerializedName(SERIALIZED_NAME_EARNING_AMOUNT)
  private Double earningAmount;

  public static final String SERIALIZED_NAME_EARNING_HOURS = "EarningHours";
  @SerializedName(SERIALIZED_NAME_EARNING_HOURS)
  private Double earningHours;

  public static final String SERIALIZED_NAME_EARNING_RATE = "EarningRate";
  @SerializedName(SERIALIZED_NAME_EARNING_RATE)
  private Double earningRate;

  public PayStubEarningItem() {
  }

  public PayStubEarningItem earningCode(String earningCode) {
    
    
    
    
    this.earningCode = earningCode;
    return this;
  }

   /**
   * Earning code printed on paycheck, assigned via LegalEntityEarning
   * @return earningCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Reg", value = "Earning code printed on paycheck, assigned via LegalEntityEarning")

  public String getEarningCode() {
    return earningCode;
  }


  public void setEarningCode(String earningCode) {
    
    
    
    this.earningCode = earningCode;
  }


  public PayStubEarningItem earningDescription(String earningDescription) {
    
    
    
    
    this.earningDescription = earningDescription;
    return this;
  }

   /**
   * Earning description assigned by Legal Entity, assigned via LegalEntityEarning
   * @return earningDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Regular", value = "Earning description assigned by Legal Entity, assigned via LegalEntityEarning")

  public String getEarningDescription() {
    return earningDescription;
  }


  public void setEarningDescription(String earningDescription) {
    
    
    
    this.earningDescription = earningDescription;
  }


  public PayStubEarningItem globalEarningCode(String globalEarningCode) {
    
    
    
    
    this.globalEarningCode = globalEarningCode;
    return this;
  }

   /**
   * Paycor&#39;s Global earning code that is linked to this LegalEntityEarning
   * @return globalEarningCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Reg", value = "Paycor's Global earning code that is linked to this LegalEntityEarning")

  public String getGlobalEarningCode() {
    return globalEarningCode;
  }


  public void setGlobalEarningCode(String globalEarningCode) {
    
    
    
    this.globalEarningCode = globalEarningCode;
  }


  public PayStubEarningItem earningAmount(Double earningAmount) {
    
    
    
    
    this.earningAmount = earningAmount;
    return this;
  }

  public PayStubEarningItem earningAmount(Integer earningAmount) {
    
    
    
    
    this.earningAmount = earningAmount.doubleValue();
    return this;
  }

   /**
   * Amount paid via this earning (USD). Includes Hours*Rate and Salary income.
   * @return earningAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4800", value = "Amount paid via this earning (USD). Includes Hours*Rate and Salary income.")

  public Double getEarningAmount() {
    return earningAmount;
  }


  public void setEarningAmount(Double earningAmount) {
    
    
    
    this.earningAmount = earningAmount;
  }


  public PayStubEarningItem earningHours(Double earningHours) {
    
    
    
    
    this.earningHours = earningHours;
    return this;
  }

  public PayStubEarningItem earningHours(Integer earningHours) {
    
    
    
    
    this.earningHours = earningHours.doubleValue();
    return this;
  }

   /**
   * Hours covered by this earning, if provided
   * @return earningHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "160", value = "Hours covered by this earning, if provided")

  public Double getEarningHours() {
    return earningHours;
  }


  public void setEarningHours(Double earningHours) {
    
    
    
    this.earningHours = earningHours;
  }


  public PayStubEarningItem earningRate(Double earningRate) {
    
    
    
    
    this.earningRate = earningRate;
    return this;
  }

  public PayStubEarningItem earningRate(Integer earningRate) {
    
    
    
    
    this.earningRate = earningRate.doubleValue();
    return this;
  }

   /**
   * Hourly rate paid by this earning, if provided
   * @return earningRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "Hourly rate paid by this earning, if provided")

  public Double getEarningRate() {
    return earningRate;
  }


  public void setEarningRate(Double earningRate) {
    
    
    
    this.earningRate = earningRate;
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
   * @return the PayStubEarningItem instance itself
   */
  public PayStubEarningItem putAdditionalProperty(String key, Object value) {
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
    PayStubEarningItem payStubEarningItem = (PayStubEarningItem) o;
    return Objects.equals(this.earningCode, payStubEarningItem.earningCode) &&
        Objects.equals(this.earningDescription, payStubEarningItem.earningDescription) &&
        Objects.equals(this.globalEarningCode, payStubEarningItem.globalEarningCode) &&
        Objects.equals(this.earningAmount, payStubEarningItem.earningAmount) &&
        Objects.equals(this.earningHours, payStubEarningItem.earningHours) &&
        Objects.equals(this.earningRate, payStubEarningItem.earningRate)&&
        Objects.equals(this.additionalProperties, payStubEarningItem.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(earningCode, earningDescription, globalEarningCode, earningAmount, earningHours, earningRate, additionalProperties);
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
    sb.append("class PayStubEarningItem {\n");
    sb.append("    earningCode: ").append(toIndentedString(earningCode)).append("\n");
    sb.append("    earningDescription: ").append(toIndentedString(earningDescription)).append("\n");
    sb.append("    globalEarningCode: ").append(toIndentedString(globalEarningCode)).append("\n");
    sb.append("    earningAmount: ").append(toIndentedString(earningAmount)).append("\n");
    sb.append("    earningHours: ").append(toIndentedString(earningHours)).append("\n");
    sb.append("    earningRate: ").append(toIndentedString(earningRate)).append("\n");
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
    openapiFields.add("EarningCode");
    openapiFields.add("EarningDescription");
    openapiFields.add("GlobalEarningCode");
    openapiFields.add("EarningAmount");
    openapiFields.add("EarningHours");
    openapiFields.add("EarningRate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayStubEarningItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayStubEarningItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayStubEarningItem is not found in the empty JSON string", PayStubEarningItem.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("EarningCode").isJsonNull() && (jsonObj.get("EarningCode") != null && !jsonObj.get("EarningCode").isJsonNull()) && !jsonObj.get("EarningCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EarningCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EarningCode").toString()));
      }
      if (!jsonObj.get("EarningDescription").isJsonNull() && (jsonObj.get("EarningDescription") != null && !jsonObj.get("EarningDescription").isJsonNull()) && !jsonObj.get("EarningDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EarningDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EarningDescription").toString()));
      }
      if (!jsonObj.get("GlobalEarningCode").isJsonNull() && (jsonObj.get("GlobalEarningCode") != null && !jsonObj.get("GlobalEarningCode").isJsonNull()) && !jsonObj.get("GlobalEarningCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GlobalEarningCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GlobalEarningCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayStubEarningItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayStubEarningItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayStubEarningItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayStubEarningItem.class));

       return (TypeAdapter<T>) new TypeAdapter<PayStubEarningItem>() {
           @Override
           public void write(JsonWriter out, PayStubEarningItem value) throws IOException {
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
           public PayStubEarningItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayStubEarningItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayStubEarningItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayStubEarningItem
  * @throws IOException if the JSON string is invalid with respect to PayStubEarningItem
  */
  public static PayStubEarningItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayStubEarningItem.class);
  }

 /**
  * Convert an instance of PayStubEarningItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

