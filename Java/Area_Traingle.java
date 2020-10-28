import java.util.Scanner;
public class Area_Triangle {
	float area(float a,float b,float c) { 
		float s = (float)((a+b+c)/2);   
		float ar = (float)Math.pow(s*(s-a)*(s-b)*(s-c),0.5);
		return ar;
	}
	
	float distance(float[] a,float[] b) { 
		float dis =(float)Math.pow((Math.pow((b[0]-a[0]),2)+Math.pow((b[1]-a[1]),2)+ Math.pow((b[2]-a[2]),2 )),0.5);
		return dis;
	}
	
	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		System.out.print("Enter the points consecutively in form of (x1,x2,x3) (y1,y2,y3) (z1,z2,z3) ");
		float[] a =new float[3];
		float[] b =new float[3];
		float[] c = new float[3];
		for (int i=0;i<3;i++) {
			a[i] = ip.nextFloat();
			b[i] = ip.nextFloat();
			c[i] = ip.nextFloat();
		}
		Area_Triangle obj1 = Area_Triangle();
		float point_a = obj1.distance(a,b);
		float point_b = obj1.distance(b,c);
		float point_c = obj1.distance(c,a);
		float area = obj1.area(point_a,point_b,point_c);
		System.out.print(area);
		
		ip.close();

	}

}
