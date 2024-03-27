

# LaborCodeV2

The LaborCode model is used to define rules for Employees including minimum and maximum hours, overtime and benefits.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**laborCategoryLevel** | **Integer** | This represents the Labor Category level the Labor Code is associated with.   You can find the correlating Labor Category Level by calling GET Labor Categories  by Legal Entity ID and matching on the \&quot;CategoryLevel\&quot; field (available values &#x3D; 1-6). |  [optional] |
|**laborCode** | **String** | The labor code associated with the punch pair. |  [optional] |
|**laborCodeName** | **String** | The labor code name associated with the punch pair. |  [optional] |



