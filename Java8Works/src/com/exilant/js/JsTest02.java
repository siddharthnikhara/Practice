package com.exilant.js;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsTest02 {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine nasron = manager.getEngineByName("nashor n");
		nasron.eval(new FileReader("resources/com/js/external.js"));
		
		System.out.println(nasron.eval("fnTest()"));
		System.out.println(nasron.eval("sayHello('harry')"));
	}

}
