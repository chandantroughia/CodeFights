/**
 *
 * @author chandantroughia
 * @date 07/07/2017
 * @asked Google
 * 
 */

public class FirstDuplicate {

	public static int firstDuplicate(int[] a){
		int ans = -1;
	    
	    for(int i = 0 ; i < a.length - 1 ; i++){
	        int index = Math.abs(a[i]) - 1;
	        if(a[index] > 0){
	            a[index] = - a[index];
	        }else{
	            ans =  Math.abs(a[index]);
	        }
	    }
	    return ans;
	}
	public static void main(String[] args) {
		int[] arr = {2, 3, 3, 1, 5, 2};
		System.out.println(firstDuplicate(arr));
	}
}
