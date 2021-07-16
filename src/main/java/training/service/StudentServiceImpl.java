package training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.dao.StudentDao;
import training.dao.StudentEntity;
import training.dto.StudentDto;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDao studentDao;
	
	public void registerStud(StudentDto studentDto) {
		
		StudentEntity studentEntity = new StudentEntity();
		BeanUtils.copyProperties(studentDto, studentEntity);
		
		studentDao.save(studentEntity);
	}


	  @Override 
	  public List<StudentDto> fetchAll() {
	  
		  List<StudentDto> studentDtoList = new ArrayList<>();
	  
		  List<StudentEntity> studentEntityList = studentDao.findAll();
	  //System.out.println(studentEntityList);
	  
		  for(StudentEntity std: studentEntityList) { 
			  StudentDto studentDto = new StudentDto(); 
			  BeanUtils.copyProperties(std, studentDto);
			  studentDtoList.add(studentDto); 
		  
	  }
	  //System.out.println(studentDtoList);
	  return studentDtoList; }
	 
	

	@Override
	public void deleteStd(int id) {
		
		studentDao.deleteById(id);
		
	}

	@Override
	public StudentDto fetchStudent(int id) {
		
		
		Optional<StudentEntity> optional = studentDao.findById(id);
		
		if(optional.isPresent()) {
			StudentEntity studentEntity = optional.get();
			StudentDto studentDto = new StudentDto();
			BeanUtils.copyProperties(studentEntity, studentDto);
			
			return studentDto;			
		}
		
		return null;
	}

	@Override
	public void updateStudent(StudentDto studentDto) {
		StudentEntity studentEntity = new StudentEntity();
		BeanUtils.copyProperties(studentDto, studentEntity);
		studentDao.save(studentEntity);
		
	}
	
	
	

}
