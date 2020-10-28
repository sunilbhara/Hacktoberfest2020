import java.lang.*;

class Nthread extends Thread{
	static int a=1;
	public void run() {
		try {
			while(a<=100) {
			System.out.println(a);
			a++;
			sleep(2);}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class NT{
	
	public static void main(String args[]) {
		Nthread nt1=new Nthread();
		Nthread nt2=new Nthread();
		Nthread nt3=new Nthread();
		
		nt1.run();
		nt2.run();
		nt3.run();
	}
}
