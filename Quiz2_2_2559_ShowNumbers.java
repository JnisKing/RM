import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Quiz2_2_2559_ShowNumbers {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> tm = new TreeMap<Integer,Integer>();
		
		while(true){
			int num = sc.nextInt();
			if(num<=0){
				break;
			}
			if(!tm.containsKey(num)){
				tm.put(num, 1);
				System.out.print(num+ " ");
			}else{
				int value = tm.get(num);
				tm.put(num, value+1);
			}
		}
		System.out.println();
		for(Map.Entry entry : tm.entrySet()){
			System.out.print(entry.getKey()+" ");
	}
	}
}
