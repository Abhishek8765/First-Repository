public class Mix4a{
	int Counter=0;
	public static void main(String[] args){
		int Count = 0;
		Mix4[] m4a = new Mix4[20];
		int x=0;
		while(x<20){
			m4a[x] = new Mix4();
			m4a[x].Counter = m4a[x].Counter+1;
			Count=Count+1;
			Count = Count+m4a[x].maybeNew(x);
			x=x+1;
		}
		System.out.println(Count + " "+ m4a[1].Counter);
	}
	public int maybeNew(int index){
		if(index<5){
			Mix4 m4=new Mix4();
			m4.Counter=m4.Counter+1;
			return 1;
		}
		return 0;
	}
}