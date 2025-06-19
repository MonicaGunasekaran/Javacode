package patterns;
// solid square, for n=4
//****
//****
//****
//****
public class Pattern1 {
public static void sqrpat(int n) {
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	int n=4;
	sqrpat(n);
}
}
