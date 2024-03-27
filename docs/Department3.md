

# Department3

The Department model represents legal entity department information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**departmentId** | **String** | Unique Identifier of the Department in Paycor&#39;s system.              |  |
|**code** | **String** | User defined department code. Only numeric characters are allowed and the limit is 14 characters. |  |
|**parentId** | **String** | Id of the parent department (or payroll) under which new department will be created. When updating top level departments, payroll id should be used as parent id |  |
|**description** | **String** | User defined description of the department. |  |
|**workLocationId** | **String** | The ID of the Work Location to associate with new department.  * Must be an existing Work Location on the Legal Entity. Use API &#39;Get a list of Work Locations for a Legal Entity&#39; to retrieve a list of valid IDs.               |  |



