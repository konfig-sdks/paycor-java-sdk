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
import com.konfigthis.client.model.LaborCode2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * The Timecard model represents Employee level time, punch details and associated labor code information. 
 */
@ApiModel(description = "The Timecard model represents Employee level time, punch details and associated labor code information. ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TimeCard {
  public static final String SERIALIZED_NAME_DISPLAY_DATE = "DisplayDate";
  @SerializedName(SERIALIZED_NAME_DISPLAY_DATE)
  private OffsetDateTime displayDate;

  public static final String SERIALIZED_NAME_IN_ACTUAL_PUNCH = "InActualPunch";
  @SerializedName(SERIALIZED_NAME_IN_ACTUAL_PUNCH)
  private OffsetDateTime inActualPunch;

  public static final String SERIALIZED_NAME_OUT_ACTUAL_PUNCH = "OutActualPunch";
  @SerializedName(SERIALIZED_NAME_OUT_ACTUAL_PUNCH)
  private OffsetDateTime outActualPunch;

  public static final String SERIALIZED_NAME_IN_ROUNDED_PUNCH = "InRoundedPunch";
  @SerializedName(SERIALIZED_NAME_IN_ROUNDED_PUNCH)
  private OffsetDateTime inRoundedPunch;

  public static final String SERIALIZED_NAME_OUT_ROUNDED_PUNCH = "OutRoundedPunch";
  @SerializedName(SERIALIZED_NAME_OUT_ROUNDED_PUNCH)
  private OffsetDateTime outRoundedPunch;

  public static final String SERIALIZED_NAME_HOURS_AMOUNT = "HoursAmount";
  @SerializedName(SERIALIZED_NAME_HOURS_AMOUNT)
  private Double hoursAmount;

  public static final String SERIALIZED_NAME_DEPARTMENT_CODE = "DepartmentCode";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_CODE)
  private Long departmentCode;

  public static final String SERIALIZED_NAME_DEPARTMENT_NAME = "DepartmentName";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_NAME)
  private String departmentName;

  public static final String SERIALIZED_NAME_EARNING_CODE = "EarningCode";
  @SerializedName(SERIALIZED_NAME_EARNING_CODE)
  private String earningCode;

  public static final String SERIALIZED_NAME_LABOR_CODES = "LaborCodes";
  @SerializedName(SERIALIZED_NAME_LABOR_CODES)
  private List<LaborCode2> laborCodes = null;

  public TimeCard() {
  }

  public TimeCard displayDate(OffsetDateTime displayDate) {
    
    
    
    
    this.displayDate = displayDate;
    return this;
  }

   /**
   * The date when the timecard was created. Format: YYYY-MM-DD
   * @return displayDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the timecard was created. Format: YYYY-MM-DD")

  public OffsetDateTime getDisplayDate() {
    return displayDate;
  }


  public void setDisplayDate(OffsetDateTime displayDate) {
    
    
    
    this.displayDate = displayDate;
  }


  public TimeCard inActualPunch(OffsetDateTime inActualPunch) {
    
    
    
    
    this.inActualPunch = inActualPunch;
    return this;
  }

   /**
   * Date and time when the employee punched in. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard) 
   * @return inActualPunch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-17T13:03:03.943Z", value = "Date and time when the employee punched in. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard) ")

  public OffsetDateTime getInActualPunch() {
    return inActualPunch;
  }


  public void setInActualPunch(OffsetDateTime inActualPunch) {
    
    
    
    this.inActualPunch = inActualPunch;
  }


  public TimeCard outActualPunch(OffsetDateTime outActualPunch) {
    
    
    
    
    this.outActualPunch = outActualPunch;
    return this;
  }

   /**
   * Date and time when the employee punched out. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard) 
   * @return outActualPunch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-17T18:03:03Z", value = "Date and time when the employee punched out. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard) ")

  public OffsetDateTime getOutActualPunch() {
    return outActualPunch;
  }


  public void setOutActualPunch(OffsetDateTime outActualPunch) {
    
    
    
    this.outActualPunch = outActualPunch;
  }


  public TimeCard inRoundedPunch(OffsetDateTime inRoundedPunch) {
    
    
    
    
    this.inRoundedPunch = inRoundedPunch;
    return this;
  }

   /**
   * Date and rounded time when the employee punched in.  Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard) 
   * @return inRoundedPunch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-17T13:00Z", value = "Date and rounded time when the employee punched in.  Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard) ")

  public OffsetDateTime getInRoundedPunch() {
    return inRoundedPunch;
  }


  public void setInRoundedPunch(OffsetDateTime inRoundedPunch) {
    
    
    
    this.inRoundedPunch = inRoundedPunch;
  }


  public TimeCard outRoundedPunch(OffsetDateTime outRoundedPunch) {
    
    
    
    
    this.outRoundedPunch = outRoundedPunch;
    return this;
  }

   /**
   * Date and rounded time when the employee punched out. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard) 
   * @return outRoundedPunch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-17T18:00Z", value = "Date and rounded time when the employee punched out. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard) ")

  public OffsetDateTime getOutRoundedPunch() {
    return outRoundedPunch;
  }


  public void setOutRoundedPunch(OffsetDateTime outRoundedPunch) {
    
    
    
    this.outRoundedPunch = outRoundedPunch;
  }


  public TimeCard hoursAmount(Double hoursAmount) {
    
    
    
    
    this.hoursAmount = hoursAmount;
    return this;
  }

  public TimeCard hoursAmount(Integer hoursAmount) {
    
    
    
    
    this.hoursAmount = hoursAmount.doubleValue();
    return this;
  }

   /**
   * Amount of hours entered for employee&#39;s timecard.
   * @return hoursAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4.5", value = "Amount of hours entered for employee's timecard.")

  public Double getHoursAmount() {
    return hoursAmount;
  }


  public void setHoursAmount(Double hoursAmount) {
    
    
    
    this.hoursAmount = hoursAmount;
  }


  public TimeCard departmentCode(Long departmentCode) {
    
    
    
    
    this.departmentCode = departmentCode;
    return this;
  }

   /**
   * Department code where the employee&#39;s timecard was created.
   * @return departmentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3027442356", value = "Department code where the employee's timecard was created.")

  public Long getDepartmentCode() {
    return departmentCode;
  }


  public void setDepartmentCode(Long departmentCode) {
    
    
    
    this.departmentCode = departmentCode;
  }


  public TimeCard departmentName(String departmentName) {
    
    
    
    
    this.departmentName = departmentName;
    return this;
  }

   /**
   * Department name where the employee&#39;s timecard was created.
   * @return departmentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Accounting", value = "Department name where the employee's timecard was created.")

  public String getDepartmentName() {
    return departmentName;
  }


  public void setDepartmentName(String departmentName) {
    
    
    
    this.departmentName = departmentName;
  }


  public TimeCard earningCode(String earningCode) {
    
    
    
    
    this.earningCode = earningCode;
    return this;
  }

   /**
   * Identifies the type of earning for this timecard.
   * @return earningCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ERC300", value = "Identifies the type of earning for this timecard.")

  public String getEarningCode() {
    return earningCode;
  }


  public void setEarningCode(String earningCode) {
    
    
    
    this.earningCode = earningCode;
  }


  public TimeCard laborCodes(List<LaborCode2> laborCodes) {
    
    
    
    
    this.laborCodes = laborCodes;
    return this;
  }

  public TimeCard addLaborCodesItem(LaborCode2 laborCodesItem) {
    if (this.laborCodes == null) {
      this.laborCodes = new ArrayList<>();
    }
    this.laborCodes.add(laborCodesItem);
    return this;
  }

   /**
   * List of type LaborCode containing the employee&#39;s labor code information.             
   * @return laborCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of type LaborCode containing the employee's labor code information.             ")

  public List<LaborCode2> getLaborCodes() {
    return laborCodes;
  }


  public void setLaborCodes(List<LaborCode2> laborCodes) {
    
    
    
    this.laborCodes = laborCodes;
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
   * @return the TimeCard instance itself
   */
  public TimeCard putAdditionalProperty(String key, Object value) {
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
    TimeCard timeCard = (TimeCard) o;
    return Objects.equals(this.displayDate, timeCard.displayDate) &&
        Objects.equals(this.inActualPunch, timeCard.inActualPunch) &&
        Objects.equals(this.outActualPunch, timeCard.outActualPunch) &&
        Objects.equals(this.inRoundedPunch, timeCard.inRoundedPunch) &&
        Objects.equals(this.outRoundedPunch, timeCard.outRoundedPunch) &&
        Objects.equals(this.hoursAmount, timeCard.hoursAmount) &&
        Objects.equals(this.departmentCode, timeCard.departmentCode) &&
        Objects.equals(this.departmentName, timeCard.departmentName) &&
        Objects.equals(this.earningCode, timeCard.earningCode) &&
        Objects.equals(this.laborCodes, timeCard.laborCodes)&&
        Objects.equals(this.additionalProperties, timeCard.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayDate, inActualPunch, outActualPunch, inRoundedPunch, outRoundedPunch, hoursAmount, departmentCode, departmentName, earningCode, laborCodes, additionalProperties);
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
    sb.append("class TimeCard {\n");
    sb.append("    displayDate: ").append(toIndentedString(displayDate)).append("\n");
    sb.append("    inActualPunch: ").append(toIndentedString(inActualPunch)).append("\n");
    sb.append("    outActualPunch: ").append(toIndentedString(outActualPunch)).append("\n");
    sb.append("    inRoundedPunch: ").append(toIndentedString(inRoundedPunch)).append("\n");
    sb.append("    outRoundedPunch: ").append(toIndentedString(outRoundedPunch)).append("\n");
    sb.append("    hoursAmount: ").append(toIndentedString(hoursAmount)).append("\n");
    sb.append("    departmentCode: ").append(toIndentedString(departmentCode)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    earningCode: ").append(toIndentedString(earningCode)).append("\n");
    sb.append("    laborCodes: ").append(toIndentedString(laborCodes)).append("\n");
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
    openapiFields.add("DisplayDate");
    openapiFields.add("InActualPunch");
    openapiFields.add("OutActualPunch");
    openapiFields.add("InRoundedPunch");
    openapiFields.add("OutRoundedPunch");
    openapiFields.add("HoursAmount");
    openapiFields.add("DepartmentCode");
    openapiFields.add("DepartmentName");
    openapiFields.add("EarningCode");
    openapiFields.add("LaborCodes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimeCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeCard is not found in the empty JSON string", TimeCard.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("DepartmentName").isJsonNull() && (jsonObj.get("DepartmentName") != null && !jsonObj.get("DepartmentName").isJsonNull()) && !jsonObj.get("DepartmentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DepartmentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DepartmentName").toString()));
      }
      if (!jsonObj.get("EarningCode").isJsonNull() && (jsonObj.get("EarningCode") != null && !jsonObj.get("EarningCode").isJsonNull()) && !jsonObj.get("EarningCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EarningCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EarningCode").toString()));
      }
      if (jsonObj.get("LaborCodes") != null && !jsonObj.get("LaborCodes").isJsonNull()) {
        JsonArray jsonArraylaborCodes = jsonObj.getAsJsonArray("LaborCodes");
        if (jsonArraylaborCodes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("LaborCodes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `LaborCodes` to be an array in the JSON string but got `%s`", jsonObj.get("LaborCodes").toString()));
          }

          // validate the optional field `LaborCodes` (array)
          for (int i = 0; i < jsonArraylaborCodes.size(); i++) {
            LaborCode2.validateJsonObject(jsonArraylaborCodes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeCard.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeCard>() {
           @Override
           public void write(JsonWriter out, TimeCard value) throws IOException {
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
           public TimeCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimeCard instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TimeCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeCard
  * @throws IOException if the JSON string is invalid with respect to TimeCard
  */
  public static TimeCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeCard.class);
  }

 /**
  * Convert an instance of TimeCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

