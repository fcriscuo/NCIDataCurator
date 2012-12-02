package edu.jhu.en605.fcriscu1.ncidc.util;

import com.sleepycat.db.Environment;
import com.sleepycat.db.ErrorHandler;
/*
 * Public class that represents a consistent error handling 
 * capability for DB XML related errors
 * 
 */
public class CommonErrorHandler implements ErrorHandler {

	public CommonErrorHandler() {
		
	}
	@Override
	public void error(Environment env, String errpfx, String msg) {
		System.err.println(errpfx +" " +msg); 

	}

}
