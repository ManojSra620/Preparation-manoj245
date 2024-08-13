*** Settings ***
Documentation  Login Functionality
Library  ../PageObject/Encodedata.py
Library  SeleniumLibrary
Resource  ../Resources/Login.robot
Library  DataDriver  ../TestData/Logindetails.xlsx  sheet_name=Login
Test Template  Login with valid credentials
Suite Setup   Open the browser    ${url}   ${browser}
Suite Teardown  Close the Browser

*** Variables ***
${url}  https://snapmoneytest.micnxt.com/jw/web/login
${browser}  chrome

*** Test Cases ***
Login test with excel  ${decode_value_u}  ${decode_value_p}
  [Documentation]  This case verify login functionality by datadriven
  [Tags]  robot:skip
  #[Tags]  robot:stop-on-failure
*** Keywords ***
Login with valid credentials
  Set Log Level    NONE
  [Arguments]  ${uname}  ${pwd}

  ${decode_value_u}   Dec    ${uname}
  Log To Console   ${decode_value_u}

  ${decode_value_p}   Dec   ${pwd}
  Log To Console    ${decode_value_p}
  Set Log Level    TRACE
  Capture Page Screenshot
  Set Log Level    NONE
  Enter Username  ${decode_value_u}
  Enter Password    ${decode_value_p}
  Click Sign_in button
  Set Log Level    TRACE
  Capture Page Screenshot
  Set Log Level    NONE
  Home page verification
  Click logout drop_down
  Click logout button
  #Set Log Level    INFO
  #Attach screenshot to report   #${OUTPUT_DIR}${/}screenshot.png


