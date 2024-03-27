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
import com.konfigthis.client.model.EarningType;
import com.konfigthis.client.model.EmployeeEarningAmount;
import com.konfigthis.client.model.IncludeInPay;
import com.konfigthis.client.model.PayFrequency;
import com.konfigthis.client.model.ResourceReference;
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
 * A record of one specific earning that one particular employee has setup, including employee-specific details such as amount. Must be tied to an earning at the LegalEntity level.
 */
@ApiModel(description = "A record of one specific earning that one particular employee has setup, including employee-specific details such as amount. Must be tied to an earning at the LegalEntity level.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeEarning {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CODE = "Code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private EarningType type;

  public static final String SERIALIZED_NAME_FREQUENCY = "Frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private PayFrequency frequency;

  public static final String SERIALIZED_NAME_SEQUENCE_NUMBER = "SequenceNumber";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NUMBER)
  private Integer sequenceNumber;

  public static final String SERIALIZED_NAME_INCLUDE_IN_PAY = "IncludeInPay";
  @SerializedName(SERIALIZED_NAME_INCLUDE_IN_PAY)
  private IncludeInPay includeInPay;

  public static final String SERIALIZED_NAME_ON_HOLD = "OnHold";
  @SerializedName(SERIALIZED_NAME_ON_HOLD)
  private Boolean onHold;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "EffectiveStartDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private OffsetDateTime effectiveStartDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "EffectiveEndDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private OffsetDateTime effectiveEndDate;

  public static final String SERIALIZED_NAME_AMOUNT_DATA = "AmountData";
  @SerializedName(SERIALIZED_NAME_AMOUNT_DATA)
  private List<EmployeeEarningAmount> amountData = null;

  public static final String SERIALIZED_NAME_EMPLOYEE = "Employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private ResourceReference employee;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY_EARNING = "LegalEntityEarning";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_EARNING)
  private ResourceReference legalEntityEarning;

  public EmployeeEarning() {
  }

  public EmployeeEarning id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the employee earning in Paycor&#39;s system.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eae83607-000c-0000-0000-000066000000", value = "Unique identifier of the employee earning in Paycor's system.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public EmployeeEarning code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Descriptive earning identifier which appears on paychecks. Only set at the legal entity or tenant level.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BonusDis", value = "Descriptive earning identifier which appears on paychecks. Only set at the legal entity or tenant level.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public EmployeeEarning description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Description of the employee earning code.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bonus Discretionary", value = "Description of the employee earning code.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public EmployeeEarning type(EarningType type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EarningType getType() {
    return type;
  }


  public void setType(EarningType type) {
    
    
    
    this.type = type;
  }


  public EmployeeEarning frequency(PayFrequency frequency) {
    
    
    
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayFrequency getFrequency() {
    return frequency;
  }


  public void setFrequency(PayFrequency frequency) {
    
    
    
    this.frequency = frequency;
  }


  public EmployeeEarning sequenceNumber(Integer sequenceNumber) {
    
    
    
    
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * Order earnings are calculated based on sequence values. This is needed so earnings dependent on other earnings are calculated in the proper sequence.
   * @return sequenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Order earnings are calculated based on sequence values. This is needed so earnings dependent on other earnings are calculated in the proper sequence.")

  public Integer getSequenceNumber() {
    return sequenceNumber;
  }


  public void setSequenceNumber(Integer sequenceNumber) {
    
    
    
    this.sequenceNumber = sequenceNumber;
  }


  public EmployeeEarning includeInPay(IncludeInPay includeInPay) {
    
    
    
    
    this.includeInPay = includeInPay;
    return this;
  }

   /**
   * Get includeInPay
   * @return includeInPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncludeInPay getIncludeInPay() {
    return includeInPay;
  }


  public void setIncludeInPay(IncludeInPay includeInPay) {
    
    
    
    this.includeInPay = includeInPay;
  }


  public EmployeeEarning onHold(Boolean onHold) {
    
    
    
    
    this.onHold = onHold;
    return this;
  }

   /**
   * Whether the employee earning should included in a paycheck. This is specified by the &#39;Calculate&#39; checkbox in the Paycor UI.             
   * @return onHold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the employee earning should included in a paycheck. This is specified by the 'Calculate' checkbox in the Paycor UI.             ")

  public Boolean getOnHold() {
    return onHold;
  }


  public void setOnHold(Boolean onHold) {
    
    
    
    this.onHold = onHold;
  }


  public EmployeeEarning effectiveStartDate(OffsetDateTime effectiveStartDate) {
    
    
    
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * Date the employee earning take effect. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-11-01T00:00Z", value = "Date the employee earning take effect. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              ")

  public OffsetDateTime getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(OffsetDateTime effectiveStartDate) {
    
    
    
    this.effectiveStartDate = effectiveStartDate;
  }


  public EmployeeEarning effectiveEndDate(OffsetDateTime effectiveEndDate) {
    
    
    
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * Date the employee earning is no longer in effect. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-01T00:00Z", value = "Date the employee earning is no longer in effect. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              ")

  public OffsetDateTime getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(OffsetDateTime effectiveEndDate) {
    
    
    
    this.effectiveEndDate = effectiveEndDate;
  }


  public EmployeeEarning amountData(List<EmployeeEarningAmount> amountData) {
    
    
    
    
    this.amountData = amountData;
    return this;
  }

  public EmployeeEarning addAmountDataItem(EmployeeEarningAmount amountDataItem) {
    if (this.amountData == null) {
      this.amountData = new ArrayList<>();
    }
    this.amountData.add(amountDataItem);
    return this;
  }

   /**
   * List of the employee&#39;s earning rates, factors and amounts of type EmployeeEarningAmount.             
   * @return amountData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the employee's earning rates, factors and amounts of type EmployeeEarningAmount.             ")

  public List<EmployeeEarningAmount> getAmountData() {
    return amountData;
  }


  public void setAmountData(List<EmployeeEarningAmount> amountData) {
    
    
    
    this.amountData = amountData;
  }


  public EmployeeEarning employee(ResourceReference employee) {
    
    
    
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getEmployee() {
    return employee;
  }


  public void setEmployee(ResourceReference employee) {
    
    
    
    this.employee = employee;
  }


  public EmployeeEarning legalEntityEarning(ResourceReference legalEntityEarning) {
    
    
    
    
    this.legalEntityEarning = legalEntityEarning;
    return this;
  }

   /**
   * Get legalEntityEarning
   * @return legalEntityEarning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getLegalEntityEarning() {
    return legalEntityEarning;
  }


  public void setLegalEntityEarning(ResourceReference legalEntityEarning) {
    
    
    
    this.legalEntityEarning = legalEntityEarning;
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
   * @return the EmployeeEarning instance itself
   */
  public EmployeeEarning putAdditionalProperty(String key, Object value) {
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
    EmployeeEarning employeeEarning = (EmployeeEarning) o;
    return Objects.equals(this.id, employeeEarning.id) &&
        Objects.equals(this.code, employeeEarning.code) &&
        Objects.equals(this.description, employeeEarning.description) &&
        Objects.equals(this.type, employeeEarning.type) &&
        Objects.equals(this.frequency, employeeEarning.frequency) &&
        Objects.equals(this.sequenceNumber, employeeEarning.sequenceNumber) &&
        Objects.equals(this.includeInPay, employeeEarning.includeInPay) &&
        Objects.equals(this.onHold, employeeEarning.onHold) &&
        Objects.equals(this.effectiveStartDate, employeeEarning.effectiveStartDate) &&
        Objects.equals(this.effectiveEndDate, employeeEarning.effectiveEndDate) &&
        Objects.equals(this.amountData, employeeEarning.amountData) &&
        Objects.equals(this.employee, employeeEarning.employee) &&
        Objects.equals(this.legalEntityEarning, employeeEarning.legalEntityEarning)&&
        Objects.equals(this.additionalProperties, employeeEarning.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, description, type, frequency, sequenceNumber, includeInPay, onHold, effectiveStartDate, effectiveEndDate, amountData, employee, legalEntityEarning, additionalProperties);
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
    sb.append("class EmployeeEarning {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    includeInPay: ").append(toIndentedString(includeInPay)).append("\n");
    sb.append("    onHold: ").append(toIndentedString(onHold)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    amountData: ").append(toIndentedString(amountData)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    legalEntityEarning: ").append(toIndentedString(legalEntityEarning)).append("\n");
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
    openapiFields.add("Code");
    openapiFields.add("Description");
    openapiFields.add("Type");
    openapiFields.add("Frequency");
    openapiFields.add("SequenceNumber");
    openapiFields.add("IncludeInPay");
    openapiFields.add("OnHold");
    openapiFields.add("EffectiveStartDate");
    openapiFields.add("EffectiveEndDate");
    openapiFields.add("AmountData");
    openapiFields.add("Employee");
    openapiFields.add("LegalEntityEarning");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeEarning
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeEarning.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeEarning is not found in the empty JSON string", EmployeeEarning.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if (!jsonObj.get("Code").isJsonNull() && (jsonObj.get("Code") != null && !jsonObj.get("Code").isJsonNull()) && !jsonObj.get("Code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Code").toString()));
      }
      if (!jsonObj.get("Description").isJsonNull() && (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if (jsonObj.get("AmountData") != null && !jsonObj.get("AmountData").isJsonNull()) {
        JsonArray jsonArrayamountData = jsonObj.getAsJsonArray("AmountData");
        if (jsonArrayamountData != null) {
          // ensure the json data is an array
          if (!jsonObj.get("AmountData").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `AmountData` to be an array in the JSON string but got `%s`", jsonObj.get("AmountData").toString()));
          }

          // validate the optional field `AmountData` (array)
          for (int i = 0; i < jsonArrayamountData.size(); i++) {
            EmployeeEarningAmount.validateJsonObject(jsonArrayamountData.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `Employee`
      if (jsonObj.get("Employee") != null && !jsonObj.get("Employee").isJsonNull()) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("Employee"));
      }
      // validate the optional field `LegalEntityEarning`
      if (jsonObj.get("LegalEntityEarning") != null && !jsonObj.get("LegalEntityEarning").isJsonNull()) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("LegalEntityEarning"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeEarning.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeEarning' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeEarning> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeEarning.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeEarning>() {
           @Override
           public void write(JsonWriter out, EmployeeEarning value) throws IOException {
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
           public EmployeeEarning read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeEarning instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeEarning given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeEarning
  * @throws IOException if the JSON string is invalid with respect to EmployeeEarning
  */
  public static EmployeeEarning fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeEarning.class);
  }

 /**
  * Convert an instance of EmployeeEarning to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

