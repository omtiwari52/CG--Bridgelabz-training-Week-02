import java.util.ArrayList;

class Student{
    private String studentName;
    private int studentId;
    private ArrayList<Subject> totalSubjects;

    public Student(String studentName, int studentId ){
        this.studentName = studentName;
        this.studentId = studentId;
        this.totalSubjects = new ArrayList<>();
    }

    //Add subject 
    public void addSubject(Subject subject){
        totalSubjects.add(subject);
    }

    public ArrayList<Subject> getSubjects(){
        return totalSubjects;
    }
    public String getStudentName(){
        return studentName;
    }
    public int getStudentID(){
        return studentId;
    }


}
class Subject{
    private String subjectName;
    private int SubjectCode;
    private int subjectMarks;

    public Subject(String subjectName, int subjectCode, int subjectMarks){
        this.subjectName = subjectName;
        this.SubjectCode = subjectCode;
        this.subjectMarks = subjectMarks;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public int getSubjectCode(){
        return SubjectCode;
    }
    public int getSubjectMarks(){
        return subjectMarks;
    }


}
class GradeCalculator{

    public String calculateScore(Student student){
        int total = 0;
        ArrayList<Subject> subjects = student.getSubjects();
        for(Subject subject : subjects){
            total += subject.getSubjectMarks();
        }

        double average = total/ subjects.size();
        if(average >= 90) return "A";
        else if(average >= 80) return "B";
        else if(average >= 70) return "C";
        else if(average >= 50) return "D";
        else return "F";
    }

}

public class SchoolResultApplication {
    public static void main(String[] args) {
        Student om = new Student("OM", 115);
        Subject maths = new Subject("Maths", 90, 95);
        Subject physics = new Subject("physics", 80, 95);
        Subject chemistry = new Subject("chemistry", 50, 85);
        om.addSubject(chemistry);
        om.addSubject(physics);
        om.addSubject(maths);
        GradeCalculator calculator = new GradeCalculator();
        System.out.println(calculator.calculateScore(om));
    }
}