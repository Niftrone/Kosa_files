package com.adu.test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
 *  MAP
 *   |
 *  HashTable, HashMap
 *   |
 *  Properties
 *  (String key) - (String Value)
 *  
 *  System위에 탑재된 JAVA 관련 환경변수값들을
 *  전부다.. 모조리.. 출력
 *  
 * */
public class PropertiesTest4 {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		
		Set set = p.keySet();
		Iterator it = set.iterator(); 
		
//		2번째 방법
		while(it.hasNext()) {
			String key = (String) it.next();
			String value = (String) p.getProperty(key);
			System.out.println(key + "============" + value);
			
		}
		
//		1번째 방법
//		for (Object key: set.toArray()) {
//			 String value = p.getProperty((String)key);
//			 System.out.println("key: " + key + ", Value: " + value);
//		 }
		
		
		/* 첫번째 방법
		Enumeration e = p.propertyNames();
		
		while(e.hasMoreElements()) {
			String key = (String) e.nextElement();
			String value = (String) p.getProperty(key);
			System.out.println(key + "============" + value);
		}
		*/
	}
}
