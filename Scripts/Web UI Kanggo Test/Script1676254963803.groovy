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

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kanggo.id/')

WebUI.click(findTestObject('Object Repository/Page_Jasa Tukang Bangunan  Aplikasi Pertuka_280b22/a_Tentang Kami'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Jasa Perbaikan Pipa Bocor Mampet. Tuka_1b90a2/a_Jasa Pasang Plafon Gypsum'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Pasang Plafon Gypsum. Tukang Prof_86d02c/a_Jasa Pasang Keramik'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Pasang Keramik Tukang Berpengalam_76c779/a_Tukang Listrik Panggilan'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Tukang Listrik Panggilan, Perbaik_134a96/a_Pesan Sekarang'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Tukang Listrik Panggilan, Perbaik_134a96/a_Inspirasi  Solusi'))

WebUI.click(findTestObject('Object Repository/Page_Inspirasi  Solusi  Kanggo Apps - Tukan_3c8c41/a_Pusat Bantuan'))

WebUI.click(findTestObject('Object Repository/Page_Pusat Bantuan  Kanggo Apps - TukangReadyToGo/a_Gabung Mitra'))

WebUI.click(findTestObject('Object Repository/Page_Gabung Kanggo  Kanggo Apps - TukangReadyToGo/a_Tentang Kami'))

WebUI.click(findTestObject('Object Repository/Page_Tentang Kami  Kanggo Apps - TukangReadyToGo/div_Copyright 2022. All Rights Reserved_joi_fc6002'))

