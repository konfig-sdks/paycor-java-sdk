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
 * Certification
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Certification {
  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "EffectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private OffsetDateTime effectiveDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "ExpirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_CERTIFICATION_NAME = "CertificationName";
  @SerializedName(SERIALIZED_NAME_CERTIFICATION_NAME)
  private String certificationName;

  public static final String SERIALIZED_NAME_CERTIFICATION_NUMBER = "CertificationNumber";
  @SerializedName(SERIALIZED_NAME_CERTIFICATION_NUMBER)
  private String certificationNumber;

  public static final String SERIALIZED_NAME_CERTIFICATION_ORGANIZATION_NAME = "CertificationOrganizationName";
  @SerializedName(SERIALIZED_NAME_CERTIFICATION_ORGANIZATION_NAME)
  private String certificationOrganizationName;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public Certification() {
  }

  public Certification effectiveDate(OffsetDateTime effectiveDate) {
    
    
    
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Effective date of certification             
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Effective date of certification             ")

  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    
    
    
    this.effectiveDate = effectiveDate;
  }


  public Certification expirationDate(OffsetDateTime expirationDate) {
    
    
    
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration date of certification             
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiration date of certification             ")

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    
    
    
    this.expirationDate = expirationDate;
  }


  public Certification certificationName(String certificationName) {
    
    
    if (certificationName != null && certificationName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for certificationName. Length must be greater than or equal to 1.");
    }
    
    this.certificationName = certificationName;
    return this;
  }

   /**
   * Name of certification             
   * @return certificationName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "First Aid certificate", required = true, value = "Name of certification             ")

  public String getCertificationName() {
    return certificationName;
  }


  public void setCertificationName(String certificationName) {
    
    
    if (certificationName != null && certificationName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for certificationName. Length must be greater than or equal to 1.");
    }
    this.certificationName = certificationName;
  }


  public Certification certificationNumber(String certificationNumber) {
    
    
    
    
    this.certificationNumber = certificationNumber;
    return this;
  }

   /**
   * Number of certification             
   * @return certificationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "436576", value = "Number of certification             ")

  public String getCertificationNumber() {
    return certificationNumber;
  }


  public void setCertificationNumber(String certificationNumber) {
    
    
    
    this.certificationNumber = certificationNumber;
  }


  public Certification certificationOrganizationName(String certificationOrganizationName) {
    
    
    
    
    this.certificationOrganizationName = certificationOrganizationName;
    return this;
  }

   /**
   * Name of certification organization             
   * @return certificationOrganizationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Red Cross", value = "Name of certification organization             ")

  public String getCertificationOrganizationName() {
    return certificationOrganizationName;
  }


  public void setCertificationOrganizationName(String certificationOrganizationName) {
    
    
    
    this.certificationOrganizationName = certificationOrganizationName;
  }


  public Certification notes(String notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Note on certification             
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "note: expires soon", value = "Note on certification             ")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    
    this.notes = notes;
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
   * @return the Certification instance itself
   */
  public Certification putAdditionalProperty(String key, Object value) {
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
    Certification certification = (Certification) o;
    return Objects.equals(this.effectiveDate, certification.effectiveDate) &&
        Objects.equals(this.expirationDate, certification.expirationDate) &&
        Objects.equals(this.certificationName, certification.certificationName) &&
        Objects.equals(this.certificationNumber, certification.certificationNumber) &&
        Objects.equals(this.certificationOrganizationName, certification.certificationOrganizationName) &&
        Objects.equals(this.notes, certification.notes)&&
        Objects.equals(this.additionalProperties, certification.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveDate, expirationDate, certificationName, certificationNumber, certificationOrganizationName, notes, additionalProperties);
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
    sb.append("class Certification {\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    certificationName: ").append(toIndentedString(certificationName)).append("\n");
    sb.append("    certificationNumber: ").append(toIndentedString(certificationNumber)).append("\n");
    sb.append("    certificationOrganizationName: ").append(toIndentedString(certificationOrganizationName)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
    openapiFields.add("EffectiveDate");
    openapiFields.add("ExpirationDate");
    openapiFields.add("CertificationName");
    openapiFields.add("CertificationNumber");
    openapiFields.add("CertificationOrganizationName");
    openapiFields.add("Notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CertificationName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Certification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Certification.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Certification is not found in the empty JSON string", Certification.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Certification.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("CertificationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CertificationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CertificationName").toString()));
      }
      if (!jsonObj.get("CertificationNumber").isJsonNull() && (jsonObj.get("CertificationNumber") != null && !jsonObj.get("CertificationNumber").isJsonNull()) && !jsonObj.get("CertificationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CertificationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CertificationNumber").toString()));
      }
      if (!jsonObj.get("CertificationOrganizationName").isJsonNull() && (jsonObj.get("CertificationOrganizationName") != null && !jsonObj.get("CertificationOrganizationName").isJsonNull()) && !jsonObj.get("CertificationOrganizationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CertificationOrganizationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CertificationOrganizationName").toString()));
      }
      if (!jsonObj.get("Notes").isJsonNull() && (jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonNull()) && !jsonObj.get("Notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Certification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Certification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Certification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Certification.class));

       return (TypeAdapter<T>) new TypeAdapter<Certification>() {
           @Override
           public void write(JsonWriter out, Certification value) throws IOException {
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
           public Certification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Certification instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Certification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Certification
  * @throws IOException if the JSON string is invalid with respect to Certification
  */
  public static Certification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Certification.class);
  }

 /**
  * Convert an instance of Certification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

