
package assg6_seetooM21;

public interface StudentListInterface {
    public void loadData(String fName);
    public void displayRoster();
    public Student searchForStudent(String id);
    public boolean addStudent(String name, String id, String year, String major);
    public boolean removeStudent(String id);
    public StudentList getStudentsByMajor(String major);
    public void Sort();
    public void Save();
}

