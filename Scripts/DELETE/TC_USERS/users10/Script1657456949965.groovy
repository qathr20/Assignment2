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
WS.verifyElementPropertyValue(respon1, 'id', '10')
WS.verifyElementPropertyValue(respon1, 'name', 'Clementina DuBuque')
WS.verifyElementPropertyValue(respon1, 'username', 'Moriah.Stanton')
WS.verifyElementPropertyValue(respon1, 'email', 'Rey.Padberg@karina.biz')
WS.verifyElementPropertyValue(respon1, 'address')
WS.verifyElementPropertyValue(respon1, 'street', 'Kattie Turnpike')
WS.verifyElementPropertyValue(respon1, 'suite', 'Suite 198')
WS.verifyElementPropertyValue(respon1, 'city', 'Lebsackbury')
WS.verifyElementPropertyValue(respon1, 'zipcode', '31428-2261')
WS.verifyElementPropertyValue(respon1, 'geo')
WS.verifyElementPropertyValue(respon1, 'lat', '-38.2386')
WS.verifyElementPropertyValue(respon1, 'lng', '57.2232')
WS.verifyElementPropertyValue(respon1, 'phone', '024-648-3804')
WS.verifyElementPropertyValue(respon1, 'website', 'ambrose.net')
WS.verifyElementPropertyValue(respon1, 'company')
WS.verifyElementPropertyValue(respon1, 'name', 'Hoeger LLC')
WS.verifyElementPropertyValue(respon1, 'catchPhrase', 'Centralized empowering task-force')
WS.verifyElementPropertyValue(respon1, 'bs', 'target end-to-end models')