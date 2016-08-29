public class Rect {
	
	public int x1 = 0;
	public int y1 = 0;
	public int x2 = 0;
	public int y2 = 0;

	public Rect(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
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

