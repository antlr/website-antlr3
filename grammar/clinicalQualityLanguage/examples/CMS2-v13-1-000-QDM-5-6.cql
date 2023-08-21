library PCSDepressionScreenAndFollowUp version '13.1.000'

using QDM version '5.6'

include MATGlobalCommonFunctions version '7.0.000' called Global

codesystem "LOINC": 'urn:oid:2.16.840.1.113883.6.1'
codesystem "SNOMEDCT": 'urn:oid:2.16.840.1.113883.6.96'

valueset "Adolescent Depression Medications": 'urn:oid:2.16.840.1.113883.3.526.3.1567'
valueset "Adult Depression Medications": 'urn:oid:2.16.840.1.113883.3.526.3.1566'
valueset "Bipolar Disorder": 'urn:oid:2.16.840.1.113883.3.67.1.101.1.128'
valueset "Encounter to Screen for Depression": 'urn:oid:2.16.840.1.113883.3.600.1916'
valueset "Ethnicity": 'urn:oid:2.16.840.1.114222.4.11.837'
valueset "Follow Up for Adolescent Depression": 'urn:oid:2.16.840.1.113883.3.526.3.1569'
valueset "Follow Up for Adult Depression": 'urn:oid:2.16.840.1.113883.3.526.3.1568'
valueset "Medical Reason": 'urn:oid:2.16.840.1.113883.3.526.3.1007'
valueset "ONC Administrative Sex": 'urn:oid:2.16.840.1.113762.1.4.1'
valueset "Payer": 'urn:oid:2.16.840.1.114222.4.11.3591'
valueset "Physical Therapy Evaluation": 'urn:oid:2.16.840.1.113883.3.526.3.1022'
valueset "Race": 'urn:oid:2.16.840.1.114222.4.11.836'
valueset "Referral for Adolescent Depression": 'urn:oid:2.16.840.1.113883.3.526.3.1570'
valueset "Referral for Adult Depression": 'urn:oid:2.16.840.1.113883.3.526.3.1571'
valueset "Telephone Visits": 'urn:oid:2.16.840.1.113883.3.464.1003.101.12.1080'

code "Adolescent depression screening assessment": '73831-0' from "LOINC" display 'Adolescent depression screening assessment'
code "Adult depression screening assessment": '73832-8' from "LOINC" display 'Adult depression screening assessment'
code "Depression screening declined (situation)": '720834000' from "SNOMEDCT" display 'Depression screening declined (situation)'
code "Depression screening negative (finding)": '428171000124102' from "SNOMEDCT" display 'Depression screening negative (finding)'
code "Depression screening positive (finding)": '428181000124104' from "SNOMEDCT" display 'Depression screening positive (finding)'

parameter "Measurement Period" Interval<DateTime>

context Patient

define "Denominator":
  "Initial Population"

define "Denominator Exceptions":
  ( exists "Medical or Patient Reason for Not Screening Adolescent for Depression"
      and not "Has Adolescent Depression Screening"
  )
    or ( exists "Medical or Patient Reason for Not Screening Adult for Depression"
        and not "Has Adult Depression Screening"
    )

define "Medical or Patient Reason for Not Screening Adolescent for Depression":
  ["Assessment, Not Performed": "Adolescent depression screening assessment"] NoAdolescentScreen
    with "Qualifying Encounter During Measurement Period" QualifyingEncounter
      such that NoAdolescentScreen.authorDatetime during QualifyingEncounter.relevantPeriod
    where ( NoAdolescentScreen.negationRationale ~ "Depression screening declined (situation)"
        or NoAdolescentScreen.negationRationale in "Medical Reason"
    )

define "Medical or Patient Reason for Not Screening Adult for Depression":
  ["Assessment, Not Performed": "Adult depression screening assessment"] NoAdultScreen
    with "Qualifying Encounter During Measurement Period" QualifyingEncounter
      such that NoAdultScreen.authorDatetime during QualifyingEncounter.relevantPeriod
    where ( NoAdultScreen.negationRationale ~ "Depression screening declined (situation)"
        or NoAdultScreen.negationRationale in "Medical Reason"
    )

define "Patient Age 12 to 16 Years at Start of Measurement Period":
  AgeInYearsAt(date from start of "Measurement Period")in Interval[12, 16]

define "Patient Age 12 Years or Older at Start of Measurement Period":
  AgeInYearsAt(date from start of "Measurement Period")>= 12

define "Patient Age 17 Years at Start of Measurement Period":
  AgeInYearsAt(date from start of "Measurement Period")= 17

define "Patient Age 18 Years or Older at Start of Measurement Period":
  AgeInYearsAt(date from start of "Measurement Period")>= 18

define "SDE Ethnicity":
  ["Patient Characteristic Ethnicity": "Ethnicity"]

define "SDE Payer":
  ["Patient Characteristic Payer": "Payer"]

define "SDE Race":
  ["Patient Characteristic Race": "Race"]

define "SDE Sex":
  ["Patient Characteristic Sex": "ONC Administrative Sex"]

define "History of Bipolar Diagnosis Before Qualifying Encounter":
  ["Diagnosis": "Bipolar Disorder"] BipolarDiagnosis
    with "Qualifying Encounter During Measurement Period" QualifyingEncounter
      such that BipolarDiagnosis.prevalencePeriod starts before QualifyingEncounter.relevantPeriod

define "Has Most Recent Adolescent Screening Negative":
  ( "Most Recent Adolescent Depression Screening" AdolescentScreen
      where AdolescentScreen.result ~ "Depression screening negative (finding)"
  ) is not null

define "Has Most Recent Adult Screening Negative":
  ( "Most Recent Adult Depression Screening" AdultScreen
      where AdultScreen.result ~ "Depression screening negative (finding)"
  ) is not null

define "Follow Up Intervention for Positive Adolescent Depression Screening":
  ["Medication, Order": "Adolescent Depression Medications"]
    union ["Intervention, Order": "Referral for Adolescent Depression"]
    union ["Intervention, Performed": "Follow Up for Adolescent Depression"]

define "Follow Up Intervention for Positive Adult Depression Screening":
  ["Medication, Order": "Adult Depression Medications"]
    union ["Intervention, Order": "Referral for Adult Depression"]
    union ["Intervention, Performed": "Follow Up for Adult Depression"]

define "Qualifying Encounter During Measurement Period":
  ( ["Encounter, Performed": "Encounter to Screen for Depression"]
    union ["Encounter, Performed": "Physical Therapy Evaluation"]
    union ["Encounter, Performed": "Telephone Visits"] ) QualifyingEncounter
    where QualifyingEncounter.relevantPeriod during "Measurement Period"

define "Denominator Exclusions":
  exists "History of Bipolar Diagnosis Before Qualifying Encounter"

define "Has Adolescent Depression Screening":
  exists ( ["Assessment, Performed": "Adolescent depression screening assessment"] AdolescentScreening
      with "Qualifying Encounter During Measurement Period" QualifyingEncounter
        such that Global."NormalizeInterval" ( AdolescentScreening.relevantDatetime, AdolescentScreening.relevantPeriod ) 14 days or less on or before day of start of QualifyingEncounter.relevantPeriod
          and AdolescentScreening.result is not null
  )

define "Has Adult Depression Screening":
  exists ( ["Assessment, Performed": "Adult depression screening assessment"] AdultScreening
      with "Qualifying Encounter During Measurement Period" QualifyingEncounter
        such that Global."NormalizeInterval" ( AdultScreening.relevantDatetime, AdultScreening.relevantPeriod ) 14 days or less on or before day of start of QualifyingEncounter.relevantPeriod
          and AdultScreening.result is not null
  )

define "Most Recent Adolescent Depression Screening":
  Last(["Assessment, Performed": "Adolescent depression screening assessment"] AdolescentDepressionScreening
      with "Qualifying Encounter During Measurement Period" QualifyingEncounter
        such that Global."NormalizeInterval"(AdolescentDepressionScreening.relevantDatetime, AdolescentDepressionScreening.relevantPeriod)14 days or less on or before day of start of QualifyingEncounter.relevantPeriod
          and AdolescentDepressionScreening.result is not null
      sort by start of Global."NormalizeInterval"(relevantDatetime, relevantPeriod)
  )

define "Most Recent Adult Depression Screening":
  Last(["Assessment, Performed": "Adult depression screening assessment"] AdultDepressionScreening
      with "Qualifying Encounter During Measurement Period" QualifyingEncounter
        such that Global."NormalizeInterval"(AdultDepressionScreening.relevantDatetime, AdultDepressionScreening.relevantPeriod)14 days or less on or before day of start of QualifyingEncounter.relevantPeriod
          and AdultDepressionScreening.result is not null
      sort by start of Global."NormalizeInterval"(relevantDatetime, relevantPeriod)
  )

define "Numerator":
  ( "Patient Age 12 to 16 Years at Start of Measurement Period"
      and ( "Has Most Recent Adolescent Screening Negative"
          or exists "Most Recent Adolescent Depression Screening Positive and Follow Up Provided"
      )
  )
    or ( "Patient Age 17 Years at Start of Measurement Period"
        and ( "Has Most Recent Adolescent Screening Negative"
            or exists "Most Recent Adolescent Depression Screening Positive and Follow Up Provided"
            or "Has Most Recent Adult Screening Negative"
            or exists "Most Recent Adult Depression Screening Positive and Follow Up Provided"
        )
    )
    or ( "Patient Age 18 Years or Older at Start of Measurement Period"
        and ( "Has Most Recent Adult Screening Negative"
            or exists "Most Recent Adult Depression Screening Positive and Follow Up Provided"
        )
    )

define "Initial Population":
  "Patient Age 12 Years or Older at Start of Measurement Period"
    and exists ( "Qualifying Encounter During Measurement Period" )

define "Most Recent Adolescent Depression Screening Positive and Follow Up Provided":
  from
    "Most Recent Adolescent Depression Screening" LastAdolescentScreen,
    "Follow Up Intervention for Positive Adolescent Depression Screening" FollowUpPositiveAdolescentScreen,
    "Qualifying Encounter During Measurement Period" QualifyingEncounter
    where Global."NormalizeInterval" ( LastAdolescentScreen.relevantDatetime, LastAdolescentScreen.relevantPeriod ) 14 days or less on or before day of start of QualifyingEncounter.relevantPeriod
      and LastAdolescentScreen.result ~ "Depression screening positive (finding)"
      and ( start of Global."NormalizeInterval" ( FollowUpPositiveAdolescentScreen.relevantDatetime, FollowUpPositiveAdolescentScreen.relevantPeriod ) during QualifyingEncounter.relevantPeriod
          or FollowUpPositiveAdolescentScreen.authorDatetime 2 days or less on or after day of 
          end of QualifyingEncounter.relevantPeriod
      )
      and Coalesce(start of Global."NormalizeInterval"(FollowUpPositiveAdolescentScreen.relevantDatetime, FollowUpPositiveAdolescentScreen.relevantPeriod), FollowUpPositiveAdolescentScreen.authorDatetime)during "Measurement Period"

define "Most Recent Adult Depression Screening Positive and Follow Up Provided":
  from
    "Most Recent Adult Depression Screening" LastAdultScreen,
    "Follow Up Intervention for Positive Adult Depression Screening" FollowUpPositiveAdultScreen,
    "Qualifying Encounter During Measurement Period" QualifyingEncounter
    where Global."NormalizeInterval" ( LastAdultScreen.relevantDatetime, LastAdultScreen.relevantPeriod ) 14 days or less on or before day of start of QualifyingEncounter.relevantPeriod
      and LastAdultScreen.result ~ "Depression screening positive (finding)"
      and ( start of Global."NormalizeInterval" ( FollowUpPositiveAdultScreen.relevantDatetime, FollowUpPositiveAdultScreen.relevantPeriod ) during QualifyingEncounter.relevantPeriod
          or FollowUpPositiveAdultScreen.authorDatetime 2 days or less on or after day of 
          end of QualifyingEncounter.relevantPeriod
      )
      and Coalesce(start of Global."NormalizeInterval"(FollowUpPositiveAdultScreen.relevantDatetime, FollowUpPositiveAdultScreen.relevantPeriod), FollowUpPositiveAdultScreen.authorDatetime)during "Measurement Period"