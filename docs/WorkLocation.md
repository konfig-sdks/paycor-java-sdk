

# WorkLocation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the work location. |  |
|**storeId** | **String** | Unique identifier of the work location store. StoreId is used for clients with WOTC Service only, defaults to Worklocation name if not provided. |  [optional] |
|**isFmlaEligible** | **Boolean** | Flag which determines if work location is FMLA eligible (Family and Medical Leave Act). |  [optional] |
|**addresses** | [**List&lt;WorkLocationAddress&gt;**](WorkLocationAddress.md) | A list of work location&#39;s addresses. |  |
|**phoneNumbers** | [**List&lt;WorkLocationPhoneNumber&gt;**](WorkLocationPhoneNumber.md) | A list of the work location&#39;s phone numbers.              |  [optional] |



