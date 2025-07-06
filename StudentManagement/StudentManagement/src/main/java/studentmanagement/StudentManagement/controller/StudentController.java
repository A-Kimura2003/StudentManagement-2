package studentmanagement.StudentManagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import studentmanagement.StudentManagement.data.Student;
import studentmanagement.StudentManagement.data.Students_Courses;
import studentmanagement.StudentManagement.service.StudentService;

@RestController
public class StudentController {

//  private StudentService service;

  private final StudentService service;


  @Autowired
  public StudentController(StudentService service){
    this.service = service;
  }

  @GetMapping("/studentList")
  public List<Student> getStudentlist(){
    return service.searchStudentList();
  }

  @GetMapping("/studentsCourseList")
  public List<Students_Courses> getStudents_CourseList(){
    return service.searchStudentsCoursesList();
  }



  @GetMapping("/studentsCourse")
  public List<Students_Courses> getStudentsCourse(@RequestParam int id) {
    return service.getStudentsCoursesById(id);
  }
}
