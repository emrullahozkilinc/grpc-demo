package com.emr.grpcdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static com.emr.grpcdemo.TrainingPOJO.*;

@RestController
@RequiredArgsConstructor
public class CourseController {

    private final MockTestData mockTestData;

    @GetMapping("/courses")
    Map<Integer,Course> getCourses(){
        return mockTestData.createTestCourses().getCourses();
    }

    @GetMapping("/courses/{id}")
    Course getCourses(@PathVariable int id){
        return mockTestData.createTestCourses().getCourses().get(id);
    }
}
