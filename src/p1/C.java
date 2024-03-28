package p1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class C {
	public static void main(String[]args) {
		List<Integer>list=Arrays.asList(12,3,45,6,54,12);
		List<Integer>newList=list.stream().filter(e->e==12).collect(Collectors.toList());
		System.out.println(newList);
		
	}

}
