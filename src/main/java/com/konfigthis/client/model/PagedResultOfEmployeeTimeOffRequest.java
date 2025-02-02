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
import com.konfigthis.client.model.EmployeeTimeOffRequest;
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
 * The Paged Result model enables pagination of results if maximum of 100 records per response is exceeded. Additional results can be requested by providing calling the AdditionalResultsUrl endpoint containing the continuation token, or by building your own URL using the provided continuation token.
 */
@ApiModel(description = "The Paged Result model enables pagination of results if maximum of 100 records per response is exceeded. Additional results can be requested by providing calling the AdditionalResultsUrl endpoint containing the continuation token, or by building your own URL using the provided continuation token.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PagedResultOfEmployeeTimeOffRequest {
  public static final String SERIALIZED_NAME_HAS_MORE_RESULTS = "HasMoreResults";
  @SerializedName(SERIALIZED_NAME_HAS_MORE_RESULTS)
  private Boolean hasMoreResults;

  public static final String SERIALIZED_NAME_CONTINUATION_TOKEN = "ContinuationToken";
  @SerializedName(SERIALIZED_NAME_CONTINUATION_TOKEN)
  private String continuationToken;

  public static final String SERIALIZED_NAME_ADDITIONAL_RESULTS_URL = "AdditionalResultsUrl";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_RESULTS_URL)
  private String additionalResultsUrl;

  public static final String SERIALIZED_NAME_RECORDS = "Records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  private List<EmployeeTimeOffRequest> records = null;

  public PagedResultOfEmployeeTimeOffRequest() {
  }

  public PagedResultOfEmployeeTimeOffRequest hasMoreResults(Boolean hasMoreResults) {
    
    
    
    
    this.hasMoreResults = hasMoreResults;
    return this;
  }

   /**
   * Whether additional API result records exist on the Paycor system.
   * @return hasMoreResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether additional API result records exist on the Paycor system.")

  public Boolean getHasMoreResults() {
    return hasMoreResults;
  }


  public void setHasMoreResults(Boolean hasMoreResults) {
    
    
    
    this.hasMoreResults = hasMoreResults;
  }


  public PagedResultOfEmployeeTimeOffRequest continuationToken(String continuationToken) {
    
    
    
    
    this.continuationToken = continuationToken;
    return this;
  }

   /**
   * Paycor generated token string which may be provided in a subsequent request to  release additional records past the maximum.  Used when partner is building their own URL.
   * @return continuationToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3ac2fca9-09f2-49fb-86d7-b1b84ed6ca74", value = "Paycor generated token string which may be provided in a subsequent request to  release additional records past the maximum.  Used when partner is building their own URL.")

  public String getContinuationToken() {
    return continuationToken;
  }


  public void setContinuationToken(String continuationToken) {
    
    
    
    this.continuationToken = continuationToken;
  }


  public PagedResultOfEmployeeTimeOffRequest additionalResultsUrl(String additionalResultsUrl) {
    
    
    
    
    this.additionalResultsUrl = additionalResultsUrl;
    return this;
  }

   /**
   * Provides URL to call with the continuation token included for additional results. 
   * @return additionalResultsUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/v1/myresources/xyz?continuationTokenId=3ac2fca9-09f2-49fb-86d7-b1b84ed6ca74", value = "Provides URL to call with the continuation token included for additional results. ")

  public String getAdditionalResultsUrl() {
    return additionalResultsUrl;
  }


  public void setAdditionalResultsUrl(String additionalResultsUrl) {
    
    
    
    this.additionalResultsUrl = additionalResultsUrl;
  }


  public PagedResultOfEmployeeTimeOffRequest records(List<EmployeeTimeOffRequest> records) {
    
    
    
    
    this.records = records;
    return this;
  }

  public PagedResultOfEmployeeTimeOffRequest addRecordsItem(EmployeeTimeOffRequest recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * List of the API response records. 
   * @return records
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the API response records. ")

  public List<EmployeeTimeOffRequest> getRecords() {
    return records;
  }


  public void setRecords(List<EmployeeTimeOffRequest> records) {
    
    
    
    this.records = records;
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
   * @return the PagedResultOfEmployeeTimeOffRequest instance itself
   */
  public PagedResultOfEmployeeTimeOffRequest putAdditionalProperty(String key, Object value) {
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
    PagedResultOfEmployeeTimeOffRequest pagedResultOfEmployeeTimeOffRequest = (PagedResultOfEmployeeTimeOffRequest) o;
    return Objects.equals(this.hasMoreResults, pagedResultOfEmployeeTimeOffRequest.hasMoreResults) &&
        Objects.equals(this.continuationToken, pagedResultOfEmployeeTimeOffRequest.continuationToken) &&
        Objects.equals(this.additionalResultsUrl, pagedResultOfEmployeeTimeOffRequest.additionalResultsUrl) &&
        Objects.equals(this.records, pagedResultOfEmployeeTimeOffRequest.records)&&
        Objects.equals(this.additionalProperties, pagedResultOfEmployeeTimeOffRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMoreResults, continuationToken, additionalResultsUrl, records, additionalProperties);
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
    sb.append("class PagedResultOfEmployeeTimeOffRequest {\n");
    sb.append("    hasMoreResults: ").append(toIndentedString(hasMoreResults)).append("\n");
    sb.append("    continuationToken: ").append(toIndentedString(continuationToken)).append("\n");
    sb.append("    additionalResultsUrl: ").append(toIndentedString(additionalResultsUrl)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
    openapiFields.add("HasMoreResults");
    openapiFields.add("ContinuationToken");
    openapiFields.add("AdditionalResultsUrl");
    openapiFields.add("Records");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PagedResultOfEmployeeTimeOffRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PagedResultOfEmployeeTimeOffRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PagedResultOfEmployeeTimeOffRequest is not found in the empty JSON string", PagedResultOfEmployeeTimeOffRequest.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("ContinuationToken").isJsonNull() && (jsonObj.get("ContinuationToken") != null && !jsonObj.get("ContinuationToken").isJsonNull()) && !jsonObj.get("ContinuationToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ContinuationToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ContinuationToken").toString()));
      }
      if (!jsonObj.get("AdditionalResultsUrl").isJsonNull() && (jsonObj.get("AdditionalResultsUrl") != null && !jsonObj.get("AdditionalResultsUrl").isJsonNull()) && !jsonObj.get("AdditionalResultsUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AdditionalResultsUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AdditionalResultsUrl").toString()));
      }
      if (jsonObj.get("Records") != null && !jsonObj.get("Records").isJsonNull()) {
        JsonArray jsonArrayrecords = jsonObj.getAsJsonArray("Records");
        if (jsonArrayrecords != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Records").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Records` to be an array in the JSON string but got `%s`", jsonObj.get("Records").toString()));
          }

          // validate the optional field `Records` (array)
          for (int i = 0; i < jsonArrayrecords.size(); i++) {
            EmployeeTimeOffRequest.validateJsonObject(jsonArrayrecords.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PagedResultOfEmployeeTimeOffRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PagedResultOfEmployeeTimeOffRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PagedResultOfEmployeeTimeOffRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PagedResultOfEmployeeTimeOffRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PagedResultOfEmployeeTimeOffRequest>() {
           @Override
           public void write(JsonWriter out, PagedResultOfEmployeeTimeOffRequest value) throws IOException {
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
           public PagedResultOfEmployeeTimeOffRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PagedResultOfEmployeeTimeOffRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PagedResultOfEmployeeTimeOffRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PagedResultOfEmployeeTimeOffRequest
  * @throws IOException if the JSON string is invalid with respect to PagedResultOfEmployeeTimeOffRequest
  */
  public static PagedResultOfEmployeeTimeOffRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PagedResultOfEmployeeTimeOffRequest.class);
  }

 /**
  * Convert an instance of PagedResultOfEmployeeTimeOffRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

