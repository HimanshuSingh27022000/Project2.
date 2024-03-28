package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class A {
	public static void main(String[]args) {
		List<Integer>data=Arrays.asList(1,12,3,4,56);
		List<Integer>newData=data.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(newData);
	}
}


