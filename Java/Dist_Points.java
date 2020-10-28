import java.util.Scanner;
public class Dist_Points {
	Scanner ip =new Scanner(System.in);
	double[] function() {
		double[][] ar= new double[2][2];
		for(int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {	
				ar[i][j]=ip.nextDouble();
			}
		}
		double a =-(ar[1][1]-ar[0][1]);
		double b =(ar[1][0]-ar[0][0]);
		double c= -(b*(ar[0][1])+a*(ar[0][0]));
		double[] d= {a,b,c};
		System.out.print(a+" "+b+" "+c);
		return d;
		}
	double distance (double[] point,double[] line) {
		double x,y;
		y= Math.pow(line[0]*line[0]+line[1]*line[1],0.5);
		x=Math.abs(((line[0]*point[0]+line[1]*point[1]+line[2])/y));
		return x;
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		double[] point=new double[2];
		System.out.println("Enter point to which length is to be formed from the line");
		for(int i=0;i<2;i++) {
			point[i]=ip.nextDouble();
		}
		System.out.println("Enter point to which distance is to be found from the line");
		Question_5 a1 = new Question_5();
		System.out.println("Enter point from which line is formed");
		double[] line = a1.function();
		double dist = a1.distance(point, line);
		System.out.print(dist);
		ip.close();
	}

}
