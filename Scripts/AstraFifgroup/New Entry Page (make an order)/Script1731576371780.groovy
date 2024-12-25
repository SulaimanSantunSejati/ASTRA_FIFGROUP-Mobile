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
} 
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

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/New Entry Page/Button - New Entry'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/New Entry Page/Coy Name - Button'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/New Entry Page/Choose - PT ASTRA MULTI FINANCE'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/New Entry Page/Customer type - Button'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/New Entry Page/Choose Customer Type - INDIVIDU'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/New Entry Page/LOB Button'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/New Entry Page/Choose Lob - NEW MOTOR CYCLE'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/New Entry Page/Platform Button'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/New Entry Page/Choose Button - KONVENSIONAL'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/New Entry Page/Button - Halaman Berikutnya'), 0)

