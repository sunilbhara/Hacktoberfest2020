import java.util.Scanner; 
public class PointInter {
	static void intersection(double[] a,double [] b) {
		double y = (b[0]*a[2]-a[0]*b[2])/(a[0]*b[1]-b[0]*a[1]);  
		double x = (a[2]*b[1] -b[2]*a[1])/(b[0]*a[1]-b[1]*a[0]);
		System.out.print(x+" "+y);
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the eq. of lines");
		String eq1 = ip.nextLine();
		String eq2 = ip.nextLine();
		String[] str1 = eq1.split("[x+y]+");       
		String[] str2 = eq2.split("[x+y]+");
		double[] arr1 = new double [3];            
		double[] arr2 = new double [3];
		for (int i=0;i<3;i++) {
			arr1[i]=Double.parseDouble(str1[i]);
			arr2[i]=Double.parseDouble(str2[i]);
		}
		System.out.print("Line "+eq1+" and "+eq2+" intersects at");
		intersection(arr1,arr2);
		ip.close();
	}
}
