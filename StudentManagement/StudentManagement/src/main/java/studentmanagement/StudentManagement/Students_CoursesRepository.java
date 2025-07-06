package studentmanagement.StudentManagement;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import studentmanagement.StudentManagement.data.Students_Courses;

/*
受講生情報を取り扱うリポジトリ

全体検索や単一条件で検索　コース情報の検索が行える
 */

@Mapper
public interface Students_CoursesRepository {

 // @Select("SELECT * FROM students_courses")
  //List<Students_Courses> search();

}
