package com.emr.grpcdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

import static com.emr.grpcdemo.TrainingPOJO.*;

@Getter
@AllArgsConstructor
public class CourseRepository {
    Map<Integer, Course> courses;
}
