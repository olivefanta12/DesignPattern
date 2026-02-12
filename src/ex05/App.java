package ex05;

import ex05.teacher.HtmlTeacher;
import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;
import ex05.teacher.Teacher;

public class App {
    public static void main(String[] args) {
        Teacher teacher = new JavaTeacher();
//        Teacher teacher = new PythonTeacher();
//        Teacher teacher = new HtmlTeacher();

        teacher.수업하기();

    }
}
