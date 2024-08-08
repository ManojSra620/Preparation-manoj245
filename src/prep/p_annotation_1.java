package prep;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface p_annotation_1 
{
	
int value() default 2;
}
