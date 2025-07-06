package studentmanagement.StudentManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentmanagement.StudentManagement.StudentRepository;
import studentmanagement.StudentManagement.Students_CoursesRepository;
import studentmanagement.StudentManagement.data.Student;
import studentmanagement.StudentManagement.data.Students_Courses;

@Service
public class StudentService {

  private final StudentRepository repository;
  private final Students_CoursesRepository coursesRepository;

  @Autowired
  public StudentService(StudentRepository repository,Students_CoursesRepository coursesRepository) {
    this.repository = repository;
    this.coursesRepository = coursesRepository;
  }


  public List<Student> searchStudentList(){
    //検索処理
    List<Student> allStudents = repository.search();

    //絞り込みをする。年齢が３０代の人のみを抽出する。
    //抽出したリストをコントローラーにかえす。
    return allStudents.stream()
        .filter(student -> student.getAge() >= 30 && student.getAge() <= 39)
        .toList();

  }


  public  List<Students_Courses> searchStudentsCoursesList(){
    //絞り込み検索で「」のコースのみ抽出する。
    //抽出したリストをコントローラーにかえす。
    return repository.searchStudentCourses();

  }


  public List<Students_Courses> getStudentsCoursesById(int id) {
    return coursesRepository.findById(id);
  }
}
