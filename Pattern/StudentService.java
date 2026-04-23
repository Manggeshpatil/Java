package org.jspider.RestApiArchitecture_Demo3_database.Service;

import org.jspider.RestApiArchitecture_Demo3_database.Domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
@Service
public class StudentService {
    List<Student> studentList=new ArrayList<>();
    {
        studentList.add(new Student(1,"shubham","ele",88.00,"spring"));
        studentList.add(new Student(2,"rohan","cs",77.00,"java"));
        studentList.add(new Student(3,"pankaj","mec",68.00,"sql"));
    }

    // 2)Add new student
    public void addNewStudent(Student s){
        studentList.add(s);
    }

    // get All Student
    public List<Student> getAllStudent(){
        return  studentList;
    }

    // 3)get student by id
    public Student getStudentById(int id){
        Student student=null;
        for(Student s:studentList){
            if(s.getId()==(id)){
                student=s;
            }
        }
        return student;
    }


    // 4) get student by name      all details
    public  List<Student>getStudentByName(String name){
        List<Student> selectedStudent=new LinkedList<>();
        //search course in list and add matching course into list
        for(Student s:studentList){
            if(s.getName().equals(name)){
                selectedStudent.add(s);
            }
        }
        return selectedStudent;
    }

    // 5)get student by stream    only name
    public List<String> getStudentByStream(String Stream){
        List<String> selectedStream=new ArrayList<String>();
        for(Student s:studentList){
            if(s.getStream().equals(Stream)){
                selectedStream.add(s.getName());

            }
        }
        return selectedStream;
    }

    // 6)get student by course    all details
    public  List<Student>getStudentByCourse(String course){
        List<Student> selectedStudent=new LinkedList<>();
        //search course in list and add matching course into list
        for(Student s:studentList){
            if(s.getCourse().equals(course)){
                selectedStudent.add(s);
            }
        }
        return selectedStudent;
    }

    // update student details id
    public  void updateStudent(int id,Student c){
        for(int a=0; a<studentList.size();a++){
            Student student=studentList.get(a);
            if(student.getId()==id){
                studentList.set(a,c);
            }
        }
    }

    // delete student by id

    public void deleteStudenBytId(int id){
        Iterator<Student> itr=studentList.iterator();
        while ((itr.hasNext())){
            if(itr.next().getId()==id){
                itr.remove();
            }
        }
    }

    //delete student by course
    public void deleteStudentByCourse(String course){
        Iterator<Student> itr=studentList.iterator();
        if(itr.next().getCourse().equals(course)){
            itr.remove();
        }
    }
}
