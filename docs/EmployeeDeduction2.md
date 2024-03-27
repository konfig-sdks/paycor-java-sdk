

# EmployeeDeduction2

The employee deduction create model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Unique deduction code set at the legal entity or tenant level.   |  |
|**onHold** | **Boolean** | Specifies whether the deduction should be deducted in a paycheck.              |  [optional] |
|**frequency** | **PayFrequency** |  |  [optional] |
|**includeInPay** | **IncludeInPay** |  |  [optional] |
|**amountData** | [**List&lt;EmployeeDeductionAmount2&gt;**](EmployeeDeductionAmount2.md) | Specifies the rate and amount for the employee deduction.              |  [optional] |



