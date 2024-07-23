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

WebUI.navigateToUrl(GlobalVariable.vURL)

WebUI.click(findTestObject('Object Repository/Page_React App/button_Registrarse'))

WebUI.setText(findTestObject('Page_React App/input_Login_email'), GlobalVariable.vUser)

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login_contact'), '4252211')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login_institution'), 'Don.Ar')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login_cuit'), '27451246262')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login_address'), '9 de Julio 165')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login_description'), 'a')

WebUI.click(findTestObject('Object Repository/Page_React App/button_Registrarme'))

WebUI.verifyElementPresent(findTestObject('Page_Success Thank you for using Web3Forms/h3_Form submitted successfully'), 
    0)

WebUI.closeBrowser()

