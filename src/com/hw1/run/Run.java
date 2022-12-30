package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.vo.Employee;

public class Run {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setEmpNo(0);
		emp.setEmpName(null);
		emp.setDept(null);
		emp.setJob(null);
		emp.setAge(0);
		emp.setSalary(0);
		emp.setBonusPonit(0.0);
		emp.setPhone(null);
		emp.setAddress(null);
		
		Employee emp2 = new Employee();
		
		emp2.setEmpNo(1);
		emp2.setEmpName("홍길동");
		emp2.setDept(null);
		emp2.setJob(null);
		emp2.setAge(19);
		emp2.setSalary(0);
		emp2.setBonusPonit(0.0);
		emp2.setPhone(null);
		emp2.setAddress(null);
		
		
		Employee[][] arr = new Employee[3][9];
			
		
		
		System.out.println(Arrays.deepToString(arr));
		
	}
}
