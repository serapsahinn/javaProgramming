package chapter10;

public class Course
{
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[5]; // ilk kapasite 5 olsun
        numberOfStudents = 0;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            // kapasite dolduysa, 2 katına çıkar
            String[] temp = new String[students.length * 2];
            for (int i = 0; i < students.length; i++) {
                temp[i] = students[i];
            }
            students = temp;
        }
        students[numberOfStudents++] = student;
    }

    public String[] getStudents() {
        String[] activeStudents = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            activeStudents[i] = students[i];
        }
        return activeStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // Öğrenciyi sil, sağdakileri sola kaydır
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
        }
    }

    public void clear() {
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
    }
}
