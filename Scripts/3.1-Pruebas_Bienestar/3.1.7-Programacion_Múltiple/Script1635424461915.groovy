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
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
Date today = new Date()
/*--------------------------------------------*/

Number Dia = ((today.format('dd')) as Integer)
Number Mes = ((today.format('MM')) as Integer)
Number MesN = ((today.format('MM')) as Integer)
Number Año = ((today.format('yyyy')) as Integer)
Number AñoN = ((today.format('yyyy')) as Integer)
/*-----------------------------------------------*/

Number sumaD = Dia + 10
Number sumaM = Mes + 1
Number sumaA = Año + 1

/*--------------------------*/

if (sumaD > 30) {
	sumaD = (sumaD - Dia)

	Mes = sumaM
} else {
	sumaD
	Mes
}
/*--------------------------*/

if (sumaM > 12) {
	Año = sumaA
	Mes = 1
}
/*---------------------------*/
Number Dia0 = Dia + 1
Number restaD0 = sumaD -1
/*----------------------------*/
if(Dia0 > 30) {
	Dia0 = Dia0 - Dia
	MesN = sumaM
}
	else {
		Dia0
		MesN
	}
/*----------------------------*/
	if(restaD0 < 1) {
		restaD0 = 1
		Mes = Mes - 1
	}
	else {
		restaD0;
		Mes;
	}
		
/*----------------------------*/	
String FechaI = (((Dia + '/') + MesN) + '/') + AñoN
String FechaF = (((sumaD + '/') + Mes) + '/') + Año
String FechaI0 = (((Dia0 + '/') + MesN) + '/') + AñoN
String FechaF0 = (((restaD0 + '/') + Mes) + '/') + Año
/*----------------------------------------------------*/




WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/td_Prueba-S'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Momento Eventos'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/td_prueba'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_MAR-MIE 0500-0600_popupMomentoEvento_formtablaMomentoEventoHorarioPopup0j_idt1582'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_MAR-MIE 0500-0600_popupMomentoEvento_formtablaMomentoEventoHorarioPopup0j_idt1582'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Aceptar_Eliminar'))
}

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Inscripcin Inicial_popupMomentoEvento_formpMEInscripcionInicia_input'), 
    FechaI)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Inscripcin Termina_popupMomentoEvento_formpMEInscripcionFinaliza_input'), 
    FechaF)

WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopupfechaInicialPop_input'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopupfechaInicialPop_input'), 
    FechaI)

WebUI.sendKeys(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopupfechaInicialPop_input'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopuppMEFechaTerminaPopup_input'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopuppMEFechaTerminaPopup_input'), 
    FechaF)

WebUI.sendKeys(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopuppMEFechaTerminaPopup_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopupj_idt1579'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopuppMEFechaTerminaPopup_input'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/label_MAR'), 0)

WebUI.check(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/label_MAR'))

WebUI.check(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/label_MIE'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/select_01'), 5)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/select_02'), 6)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_mas_Horario'))

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/td_LUN-MAR 0500-0600'), 2)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Aplicar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Icon_mas_principal'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Guardar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Regresar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/td_Prueba-S-SH'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Momento Eventos'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/td_prueba'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_MAR-MIE 0500-0600_popupMomentoEvento_formtablaMomentoEventoHorarioPopup0j_idt1582'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_MAR-MIE 0500-0600_popupMomentoEvento_formtablaMomentoEventoHorarioPopup0j_idt1582'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Aceptar_Eliminar'))
}

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Inscripcin Inicial_popupMomentoEvento_formpMEInscripcionInicia_input'), 
    FechaI)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Inscripcin Termina_popupMomentoEvento_formpMEInscripcionFinaliza_input'), 
    FechaF)

WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopupfechaInicialPop_input'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopupfechaInicialPop_input'), 
    FechaI0)

WebUI.sendKeys(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopupfechaInicialPop_input'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopuppMEFechaTerminaPopup_input'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopuppMEFechaTerminaPopup_input'), 
    FechaF0)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopupj_idt1579'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.sendKeys(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/input_Horario_popupMomentoEvento_formtablaMomentoEventoHorarioPopuppMEFechaTerminaPopup_input'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/label_MAR'), 0)

WebUI.check(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/label_MAR'))

WebUI.check(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/label_MIE'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/select_01'), 5)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/select_02'), 6)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_mas_Horario'))

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/td_LUN-MAR 0500-0600'), 2)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Aplicar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Icon_mas_principal'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Programacion_Múltiple/a_Guardar'))

WebUI.closeBrowser()

