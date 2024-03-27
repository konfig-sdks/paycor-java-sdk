

# MilitaryData

The Military Data model represents a Person's military information.             

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**veteran** | **VeteranStatus** |  |  [optional] |
|**dischargeDate** | **OffsetDateTime** | Discharge date of the person from the military per US protected veteran definition.  Available only if person&#39;s veteran status is &#39;true&#39;.              Format: YYYY-MM-DDTHH:MM:SSZ  (ISO-8601 standard)               |  [optional] |
|**isArmedForcesServiceMedalVeteran** | **Boolean** | Whether person qualifies as a medal recipient per US protected veteran definitions. Available only if person&#39;s veteran status is &#39;true&#39;.              |  [optional] |
|**isDisabledVeteran** | **Boolean** | Whether person qualifies as a disabled veteran per US protected veteran definitions. Available only if person&#39;s veteran status is &#39;true&#39;.              |  [optional] |
|**isOtherProtectedVeteran** | **Boolean** | Whether person qualifies as an other protected veteran per US protected veteran definitions. Available only if person&#39;s veteran status is &#39;true&#39;.              |  [optional] |
|**isRecentlySeparatedVeteran** | **Boolean** | Whether person qualifies as a recently separated veteran per US protected veteran definitions. Available only if person&#39;s veteran status is &#39;true&#39;.              |  [optional] |
|**isVietnamEra** | **Boolean** | Whether person qualifies as a Vietnam era veteran per US protected veteran definitions. Available only if person&#39;s veteran status is &#39;true&#39;.              |  [optional] |
|**isSpecialDisabled** | **Boolean** | A special disabled veteran is an individual who is legally approved for financial compensation  in accordance with laws provided by the Veterans Administration for disabilities that are rated at least 30 percent. .   |  [optional] |



