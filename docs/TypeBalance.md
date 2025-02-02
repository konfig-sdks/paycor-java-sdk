

# TypeBalance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeOffPlanName** | **String** | Name of the time off plan related to this balance. |  [optional] |
|**timeOffTypeId** | **String** | Unique identifier of the time off plan record in Paycor&#39;s system. Generated by Paycor. |  [optional] |
|**timeOffTypeCode** | **String** | Abbreviated code of the time off type linked to this plan (admin-configured) |  [optional] |
|**timeOffTypeName** | **String** | Name of the time off type linked to this plan (admin-configured) |  [optional] |
|**activityStartDate** | **OffsetDateTime** | Date range this time off balance record covers.  |  [optional] |
|**activityEndDate** | **OffsetDateTime** | Date range this time off balance record covers.  |  [optional] |
|**currentBalance** | **Double** | Current balance (in hours) within this plan and date range, including upcoming approved requests.  |  [optional] |
|**accruedBalance** | **Double** | Total number of hours accrued (earned) within this plan and date range.  |  [optional] |
|**usedBalance** | **Double** | Number of hours used (spent) so far within this plan and date range.  |  [optional] |
|**scheduledBalance** | **Double** | Scheduled upcoming time off within this plan and date range, in hours. |  [optional] |
|**defaultEarning** | [**EarningCodeLight**](EarningCodeLight.md) |  |  [optional] |



