

# ImportPayrollHours

Request body object for importing Payroll data into Paycor's Payroll system (not Time system).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**integrationVendor** | **String** | Required freeform field for tracking purposes. You can input your company or application name. |  |
|**processId** | **String** | Unique identifier of the transaction to prevent double-posting in Paycor&#39;s systems.  Please generate a new GUID (using any method) for every API call. Use the same GUID only when you want to replace existing data. |  |
|**importEmployees** | [**List&lt;ImportEmployee&gt;**](ImportEmployee.md) | List of Employees, with nested lists of Earnings, to import into Paycor&#39;s Paygrid system.  |  |



