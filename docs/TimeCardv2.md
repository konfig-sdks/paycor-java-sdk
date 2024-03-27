

# TimeCardv2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayDate** | **OffsetDateTime** | The date when the timecard was created. Format: YYYY-MM-DD |  [optional] |
|**inActualPunch** | **OffsetDateTime** | Date and time when the employee punched in. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)  |  [optional] |
|**outActualPunch** | **OffsetDateTime** | Date and time when the employee punched out. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)  |  [optional] |
|**inRoundedPunch** | **OffsetDateTime** | Date and rounded time when the employee punched in.  Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)  |  [optional] |
|**outRoundedPunch** | **OffsetDateTime** | Date and rounded time when the employee punched out. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)  |  [optional] |
|**hoursAmount** | **Double** | Amount of hours entered for employee&#39;s timecard. |  [optional] |
|**departmentCode** | **Long** | Department code where the employee&#39;s timecard was created. |  [optional] |
|**departmentName** | **String** | Department name where the employee&#39;s timecard was created. |  [optional] |
|**earningCode** | **String** | Identifies the type of earning for this timecard. |  [optional] |
|**laborCodes** | [**List&lt;LaborCode2&gt;**](LaborCode2.md) | List of type LaborCode containing the employee&#39;s labor code information.              |  [optional] |
|**employeeId** | **String** | Unique identifier of this employee. |  [optional] |
|**employeeNumber** | **Integer** | Unique number of the employee in a partner&#39;s tenant. |  [optional] |
|**badgeNumber** | **Integer** | Employee&#39;s assigned badge number.              |  [optional] |



