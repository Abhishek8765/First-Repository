class Puzzled4{
	public static void main(String[] args){
		Puzzled4b[] obs = new Puzzled4b[6];
		int y = 1;
		int x = 0;
		int result = 0;
		while(x<6){
			obs[x]=new Puzzled4b();
			obs[x].invar = y;
			y=y*10;
			x=x+1;
		}
		x=6;
		while(x>0){
			x=x-1;
			result=result + obs[x].doStuff(x);
		}
		System.out.println("result "+ result);
	}
}
class Puzzled4b{
	int invar;
	public int doStuff(int factor){
		if(invar>100){
			return invar*factor;
		}else{
			return invar*(5-factor);
		}
	}
}