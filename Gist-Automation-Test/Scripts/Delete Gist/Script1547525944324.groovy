import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/Gist Creation/gist_homepage_title'))

WebUI.click(findTestObject('Object Repository/Gist Creation/sign_in_button'))

//Please define your git username and password at Global Variable (Profile/default)
WebUI.setText(findTestObject('Object Repository/Gist Creation/username_field'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Gist Creation/password_field'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Gist Creation/sign_in_commit_button'))

WebUI.click(findTestObject('Object Repository/Gist Creation/gist_homepage_title'))

WebUI.click(findTestObject('Object Repository/Gist Edit/view_gist_list_label'))

int counterGist = (WebUI.getText(findTestObject('Object Repository/Gist Edit/counter_gist_list'))).toInteger()

WebUI.click(findTestObject('Object Repository/Gist Edit/first_gist_list'))

WebUI.click(findTestObject('Object Repository/Gist Edit/delete_gist_button'))

WebUI.acceptAlert()

int current_counterGist = counterGist - 1
String counter = current_counterGist.toString()

WebUI.verifyElementText(findTestObject('Object Repository/Gist Edit/counter_gist_list'), counter)