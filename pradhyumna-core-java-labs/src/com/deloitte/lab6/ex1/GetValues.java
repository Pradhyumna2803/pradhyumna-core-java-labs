package com.deloitte.lab6.ex1;
import java.util.*;

public class GetValues {
	
	public static List<String> getValues(HashMap<String, String> map) {
        List<String> values = new ArrayList<>(map.values());
        Collections.sort(values);
        return values;
    }

}
