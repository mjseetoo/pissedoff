package assg6_seetooM21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class StudentMIS {
    
    public static void main(String[] args) {
        
    	StudentList list = new StudentList();
    	
    	list.loadData("assg6_data.txt");
    	
        Scanner kbd = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);
        int input;
        System.out.println("1. Display the roster");
        System.out.println("2. Search for new student by id");
        System.out.println("3. Add a new student");
        System.out.println("4. Remove a student");
        System.out.println("5. Search for students by major");
        System.out.println("6. Sort and save to file");
        System.out.println("7. Save to file");
        System.out.println("8. Exit");
        
        input = kbd.nextInt();
        
        switch (input) {
        case 1:
        	list.displayRoster();
            break;
        case 2: 
        	System.out.println("Enter a student ID to search for: ");
        	String id = kbd.next();
        	list.searchForStudent(id);
            break;
        case 3:
        	System.out.println("Enter a student ID: ");
        	String addID = kbd.next();
        	System.out.println("Enter a student name: ");
        	String name = kbd.next();
        	System.out.println("Enter a student year: ");
        	String year = kbd.next();
        	System.out.println("Enter a student major: ");
        	String major = kbd.next();
        	list.addStudent(name, addID, year, major);
            break;
        case 4:
        	System.out.println("Enter a student ID: ");
        	String remID = kbd.next();
        	list.removeStudent(remID);
            break;
        case 5:
        	System.out.println("Enter a student major: ");
        	String majorIn = kbd.next();
        	list.getStudentsByMajor(majorIn);
            break;
        case 6:
            break;
        case 7:
        	
            break;
        case 8:
            System.exit(input);
        }
        
    }
}