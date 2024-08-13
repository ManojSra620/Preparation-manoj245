*** Settings ***
Resource   ../Resources/Login.robot
Resource    ../Resources/Leadcreation.robot
Library  ../PageObject/Encodedata.py
Library  DataDriver  ../TestData/Logindetails.xlsx  sheet_name=Login
Suite Setup      Open the browser  ${url}  ${browser}
Suite Teardown   Close the Browser
Test Template    Leadcreation Test


*** Variables ***
${Lname}  Sree
${DOB}  09-11-2005
${email}  Praveen@gmail.com
${whatsapp_number}  8885885658
${Lead_phonenumber}  9908955081
${companyname}  MicroGrid
${experiance}  2years
${takehome}  60000
${required_loanamount}  600000
${pincode}  530017
${location}  SLR nagar Akkayapalem
${loanamount_ExistingLoans}  100000
${outstanding_ExistingLoans}  30000
${Emi_ExistingLoans}  5700
${startdate_ExistingLoans}  09-01-2023
${out_creditlimit}   100000
${creditoutstanding}  40000
${observations_creditoustanding}  No observations
${Co_Applicant_Name}  Srinu
${Co_Applicant_Phonenumber}  8885885658
${Co_Applicant_Gross}  8.5
${Co_Applicant_Takehome}  65000
${Co_Applicant_Location}  mvp colony visakhapatnam
${Co_Applicant_Pincode}  530017
${Co_Applicant_Creditlimit}  900000
${Co_Applicant_Credit_outstanding}  30000
${remarks}  No observations
${Agent_name}  Harish
${Agent_Phonenumber}  8885885657
${dispositionstatus}  Interested
${dispositionnote}  Car Loan

*** Test Cases ***
Leadcreation test   ${uname}   ${pwd}
   [Documentation]  This case verify leadcreation and assign to another persona
   [Tags]  Smoke


*** Keywords ***
Leadcreation Test
  Set Log Level   NONE
  [Arguments]  ${uname}  ${pwd}
  ${decode_value_u}   Dec    ${uname}
  ${decode_value_p}   Dec   ${pwd}
  Enter Username  ${decode_value_u}
  Enter Password    ${decode_value_p}
  Click Sign_in button
  Home page verification
  Click Loansbutton
  Switch Window  new
  Verify Dashboard
  Close Dashboard
  Click on Snapmoney dropdown
  Click LoanLeads
  Switch to Frame
  Scroll down leadpage
  Click new to create lead
  Copy Application number
  #Select Salutation
  Enter LeadName  ${Lname}
  #Enter Lead DOB  ${DOB}
  #Select Gender
  #Enter lead email id  ${email}
  #Select whatsapp radio button
  #Enter whatsup number  ${whatsapp_number}
  Enter lead phonenumber  ${Lead_phonenumber}
  Select loan type for lead
  Select lead salary option
  Select lead source
  #Select lead source agent name
  #Enter the lead working company name  ${companyname}
  #Enter the lead working experiance  ${experiance}
  Enter the required loan amount for the lead  ${required_loanamount}
  #Enter Lead take home  ${takehome}
  #Select the loan tenure details
  #Enter pin code  ${pincode}
  #Enter the lead address details  ${location}
  #Select existing loans for lead
  #Execute Javascript  window.scroll(0,500)
  #Click on addrow in existing loans for lead
  #Select bank name for existing loans of lead
  #Select existing loan type for the lead
  #Enter the loan amount for the existing loan  ${loanamount_ExistingLoans}
  #Enter the outstanding amount for the existing loan  ${outstanding_ExistingLoans}
  #Enter monthly emi for the existing loan  ${Emi_ExistingLoans}
  #Enter the loan approved date  ${startdate_ExistingLoans}
  #Click on save button
  #Handle Alert  accept
  #Select credit card outstanding details of the lead
  #Select creditcard outstanding bank name
  #Enter the creditcard limit        ${out_creditlimit}
  #Enter the creditcard outstanding  ${creditoutstanding}
  #Enter observations  ${observations_creditoustanding}
  #upload car image
  #Upload address proof
  #Upload form 16
  #Upload bank statement
  #Upload photo
  #Upload pay slips
  #Upload pan card
  #Upload aadhar card
  #Upload cibil score
  #Select Co-Applicant details
  #Enter Co-Applicant name  ${Co_Applicant_Name}
  #Enter Co-Applicant phone number  ${Co_Applicant_Phonenumber}
  #Enter Co-Applicant gross  ${Co_Applicant_Gross}
  #Enter Co-Applicant Takehome  ${Co_Applicant_Takehome}
  #Enter Co-Applicant location  ${Co_Applicant_Location}
  #Enter Co-Applicant pincode  ${Co_Applicant_Pincode}
  #Select Co_Applicant Creditcard outstanding
  #Enter Co-Applicant creditcard limit  ${Co_Applicant_Creditlimit}
  #Enter Co-Applicant creditcard outstanding  ${Co_Applicant_Credit_outstanding}
  #Enter Remarks  ${remarks}
  #Enter Agent Name  ${Agent_name}
  #Enter Agent phone Number  ${Agent_Phonenumber}
  #Enter Disposition Status  ${dispositionstatus}
  #Enter Disposition Note  ${dispositionnote}
  Select Assign to name
  Select Assign to status
  Click save button
  Handle Alert  accept
    TRY
        Search the application number
        Set Log Level    INFO
  Attach screenshot to report

    FINALLY
        Close Window
        Switch Window  Main
    END
    Set Log Level    NONE
  Click logout drop_down
  Click logout button
















