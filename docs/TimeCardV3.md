

# TimeCardV3

The Timecard model represents Employee level time, punch details,pay rate (GROSSPAY) and associated labor code information. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **String** | Unique identifier of this employee. |  [optional] |
|**employeeNumber** | **Integer** | Unique number of the Employee in the Legal Entity. |  [optional] |
|**badgeNumber** | **Integer** | Employee&#39;s assigned badge number.              |  [optional] |
|**displayDate** | **OffsetDateTime** | The date when the timecard was created. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)  |  [optional] |
|**punchIn** | **OffsetDateTime** | Date and time when the employee punched in. Format: YYYY-MM-DDTHH:MM:SS |  [optional] |
|**punchOut** | **OffsetDateTime** | Date and time when the employee punched out. Format: YYYY-MM-DDTHH:MM:SS |  [optional] |
|**hourAmount** | **Double** | Amount of hours entered for employee&#39;s timecard. |  [optional] |
|**departmentCode** | **Long** | Department Code where the Employee worked. |  [optional] |
|**departmentName** | **String** | Department name where the Employee worked. |  [optional] |
|**earningCode** | **String** | Identifies the type of earning for this timecard. |  [optional] |
|**estimatedGrossPay** | **Double** | Employee&#39;s estimated pay for the entire Punch pair..               |  [optional] |
|**laborCodes** | [**List&lt;LaborCodeV2&gt;**](LaborCodeV2.md) | List of type LaborCode containing the employee&#39;s labor code information.              |  [optional] |



