package com.damai.exception;

import lombok.Data;

/**
 * @program: 抢票 
 * @description: 参数错误
 * @author: newmax
 **/
@Data
public class ArgumentError {
	
	private String argumentName;
	
	private String message;
}
