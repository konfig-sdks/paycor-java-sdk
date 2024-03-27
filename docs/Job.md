

# Job

Details about the Job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the Job in Paycor&#39;s system. |  [optional] |
|**atSAccountId** | **String** | The ATS client ID. |  [optional] |
|**number** | **String** | The job&#39;s human readable job number. |  [optional] |
|**title** | **String** | The job&#39;s name. |  [optional] |
|**description** | **String** | The job&#39;s description in HTML format. |  [optional] |
|**status** | **JobStatus** |  |  [optional] |
|**openings** | **Integer** | The number of openings for the job. |  [optional] |
|**priority** | **JobPriority** |  |  [optional] |
|**confidential** | **Boolean** | If the job is confidential. |  [optional] |
|**internal** | **Boolean** | If the job is an internal only job. |  [optional] |
|**timeToFill** | **Integer** | The targeted time to fill the job. |  [optional] |
|**remoteStatus** | **JobRemoteStatus** |  |  [optional] |
|**eeoCategory** | **String** | The EEO (Equal Employment Opportunity) category specification for the job. Can be one of these values: Executive/Senior-Level Officials and Managers, First/Mid-Level Officials and Managers, Professionals, Technicians, Sales Workers, Administrative Support Workers, Craft Workers, Operatives, Laborers and Helpers, Service Workers. |  [optional] |
|**payRange** | [**JobPayRange**](JobPayRange.md) |  |  [optional] |
|**atSLocation** | [**JobLocation**](JobLocation.md) |  |  [optional] |
|**atSDepartment** | [**JobDepartment**](JobDepartment.md) |  |  [optional] |
|**hiringManagers** | [**List&lt;JobUser&gt;**](JobUser.md) | The hiring managers assigned to the job. |  [optional] |
|**recruiters** | [**List&lt;JobUser&gt;**](JobUser.md) | The recruiters assigned to the job. |  [optional] |
|**teamMembers** | [**List&lt;JobUser&gt;**](JobUser.md) | The team members assigned to the job. |  [optional] |
|**executives** | [**List&lt;JobUser&gt;**](JobUser.md) | The executives assigned to the job. |  [optional] |
|**activatedDate** | **OffsetDateTime** | The date when the job was activated. |  [optional] |
|**createdDate** | **OffsetDateTime** | The date when the job was created. |  [optional] |
|**modifiedDate** | **OffsetDateTime** | The date when the job was last modified. |  [optional] |
|**postedToCareers** | **Boolean** | Is the job posted to the company careers page. |  [optional] |
|**postedToIndeed** | **Boolean** | Is the job posted to the free Indeed feed. |  [optional] |
|**postedToSmartSourcing** | **Boolean** | Is the job posted to Smart Sourcing. |  [optional] |
|**postedToLinkedIn** | **Boolean** | Is the job posted to the free LinkedIn. |  [optional] |
|**postedToZipRecruiter** | **Boolean** | Is the job posted to the free ZipRecruiter feed. |  [optional] |
|**postedToGravity** | **Boolean** | Is the job posted to Gravity.              |  [optional] |



