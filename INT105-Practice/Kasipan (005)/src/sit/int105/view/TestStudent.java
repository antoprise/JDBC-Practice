package sit.int105.view;

import sit.int105.model.Student;

public class TestStudent {

    public static void main(String[] args) {
        Student stds[] = new Student[3];
        stds[0] = new Student(1, "May", 50);
        stds[1] = new Student(2, "June", 30);
        stds[2] = new Student(3, "Anan", 70);
        printStudentArray(stds);

        Student stds2[] = {new Student(4, "Kim", 69),
            new Student(5, "Daxler", 7)};
        printStudentArray(stds2);
        
        Student stds3[] = {new Student(6,"Boss",55)};
       printStudentScoreArray(stds3);

    }

    public static void printStudentArray(Student registeredStudent[]) {
        for (Student s : registeredStudent) {
            System.out.println(s);
        }
    }
    public static void printStudentScoreArray(Student stds[]){
        for (int index = 0 ; index < stds.length;index++){
            System.out.println(stds[index].getScore());
        }
        for (Student std :stds) {
            System.out.println(std.getStudentName());
        }
    }
}
