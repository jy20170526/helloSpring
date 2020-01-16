package com.company.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//http://localhost:8080/first/employee-module/getAllEmployees
//command shift o --> 필요한거 import

@Controller
@RequestMapping("/employee-module")
public class EmployeeController 
{
    @Autowired
    EmployeeManager manager;
 
    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public String getAllEmployees(Model model)
    {
        model.addAttribute("employees", manager.getAllEmployees());
        return "employeesListDisplay";
    }
}