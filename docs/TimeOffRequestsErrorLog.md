

# TimeOffRequestsErrorLog

Time Off Request Error log model represents information about error logs in the create timeoff request api.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**trackingId** | **String** | Unique identifier of the request. This is the output of creating bulk Timeoff request |  [optional] |
|**toRDetail** | **String** | TimeOffRequest details LegalEntityId, EmployeeUID and date of timeoffrequest that failed while importing |  [optional] |
|**errorDetail** | **String** | Error details of failed request |  [optional] |



