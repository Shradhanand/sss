
class permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perm("","abc");
	}
	private static void perm(String p,String s){
		int n=s.length();
		if(n==0)
			System.out.println(p);
		else{
			for(int i=0;i<n;i++)
				perm(p+s.charAt(i),s.substring(0, i)+s.substring(i+1, n));
		}
			
	}

}
