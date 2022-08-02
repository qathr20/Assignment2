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

respon1 = WS.sendRequest(findTestObject('GET/users'))

WS.verifyResponseStatusCode(respon1, 200, FailureHandling.STOP_ON_FAILURE)
assert respon1.getStatusCode()== 200
WS.verifyElementPropertyValue(respon1, 'id', '7')
WS.verifyElementPropertyValue(respon1, 'name', 'Kurtis Weissnat')
WS.verifyElementPropertyValue(respon1, 'username', 'Elwyn.Skiles')
WS.verifyElementPropertyValue(respon1, 'email', 'Telly.Hoeger@billy.biz')
WS.verifyElementPropertyValue(respon1, 'address')
WS.verifyElementPropertyValue(respon1, 'street', 'Rex Trail')
WS.verifyElementPropertyValue(respon1, 'suite', 'Suite 280')
WS.verifyElementPropertyValue(respon1, 'city', 'Howemouth')
WS.verifyElementPropertyValue(respon1, 'zipcode', '58804-1099')
WS.verifyElementPropertyValue(respon1, 'geo')
WS.verifyElementPropertyValue(respon1, 'lat', '24.8918')
WS.verifyElementPropertyValue(respon1, 'lng', '21.8984')
WS.verifyElementPropertyValue(respon1, 'phone', '210.067.6132')
WS.verifyElementPropertyValue(respon1, 'website', 'elvis.io')
WS.verifyElementPropertyValue(respon1, 'company')
WS.verifyElementPropertyValue(respon1, 'name', 'Johns Group')
WS.verifyElementPropertyValue(respon1, 'catchPhrase', 'Configurable multimedia task-force')
WS.verifyElementPropertyValue(respon1, 'bs', 'generate enterprise e-tailers')