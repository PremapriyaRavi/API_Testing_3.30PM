package org.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONReqRes_1 {
	public static void main(String[] args) throws IOException, ParseException {
		readJson();
	}
	public static void readJson() throws IOException, ParseException {
		FileReader f=new FileReader("C:\\Users\\PREMA\\eclipse-workspace\\APITesting_3.30PM\\src\\test\\resources\\JSON\\reqres.json");
		//create jsonparser
		JSONParser p=new JSONParser();
		Object obj = p.parse(f);
		//jsonobject
		//typecasting
		JSONObject j=(JSONObject)obj;
		System.out.println(j.get("page"));
		System.out.println(j.get("per_page"));
		System.out.println(j.get("total"));
		System.out.println(j.get("total_pages"));
		Object ob = j.get("data");
		JSONArray ja=(JSONArray)ob;
		int datasize = ja.size();
		System.out.println("datasize="+datasize);
		for(int k=0;k<datasize;k++) {
			Object ob1 = ja.get(k);
			System.out.println(ob1);
			System.out.println("------------------------------------------------");
			JSONObject j1=(JSONObject)ob1;
			System.out.println(j1.get("id"));
			System.out.println(j1.get("email"));
			System.out.println(j1.get("first_name"));
			System.out.println(j1.get("last_name"));
			System.out.println(j1.get("avatar"));
		}
		System.out.println("_________________________");
		Object ob3 = j.get("support");
		System.out.println(ob3);
		JSONObject j2=(JSONObject)ob3;
		System.out.println(j2.get("url"));
		System.out.println(j2.get("text"));
	}
}
