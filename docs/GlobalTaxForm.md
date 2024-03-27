

# GlobalTaxForm

The Global Tax Form model represents required fields when creating/updating Employee tax. So that user can easily determine what data needs to be passed for each specific Tax Code.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveStartDate** | **OffsetDateTime** | Effective start date of withholding. |  [optional] |
|**effectiveEndDate** | **OffsetDateTime** | Effective end date of withholding. |  [optional] |
|**hasFilingStatus** | **Boolean** | Information whether global tax requires the Filing status. |  [optional] |
|**hasAdjustWithholding** | **Boolean** | Information whether global tax requires the adjust witholding field. |  [optional] |
|**hasOverrideWithholdingDate** | **Boolean** | Information whether global tax requires the override witholding date field. |  [optional] |
|**hasApplicableBirthYear** | **Boolean** | Information whether global tax requires the applicable birth year field. |  [optional] |
|**hasAmount** | **Boolean** | Information whether global tax requires the amount field. |  [optional] |
|**hasRate** | **Boolean** | Information whether global tax requires the rate field. |  [optional] |
|**hasExemptionAmount** | **Boolean** | Information whether global tax requires exemption amount field. |  [optional] |
|**hasNonResidentAlien** | **Boolean** | Information whether global tax requires non resident alien field. |  [optional] |
|**hasNumberOfQualifiedDependents** | **Boolean** | Information whether global tax requires the number of qualified dependents field. |  [optional] |
|**hasNumberOfOtherDependents** | **Boolean** | Information whether global tax requires the Number Of Other Dependents field. |  [optional] |
|**hasNumberOfExemptions** | **Boolean** | Information whether global tax requires the Number Of Exemptions field. |  [optional] |
|**hasSpouseWorking** | **Boolean** | Information whether global tax requires the Spouse Working field. |  [optional] |
|**hasTwoIncomes** | **Boolean** | Information whether global tax requires the HasTwoIncomes field. |  [optional] |
|**hasAdditionalIncome** | **Boolean** | Information whether global tax requires the AdditionalIncome field. Amount of employee&#39;s additional income as specified on employee&#39;s IRS Form W-4. |  [optional] |
|**hasAdditionalDeduction** | **Boolean** | Information whether global tax requires the Additional Deduction field. |  [optional] |
|**hasAccuracyConfirmation** | **Boolean** | Information whether global tax requires the Accuracy Confirmation field. |  [optional] |
|**hasQualifiedDependentCredit** | **Boolean** | Information whether global tax requires the Qualified Dependent Credit field. |  [optional] |
|**hasOtherDependentCredit** | **Boolean** | Information whether global tax requires the Other Dependent Credit field. |  [optional] |
|**hasTotalCredits** | **Boolean** | Information whether global tax requires Total Credits field. |  [optional] |
|**qualifiedDependentCredit** | **Double** | Information whether global tax requires Qualified Dependent Credit field. |  [optional] |
|**otherDependentCredit** | **Double** | Information whether global tax requires Other Dependent Credit field. |  [optional] |
|**filingStatuses** | [**List&lt;FilingStatus&gt;**](FilingStatus.md) | Enumeration of valid filing status values for this tax code. |  [optional] |
|**hasIncomeTax** | **String** | Information whether global tax requires the Income Tax field. |  [optional] |



