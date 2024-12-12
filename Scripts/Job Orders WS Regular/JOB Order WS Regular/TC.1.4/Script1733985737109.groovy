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

WebUI.navigateToUrl('https://workchestra-moonlay.southeastasia.cloudapp.azure.com:4200/eworkbag/job/314')

WebUI.setText(findTestObject('Object Repository/Page_ST Engineering Aerospace/input_Log in_Input.Username'), '80309000')

WebUI.click(findTestObject('Object Repository/Page_ST Engineering Aerospace/div_Log in'))

WebUI.click(findTestObject('Object Repository/Page_ST Engineering Aerospace/div_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ST Engineering Aerospace/input_Log in_Input.Password'), 'u1JKymZE/SfHAn9XxJys1oLyz6Gnq6KX')

WebUI.click(findTestObject('Object Repository/Page_ST Engineering Aerospace/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/div_Back Assigned TechniciansRoleTechnician_0020d2'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/div_Job No.  7402180000301Not Started Start_809a26'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Start Job'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/div_Job Details Work Stages Defect Rectific_bc6837'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/a_Compliance Declaration'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/label_CAA Nepal (AMOVAL122005)'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/button_Declare Compliance'))

WebUI.click(findTestObject('Object Repository/Page_Workchestra/tab_Certified that the work recorded in thi_43308a'))

WebUI.closeBrowser()
