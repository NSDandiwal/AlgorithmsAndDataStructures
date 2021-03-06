
public class QuickFindUF {
	
	private int id[];
	
	public QuickFindUF(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++){
			id[i] = i;
		}
	}
	
	public void union(int p, int q){
		int idp = id[p];
//		int idq = id[q]; possible bug in the system
		for(int i = 0; i < id.length; i++){
			 if(id[i] == idp) id[i] = id[q];
		}
		printArray();
		System.out.println();
		System.out.println();
	}
	
	public boolean connected(int p, int q){
		return id[p] == id[q];
	}
	
	public void printArray() {
		for(int i = 0; i < id.length; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for(int i = 0; i < id.length; i++) {
			System.out.print(id[i] + "\t");
		}
	}
}
