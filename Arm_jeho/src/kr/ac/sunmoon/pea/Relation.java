package kr.ac.sunmoon.pea;

import java.util.ArrayList;
import java.util.HashMap;

public class Relation 
{
	public static void main(String[] args)
	{
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
		System.out.println("transaction with item a and item b >> " + output);
		
		// test 2
		x = new ArrayList<String>();
		x.add("a");
		x.add("c");
		output = funcX(x, hmRel);
		System.out.println("transaction with item a and item c >> " + output);
		
		
		// test 3
		x = new ArrayList<String>();
		x.add("b");
		x.add("c");
		output = funcX(x, hmRel);
		System.out.println("transaction with item b and item c >> " + output);
		
		
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
	
	private static ArrayList<Integer> funcX(ArrayList<String> x, HashMap<String, ArrayList<Integer>> hmRel)
	{
		ArrayList<Integer> output = new ArrayList<Integer>();
		ArrayList<Integer> Intersection = new ArrayList<Integer>();
		if(x.size() > 0)
		{
			String item = x.get(0);
			output = hmRel.get(item);
			
			for(int i=1; i<x.size(); i++)
			{
					item = x.get(i);
					ArrayList<Integer> transs = hmRel.get(item);
					Intersection = intersection(output,transs);
			}
		}
		
		return Intersection;
	}
    public static <Integer> ArrayList<Integer> intersection(ArrayList<Integer> output,ArrayList<Integer> transs) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (Integer t : transs) {
            if(output.contains(t)) {
                list.add(t);
            }
        }

        return list;
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