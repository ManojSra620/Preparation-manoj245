package prep;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class p_retry_2 implements IRetryAnalyzer
{
 int count=0;
	@Override
	public boolean retry(ITestResult res) 
	{
		p_annotation_1 ann=res.getMethod().getConstructorOrMethod().getMethod().getAnnotation(prep.p_annotation_1.class);
		if((ann!=null)&&(count<ann.value()))
		{
			count++;
			return true;
		}
		return false;
	}
	

}
