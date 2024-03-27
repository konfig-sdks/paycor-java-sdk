

# LegalEntityPayData

Each instance of this object represents an Employee being paid on a specific date.   Provides link to the associated Legal Entity information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **String** | Unique identifier of this employee who was paid. |  [optional] |
|**checkDate** | **OffsetDateTime** | The paycheck date for this employee. Also referred to as Pay Date. |  [optional] |
|**processDate** | **OffsetDateTime** | The internal pay processing date for this employee.  |  [optional] |
|**legalEntity** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |
|**employeePaystub** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |



