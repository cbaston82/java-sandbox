package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.Person;
import com.carlosbaston.javasandbox.common.Student;
import com.carlosbaston.javasandbox.common.TestData;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Using Function >>> functional interface that returns back the function result
 */
public class FunctionDemo1 {

    public static void main(String[] args) {

        // Return back length
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("Carlos"));

        // Return back square root
        Function<Integer, Integer> f2 = i -> i * i;
        System.out.println(f2.apply(5));

        // Return input string without spaces
        Function<String, String> f3 = s -> s.replaceAll(" ", "");
        System.out.println(f3.apply("James Johnson was here"));

        // Get a count of all the spaces in a string
        Function<String, Integer> f4 = s -> s.length() - s.replaceAll(" ",
                "").length();
        System.out.println(f4.apply("James Johnson was here"));

        // get marks
        Function<Student, String> f5 = student -> {
            int marks = student.getMarks();
            if (marks >= 80) {
                return "A[First Class]";
            } else if (marks >= 60) {
                return "B[Second Class]";
            } else if(marks >= 50) {
                return "C[Third Class]";
            } else if (marks >= 35) {
                return "D[Fourth Class]";
            } else {
                return "E[Failed]";
            }
        };

        for (Student student: TestData.getArrayListOfStudents()) {
            System.out.println(f5.apply(student));
        }

        Function<String, String> f6 = s -> s.toUpperCase();
        Function<String, String> f7 = s -> s.substring(0,9);

        System.out.println(f6.apply("CarlosBaston82"));
        System.out.println(f7.apply("CarlosBaston82"));

        // use 2 functions together
        System.out.println(f6.andThen(f7).apply("CarlosBaston82"));

    }
}
