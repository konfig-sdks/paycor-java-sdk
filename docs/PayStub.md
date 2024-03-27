

# PayStub


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **String** | Unique identifier of this employee |  [optional] |
|**clientId** | **Integer** | Unique identifier of the legal entity in Paycor&#39;s system |  [optional] |
|**checkNumber** | **Long** | Check number. |  [optional] |
|**plannerId** | **String** | Unique identifier of the Planner Id for this Paystub. |  [optional] |
|**checkType** | **CheckType** |  |  [optional] |
|**periodStartDate** | **OffsetDateTime** | Start date of the pay period Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)               |  [optional] |
|**periodEndDate** | **OffsetDateTime** | End date of the pay period Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)               |  [optional] |
|**grossAmount** | **Double** | Employee&#39;s grosspay |  [optional] |
|**netAmount** | **Double** | Employee&#39;s netpay |  [optional] |
|**earnings** | [**PayStubEarning**](PayStubEarning.md) |  |  [optional] |
|**taxes** | [**PayStubTax**](PayStubTax.md) |  |  [optional] |
|**deductions** | [**PayStubDeduction**](PayStubDeduction.md) |  |  [optional] |
|**employee** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |
|**legalEntity** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |



