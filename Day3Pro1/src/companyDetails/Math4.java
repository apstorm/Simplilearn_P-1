package companyDetails;

public class Math4 {

	private int fact(int n) {
		int i,fact=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public int nCr(int n, int r) {
		return fact(n)/(fact(n-r)* fact(r));
	}
	
	public int nPr(int n, int r) {
		return fact(n)/fact(n-r);
	}
	
}
