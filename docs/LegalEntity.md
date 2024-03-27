

# LegalEntity

The Legal Entity (Client) model represents organization Legal Entity information. Provides links to the Legal Entity's associated Tenant, Employee, Person, Earning, Deduction, Taxes and Custom Field information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the legal entity in Paycor&#39;s system. This is also known as the Client Id.              |  [optional] |
|**name** | **String** | Name of the legal entity.               |  [optional] |
|**federalId** | **String** | US Federal tax Identification Number/Employer Identification Number.               |  [optional] |
|**type** | **CorporationType** |  |  [optional] |
|**isLost** | **Boolean** | Flag that shows is the client active in Paycor system. Once a client is marked Lost, it will never reset to IsLost&#x3D;false. A new LegalEntityId would be created instead |  [optional] |
|**businessNames** | [**List&lt;BusinessName&gt;**](BusinessName.md) | List of type BusinessName containing the legal entity&#39;s name, addresses and types.               |  [optional] |
|**tenant** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |
|**employees** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |
|**persons** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |
|**earnings** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |
|**deductions** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |
|**taxes** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |



