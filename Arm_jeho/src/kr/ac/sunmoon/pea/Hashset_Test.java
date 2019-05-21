package kr.ac.sunmoon.pea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Hashset_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> List = new ArrayList<String>();
		HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print("ют╥б: ");
			List.add(scan.next());
		}
		
		HashMap<String, ArrayList<Integer>> hmRel = new HashMap<String, ArrayList<Integer>>();
		HashSet<ArrayList<Integer>> intersection = new HashSet<ArrayList<Integer>>();
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
		
		intersection.add(hmRel.get(List.get(0)));
		
		System.out.println(intersection);
		for(int i = 1 ; i < List.size(); i++) {
			set.add(hmRel.get(List.get(i)));
			intersection.retainAll(set);
		}
		System.out.println(intersection);
		System.out.println(set);
	}
	
}
