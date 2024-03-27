

# EmployeeHsaDirectDeposit

The Employee HSA Direct Deposit model represents an Employee's HSA Direct Deposit information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountType** | **AccountType** |  |  |
|**accountNumber** | **String** | The bank account number where the HSA direct deposit is directed.              |  [optional] |
|**routingNumber** | **String** | The bank routing number where the HSA direct deposit is directed.               |  [optional] |
|**frequency** | **PayFrequency** |  |  |
|**deductionCode** | **String** | Unique deduction code set at the legal entity or tenant level.   |  |
|**onHold** | **Boolean** | Whether any money should be deposited into the HSA direct deposit account. |  |
|**amount** | **Double** | Fixed, recurring dollar amount.              |  [optional] |
|**rate** | **Double** | Percentage of the paycheck to be deposited into the HSA direct deposit account              |  [optional] |



