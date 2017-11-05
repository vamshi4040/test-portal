package com.test.portal.exception;

public class ApplicationException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApplicationException(){
		super();
	}
	
	public ApplicationException(Exception exception){
		super(exception);
	}
	public ApplicationException(String message){
		super(message);
	}
	
	@SuppressWarnings("rawtypes")
	public ApplicationException(String message, Class clazz){
		super(message+"Error Occured"+ clazz.getName());
	}
}
