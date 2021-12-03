// 수업중에 이해가 안된 부분이 있어서 AnimalTest를 두개의 파일로 분리했다. 
// 평소처럼 두개나 세개의 파일로 분리를 안하고 수업을 진행했을까 하는 의문점과 
// 평소처럼 안하니 좀 생소한 느낌으로 강의를 들었다. 그래서 두개의 파일로 분리해서 실행하고 싶었다. 그리고....
// 1. 왜 public을 안 쓰지? public을 써야 접근 가능한거 아닌가?
// 2. 왜 AnimalTest 자체를 불러다가 쓰지?(AnimalTest aTest = new AnimalTest())
// 역시 클래스에 대한 개념이 아직 확실히 정리되지 않아서인지 4시간 정도 헤메다가 걍 때려치고 잤다.  
// 새벽에 일어나 다시 찬찬히 보니 괄호를 잘못 쓴걸 발견했다. 고치니 잘 작동한다.......
// 나이가 들어서 머리가 나빠진게 맞을 것이다....
class AnimalWorld {	// public을 안 써도 이 클래스에 접근 가능하다. 차이점이 뭔지 모르겠다.
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

// 클래스 명을 Human이라고 정했더니 이미 있다고 에러를 낸다. 그래서 Humans로 정했다. 아마 AnimalTest에 있는 클래스이름을 인식하나 보다.
class Humans extends AnimalWorld {	// 습관적으로 맨 앞에 public을 적었더니 에러가 났다. public을 가질 수 있는 클래스는 파일이름과 같은 클래스밖에 없다고 한다.
	public void move() { // 오버라이딩 된 메소드
		System.out.println("사람이 독수리를 먹고 있습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽는다고?");
		
	}
	public void move2() {
		System.out.println("사람이 타이거도 먹고 싶어 합니다.");
	}
	public void heist() {
		System.out.println("너무 처 드시면 안됩니다.");
	}
}

//클래스 명을 Tiger라고 정했더니 이미 있다고 에러를 낸다. 그래서 Tigers로 정했다.
class Tigers extends AnimalWorld {
	public Tigers() {
		
	}
	public void move() {
		System.out.println("타이거가 사람을 먹고 있습니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다.");
	}
}

// 클래스 명을 Eagle이라고 정했더니 이미 있다고 에러를 낸다. 그래서 Eagles로 정했다. 맨날 꼴찌만 하는 놈들이 생각나서 기분이 나빠졌다.
class  Eagles extends AnimalWorld {
	public void move() {
		System.out.println("이글이 타이거를 먹고 있습니다.");
	}
	public void flying() {
		System.out.println("독수리 날다.!");
	}
}

