library InitiationandEngagementofSubstanceUseDisorderTreatment version '12.0.000'

using QDM version '5.6'

include MATGlobalCommonFunctions version '7.0.000' called Global
include Hospice version '5.0.000' called Hospice

valueset "Detoxification Visit": 'urn:oid:2.16.840.1.113883.3.464.1003.101.12.1059'
valueset "Discharge Services Hospital Inpatient": 'urn:oid:2.16.840.1.113883.3.464.1003.101.12.1007'
valueset "Discharge Services Hospital Inpatient Same Day Discharge": 'urn:oid:2.16.840.1.113883.3.464.1003.101.12.1006'
valueset "Emergency Department Evaluation and Management Visit": 'urn:oid:2.16.840.1.113883.3.464.1003.101.12.1010'
valueset "Ethnicity": 'urn:oid:2.16.840.1.114222.4.11.837'
valueset "Initial Hospital Inpatient Visit": 'urn:oid:2.16.840.1.113883.3.464.1003.101.12.1004'
valueset "Initial Hospital Observation Care": 'urn:oid:2.16.840.1.113883.3.464.1003.101.12.1002'
valueset "Office Visit": 'urn:oid:2.16.840.1.113883.3.464.1003.101.12.1001'
valueset "ONC Administrative Sex": 'urn:oid:2.16.840.1.113762.1.4.1'
valueset "Online Assessments": 'urn:oid:2.16.840.1.113883.3.464.1003.101.12.1089'
valueset "Payer": 'urn:oid:2.16.840.1.114222.4.11.3591'
valueset "Psych Visit Psychotherapy": 'urn:oid:2.16.840.1.113883.3.526.3.1496'
valueset "Race": 'urn:oid:2.16.840.1.114222.4.11.836'
valueset "Substance Use Disorder": 'urn:oid:2.16.840.1.113883.3.464.1003.106.12.1001'
valueset "Substance Use Disorder Long Acting Medication": 'urn:oid:2.16.840.1.113883.3.464.1003.1149'
valueset "Substance Use Disorder Long Acting Medication Administration": 'urn:oid:2.16.840.1.113883.3.464.1003.1156'
valueset "Substance Use Disorder Short Acting Medication": 'urn:oid:2.16.840.1.113883.3.464.1003.1150'
valueset "Substance Use Disorder Short Acting Medication Administration": 'urn:oid:2.16.840.1.113883.3.464.1003.1157'
valueset "Substance Use Disorder Treatment": 'urn:oid:2.16.840.1.113883.3.464.1003.106.12.1005'
valueset "Telephone Visits": 'urn:oid:2.16.840.1.113883.3.464.1003.101.12.1080'

parameter "Measurement Period" Interval<DateTime>

context Patient

define "Initial Population":
  AgeInYearsAt(date from start of "Measurement Period")>= 13
    and "First SUD Episode During Measurement Period" is not null
    and not exists "History of SUD Diagnosis or Treatment"

define "First SUD Episode During Measurement Period":
  First(("Qualifying Encounters")ValidEncounters
      with ["Diagnosis": "Substance Use Disorder"] SUDDiagnosis
        such that ValidEncounters.relevantPeriod during "Measurement Period"
          and SUDDiagnosis.prevalencePeriod starts during ValidEncounters.relevantPeriod
          and SUDDiagnosis.prevalencePeriod starts 47 days or more before day of 
          end of "Measurement Period"
      sort by start of relevantPeriod
  )

define "Denominator":
  "Initial Population"

define "Denominator Exclusions":
  Hospice."Has Hospice Services"

define "Numerator 1":
  exists "Treatment Initiation With Non Medication Intervention Dates"
    or exists "Treatment Initiation With Medication Order Dates"

define "Psychosocial Visit":
  ["Intervention, Performed": "Substance Use Disorder Treatment"]
    union ["Intervention, Performed": "Psych Visit Psychotherapy"]
    union ( ( ["Encounter, Performed": "Telephone Visits"]
        union ["Encounter, Performed": "Online Assessments"] ) TelehealthEncounter
        where exists TelehealthEncounter.diagnoses Diagnosis
          where Diagnosis.code in "Substance Use Disorder"
    )

define "SDE Ethnicity":
  ["Patient Characteristic Ethnicity": "Ethnicity"]

define "SDE Payer":
  ["Patient Characteristic Payer": "Payer"]

define "SDE Race":
  ["Patient Characteristic Race": "Race"]

define "SDE Sex":
  ["Patient Characteristic Sex": "ONC Administrative Sex"]

define "Stratification 1":
  AgeInYearsAt(date from start of "Measurement Period")in Interval[13, 17]

define "Stratification 2":
  AgeInYearsAt(date from start of "Measurement Period")in Interval[18, 64]

define "Treatment Initiation With Medication Order Dates":
  ( ( ["Medication, Order": "Substance Use Disorder Short Acting Medication"]
      union ["Medication, Order": "Substance Use Disorder Long Acting Medication"] ) SUDMedication
      let treatmentDate: date from SUDMedication.authorDatetime
      with "First SUD Episode During Measurement Period" FirstSUDEpisode
        such that treatmentDate during Interval[date from start of FirstSUDEpisode.relevantPeriod, date from start of FirstSUDEpisode.relevantPeriod + 14 days )
      return all treatmentDate
  )
    union ( ( ["Procedure, Performed": "Substance Use Disorder Short Acting Medication Administration"]
        union ["Procedure, Performed": "Substance Use Disorder Long Acting Medication Administration"] ) SUDMedAdministration
        let treatmentDate: date from start of Global."NormalizeInterval" ( SUDMedAdministration.relevantDatetime, SUDMedAdministration.relevantPeriod )
        with "First SUD Episode During Measurement Period" FirstSUDEpisode
          such that treatmentDate during Interval[date from start of FirstSUDEpisode.relevantPeriod, date from start of FirstSUDEpisode.relevantPeriod + 14 days )
        return all treatmentDate
    )

define "Has Treatment Engagement With Long Acting Medication":
  exists ( ( ["Medication, Order": "Substance Use Disorder Long Acting Medication"] LongActingMedOrder
        with ( Min("Treatment Initiation With Non Medication Intervention Dates"
            union "Treatment Initiation With Medication Order Dates"
        )) InitiationTreatmentDate
          such that date from LongActingMedOrder.authorDatetime 34 days or less after InitiationTreatmentDate
    )
      union ( ["Procedure, Performed": "Substance Use Disorder Long Acting Medication Administration"] LongActingTreatment
          with ( Min("Treatment Initiation With Non Medication Intervention Dates"
              union "Treatment Initiation With Medication Order Dates"
          )) InitiationTreatmentDate
            such that date from start of Global."NormalizeInterval" ( LongActingTreatment.relevantDatetime, LongActingTreatment.relevantPeriod ) 34 days or less after InitiationTreatmentDate
      )
  )

define "History of SUD Diagnosis or Treatment":
  ( ( ["Intervention, Performed": "Substance Use Disorder Treatment"]
      union ["Intervention, Performed": "Psych Visit Psychotherapy"]
      union ["Procedure, Performed": "Substance Use Disorder Long Acting Medication Administration"]
      union ["Procedure, Performed": "Substance Use Disorder Short Acting Medication Administration"] ) Interventions
      with "First SUD Episode During Measurement Period" FirstSUDEpisode
        such that Global."NormalizeInterval" ( Interventions.relevantDatetime, Interventions.relevantPeriod ) starts 60 days or less before day of start of FirstSUDEpisode.relevantPeriod
  )
    union ( ( ( "Qualifying Encounters"
        except "Emergency Department or Detoxification Visit" ) QualifyingEncounter
        where ( exists QualifyingEncounter.diagnoses Diagnosis
            where Diagnosis.code in "Substance Use Disorder"
        ) ) EncounterWithDiagnosis
        with "First SUD Episode During Measurement Period" FirstSUDEpisode
          such that EncounterWithDiagnosis.relevantPeriod starts 60 days or less before day of start of FirstSUDEpisode.relevantPeriod
    )
    union ( ( ["Medication, Order": "Substance Use Disorder Long Acting Medication"]
        union ["Medication, Order": "Substance Use Disorder Short Acting Medication"] ) SUDMedication
        with "First SUD Episode During Measurement Period" FirstSUDEpisode
          such that SUDMedication.authorDatetime 60 days or less before day of start of FirstSUDEpisode.relevantPeriod
    )

define "Treatment Initiation With Non Medication Intervention Dates":
  "Psychosocial Visit" PsychosocialVisit
    let treatmentDate: date from start of Global."NormalizeInterval" ( PsychosocialVisit.relevantDatetime, PsychosocialVisit.relevantPeriod )
    with "First SUD Episode During Measurement Period" FirstSUDEpisode
      such that treatmentDate during Interval[date from start of FirstSUDEpisode.relevantPeriod, date from start of FirstSUDEpisode.relevantPeriod + 14 days )
        and PsychosocialVisit.id !~ FirstSUDEpisode.id
    return all treatmentDate

define "Stratification 3":
  AgeInYearsAt(date from start of "Measurement Period")>= 65

define "Has Two or More Treatment Engagements With Short Acting Medication or Non Medication Intervention":
  Count((("Psychosocial Visit"
        union ["Procedure, Performed": "Substance Use Disorder Short Acting Medication Administration"])ShortActingTreatment
        with(Min("Treatment Initiation With Non Medication Intervention Dates"
            union "Treatment Initiation With Medication Order Dates"
        ))InitiationTreatmentDate
          such that date from start of Global."NormalizeInterval"(ShortActingTreatment.relevantDatetime, ShortActingTreatment.relevantPeriod)34 days or less after InitiationTreatmentDate
        return all ShortActingTreatment
    )
      union(["Medication, Order": "Substance Use Disorder Short Acting Medication"] ShortActingMedOrder
          with(Min("Treatment Initiation With Non Medication Intervention Dates"
              union "Treatment Initiation With Medication Order Dates"
          ))InitiationTreatmentDate
            such that date from ShortActingMedOrder.authorDatetime 34 days or less after InitiationTreatmentDate
          return all ShortActingMedOrder
      )
  )>= 2

define "Numerator 2":
  "Has Treatment Engagement With Long Acting Medication"
    or "Has Two or More Treatment Engagements With Short Acting Medication or Non Medication Intervention"

define "Qualifying Encounters":
  ( ["Encounter, Performed": "Office Visit"]
      union ["Encounter, Performed": "Emergency Department Evaluation and Management Visit"]
      union ["Encounter, Performed": "Detoxification Visit"]
      union ["Encounter, Performed": "Initial Hospital Observation Care"]
      union ["Encounter, Performed": "Initial Hospital Inpatient Visit"]
      union ["Encounter, Performed": "Discharge Services Hospital Inpatient Same Day Discharge"]
      union ["Encounter, Performed": "Discharge Services Hospital Inpatient"]
      union ["Encounter, Performed": "Telephone Visits"]
      union ["Encounter, Performed": "Online Assessments"]
  )

define "Emergency Department or Detoxification Visit":
  ["Encounter, Performed": "Emergency Department Evaluation and Management Visit"]
    union ["Encounter, Performed": "Detoxification Visit"]