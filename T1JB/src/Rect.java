//ver qual o import do HashSet!!
import java.util.*;

public class Rect {
	
	
	public Set<Point> pointsMap = new HashSet<>();
	//botar Point IE e Point SD como atributos
	//NA REAL ACHO QUE TIRA ESSA BOSTA PORQUE SÓ TA COMPLICANDO E EU USO MAIS OS PONTOS RAW 
	private Point iE;
	private Point sD;
	//talvez possa fazer métodos get deles e tirar daqui se não usar muito
	private int width = 0;
	private int height = 0;

	//classe privada de um ponto cartesiano
	private class Point {
		public int x = 0, y = 0;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		public String toString(){
			return String.valueOf(x)+String.valueOf(y);
		}
	}
	
	public Rect(int x1, int y1, int x2, int y2) {
		//talvez tire os dois fora
		width = x2-x1;
		height = y2-y1;
		
		//chamar agregatePts com lado IE x e y, pra já fazer direto da entrada
		mapPts(x1,x2,y1,y2);
	}
	
	//popula o HashSet de pontos do retangulo
	public void mapPts(int limX1,int limX2, int limY1, int limY2){
		Point p;
		for(int i=limX1; i<=limX2;i++){
			for(int j=limY1;j<=limY2;j++){
				p = new Point(i,j);
				pointsMap.add(p);
			}
		}
	}
	
	public HashSet<Point> discountColMap(){
		
	}
	
	//compara se esse retangulo e sobreposto com um outro passado por parametro
	
	//refazer ele usando Point !!
	public boolean col(Rect r){
		if(this.x1 < r.x2 &&
		   this.x2 > r.x1 &&
		   this.y1 < r.y2 &&
		   this.y2 > r.y1) 
			return true;
		return false;
	}
	
	public String toString(){
		return "\nX: "+x1
				+ "\nY: "+y1
				+ "\nLargura: "+(x2-x1)
				+ "\nAltura: "+(y2-y1);
	}
}

