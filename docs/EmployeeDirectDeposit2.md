

# EmployeeDirectDeposit2

The Employee Direct Deposit model represents an Employee's Direct Deposit information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountType** | **AccountType** |  |  |
|**accountNumber** | **String** | The bank account number where the direct deposit is directed.              |  [optional] |
|**routingNumber** | **String** | The bank routing number where the direct deposit is directed.               |  [optional] |
|**frequency** | **PayFrequency** |  |  |
|**deductionCode** | **String** |  |  [optional] |
|**directDepositType** | **DirectDepositType** |  |  [optional] |
|**onHold** | **Boolean** | Whether any money should be deposited into the direct deposit account. |  |
|**amount** | **Double** | Fixed, recurring dollar amount.              |  [optional] |
|**rate** | **Double** | Percentage of the paycheck to be deposited into the direct deposit account              |  [optional] |



