package com.hczoop.minidao.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;


/**   
 *  
 * @Description: 该注解用于对class类（ElementType.TYPE）
 *    
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MiniDao {
	
}


