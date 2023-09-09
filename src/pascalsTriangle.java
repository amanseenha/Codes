import java.util.*;
public class pascalsTriangle
{
	public static void main(String[] args) {
	    for(int i=0; i<7; i++)
		System.out.println(pascal(i));
	}
	public static ArrayList<Integer> pascal(int rowNum){
	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(1);
	    int ans = 1;
	    for(int col=1; col<=rowNum; col++){
	        ans = ans*(rowNum-col+1);
	        ans = ans/col;
	        list.add(ans);
	    }
	    return list;
	}
}
