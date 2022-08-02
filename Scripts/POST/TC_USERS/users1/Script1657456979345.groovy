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
WS.verifyElementPropertyValue(respon1, 'name', 'Graham')
WS.verifyElementPropertyValue(respon1, 'username', 'Tret')
WS.verifyElementPropertyValue(respon1, 'email', 'Since@april.biz')
WS.verifyElementPropertyValue(respon1, 'address')
WS.verifyElementPropertyValue(respon1, 'street', 'KuLight')
WS.verifyElementPropertyValue(respon1, 'suite', 'Apt. 876')
WS.verifyElementPropertyValue(respon1, 'city', 'Gwenborough')
WS.verifyElementPropertyValue(respon1, 'zipcode', '92998-3801')
WS.verifyElementPropertyValue(respon1, 'geo')
WS.verifyElementPropertyValue(respon1, 'lat', '-37.3101')
WS.verifyElementPropertyValue(respon1, 'lng', '81.1401')
WS.verifyElementPropertyValue(respon1, 'phone', '1-770-736-8031 x56401')
WS.verifyElementPropertyValue(respon1, 'website', 'hilde.org')
WS.verifyElementPropertyValue(respon1, 'company')
WS.verifyElementPropertyValue(respon1, 'name', 'Roma-Crona')
WS.verifyElementPropertyValue(respon1, 'catchPhrase', 'Multi-layered neural-net')
WS.verifyElementPropertyValue(respon1, 'bs', 'e-markets')