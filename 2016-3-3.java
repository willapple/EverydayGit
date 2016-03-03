package com;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

/**
 * Java相关集合的一些操作
 * @author William
 *
 */
public class Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("3");
		list.add("4");
		list.add(new String("aa"));
		
		Iterator<String> it1 = list.iterator();
		while (it1.hasNext()){
			System.out.println(it1.next());
		}
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		Enumeration<Integer> en1 = v.elements();
		while (en1.hasMoreElements()){
			System.out.println(en1.nextElement());
		}
		
		Iterator<Integer> it2 = v.iterator();
		while (it2.hasNext()){
			System.out.println(it2.next());
		}
		
		Hashtable<String, Integer> h = new Hashtable<String, Integer>();
		h.put("a", 11);
		h.put("b", 22);
		h.put("c", 33);
		
		Enumeration<Integer> en2 = h.elements();
		while (en2.hasMoreElements()){
			System.out.println(en2.nextElement());
		}
		
		Iterator<String> it3 = h.keySet().iterator();
		while (it3.hasNext()){
			System.out.println(it3.next());
		}
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("a1", "100");
		map.put("a2", "200");
		map.put("a3", "300");
		
		Iterator<Entry<String, String>> it4 = map.entrySet().iterator();
		while (it4.hasNext()){
			System.out.println(it4.next());
		}
		
		
	}
}
