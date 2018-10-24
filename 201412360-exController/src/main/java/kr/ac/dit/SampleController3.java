package kr.ac.dit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.dit.domain.StudentVO;

@Controller
public class SampleController3 {
	@RequestMapping("/urlD")
	public String urlD(Model model) {
		StudentVO studentVO = new StudentVO(); //객체 생성은 JSP 페이지가 아니라 여기 컨트롤러에서 한다
		studentVO.setNo("201412360");
		studentVO.setName("My Name");
		model.addAttribute(studentVO);
		return "read";
	}
	
}
