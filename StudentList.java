package assg6_seetooM21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StudentList implements StudentListInterface{
    
	ArrayList<Student> listOfStudents;
	
    public StudentList() {
        ArrayList<Student> listOfStudents = new ArrayList<Student>();
    }

@Override
public void loadData(String fName) {
	
    try {
        Scanner readFrom = new Scanner(new File(fName));
        
        while(readFrom.hasNextLine()) {
        	String line = readFrom.nextLine();
        	String token[] = line.split(",");
            Student addStu = new Student(token[0], token[1], token[2], token[3]);
            listOfStudents.add(addStu);

        }
    }
    catch (FileNotFoundException e) {
        System.out.println("File not found");
    }    
}
@Override
public void displayRoster() {
	Iterator<Student> it = this.listOfStudents.iterator();
	while (it.hasNext()) {
		System.out.println(it.next().toString()+ " ");
	}
}
@Override
public Student searchForStudent(String id) {
	Iterator<Student> it = this.listOfStudents.iterator();
	while (it.hasNext()) {
		Student temp = it.next();
		if (temp.id.equals(id)) {
			return temp;
		}
	}
	return null;
}
@Override
public boolean addStudent(String name, String id, String year, String major) {
	Student temp = new Student(name, id, year, major);
	this.listOfStudents.add(temp);
	return true;
}
@Override
public boolean removeStudent(String id) {
	Iterator<Student> it = this.listOfStudents.iterator();
	while (it.hasNext()) {
		Student temp = it.next();
		if (temp.id.equals(id)) {
			this.listOfStudents.remove(temp);
			return true;
		}
	}
	return false;
}
@Override
public StudentList getStudentsByMajor(String major){
	Iterator<Student> it = this.listOfStudents.iterator();
	StudentList list = new StudentList();
	while (it.hasNext()) {
		Student temp = it.next();
		if (temp.major.equals(major)) {
			list.addStudent(temp.id, temp.name, temp.year, temp.major);
		}
	}
	return list;

	
}
@Override
public void Sort() {
	
}
@Override 
public void Save()
{
	
}    
}