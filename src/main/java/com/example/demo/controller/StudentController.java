package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
  @Autowired
  StudentService sser;
  @PostMapping("addtostudent")
	public StudentEntity add(@RequestBody StudentEntity ss)
	{
		return sser.saveinfo(ss);
	}
	@GetMapping("showthedetails")
	public List<StudentEntity> show()
	{
		return sser.showinfo();
	}
	@PutMapping("updated")
	public StudentEntity modify(@RequestBody StudentEntity ss)
	{
		return sser.changeinfo(ss);
	}
	@DeleteMapping("deletedetailss")
	public String del(@RequestBody StudentEntity ss)
	{
		 sser.delete(ss);
		 return "Deleted Successfully";
	}
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id)
	{
		sser.deleteid(id);
	}
    @GetMapping("get/{id}")
    public Optional<StudentEntity> showid(@PathVariable int id)
    {
    	return sser.getbyid(id);
    }  
}
