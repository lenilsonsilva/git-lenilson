@CheckLogout
Feature: Check Logout
Is want maintain the quality of the functionality the button checklogout

Scenario: Login the app

	Given I am on the Easy Taxi Driver App and altered debug for Homolog
	Then I checked itens and texts login screen
	When I enter text "123456" into "login"
		And I selected check box "checkLogout"
		And I press button "btLogin"
	Then I checked itens and texts in main screen
		And I wait for 10 seconds
	When I acess menu and get out
	Then I wait for 10 seconds
	When I press home button
	Then I wait for 10 seconds
	When I open the Easy Taxi Driver App
	Then I checked itens and texts in main screen
	When I press button "touch_area_menu"
	Then I checked itens and texts in main screen

Scenario: Perform login with the disconnected network

	Given I am on the Easy Taxi Driver App
	Then I checked itens and texts in main screen
	When I acess menu and checked itens and text
		And I press home button
		And I disconnected wifi
	Then I checked itens and texts login screen
	When I connected wifi

Scenario: Perform login the app and perform navigation with the browser.

	Given I am on the Easy Taxi Driver App
	Then I checked itens and texts in main screen
	When I acess menu and checked itens and text
		And I press home button
		And I open browser
		And I open the Easy Taxi Driver App
	Then I checked itens and texts in main screen

Scenario: Perform login the app and perform navigation with the browser.
	Given I am on the Easy Taxi Driver App
	Then I checked itens and texts in main screen
		And I wait for 10 seconds
	When I open WhatsAPP
		And I open browser
	When I open the Easy Taxi Driver App
	Then I checked itens and texts in main screen

Scenario: Acess the app with user logged and accessing WhatsApp and many sites in browser per 10 times.
	Given I am on the Easy Taxi Driver App
	Then I checked itens and texts in main screen
	When I acess app and others app in 10 times

Scenario: Acess the app with user logged and accessing many sites and return for app.
	Given I am on the Easy Taxi Driver App
	Then I checked itens and texts in main screen
	When I acess menu and checked itens and text
		And I press home button
	When I open browser with link "http://www.easytaxi.com/br/| https://www.youtube.com/| http://www.facebook.com/| https://www.youtube.com/watch?v=M7D7ynntNbg&list=PL4PvAOXB_l2non9NiuTRy4dXwFKEvUKWv"
		And I open the Easy Taxi Driver App in login screen
	Then I checked itens and texts in main screen
	When I acess menu and checked itens and text
	Then I wait for 10 seconds

Scenario: Acess the app with user logged and put the device on stand by mode per 60 seconds and return the app again.
	Given I am on the Easy Taxi Driver App
	Then I checked itens and texts in main screen
	When I acess menu and checked itens and text
		And I put the device on stand by mode
	Then I wait for 60 seconds
	When I put the device on active
	Then I checked itens and texts in main screen