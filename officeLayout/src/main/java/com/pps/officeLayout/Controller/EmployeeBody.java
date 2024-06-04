package com.pps.officeLayout.Controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
// @AllArgsConstructor
@RequiredArgsConstructor
public class EmployeeBody {
    private final String empNo;
    private final String empName;
    private final String position;
    private final String department;
    private final String tel;
    private final int seatId;
}
