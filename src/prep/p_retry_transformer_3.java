package prep;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class p_retry_transformer_3 implements IAnnotationTransformer
{

	@Override
	public void transform(ITestAnnotation anno, Class arg1, Constructor arg2, Method arg3) 
	{
	anno.setRetryAnalyzer(prep.p_retry_2.class);
		
	}
	

}
