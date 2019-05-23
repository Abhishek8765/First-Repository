public class PhraseOMatic{
	public static void main(String[]args){
		String[] ListOne={"24/7","multi-Tier","3,000 foot","B-to-B","win-win","Front-end","web-bassed","pervasive","smart","six-sigma",
		"critical-path","dynamic"};
		String[] ListTwo={"empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","out side-the-box","positioned","networks",
		"focused","shared","Coooperative","accelerated"};
		String[] ListThree={"process","tipping-point","solution","architecture","core compentency","strategy","mindshare","portal",
		"space","vision","paradigm","mission"};
		int Length1=ListOne.length;
		int Length2=ListTwo.length;
		int Length3=ListThree.length;
		int rand1=(int)(Math.random()*Length1);
		int rand2=(int)(Math.random()*Length2);
		int rand3=(int)(Math.random()*Length3);
		String phrase=ListOne[rand1]+ " " + ListTwo[rand2]+ " " + ListThree[rand3];
		System.out.println("what we need is a " + phrase);
	} 
}