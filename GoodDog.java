class GoodDog{
	private int Size;
	public int getSize(){
		return Size;
	}
	public void setSize(int s){
		Size = s;
	}
	void bark(){
		if(Size>60){
			System.out.println("Woof! Woof! ");
		}else if(Size>14){
			System.out.println("Ruff! Ruff!");
		}else{
			System.out.println("Yip! Yip!");
		}
	}
}
class GoodDogTest{
	public static void main(String[] args){
		GoodDog one=new GoodDog();
		one.setSize(70);
		GoodDog two=new GoodDog();
		two.setSize(8);
		System.out.println("Dog one :" +one.getSize());
		System.out.println("Dog two : " +two.getSize());
		one.bark();
		two.bark();
	}
}