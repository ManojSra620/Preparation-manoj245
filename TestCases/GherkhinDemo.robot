*** Settings ***
Library  SeleniumLibrary
Library  OperatingSystem
Library  DataDriver  ../TestData/Logindetails.xlsx  sheet_name=Login
# Resource  ../TestCases/Logintest.robot
Resource  ../Resources/Login.robot


*** Variables ***
${url}  https://snapmoneytest.micnxt.com/jw/web/login
${browser}  Chrome


*** Test Cases ***
TC01: SnapMoney Application launch
  Given user opens the browser
  When user navigates to URL
  Then application will be launched
  When user login with valid credentials  ${uname}  ${pwd}



*** Keywords ***
 user opens the browser
    Set log level  None
   Open Browser  ${url}     ${browser}
   Maximize Browser Window

 user navigates to URL
   Go To    ${url}

 application will be launched
   Element Should Be Visible    //span[normalize-space()='SnapMoney']

 user login with valid credentials
   [Arguments]  ${uname}  ${pwd}
   Input Text    ${txt_username}    ${uname}
   Input Text    ${txt_password}    ${pwd}

 user click on login button
   Click Element    ${btn_Signin}

