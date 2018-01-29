
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
		int idq = id[q];
		for(int i = 0; i < id.length; i++){
			 if(id[i] == idp) id[i] = id[q];
		}
	}
	
	public boolean find(int p, int q){
		
		return true;
	}
}