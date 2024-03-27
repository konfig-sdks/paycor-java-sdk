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
import com.konfigthis.client.model.PayStubDeductionItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * PayStubDeduction
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayStubDeduction {
  public static final String SERIALIZED_NAME_TOTAL_DEDUCTIONS_AMOUNT = "TotalDeductionsAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DEDUCTIONS_AMOUNT)
  private Double totalDeductionsAmount;

  public static final String SERIALIZED_NAME_DEDUCTIONS = "Deductions";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS)
  private List<PayStubDeductionItem> deductions = null;

  public PayStubDeduction() {
  }

  public PayStubDeduction totalDeductionsAmount(Double totalDeductionsAmount) {
    
    
    
    
    this.totalDeductionsAmount = totalDeductionsAmount;
    return this;
  }

  public PayStubDeduction totalDeductionsAmount(Integer totalDeductionsAmount) {
    
    
    
    
    this.totalDeductionsAmount = totalDeductionsAmount.doubleValue();
    return this;
  }

   /**
   * Sum of all deduction amounts in Deductions collection
   * @return totalDeductionsAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sum of all deduction amounts in Deductions collection")

  public Double getTotalDeductionsAmount() {
    return totalDeductionsAmount;
  }


  public void setTotalDeductionsAmount(Double totalDeductionsAmount) {
    
    
    
    this.totalDeductionsAmount = totalDeductionsAmount;
  }


  public PayStubDeduction deductions(List<PayStubDeductionItem> deductions) {
    
    
    
    
    this.deductions = deductions;
    return this;
  }

  public PayStubDeduction addDeductionsItem(PayStubDeductionItem deductionsItem) {
    if (this.deductions == null) {
      this.deductions = new ArrayList<>();
    }
    this.deductions.add(deductionsItem);
    return this;
  }

   /**
   * List of Deductions included on the paycheck
   * @return deductions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Deductions included on the paycheck")

  public List<PayStubDeductionItem> getDeductions() {
    return deductions;
  }


  public void setDeductions(List<PayStubDeductionItem> deductions) {
    
    
    
    this.deductions = deductions;
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
   * @return the PayStubDeduction instance itself
   */
  public PayStubDeduction putAdditionalProperty(String key, Object value) {
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
    PayStubDeduction payStubDeduction = (PayStubDeduction) o;
    return Objects.equals(this.totalDeductionsAmount, payStubDeduction.totalDeductionsAmount) &&
        Objects.equals(this.deductions, payStubDeduction.deductions)&&
        Objects.equals(this.additionalProperties, payStubDeduction.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalDeductionsAmount, deductions, additionalProperties);
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
    sb.append("class PayStubDeduction {\n");
    sb.append("    totalDeductionsAmount: ").append(toIndentedString(totalDeductionsAmount)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
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
    openapiFields.add("TotalDeductionsAmount");
    openapiFields.add("Deductions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayStubDeduction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayStubDeduction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayStubDeduction is not found in the empty JSON string", PayStubDeduction.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("Deductions") != null && !jsonObj.get("Deductions").isJsonNull()) {
        JsonArray jsonArraydeductions = jsonObj.getAsJsonArray("Deductions");
        if (jsonArraydeductions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Deductions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Deductions` to be an array in the JSON string but got `%s`", jsonObj.get("Deductions").toString()));
          }

          // validate the optional field `Deductions` (array)
          for (int i = 0; i < jsonArraydeductions.size(); i++) {
            PayStubDeductionItem.validateJsonObject(jsonArraydeductions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayStubDeduction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayStubDeduction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayStubDeduction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayStubDeduction.class));

       return (TypeAdapter<T>) new TypeAdapter<PayStubDeduction>() {
           @Override
           public void write(JsonWriter out, PayStubDeduction value) throws IOException {
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
           public PayStubDeduction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayStubDeduction instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayStubDeduction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayStubDeduction
  * @throws IOException if the JSON string is invalid with respect to PayStubDeduction
  */
  public static PayStubDeduction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayStubDeduction.class);
  }

 /**
  * Convert an instance of PayStubDeduction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

