

# EmployeePositionAndStatus

The PUT Employee Position And Status model allows updating Employee's Position and Status Information fields.  Employee Status fields are: EmploymentStatus and RehireDate. Both fields have to be set in order to update Employee Status. Employee Position fields are: EmploymentType, WorkLocation, JobTitle, FLSA, ManagerId, DepartmentId. Fields EmployeeType and WorkLocation have to be set in order to update Employee Position.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employmentStatus** | **EmploymentStatus2** |  |  |
|**rehireDate** | **OffsetDateTime** | Re-hire date of the employee. Terminated employees can be rehired.  Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)  |  |
|**employmentType** | **EmploymentType** |  |  |
|**workLocation** | **String** | The name of the Work Location to associate with Employee.  * Must be an existing Work Location, use Legal Entity Work Locations to retrieve a list of valid names.              |  |
|**jobTitle** | **String** | Name of the Job Title to associate with Employee.  * Must be an existing Job setup on the Tenant. Use API &#39;GET Tenant Job Titles by TenantId&#39; to retrieve a list of valid names.              |  [optional] |
|**flsa** | **FlsaType** |  |  [optional] |
|**managerId** | **String** | Unique identifier of Employee in Paycor&#39;s system.  * Must be an existing Employee, use the EmployeeID provided from other GET Employee endpoints  |  [optional] |
|**departmentId** | **String** | Identifier of Department. * Use API &#39;GET Legal Entity Departments by Legal Entity id&#39; to retrieve a list of valid departments.              |  [optional] |



