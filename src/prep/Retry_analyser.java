package prep;

import java.lang.annotation.Annotation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import Listeners_retry.RetryCountIfFailed;

public class Retry_analyser implements IRetryAnalyzer 
{
	int counter=0;

	@Override
	public boolean retry(ITestResult res) 
	{
		
		RetryCountIfFailed annotation=(RetryCountIfFailed) res.getMethod().getConstructorOrMethod().getConstructor().getAnnotation(RetryCountIfFailed.class);
		if( (annotation!=null)&&(counter<annotation.value()))
		{
			counter++;
			return true;
		}
		
		return false;
	}

}
