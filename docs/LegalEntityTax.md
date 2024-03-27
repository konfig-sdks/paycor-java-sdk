

# LegalEntityTax

The Legal Entity (Client) tax model represents organization Legal Entity Tax information.  

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**legalEntityTaxId** | **String** | Unique identifier of the legal entity tax in Paycor&#39;s system.              |  [optional] |
|**legalEntityId** | **Integer** | Unique identifier of the legal entity in Paycor&#39;s system.              |  [optional] |
|**taxCode** | **String** | Tax code values set at the client level.              |  [optional] |
|**description** | **String** | Description of  tax code. |  [optional] |
|**type** | **TaxType** |  |  [optional] |
|**taxAuthCode** | **String** | Tax authority code |  [optional] |
|**depositFrequency** | **DepositFrequencyType** |  |  [optional] |
|**effectiveStartDate** | **OffsetDateTime** | Specifies the effective start date of the tax |  [optional] |
|**sequenceNumber** | **Integer** | Specifies the sequence number of the tax |  [optional] |
|**rate** | **Double** | Tax rate               |  [optional] |
|**reciprocityType** | **ReciprocityType** |  |  [optional] |
|**offerDependentInsurance** | **Boolean** | Specifies whether dependent insurance is offered.              |  [optional] |
|**wagePlan** | **String** | Wage plan              |  [optional] |
|**itemHold** | **String** | Specifies Item hold status on the tax Specifies tax status |  [optional] |
|**legalEntity** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |



