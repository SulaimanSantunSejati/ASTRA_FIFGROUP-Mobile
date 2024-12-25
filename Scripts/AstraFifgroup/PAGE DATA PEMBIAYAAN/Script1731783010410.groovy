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

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SEARCH KECAMATAN - BUTTON'), 
    0)

Mobile.tap(findTestObject('Object Repository/CHOOSE - sub purpose  PEMBELIAN KENDARAAN UNTUK USAHA'), 0)

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA KEUANGAN/sumber pendanaan (input kolom)'), '15.000.000', 
    0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/UANG MUKA CUSTOMER - KOLOM (INPUT)'), '3.000.000', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/ANGSURAN - KOLOM (LINEAR)'), '9.000.000', 0)

Mobile.setText(findTestObject('Object Repository/ANGSURAN - KOLOM (INPUT)'), '900.000', 0)

Mobile.hideKeyboard()

Mobile.scrollToText('Credit Life Protection')

Mobile.setText(findTestObject('Object Repository/UANG MUKA CUSTOMER - KOLOM (INPUT)'), '30', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/credit life protection RadioButton - choose Tidak'), 0)

Mobile.tap(findTestObject('Object Repository/pembayaran uang muka RadioButton - choose Dealer'), 0)

Mobile.tap(findTestObject('Object Repository/pengiriman obyek pembiayaan ke alamat RadioButton - choose KTP'), 0)

Mobile.scrollToText('nama dealer')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/search Status rumah - button'), 0)

Mobile.tap(findTestObject('Object Repository/choose - deskripsi  FIF'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SEARCH ZIP CODE - BUTTON'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/CHOOSE - 10620'), 
    0)

Mobile.tap(findTestObject('Object Repository/nama pemohon di bpkb sama RadioButton - choose Ya'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PRIBADI/Search occupation id - button'), 0)

Mobile.tap(findTestObject('Object Repository/choose - barang  REVO NEW ABSOLUTE'), 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE OCR, PAGE DATA MATCHING AND DATA HEADER/SEARCH KOTA - BUTTON'), 
    0)

Mobile.tap(findTestObject('Object Repository/choose - warna  HITAM-SILVER'), 0)

Mobile.tap(findTestObject('Object Repository/stock RadioButton - choose Ready Stock'), 0)

Mobile.tap(findTestObject('Object Repository/interest type search - button'), 0)

Mobile.tap(findTestObject('Object Repository/choose -  MENURUN'), 0)

Mobile.scrollToText('periode type')

Mobile.setText(findTestObject('Object Repository/periode payment - kolom (linear)'), '30', 0)

Mobile.setText(findTestObject('Object Repository/periode payment - kolom (linear)'), '30', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/periode type - button'),
	0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/choose - Month'),
	0)

Mobile.scrollToText('AO ID')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/type of installment - button'),
	0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/choose - Effective Rate'),
	0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/marketing program search - button'),
	0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/choose - program  REGULER'),
	0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/search customer category - button'),
	0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/choose -  KARYAWAN FIF'),
	0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/flag potong gaji RadioButton - choose Tidak'),
	0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/holiday or sunday RadioButton - choose Ya'),
	0)

Mobile.scrollToText('halaman berikutnya')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/cs id search - button'),
	0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/choose -  SANTI SUKMAWATI'),
	0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - Halaman Berikutnya'),
	0)

