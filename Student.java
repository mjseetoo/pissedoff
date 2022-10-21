package assg6_seetooM21;

public class Student{
    String id;
    String name;
    String year;
    String major;
    
    public Student(String id, String name, String year, String major) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.major = major;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getYear() {
        return this.year;
    }
    public String getMajor() {
        return this.major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String toString() {
        return this.id  + " " + this.name + " " + this.year +  " " + this.major;
    }
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            if(stud.id.equals(this.id)) {
                return true;
            }
            return false;
        }
        else {
            return false;
        }
    }
    public int compareTo(Student student) {
        return 1;
    }
}