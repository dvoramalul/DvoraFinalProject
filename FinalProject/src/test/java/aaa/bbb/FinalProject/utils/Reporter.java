package aaa.bbb.FinalProject.utils;

import aaa.bbb.FinalProject.pages.ReporterStatus;


public class Reporter {
	
	public enum ReporterStatus1 {

	    FAIL,
	    PASS,
	    WARNING,
	    INFO
	}
	
	public static void startReport() {
		
		
	}
	
	public static void endReport() {
		
		
	}
	
	public void reportFailStep(String stepDescription) {
		
		reportStep(ReporterStatus.FAIL, stepDescription);
		
	}
	
	public void reportStep(ReporterStatus stepStatus, int stepDescription) {
		
		reportStep(stepStatus, String.valueOf(stepDescription));
		
	}

	public static void reportStep(ReporterStatus stepStatus, String stepDescription) {
		
		System.out.println(stepStatus + ": " + stepDescription);
		
	}

}
