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

respon1 = WS.sendRequest(findTestObject('POST/users'))

WS.verifyResponseStatusCode(respon1, 200, FailureHandling.STOP_ON_FAILURE)
assert respon1.getStatusCode()== 200
WS.verifyElementPropertyValue(respon1, 'name', 'Ervin')
WS.verifyElementPropertyValue(respon1, 'username', 'Anton')
WS.verifyElementPropertyValue(respon1, 'email', 'Sharni@melissa.tv')
WS.verifyElementPropertyValue(respon1, 'address')
WS.verifyElementPropertyValue(respon1, 'street', 'Victor Yamada')
WS.verifyElementPropertyValue(respon1, 'suite', 'Suite 003')
WS.verifyElementPropertyValue(respon1, 'city', 'Wisokyburgh')
WS.verifyElementPropertyValue(respon1, 'zipcode', '90566-7703')
WS.verifyElementPropertyValue(respon1, 'geo')
WS.verifyElementPropertyValue(respon1, 'lat', '-43.9503')
WS.verifyElementPropertyValue(respon1, 'lng', '-34.4603')
WS.verifyElementPropertyValue(respon1, 'phone', '010-692-6593 x09103')
WS.verifyElementPropertyValue(respon1, 'website', 'ana.net')
WS.verifyElementPropertyValue(respon1, 'company')
WS.verifyElementPropertyValue(respon1, 'name', 'Deny-Crist')
WS.verifyElementPropertyValue(respon1, 'catchPhrase', 'Proactive')
WS.verifyElementPropertyValue(respon1, 'bs', 'synergize scalables')