package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo sr;
	 
	
	public StudentEntity saveinfo(StudentEntity ss)
	{
		return sr.save(ss);
	}
	public List<StudentEntity> showinfo()
	{
		return sr.findAll();
	}
    public StudentEntity changeinfo(StudentEntity ss)
    {
    	return sr.saveAndFlush(ss);
    }
    public void delete(StudentEntity ss)
    {
    	sr.delete(ss);
    }
    public void deleteid(int id)
    {
    	sr.deleteById(id);
    }
    public Optional<StudentEntity> getbyid(int id)
    {
    	return sr.findById(id);
    }
}
