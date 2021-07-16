package training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import training.dto.StudentDto;
import training.service.StudentService;

@Controller
public class StudentController {
	

	@Autowired
	StudentService studentService;
	
	@GetMapping("displayRegister")
	String displayForm(){
		
		return "registration";
	}
	
	
	@PostMapping("register") 
	String registerStudent(@ModelAttribute StudentDto studentDto){
		studentService.registerStud(studentDto);
		
		return "registration";
	}
	
	
	  @GetMapping("displayRecord") 
	  
	  String displayAllRecord(Model model) {
	  
	  List<StudentDto> listOfStudentDto = studentService.fetchAll();
	  
	  model.addAttribute("listOfStudentDto", listOfStudentDto);
	  
	  return "showRecord"; }
	 
	
	@GetMapping("deleteRecord")
	String deleteStudent(@RequestParam int id, Model model) {
		
		studentService.deleteStd(id);
		
		// for dispaling the records...
		/*
		 * List<StudentEntity> listOfStudentEntity = studentService.fetchAll();
		 * 
		 * model.addAttribute("listOfStudentEntity", listOfStudentEntity);
		 * 
		 * return "showRecord";
		 */
		return "redirect:displayRecord";
		
	}
	
	
	@GetMapping("updateForm")
	String updateStudent(@RequestParam int id, Model model) {
		
		StudentDto studentDto = studentService.fetchStudent(id);
		
		System.out.println(studentDto);
		
		model.addAttribute("studentDto", studentDto);
		
		return "update";
		
	}
	
	
	
	@PostMapping("update")
	String updateStudent(@ModelAttribute StudentDto studentDto) {
		studentService.updateStudent(studentDto);
		
		return "redirect:displayRecord";
	}
	
	
	

}
