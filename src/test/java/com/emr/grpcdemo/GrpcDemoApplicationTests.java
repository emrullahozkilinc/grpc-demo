package com.emr.grpcdemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static com.emr.grpcdemo.TrainingPOJO.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = GrpcDemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GrpcDemoApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    private static final String COURSE1_URL = "http://localhost:8080/courses/1";

    @Test
    public void whenUsingRestTemplate_thenSucceed() {
        ResponseEntity<Course> course = restTemplate.getForEntity(COURSE1_URL, Course.class);
        assertResponse(course.toString());
    }

    private void assertResponse(String response) {
        assertThat(response, containsString("id"));
        assertThat(response, containsString("course_name"));
        assertThat(response, containsString("REST with Spring"));
        assertThat(response, containsString("student"));
        assertThat(response, containsString("first_name"));
        assertThat(response, containsString("last_name"));
        assertThat(response, containsString("email"));
        assertThat(response, containsString("john.doe@gmail.com"));
        assertThat(response, containsString("james.bond@mail.com"));
        assertThat(response, containsString("phone"));
        assertThat(response, containsString("number"));
        assertThat(response, containsString("type"));
    }

}
