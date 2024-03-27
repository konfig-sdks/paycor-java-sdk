

# ImportEarning

Employee-specific Payroll Import row for a specific working date range. Includes all Pay-related info. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**departmentCode** | **Long** | Department code that the Hours should be paid under. You can use GET Legal Entity Departments to retrieve valid Code values.  |  |
|**earningCode** | **String** | Employee&#39;s earning Code. You can retrieve via Get Employee Earnings endpoints. |  |
|**earningHours** | **Double** | Number of hours that Employee worked. |  [optional] |
|**earningAmount** | **Double** | Dollar amount that Employee earned. |  [optional] |
|**earningRate** | **Double** | Dollar rate to assign to the earning.  |  [optional] |
|**businessStartDate** | **OffsetDateTime** | Start date of TimeCard |  |
|**businessEndDate** | **OffsetDateTime** | End date of TimeCard |  [optional] |
|**dateWorked** | **OffsetDateTime** | The date worked (associated with this earning).  Optional. May be used by clients who have Workweek calculation feature enabled or by specific partner integrations. |  [optional] |
|**laborCodes** | [**List&lt;LaborCode&gt;**](LaborCode.md) | Optional. This allows supplying Labor Codes tied to this earning, used for Job Costing and other functionality.  |  [optional] |
|**payGroupId** | **String** | Unique identifier of the pay group in Paycor&#39;s system. You can retrieve by calling &#39;Get Pay Groups by Legal Entity ID&#39; |  |
|**payNumber** | **Integer** | Optional, defaults to 1.  Indicates which paycheck for this employee the earning will appear on (essentially a sort order for the particular Employee).  Use sequential values such as 1, 2, 3... |  [optional] |
|**clientDefinedValue** | **String** | Optional. This field allows passing in additional information used by specific partner integrations. |  [optional] |



