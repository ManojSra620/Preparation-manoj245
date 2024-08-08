package prep;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Annotation_Transformer implements IAnnotationTransformer

{

	@Override
	public void transform(ITestAnnotation annotation, Class testc, Constructor testcon, Method testm) {
		
		//annotation.setRetryAnalyzer(Retryanalyser.class);
	}

}
