package kr.ac.dit.persistence;
import java.util.List;

import kr.ac.dit.domain.BoardVO;
import kr.ac.dit.domain.LogonDTO;
import kr.ac.dit.domain.MemberVO;
public interface MemberDAO {
	  public void insert(MemberVO memberVO) throws Exception;
	  public MemberVO select(LogonDTO logonDTO) throws Exception;
}
