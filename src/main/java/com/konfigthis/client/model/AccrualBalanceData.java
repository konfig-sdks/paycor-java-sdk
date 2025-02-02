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
 * Accrual Balance Data represents the employees summarized accrual balance information.             
 */
@ApiModel(description = "Accrual Balance Data represents the employees summarized accrual balance information.             ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccrualBalanceData {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "EmployeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_PLANNER_ID = "PlannerId";
  @SerializedName(SERIALIZED_NAME_PLANNER_ID)
  private String plannerId;

  public static final String SERIALIZED_NAME_PAY_NUMBER = "PayNumber";
  @SerializedName(SERIALIZED_NAME_PAY_NUMBER)
  private Integer payNumber;

  public static final String SERIALIZED_NAME_PERIOD_END_DATE = "PeriodEndDate";
  @SerializedName(SERIALIZED_NAME_PERIOD_END_DATE)
  private OffsetDateTime periodEndDate;

  public static final String SERIALIZED_NAME_TIME_OFF_TYPE_CODE = "TimeOffTypeCode";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPE_CODE)
  private String timeOffTypeCode;

  public static final String SERIALIZED_NAME_TIME_OFF_TYPE_DESCRIPTION = "TimeOffTypeDescription";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPE_DESCRIPTION)
  private String timeOffTypeDescription;

  public static final String SERIALIZED_NAME_PRINT_OPTION = "PrintOption";
  @SerializedName(SERIALIZED_NAME_PRINT_OPTION)
  private String printOption;

  public static final String SERIALIZED_NAME_PAYRUN_TYPES_TO_INCLUDE = "PayrunTypesToInclude";
  @SerializedName(SERIALIZED_NAME_PAYRUN_TYPES_TO_INCLUDE)
  private String payrunTypesToInclude;

  public static final String SERIALIZED_NAME_PRINT_DELAYIN_DAYS = "PrintDelayinDays";
  @SerializedName(SERIALIZED_NAME_PRINT_DELAYIN_DAYS)
  private Integer printDelayinDays;

  public static final String SERIALIZED_NAME_SHORTFALL_OPTION = "ShortfallOption";
  @SerializedName(SERIALIZED_NAME_SHORTFALL_OPTION)
  private String shortfallOption;

  public static final String SERIALIZED_NAME_PRINT_BALANCE_PAYSTUB_OPTION = "PrintBalancePaystubOption";
  @SerializedName(SERIALIZED_NAME_PRINT_BALANCE_PAYSTUB_OPTION)
  private String printBalancePaystubOption;

  public static final String SERIALIZED_NAME_STARTING_BALANCE = "StartingBalance";
  @SerializedName(SERIALIZED_NAME_STARTING_BALANCE)
  private Double startingBalance;

  public static final String SERIALIZED_NAME_HOURS_ADDED_Y_T_D = "HoursAddedYTD";
  @SerializedName(SERIALIZED_NAME_HOURS_ADDED_Y_T_D)
  private Double hoursAddedYTD;

  public static final String SERIALIZED_NAME_HOURS_USED_Y_T_D = "HoursUsedYTD";
  @SerializedName(SERIALIZED_NAME_HOURS_USED_Y_T_D)
  private Double hoursUsedYTD;

  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "AvailableBalance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
  private Double availableBalance;

  public static final String SERIALIZED_NAME_MAX_ENTITLED_BALANCE = "MaxEntitledBalance";
  @SerializedName(SERIALIZED_NAME_MAX_ENTITLED_BALANCE)
  private Double maxEntitledBalance;

  public static final String SERIALIZED_NAME_REMAINING_ENTITLED_BALANCE = "RemainingEntitledBalance";
  @SerializedName(SERIALIZED_NAME_REMAINING_ENTITLED_BALANCE)
  private Double remainingEntitledBalance;

  public AccrualBalanceData() {
  }

  public AccrualBalanceData employeeId(String employeeId) {
    
    
    if (employeeId != null && employeeId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for employeeId. Length must be greater than or equal to 1.");
    }
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Unique identifier of the Employee in Paycor&#39;s system. Generated by Paycor. Used for other GET endpoints. 
   * @return employeeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "497b41d0-5646-0000-0000-00009add0300", required = true, value = "Unique identifier of the Employee in Paycor's system. Generated by Paycor. Used for other GET endpoints. ")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    
    
    if (employeeId != null && employeeId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for employeeId. Length must be greater than or equal to 1.");
    }
    this.employeeId = employeeId;
  }


  public AccrualBalanceData plannerId(String plannerId) {
    
    
    if (plannerId != null && plannerId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for plannerId. Length must be greater than or equal to 1.");
    }
    
    this.plannerId = plannerId;
    return this;
  }

   /**
   * Id of the planner for this payment
   * @return plannerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5f407b07-014a-0000-0000-00009add0300", required = true, value = "Id of the planner for this payment")

  public String getPlannerId() {
    return plannerId;
  }


  public void setPlannerId(String plannerId) {
    
    
    if (plannerId != null && plannerId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for plannerId. Length must be greater than or equal to 1.");
    }
    this.plannerId = plannerId;
  }


  public AccrualBalanceData payNumber(Integer payNumber) {
    
    
    
    
    this.payNumber = payNumber;
    return this;
  }

   /**
   * Pay number
   * @return payNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Pay number")

  public Integer getPayNumber() {
    return payNumber;
  }


  public void setPayNumber(Integer payNumber) {
    
    
    
    this.payNumber = payNumber;
  }


  public AccrualBalanceData periodEndDate(OffsetDateTime periodEndDate) {
    
    
    
    
    this.periodEndDate = periodEndDate;
    return this;
  }

   /**
   * Period end date. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              
   * @return periodEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-05-09T13:44:57.669Z", value = "Period end date. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              ")

  public OffsetDateTime getPeriodEndDate() {
    return periodEndDate;
  }


  public void setPeriodEndDate(OffsetDateTime periodEndDate) {
    
    
    
    this.periodEndDate = periodEndDate;
  }


  public AccrualBalanceData timeOffTypeCode(String timeOffTypeCode) {
    
    
    
    
    this.timeOffTypeCode = timeOffTypeCode;
    return this;
  }

   /**
   * Abbreviated code of the time off type linked to this plan (admin-configured)
   * @return timeOffTypeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sal", value = "Abbreviated code of the time off type linked to this plan (admin-configured)")

  public String getTimeOffTypeCode() {
    return timeOffTypeCode;
  }


  public void setTimeOffTypeCode(String timeOffTypeCode) {
    
    
    
    this.timeOffTypeCode = timeOffTypeCode;
  }


  public AccrualBalanceData timeOffTypeDescription(String timeOffTypeDescription) {
    
    
    if (timeOffTypeDescription != null && timeOffTypeDescription.length() < 1) {
      throw new IllegalArgumentException("Invalid value for timeOffTypeDescription. Length must be greater than or equal to 1.");
    }
    
    this.timeOffTypeDescription = timeOffTypeDescription;
    return this;
  }

   /**
   * Description of the time off type linked to this plan (admin-configured)
   * @return timeOffTypeDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Sal", required = true, value = "Description of the time off type linked to this plan (admin-configured)")

  public String getTimeOffTypeDescription() {
    return timeOffTypeDescription;
  }


  public void setTimeOffTypeDescription(String timeOffTypeDescription) {
    
    
    if (timeOffTypeDescription != null && timeOffTypeDescription.length() < 1) {
      throw new IllegalArgumentException("Invalid value for timeOffTypeDescription. Length must be greater than or equal to 1.");
    }
    this.timeOffTypeDescription = timeOffTypeDescription;
  }


  public AccrualBalanceData printOption(String printOption) {
    
    
    
    
    this.printOption = printOption;
    return this;
  }

   /**
   * Determines what information to print on the payroll paystub (1.AvailableBalanceAndYTD,2.AvailableBalance,3.NoPrint)
   * @return printOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NoPrint", value = "Determines what information to print on the payroll paystub (1.AvailableBalanceAndYTD,2.AvailableBalance,3.NoPrint)")

  public String getPrintOption() {
    return printOption;
  }


  public void setPrintOption(String printOption) {
    
    
    
    this.printOption = printOption;
  }


  public AccrualBalanceData payrunTypesToInclude(String payrunTypesToInclude) {
    
    
    
    
    this.payrunTypesToInclude = payrunTypesToInclude;
    return this;
  }

   /**
   * Determines which payroll paystubs should be printed(1.AllPayStubs,2.RegularOnly,3.AdditionalOnly)
   * @return payrunTypesToInclude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AllPayStubs", value = "Determines which payroll paystubs should be printed(1.AllPayStubs,2.RegularOnly,3.AdditionalOnly)")

  public String getPayrunTypesToInclude() {
    return payrunTypesToInclude;
  }


  public void setPayrunTypesToInclude(String payrunTypesToInclude) {
    
    
    
    this.payrunTypesToInclude = payrunTypesToInclude;
  }


  public AccrualBalanceData printDelayinDays(Integer printDelayinDays) {
    
    
    
    
    this.printDelayinDays = printDelayinDays;
    return this;
  }

   /**
   * The number of days after an employee’s hire date before the balance is printed on the paystub
   * @return printDelayinDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "The number of days after an employee’s hire date before the balance is printed on the paystub")

  public Integer getPrintDelayinDays() {
    return printDelayinDays;
  }


  public void setPrintDelayinDays(Integer printDelayinDays) {
    
    
    
    this.printDelayinDays = printDelayinDays;
  }


  public AccrualBalanceData shortfallOption(String shortfallOption) {
    
    
    
    
    this.shortfallOption = shortfallOption;
    return this;
  }

   /**
   * If there is a balance shortfall at the time of payroll (1.Warning,2.None,3.DoNotPay)
   * @return shortfallOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "None", value = "If there is a balance shortfall at the time of payroll (1.Warning,2.None,3.DoNotPay)")

  public String getShortfallOption() {
    return shortfallOption;
  }


  public void setShortfallOption(String shortfallOption) {
    
    
    
    this.shortfallOption = shortfallOption;
  }


  public AccrualBalanceData printBalancePaystubOption(String printBalancePaystubOption) {
    
    
    
    
    this.printBalancePaystubOption = printBalancePaystubOption;
    return this;
  }

   /**
   * Whether to print the employee’s current balance (Current) or balance at the end of the pay period (Pay Period End Date) on the paystub
   * @return printBalancePaystubOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sal", value = "Whether to print the employee’s current balance (Current) or balance at the end of the pay period (Pay Period End Date) on the paystub")

  public String getPrintBalancePaystubOption() {
    return printBalancePaystubOption;
  }


  public void setPrintBalancePaystubOption(String printBalancePaystubOption) {
    
    
    
    this.printBalancePaystubOption = printBalancePaystubOption;
  }


  public AccrualBalanceData startingBalance(Double startingBalance) {
    
    
    
    
    this.startingBalance = startingBalance;
    return this;
  }

   /**
   * The employee’s start of year balance
   * @return startingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The employee’s start of year balance")

  public Double getStartingBalance() {
    return startingBalance;
  }


  public void setStartingBalance(Double startingBalance) {
    
    
    
    this.startingBalance = startingBalance;
  }


  public AccrualBalanceData hoursAddedYTD(Double hoursAddedYTD) {
    
    
    
    
    this.hoursAddedYTD = hoursAddedYTD;
    return this;
  }

   /**
   * Total hours added from start year to date. This value is required and cannot be null.
   * @return hoursAddedYTD
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "56", required = true, value = "Total hours added from start year to date. This value is required and cannot be null.")

  public Double getHoursAddedYTD() {
    return hoursAddedYTD;
  }


  public void setHoursAddedYTD(Double hoursAddedYTD) {
    
    
    
    this.hoursAddedYTD = hoursAddedYTD;
  }


  public AccrualBalanceData hoursUsedYTD(Double hoursUsedYTD) {
    
    
    
    
    this.hoursUsedYTD = hoursUsedYTD;
    return this;
  }

   /**
   * Total hours deducted from start year to date. This value is required and cannot be null.
   * @return hoursUsedYTD
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "56", required = true, value = "Total hours deducted from start year to date. This value is required and cannot be null.")

  public Double getHoursUsedYTD() {
    return hoursUsedYTD;
  }


  public void setHoursUsedYTD(Double hoursUsedYTD) {
    
    
    
    this.hoursUsedYTD = hoursUsedYTD;
  }


  public AccrualBalanceData availableBalance(Double availableBalance) {
    
    
    
    
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * Employee’s current available balance. This value is required and cannot be null.
   * @return availableBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8", required = true, value = "Employee’s current available balance. This value is required and cannot be null.")

  public Double getAvailableBalance() {
    return availableBalance;
  }


  public void setAvailableBalance(Double availableBalance) {
    
    
    
    this.availableBalance = availableBalance;
  }


  public AccrualBalanceData maxEntitledBalance(Double maxEntitledBalance) {
    
    
    
    
    this.maxEntitledBalance = maxEntitledBalance;
    return this;
  }

   /**
   * Maximum hours that an employee is entitled to use in a year
   * @return maxEntitledBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "160", value = "Maximum hours that an employee is entitled to use in a year")

  public Double getMaxEntitledBalance() {
    return maxEntitledBalance;
  }


  public void setMaxEntitledBalance(Double maxEntitledBalance) {
    
    
    
    this.maxEntitledBalance = maxEntitledBalance;
  }


  public AccrualBalanceData remainingEntitledBalance(Double remainingEntitledBalance) {
    
    
    
    
    this.remainingEntitledBalance = remainingEntitledBalance;
    return this;
  }

   /**
   * Hours remaining until maxEntitledBalance limit is reached
   * @return remainingEntitledBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "80", value = "Hours remaining until maxEntitledBalance limit is reached")

  public Double getRemainingEntitledBalance() {
    return remainingEntitledBalance;
  }


  public void setRemainingEntitledBalance(Double remainingEntitledBalance) {
    
    
    
    this.remainingEntitledBalance = remainingEntitledBalance;
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
   * @return the AccrualBalanceData instance itself
   */
  public AccrualBalanceData putAdditionalProperty(String key, Object value) {
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
    AccrualBalanceData accrualBalanceData = (AccrualBalanceData) o;
    return Objects.equals(this.employeeId, accrualBalanceData.employeeId) &&
        Objects.equals(this.plannerId, accrualBalanceData.plannerId) &&
        Objects.equals(this.payNumber, accrualBalanceData.payNumber) &&
        Objects.equals(this.periodEndDate, accrualBalanceData.periodEndDate) &&
        Objects.equals(this.timeOffTypeCode, accrualBalanceData.timeOffTypeCode) &&
        Objects.equals(this.timeOffTypeDescription, accrualBalanceData.timeOffTypeDescription) &&
        Objects.equals(this.printOption, accrualBalanceData.printOption) &&
        Objects.equals(this.payrunTypesToInclude, accrualBalanceData.payrunTypesToInclude) &&
        Objects.equals(this.printDelayinDays, accrualBalanceData.printDelayinDays) &&
        Objects.equals(this.shortfallOption, accrualBalanceData.shortfallOption) &&
        Objects.equals(this.printBalancePaystubOption, accrualBalanceData.printBalancePaystubOption) &&
        Objects.equals(this.startingBalance, accrualBalanceData.startingBalance) &&
        Objects.equals(this.hoursAddedYTD, accrualBalanceData.hoursAddedYTD) &&
        Objects.equals(this.hoursUsedYTD, accrualBalanceData.hoursUsedYTD) &&
        Objects.equals(this.availableBalance, accrualBalanceData.availableBalance) &&
        Objects.equals(this.maxEntitledBalance, accrualBalanceData.maxEntitledBalance) &&
        Objects.equals(this.remainingEntitledBalance, accrualBalanceData.remainingEntitledBalance)&&
        Objects.equals(this.additionalProperties, accrualBalanceData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, plannerId, payNumber, periodEndDate, timeOffTypeCode, timeOffTypeDescription, printOption, payrunTypesToInclude, printDelayinDays, shortfallOption, printBalancePaystubOption, startingBalance, hoursAddedYTD, hoursUsedYTD, availableBalance, maxEntitledBalance, remainingEntitledBalance, additionalProperties);
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
    sb.append("class AccrualBalanceData {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    plannerId: ").append(toIndentedString(plannerId)).append("\n");
    sb.append("    payNumber: ").append(toIndentedString(payNumber)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    timeOffTypeCode: ").append(toIndentedString(timeOffTypeCode)).append("\n");
    sb.append("    timeOffTypeDescription: ").append(toIndentedString(timeOffTypeDescription)).append("\n");
    sb.append("    printOption: ").append(toIndentedString(printOption)).append("\n");
    sb.append("    payrunTypesToInclude: ").append(toIndentedString(payrunTypesToInclude)).append("\n");
    sb.append("    printDelayinDays: ").append(toIndentedString(printDelayinDays)).append("\n");
    sb.append("    shortfallOption: ").append(toIndentedString(shortfallOption)).append("\n");
    sb.append("    printBalancePaystubOption: ").append(toIndentedString(printBalancePaystubOption)).append("\n");
    sb.append("    startingBalance: ").append(toIndentedString(startingBalance)).append("\n");
    sb.append("    hoursAddedYTD: ").append(toIndentedString(hoursAddedYTD)).append("\n");
    sb.append("    hoursUsedYTD: ").append(toIndentedString(hoursUsedYTD)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    maxEntitledBalance: ").append(toIndentedString(maxEntitledBalance)).append("\n");
    sb.append("    remainingEntitledBalance: ").append(toIndentedString(remainingEntitledBalance)).append("\n");
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
    openapiFields.add("EmployeeId");
    openapiFields.add("PlannerId");
    openapiFields.add("PayNumber");
    openapiFields.add("PeriodEndDate");
    openapiFields.add("TimeOffTypeCode");
    openapiFields.add("TimeOffTypeDescription");
    openapiFields.add("PrintOption");
    openapiFields.add("PayrunTypesToInclude");
    openapiFields.add("PrintDelayinDays");
    openapiFields.add("ShortfallOption");
    openapiFields.add("PrintBalancePaystubOption");
    openapiFields.add("StartingBalance");
    openapiFields.add("HoursAddedYTD");
    openapiFields.add("HoursUsedYTD");
    openapiFields.add("AvailableBalance");
    openapiFields.add("MaxEntitledBalance");
    openapiFields.add("RemainingEntitledBalance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("EmployeeId");
    openapiRequiredFields.add("PlannerId");
    openapiRequiredFields.add("TimeOffTypeDescription");
    openapiRequiredFields.add("HoursAddedYTD");
    openapiRequiredFields.add("HoursUsedYTD");
    openapiRequiredFields.add("AvailableBalance");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccrualBalanceData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccrualBalanceData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccrualBalanceData is not found in the empty JSON string", AccrualBalanceData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccrualBalanceData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("EmployeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EmployeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EmployeeId").toString()));
      }
      if (!jsonObj.get("PlannerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PlannerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PlannerId").toString()));
      }
      if (!jsonObj.get("TimeOffTypeCode").isJsonNull() && (jsonObj.get("TimeOffTypeCode") != null && !jsonObj.get("TimeOffTypeCode").isJsonNull()) && !jsonObj.get("TimeOffTypeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TimeOffTypeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TimeOffTypeCode").toString()));
      }
      if (!jsonObj.get("TimeOffTypeDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TimeOffTypeDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TimeOffTypeDescription").toString()));
      }
      if (!jsonObj.get("PrintOption").isJsonNull() && (jsonObj.get("PrintOption") != null && !jsonObj.get("PrintOption").isJsonNull()) && !jsonObj.get("PrintOption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrintOption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrintOption").toString()));
      }
      if (!jsonObj.get("PayrunTypesToInclude").isJsonNull() && (jsonObj.get("PayrunTypesToInclude") != null && !jsonObj.get("PayrunTypesToInclude").isJsonNull()) && !jsonObj.get("PayrunTypesToInclude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PayrunTypesToInclude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PayrunTypesToInclude").toString()));
      }
      if (!jsonObj.get("ShortfallOption").isJsonNull() && (jsonObj.get("ShortfallOption") != null && !jsonObj.get("ShortfallOption").isJsonNull()) && !jsonObj.get("ShortfallOption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ShortfallOption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ShortfallOption").toString()));
      }
      if (!jsonObj.get("PrintBalancePaystubOption").isJsonNull() && (jsonObj.get("PrintBalancePaystubOption") != null && !jsonObj.get("PrintBalancePaystubOption").isJsonNull()) && !jsonObj.get("PrintBalancePaystubOption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrintBalancePaystubOption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrintBalancePaystubOption").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccrualBalanceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccrualBalanceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccrualBalanceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccrualBalanceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AccrualBalanceData>() {
           @Override
           public void write(JsonWriter out, AccrualBalanceData value) throws IOException {
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
           public AccrualBalanceData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccrualBalanceData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccrualBalanceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccrualBalanceData
  * @throws IOException if the JSON string is invalid with respect to AccrualBalanceData
  */
  public static AccrualBalanceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccrualBalanceData.class);
  }

 /**
  * Convert an instance of AccrualBalanceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

