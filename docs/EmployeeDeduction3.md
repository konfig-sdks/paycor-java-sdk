

# EmployeeDeduction3

The employee deduction update model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier of this employee deduction generated in Paycor&#39;s system. Used as the Key for Update (PUT) endpoint.  |  |
|**includeInPay** | **IncludeInPay** |  |  [optional] |
|**frequency** | **PayFrequency** |  |  [optional] |
|**onHold** | **Boolean** | Specifies whether the deduction should be deducted in a paycheck. Required, defaults to false (meaning it should be deducted).              |  [optional] |
|**amountData** | [**List&lt;EmployeeDeductionAmount3&gt;**](EmployeeDeductionAmount3.md) | Specifies the rate and amount for the employee deduction.              |  [optional] |



