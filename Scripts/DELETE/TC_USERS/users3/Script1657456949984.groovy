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

respon1 = WS.sendRequest(findTestObject('DELETE/users/id'))

WS.verifyResponseStatusCode(respon1, 200, FailureHandling.STOP_ON_FAILURE)
assert respon1.getStatusCode()== 200
WS.verifyElementPropertyValue(respon1, 'id', '3')
WS.verifyElementPropertyValue(respon1, 'name', 'Clementine Bauch')
WS.verifyElementPropertyValue(respon1, 'username', 'Samantha')
WS.verifyElementPropertyValue(respon1, 'email', 'Nathan@yesenia.net')
WS.verifyElementPropertyValue(respon1, 'address')
WS.verifyElementPropertyValue(respon1, 'street', 'Douglas Extension')
WS.verifyElementPropertyValue(respon1, 'suite', 'Suite 847')
WS.verifyElementPropertyValue(respon1, 'city', 'McKenziehaven')
WS.verifyElementPropertyValue(respon1, 'zipcode', '59590-4157')
WS.verifyElementPropertyValue(respon1, 'geo')
WS.verifyElementPropertyValue(respon1, 'lat', '-68.6102')
WS.verifyElementPropertyValue(respon1, 'lng', '-47.0653')
WS.verifyElementPropertyValue(respon1, 'phone', '1-463-123-4447')
WS.verifyElementPropertyValue(respon1, 'website', 'ramiro.info')
WS.verifyElementPropertyValue(respon1, 'company')
WS.verifyElementPropertyValue(respon1, 'name', 'Romaguera-Jacobson')
WS.verifyElementPropertyValue(respon1, 'catchPhrase', 'Face to face bifurcated interface')
WS.verifyElementPropertyValue(respon1, 'bs', 'e-enable strategic applications')