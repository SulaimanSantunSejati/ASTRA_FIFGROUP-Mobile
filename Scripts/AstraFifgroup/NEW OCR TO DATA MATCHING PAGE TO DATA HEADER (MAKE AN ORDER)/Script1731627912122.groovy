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
}
catch (Exception startApp) {
    Mobile.startExistingApplication('com.salesforce', FailureHandling.STOP_ON_FAILURE)

    driver = MobileDriverFactory.getDriver()
} // If driver initialization fails, start the application

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/Button - Halaman Berikutnya (page ocr)'), 
    0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/NIK - KOLOM'), 0)

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/NIK - KOLOM'), 
    '1234567890123456', 0)

Mobile.hideKeyboard()


Mobile.tap(findTestObject('Object Repository/AstraFifgroup/alternative object/input nama sesuai ktp'), 0)
Mobile.setText(findTestObject('Object Repository/AstraFifgroup/alternative object/input nama sesuai ktp'), 
  'BUDI SANTOSO', 0)
//Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/NAMA LENGKAP (SESUAI KTP) - KOLOM'), 0)

//Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/NAMA LENGKAP (SESUAI KTP) - KOLOM'), 
//    'BUDI SANTOSO', 0)

Mobile.hideKeyboard()

//Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/TEMPAT LAHIR - KOLOM'), 
//    0)
//
//Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/TEMPAT LAHIR - KOLOM'), 
//    'JAKARTA', 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/alternative object/input tempat lahir'),
	0)

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/alternative object/input tempat lahir'),
	'JAKARTA', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/KALENDER - BUTTON'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SET MONTH'), 0)
Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SET MONTH'), 0)

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SET MONTH'), 
    'JAN', 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SET DATE'), 0)
Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SET DATE'), 0)

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SET DATE (1)'), 
    '01', 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SET YEAR'), 0)
Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SET YEAR'), 0)

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SET YEAR (1)'), 
    '1990', 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/RadioButton - Laki-laki (CHOOSE GENDER)'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/NAMA GADIS IBU KANDUNG - KOLOM'), 
    0)

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/NAMA GADIS IBU KANDUNG - KOLOM'), 
    'RAHAYU', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/ALAMAT - KOLOM'), 
    'JALAN MERDEKA', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SELECT AGAMA - KOLOM'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/CHOOSE BUTTON - ISLAM'), 
    0)

Mobile.scrollToText('PEKERJAAN')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/RadioButton - Belum Kawin'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SEARCH PEKERJAAN - BUTTON'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/CHOOSE PEKERJAAN - WIRASWASTA'), 
    0)

Mobile.scrollToText('HALAMAN BERIKUTNYA')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/Button - Next FGC'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/Button - Check Order'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/Button - OK (NOTIF)'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/Button - Halaman Berikutnya'), 
    0)

Mobile.comment('PAGE DATA HEADER')

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/NAMA LENGKAP (TANPA SINGKATAN) - KOLOM'), 
    'BUDI SANTOSO', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SEARCH PROVINSI - BUTTON'), 
    0)

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/PROVINSI KOLOM - INPUT KOLOM'), 
    'DKI JAKARTA', 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SEARCH RESULT PROVINSI - Button'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/CHOOSE - provinsi  PROV DKI JAKARTA'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SEARCH KOTA - BUTTON'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/CHOOSE - kota  KOTA JAKARTA PUSAT'), 
    0)

Mobile.scrollToText('CHECK OFFICE')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SEARCH KECAMATAN - BUTTON'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/CHOOSE - kecamatan  KEC KEMAYORAN'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SEARCH KELURAHAN - BUTTON'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/CHOOSE - kelurahan  KEL KEMAYORAN'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SEARCH ZIP CODE - BUTTON'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/CHOOSE - 10620'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SEARCH SUBZIB - BUTTON'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/CHOOSE - 10620'), 
    0)

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/INPUT RT - KOLOM'), 
    '001', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/INPUT RW - KOLOM'), 
    '002', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/RadioButton - Ya'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/Button - Check Office'), 
    0)

Mobile.scrollToText('HALAMAN BERIKUTNYA')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/Button - Halaman Berikutnya (1)'), 
    0)

Mobile.comment('PAGE DATA PRIBADI')

