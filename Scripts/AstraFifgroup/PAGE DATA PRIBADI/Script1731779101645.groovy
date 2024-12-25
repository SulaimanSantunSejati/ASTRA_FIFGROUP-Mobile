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

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/telprumah (kode area) - kolom'), '09876', 
    0)

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/no HP customer 1 - kolom'), '0895123456789', 
    0)

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/notelepon Rumah - kolom'), '081234567890', 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/Button - Cek Validasi WhatsApp'), 0)

Mobile.scrollToText('Occupation on id')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/Search occupation id - button'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/choose - jabatan  WIRASWASTA'), 0)

Mobile.scrollToText('Status Rumah')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/search Status rumah - button'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/choose -  RUMAH SENDIRI'), 0)

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/lama menetap (tahun)'), '1', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/lama menetap (bulan)'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/choose (0 bulan)'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/kendaraan yang dimiliki - Mobil (button)'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/search pendidikan terakhir - button'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/choose - MASTER'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/RadioButton pengguna unit - choose Sendiri'), 
    0)

Mobile.scrollToText('Halaman berikutnya')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/RadioButton memiliki npwp - choose Tidak'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/Button - Halaman Berikutnya'), 0)

