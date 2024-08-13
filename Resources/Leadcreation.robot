*** Settings ***
Library  SeleniumLibrary
Variables  ../PageObject/Leadcreation.py
Resource  ../Resources/Login.robot



*** Keywords ***


 Click Loansbutton
      Click Element    ${btn_Loans}

 Verify Dashboard
      Element Should Be Visible    ${DashboardVerification}

 Close Dashboard
   click Element  ${Dashboard_close}

 Click on Snapmoney dropdown
   Click Element    ${Snapmoney_dropdown}

 Click LoanLeads
   Click Element    ${loansleads_btn}

 Switch to Frame
   Select Frame    ${frame_selection}

 Scroll down leadpage
   Scroll Element Into View    ${scroll_down}

#Applicant form page
 Click new to create lead
   Click Button    ${newleadcreation}

 Note Application number
   Double Click Element    ${App_number}

 Select Salutation
   Select From List By Value    ${Salutation_selection}  Mr

 Enter LeadName
   [Arguments]  ${Lname}
   Input Text    ${customername}    ${Lname}

 Select Gender
   Select From List By Value    ${gender}  M

 Enter Lead DOB
   [Arguments]  ${DOB}
   input text  ${txt_dob}  ${DOB}

 Enter lead email id
   [Arguments]  ${email}
   input text  ${txt_email}  ${email}

 Select whatsapp radio button
   Click Element    ${check_box_Different_whatsappnum}

 Enter whatsup number
   [Arguments]  ${whatsapp_number}
   Input Text    ${whats_app}    ${whatsapp_number}

 Enter lead phonenumber
   [Arguments]  ${Lead_phonenumber}
   input text  ${txt_phone_number}  ${Lead_phonenumber}

 Select loan type for lead
   Select From List By Value    ${dropdown_loan_type}  Car Loan

 Select lead salary option
   Select Radio Button    ${salarly_radio_btn}  yes

 Select lead source
   Select from list by value  ${lead_source}  Agent

 Select lead source agent name
   Select From List By Value    ${lead_source_name}  SS41

 Enter the lead working company name
   [Arguments]  ${companyname}
   input text  ${txt_companyname}  ${companyname}

 Enter the lead working experiance
   [Arguments]  ${experiance}
   Input Text  ${txt_experiance}  ${experiance}

 Enter Lead take home
   [Arguments]  ${takehome}
   Input Text    ${txt_takehome}    ${takehome}

 Enter the required loan amount for the lead
   [Arguments]  ${required_loanamount}
   Input Text    ${txt_required_loanamount}    ${required_loanamount}

 Select the loan tenure details
   Select From List By Value    ${dropdown_loantenure}  36 Months

 Enter pin code
   [Arguments]  ${pincode}
   Input Text    ${txt_pincode}   ${pincode}

 Enter the lead address details
   [Arguments]  ${location}
   Input Text    ${txt_location}    ${location}


 #Existing loans(applicant details)
 Select existing loans for lead
   Click Element   ${radiobutton_ExistingLoans}

 Click on addrow in existing loans for lead
   Click Button    ${btn_addrow_ExistingLoans}

 Select bank name for existing loans of lead
   Select From List By Value    ${dropdown_bankname_ExistingLoans}  Canara Bank

 Select existing loan type for the lead
   Select From List By Value    ${dropdown_loantype_Existingloans}  Gold loan

 Enter the loan amount for the existing loan
   [Arguments]  ${loanamount_ExistingLoans}
   Input Text    ${txt_loanamount_ExistingLoans}   ${loanamount_ExistingLoans}

 Enter the outstanding amount for the existing loan
   [Arguments]  ${outstanding_ExistingLoans}
   Input Text    ${txt_outstanding_ExistingLoans}   ${outstanding_ExistingLoans}

 Enter monthly emi for the existing loan
   [Arguments]  ${Emi_ExistingLoans}
   Input Text   ${txt_Emi_ExistingLoans}    ${Emi_ExistingLoans}

 Enter the loan approved date
   [Arguments]  ${startdate_ExistingLoans}
   Input Text    ${txt_startdate_ExistingLoans}   ${startdate_ExistingLoans}

 Click on save button
   Click Button    ${btn_save_ExistingLoans}

 #Credit card Oustanding(applicant details)

 Select credit card outstanding details of the lead
   Click Element    ${radiobutton_creditoustanding}

 Select creditcard outstanding bank name
   Select From List By Value    ${dropdown_bankname_creditoustanding}  Canara Bank

 Enter the creditcard limit
   [Arguments]  ${out_creditlimit}
   Input Text   ${txt_creditlimit}  ${out_creditlimit}

 Enter the creditcard outstanding
   [Arguments]  ${creditoutstanding}
   Input Text    ${txt_creditoutstanding}   ${creditoutstanding}

 Enter observations
   [Arguments]  ${observations_creditoustanding}
   Input Text    ${txt_observations_creditoustanding}   ${observations_creditoustanding}

 #image upload
 upload car image
   Choose File    ${car_model}    E:/Images/banner.png
   Click Button    ${First_upload}
   Sleep    2seconds
   Handle Alert  accept

 Upload address proof
   Choose File    ${address_proof}    E:/Images/banner.png
   Click Button    ${Second_upload}
   Sleep    2seconds
   Handle Alert  accept

 Upload form 16
   Choose File    ${form_16}    E:/Images/APN328_3 months pay slips_.docx
   Click Button    ${Third_upload}
   Sleep    2seconds
   Handle Alert  accept

 Upload bank statement
   Choose File    ${bank_statements}    E:/Images/banner.png
   Click Button    ${Fourth_upload}
   Sleep    2seconds
   Handle Alert  accept

 Upload photo
   Choose File    ${photo}    E:/Images/Pic.jpg
   Click Button    ${Fifth_upload}
   Sleep    2seconds
   Handle Alert  accept

 Upload pay slips
   Choose File    ${pay_slips}    E:/Images/APN328_3 months pay slips_.docx
   Click Button    ${Sixth_upload}
   Sleep    2seconds
   Handle Alert  accept

 Upload pan card
   Choose File    ${PAN_Card}    E:/Images/report (1).pdf
   Click Button    ${Seventh_upload}
   Sleep    2seconds
   Handle Alert  accept

 Upload aadhar card
   Choose File    ${Aadhar_Card}    E:/Images/png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png
   Click Button    ${Eight_upload}
   Sleep    2seconds
   Handle Alert  accept

 Upload cibil score
   Choose File    ${cibil_score}    E:/Images/APN328_3 months pay slips_.docx
   Click Button    ${Nineth_upload}
   Sleep    2seconds
   Handle Alert  accept

 #Co-Applicant details
 Select Co-Applicant details
   Click Element    ${radio_co_Applicant}

 Enter Co-Applicant name
   [Arguments]  ${Co_Applicant_Name}
   Input Text    ${txt_Co_Applicant_Name}   ${Co_Applicant_Name}

 Enter Co-Applicant phone number
   [Arguments]  ${Co_Applicant_Phonenumber}
   Input Text    ${txt_Co_Applicant_Phonenumber}    ${Co_Applicant_Phonenumber}

 Enter Co-Applicant gross
   [Arguments]  ${Co_Applicant_Gross}
   Input Text    ${txt_Co_Applicant_Gross}    ${Co_Applicant_Gross}

 Enter Co-Applicant Takehome
   [Arguments]  ${Co_Applicant_Takehome}
   Input Text    ${txt_Co_Applicant_Takehome}    ${Co_Applicant_Takehome}

 Enter Co-Applicant location
   [Arguments]  ${Co_Applicant_Location}
   Input Text    ${txt_Co_Applicant_Location}    ${Co_Applicant_Location}

 Enter Co-Applicant pincode
   [Arguments]  ${Co_Applicant_Pincode}
   Input Text    ${txt_Co_Applicant_Pincode}    ${Co_Applicant_Pincode}

 #Credit card oustanding
 Select Co_Applicant Creditcard outstanding
   Click Element    ${radiobutton_credit_co}

 Enter Co-Applicant creditcard limit
   [Arguments]  ${Co_Applicant_Creditlimit}
   Input Text    ${txt_Co_Applicant_Creditlimit}    ${Co_Applicant_Creditlimit}

 Enter Co-Applicant creditcard outstanding
   [Arguments]  ${Co_Applicant_Credit_outstanding}
   Input Text    ${txt_Co_Applicant_Credit_outstanding}   ${Co_Applicant_Credit_outstanding}

 Enter Remarks
   [Arguments]  ${remarks}
   Input Text    ${txt_remarks}   ${remarks}

 Enter Agent Name
   [Arguments]  ${Agent_name}
   Input Text    ${txt_Agent_name}   ${Agent_name}

 Enter Agent phone Number
   [Arguments]  ${Agent_Phonenumber}
   Input Text    ${txt_Agent_Phonenumber}    ${Agent_Phonenumber}

 Enter Disposition Status
   [Arguments]  ${dispositionstatus}
   Input Text    ${txt_dispositionstatus}    ${dispositionstatus}

 Enter Disposition Note
   [Arguments]  ${dispositionnote}
   Input Text    ${txt_dispositionnote}    ${dispositionnote}

 #Assign-To
 Select Assign to name
   Select From List By Value    ${dropdown_AssignTo}  Banu

 Select Assign to status
   Select From List By Value    ${dropdown_status}  Documents Received
   
 Click save button
   Click Button    ${btn_overallSave}

 Capture application number
   Execute Javascript  window.scroll(0,150)
   Execute Javascript  window.scroll(150,0)
   ${App_number}  Get Value  ${Application_number}
   Log To Console    ${App_number}

 Copy Application number
   Double Click Element    ${App_number}
   Press Keys    ${App_number}    CTRL+c
   #Press Keys    ${customername}    CTRL+v
   #Clear Element Text   ${customername}

 Search the application number
    Press Keys  ${Search_bar}  CTRL+v
    Click Button    ${Search_button}
    Sleep    9s
    ${App_n}  Get Value    ${Search_bar}
    Set Global Variable    ${App_n}
    Log To Console    ${App_n}



   #Press Keys   ${number}    paste
   #Open Context Menu    ${App_number}
 #Validate the lead

   #Should Be Equal    ${text}    ${App}


   #IF   ${text} == ${text}
      # Log To Console    Lead created successfully  console="true"
  # ELSE
       #Log To Console    Lead not created successfully  console="true"
   #END



























