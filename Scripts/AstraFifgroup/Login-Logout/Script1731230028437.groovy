import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory

// Initialize the Appium driver
AppiumDriver driver

try {
    // Get the driver instance
    driver = MobileDriverFactory.getDriver()
} catch (Exception startApp) {
    // If driver initialization fails, start the application
    Mobile.startExistingApplication('com.salesforce', FailureHandling.STOP_ON_FAILURE)
    driver = MobileDriverFactory.getDriver()
} // End of app initialization

// Perform actions on the app
//Mobile.tap(findTestObject('AstraFifgroup/Button - Test Connection'), 0)
//Mobile.tap(findTestObject('AstraFifgroup/connectionsuccessButton - OK(imei)'), 0)
//Mobile.tap(findTestObject('AstraFifgroup/Button - Save(imei)'), 0)

// Input username
//Mobile.tap(findTestObject('AstraFifgroup/tap_usernameForm'), 0)
//Mobile.setText(findTestObject('AstraFifgroup/tap_usernameForm'), '12169', 0)
//
//// Input password
//Mobile.tap(findTestObject('AstraFifgroup/tap_password_Form'), 0)
//Mobile.setText(findTestObject('AstraFifgroup/tap_password_Form'), '12345Aa', 0)
//
//// Hide keyboard
//Mobile.hideKeyboard()

// Tap the login button
Mobile.tap(findTestObject('Object Repository/AstraFifgroup/LoginButton'), 0)

// Add delay for 10 seconds
Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

// Scroll to the 'Log Out' text
Mobile.scrollToText('Log Out')

// Tap the logout button and confirm
Mobile.tap(findTestObject('Object Repository/AstraFifgroup/tapButton - Log Out'), 0)
Mobile.tap(findTestObject('Object Repository/AstraFifgroup/Button - Ya'), 0)

// Verify 'Remember me' text is displayed
Mobile.getText(findTestObject('Object Repository/AstraFifgroup/Remember me'), 0)

// Close the application
Mobile.closeApplication()
