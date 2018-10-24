package kr.ac.dit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller //해당 클래스가 Controller임을 나타내기 위한 어노테이션
public class SampleController2 {
	@RequestMapping("urlB") //@RequestMapping을 이용한 경로 지정
	 public String urlBGet() {
	  return "view"; 
	 }
	 @RequestMapping("urlC")
	 public String urlCGet(@ModelAttribute("msg") String msg) {
	  return "view";
	 }
}
