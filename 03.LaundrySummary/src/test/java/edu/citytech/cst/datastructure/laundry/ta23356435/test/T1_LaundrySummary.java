package edu.citytech.cst.datastructure.laundry.ta23356435.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.cst.datastructure.laundry.ta23356435.LaundrySummary;

public class T1_LaundrySummary {

   @Test
	@DisplayName("Sample File | getTotalSummary")
	public void testSize1() {
		
		final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int actual = ls.getTotalSummary();

		int expected = 126_335;		
		assertEquals(expected, actual);
    }
	
	@Test
	@DisplayName("Sample File | getSummaryByMonth Jan")
	public void testsumJan() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int actual = ls.getSummaryByMonth("Jan");
	
		int expected = 10_161;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMonth Feb")
	public void testsumFeb() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int actual = ls.getSummaryByMonth("Feb");
	
		int expected = 9_815;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMonth Mar")
	public void testsumMar() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int actual = ls.getSummaryByMonth("Mar");
	
		int expected = 10_793;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMonth Apr")
	public void testsumApr() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int actual = ls.getSummaryByMonth("Apr");
	
		int expected = 10_610;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMonth May")
	public void testsumMay() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int actual = ls.getSummaryByMonth("May");
	
		int expected = 10_749;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMonth Jun")
	public void testsumJun() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int actual = ls.getSummaryByMonth("Jun");
	
		int expected = 10_519;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMonth Jul")
	public void testsumJul() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int actual = ls.getSummaryByMonth("Jul");
	
		int expected = 10_678;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMonth Aug")
	public void testsumAug() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int actual = ls.getSummaryByMonth("Aug");
	
		int expected = 11_078;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMonth Sep")
	public void testsumSep() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int actual = ls.getSummaryByMonth("Sep");
	
		int expected = 10_402;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMonth Oct")
	public void testsumOct() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int actual = ls.getSummaryByMonth("Oct");
	
		int expected = 11_048;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMonth Nov")
	public void testsumNov() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int actual = ls.getSummaryByMonth("Nov");
	
		int expected = 10_318;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMonth Dec")
	public void testsumDec() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int actual = ls.getSummaryByMonth("Dec");
	
		int expected = 10_164;		
		assertEquals(expected, actual);
	
	}

	@Test
	@DisplayName("Sample File | getSummaryByMachine1")
	public void testByMachineName1() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int machineNumber = 1;
		int actual = ls.getSummaryByMachine(machineNumber);
		int expected = 4_086;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMachine2")
	public void testByMachineName2() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int machineNumber = 2;
		int actual = ls.getSummaryByMachine(machineNumber);
		int expected = 14_501;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMachine3")
	public void testByMachineName3() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int machineNumber = 3;
		int actual = ls.getSummaryByMachine(machineNumber);
		int expected = 10_954;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMachine4")
	public void testByMachineName4() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int machineNumber = 4;
		int actual = ls.getSummaryByMachine(machineNumber);
		int expected = 14_547;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMachine5")
	public void testByMachineName5() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int machineNumber = 5;
		int actual = ls.getSummaryByMachine(machineNumber);
		int expected = 9_256;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMachine6")
	public void testByMachineName6() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int machineNumber = 6;
		int actual = ls.getSummaryByMachine(machineNumber);
		int expected = 14_585;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMachine7")
	public void testByMachineName7() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int machineNumber = 7;
		int actual = ls.getSummaryByMachine(machineNumber);
		int expected = 29_008;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByMachine8")
	public void testByMachineName8() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv";
		
		LaundrySummary ls = new LaundrySummary(fileName);
	    int machineNumber = 8;
		int actual = ls.getSummaryByMachine(machineNumber);
		int expected = 29_398;		
		assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByDayName Monday")
	public void testGetSummaryByDayNameMonday() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine-sample.csv";		
	LaundrySummary ls = new LaundrySummary(fileName);

	String dayName = "Monday";
	int actual = ls.getSummaryByDayName(dayName );
	
	int expected = 18_029;		
	assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByDayName Tuesday")
	public void testGetSummaryByDayNameTuesday() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine-sample.csv";		
	LaundrySummary ls = new LaundrySummary(fileName);

	String dayName = "Tuesday";
	int actual = ls.getSummaryByDayName(dayName );
	
	int expected = 17_822;		
	assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByDayName Wednsday")
	public void testGetSummaryByDayNameWednesday() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine-sample.csv";		
	LaundrySummary ls = new LaundrySummary(fileName);

	String dayName = "Wednesday";
	int actual = ls.getSummaryByDayName(dayName );
	
	int expected = 18_022;		
	assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByDayName Thursday")
	public void testGetSummaryByDayNameThursday() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine-sample.csv";		
	LaundrySummary ls = new LaundrySummary(fileName);

	String dayName = "Thursday";
	int actual = ls.getSummaryByDayName(dayName );
	
	int expected = 18_065;		
	assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByDayName Friday")
	public void testGetSummaryByDayNameFriday() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine-sample.csv";		
	LaundrySummary ls = new LaundrySummary(fileName);

	String dayName = "Friday";
	int actual = ls.getSummaryByDayName(dayName );
	
	int expected = 18_156;		
	assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByDayName Saturday")
	public void testGetSummaryByDayNameSaturday() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine-sample.csv";		
	LaundrySummary ls = new LaundrySummary(fileName);

	String dayName = "Saturday";
	int actual = ls.getSummaryByDayName(dayName );
	
	int expected = 17_968;		
	assertEquals(expected, actual);
	
	}
	
	@Test
	@DisplayName("Sample File | getSummaryByDayName Sunday")
	public void testGetSummaryByDayNameSunday() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine-sample.csv";		
	LaundrySummary ls = new LaundrySummary(fileName);

	String dayName = "Sunday";
	int actual = ls.getSummaryByDayName(dayName );
	
	int expected = 18_273;		
	assertEquals(expected, actual);
	
	}

	@Test
	@DisplayName("Sample File | getSummaryByHoliday")
	public void testGetSummaryByHoliday() {
		
	final String fileName = "/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine-sample.csv";		
	LaundrySummary ls = new LaundrySummary(fileName);
	int actual = ls.getSummaryByHolidays();
	
	int expected = 2_859;		
	assertEquals(expected, actual);
	
	}

}

