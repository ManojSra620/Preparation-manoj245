*** Settings ***
Library  SeleniumLibrary
Variables  ../PageObject/Login.py
Library     OperatingSystem
Library    Screenshot

*** Variables ***
${url}  https://snapmoneytest.micnxt.com/jw/web/login
${browser}  chrome
${OUTPUT_DIR}    C:\Users\Admin\PycharmProjects\SnapMoney\Temp

*** Keywords ***
 Open the browser

   Set log level  NONE
   [Arguments]  ${url}  ${browser}
   Open Browser  ${url}  ${browser}
      ...  options=add_argument("--disable-notifications")
   Maximize Browser Window
   Set selenium speed       2s
   #Set Selenium Implicit Wait    3s


 Enter Username
   [Arguments]  ${uname}
   Input Text    ${txt_username}    ${uname}

 Enter Password
   [Arguments]  ${pwd}
   Input Text    ${txt_password}   ${pwd}

 Click Sign_in button
   Click Element   ${btn_Signin}

 Home page verification
   Element Should Be Visible    ${Homepage_verification}

 Click logout drop_down
   Click Element    ${logout_dropdown}

 Click logout button
   click Element  ${click_logout}

 Close the Browser
   Close Browser

 Attach screenshot to report
   Capture Page Screenshot
   #${output_dir}    Get Library Instance    OperatingSystem
   #${screenshot_path}    Set Variable    ${OUTPUT_DIR}${/}screenshot.png
   #Copy File    ${TEMPDIR}${/}screenshot-1.png   ${screenshot_path}
  # [Arguments]  ${screenshot_path}
   #log  <img src="${screenshot_path}" width="800">
  # log  Screenshot saved at: ${TEMPDIR}${/}selenium-screenshot-1.png

