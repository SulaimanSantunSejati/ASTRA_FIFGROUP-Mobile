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

Mobile.comment('page keterangan tambahan')

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/keterangan tambahan'), 
    'mohon di acc', 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - Halaman Berikutnya (1)'), 
    0)

Mobile.comment('page ringkasan informasi produk')

Mobile.scrollToText('manfaat')

Mobile.getText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/4. MANFAAT'), 
    0)

Mobile.scrollToText('halaman berikutnya')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/CheckBox - Saya telah membaca dan memahami seluruh dokumen, syarat dan ketentuan yang berlaku'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/CheckBox - Saya telah membaca dan menyetujui penggunaan data pribadi yang termuat dalam Ringkasan Informasi Produk dan Layanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - Halaman Berikutnya (2)'), 
    0)

Mobile.comment('page upload dokumen')

Mobile.scrollToText('halaman berikutnya')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - Halaman Berikutnya (3)'), 
    0)

Mobile.comment('page view pdf')

Mobile.getText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - SURAT KUASA PEMBEBANAN JAMINAN FIDUSIA'), 
    0)

Mobile.getText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - FORMULIR PERMOHONAN PEMBIAYAAN'), 
    0)

Mobile.getText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - SURAT PERSETUJUAN SUAMI ISTRI'), 
    0)

Mobile.getText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - PERJANJIAN PEMBIAYAAN KONSUMEN'), 
    0)

Mobile.getText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - SURAT PERNYATAAN NPWP'), 
    0)

Mobile.getText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - SURAT PERNYATAAN BEDA TANDA TANGAN'), 
    0)

Mobile.getText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - SURAT KUASA (TENTANG PENERIMAAN KEMBALI KENDARAAN DAN ASURANSI KENDARAAN )'), 
    0)

Mobile.getText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - SURAT PERNYATAAN KONSUMEN'), 
    0)

Mobile.getText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - RINGKASAN INFORMASI PRODUK DAN LAYANAN'), 
    0)

Mobile.getText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - SURAT PERNYATAAN DAN PERSETUJUAN PENAGIHAN'), 
    0)

Mobile.scrollToText('halaman berikutnya')

Mobile.getText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - SURAT PERNYATAAN PERSETUJUAN KONSUMEN'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - Halaman Berikutnya (1)'), 
    0)

Mobile.comment('page konfirmasi persetujuan')

Mobile.scrollToText('halaman berikutnya')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/CheckBox - Ya, Debitur telah membaca dan memahami seluruh dokumen, syarat dan ketentuan yang berlaku'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - Halaman Selanjutnya'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/CheckBox - Ya, Debitur menyetujui'), 
    0)

Mobile.scrollToText('validasi gambar')

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - Validasi Gambar'), 
    0)

Mobile.setText(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/input password to submit'), 
    '12345Aa', 0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - Submit'), 
    0)

Mobile.tap(findTestObject('Object Repository/AstraFifgroup/PAGE DATA PEMBIAYAAN DAN KETERANGAN TAMBAHAN/Button - OK'), 
    0)

Mobile.closeApplication()

