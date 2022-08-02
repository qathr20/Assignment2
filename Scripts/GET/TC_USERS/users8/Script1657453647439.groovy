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
WS.verifyElementPropertyValue(respon1, 'id', '8')
WS.verifyElementPropertyValue(respon1, 'name', 'Nicholas Runolfsdottir V')
WS.verifyElementPropertyValue(respon1, 'username', 'Maxime_Nienow')
WS.verifyElementPropertyValue(respon1, 'email', 'Sherwood@rosamond.me')
WS.verifyElementPropertyValue(respon1, 'address')
WS.verifyElementPropertyValue(respon1, 'street', 'Ellsworth Summit')
WS.verifyElementPropertyValue(respon1, 'suite', 'Suite 729')
WS.verifyElementPropertyValue(respon1, 'city', 'Aliyaview')
WS.verifyElementPropertyValue(respon1, 'zipcode', '45169')
WS.verifyElementPropertyValue(respon1, 'geo')
WS.verifyElementPropertyValue(respon1, 'lat', '-14.3990')
WS.verifyElementPropertyValue(respon1, 'lng', '-120.7677')
WS.verifyElementPropertyValue(respon1, 'phone', '586.493.6943 x140')
WS.verifyElementPropertyValue(respon1, 'website', 'jacynthe.com')
WS.verifyElementPropertyValue(respon1, 'company')
WS.verifyElementPropertyValue(respon1, 'name', 'Abernathy Group')
WS.verifyElementPropertyValue(respon1, 'catchPhrase', 'Implemented secondary concept')
WS.verifyElementPropertyValue(respon1, 'bs', 'e-enable extensible e-tailers')