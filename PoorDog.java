class PoorDog{
	private int Size;
	private String name;
	public int getSize(){
		return Size;
	}
	public String getName(){
		return name;
	}
}
class PoorDogTest{
	public static void main(String[] args){
		PoorDog one=new PoorDog();
		System.out.println("Dog size is " + one.getSize());
		System.out.println("Dog name is "+ one.getName());
	}
}