package training.service;

import java.util.List;

import training.dto.StudentDto;

public interface StudentService {
	
	void registerStud(StudentDto studentDto);

	List<StudentDto> fetchAll();

	void deleteStd(int id);

	StudentDto fetchStudent(int id);

	void updateStudent(StudentDto studentDto);

}
