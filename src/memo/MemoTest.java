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
			p("���� ����");
		} else {
			p("���� ����");
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
			p("����");
		} else {
			p("����");
		}
	}

	private static void read(MemoDAO dao) {
		// TODO Auto-generated method stub
		MemoDTO dto = new MemoDTO();
		dto = dao.read(2);
		if(dto != null) {
			p(dto);
		} else {
			p("���� �о���� ���߽��ϴ�.");
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
			p("����");
		} else {
			p("����");
		}
	}
	
	private static void p(MemoDTO dto) {
		p("��ȣ : " + dto.getMemono());
		p("�̸� : " + dto.getWname());
		p("���� : " + dto.getTitle());
		p("���� : " + dto.getContent());
	}
	private static void p(String str) {
		System.out.println(str);
	}
}
