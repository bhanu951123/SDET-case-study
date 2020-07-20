Feature: Upskill elearning Signup

Scenario: Register Account

Given User is on HomePage
When SignUp Button is available click on it
Then Enter all mandatory fields and click on Register button

| firstname | lastname | email 		      | username | password | confirmpassword | phone 	   |
| bha040	| pra040   | bha040@gmail.com | bha040	 | bha040   | bha040		  | 7324089877 |

And validate message Your personal settings have been registered on next page 

Then User clicks top right corner
When Dropdown is shown
Then validate the email which is entered
|send_email|
|bha040@gmail.com|
And Click on Compose on HomePage and Enter Message and click on send Message
|     sendto     |    subject    | message | description |
|bha018@gmail.com| 	 To Test	 | Hello Mr.bha..This is for testing| test mail |
Then Validate Message Sent Acknowledgement