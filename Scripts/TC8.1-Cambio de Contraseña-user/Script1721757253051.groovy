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

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login_input-field_1'), GlobalVariable.vPasswordUser1)

WebUI.click(findTestObject('Object Repository/Page_React App/button_Acceder'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_React App/h2_Configuracin de tu Perfil'))

WebUI.click(findTestObject('Object Repository/Page_React App/button_Gestin de Cuenta'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Correo Electrnico_email'), GlobalVariable.vUser)

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Contrasea Actual_contrasena'), GlobalVariable.vPasswordUser1)

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Nueva Contrasea_nuevaContrasena'), GlobalVariable.vPasswordUser)

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Confirmar Nueva Contrasea_confirmarCo_b52273'), GlobalVariable.vPasswordUser)

WebUI.click(findTestObject('Object Repository/Page_React App/button_Guardar Cambios'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_React App/div_Contrasea cambiada con xito'))

WebUI.click(findTestObject('Object Repository/Page_React App/img_Soporte_LogOutIcon'))

WebUI.click(findTestObject('Object Repository/Page_React App/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login_input-field'), GlobalVariable.vUser)

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login_input-field_1'), GlobalVariable.vPasswordUser)

WebUI.click(findTestObject('Object Repository/Page_React App/button_Acceder'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_React App/h2_Configuracin de tu Perfil'))

WebUI.closeBrowser()

