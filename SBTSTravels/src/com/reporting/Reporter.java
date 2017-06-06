package com.reporting;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reporter {
	
	private static List<Result> details;
	private static final String resultPlaceholder = "<!-- INSERT_RESULTS -->";
	static String reportpath = "src/com/reporting/";
	private static final String templatePath = reportpath+"report_template.html";
			
	public Reporter() {
	}
	
	public static void initialize() {
		details = new ArrayList<Result>();
	}
	
	public static void report(String actualValue,String expectedValue) {
		if(actualValue.equals(expectedValue)) {
			Result r = new Result("Pass","Actual value '" + actualValue + "' matches expected value");
			details.add(r);
		} else {
			Result r = new Result("Fail","Actual value '" + actualValue + "' does not match expected value '" + expectedValue + "'");
			details.add(r);
		}
	}
	
	public static void showResults() {
		for (int i = 0;i < details.size();i++) {
			System.out.println("Result " + Integer.toString(i) + ": " + details.get(i).getResult());
		}
	}
	
	public static void writeResults() {
		try {
			String reportIn = new String(Files.readAllBytes(Paths.get(templatePath).toAbsolutePath()));
			reportIn = reportIn.replaceFirst("<!-- TEST_NAME -->","AmazonLogin");
			for (int i = 0; i < details.size();i++) {
				String result= "";
				if ("Fail".equals(details.get(i).getResult())) {
					result = "</td><td bgcolor="+"#FF0000"+">" + details.get(i).getResult() + "</td>";
				} else {
					result = "</td><td bgcolor="+"green"+">" + details.get(i).getResult() + "</td>";
				}
				reportIn = reportIn.replaceFirst(resultPlaceholder,"<tr><td>" + Integer.toString(i+1) + "</td><td>" +"Method Name"+"</td>"+result+"<td>" + details.get(i).getResultText() + "</td></tr>" + resultPlaceholder);
			}
			
			String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
			String reportPath = reportpath+"\\report_" + currentDate + ".html";
			Files.write(Paths.get(reportPath).toAbsolutePath(),reportIn.getBytes(),StandardOpenOption.CREATE);
			
		} catch (Exception e) {
			System.out.println("Error when writing report file:\n" + e.toString());
		}
	}
}