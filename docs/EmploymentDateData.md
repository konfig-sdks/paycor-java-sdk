

# EmploymentDateData

The Employment Date Data represents the Employee's Employment Date information.             

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hireDate** | **OffsetDateTime** | Date the employee was hired. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)               |  [optional] |
|**adjustedHireDate** | **OffsetDateTime** | Adjusted hire date is used when the employee&#39;s hire date does not accurately reflect benefits eligibility because an employee may have left,  been rehired or taken a Leave of Absence. This provides an alternative date for the employee&#39;s accruals to be calculated on.  Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)  |  [optional] |
|**terminationDate** | **OffsetDateTime** | Date the employee was terminated. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)               |  [optional] |
|**terminationReason** | **String** | Reason for the employee&#39;s termination.              |  [optional] |
|**reHireDate** | **OffsetDateTime** | Re-hire date of the employee. Terminated employees can be rehired.  Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)  |  [optional] |
|**seniorityDate** | **OffsetDateTime** | Date on which the calculation of an employee&#39;s seniority is based. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)               |  [optional] |



