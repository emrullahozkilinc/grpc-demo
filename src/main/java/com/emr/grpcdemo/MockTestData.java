package com.emr.grpcdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.emr.grpcdemo.TrainingPOJO.*;
import static com.emr.grpcdemo.TrainingPOJO.Student.*;

@Component
public class MockTestData {

    @Bean
    public CourseRepository createTestCourses() {
        Map<Integer, Course> courses = new HashMap<>();
        Course course1 = Course.newBuilder()
                .setId(1)
                .setCourseName("REST with Spring")
                .addAllStudent(createTestStudents())
                .build();
        Course course2 = Course.newBuilder()
                .setId(2)
                .setCourseName("Learn Spring Security")
                .addAllStudent(new ArrayList<>())
                .build();
        courses.put(course1.getId(), course1);
        courses.put(course2.getId(), course2);
        return new CourseRepository(courses);
    }

    private List<Student> createTestStudents() {
        return List.of(
                Student.newBuilder()
                        .setId(1)
                        .setFirstName("John")
                        .setLastName("Doe")
                        .setEmail("john.doe@gmail.com")
                        .addPhone(createPhoneNumbers())
                        .build(),
                Student.newBuilder()
                        .setId(2)
                        .setFirstName("James")
                        .setLastName("Bond")
                        .setEmail("james.bond@mail.com")
                        .addPhone(createPhoneNumbers())
                        .build()
       );
    }

    private PhoneNumber createPhoneNumbers() {
        return PhoneNumber.newBuilder()
                .setNumber("555-55-55")
                .setTypeValue(1)
                .build();
    }
}
