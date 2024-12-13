Feature: Login Functionality

Background: Login code
Given User navigates to FB page
When User enters username and password
When User clicks on Signin button

@smoke @sanity @e2e
Scenario Outline: Validate user able to login the application
Then User navigated to HomePage
Then user enters "<username>" and "<password>"
Then user validates "<a>" "<b>" "<c>" "<d>" "<e>" "<f>"

Examples:
|username|password|a|
|vishnu|vishnu123|fb|
|pradeep|pradeep123|google|
|vishnu1|vishnu123|fb1|
|pradeep1|pradeep123|google1|
|vishnu2|vishnu123|fb2|
|pradeep2|pradeep123|google2|
|vishnu3|vishnu123|fb3|
|pradeep3|pradeep123|google3|



