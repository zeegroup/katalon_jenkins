import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import customKeywords.Keywords as Keywords

Keywords keywords = new Keywords()

try {


double x = ((Math.random() * ((1000 - 1) + 1)) as int) + 1

String email = ('anji.sangisetti' + x) + '@gmail.com'

int aNumber = 0

aNumber = (((Math.random() * 90000000) + 10000000) as int)

mNumber = '91'+aNumber


    keywords.mReg(email, mNumber )

    keywords.mLogout()

    keywords.closeApp()
}
catch (Exception e) {
    println(e.printStackTrace())
}