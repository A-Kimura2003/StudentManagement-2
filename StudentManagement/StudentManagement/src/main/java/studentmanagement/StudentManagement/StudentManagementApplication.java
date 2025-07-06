package studentmanagement.StudentManagement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import studentmanagement.StudentManagement.data.Student;
import studentmanagement.StudentManagement.data.Students_Courses;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

//	@GetMapping("/studentList")
//
//	public List<Student> getStudentList() {
//		return repository.search();
//	}
//
//	@GetMapping("/students_coursesList")
//
//	public List<Students_Courses> getStudents_CoursesList(){
//	//	return coursesRepository.search();
//		return repository.searchStudentCourses();
//	}
}
//
