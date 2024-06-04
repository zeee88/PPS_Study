package com.pps.officeLayout.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/office")
@RequiredArgsConstructor
public class Controller_officeLayout {

	// 사원 리스트 조회하기
	@GetMapping("/list")
	public List<EmployeeBody> getEmployeeList() {
		List<EmployeeBody> list = new ArrayList<>();

		for(int i = 1; i <= 20; i++){
			String empNo = String.valueOf(i);
			String empName = "사원" + i;
			String position = "연구원"; 
			String department = "기술연구소";
			String tel = "000";
			int seatId = i;
			EmployeeBody employeeBody = new EmployeeBody(empNo, empName, position, department, tel, seatId);
			list.add(employeeBody);
		}

		return list;
	}
	
	// 사원 자리 배치 조회하기
	@GetMapping("/seat")
	public String getSeat(){
		return "";
		
	}
}
