Feature: Book Cart application demo

  scenario: validation of login page
  Given user navigates to bookcart home page
  And user clicks login button
  And user enter username "ortoni"
  And user enter password "pass1234"
  When user click login button
  Then user should login successfully

#  scenario: validation of login page with invalid userid and password
#  Given user navigates to bookcart home page
#  And user clicks login button
#  And user enter username "abcd"
#  And user enter password "1234"
#  When user click login button
#  Then user login should fail