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

Mobile.tap(findTestObject('Post_Rent/android.widget.TextView0 - NEXT'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.TextView0 - LOGIN'), 0)

Mobile.setText(findTestObject('Post_Rent/android.widget.EditText0 - Email ID'), 'sudheer@mailnesia.com', 0)

Mobile.setText(findTestObject('Post_Rent/android.widget.EditText0 - Password'), '1234567', 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.TextView0 - LOGIN (1)'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.FrameLayout0'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.TextView0 - Post'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.RadioButton0 - Buy Sell or Rent'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.TextView0 - NEXT (1)'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.RadioButton0 - Rent'), 0)

Mobile.setText(findTestObject('Post_Rent/android.widget.EditText0 - Title'), 'The most difficult thing is the decision to act, the rest is merely tenacity. The fears are paper tigers. You can do anything you decide to do. You can act to change and control your life; and the procedure, the process is its own reward', 
    0)

Mobile.tap(findTestObject('Post_Rent/android.widget.Switch0 - Off'), 0)

Mobile.setText(findTestObject('Post_Rent/android.widget.EditText0 - Details (size color condition etc.)'), 'Do not mind anything that anyone tells you about anyone else. Judge everyone and everything for yourself,Take up one idea. Make that one idea your life - think of it, dream of it, live on that idea. Let the brain, muscles, nerves, every part of your body, be full of that idea, and just leave every other idea alone. This is the way to success', 
    0)

Mobile.tap(findTestObject('Post_Rent/android.widget.TextView0 - NEXT (2)'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.RadioButton0 - Electronics'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.TextView0 - NEXT (2)'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.RadioButton0 - Your nearby neighbourhoods'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.TextView0 - POST (1)'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.FrameLayout0 (1)'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.LinearLayout0'), 0)

Mobile.tap(findTestObject('Post_Rent/android.widget.TextView0 - Yes'), 0)

Mobile.closeApplication()

