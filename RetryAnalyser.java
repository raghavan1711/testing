package chainRestAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryAnalyser  implements  IRetryAnalyzer,IAnnotationTransformer{

	int i=1;
	int iMax=2;
			
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(this.getClass());
		}
		
	

	public boolean retry(ITestResult result) {
		
			if(i<iMax) {
				i++;
				return true;
			} else {
		return false;
	}
	}
}
