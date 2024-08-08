package Listeners_retry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class annotationtransformer /* extends RetryAnalyzer */ implements IAnnotationTransformer
{

	@Override
	public void transform(ITestAnnotation annotation, Class testclass, Constructor testconstructor, Method testmethod) 
	{
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
		
	}

}
