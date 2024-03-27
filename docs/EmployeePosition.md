

# EmployeePosition

The PUT Employee Position model allows updating Employee's Position fields.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employmentType** | **EmploymentType** |  |  |
|**workLocation** | **String** | The name of the Work Location to associate with Employee.  * Must be an existing Work Location. Use API &#39;GET Legal Entity Work Location by Legal Entity ID&#39; to retrieve a list of valid names.              |  |
|**jobTitle** | **String** | Name of the Job Title to associate with Employee.  * Must be an existing Job setup on the Tenant. Use API &#39;GET Tenant Job Titles by TenantId&#39; to retrieve a list of valid names.              |  [optional] |
|**flsa** | **FlsaType** |  |  [optional] |
|**managerId** | **String** | Unique identifier of Employee in Paycor&#39;s system.  |  [optional] |
|**departmentId** | **String** | Identifier of Department.              |  [optional] |



