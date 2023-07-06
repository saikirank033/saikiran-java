package com.week2.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class studentcsv {


        public static void main(String[] args) {
            Scanner sc;
            ArrayList<StudentModel> studentModels = new ArrayList<>();
            StudentModel student;

            try {
                sc = new Scanner(new File("sample.csv"));
                while(sc.hasNext()) {
                    String[] line = sc.next().split(",");
                    student = new StudentModel(line[0], line[1], Float.parseFloat(line[2]));
                    studentModels.add(student);
                }
                Collections.sort(studentModels);
                for(StudentModel std: studentModels) {
                    System.out.println(std.toString());
                }
                sc.close();
            } catch (FileNotFoundException e) {

                e.printStackTrace();
            }
        }
    }


