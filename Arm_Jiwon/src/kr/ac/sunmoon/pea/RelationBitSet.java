package kr.ac.sunmoon.pea;

import java.util.ArrayList;
import java.util.BitSet;

public class RelationBitSet 
{
	public static void main(String[] args) 
	{
		String[] transactions = new String[] {"100", "200", "300", "400", "500"};
		String[] items = new String[] {"a", "b", "c"};
		ArrayList<BitSet> relations = new ArrayList<BitSet>();
		BitSet rel_a = new BitSet();
		rel_a.set(0, true);
		rel_a.set(1, true);
		rel_a.set(2, true);
		relations.add(rel_a);
		BitSet rel_b = new BitSet();
		rel_b.set(1, true);
		rel_b.set(2, true);
		rel_b.set(3, true);
		relations.add(rel_b);
		BitSet rel_c = new BitSet();
		rel_c.set(0, true);
		rel_c.set(1, true);
		rel_c.set(3, true);
		rel_c.set(4, true);
		relations.add(rel_c);
		
		int[] x = new int[]{0, 1};
		BitSet output = funcX(x, relations);
		System.out.println(output);
		
		x = new int[]{0, 2};
		output = funcX(x, relations);
		System.out.println(output);
		
		x = new int[]{0, 1, 2};
		output = funcX(x, relations);
		System.out.println(output);
	}
	
	private static BitSet funcX(int[] x, ArrayList<BitSet> relations)
	{
		BitSet output = null;
		if(x.length > 0)
		{
			output = (BitSet)relations.get(x[0]).clone();
			for(int i=1; i<x.length; i++)
				output.and(relations.get(x[i]));
		}
		
		return output;
	}
}
