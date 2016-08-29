import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class TesteLeitura {
	
	public static void main(String args[]) throws IOException {
		try(BufferedReader br = new BufferedReader(new FileReader("src//c05000.txt"))){	
			String line = br.readLine();
			String[] v = line.split(" ");
			Rect rB = new Rect(Integer.parseInt(v[0]),Integer.parseInt(v[1]),Integer.parseInt(v[2]),Integer.parseInt(v[3]));
			br.readLine();
			ArrayList<Rect> col = new ArrayList<>();
			while((line = br.readLine()) != null){
				v = line.split(" ");
				Rect rX = new Rect(Integer.parseInt(v[0]),Integer.parseInt(v[1]),Integer.parseInt(v[2]),Integer.parseInt(v[3]));
				if(rB.col(rX))
					col.add(rX);
					
			}
			int cont = 1;
			System.out.println(col.size()+" --> Possíveis colisões com o rB"
					+ "\n~~~~~~~~~~~~~~");
			System.out.printf("Retângulo B:\nX1: %d\nY1: %d\nX2: %d\nY2: %d\n",rB.x1,rB.y1,rB.x2,rB.y2);
			for(Rect r: col){
				System.out.println("Retângulo "+cont+r.toString());
				cont++;
			}
		}
		catch(IOException e){
			e.printStackTrace();
			System.err.println(e);
		}
	}
}
