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
import com.konfigthis.client.model.AccountType;
import com.konfigthis.client.model.DirectDepositType;
import com.konfigthis.client.model.PayFrequency;
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
 * The Employee Direct Deposit model represents an Employee&#39;s Direct Deposit information.
 */
@ApiModel(description = "The Employee Direct Deposit model represents an Employee's Direct Deposit information.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeDirectDeposit3 {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "AccountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountType accountType;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "AccountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "RoutingNumber";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_FREQUENCY = "Frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private PayFrequency frequency;

  public static final String SERIALIZED_NAME_DIRECT_DEPOSIT_TYPE = "DirectDepositType";
  @SerializedName(SERIALIZED_NAME_DIRECT_DEPOSIT_TYPE)
  private DirectDepositType directDepositType;

  public static final String SERIALIZED_NAME_ON_HOLD = "OnHold";
  @SerializedName(SERIALIZED_NAME_ON_HOLD)
  private Boolean onHold;

  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_RATE = "Rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Double rate;

  public EmployeeDirectDeposit3() {
  }

  public EmployeeDirectDeposit3 id(String id) {
    
    
    if (id != null && id.length() < 1) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 1.");
    }
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the employee direct deposit in Paycor&#39;s system. Generated by Paycor.             
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5e699a0d-0000-0000-0000-0007d54d9839", required = true, value = "Unique identifier of the employee direct deposit in Paycor's system. Generated by Paycor.             ")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    if (id != null && id.length() < 1) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 1.");
    }
    this.id = id;
  }


  public EmployeeDirectDeposit3 accountType(AccountType accountType) {
    
    
    
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountType accountType) {
    
    
    
    this.accountType = accountType;
  }


  public EmployeeDirectDeposit3 accountNumber(String accountNumber) {
    
    
    if (accountNumber != null && accountNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for accountNumber. Length must be greater than or equal to 1.");
    }
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The bank account number where the direct deposit is directed.             
   * @return accountNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1234567890", required = true, value = "The bank account number where the direct deposit is directed.             ")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    
    
    if (accountNumber != null && accountNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for accountNumber. Length must be greater than or equal to 1.");
    }
    this.accountNumber = accountNumber;
  }


  public EmployeeDirectDeposit3 routingNumber(String routingNumber) {
    
    
    if (routingNumber != null && routingNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for routingNumber. Length must be greater than or equal to 1.");
    }
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * The bank routing number where the direct deposit is directed.              
   * @return routingNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "322271627", required = true, value = "The bank routing number where the direct deposit is directed.              ")

  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    
    
    if (routingNumber != null && routingNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for routingNumber. Length must be greater than or equal to 1.");
    }
    this.routingNumber = routingNumber;
  }


  public EmployeeDirectDeposit3 frequency(PayFrequency frequency) {
    
    
    
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PayFrequency getFrequency() {
    return frequency;
  }


  public void setFrequency(PayFrequency frequency) {
    
    
    
    this.frequency = frequency;
  }


  public EmployeeDirectDeposit3 directDepositType(DirectDepositType directDepositType) {
    
    
    
    
    this.directDepositType = directDepositType;
    return this;
  }

   /**
   * Get directDepositType
   * @return directDepositType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DirectDepositType getDirectDepositType() {
    return directDepositType;
  }


  public void setDirectDepositType(DirectDepositType directDepositType) {
    
    
    
    this.directDepositType = directDepositType;
  }


  public EmployeeDirectDeposit3 onHold(Boolean onHold) {
    
    
    
    
    this.onHold = onHold;
    return this;
  }

   /**
   * Whether any money should be deposited into the direct deposit account.
   * @return onHold
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether any money should be deposited into the direct deposit account.")

  public Boolean getOnHold() {
    return onHold;
  }


  public void setOnHold(Boolean onHold) {
    
    
    
    this.onHold = onHold;
  }


  public EmployeeDirectDeposit3 amount(Double amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

  public EmployeeDirectDeposit3 amount(Integer amount) {
    
    
    
    
    this.amount = amount.doubleValue();
    return this;
  }

   /**
   * Fixed, recurring dollar amount.             
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22.22", value = "Fixed, recurring dollar amount.             ")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    
    
    
    this.amount = amount;
  }


  public EmployeeDirectDeposit3 rate(Double rate) {
    
    
    
    
    this.rate = rate;
    return this;
  }

  public EmployeeDirectDeposit3 rate(Integer rate) {
    
    
    
    
    this.rate = rate.doubleValue();
    return this;
  }

   /**
   * Percentage of the paycheck to be deposited into the direct deposit account             
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.84", value = "Percentage of the paycheck to be deposited into the direct deposit account             ")

  public Double getRate() {
    return rate;
  }


  public void setRate(Double rate) {
    
    
    
    this.rate = rate;
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
   * @return the EmployeeDirectDeposit3 instance itself
   */
  public EmployeeDirectDeposit3 putAdditionalProperty(String key, Object value) {
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
    EmployeeDirectDeposit3 employeeDirectDeposit3 = (EmployeeDirectDeposit3) o;
    return Objects.equals(this.id, employeeDirectDeposit3.id) &&
        Objects.equals(this.accountType, employeeDirectDeposit3.accountType) &&
        Objects.equals(this.accountNumber, employeeDirectDeposit3.accountNumber) &&
        Objects.equals(this.routingNumber, employeeDirectDeposit3.routingNumber) &&
        Objects.equals(this.frequency, employeeDirectDeposit3.frequency) &&
        Objects.equals(this.directDepositType, employeeDirectDeposit3.directDepositType) &&
        Objects.equals(this.onHold, employeeDirectDeposit3.onHold) &&
        Objects.equals(this.amount, employeeDirectDeposit3.amount) &&
        Objects.equals(this.rate, employeeDirectDeposit3.rate)&&
        Objects.equals(this.additionalProperties, employeeDirectDeposit3.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountType, accountNumber, routingNumber, frequency, directDepositType, onHold, amount, rate, additionalProperties);
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
    sb.append("class EmployeeDirectDeposit3 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    directDepositType: ").append(toIndentedString(directDepositType)).append("\n");
    sb.append("    onHold: ").append(toIndentedString(onHold)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
    openapiFields.add("AccountType");
    openapiFields.add("AccountNumber");
    openapiFields.add("RoutingNumber");
    openapiFields.add("Frequency");
    openapiFields.add("DirectDepositType");
    openapiFields.add("OnHold");
    openapiFields.add("Amount");
    openapiFields.add("Rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("AccountType");
    openapiRequiredFields.add("AccountNumber");
    openapiRequiredFields.add("RoutingNumber");
    openapiRequiredFields.add("Frequency");
    openapiRequiredFields.add("OnHold");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeDirectDeposit3
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeDirectDeposit3.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeDirectDeposit3 is not found in the empty JSON string", EmployeeDirectDeposit3.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmployeeDirectDeposit3.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if (!jsonObj.get("AccountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountNumber").toString()));
      }
      if (!jsonObj.get("RoutingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RoutingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RoutingNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeDirectDeposit3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeDirectDeposit3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeDirectDeposit3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeDirectDeposit3.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeDirectDeposit3>() {
           @Override
           public void write(JsonWriter out, EmployeeDirectDeposit3 value) throws IOException {
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
           public EmployeeDirectDeposit3 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeDirectDeposit3 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeDirectDeposit3 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeDirectDeposit3
  * @throws IOException if the JSON string is invalid with respect to EmployeeDirectDeposit3
  */
  public static EmployeeDirectDeposit3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeDirectDeposit3.class);
  }

 /**
  * Convert an instance of EmployeeDirectDeposit3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

