

# EmployeeIdentifyingData

The PUT EmployeeIdentifyingData model allows updating Employee's personal data fields.  All fields are required, except EmployeeNumber, Middle Name and Status. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | First name of the employee. |  |
|**lastName** | **String** | Last name of the employee. |  |
|**middleName** | **String** | Middle name of the employee. |  [optional] |
|**suffix** | **Suffix** |  |  |
|**socialSecurityNumber** | **String** | Social security number of the employee. |  |
|**birthDate** | **OffsetDateTime** | Date of birth of the employee. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)  |  |



