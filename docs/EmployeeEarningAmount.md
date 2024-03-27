

# EmployeeEarningAmount

The Employee Earning Amount model represents Employee Earning Amount data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rate** | **Double** | Amount per hour the employee will obtain from this earning.              |  [optional] |
|**amount** | **Double** | Fixed, recurring dollar amount.              |  [optional] |
|**factor** | **Double** | Multiplier used with the hourly rate to calculate other earnings. Default value is 1, unless changed at the global level.              |  [optional] |
|**effectiveStartDate** | **OffsetDateTime** | Date the employee earning rates and amounts take effect. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)               |  |
|**effectiveEndDate** | **OffsetDateTime** | Date the employee earning rates and amounts are no longer in effect. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)               |  [optional] |



