*** Settings ***
Library  SeleniumLibrary

*** Variables ***
${url}  https://google.com/
${browser}  chrome
${browser1}  Edger
${browser2}  Firefox

*** Test Cases ***
Demo test
  TC01_Chrome
  TC02_Edge
  TC03_Firefox

*** Keywords ***

TC01_Chrome
    [Tags]  robot:continue-on-failure
   Open Browser  ${url}  ${browser}
   Close Browser


TC02_Edge

  Open Browser  ${url}  ${browser1}
  #Close Browser


TC03_Firefox
    [Tags]  robot:continue-on-failure
  Open Browser  ${url}  ${browser2}
  Close Browser