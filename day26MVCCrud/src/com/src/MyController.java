package com.src;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@Autowired
	StudentDAO sdao;
	@RequestMapping("/")
	public String facePage()
	{
		return "index";
	}
	
	@RequestMapping("/register")
	public String registeringStudent(@RequestParam("sid")String sid,
			@RequestParam("sname")String sname,@RequestParam("sadd")String sadd,Model m)
	{
		Student s=new Student();		
		s.setSid(Integer.parseInt(sid));
		s.setSname(sname);
		s.setSadd(sadd);
		sdao.saveStudent(s);
		
		List<Student> l=sdao.getAllStudents();
		m.addAttribute("li",l);
		
		return "display";
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("sid")String sid, Model m)
	{
		
		Student s=new Student();
		s.setSid(Integer.parseInt(sid));
		
		sdao.deleteStudent(s);
		
		List<Student> l=sdao.getAllStudents();
		m.addAttribute("li",l);
		
		return "display";
	}

}
