import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/input_ADMINISTRADOR DEL SISTEMA'), 
    'Generacion interfaz')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/input_ADMINISTRADOR DEL SISTEMA'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/span_INTERFAZ NOMINA INTERFAZ'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/span_INTERFAZ NOMINA INTERFAZ'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/div_-_ui-chkbox-box ui-widget'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/div_-_ui-chkbox-box ui-widget'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/a_Generar'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/a_Generar'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/input_Fecha Inicial _popupGeneracion'), 
    '01/01/2021')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/td_Rango Fechas'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/td_Rango Fechas'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/input_Fecha Final_popupGeneracion'), 
    '30/01/2021')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/td_Rango Fechas'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/td_Rango Fechas'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/input_Fecha Proceso_popupGeneracion'), 
    '01/01/2021')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/span_Generar (1)'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/span_Generar (1)'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/a_Si'))

WebUI.delay(7)

if ((findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/a_Continuar') == true) && (WebUI.click(
    findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/span_Interfaz')) == false)) {
    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/a_Continuar'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/span_Interfaz'))

    WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Generacion interfaz/span_Regresar_ui-button-text'))
} else {
    WebUI.closeBrowser()
}

WebUI.closeBrowser()

