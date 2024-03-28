package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
	public static void main(String[]args) {
		List<Integer>val=Arrays.asList(1,2,34,56,8);
		List<Integer>Values=val.stream().map(e->e*2).collect(Collectors.toList());
		System.out.println(Values);
		
	}
}
