
require 'capybara'
require 'capybara/cucumber'
require "rubygems"
require "selenium-webdriver"
require 'site_prism'

Capybara.configure do |config|
    config.default_driver = :selenium_chrome
    config.default_max_wait_time = 7
    config.app_host = 'https://mark7-sandbox.herokuapp.com'
end