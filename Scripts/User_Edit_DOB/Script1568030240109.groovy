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

Mobile.startApplication('C:\\Users\\sudheer.indlamudi\\Downloads\\india.com_v1.2.1.apk', true)

Mobile.tap(findTestObject('User_Edit_DOB1/android.widget.TextView0 - NEXT'), 10)

Mobile.tap(findTestObject('User_Edit_DOB1/android.widget.TextView0 - LOGIN'), 0)

Mobile.setText(findTestObject('User_Edit_DOB1/android.widget.EditText0 - Email ID'), 'sudheer@mailnesia.com', 0)

Mobile.setText(findTestObject('User_Edit_DOB1/android.widget.EditText0 - Password'), '1234567', 0)

Mobile.tap(findTestObject('User_Edit_DOB1/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('User_Edit_DOB1/android.widget.TextView0 - LOGIN (1)'), 0)

Mobile.tap(findTestObject('User_Edit_DOB1/android.widget.FrameLayout0'), 0)

Mobile.tap(findTestObject('User_Edit_DOB1/android.widget.LinearLayout0 (1)'), 0)

Mobile.scrollToText('Date of Birth')

Mobile.tap(findTestObject('User_Edit_DOB1/android.widget.TextView0 - Edit'), 0)

Mobile.tap(findTestObject('User_Edit_DOB1/android.widget.EditText0 - 09'), 0)

Mobile.tap(findTestObject('User_Edit_DOB1/android.widget.NumberPicker0'), 0)

//Mobile.tap(findTestObject('User_Edit_DOB1/android.widget.DatePicker0'), 0)

Mobile.closeApplication()

