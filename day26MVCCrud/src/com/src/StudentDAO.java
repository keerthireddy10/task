package com.src;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDAO {
	
	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}	
	
	public int saveStudent(Student s)
	{
		String sql="insert into student values("+s.getSid()+",'"+s.getSname()+"','"+s.getSadd()+"')";
		return jdbctemplate.update(sql);		
	}
	
	public int deleteStudent(Student s)
	{
		String sql="delete from student where sid="+s.getSid();
		return jdbctemplate.update(sql);		
	}
	
	public List<Student> getAllStudents(){
		
	String sql="select * from student";
	return jdbctemplate.query(sql, new RowMapper<Student>() {

		@Override
		public Student mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			
			Student s1=new Student();
			s1.setSid(rs.getInt(1));
			s1.setSname(rs.getString(2));
			s1.setSadd(rs.getString(3));
			
			return s1;
		}
		
		
	});
	}

}
