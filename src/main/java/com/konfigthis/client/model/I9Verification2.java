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
import com.konfigthis.client.model.ListA;
import com.konfigthis.client.model.ListB;
import com.konfigthis.client.model.ListC;
import com.konfigthis.client.model.WorkEligibility;
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
 * I9Verification2
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class I9Verification2 {
  public static final String SERIALIZED_NAME_CITIZEN_OF_COUNTRY = "CitizenOfCountry";
  @SerializedName(SERIALIZED_NAME_CITIZEN_OF_COUNTRY)
  private String citizenOfCountry;

  public static final String SERIALIZED_NAME_WORK_ELIGIBILITY = "WorkEligibility";
  @SerializedName(SERIALIZED_NAME_WORK_ELIGIBILITY)
  private WorkEligibility workEligibility;

  public static final String SERIALIZED_NAME_WORK_VISA_TYPE = "WorkVisaType";
  @SerializedName(SERIALIZED_NAME_WORK_VISA_TYPE)
  private String workVisaType;

  public static final String SERIALIZED_NAME_WORK_VISA_EXPIRATION_DATE = "WorkVisaExpirationDate";
  @SerializedName(SERIALIZED_NAME_WORK_VISA_EXPIRATION_DATE)
  private OffsetDateTime workVisaExpirationDate;

  public static final String SERIALIZED_NAME_ALIEN_ADMISSION_NUMBER = "AlienAdmissionNumber";
  @SerializedName(SERIALIZED_NAME_ALIEN_ADMISSION_NUMBER)
  private String alienAdmissionNumber;

  public static final String SERIALIZED_NAME_ALIEN_ADMISSION_EXPIRATION_DATE = "AlienAdmissionExpirationDate";
  @SerializedName(SERIALIZED_NAME_ALIEN_ADMISSION_EXPIRATION_DATE)
  private OffsetDateTime alienAdmissionExpirationDate;

  public static final String SERIALIZED_NAME_LIST_A = "ListA";
  @SerializedName(SERIALIZED_NAME_LIST_A)
  private ListA listA;

  public static final String SERIALIZED_NAME_LIST_B = "ListB";
  @SerializedName(SERIALIZED_NAME_LIST_B)
  private ListB listB;

  public static final String SERIALIZED_NAME_LIST_C = "ListC";
  @SerializedName(SERIALIZED_NAME_LIST_C)
  private ListC listC;

  public static final String SERIALIZED_NAME_FOREIGN_PASSPORT_NUMBER = "ForeignPassportNumber";
  @SerializedName(SERIALIZED_NAME_FOREIGN_PASSPORT_NUMBER)
  private String foreignPassportNumber;

  public static final String SERIALIZED_NAME_COUNTRY_OF_ISSUANCE = "CountryOfIssuance";
  @SerializedName(SERIALIZED_NAME_COUNTRY_OF_ISSUANCE)
  private String countryOfIssuance;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFORMATION = "AdditionalInformation";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFORMATION)
  private String additionalInformation;

  public I9Verification2() {
  }

  public I9Verification2 citizenOfCountry(String citizenOfCountry) {
    
    
    
    
    this.citizenOfCountry = citizenOfCountry;
    return this;
  }

   /**
   * Country of which the employee is citizen of.             
   * @return citizenOfCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USA", value = "Country of which the employee is citizen of.             ")

  public String getCitizenOfCountry() {
    return citizenOfCountry;
  }


  public void setCitizenOfCountry(String citizenOfCountry) {
    
    
    
    this.citizenOfCountry = citizenOfCountry;
  }


  public I9Verification2 workEligibility(WorkEligibility workEligibility) {
    
    
    
    
    this.workEligibility = workEligibility;
    return this;
  }

   /**
   * Get workEligibility
   * @return workEligibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkEligibility getWorkEligibility() {
    return workEligibility;
  }


  public void setWorkEligibility(WorkEligibility workEligibility) {
    
    
    
    this.workEligibility = workEligibility;
  }


  public I9Verification2 workVisaType(String workVisaType) {
    
    
    
    
    this.workVisaType = workVisaType;
    return this;
  }

   /**
   * Work visa type of the employee. Maximum characters should be 20.             
   * @return workVisaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "H1B", value = "Work visa type of the employee. Maximum characters should be 20.             ")

  public String getWorkVisaType() {
    return workVisaType;
  }


  public void setWorkVisaType(String workVisaType) {
    
    
    
    this.workVisaType = workVisaType;
  }


  public I9Verification2 workVisaExpirationDate(OffsetDateTime workVisaExpirationDate) {
    
    
    
    
    this.workVisaExpirationDate = workVisaExpirationDate;
    return this;
  }

   /**
   * Expiration date of the work visa.             
   * @return workVisaExpirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiration date of the work visa.             ")

  public OffsetDateTime getWorkVisaExpirationDate() {
    return workVisaExpirationDate;
  }


  public void setWorkVisaExpirationDate(OffsetDateTime workVisaExpirationDate) {
    
    
    
    this.workVisaExpirationDate = workVisaExpirationDate;
  }


  public I9Verification2 alienAdmissionNumber(String alienAdmissionNumber) {
    
    
    
    
    this.alienAdmissionNumber = alienAdmissionNumber;
    return this;
  }

   /**
   * Alien admission number of the employee.             
   * @return alienAdmissionNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12365478961", value = "Alien admission number of the employee.             ")

  public String getAlienAdmissionNumber() {
    return alienAdmissionNumber;
  }


  public void setAlienAdmissionNumber(String alienAdmissionNumber) {
    
    
    
    this.alienAdmissionNumber = alienAdmissionNumber;
  }


  public I9Verification2 alienAdmissionExpirationDate(OffsetDateTime alienAdmissionExpirationDate) {
    
    
    
    
    this.alienAdmissionExpirationDate = alienAdmissionExpirationDate;
    return this;
  }

   /**
   * Expiration date of the alien admission.             
   * @return alienAdmissionExpirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiration date of the alien admission.             ")

  public OffsetDateTime getAlienAdmissionExpirationDate() {
    return alienAdmissionExpirationDate;
  }


  public void setAlienAdmissionExpirationDate(OffsetDateTime alienAdmissionExpirationDate) {
    
    
    
    this.alienAdmissionExpirationDate = alienAdmissionExpirationDate;
  }


  public I9Verification2 listA(ListA listA) {
    
    
    
    
    this.listA = listA;
    return this;
  }

   /**
   * Get listA
   * @return listA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListA getListA() {
    return listA;
  }


  public void setListA(ListA listA) {
    
    
    
    this.listA = listA;
  }


  public I9Verification2 listB(ListB listB) {
    
    
    
    
    this.listB = listB;
    return this;
  }

   /**
   * Get listB
   * @return listB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListB getListB() {
    return listB;
  }


  public void setListB(ListB listB) {
    
    
    
    this.listB = listB;
  }


  public I9Verification2 listC(ListC listC) {
    
    
    
    
    this.listC = listC;
    return this;
  }

   /**
   * Get listC
   * @return listC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListC getListC() {
    return listC;
  }


  public void setListC(ListC listC) {
    
    
    
    this.listC = listC;
  }


  public I9Verification2 foreignPassportNumber(String foreignPassportNumber) {
    
    
    
    
    this.foreignPassportNumber = foreignPassportNumber;
    return this;
  }

   /**
   * Foreign passport number of the employee.             
   * @return foreignPassportNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "N4123456", value = "Foreign passport number of the employee.             ")

  public String getForeignPassportNumber() {
    return foreignPassportNumber;
  }


  public void setForeignPassportNumber(String foreignPassportNumber) {
    
    
    
    this.foreignPassportNumber = foreignPassportNumber;
  }


  public I9Verification2 countryOfIssuance(String countryOfIssuance) {
    
    
    
    
    this.countryOfIssuance = countryOfIssuance;
    return this;
  }

   /**
   * Country of issuance of the foreign passport. Accepted values ISO-3166 alpha2 or alpha3 codes for countries.             
   * @return countryOfIssuance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AU", value = "Country of issuance of the foreign passport. Accepted values ISO-3166 alpha2 or alpha3 codes for countries.             ")

  public String getCountryOfIssuance() {
    return countryOfIssuance;
  }


  public void setCountryOfIssuance(String countryOfIssuance) {
    
    
    
    this.countryOfIssuance = countryOfIssuance;
  }


  public I9Verification2 additionalInformation(String additionalInformation) {
    
    
    
    
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Additional information for the I9 verification. Must be under 768 characters.             
   * @return additionalInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information for the I9 verification. Must be under 768 characters.             ")

  public String getAdditionalInformation() {
    return additionalInformation;
  }


  public void setAdditionalInformation(String additionalInformation) {
    
    
    
    this.additionalInformation = additionalInformation;
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
   * @return the I9Verification2 instance itself
   */
  public I9Verification2 putAdditionalProperty(String key, Object value) {
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
    I9Verification2 i9Verification2 = (I9Verification2) o;
    return Objects.equals(this.citizenOfCountry, i9Verification2.citizenOfCountry) &&
        Objects.equals(this.workEligibility, i9Verification2.workEligibility) &&
        Objects.equals(this.workVisaType, i9Verification2.workVisaType) &&
        Objects.equals(this.workVisaExpirationDate, i9Verification2.workVisaExpirationDate) &&
        Objects.equals(this.alienAdmissionNumber, i9Verification2.alienAdmissionNumber) &&
        Objects.equals(this.alienAdmissionExpirationDate, i9Verification2.alienAdmissionExpirationDate) &&
        Objects.equals(this.listA, i9Verification2.listA) &&
        Objects.equals(this.listB, i9Verification2.listB) &&
        Objects.equals(this.listC, i9Verification2.listC) &&
        Objects.equals(this.foreignPassportNumber, i9Verification2.foreignPassportNumber) &&
        Objects.equals(this.countryOfIssuance, i9Verification2.countryOfIssuance) &&
        Objects.equals(this.additionalInformation, i9Verification2.additionalInformation)&&
        Objects.equals(this.additionalProperties, i9Verification2.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(citizenOfCountry, workEligibility, workVisaType, workVisaExpirationDate, alienAdmissionNumber, alienAdmissionExpirationDate, listA, listB, listC, foreignPassportNumber, countryOfIssuance, additionalInformation, additionalProperties);
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
    sb.append("class I9Verification2 {\n");
    sb.append("    citizenOfCountry: ").append(toIndentedString(citizenOfCountry)).append("\n");
    sb.append("    workEligibility: ").append(toIndentedString(workEligibility)).append("\n");
    sb.append("    workVisaType: ").append(toIndentedString(workVisaType)).append("\n");
    sb.append("    workVisaExpirationDate: ").append(toIndentedString(workVisaExpirationDate)).append("\n");
    sb.append("    alienAdmissionNumber: ").append(toIndentedString(alienAdmissionNumber)).append("\n");
    sb.append("    alienAdmissionExpirationDate: ").append(toIndentedString(alienAdmissionExpirationDate)).append("\n");
    sb.append("    listA: ").append(toIndentedString(listA)).append("\n");
    sb.append("    listB: ").append(toIndentedString(listB)).append("\n");
    sb.append("    listC: ").append(toIndentedString(listC)).append("\n");
    sb.append("    foreignPassportNumber: ").append(toIndentedString(foreignPassportNumber)).append("\n");
    sb.append("    countryOfIssuance: ").append(toIndentedString(countryOfIssuance)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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
    openapiFields.add("CitizenOfCountry");
    openapiFields.add("WorkEligibility");
    openapiFields.add("WorkVisaType");
    openapiFields.add("WorkVisaExpirationDate");
    openapiFields.add("AlienAdmissionNumber");
    openapiFields.add("AlienAdmissionExpirationDate");
    openapiFields.add("ListA");
    openapiFields.add("ListB");
    openapiFields.add("ListC");
    openapiFields.add("ForeignPassportNumber");
    openapiFields.add("CountryOfIssuance");
    openapiFields.add("AdditionalInformation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to I9Verification2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!I9Verification2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in I9Verification2 is not found in the empty JSON string", I9Verification2.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("CitizenOfCountry").isJsonNull() && (jsonObj.get("CitizenOfCountry") != null && !jsonObj.get("CitizenOfCountry").isJsonNull()) && !jsonObj.get("CitizenOfCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CitizenOfCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CitizenOfCountry").toString()));
      }
      if (!jsonObj.get("WorkVisaType").isJsonNull() && (jsonObj.get("WorkVisaType") != null && !jsonObj.get("WorkVisaType").isJsonNull()) && !jsonObj.get("WorkVisaType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkVisaType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkVisaType").toString()));
      }
      if (!jsonObj.get("AlienAdmissionNumber").isJsonNull() && (jsonObj.get("AlienAdmissionNumber") != null && !jsonObj.get("AlienAdmissionNumber").isJsonNull()) && !jsonObj.get("AlienAdmissionNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AlienAdmissionNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AlienAdmissionNumber").toString()));
      }
      // validate the optional field `ListA`
      if (jsonObj.get("ListA") != null && !jsonObj.get("ListA").isJsonNull()) {
        ListA.validateJsonObject(jsonObj.getAsJsonObject("ListA"));
      }
      // validate the optional field `ListB`
      if (jsonObj.get("ListB") != null && !jsonObj.get("ListB").isJsonNull()) {
        ListB.validateJsonObject(jsonObj.getAsJsonObject("ListB"));
      }
      // validate the optional field `ListC`
      if (jsonObj.get("ListC") != null && !jsonObj.get("ListC").isJsonNull()) {
        ListC.validateJsonObject(jsonObj.getAsJsonObject("ListC"));
      }
      if (!jsonObj.get("ForeignPassportNumber").isJsonNull() && (jsonObj.get("ForeignPassportNumber") != null && !jsonObj.get("ForeignPassportNumber").isJsonNull()) && !jsonObj.get("ForeignPassportNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ForeignPassportNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ForeignPassportNumber").toString()));
      }
      if (!jsonObj.get("CountryOfIssuance").isJsonNull() && (jsonObj.get("CountryOfIssuance") != null && !jsonObj.get("CountryOfIssuance").isJsonNull()) && !jsonObj.get("CountryOfIssuance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryOfIssuance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryOfIssuance").toString()));
      }
      if (!jsonObj.get("AdditionalInformation").isJsonNull() && (jsonObj.get("AdditionalInformation") != null && !jsonObj.get("AdditionalInformation").isJsonNull()) && !jsonObj.get("AdditionalInformation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AdditionalInformation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AdditionalInformation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!I9Verification2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'I9Verification2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<I9Verification2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(I9Verification2.class));

       return (TypeAdapter<T>) new TypeAdapter<I9Verification2>() {
           @Override
           public void write(JsonWriter out, I9Verification2 value) throws IOException {
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
           public I9Verification2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             I9Verification2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of I9Verification2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of I9Verification2
  * @throws IOException if the JSON string is invalid with respect to I9Verification2
  */
  public static I9Verification2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, I9Verification2.class);
  }

 /**
  * Convert an instance of I9Verification2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

