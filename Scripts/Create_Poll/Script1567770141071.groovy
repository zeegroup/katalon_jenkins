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

Mobile.startApplication(GlobalVariable.apk, true)

Mobile.tap(findTestObject('Create_poll/android.widget.TextView0 - NEXT'), 0)

Mobile.tap(findTestObject('Create_poll/android.widget.TextView0 - LOGIN'), 0)

Mobile.setText(findTestObject('Create_poll/android.widget.EditText0 - Email ID'), 'sudheer@mailnesia.com', 0)

Mobile.setText(findTestObject('Create_poll/android.widget.EditText0 - Password'), '1234567', 0)

Mobile.tap(findTestObject('Create_poll/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Create_poll/android.widget.TextView0 - LOGIN (1)'), 0)

Mobile.tap(findTestObject('Create_poll/android.widget.FrameLayout0'), 0)

Mobile.tap(findTestObject('Create_poll/android.widget.TextView0 - Poll'), 0)
Mobile.setText(findTestObject('Create_Poll_1/android.widget.EditText0 - Ask a question.'), 'Neighbourhood Automation using katalon ',
	0)

Mobile.setText(findTestObject('Create_Poll_1/android.widget.EditText0 - Option 1 (Max 25 chars)'), 'yes',
	0)

Mobile.setText(findTestObject('Create_Poll_1/android.widget.EditText0 - Option 2 (Max 25 chars)'), 'no',
	0)

Mobile.tap(findTestObject('Create_Poll_1/android.widget.TextView0 - 1 Week'), 0)

Mobile.tap(findTestObject('Create_Poll_1/android.widget.TextView0 - 1 Day'), 0)

Mobile.tap(findTestObject('Create_Poll_1/android.widget.TextView0 - NEXT (1)'), 0)

Mobile.tap(findTestObject('Create_Poll_1/android.widget.TextView0 - NEXT (1)'), 0)

Mobile.tap(findTestObject('Create_Poll_1/android.widget.FrameLayout0 (1)'), 0)

Mobile.tap(findTestObject('Create_Poll_1/android.widget.LinearLayout0'), 0)

Mobile.tap(findTestObject('Create_Poll_1/android.widget.TextView0 - Yes'), 0)





Mobile.closeApplication()

