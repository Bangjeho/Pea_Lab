package kr.ac.sunmoon.pea;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Relation 
{
	public static void main(String[] args)
	{
		long start_time = System.currentTimeMillis();
		
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
		
		ArrayList<Integer> d = new ArrayList<Integer>();
		d.add(100);
		d.add(200);
		d.add(300);
		d.add(400);
		d.add(500);
		hmRel.put("d", d);
		
		// test 1 item a and item b intersection
		ArrayList<String> x = new ArrayList<String>();
		x.add("a");
		x.add("b");
		ArrayList<Integer> output = funcX(x, hmRel);
		long end_time = System.currentTimeMillis();
		System.out.println("transaction with item a and item b >> " + output + ", Execution time : " + (end_time - start_time) + "(ms)");

		
		// test 2 item a and item c intersection
		x = new ArrayList<String>();
		x.add("a");
		x.add("c");
		ArrayList<Integer> output2 = funcX(x, hmRel);
		end_time = System.currentTimeMillis();
		System.out.println("transaction with item a and item c >> " + output2 + ", Execution time : " + (end_time - start_time) + "(ms)");
		
		
		// test 3 item b and item c intersection
		x = new ArrayList<String>();
		x.add("b");
		x.add("c");
		ArrayList<Integer> output3 = funcX(x, hmRel);
		end_time = System.currentTimeMillis();
		System.out.println("transaction with item b and item c >> " + output3 + ", Execution time : " + (end_time - start_time) + "(ms)");
		
		//test 4 item a and item b and item d intersection
		x = new ArrayList<String>();
		x.add("d");
		ArrayList<Integer> output4 = funcY(x, hmRel, output);
		end_time = System.currentTimeMillis();
		System.out.println("transaction with item a and item b and item d >> " + output4 + ", Execution time : " + (end_time - start_time) + "(ms)");
		
		//test 5 item a and item b and item c intersection
		x = new ArrayList<String>();
		x.add("c");
		ArrayList<Integer> output5 = funcY(x, hmRel, output);
		end_time = System.currentTimeMillis();
		System.out.println("transaction with item a and item b and item c >> " + output5 + ", Execution time : " + (end_time - start_time) + "(ms)");
		
		
		//test6 item a and item b and item c and item d intersection
		x = new ArrayList<String>();
		x.add("d");
		ArrayList<Integer> output6 = funcY(x, hmRel, output5);
		end_time = System.currentTimeMillis();
		System.out.println("transaction with item a and item b and item c and item d >> " + output6 + ", Execution time : " + (end_time - start_time) + "(ms)");
		
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
	// intersection item ? and item ? 
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
	
	// Double intersection function method exam) ((a and b)and c)
	private static ArrayList<Integer> funcY(ArrayList<String> x, HashMap<String, ArrayList<Integer>> hmRel, ArrayList<Integer> output){
		ArrayList<Integer> output_x = new ArrayList<Integer>();
		ArrayList<Integer> Intersection = new ArrayList<Integer>();
		if(x.size() > 0)
		{
			String item = x.get(0);
			output_x = hmRel.get(item);
			ArrayList<Integer> transs = output;
			Intersection = intersection(output_x,transs);
		}
		return Intersection;
		
	}
	//find to intersection with item ? and item ? method 
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