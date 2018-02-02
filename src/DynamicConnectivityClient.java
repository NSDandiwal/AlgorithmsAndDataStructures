
public class DynamicConnectivityClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = StdIn.readInt();
		System.out.println("Value of N is " + N);
		QuickFindUF uf = new QuickFindUF(N);
		while(!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if(!uf.connected(p, q)) {
				uf.union(p, q);
				StdOut.println(p + " " + q);
			}
		}
	}

}
