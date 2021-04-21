package org.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONSimple {
	public static void main(String[] args) throws IOException, ParseException {
		readJson();
	}
	public static void readJson() throws IOException, ParseException {
		FileReader f=new FileReader("C:\\Users\\PREMA\\eclipse-workspace\\APITesting_3.30PM\\src\\test\\resources\\JSON\\Sample.json");
		//create the JSONparser
		
		JSONParser p=new JSONParser();
		Object obj = p.parse(f);

		//Json object
		//TypeCasting
		JSONObject j=(JSONObject)obj;
		Object ob = j.get("username");
		System.out.println(ob);
		System.out.println(j.get("password"));
		System.out.println(j.get("browserName"));
		Object o = j.get("browserName");
		
		//JSONArray
		JSONArray a=(JSONArray)o;
		Object o1 = a.get(2);
		System.out.println(o1);


	}

}
