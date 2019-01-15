package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object Gist_Description
     
    /**
     * <p></p>
     */
    public static Object Gist_Code
     
    /**
     * <p></p>
     */
    public static Object Gist_Extension
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['url' : 'https://gist.github.com/', 'Gist_Description' : 'Gist Description', 'Gist_Code' : 'Gist Code', 'Gist_Extension' : 'Gist Extension.txt', 'username' : 'username', 'password' : 'password'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        url = selectedVariables["url"]
        Gist_Description = selectedVariables["Gist_Description"]
        Gist_Code = selectedVariables["Gist_Code"]
        Gist_Extension = selectedVariables["Gist_Extension"]
        username = selectedVariables["username"]
        password = selectedVariables["password"]
        
    }
}
