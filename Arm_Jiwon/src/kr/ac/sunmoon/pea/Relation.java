package kr.ac.sunmoon.pea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Relation 
{
	public static void main(String[] args)
	{
		//HashMap의 key값과 value값읗 지정해준다. (a, [100, 200, 300])..
		HashMap<String, ArrayList<Integer>> hmRel = new HashMap<String, ArrayList<Integer>>();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		hmRel.put("a", a);
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(200);
		b.add(300);
		b.add(400);
		hmRel.put("b", b);
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(100);
		c.add(200);
		c.add(400);
		c.add(500);
		hmRel.put("c", c);
		
		// test 1
		ArrayList<String> x = new ArrayList<String>();
		x.add("a");
		x.add("b");
		ArrayList<Integer> output = funcX(x, hmRel);
		System.out.println(output.toString());
		
		// test 2
		x = new ArrayList<String>();
		x.add("a");
		x.add("c");
		output = funcX(x, hmRel);
		System.out.println(output.toString());
		
		x = new ArrayList<String>();
		x.add("a");
		x.add("b");
		x.add("c");
		output = funcX(x, hmRel);
		System.out.println(output.toString());
		
//		ArrayList<Person> people = new ArrayList<Person>();
//		Person p_1 = new Person();
//		p_1.setName("Park");
//		people.add(p_1);
//		Person p_2 = new Person();
//		p_2.setName("Kim");
//		people.add(p_2);
//		
//		System.out.println(people.toString());
//		for(int i=0; i<people.size(); i++)
//			System.out.println(people.get(i).getName());
	}
	
	//value값끼리의 비교 함수 funcX
	private static ArrayList<Integer> funcX(ArrayList<String> x, HashMap<String, ArrayList<Integer>> hmRel)
	{
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		if(x.size() > 0)
		{
			String item = x.get(0);
			ArrayList<Integer> relation = hmRel.get(item);
			for(int i=0; i<relation.size(); i++)
				output.add(relation.get(i));
			
			for(int i=1; i<x.size(); i++)
			{
				item = x.get(i);
				relation = hmRel.get(item);
				for(int j=0; j<output.size(); j++)
				{
					int transaction = output.get(j);
					boolean check = false;
					for(int k=0; k<relation.size(); k++)
					{
						if(relation.get(k) == transaction)
						{
							check = true;
							break;
						}
					}
					if(!check)
					{
						output.remove(j);
						j--;
					}
				}
			}
		}
		
		
//		if(x.size() > 0)
//		{
//			String item = x.get(0);
//			output = hmRel.get(item);
//			
//			
//			
//			for(int i = 1 ; i < x.size() ; i++)
//			{
//				item = x.get(i);
//				ArrayList<Integer> transs = hmRel.get(item);
				
				// output = output and transs
				
//				for(Iterator<Integer> it = output.iterator(); it.hasNext();) {
//		            if(!transs.contains(it.next())) it.remove();
//		        }
//		        return new ArrayList<Integer>(output);
				
				
				
//				Iterator<Integer> itr = output.iterator();
//				while(itr.hasNext()) {
//					if(transs.contains(itr.next())) {
//						ArrayList<Integer> temp = new ArrayList<Integer>();
//						temp.add(itr.next());
//						output = temp;
//					}
//		        }	
//		       	
//			}
//				
//		}
		
		return output;
	}
	
}

//class Person
//{
//	private String name;
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String toString()
//	{
//		return name;
//	}
//}

