package lv.tsi.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class StudentController {
    StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    @GetMapping("/getStudents")
    ResponseEntity<Iterable<Student>> findStudents(){
        return ResponseEntity.ok(studentRepository.findAll());
    }


    @GetMapping("/getStudent")
    ResponseEntity<Optional<Student>> findStudent(@RequestParam(value = "id") Long id){
        return ResponseEntity.ok(studentRepository.findById(id));
    }
}