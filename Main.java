import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// ��Ӱ� ������
		// ��� : �����޾Ƽ� 'Ȯ��(extends)'��Ų��
		//		ȭ��ǥ�� �����Ϸ� �������̹Ƿ� �ݴ�� ǥ�õ�
		
		// �߻�Ŭ�����̹Ƿ� ��ü ���� �Ұ�
//		PbkJjajang pbkJjajang = new PbkJjajang();
//		pbkJjajang.makeJjajang();
		
		PtkJjajang ptkJjajang = new PtkJjajang();
		PjeJjajang pjeJjajang = new PjeJjajang();
		PwjJjajang pwjJjajang = new PwjJjajang();
		PmsJjajang pmsJjajang = new PmsJjajang();
		
		// �ڷ��� ��ȯ ( ��� �޾ұ� ������ ���� )
		// => ��ĳ���� ( �θ�Ÿ������ ����ȯ + Ȯ��� ������ �״�� )
		PbkJjajang p1 = ptkJjajang;
		PbkJjajang p2 = pjeJjajang;
		PbkJjajang p3 = pwjJjajang;
		PbkJjajang p4 = pmsJjajang;
		// PbkJjajang p5 = cjiJjajang; // ����� �ȵǾ ��ȯ �Ұ�
		
		// ���׷��̵� �� �ڽ��� �޼ҵ� ���
		p1.makeJjajang();
		// p1.makeBingsu(); // �θ�Ŭ������ ��� ���Ұ�
		
		// �ٽ� �������·� ���ư� ( �θ𿡰� ���°��� ����ϱ� ���� )
		// �ٿ�ĳ����
		PtkJjajang newPtkJjajang = (PtkJjajang)p1;
		newPtkJjajang.makeBingsu();
		newPtkJjajang.makeJjajang();
		
		
		// ������� ���� �ϳ��� ���� �� ����
		ArrayList<PbkJjajang> list = new ArrayList<PbkJjajang>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		
	}

}
