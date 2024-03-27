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
import com.konfigthis.client.model.LegalEntityWorkLocationAddress;
import com.konfigthis.client.model.WorkLocationPhone;
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
 * LegalEntityWorkLocation
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LegalEntityWorkLocation {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESSES = "Addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<LegalEntityWorkLocationAddress> addresses = null;

  public static final String SERIALIZED_NAME_PHONES = "Phones";
  @SerializedName(SERIALIZED_NAME_PHONES)
  private List<WorkLocationPhone> phones = null;

  public static final String SERIALIZED_NAME_LOCATION_NUMBER = "LocationNumber";
  @SerializedName(SERIALIZED_NAME_LOCATION_NUMBER)
  private String locationNumber;

  public static final String SERIALIZED_NAME_STORE_ID = "StoreId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_IS_FMLA_ELIGIBLE = "IsFmlaEligible";
  @SerializedName(SERIALIZED_NAME_IS_FMLA_ELIGIBLE)
  private Boolean isFmlaEligible;

  public LegalEntityWorkLocation() {
  }

  public LegalEntityWorkLocation id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the legal entity&#39;s work location in Paycor&#39;s system. Generated by Paycor.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5245ae3d-e570-0000-0000-000066000000", value = "Unique identifier of the legal entity's work location in Paycor's system. Generated by Paycor.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public LegalEntityWorkLocation name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the legal entity&#39;s work location.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACME East is an open concept office.", value = "Name of the legal entity's work location.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public LegalEntityWorkLocation addresses(List<LegalEntityWorkLocationAddress> addresses) {
    
    
    
    
    this.addresses = addresses;
    return this;
  }

  public LegalEntityWorkLocation addAddressesItem(LegalEntityWorkLocationAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * A list of legal entity&#39;s work location&#39;s addresses.
   * @return addresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of legal entity's work location's addresses.")

  public List<LegalEntityWorkLocationAddress> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<LegalEntityWorkLocationAddress> addresses) {
    
    
    
    this.addresses = addresses;
  }


  public LegalEntityWorkLocation phones(List<WorkLocationPhone> phones) {
    
    
    
    
    this.phones = phones;
    return this;
  }

  public LegalEntityWorkLocation addPhonesItem(WorkLocationPhone phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * A list of the legal entity&#39;s work location&#39;s phone numbers.             
   * @return phones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the legal entity's work location's phone numbers.             ")

  public List<WorkLocationPhone> getPhones() {
    return phones;
  }


  public void setPhones(List<WorkLocationPhone> phones) {
    
    
    
    this.phones = phones;
  }


  public LegalEntityWorkLocation locationNumber(String locationNumber) {
    
    
    
    
    this.locationNumber = locationNumber;
    return this;
  }

   /**
   * Location Number of the work location.
   * @return locationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Number", value = "Location Number of the work location.")

  public String getLocationNumber() {
    return locationNumber;
  }


  public void setLocationNumber(String locationNumber) {
    
    
    
    this.locationNumber = locationNumber;
  }


  public LegalEntityWorkLocation storeId(String storeId) {
    
    
    
    
    this.storeId = storeId;
    return this;
  }

   /**
   * Unique identifier of the work location store. StoreId is used for clients with WOTC Service only, defaults to Worklocation name if not provided.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18", value = "Unique identifier of the work location store. StoreId is used for clients with WOTC Service only, defaults to Worklocation name if not provided.")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    
    
    
    this.storeId = storeId;
  }


  public LegalEntityWorkLocation isFmlaEligible(Boolean isFmlaEligible) {
    
    
    
    
    this.isFmlaEligible = isFmlaEligible;
    return this;
  }

   /**
   * Flag which determines if work location is FMLA eligible (Family and Medical Leave Act).
   * @return isFmlaEligible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Flag which determines if work location is FMLA eligible (Family and Medical Leave Act).")

  public Boolean getIsFmlaEligible() {
    return isFmlaEligible;
  }


  public void setIsFmlaEligible(Boolean isFmlaEligible) {
    
    
    
    this.isFmlaEligible = isFmlaEligible;
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
   * @return the LegalEntityWorkLocation instance itself
   */
  public LegalEntityWorkLocation putAdditionalProperty(String key, Object value) {
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
    LegalEntityWorkLocation legalEntityWorkLocation = (LegalEntityWorkLocation) o;
    return Objects.equals(this.id, legalEntityWorkLocation.id) &&
        Objects.equals(this.name, legalEntityWorkLocation.name) &&
        Objects.equals(this.addresses, legalEntityWorkLocation.addresses) &&
        Objects.equals(this.phones, legalEntityWorkLocation.phones) &&
        Objects.equals(this.locationNumber, legalEntityWorkLocation.locationNumber) &&
        Objects.equals(this.storeId, legalEntityWorkLocation.storeId) &&
        Objects.equals(this.isFmlaEligible, legalEntityWorkLocation.isFmlaEligible)&&
        Objects.equals(this.additionalProperties, legalEntityWorkLocation.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, addresses, phones, locationNumber, storeId, isFmlaEligible, additionalProperties);
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
    sb.append("class LegalEntityWorkLocation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    locationNumber: ").append(toIndentedString(locationNumber)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    isFmlaEligible: ").append(toIndentedString(isFmlaEligible)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Addresses");
    openapiFields.add("Phones");
    openapiFields.add("LocationNumber");
    openapiFields.add("StoreId");
    openapiFields.add("IsFmlaEligible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LegalEntityWorkLocation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LegalEntityWorkLocation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LegalEntityWorkLocation is not found in the empty JSON string", LegalEntityWorkLocation.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if (!jsonObj.get("Name").isJsonNull() && (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (jsonObj.get("Addresses") != null && !jsonObj.get("Addresses").isJsonNull()) {
        JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("Addresses");
        if (jsonArrayaddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Addresses` to be an array in the JSON string but got `%s`", jsonObj.get("Addresses").toString()));
          }

          // validate the optional field `Addresses` (array)
          for (int i = 0; i < jsonArrayaddresses.size(); i++) {
            LegalEntityWorkLocationAddress.validateJsonObject(jsonArrayaddresses.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("Phones") != null && !jsonObj.get("Phones").isJsonNull()) {
        JsonArray jsonArrayphones = jsonObj.getAsJsonArray("Phones");
        if (jsonArrayphones != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Phones").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Phones` to be an array in the JSON string but got `%s`", jsonObj.get("Phones").toString()));
          }

          // validate the optional field `Phones` (array)
          for (int i = 0; i < jsonArrayphones.size(); i++) {
            WorkLocationPhone.validateJsonObject(jsonArrayphones.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("LocationNumber").isJsonNull() && (jsonObj.get("LocationNumber") != null && !jsonObj.get("LocationNumber").isJsonNull()) && !jsonObj.get("LocationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LocationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LocationNumber").toString()));
      }
      if (!jsonObj.get("StoreId").isJsonNull() && (jsonObj.get("StoreId") != null && !jsonObj.get("StoreId").isJsonNull()) && !jsonObj.get("StoreId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StoreId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StoreId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LegalEntityWorkLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LegalEntityWorkLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LegalEntityWorkLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LegalEntityWorkLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<LegalEntityWorkLocation>() {
           @Override
           public void write(JsonWriter out, LegalEntityWorkLocation value) throws IOException {
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
           public LegalEntityWorkLocation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LegalEntityWorkLocation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LegalEntityWorkLocation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LegalEntityWorkLocation
  * @throws IOException if the JSON string is invalid with respect to LegalEntityWorkLocation
  */
  public static LegalEntityWorkLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LegalEntityWorkLocation.class);
  }

 /**
  * Convert an instance of LegalEntityWorkLocation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

