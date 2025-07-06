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

  private StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }


  public List<Student> searchStudentList(){
    //検索処理
    repository.search();

    //絞り込みをする。年齢が３０代の人のみを抽出する。
    //抽出したリストをコントローラーにかえす。


    return repository.search();
  }


  public  List<Students_Courses> searchStudentsCoursesList(){
    //絞り込み検索で「」のコースのみ抽出する。
    //抽出したリストをコントローラーにかえす。
    return repository.searchStudentCourses();

  }
}
