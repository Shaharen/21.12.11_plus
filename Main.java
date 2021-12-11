import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// 상속과 다형성
		// 상속 : 물려받아서 '확장(extends)'시킨다
		//		화살표는 컴파일러 입장이이므로 반대로 표시됨
		
		// 추상클래스이므로 객체 생성 불가
//		PbkJjajang pbkJjajang = new PbkJjajang();
//		pbkJjajang.makeJjajang();
		
		PtkJjajang ptkJjajang = new PtkJjajang();
		PjeJjajang pjeJjajang = new PjeJjajang();
		PwjJjajang pwjJjajang = new PwjJjajang();
		PmsJjajang pmsJjajang = new PmsJjajang();
		
		// 자료형 변환 ( 상속 받았기 때문에 가능 )
		// => 업캐스팅 ( 부모타입으로 형변환 + 확장된 개념을 그대로 )
		PbkJjajang p1 = ptkJjajang;
		PbkJjajang p2 = pjeJjajang;
		PbkJjajang p3 = pwjJjajang;
		PbkJjajang p4 = pmsJjajang;
		// PbkJjajang p5 = cjiJjajang; // 상속이 안되어서 변환 불가
		
		// 업그레이드 된 자식의 메소드 사용
		p1.makeJjajang();
		// p1.makeBingsu(); // 부모클래스에 없어서 사용불가
		
		// 다시 원래형태로 돌아감 ( 부모에게 없는것을 사용하기 위해 )
		// 다운캐스팅
		PtkJjajang newPtkJjajang = (PtkJjajang)p1;
		newPtkJjajang.makeBingsu();
		newPtkJjajang.makeJjajang();
		
		
		// 상속으로 인해 하나로 묶을 수 있음
		ArrayList<PbkJjajang> list = new ArrayList<PbkJjajang>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		
	}

}
