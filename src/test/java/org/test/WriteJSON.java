package org.test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSON {
	public static void main(String[] args) throws FileNotFoundException {
		write();
	}
	private static void write() throws FileNotFoundException {
		JSONObject j=new JSONObject();
		j.put("page",2);
		j.put("per_page",6);
		j.put("toatal",2); 
		
		Map m1=new LinkedHashMap();
		m1.put("id", 7);
		m1.put("email","michael.lawson@reqres.in");
		m1.put("first_name","Michael");
		m1.put("last_name","Lawson");
		m1.put("avatar","https://reqres.in/img/faces/7-image.jpg");
		
		Map m2=new LinkedHashMap();
		m2.put("id", 8);
		m2.put("email","lindsay.ferguson@reqres.in");
		m2.put("first_name","Lindsay");
		m2.put("last_name", "Ferguson");
		m2.put("avatar", "https://reqres.in/img/faces/8-image.jpg");
		
		Map m3=new LinkedHashMap();
		m3.put("id",9);
		m3.put("email", "tobias.funke@reqres.in");
		m3.put("first_name", "Tobias");
		m3.put("last_name", "Funke");
		m3.put("avatar", "https://reqres.in/img/faces/9-image.jpg");
		
		Map m4=new LinkedHashMap();
		m4.put("id",10);
		m4.put("email", "byron.fields@reqres.in");
		m4.put("first_name", "Byron");
		m4.put("last_name", "Fields");
		m4.put("avatar", "https://reqres.in/img/faces/10-image.jpg");
		
		Map m5=new LinkedHashMap();
		m5.put("id",11);
		m5.put("email", "george.edwards@reqres.in");
		m5.put("first_name", "George");
		m5.put("last_name", "Edwards");
		m5.put("avatar", "https://reqres.in/img/faces/11-image.jpg");
		
		Map m6=new LinkedHashMap();
		m6.put("id",12);
		m6.put("email", "rachel.howell@reqres.in");
		m6.put("first_name", "Rachel");
		m6.put("last_name", "Howell");
		m6.put("avatar", "https://reqres.in/img/faces/12-image.jpg");
			
		JSONArray ja=new JSONArray();
		ja.add(m1);
		ja.add(m2);
		ja.add(m3);
		ja.add(m4);
		ja.add(m5);
		ja.add(m6);
		
		j.put("data",ja);
		
		Map m7=new LinkedHashMap();
		m7.put("url","https://reqres.in/#support-heading");
		m7.put("text","To keep ReqRes free, contributions towards server costs are appreciated!");
		 
		//JSONArray ja2=new JSONArray();
		//ja2.add(m7);
		j.put("support",m7);
		
		PrintWriter p=new PrintWriter("C:\\Users\\PREMA\\eclipse-workspace\\APITesting_3.30PM\\src\\test\\resources\\JSON\\newtask_2.json");
		p.write(j.toString());
		p.flush();
		p.close();
		System.out.println("DONE..............");
		
	}

}
