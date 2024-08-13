*** Settings ***
Library  SeleniumLibrary
Resource  ../Resources/Login.robot
Resource  ../Resources/Teamleadlogin.robot
Resource  ../Resources/Leadcreation.robot
Library  ../PageObject/Encodedata.py
Library  Screenshot
Library  DataDriver  ../TestData/Logindetails.xlsx  sheet_name=Teamlead
Suite Setup   Open the browser    ${url}    ${browser}
Suite Teardown   Close the Browser
Test Template  Lead validation

*** Test Cases ***
Lead verification which is assigned by SuperAdmin
    Log  test
    [Tags]  Smoke

*** Keywords ***
Lead validation
  Set Log Level   NONE
  [Arguments]  ${uname}  ${pwd}
  ${decode_uname}  Dec    ${uname}
  ${decode_pwd}  Dec    ${pwd}
  Enter Username  ${decode_uname}
  Enter Password    ${decode_pwd}
  Click Sign_in button
  Home page verification
  Click Loansbutton
  Switch Window  new
  Close Additional documents
  Click on Snapmoney dropdown
  Click LoanLeads
  Switch to Frame
  #Execute Javascript  window.scroll(0,400)
  Scroll Element Into View  ${App_numberlist}
  Get Lead list
  #Search application number
  Click logout drop_down
  Click logout button
