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

Mobile.tap(findTestObject('Post_Sell/android.widget.TextView0 - NEXT'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.TextView0 - LOGIN'), 0)

Mobile.setText(findTestObject('Post_Sell/android.widget.EditText0 - Email ID'), 'sudheer@mailnesia.com', 0)

Mobile.setText(findTestObject('Post_Sell/android.widget.EditText0 - Password'), '1234567', 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.TextView0 - LOGIN (1)'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.FrameLayout0'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.TextView0 - Post'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.RadioButton0 - Buy Sell or Rent'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.TextView0 - NEXT (1)'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.RadioButton0 - Sell'), 0)

Mobile.setText(findTestObject('Post_Sell/android.widget.EditText0 - Title'), 'neighbourhood application ', 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.Switch0 - Off'), 0)

Mobile.setText(findTestObject('Post_Sell/android.widget.EditText0 - Details (size color condition etc.)'), 'Zee5 india Kondapur colour blue ', 
    0)

Mobile.tap(findTestObject('Post_Sell/android.widget.TextView0 - NEXT (2)'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.RadioButton0 - Bicycles'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.TextView0 - NEXT (2)'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.RadioButton0 - Your nearby neighbourhoods'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.TextView0 - POST (1)'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.FrameLayout0 (1)'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.LinearLayout0'), 0)

Mobile.tap(findTestObject('Post_Sell/android.widget.TextView0 - Yes'), 0)

Mobile.closeApplication()

