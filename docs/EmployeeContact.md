

# EmployeeContact

The PUT EmployeeContact model allows updating Employee's Contact Information fields.  All fields are optional. Fields not supplied with a value will retain previous values. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**homeEmail** | **String** | Home Email Address of an employee.              |  [optional] |
|**workEmail** | **String** | Work Email Address of an employee.              |  [optional] |
|**phones** | [**List&lt;Phone&gt;**](Phone.md) | List of type Phone containing phone numbers of the employee. Accepts Home, Mobile and Work phone numbers, upto 1 of each type. Only the specific number types passed in will be updated, existing phone numbers will remain unchanged.              |  [optional] |
|**primaryAddress** | [**GenericAddress**](GenericAddress.md) |  |  [optional] |



