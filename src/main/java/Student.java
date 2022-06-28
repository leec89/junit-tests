import java.util.ArrayList;

public class Student {
    // id should be a long number used to represent a "unique user" in our application.
    private long id;
    // name is a String that holds the name of the student.
    private String name;
    // grades is an ArrayList that contains a list of Integer numbers.
    private ArrayList<Integer> grades;

    // constructor

    public Student () {};

//    public Student () {
//        this.grades = new ArrayList<>();
//    };

    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(long id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    // getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){

        double total = 0;

        for (double grade : grades) {
            total += grade;
        }

        double average = total / grades.size();

        return average;
    }
}

