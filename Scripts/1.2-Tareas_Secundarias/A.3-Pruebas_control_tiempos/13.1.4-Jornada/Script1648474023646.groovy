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

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Jornada/input_Empresa 1_form_templatej_idt24_input'), 'Listado persona')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Jornada/li_Listado Persona (get)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Jornada/td_1010220596'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Jornada/a_Jornada'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Jornada/a_Liquidar0'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Jornada/select_Seleccionar24 de Diciembre del 2018 - 28 de Diciembre del 201824 de Octubre del 2018'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Jornada/a_Liquidar'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Jornada/p_Terminacion Normal'), 1)) {
    WebUI.closeBrowser()
}

