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
import java.util.Date as Date
import java.util.Calendar as Calendar
import java.time.LocalDateTime as LocalDateTime

Date fecha = new Date()

Number Dia = fecha.getDate()

Number Mes = fecha.getMonth() + 1

Number MesN = fecha.getMonth() + 1

Number Año = fecha.getYear() + 1900

Number AñoN = fecha.getYear() + 1900

Number DiaF = Dia + 10

Number MesF = Mes + 1

Number AñoF = Año + 1

if (DiaF > 30) {
    DiaF = (DiaF - Dia)

    Mes = MesF
} else {
    DiaF

    Mes
}

if (MesF > 12) {
    año = AñoF

    MesF = 1
}

String FechaI = (((Dia + '/') + MesN) + '/') + AñoN

String FechaF = (((DiaF + '/') + Mes) + '/') + Año

/*-----------------------------------------------------------------------------------------------------*/
WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/input_Parmetros EntidadInstructor_form_templatej_idt24_input'), 
    'Parametros Entidad/Instructor')

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/li_Parametros EntidadInstructor (bie)'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/a_Entidad'))

if(WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/td_123456789'), 1))
{
WebUI.click(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/td_123456789'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/a_Eliminar'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/a_Aceptar'))
}
WebUI.click(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/a_Nuevo'))

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/input_Identificacin_form_entidadtabidentificacionEntidad'), 
    '123456789')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/select_--Seleccione--ActivoNo Disponible'), 
    1)

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/textarea_Razn Social_form_entidadtabrazonsocial'), 
    'Prueba')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/input_Contacto_form_entidadtabcontacto'), 
    'ninguno')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/input_Direccin_form_entidadtabdireccion'), 
    'carrera 132 # 152 c-10')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/input_Barrio_form_entidadtabbarrio'), 
    'ninguno')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/input_Telfono_form_entidadtabtelefono'), 
    '319388299')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/input_Fecha de Ingreso_form_entidadtabfechaingreso_input'), 
    FechaI)

WebUI.sendKeys(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/input_Fecha de Ingreso_form_entidadtabfechaingreso_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/input_Fecha de Retiro_form_entidadtabfecharetiro_input'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/input_Fecha de Retiro_form_entidadtabfecharetiro_input'), 
    FechaF)

WebUI.sendKeys(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/input_Fecha de Retiro_form_entidadtabfecharetiro_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/textarea_Observacin_form_entidadtabobservacion'), 
    'ninguna')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/input_Motivo de Retiro_form_entidadtabmotivo'), 
    'ninguna')

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Nuevo _Instructor-Entidad/a_Guardar'))

