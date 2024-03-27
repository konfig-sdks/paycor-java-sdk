

# Schedule2

The Schedule create model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDateTime** | **OffsetDateTime** | Date and time the employee will begin work. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              |  [optional] |
|**endDateTime** | **OffsetDateTime** | Date and time the employee will stop work. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)              |  [optional] |
|**beforeStartTimeInMinutes** | **Integer** | Punches will be tied to the schedule if employee clocks in this many Minutes before shift starts. |  [optional] |
|**afterEndTimeInMinutes** | **Integer** | Punches will be tied to the schedule if employee clocks out this many Minutes after shift ends. |  [optional] |
|**label** | **String** | This is the label that will be assigned to the shift.              |  [optional] |
|**shiftDepeartmentId** | **String** | Unique identifier of the Department where the employee&#39;s timecard will be created. |  [optional] |



