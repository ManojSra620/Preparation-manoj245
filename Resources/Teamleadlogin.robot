*** Settings ***
Library  SeleniumLibrary
Library  OperatingSystem
Library    Screenshot
Variables  ../PageObject/Leadcreation.py
Resource  ../Resources/Login.robot
Resource  ../Resources/Leadcreation.robot


*** Keywords ***
 Close Additional documents
    Click Element    ${Additional_documents}
 Search application number
    Input Text   ${Search_bar}   ${App_n}
    # Click Button    ${Search_button}
 Get Lead list
   #@{values}   Get List Items   ${application_list}  values=True
   #Log To Console    @{values}[2]
   ${values_count}  Get Element Count  ${App_numberlist}
    Log To Console    ${values_count}
    
    @{lists}   Get WebElements   ${App_numberlist}

     #${list_value}  Get Text   ${lists}[0]
     #Log To Console    ${list_value}

      #@{list_value}  Create List

      FOR    ${element}    IN    @{lists}
             ${element_text}   Get Text    ${element}

            IF    '${element_text}' == '${App_n}'
                   Log To Console    ${element_text}
                   Log To Console    ${App_n}
                   Log To Console    ****Test passed****
                   Set Log Level    INFO
                   Capture Page Screenshot

                 #  ${output_dir}    Get Library Instance    OperatingSystem
                  # ${screenshot_path}    Set Variable    ${OUTPUT_DIR}${/}screenshot.jpg
                  # Copy File    ${TEMPDIR}${/}selenium-screenshot-1.jpg   ${screenshot_path}
                  # log  <img src="${screenshot_path}" width="800">



            END

      END
      Set Log Level    NONE
      Close Window
      Switch Window  Main





          #Log To Console   ${element_text}
          #${values}=  Set Variable  ${element_text}

          #Should Be Equal    ${element_text}   ${App_n}
          #Log To Console   *****Test case passed*****


          #${result}=  Set Variable If  ${App_n} in ${element_text}  ${True}  ${False}

          #IF    $element_text == ${App_n}
              #Log To Console    ********* Test pass ***********
          #ELSE
              #Log To Console    ********* Test fail ***********
          #END



