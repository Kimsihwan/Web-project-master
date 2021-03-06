package kr.ac.dit.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.ac.dit.domain.BoardVO;
import kr.ac.dit.domain.UploadFileVO;
import kr.ac.dit.persistence.BoardDAO;
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;
	@Override
	public List<BoardVO> listArticle() throws Exception {
		return boardDAO.selectList();
	}
	@Override
	public void createArticle(BoardVO boardVO) throws Exception {
		boardDAO.insert(boardVO);
	}
	@Override
	public BoardVO readArticle(int no) throws Exception {
		return boardDAO.select(no);
	}
	@Override
	public void updateArticle(BoardVO boardVO) throws Exception {
		boardDAO.update(boardVO);
	}
	@Override
	public void deleteArticle(int no) throws Exception {
		boardDAO.delete(no);
	}	 
	@Override
	public void uploadFile(UploadFileVO uploadFileVO) {
		uploadFileVO.setFileId(boardDAO.selectMaxFileId()+1);
		boardDAO.insertFile(uploadFileVO);
	}
	@Override
	public List<UploadFileVO> readAttachFile(int no) {
		return boardDAO.selectAttachFile(no);
		}
	@Override
	public UploadFileVO downloadFile(int fileId) {
	return boardDAO.selectDownloadFile(fileId);
	}
}
