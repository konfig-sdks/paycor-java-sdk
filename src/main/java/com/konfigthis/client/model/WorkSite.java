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
 * WorkSite
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkSite {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STREET_LINE1 = "StreetLine1";
  @SerializedName(SERIALIZED_NAME_STREET_LINE1)
  private String streetLine1;

  public static final String SERIALIZED_NAME_STREET_LINE2 = "StreetLine2";
  @SerializedName(SERIALIZED_NAME_STREET_LINE2)
  private String streetLine2;

  public static final String SERIALIZED_NAME_CITY = "City";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP_CODE = "ZipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "PhoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public WorkSite() {
  }

  public WorkSite id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Work Site identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "b95b8067-09c9-46d2-52d8-08da7531eb4f", value = "Work Site identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public WorkSite name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Work Site name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Paycor Cincinati office", value = "Work Site name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public WorkSite streetLine1(String streetLine1) {
    
    
    
    
    this.streetLine1 = streetLine1;
    return this;
  }

   /**
   * First line of street address information.
   * @return streetLine1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4811 Montgomery Road", value = "First line of street address information.")

  public String getStreetLine1() {
    return streetLine1;
  }


  public void setStreetLine1(String streetLine1) {
    
    
    
    this.streetLine1 = streetLine1;
  }


  public WorkSite streetLine2(String streetLine2) {
    
    
    
    
    this.streetLine2 = streetLine2;
    return this;
  }

   /**
   * Additional line of street address information.
   * @return streetLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Building 6", value = "Additional line of street address information.")

  public String getStreetLine2() {
    return streetLine2;
  }


  public void setStreetLine2(String streetLine2) {
    
    
    
    this.streetLine2 = streetLine2;
  }


  public WorkSite city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * City in the address.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cincinnati", value = "City in the address.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public WorkSite state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * State in the address.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OH", value = "State in the address.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public WorkSite zipCode(String zipCode) {
    
    
    
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Zip code in the address.
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45212-0341", value = "Zip code in the address.")

  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    
    
    
    this.zipCode = zipCode;
  }


  public WorkSite country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Country in the address.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USA", value = "Country in the address.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public WorkSite phoneNumber(String phoneNumber) {
    
    
    
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Worksite Phone
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "555-2300", value = "Worksite Phone")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    
    
    
    this.phoneNumber = phoneNumber;
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
   * @return the WorkSite instance itself
   */
  public WorkSite putAdditionalProperty(String key, Object value) {
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
    WorkSite workSite = (WorkSite) o;
    return Objects.equals(this.id, workSite.id) &&
        Objects.equals(this.name, workSite.name) &&
        Objects.equals(this.streetLine1, workSite.streetLine1) &&
        Objects.equals(this.streetLine2, workSite.streetLine2) &&
        Objects.equals(this.city, workSite.city) &&
        Objects.equals(this.state, workSite.state) &&
        Objects.equals(this.zipCode, workSite.zipCode) &&
        Objects.equals(this.country, workSite.country) &&
        Objects.equals(this.phoneNumber, workSite.phoneNumber)&&
        Objects.equals(this.additionalProperties, workSite.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, streetLine1, streetLine2, city, state, zipCode, country, phoneNumber, additionalProperties);
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
    sb.append("class WorkSite {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    streetLine1: ").append(toIndentedString(streetLine1)).append("\n");
    sb.append("    streetLine2: ").append(toIndentedString(streetLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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
    openapiFields.add("StreetLine1");
    openapiFields.add("StreetLine2");
    openapiFields.add("City");
    openapiFields.add("State");
    openapiFields.add("ZipCode");
    openapiFields.add("Country");
    openapiFields.add("PhoneNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkSite
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkSite.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkSite is not found in the empty JSON string", WorkSite.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if (!jsonObj.get("Name").isJsonNull() && (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (!jsonObj.get("StreetLine1").isJsonNull() && (jsonObj.get("StreetLine1") != null && !jsonObj.get("StreetLine1").isJsonNull()) && !jsonObj.get("StreetLine1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StreetLine1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StreetLine1").toString()));
      }
      if (!jsonObj.get("StreetLine2").isJsonNull() && (jsonObj.get("StreetLine2") != null && !jsonObj.get("StreetLine2").isJsonNull()) && !jsonObj.get("StreetLine2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StreetLine2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StreetLine2").toString()));
      }
      if (!jsonObj.get("City").isJsonNull() && (jsonObj.get("City") != null && !jsonObj.get("City").isJsonNull()) && !jsonObj.get("City").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `City` to be a primitive type in the JSON string but got `%s`", jsonObj.get("City").toString()));
      }
      if (!jsonObj.get("State").isJsonNull() && (jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) && !jsonObj.get("State").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `State` to be a primitive type in the JSON string but got `%s`", jsonObj.get("State").toString()));
      }
      if (!jsonObj.get("ZipCode").isJsonNull() && (jsonObj.get("ZipCode") != null && !jsonObj.get("ZipCode").isJsonNull()) && !jsonObj.get("ZipCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ZipCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ZipCode").toString()));
      }
      if (!jsonObj.get("Country").isJsonNull() && (jsonObj.get("Country") != null && !jsonObj.get("Country").isJsonNull()) && !jsonObj.get("Country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Country").toString()));
      }
      if (!jsonObj.get("PhoneNumber").isJsonNull() && (jsonObj.get("PhoneNumber") != null && !jsonObj.get("PhoneNumber").isJsonNull()) && !jsonObj.get("PhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PhoneNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkSite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkSite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkSite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkSite.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkSite>() {
           @Override
           public void write(JsonWriter out, WorkSite value) throws IOException {
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
           public WorkSite read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkSite instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkSite given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkSite
  * @throws IOException if the JSON string is invalid with respect to WorkSite
  */
  public static WorkSite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkSite.class);
  }

 /**
  * Convert an instance of WorkSite to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

