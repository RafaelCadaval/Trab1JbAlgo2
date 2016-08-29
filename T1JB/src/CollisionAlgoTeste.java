public class CollisionAlgoTeste {
	
	public static void main(String args[]) {
		Rect r1 = new Rect(5,5,50,50);
		Rect r2 = new Rect(20,10,10,10);
		Rect r3 = new Rect(0,0,10,10);
		Rect r4 = new Rect(12,12,10,10);
		
		boolean t1 = r1.col(r2);
		boolean t2 = r1.col(r3);
		boolean t3 = r1.col(r4);
		boolean t4 = r2.col(r3);
		boolean t5 = r2.col(r4);
		boolean t6 = r3.col(r4);
		
		System.out.print("Resultados:\nt1=r1~r2(controle) " + t1
				+ "\nt2=r1~r3: " + t2
				+ "\nt3=r1~r4: " + t3
				+ "\nt4=r2~r3: " + t4
				+ "\nt5=r2~r4: " + t5
				+ "\nt6=r3~r4: " + t6);
	}
}
