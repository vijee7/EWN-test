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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-auth.energyworldnet.com/static/login?redirect_uri=%2Fconnect%2Fauthorize%3Fresponse_type%3Dcode%2520id_token%26response_mode%3Dform_post%26client_id%3DD612BD2A-ADC1-4F8F-B161-7E9D082F7042%26scope%3Dopenid%2520offline_access%26redirect_uri%3Dhttps%253A%252F%252Ftest.energyworldnet.com%252FPROIINET%252FApiProxy%252FLogin%26state%3DeyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJyZnAiOiJmQXA4TVh3eVFFL3drMXdWZ0RZMTJxem1makpVYzMzWFlNMll6cHlodXhFPSIsInRhcmdldF9saW5rX3VyaSI6Ii9QUk9JSU5FVC9IZWxwIiwibmJmIjoxNjU0NDYzMjQxLCJleHAiOjE2NTQ1NDk2NDEsImlhdCI6MTY1NDQ2MzI0MX0.gUa3UqG2O1EWTZNyDyc1lPaqWRS_I6Zcf5-ER0hgeLGnHB5P8ubgXT2S2uKnE9sUrxMc4zUEuxU5vixHf4eNAVBWv3vFnwxWGBM2GR2FOQ0ynxijCXlLrjJzoGKRjDemPIuNkE38oqS7PuWZjiYTldxaUwXTEqpg4tcGUyrIwA4FNy5_ltjsLuUlOYs1JUAp6FaT1jUSPNNB2a02yb_AAJoh0j2KJBcVpV4HxLt6KwkJP_iKJ_RSRGjGWSNKmHgfK8w4EURLRgR0fbTp_K3EJJnEp-8nSzzRVE89vwlDyB5qMjwAlnCa_BV8UVtdzoDMHFCfu1UaLJCSGfNWJHvnvQ%26nonce%3DfAp8MXwyQE%252Fwk1wVgDY12qzmfjJUc33XYM2YzpyhuxE%253D%26max_age%3D1800')

WebUI.setText(findTestObject('Object Repository/Page_Energy Worldnet Login/input_Username_username'), 'VM12345')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Energy Worldnet Login/input_Password_password'), 'eGGoqPNxWLwcYVBuXlchKQ==')

WebUI.click(findTestObject('Object Repository/Page_Energy Worldnet Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Energy Worldnet/a_Task Management'))

WebUI.click(findTestObject('Object Repository/Page_Energy Worldnet/div_Manage, edit, and add new tasks'))

WebUI.click(findTestObject('Object Repository/Page_Energy Worldnet/span_Add_ri-arrow-down-s-line'))

WebUI.click(findTestObject('Object Repository/Page_Energy Worldnet/a_New Task'))

WebUI.setText(findTestObject('Object Repository/Page_Energy Worldnet/input_Task Name_txtTasksPropertiesTaskName'), 'Test1234')

WebUI.click(findTestObject('Object Repository/Page_Energy Worldnet/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Energy Worldnet/uib-tab-heading_Conditions'))

WebUI.click(findTestObject('Object Repository/Page_Energy Worldnet/form_Add                 Add or remove qual_8397cb'))

WebUI.click(findTestObject('Object Repository/Page_Energy Worldnet/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_Energy Worldnet/button_Save'))

WebUI.closeBrowser()

