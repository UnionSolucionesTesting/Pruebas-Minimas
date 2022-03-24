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

WebUI.setText(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/input_Empresa 1_form_templatej_idt24_input'), 
    'Buscador Hoja Vida Externa')

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/span_Buscador Hoja Vida Externa'))

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/label_Las hojas de vida que no correspondan a empleados'))

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/label_Las hojas de vida que cumplan con el perfil de una cargo'))

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/select_CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/select_1111123456ADMINISTRACIONADMINISTRACIONAnalista QAASISTENCIAASISTENTE ASISTENTE'), 
    8)

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/select_20061    - ANALISTA DE MARKETING20139    - ABOGADO20156    - ANALISTA CONTABLE'), 
    3)

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/span_Agregar Filtro_btn-miniadicionar'))

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/select_1rea de experiencia NPARTICULO DE REVISTAARTICULO PERIODICOASOCIACIONESAsociaciones'), 
    11)

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/select_CiudadCorreoDocumentoNombresPrimer ApellidoDOCUMENTOEDADACTUALIZACION'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/select_-- Seleccione--000000ABEJORRALABREGOABRIAQUACACIASACANDIACEVEDOACHIAGRADOAGUA'), 
    113)

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/a_Aplicar3'))

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/a_Aplicar2'))

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/span_Excluir candidatos bloqueados_ui-chkbox-icon ui-icon ui-icon-check ui-c'))

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/span_NO RELACIONADA_btn-procesoactivo us-icon-card-img'))

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/a_Aceptar1'))

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/select_SINO'), 1)

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/td_Administracion'))

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/a_Aplicar2'))

WebUI.waitForElementVisible(findTestObject('Modulo Selección/Buscar_hoja_de_vida_externa/p_LA HOJA DE VIDA YA ESTA ASOCIADA A ESTE PROCESO'), 
    0)

WebUI.closeBrowser()

