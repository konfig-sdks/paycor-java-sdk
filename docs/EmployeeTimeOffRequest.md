

# EmployeeTimeOffRequest

Employee Time Off Request model represents information about time off requests for specific employee.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**legalEntityId** | **Integer** |  |  [optional] |
|**timeOffRequestId** | **String** | Unique identifier of this time off request. |  [optional] |
|**benefitCode** | **String** |  |  [optional] |
|**totalHours** | **Double** | Total amount of hours inside this time off request. |  [optional] |
|**days** | [**List&lt;TimeOffRequestDay&gt;**](TimeOffRequestDay.md) | Collection of days for this time off request. |  [optional] |
|**comment** | **String** | Additional comment for this time off request. Optional. Currently not available in Get Employee Time Off Requests by EmployeeId. |  [optional] |
|**status** | **String** | Status of this time off request. Status could be Pending, Approved, Denied, Removed, Canceled or empty |  [optional] |
|**createdDate** | **OffsetDateTime** | Date and time when this time off request is created. |  [optional] |
|**statusUpdateTime** | **OffsetDateTime** | Date and time when is the status of this time off request updated. |  [optional] |
|**statusUpdateByEmployeeId** | **String** | Unique identifier of employee who is updated status. |  [optional] |
|**createdByEmployeeId** | **String** | Unique identifier of employee who is created this time off request. |  [optional] |
|**employeeId** | **String** | Unique identifier of this employee. |  [optional] |



