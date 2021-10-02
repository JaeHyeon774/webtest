package bbs;

public class BbsTest {

	public static void main(String[] args) {
		BbsDAO dao = new BbsDAO();
		
		create(dao);
		read(dao);

	}

	private static void read(BbsDAO dao) {
		// TODO Auto-generated method stub
		
	}

	private static void create(BbsDAO dao) {
		BbsDTO dto = new BbsDTO();
		dto.setWname("�솉湲몃룞");
		dto.setTitle("�젣紐�");
		dto.setContent("�궡�슜");
		dto.setPasswd("1234");
		if(dao.create(dto )) {
			p("�꽦怨�");
		}else {
			p("�떎�뙣");
		}
		
	}

	private static void p(String string) {
		System.out.println(string);
		
	}

}
