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
import com.konfigthis.client.model.Email;
import com.konfigthis.client.model.EmployeePositionData;
import com.konfigthis.client.model.EmployeeStatusData;
import com.konfigthis.client.model.EmployeeWorkLocationData;
import com.konfigthis.client.model.EmploymentDateData;
import com.konfigthis.client.model.ResourceReference;
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
 * The Employee model represents all Employee related information.  Provides links to the Employee&#39;s associated Person, Legal Entity, Department, Earning, Deduction, Tax, Direct Deposit, Pay Rat and Custom Field information.
 */
@ApiModel(description = "The Employee model represents all Employee related information.  Provides links to the Employee's associated Person, Legal Entity, Department, Earning, Deduction, Tax, Direct Deposit, Pay Rat and Custom Field information.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Employee {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "EmployeeNumber";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  private String employeeNumber;

  public static final String SERIALIZED_NAME_ALTERNATE_EMPLOYEE_NUMBER = "AlternateEmployeeNumber";
  @SerializedName(SERIALIZED_NAME_ALTERNATE_EMPLOYEE_NUMBER)
  private String alternateEmployeeNumber;

  public static final String SERIALIZED_NAME_BADGE_NUMBER = "BadgeNumber";
  @SerializedName(SERIALIZED_NAME_BADGE_NUMBER)
  private String badgeNumber;

  public static final String SERIALIZED_NAME_FIRST_NAME = "FirstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "MiddleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_LAST_NAME = "LastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private Email email;

  public static final String SERIALIZED_NAME_EMPLOYMENT_DATE_DATA = "EmploymentDateData";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_DATE_DATA)
  private EmploymentDateData employmentDateData;

  public static final String SERIALIZED_NAME_POSITION_DATA = "PositionData";
  @SerializedName(SERIALIZED_NAME_POSITION_DATA)
  private EmployeePositionData positionData;

  public static final String SERIALIZED_NAME_STATUS_DATA = "StatusData";
  @SerializedName(SERIALIZED_NAME_STATUS_DATA)
  private EmployeeStatusData statusData;

  public static final String SERIALIZED_NAME_WORK_LOCATION = "WorkLocation";
  @SerializedName(SERIALIZED_NAME_WORK_LOCATION)
  private EmployeeWorkLocationData workLocation;

  public static final String SERIALIZED_NAME_EARNINGS = "Earnings";
  @SerializedName(SERIALIZED_NAME_EARNINGS)
  private ResourceReference earnings;

  public static final String SERIALIZED_NAME_DEDUCTIONS = "Deductions";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS)
  private ResourceReference deductions;

  public static final String SERIALIZED_NAME_TAXES = "Taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  private ResourceReference taxes;

  public static final String SERIALIZED_NAME_DIRECT_DEPOSITS = "DirectDeposits";
  @SerializedName(SERIALIZED_NAME_DIRECT_DEPOSITS)
  private ResourceReference directDeposits;

  public static final String SERIALIZED_NAME_PAY_RATES = "PayRates";
  @SerializedName(SERIALIZED_NAME_PAY_RATES)
  private ResourceReference payRates;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY = "LegalEntity";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY)
  private ResourceReference legalEntity;

  public static final String SERIALIZED_NAME_PERSON = "Person";
  @SerializedName(SERIALIZED_NAME_PERSON)
  private ResourceReference person;

  public static final String SERIALIZED_NAME_DEPARTMENT = "Department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private ResourceReference department;

  public Employee() {
  }

  public Employee id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the employee in Paycor&#39;s system. Generated by Paycor.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "df5566ef-196c-0000-0000-0007d5268Sa2", value = "Unique identifier of the employee in Paycor's system. Generated by Paycor.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Employee employeeNumber(String employeeNumber) {
    
    
    
    
    this.employeeNumber = employeeNumber;
    return this;
  }

   /**
   * Unique number of the employee in the tenant. Generated by Paycor.             
   * @return employeeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "Unique number of the employee in the tenant. Generated by Paycor.             ")

  public String getEmployeeNumber() {
    return employeeNumber;
  }


  public void setEmployeeNumber(String employeeNumber) {
    
    
    
    this.employeeNumber = employeeNumber;
  }


  public Employee alternateEmployeeNumber(String alternateEmployeeNumber) {
    
    
    
    
    this.alternateEmployeeNumber = alternateEmployeeNumber;
    return this;
  }

   /**
   * Alternate employee number in the tenant.
   * @return alternateEmployeeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "135790", value = "Alternate employee number in the tenant.")

  public String getAlternateEmployeeNumber() {
    return alternateEmployeeNumber;
  }


  public void setAlternateEmployeeNumber(String alternateEmployeeNumber) {
    
    
    
    this.alternateEmployeeNumber = alternateEmployeeNumber;
  }


  public Employee badgeNumber(String badgeNumber) {
    
    
    
    
    this.badgeNumber = badgeNumber;
    return this;
  }

   /**
   * Employee&#39;s assigned badge number - currently unavailable             
   * @return badgeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123666", value = "Employee's assigned badge number - currently unavailable             ")

  public String getBadgeNumber() {
    return badgeNumber;
  }


  public void setBadgeNumber(String badgeNumber) {
    
    
    
    this.badgeNumber = badgeNumber;
  }


  public Employee firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the employee.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Charles", value = "First name of the employee.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public Employee middleName(String middleName) {
    
    
    
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Middle name of the employee.
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lutwidge", value = "Middle name of the employee.")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    
    
    
    this.middleName = middleName;
  }


  public Employee lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the employee.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Dodgson", value = "Last name of the employee.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public Employee email(Email email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Email getEmail() {
    return email;
  }


  public void setEmail(Email email) {
    
    
    
    this.email = email;
  }


  public Employee employmentDateData(EmploymentDateData employmentDateData) {
    
    
    
    
    this.employmentDateData = employmentDateData;
    return this;
  }

   /**
   * Get employmentDateData
   * @return employmentDateData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmploymentDateData getEmploymentDateData() {
    return employmentDateData;
  }


  public void setEmploymentDateData(EmploymentDateData employmentDateData) {
    
    
    
    this.employmentDateData = employmentDateData;
  }


  public Employee positionData(EmployeePositionData positionData) {
    
    
    
    
    this.positionData = positionData;
    return this;
  }

   /**
   * Get positionData
   * @return positionData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeePositionData getPositionData() {
    return positionData;
  }


  public void setPositionData(EmployeePositionData positionData) {
    
    
    
    this.positionData = positionData;
  }


  public Employee statusData(EmployeeStatusData statusData) {
    
    
    
    
    this.statusData = statusData;
    return this;
  }

   /**
   * Get statusData
   * @return statusData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeeStatusData getStatusData() {
    return statusData;
  }


  public void setStatusData(EmployeeStatusData statusData) {
    
    
    
    this.statusData = statusData;
  }


  public Employee workLocation(EmployeeWorkLocationData workLocation) {
    
    
    
    
    this.workLocation = workLocation;
    return this;
  }

   /**
   * Get workLocation
   * @return workLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeeWorkLocationData getWorkLocation() {
    return workLocation;
  }


  public void setWorkLocation(EmployeeWorkLocationData workLocation) {
    
    
    
    this.workLocation = workLocation;
  }


  public Employee earnings(ResourceReference earnings) {
    
    
    
    
    this.earnings = earnings;
    return this;
  }

   /**
   * Get earnings
   * @return earnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getEarnings() {
    return earnings;
  }


  public void setEarnings(ResourceReference earnings) {
    
    
    
    this.earnings = earnings;
  }


  public Employee deductions(ResourceReference deductions) {
    
    
    
    
    this.deductions = deductions;
    return this;
  }

   /**
   * Get deductions
   * @return deductions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getDeductions() {
    return deductions;
  }


  public void setDeductions(ResourceReference deductions) {
    
    
    
    this.deductions = deductions;
  }


  public Employee taxes(ResourceReference taxes) {
    
    
    
    
    this.taxes = taxes;
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getTaxes() {
    return taxes;
  }


  public void setTaxes(ResourceReference taxes) {
    
    
    
    this.taxes = taxes;
  }


  public Employee directDeposits(ResourceReference directDeposits) {
    
    
    
    
    this.directDeposits = directDeposits;
    return this;
  }

   /**
   * Get directDeposits
   * @return directDeposits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getDirectDeposits() {
    return directDeposits;
  }


  public void setDirectDeposits(ResourceReference directDeposits) {
    
    
    
    this.directDeposits = directDeposits;
  }


  public Employee payRates(ResourceReference payRates) {
    
    
    
    
    this.payRates = payRates;
    return this;
  }

   /**
   * Get payRates
   * @return payRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getPayRates() {
    return payRates;
  }


  public void setPayRates(ResourceReference payRates) {
    
    
    
    this.payRates = payRates;
  }


  public Employee legalEntity(ResourceReference legalEntity) {
    
    
    
    
    this.legalEntity = legalEntity;
    return this;
  }

   /**
   * Get legalEntity
   * @return legalEntity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getLegalEntity() {
    return legalEntity;
  }


  public void setLegalEntity(ResourceReference legalEntity) {
    
    
    
    this.legalEntity = legalEntity;
  }


  public Employee person(ResourceReference person) {
    
    
    
    
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getPerson() {
    return person;
  }


  public void setPerson(ResourceReference person) {
    
    
    
    this.person = person;
  }


  public Employee department(ResourceReference department) {
    
    
    
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getDepartment() {
    return department;
  }


  public void setDepartment(ResourceReference department) {
    
    
    
    this.department = department;
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
   * @return the Employee instance itself
   */
  public Employee putAdditionalProperty(String key, Object value) {
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
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) &&
        Objects.equals(this.employeeNumber, employee.employeeNumber) &&
        Objects.equals(this.alternateEmployeeNumber, employee.alternateEmployeeNumber) &&
        Objects.equals(this.badgeNumber, employee.badgeNumber) &&
        Objects.equals(this.firstName, employee.firstName) &&
        Objects.equals(this.middleName, employee.middleName) &&
        Objects.equals(this.lastName, employee.lastName) &&
        Objects.equals(this.email, employee.email) &&
        Objects.equals(this.employmentDateData, employee.employmentDateData) &&
        Objects.equals(this.positionData, employee.positionData) &&
        Objects.equals(this.statusData, employee.statusData) &&
        Objects.equals(this.workLocation, employee.workLocation) &&
        Objects.equals(this.earnings, employee.earnings) &&
        Objects.equals(this.deductions, employee.deductions) &&
        Objects.equals(this.taxes, employee.taxes) &&
        Objects.equals(this.directDeposits, employee.directDeposits) &&
        Objects.equals(this.payRates, employee.payRates) &&
        Objects.equals(this.legalEntity, employee.legalEntity) &&
        Objects.equals(this.person, employee.person) &&
        Objects.equals(this.department, employee.department)&&
        Objects.equals(this.additionalProperties, employee.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employeeNumber, alternateEmployeeNumber, badgeNumber, firstName, middleName, lastName, email, employmentDateData, positionData, statusData, workLocation, earnings, deductions, taxes, directDeposits, payRates, legalEntity, person, department, additionalProperties);
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
    sb.append("class Employee {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
    sb.append("    alternateEmployeeNumber: ").append(toIndentedString(alternateEmployeeNumber)).append("\n");
    sb.append("    badgeNumber: ").append(toIndentedString(badgeNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    employmentDateData: ").append(toIndentedString(employmentDateData)).append("\n");
    sb.append("    positionData: ").append(toIndentedString(positionData)).append("\n");
    sb.append("    statusData: ").append(toIndentedString(statusData)).append("\n");
    sb.append("    workLocation: ").append(toIndentedString(workLocation)).append("\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    directDeposits: ").append(toIndentedString(directDeposits)).append("\n");
    sb.append("    payRates: ").append(toIndentedString(payRates)).append("\n");
    sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
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
    openapiFields.add("EmployeeNumber");
    openapiFields.add("AlternateEmployeeNumber");
    openapiFields.add("BadgeNumber");
    openapiFields.add("FirstName");
    openapiFields.add("MiddleName");
    openapiFields.add("LastName");
    openapiFields.add("Email");
    openapiFields.add("EmploymentDateData");
    openapiFields.add("PositionData");
    openapiFields.add("StatusData");
    openapiFields.add("WorkLocation");
    openapiFields.add("Earnings");
    openapiFields.add("Deductions");
    openapiFields.add("Taxes");
    openapiFields.add("DirectDeposits");
    openapiFields.add("PayRates");
    openapiFields.add("LegalEntity");
    openapiFields.add("Person");
    openapiFields.add("Department");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Employee
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Employee.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Employee is not found in the empty JSON string", Employee.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if (!jsonObj.get("EmployeeNumber").isJsonNull() && (jsonObj.get("EmployeeNumber") != null && !jsonObj.get("EmployeeNumber").isJsonNull()) && !jsonObj.get("EmployeeNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EmployeeNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EmployeeNumber").toString()));
      }
      if (!jsonObj.get("AlternateEmployeeNumber").isJsonNull() && (jsonObj.get("AlternateEmployeeNumber") != null && !jsonObj.get("AlternateEmployeeNumber").isJsonNull()) && !jsonObj.get("AlternateEmployeeNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AlternateEmployeeNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AlternateEmployeeNumber").toString()));
      }
      if (!jsonObj.get("BadgeNumber").isJsonNull() && (jsonObj.get("BadgeNumber") != null && !jsonObj.get("BadgeNumber").isJsonNull()) && !jsonObj.get("BadgeNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BadgeNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BadgeNumber").toString()));
      }
      if (!jsonObj.get("FirstName").isJsonNull() && (jsonObj.get("FirstName") != null && !jsonObj.get("FirstName").isJsonNull()) && !jsonObj.get("FirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FirstName").toString()));
      }
      if (!jsonObj.get("MiddleName").isJsonNull() && (jsonObj.get("MiddleName") != null && !jsonObj.get("MiddleName").isJsonNull()) && !jsonObj.get("MiddleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MiddleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MiddleName").toString()));
      }
      if (!jsonObj.get("LastName").isJsonNull() && (jsonObj.get("LastName") != null && !jsonObj.get("LastName").isJsonNull()) && !jsonObj.get("LastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LastName").toString()));
      }
      // validate the optional field `Email`
      if (jsonObj.get("Email") != null && !jsonObj.get("Email").isJsonNull()) {
        Email.validateJsonObject(jsonObj.getAsJsonObject("Email"));
      }
      // validate the optional field `EmploymentDateData`
      if (jsonObj.get("EmploymentDateData") != null && !jsonObj.get("EmploymentDateData").isJsonNull()) {
        EmploymentDateData.validateJsonObject(jsonObj.getAsJsonObject("EmploymentDateData"));
      }
      // validate the optional field `PositionData`
      if (jsonObj.get("PositionData") != null && !jsonObj.get("PositionData").isJsonNull()) {
        EmployeePositionData.validateJsonObject(jsonObj.getAsJsonObject("PositionData"));
      }
      // validate the optional field `StatusData`
      if (jsonObj.get("StatusData") != null && !jsonObj.get("StatusData").isJsonNull()) {
        EmployeeStatusData.validateJsonObject(jsonObj.getAsJsonObject("StatusData"));
      }
      // validate the optional field `WorkLocation`
      if (jsonObj.get("WorkLocation") != null && !jsonObj.get("WorkLocation").isJsonNull()) {
        EmployeeWorkLocationData.validateJsonObject(jsonObj.getAsJsonObject("WorkLocation"));
      }
      // validate the optional field `Earnings`
      if (jsonObj.get("Earnings") != null && !jsonObj.get("Earnings").isJsonNull()) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("Earnings"));
      }
      // validate the optional field `Deductions`
      if (jsonObj.get("Deductions") != null && !jsonObj.get("Deductions").isJsonNull()) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("Deductions"));
      }
      // validate the optional field `Taxes`
      if (jsonObj.get("Taxes") != null && !jsonObj.get("Taxes").isJsonNull()) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("Taxes"));
      }
      // validate the optional field `DirectDeposits`
      if (jsonObj.get("DirectDeposits") != null && !jsonObj.get("DirectDeposits").isJsonNull()) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("DirectDeposits"));
      }
      // validate the optional field `PayRates`
      if (jsonObj.get("PayRates") != null && !jsonObj.get("PayRates").isJsonNull()) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("PayRates"));
      }
      // validate the optional field `LegalEntity`
      if (jsonObj.get("LegalEntity") != null && !jsonObj.get("LegalEntity").isJsonNull()) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("LegalEntity"));
      }
      // validate the optional field `Person`
      if (jsonObj.get("Person") != null && !jsonObj.get("Person").isJsonNull()) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("Person"));
      }
      // validate the optional field `Department`
      if (jsonObj.get("Department") != null && !jsonObj.get("Department").isJsonNull()) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("Department"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Employee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Employee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Employee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Employee.class));

       return (TypeAdapter<T>) new TypeAdapter<Employee>() {
           @Override
           public void write(JsonWriter out, Employee value) throws IOException {
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
           public Employee read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Employee instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Employee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Employee
  * @throws IOException if the JSON string is invalid with respect to Employee
  */
  public static Employee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Employee.class);
  }

 /**
  * Convert an instance of Employee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

