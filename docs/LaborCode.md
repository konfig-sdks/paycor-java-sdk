

# LaborCode

Labor Code (also called Job Code) is used for Job Costing functionality.  Note that both Category and Code are required in order to be unique. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**category** | **String** | Job Category (also known as Labor Category) are used to organize Job Codes.  This feature is used for Job Costing support, which not all clients will use. Categories must be configured in advance by an HR Admin in Perform.  You can use GET Legal Entity Job Categories API to retrieve.  |  [optional] |
|**code** | **String** | Job Code is used for Job Costing functionality, to map paid amounts to a project. You can use GET Legal Entity Job Codes APIs to retrieve. This field expects the Code, not the Labor Code Name.  Not all clients will use Job Costing.  |  [optional] |



