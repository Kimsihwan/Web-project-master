package kr.ac.dit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.dit.domain.StudentVO;


@Controller
public class StudentController {
 @RequestMapping(value="/read", method=RequestMethod.GET)
 public void read(Model model) {
  StudentVO studentVO = new StudentVO();
  studentVO.setNo("201412360");
  studentVO.setName("My name");
  model.addAttribute(studentVO);
 }
}
	