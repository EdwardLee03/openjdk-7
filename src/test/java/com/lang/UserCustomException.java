/**
 * <JRE source & API> - Sun Corporation.
 */
package com.lang;

/**
 * 应用程序自定义的异常。
 *
 * @author Bert Lee
 * @version 2013-11-14
 */
public class UserCustomException extends Exception {

	public UserCustomException(String message) {
		super(message);
	}
	
	public UserCustomException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public UserCustomException(Throwable cause) {
		super(cause);
	}
	
	private static final long serialVersionUID = -9082003564481313091L;

}
