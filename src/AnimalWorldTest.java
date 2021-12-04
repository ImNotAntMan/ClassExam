// 진입점을 만들기 위해 AnimalWorldTest라는 파일을 만들었다.
// 이 파일의 내용 전체를 AnimalWorld.java에 넣어도 작동한다.
public class AnimalWorldTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalWorldTest a = new AnimalWorldTest();	// 왜 a라는 것을 생성했을까?
		AnimalWorld ani1 = new Humans(); // 상속을 받자!!!
		AnimalWorld ani2 = new Tigers();
		AnimalWorld ani3 = new Eagles();
		
		ani1.move();	// 오버라이딩 된 메소드 호출
		ani2.move();
		ani3.move();
		a.moveAnimal(new Humans());	// 이건 무슨 의미일까? AnimalWorldTest에서 moveAnimal() 메소드를 호출하기 위해
		a.moveAnimal(new Tigers());	// 단순히 a를 만든건가? 그러면 a를 만들지 않고 moveAnimal() 메소드를 실행
		a.moveAnimal(new Eagles());	// 할 수 있는 방법은 무엇인가?
//		moveAnimal(new Human());	// 실행 안된다....결론은 moveAnimal() 메소드를 실행하기 위해 a라는 클래스를 생성시킨거다....
	}	// 결론은 어떤 클래스 안에 있는 메소드를 실행하기 위해서는 그 클래스를 생성 시켜야 한다는 당연한 결론에 도달한다.
// 인간적으로 머리가 나쁘다는게 증명됐다. 당연한 걸 궁금해 하다니...		
	public void moveAnimal(AnimalWorld abc) {
			abc.move(); // 다형성은 편리한 것 같다. 메소드 이름은 같은데 소속된 클래스에 따라서 다른 결과 값을 준다.
	}
}
