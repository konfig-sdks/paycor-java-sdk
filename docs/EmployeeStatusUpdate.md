

# EmployeeStatusUpdate

The Employee Status model to update Employee Status related data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveDate** | **OffsetDateTime** | Date at which the employee status update takes effect. Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)               |  |
|**employeeStatus** | **EmploymentStatus** |  |  |
|**employeeStatusReasonId** | **String** | Unique Identifier for Employee Status Reason. All possible Status Reason Values can be found using Get Legal Entity Status Reason values endpoint.              |  [optional] |
|**eligibleForRehire** | **EligibleForRehire** |  |  [optional] |
|**isVoluntaryByEmployee** | **Boolean** | Determines if an employee termination is voluntary or not.  This is required when EmployeeStatus is updated to one of these values: Deceased, LaidOff, Resigned, Retired, Terminated. Otherwise optional.              |  [optional] |
|**notes** | **String** | Notes associated with the employee&#39;s status update, which will be stored in Employee&#39;s Status History.              |  [optional] |



