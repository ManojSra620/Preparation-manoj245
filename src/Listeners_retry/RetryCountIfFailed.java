package Listeners_retry;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RetryCountIfFailed 
{
	int value() default 3;

}
