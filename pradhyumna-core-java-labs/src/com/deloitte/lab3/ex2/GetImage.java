package com.deloitte.lab3.ex2;
import java.util.*;

public class GetImage {
	public static String getImage(String ipString) {
		StringBuffer buf = new StringBuffer(ipString);
		String revString = buf.reverse().toString();
		
		return ipString +" | "+revString;
	}
}
