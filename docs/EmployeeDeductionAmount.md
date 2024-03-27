

# EmployeeDeductionAmount

The Employee Deduction Amount model represents Employee Deductions Amount data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rate** | **Double** | Percentage value set by the user.              |  [optional] |
|**amount** | **Double** | Fixed, recurring deduction dollar amount.              |  [optional] |
|**factor** | **Double** |  |  [optional] |
|**effectiveStartDate** | **OffsetDateTime** | Date the employee deduction rates and amounts take effect. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)               |  [optional] |
|**effectiveEndDate** | **OffsetDateTime** | Date the employee deduction rates and amounts are no longer in effect (soft-delete flag). Null if still active. Date is formatted as MM/DD/YYY              |  [optional] |



