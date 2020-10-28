import java.util.Scanner;

class circle{
	float g,h,r; 
	circle(float g, float h, float r){
		this.g=g;
		this.h=h;
		this.r=r;
	}	
}
public class EquationCircle {

	static void print(circle x) {	
	float g = -2*x.g;
	float h = -2*x.h;
	float c = (x.r * x.r) - (x.g * x.g) - (x.h * x.h);
	System.out.print("x^2 + y^2 + (" +g+ " x) + ("+h + " y) = " + c);
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		float g = ip.nextFloat();
		float h = ip.nextFloat();
		float r = ip.nextFloat();
		circle c = new circle(g,h,r); 
		print(c);
		ip.close();
	}

}
