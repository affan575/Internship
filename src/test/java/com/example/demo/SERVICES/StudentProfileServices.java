package com.example.demo.SERVICES;
import com.example.demo.STUDENTPROFILE.StudentProfile;
import org.springframework.stereotype.Service;
import java.util.HashMap;
@Service
public class StudentProfileServices {
    HashMap<Long,StudentProfile> map =new HashMap<>();
    public void createstudentprofile(StudentProfile studentProfile){
        map.put(studentProfile.getStudentid(),studentProfile);
    }
    public void updatestudentprofile(StudentProfile studentProfile){
        map.put(studentProfile.getStudentid(),studentProfile);
    }
    public void delete(Long studentid){
        map.remove(studentid);
    }
    public StudentProfile getStudentProfileByid(Long studentid){
        return map.get(studentid);
    }
}