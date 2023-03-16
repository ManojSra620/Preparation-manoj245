package Com_framework;

import java.util.Set;
import java.util.TreeSet;

public class TCS_TEST_COllections 
{
	public static void main(String[] args) 
	{
		Set<Integer> s=new TreeSet<>();
		s.add(2);s.add(3);s.add(5);s.add(9);s.add(8);s.add(21);s.add(22);s.add(32);s.add(72);s.add(222);s.add(122);s.add(202);s.add(89);s.add(65);
		s.add(12);s.add(36);s.add(25);s.add(55);s.add(98);s.add(47);
		System.out.println(s);
		s.removeIf(n->(n>80));
		System.out.println("after remove "+s);
		s.add(361); s.add(31);s.add(61);s.add(38);s.add(-1);
		System.out.println("after adding 5 elements"+s);
		System.out.println(s.size());
		System.out.println(Thread.currentThread().getId());
		
	}

}
