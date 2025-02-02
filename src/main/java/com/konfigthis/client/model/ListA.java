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
import com.konfigthis.client.model.ListADocument;
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
 * ListA
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListA {
  public static final String SERIALIZED_NAME_DOCUMENT_TITLE = "DocumentTitle";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TITLE)
  private ListADocument documentTitle;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER = "DocumentNumber";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER)
  private String documentNumber;

  public static final String SERIALIZED_NAME_ISSUING_AUTHORITY = "IssuingAuthority";
  @SerializedName(SERIALIZED_NAME_ISSUING_AUTHORITY)
  private String issuingAuthority;

  public static final String SERIALIZED_NAME_LIST_EXPIRATION_DATE = "ListExpirationDate";
  @SerializedName(SERIALIZED_NAME_LIST_EXPIRATION_DATE)
  private OffsetDateTime listExpirationDate;

  public static final String SERIALIZED_NAME_LIST_A_SECOND_DOCUMENT_TITLE = "ListASecondDocumentTitle";
  @SerializedName(SERIALIZED_NAME_LIST_A_SECOND_DOCUMENT_TITLE)
  private String listASecondDocumentTitle;

  public static final String SERIALIZED_NAME_LIST_A_SECOND_DOCUMENT_NUMBER = "ListASecondDocumentNumber";
  @SerializedName(SERIALIZED_NAME_LIST_A_SECOND_DOCUMENT_NUMBER)
  private String listASecondDocumentNumber;

  public static final String SERIALIZED_NAME_LIST_A_SECOND_ISSUING_AUTHORITY = "ListASecondIssuingAuthority";
  @SerializedName(SERIALIZED_NAME_LIST_A_SECOND_ISSUING_AUTHORITY)
  private String listASecondIssuingAuthority;

  public static final String SERIALIZED_NAME_LIST_A_SECOND_EXPIRATION_DATE = "ListASecondExpirationDate";
  @SerializedName(SERIALIZED_NAME_LIST_A_SECOND_EXPIRATION_DATE)
  private OffsetDateTime listASecondExpirationDate;

  public static final String SERIALIZED_NAME_LIST_A_THIRD_DOCUMENT_TITLE = "ListAThirdDocumentTitle";
  @SerializedName(SERIALIZED_NAME_LIST_A_THIRD_DOCUMENT_TITLE)
  private String listAThirdDocumentTitle;

  public static final String SERIALIZED_NAME_LIST_A_THIRD_DOCUMENT_NUMBER = "ListAThirdDocumentNumber";
  @SerializedName(SERIALIZED_NAME_LIST_A_THIRD_DOCUMENT_NUMBER)
  private String listAThirdDocumentNumber;

  public static final String SERIALIZED_NAME_LIST_A_THIRD_ISSUING_AUTHORITY = "ListAThirdIssuingAuthority";
  @SerializedName(SERIALIZED_NAME_LIST_A_THIRD_ISSUING_AUTHORITY)
  private String listAThirdIssuingAuthority;

  public static final String SERIALIZED_NAME_LIST_A_THIRD_EXPIRATION_DATE = "ListAThirdExpirationDate";
  @SerializedName(SERIALIZED_NAME_LIST_A_THIRD_EXPIRATION_DATE)
  private OffsetDateTime listAThirdExpirationDate;

  public ListA() {
  }

  public ListA documentTitle(ListADocument documentTitle) {
    
    
    
    
    this.documentTitle = documentTitle;
    return this;
  }

   /**
   * Get documentTitle
   * @return documentTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListADocument getDocumentTitle() {
    return documentTitle;
  }


  public void setDocumentTitle(ListADocument documentTitle) {
    
    
    
    this.documentTitle = documentTitle;
  }


  public ListA documentNumber(String documentNumber) {
    
    
    
    
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * Document number of the ListA document.Must be under 20 characters.             
   * @return documentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567", value = "Document number of the ListA document.Must be under 20 characters.             ")

  public String getDocumentNumber() {
    return documentNumber;
  }


  public void setDocumentNumber(String documentNumber) {
    
    
    
    this.documentNumber = documentNumber;
  }


  public ListA issuingAuthority(String issuingAuthority) {
    
    
    
    
    this.issuingAuthority = issuingAuthority;
    return this;
  }

   /**
   * Issuing authority of the ListA document.Must be under 30 characters.             
   * @return issuingAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "state", value = "Issuing authority of the ListA document.Must be under 30 characters.             ")

  public String getIssuingAuthority() {
    return issuingAuthority;
  }


  public void setIssuingAuthority(String issuingAuthority) {
    
    
    
    this.issuingAuthority = issuingAuthority;
  }


  public ListA listExpirationDate(OffsetDateTime listExpirationDate) {
    
    
    
    
    this.listExpirationDate = listExpirationDate;
    return this;
  }

   /**
   * Expiration date of ListA document.             
   * @return listExpirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiration date of ListA document.             ")

  public OffsetDateTime getListExpirationDate() {
    return listExpirationDate;
  }


  public void setListExpirationDate(OffsetDateTime listExpirationDate) {
    
    
    
    this.listExpirationDate = listExpirationDate;
  }


  public ListA listASecondDocumentTitle(String listASecondDocumentTitle) {
    
    
    
    
    this.listASecondDocumentTitle = listASecondDocumentTitle;
    return this;
  }

   /**
   * Document title of second document.Must be under 50 characters.
   * @return listASecondDocumentTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document title of second document.Must be under 50 characters.")

  public String getListASecondDocumentTitle() {
    return listASecondDocumentTitle;
  }


  public void setListASecondDocumentTitle(String listASecondDocumentTitle) {
    
    
    
    this.listASecondDocumentTitle = listASecondDocumentTitle;
  }


  public ListA listASecondDocumentNumber(String listASecondDocumentNumber) {
    
    
    
    
    this.listASecondDocumentNumber = listASecondDocumentNumber;
    return this;
  }

   /**
   * Document number of second document.Must be under 20 characters.             
   * @return listASecondDocumentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document number of second document.Must be under 20 characters.             ")

  public String getListASecondDocumentNumber() {
    return listASecondDocumentNumber;
  }


  public void setListASecondDocumentNumber(String listASecondDocumentNumber) {
    
    
    
    this.listASecondDocumentNumber = listASecondDocumentNumber;
  }


  public ListA listASecondIssuingAuthority(String listASecondIssuingAuthority) {
    
    
    
    
    this.listASecondIssuingAuthority = listASecondIssuingAuthority;
    return this;
  }

   /**
   * Issuing authority of second document.Must be under 30 characters.             
   * @return listASecondIssuingAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Issuing authority of second document.Must be under 30 characters.             ")

  public String getListASecondIssuingAuthority() {
    return listASecondIssuingAuthority;
  }


  public void setListASecondIssuingAuthority(String listASecondIssuingAuthority) {
    
    
    
    this.listASecondIssuingAuthority = listASecondIssuingAuthority;
  }


  public ListA listASecondExpirationDate(OffsetDateTime listASecondExpirationDate) {
    
    
    
    
    this.listASecondExpirationDate = listASecondExpirationDate;
    return this;
  }

   /**
   * Expiration date of scond document.Must be between \&quot;01/01/1900\&quot;, \&quot;12/31/9999\&quot;.             
   * @return listASecondExpirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiration date of scond document.Must be between \"01/01/1900\", \"12/31/9999\".             ")

  public OffsetDateTime getListASecondExpirationDate() {
    return listASecondExpirationDate;
  }


  public void setListASecondExpirationDate(OffsetDateTime listASecondExpirationDate) {
    
    
    
    this.listASecondExpirationDate = listASecondExpirationDate;
  }


  public ListA listAThirdDocumentTitle(String listAThirdDocumentTitle) {
    
    
    
    
    this.listAThirdDocumentTitle = listAThirdDocumentTitle;
    return this;
  }

   /**
   * Document title of third document.Must be under 50 characters.             
   * @return listAThirdDocumentTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document title of third document.Must be under 50 characters.             ")

  public String getListAThirdDocumentTitle() {
    return listAThirdDocumentTitle;
  }


  public void setListAThirdDocumentTitle(String listAThirdDocumentTitle) {
    
    
    
    this.listAThirdDocumentTitle = listAThirdDocumentTitle;
  }


  public ListA listAThirdDocumentNumber(String listAThirdDocumentNumber) {
    
    
    
    
    this.listAThirdDocumentNumber = listAThirdDocumentNumber;
    return this;
  }

   /**
   * Document number of third document.Must be under 20 characters.
   * @return listAThirdDocumentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document number of third document.Must be under 20 characters.")

  public String getListAThirdDocumentNumber() {
    return listAThirdDocumentNumber;
  }


  public void setListAThirdDocumentNumber(String listAThirdDocumentNumber) {
    
    
    
    this.listAThirdDocumentNumber = listAThirdDocumentNumber;
  }


  public ListA listAThirdIssuingAuthority(String listAThirdIssuingAuthority) {
    
    
    
    
    this.listAThirdIssuingAuthority = listAThirdIssuingAuthority;
    return this;
  }

   /**
   * Issuing authority of third document.Must be under 30 characters.             
   * @return listAThirdIssuingAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Issuing authority of third document.Must be under 30 characters.             ")

  public String getListAThirdIssuingAuthority() {
    return listAThirdIssuingAuthority;
  }


  public void setListAThirdIssuingAuthority(String listAThirdIssuingAuthority) {
    
    
    
    this.listAThirdIssuingAuthority = listAThirdIssuingAuthority;
  }


  public ListA listAThirdExpirationDate(OffsetDateTime listAThirdExpirationDate) {
    
    
    
    
    this.listAThirdExpirationDate = listAThirdExpirationDate;
    return this;
  }

   /**
   * Expiration date of third document.Must be between \&quot;01/01/1900\&quot;, \&quot;12/31/9999\&quot;.             
   * @return listAThirdExpirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiration date of third document.Must be between \"01/01/1900\", \"12/31/9999\".             ")

  public OffsetDateTime getListAThirdExpirationDate() {
    return listAThirdExpirationDate;
  }


  public void setListAThirdExpirationDate(OffsetDateTime listAThirdExpirationDate) {
    
    
    
    this.listAThirdExpirationDate = listAThirdExpirationDate;
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
   * @return the ListA instance itself
   */
  public ListA putAdditionalProperty(String key, Object value) {
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
    ListA listA = (ListA) o;
    return Objects.equals(this.documentTitle, listA.documentTitle) &&
        Objects.equals(this.documentNumber, listA.documentNumber) &&
        Objects.equals(this.issuingAuthority, listA.issuingAuthority) &&
        Objects.equals(this.listExpirationDate, listA.listExpirationDate) &&
        Objects.equals(this.listASecondDocumentTitle, listA.listASecondDocumentTitle) &&
        Objects.equals(this.listASecondDocumentNumber, listA.listASecondDocumentNumber) &&
        Objects.equals(this.listASecondIssuingAuthority, listA.listASecondIssuingAuthority) &&
        Objects.equals(this.listASecondExpirationDate, listA.listASecondExpirationDate) &&
        Objects.equals(this.listAThirdDocumentTitle, listA.listAThirdDocumentTitle) &&
        Objects.equals(this.listAThirdDocumentNumber, listA.listAThirdDocumentNumber) &&
        Objects.equals(this.listAThirdIssuingAuthority, listA.listAThirdIssuingAuthority) &&
        Objects.equals(this.listAThirdExpirationDate, listA.listAThirdExpirationDate)&&
        Objects.equals(this.additionalProperties, listA.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentTitle, documentNumber, issuingAuthority, listExpirationDate, listASecondDocumentTitle, listASecondDocumentNumber, listASecondIssuingAuthority, listASecondExpirationDate, listAThirdDocumentTitle, listAThirdDocumentNumber, listAThirdIssuingAuthority, listAThirdExpirationDate, additionalProperties);
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
    sb.append("class ListA {\n");
    sb.append("    documentTitle: ").append(toIndentedString(documentTitle)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
    sb.append("    listExpirationDate: ").append(toIndentedString(listExpirationDate)).append("\n");
    sb.append("    listASecondDocumentTitle: ").append(toIndentedString(listASecondDocumentTitle)).append("\n");
    sb.append("    listASecondDocumentNumber: ").append(toIndentedString(listASecondDocumentNumber)).append("\n");
    sb.append("    listASecondIssuingAuthority: ").append(toIndentedString(listASecondIssuingAuthority)).append("\n");
    sb.append("    listASecondExpirationDate: ").append(toIndentedString(listASecondExpirationDate)).append("\n");
    sb.append("    listAThirdDocumentTitle: ").append(toIndentedString(listAThirdDocumentTitle)).append("\n");
    sb.append("    listAThirdDocumentNumber: ").append(toIndentedString(listAThirdDocumentNumber)).append("\n");
    sb.append("    listAThirdIssuingAuthority: ").append(toIndentedString(listAThirdIssuingAuthority)).append("\n");
    sb.append("    listAThirdExpirationDate: ").append(toIndentedString(listAThirdExpirationDate)).append("\n");
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
    openapiFields.add("DocumentTitle");
    openapiFields.add("DocumentNumber");
    openapiFields.add("IssuingAuthority");
    openapiFields.add("ListExpirationDate");
    openapiFields.add("ListASecondDocumentTitle");
    openapiFields.add("ListASecondDocumentNumber");
    openapiFields.add("ListASecondIssuingAuthority");
    openapiFields.add("ListASecondExpirationDate");
    openapiFields.add("ListAThirdDocumentTitle");
    openapiFields.add("ListAThirdDocumentNumber");
    openapiFields.add("ListAThirdIssuingAuthority");
    openapiFields.add("ListAThirdExpirationDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListA
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListA.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListA is not found in the empty JSON string", ListA.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("DocumentNumber").isJsonNull() && (jsonObj.get("DocumentNumber") != null && !jsonObj.get("DocumentNumber").isJsonNull()) && !jsonObj.get("DocumentNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DocumentNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DocumentNumber").toString()));
      }
      if (!jsonObj.get("IssuingAuthority").isJsonNull() && (jsonObj.get("IssuingAuthority") != null && !jsonObj.get("IssuingAuthority").isJsonNull()) && !jsonObj.get("IssuingAuthority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IssuingAuthority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IssuingAuthority").toString()));
      }
      if (!jsonObj.get("ListASecondDocumentTitle").isJsonNull() && (jsonObj.get("ListASecondDocumentTitle") != null && !jsonObj.get("ListASecondDocumentTitle").isJsonNull()) && !jsonObj.get("ListASecondDocumentTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ListASecondDocumentTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ListASecondDocumentTitle").toString()));
      }
      if (!jsonObj.get("ListASecondDocumentNumber").isJsonNull() && (jsonObj.get("ListASecondDocumentNumber") != null && !jsonObj.get("ListASecondDocumentNumber").isJsonNull()) && !jsonObj.get("ListASecondDocumentNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ListASecondDocumentNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ListASecondDocumentNumber").toString()));
      }
      if (!jsonObj.get("ListASecondIssuingAuthority").isJsonNull() && (jsonObj.get("ListASecondIssuingAuthority") != null && !jsonObj.get("ListASecondIssuingAuthority").isJsonNull()) && !jsonObj.get("ListASecondIssuingAuthority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ListASecondIssuingAuthority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ListASecondIssuingAuthority").toString()));
      }
      if (!jsonObj.get("ListAThirdDocumentTitle").isJsonNull() && (jsonObj.get("ListAThirdDocumentTitle") != null && !jsonObj.get("ListAThirdDocumentTitle").isJsonNull()) && !jsonObj.get("ListAThirdDocumentTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ListAThirdDocumentTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ListAThirdDocumentTitle").toString()));
      }
      if (!jsonObj.get("ListAThirdDocumentNumber").isJsonNull() && (jsonObj.get("ListAThirdDocumentNumber") != null && !jsonObj.get("ListAThirdDocumentNumber").isJsonNull()) && !jsonObj.get("ListAThirdDocumentNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ListAThirdDocumentNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ListAThirdDocumentNumber").toString()));
      }
      if (!jsonObj.get("ListAThirdIssuingAuthority").isJsonNull() && (jsonObj.get("ListAThirdIssuingAuthority") != null && !jsonObj.get("ListAThirdIssuingAuthority").isJsonNull()) && !jsonObj.get("ListAThirdIssuingAuthority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ListAThirdIssuingAuthority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ListAThirdIssuingAuthority").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListA.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListA' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListA> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListA.class));

       return (TypeAdapter<T>) new TypeAdapter<ListA>() {
           @Override
           public void write(JsonWriter out, ListA value) throws IOException {
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
           public ListA read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListA instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListA given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListA
  * @throws IOException if the JSON string is invalid with respect to ListA
  */
  public static ListA fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListA.class);
  }

 /**
  * Convert an instance of ListA to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

