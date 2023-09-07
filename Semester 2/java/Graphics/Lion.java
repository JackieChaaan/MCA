package animals;
public class Lion implements Animal{
	public void eat(){
		System.out.println("Lion eat meals");
	}
	public void color(){
		System.out.println("Color of Lion is Orenge");
	}
	public static void main(String args[]){
		Lion l=new Lion();
		l.eat();
		l.color();
	}
}