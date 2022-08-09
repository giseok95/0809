import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Math.*; //Static 메소드라 Math. 없이 쓸 수 있다.

public class StaticImportDemo {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int rand=(int)(random()*6+1);
			System.out.println("rand="+rand);
			System.out.println("PI="+PI);
		}
}
