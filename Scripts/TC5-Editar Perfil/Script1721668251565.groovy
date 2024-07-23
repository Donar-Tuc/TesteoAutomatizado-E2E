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

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login_input-field'), GlobalVariable.vUser)

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login_input-field_1'), GlobalVariable.vPasswordUser)

WebUI.click(findTestObject('Object Repository/Page_React App/button_Acceder'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_React App/h2_Configuracin de tu Perfil'), 0)

WebUI.click(findTestObject('Object Repository/Page_React App/button_Editar Perfil'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Nombre de la Organizacin_titulo'), 'DON.Ar')

WebUI.click(findTestObject('Object Repository/Page_React App/input_Asistencia y voluntariados_Vestimenta'))

WebUI.click(findTestObject('Object Repository/Page_React App/button_Guardar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_React App/div_Perfil actualizado con xito'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_React App/h3_DON.Ar'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_React App/li_Donaciones monetarias'), 0)

WebUI.closeBrowser()

