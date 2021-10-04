package memo;

import java.util.*;

public class MemoTest {
	public static void main(String[] arsg) {
		MemoDAO dao = new MemoDAO();
		
//		create(dao);
		read(dao);
//		update(dao);
//		list(dao);
//		delete(dao);
	}
	
	private static void list(MemoDAO dao) {
		// TODO Auto-generated method stub
		List<MemoDTO> list = new ArrayList<MemoDTO>();
		Map map = new HashMap();
		list = dao.list(map);
		for(int i = 0; i < list.size(); i++) {
			MemoDTO dto = new MemoDTO();
			dto = list.get(i);
			System.out.println(dto.toString());
		}
	}

	private static void delete(MemoDAO dao) {
		// TODO Auto-generated method stub
		boolean flag = dao.delete(4);
		if(flag) {
			p("삭제 성공");
		} else {
			p("삭제 실패");
		}
	}

	private static void update(MemoDAO dao) {
		// TODO Auto-generated method stub
		MemoDTO dto = new MemoDTO();
		dto.setWname("dd");
		dto.setTitle("ddd");
		dto.setContent("dddddd");
		dto.setMemono(4);
		boolean i = dao.update(dto);
		if(i) {
			p("성공");
		} else {
			p("실패");
		}
	}

	private static void read(MemoDAO dao) {
		// TODO Auto-generated method stub
		MemoDTO dto = new MemoDTO();
		dto = dao.read(2);
		if(dto != null) {
			p(dto);
		} else {
			p("값을 읽어오지 못했습니다.");
		}
	}

	private static void create(MemoDAO dao) {
		MemoDTO dto = new MemoDTO();
		dto.setWname("ddd");
		dto.setTitle("ddddddddddddd");
		dto.setContent("dddddddddddddddddddddddddddddd");
		dto.setPasswd("1234");
		dto.setWdate("2021-09-30");
		if(dao.create(dto)) {
			p("성공");
		} else {
			p("실패");
		}
	}
	
	private static void p(MemoDTO dto) {
		p("번호 : " + dto.getMemono());
		p("이름 : " + dto.getWname());
		p("제목 : " + dto.getTitle());
		p("내용 : " + dto.getContent());
	}
	private static void p(String str) {
		System.out.println(str);
	}
}
