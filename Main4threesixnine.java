public class Main4threesixnine {
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
				if(i/10==3||i/10==6||i/10==9) { 
					if(i%10==3||i%10==6||i%10==9) System.out.println(i+" �ڼ� ¦¦"); 
					else System.out.println(i+ " �ڼ� ¦");} 

				else if(i%10==3||i%10==6||i%10==9) System.out.println(i+" �ڼ� ¦");
		}
	}
}