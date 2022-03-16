package tutoiral1;

public class Main implements dog,cat {

	public static void main(String[] args) {
		Main main = new Main();
		main.crying();
		main.one();
		main.two();

	}

	@Override
	public void crying() {
		System.out.println("¿ù!¿ù!");
		
	}

	@Override
	public void two() {
		System.out.println("two!");
		
	}

	@Override
	public void one() {
		System.out.println("one!");
		
	}

	
}
