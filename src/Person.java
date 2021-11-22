
public class Person {
	String name;
	int height;
	int weight;
	
	// 생성자가 한 개도 없을 경우 디폴트 생성자가 존재함.
	
	//생성자 작성 규칙
	//클래스명과 동일
	//반환타입이 없음(문법 없음)
	//명시적으로 디폴트 생성자 필요
	public Person() {
		
	}
	
	//오버로딩 된 생성자
	public Person(String pname) { //생성자 이름이 동일, 매개변수 다름.(갯수, 타입, 순서 등이 다름)
		name = pname;
	}
	// 오버로딩 된 생성자
	public Person(String pname,  int pheight, int pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
	//메서드
	public String getName() {
		return name;
	}
	
	//키와 몸무게를 각각 추출할 수 있는 메서드 추가
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void getHuman() {
		System.out.println("이름:" + name + "\n" +  "키:" + height + "\n" + "체중:" + weight);
	}
	
	//성명, 키, 몸무게 변경할 수 있는 메서드 추가
	public void setName(String pname) {
		name = pname;
	}
	
	public void setWeight(int pweight) {
		weight = pweight;
	}
	
	public void setHeight(int pheight) {
		height = pheight;
	}
	
	//성명, 키, 몸무게 한번에 변경할 수 있는 메서드 추가
	public void setHuman(String pname, int pheight, int pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
}
