

# PagedResultOfSmartlinxEmployeeMapping

The Paged Result model enables pagination of results if maximum of 100 records per response is exceeded. Additional results can be requested by providing calling the AdditionalResultsUrl endpoint containing the continuation token, or by building your own URL using the provided continuation token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hasMoreResults** | **Boolean** | Whether additional API result records exist on the Paycor system. |  [optional] |
|**continuationToken** | **String** | Paycor generated token string which may be provided in a subsequent request to  release additional records past the maximum.  Used when partner is building their own URL. |  [optional] |
|**additionalResultsUrl** | **String** | Provides URL to call with the continuation token included for additional results.  |  [optional] |
|**records** | [**List&lt;SmartlinxEmployeeMapping&gt;**](SmartlinxEmployeeMapping.md) | List of the API response records.  |  [optional] |



