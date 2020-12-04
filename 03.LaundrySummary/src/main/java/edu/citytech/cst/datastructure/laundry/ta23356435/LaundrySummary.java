package edu.citytech.cst.datastructure.laundry.ta23356435;


import java.util.*;
import java.nio.file.*;
import edu.citytech.cst.datastructure.summary.ISummary;

public class LaundrySummary implements ISummary{
	
	List<List<String>> rows =new ArrayList<>();
	public LaundrySummary(String fileName) {
		
	}
	
	@Override //done
	public int getTotalSummary() {
		try {
			 Path path = Paths.get("/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv");
		     List<String> read = Files.readAllLines(path);
			  for (String row : read) {
				 String[] result = row.split(",");
				 rows.add(Arrays.asList(result)) ;
           }   
			  
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	//System.out.print(rows.get(1).get(5)); //get(1) means the row and get(5) means the column of the file
		int sum=0;
		for (int x=0; x<rows.size();x++) { //prints out all the rows
			
			if (x>1) //x represents the row and i represents the column of the file				
				for (int i = 0; i < 13; i++) { //represents the columns 
				//if (rows.get(1).get(i).equals("m1")) {	//goes to the first row and iterates all the columns till it finds m1				
				if(i>=5) { //prints out columns 5 - 13
				sum += Integer.parseInt(rows.get(x).get(i));
				
				}
				
				}
		}
		return sum;
	}

	@Override //done
	public int getSummaryByMonth(String monthName) {
		try {
			 Path path = Paths.get("/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv");
			 List<String> read = Files.readAllLines(path);
			  for (String row : read) {
				 String[] result = row.split(",");
				 rows.add(Arrays.asList(result)) ;
          }   
			  
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	//System.out.print(rows.get(1).get(5)); //get(1) means the row and get(5) means the column of the file
		int sum=0;
		for (int x=0; x<rows.size();x++) { //prints out all the rows
			
			if (x>1) //x represents the row and i represents the column of the file
				if (rows.get(x).get(2).equals(monthName)) { //if the third column equals Jan
				
				for (int i = 0; i < 13; i++) { //represents the columns 
				//if (rows.get(1).get(i).equals("m1")) {	//goes to the first row and iterates all the columns till it finds m1				
				if(i>=5) { //prints out columns 5 - 13
				sum += Integer.parseInt(rows.get(x).get(i));
				
				}
				
				}
	    		
		}
		}return sum;
	}

	@Override //done
	public int getSummaryByDayName(String dayName) {
		try {
			 Path path = Paths.get("/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv");
			 List<String> read = Files.readAllLines(path);
			  for (String row : read) {
				 String[] result = row.split(",");
				 rows.add(Arrays.asList(result)) ;
         }   
			  
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	//System.out.print(rows.get(1).get(5)); //get(1) means the row and get(5) means the column of the file
		int sum=0;
		for (int x=0; x<rows.size();x++) { //prints out all the rows
			
			if (x>1) //x represents the row and i represents the column of the file
				if (rows.get(x).get(4).equals(dayName)) { //if the third column equals Jan
				
				for (int i = 0; i < 13; i++) { //represents the columns 
				//if (rows.get(1).get(i).equals("m1")) {	//goes to the first row and iterates all the columns till it finds m1				
				if(i>=5) { //prints out columns 5 - 13
				sum += Integer.parseInt(rows.get(x).get(i));
				
				}
				
				}
	    		
		}
		}return sum;
	}

	@Override //done
	public int getSummaryByHolidays() {
		try {
			 Path path = Paths.get("/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv");
			 List<String> read = Files.readAllLines(path);
			  for (String row : read) {
				 String[] result = row.split(",");
				 rows.add(Arrays.asList(result)) ;
        }   
			  
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	//System.out.print(rows.get(1).get(5)); //get(1) means the row and get(5) means the column of the file
		int sum=0;
		for (int x=0; x<rows.size();x++) { //prints out all the rows
			
			if (x>1) //x represents the row and i represents the column of the file
				if (rows.get(x).get(3).equals("Y")) { //if the third column equals Jan
				
				for (int i = 0; i < 13; i++) { //represents the columns 
				//if (rows.get(1).get(i).equals("m1")) {	//goes to the first row and iterates all the columns till it finds m1				
				if(i>=5) { //prints out columns 5 - 13
				sum += Integer.parseInt(rows.get(x).get(i));
				
				}
				
				}
	    		
		}
		}return sum;
	}

	@Override //done
	public int getSummaryByMachine(int machineNumber) {
		try {
			 Path path = Paths.get("/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv");
			 List<String> read = Files.readAllLines(path);
			  for (String row : read) {
				 String[] result = row.split(",");
				 rows.add(Arrays.asList(result)) ;
          }   
			  
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	//System.out.print(rows.get(1).get(5)); //get(1) means the row and get(5) means the column of the file
		int sum=0;
		for (int x=0; x<rows.size();x++) { //prints out all the rows
			
			if (x>1) //x represents the row and i represents the column of the file
				//if (rows.get(x).get(2).equals("Jan")) { //if the third column equals Jan
				for (int i = 0; i < 13; i++) { //represents the columns 
				if (rows.get(1).get(i).equals("m" + Integer.toString(machineNumber))) {	//goes to the first row and iterates all the columns till it finds m1				
				if(i>=5) { //prints out columns 5 - 13
				sum += Integer.parseInt(rows.get(x).get(i));
				
				}
				
				}
				}	
					}
		return sum;
	}

	@Override
	public int[][] getMostCommonNumbers(int numberofRows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[][] getLeastCommonNumbers(int numberofRows) {
		// TODO Auto-generated method stub
		return null;
	}

}
