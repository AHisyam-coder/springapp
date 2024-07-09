package com.hisyam.springboot.demo.mycoolapp;

import com.hisyam.springboot.demo.mycoolapp.dao.StudentDAO;
import com.hisyam.springboot.demo.mycoolapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

//@SpringBootApplication(
//		scanBasePackages = {"com.hisyam.util","com.hisyam.springboot.demo.mycoolapp"}
//)
@SpringBootApplication
public class MycoolappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycoolappApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//            createStudent(studentDAO);
//            createMultipleStudents(studentDAO);
//            readStudent(studentDAO);
//            queryForStudents(studentDAO);
//            queryForStudentsByLastName(studentDAO);
//            updateStudent(studentDAO);
//            deleteStudent(studentDAO);
//            deleteAllStudents(studentDAO);
        };
    }

    private void deleteAllStudents(StudentDAO studentDAO) {
        System.out.println("Delete all stds");

        int numRowsDeleted = studentDAO.deleteAll();

        System.out.println("deleted row" + numRowsDeleted);
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int id = 3;
        studentDAO.delete(id);
    }

    private void updateStudent(StudentDAO studentDAO) {
        //retrieve std base on id
        int studentId = 1;
        Student myStudent = studentDAO.findById(studentId);

        //change first name
        myStudent.setFirstName("John");

        //update std
        studentDAO.update(myStudent);

        //display
        System.out.println("updated std " + myStudent);
    }

    private void queryForStudentsByLastName(StudentDAO studentDAO) {
        //get list of stds
        List<Student> theStudents = studentDAO.findByLastName("asd");
        //display list
        for (Student tempStudent : theStudents) {
            System.out.println(tempStudent);
        }
    }

    private void queryForStudents(StudentDAO studentDAO) {
        //get list of stds
        List<Student> theStudents = studentDAO.findAll();

        //display list
        for (Student tempStudent : theStudents) {
            System.out.println(tempStudent);
        }
    }

    private void readStudent(StudentDAO studentDAO) {
        //create std obj
        Student tempStudent = new Student("faga", "hah", "zxc@test.com");

        //save
        studentDAO.save(tempStudent);

        //display id
        int theId = tempStudent.getId();
        System.out.println("std id " + theId);

        //retrieve std based on id
        Student myStudent = studentDAO.findById(theId);

        //display std
        System.out.println("std data " + myStudent);
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        //create student object
        Student tempStudent1 = new Student("faga", "hah", "zxc@test.com");
        Student tempStudent2 = new Student("asd", "asd", "ha@test.com");
        Student tempStudent3 = new Student("faf", "dzxcoe", "gag@test.com");

        //save student obj
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);
    }

    private void createStudent(StudentDAO studentDAO) {
        //create student object
        Student tempStudent = new Student("paul", "doe", "sye@test.com");

        //save student obj
        studentDAO.save(tempStudent);

        //display id of the
        System.out.println("id std " + tempStudent.getId());
    }
}
