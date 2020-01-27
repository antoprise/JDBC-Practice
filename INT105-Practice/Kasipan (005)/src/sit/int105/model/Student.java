
package sit.int105.model;


public class Student {
    private long studentId;
    private String studentName;
   private static int autoId =0 ;
    

    public Student() {
       studentId = 600+autoId++;
    }

    public Student(String studentName) {
        this.studentId = autoId++;
        this.studentName = studentName;
    }

    public long getStudentId() {
        
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + '}';
    }
    public static int getAutoId(){
        return (int) autoId;
    }
    public int studentEntranceYear(){
        String str = studentId+"";
       
        return Integer.parseInt(str.substring(0,3));
    }
}
