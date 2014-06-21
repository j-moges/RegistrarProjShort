package ch1prob;

/**
 *
 * @author Michael Althoff <dalthoff@unca.edu>
 * @param <T> type
 */
public class Student<T> {

    private String name;
    private int id;
    private int credits;
    private double gradePts;
    

    //Default Constructor
    public Student() {
        name = "null";
        id = 0;
        credits = 0;
        gradePts = 0.0;
    }

    //Constructor to initalize name and ID
    public Student(String n, int i) {
        name = n;
        id = i;
    }

    //--------------------------
    //SETTERS
    //--------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setGradePts(double gpts) {
        this.gradePts = gpts;
    }

    //----------------------------
    //GETTERS
    //----------------------------
    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public int getCredits() {
        return credits;
    }

    public double getGradePts() {
        return gradePts;
    }

    /**
     * Compares two student IDs.  Returns true if equal, returns false if not
     *
     * @param s1 First student
     * @param s2 Second student to compare
     * @return true if student IDs are equal
     */
    public boolean equals(Student s1, Student s2) {
        if (s1.getID() == s2.getID()) {
            return true;
        } else {
            return false;
        }
    }
    
    //Calculates gpa and returns it
    public double studentGPA(Student student){
        double gpts = student.getGradePts();
        int creds = student.getCredits();
        double gpa = gpts/(double)creds;
        return gpa;
    }
    
    //Created my own toString method for printing out each student info  
     @Override
        public String toString() {
            return "Student Name: " + this.name + "    Student ID: " + this.id;
        }
}
