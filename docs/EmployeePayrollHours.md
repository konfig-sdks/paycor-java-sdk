

# EmployeePayrollHours

Employee Payroll Hours of Legal Entity Payrun Accrual Data.             

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **String** | Unique identifier of the employee. |  [optional] |
|**payNumber** | **Integer** | Number of checks that an employee will get for a particular payrun. |  [optional] |
|**legalEntityEarningID** | **String** | Identifier of the Legal Entity Earning |  [optional] |
|**paidHours** | **Double** | The actual hours that the employee have paid for the given payrun |  [optional] |
|**importedHours** | **Double** | The hours that were imported during key-in/reviewing the payrun before posting it |  [optional] |
|**adjustedHours** | **Double** | Self calculated value of PaidHours-ImportedHours |  [optional] |
|**departmentId** | **String** | Employee Department Id against which the items were posted for distribution |  [optional] |



