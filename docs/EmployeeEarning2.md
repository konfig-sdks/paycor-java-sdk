

# EmployeeEarning2

A record of one specific earning that one particular employee has setup, including employee-specific details such as amount. Must be tied to an earning at the LegalEntity level.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Descriptive earning identifier which appears on paychecks. Only set at the legal entity or tenant level. |  |
|**frequency** | **PayFrequency** |  |  [optional] |
|**sequenceNumber** | **Integer** | Order earnings are calculated based on sequence values. This is needed so earnings dependent on other earnings are calculated in the proper sequence. |  [optional] |
|**includeInPay** | **IncludeInPay** |  |  [optional] |
|**onHold** | **Boolean** | Whether the employee earning should included in a paycheck. This is specified by the &#39;Calculate&#39; checkbox in the Paycor UI.              |  [optional] |
|**amountData** | [**List&lt;EmployeeEarningAmount&gt;**](EmployeeEarningAmount.md) | List of the employee&#39;s earning rates, factors and amounts of type EmployeeEarningAmount.              |  |



