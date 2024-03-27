

# EmployeeDeductionAmount2

The Employee Deduction Amount model represents Employee Deductions Amount data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rate** | **Double** | Percentage value set by the user.              |  [optional] |
|**amount** | **Double** | Fixed, recurring deduction dollar amount.              |  [optional] |
|**effectiveStartDate** | **OffsetDateTime** | Date the employee deduction rates and amounts take effect. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)               |  |
|**effectiveEndDate** | **OffsetDateTime** | Date the employee deduction rates and amounts are no longer in effect. If null, then the rate &amp; amount are still in effect. If not null, the rate &amp; amount are considered \&quot;deleted.\&quot; Date is formatted as MM/DD/YYY              |  [optional] |



