

# EmployeePayRate3

The Update PayRate model includes fields that can be updated on an existing PayRate. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveStartDate** | **OffsetDateTime** | Represents the date that the payrate goes into effect.  PUT requires EffectiveStartDate value to be unique for this PayRateId.               |  |
|**sequenceNumber** | **Integer** | Orders how multiple earnings are calculated. Needed so earnings dependent on other earnings are calculated in the proper sequence. For PUT, this should match an existing SequenceNumber (retrieved via GET Employee PayRates). |  [optional] |
|**payRate** | **Double** | Employee&#39;s rate of pay (in dollars).  If Pay Type is Hourly, then Pay Rate is a Per-Hour dollar amount and is required.  If Pay Type is Salary, then Pay Rate is a Per-Pay dollar amount, and either Pay Rate or Annual Rate is required. Payrate can&#39;t have more than 6 decimal places and can&#39;t be negative.               |  |
|**annualPayRate** | **Double** | Employee&#39;s annual pay amount (in dollars). Only used if Type&#x3D;Salary.  * For Salary Type, AnnualPayRate overrides payRate if passed into API call. The value not provided will be calculated based on Employee&#39;s Annual Hours setup on Employee&#39;s Profile. * For Hourly Type, this parameter is ignored - Paycor calculates based on Employee&#39;s Annual Hours setup on Employee&#39;s Profile.              |  [optional] |
|**description** | **String** | Required. Brief description of the employee&#39;s pay rate. Defaults to \&quot;Rate {SequenceNumber}\&quot; Must be 20 characters or less              |  |
|**type** | **PayType** |  |  [optional] |
|**reason** | **String** | Reason associated with the employee&#39;s pay rate. Optional.               |  [optional] |
|**notes** | **String** | Notes associated with the employee&#39;s pay rate, which will be displayed on Pay Rate History page.  Must be 512 characters or less. Optional.               |  [optional] |



