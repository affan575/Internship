package com.example.demo.Controller;
import com.example.demo.SERVICES.StudentProfileServices;
import com.example.demo.STUDENTPROFILE.StudentProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class StudentProfileController {
    private StudentProfileServices studentProfileServices;
    @Autowired
    public StudentProfileController(StudentProfileServices studentProfileServices){
        this.studentProfileServices=studentProfileServices;
    }
    @PostMapping("/studentprofile/create")
    public String create(@RequestBody StudentProfile studentProfile){
        studentProfileServices.createstudentprofile(studentProfile);
        return "Student profile is successfully stored";
    }
    @GetMapping("/studentprofile/{studentid}")
    public StudentProfile get(@PathVariable Long studentid){
        return studentProfileServices.getStudentProfileByid(studentid);
    }
    @PutMapping("/studentprofile/update")
    public String update(@RequestBody StudentProfile updatedProfile) {
        studentProfileServices.updatestudentprofile(updatedProfile);
        return "Student profile updated successfully";
    }
    @DeleteMapping("/studentprofile/delete/{studentid}")
    public String delete(@PathVariable Long studentid) {
        studentProfileServices.delete(studentid);
        return "Student profile deleted successfully";
    }
}