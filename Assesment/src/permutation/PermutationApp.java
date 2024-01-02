package permutation;

public class PermutationApp {
	public static void main(String[] args) {
		String s = "ABC";
		int n = s.length();
		permute(s, 0, n - 1);
	}
	
	public static void permute(String s, int l, int r) {
		if(l == r) {
			System.out.println(s);
		}
		else {
			for(int i = l; i <= r; i++) {
				s = swap(s, l, i);
			
				permute(s, l + 1, r);
				System.out.println();
				s = swap(s, l, i);
				//System.out.println(s);
			}
		}
	}
	public static String swap(String a, int i, int j) {
		char temp;
		char[] ch = a.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}
}
