package StringBuffers;

import LinkedListPrograms.LinkList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
  StringBuffer sb = new StringBuffer();
  sb.insert(0,10.1);
        System.out.println("Double");
        System.out.println(sb);
  sb.insert(1,20.0f);
        System.out.println("Float");
        System.out.println(sb);
  sb.insert(2,20020200202l);
        System.out.println("long");
        System.out.println(sb);
  sb.insert(3,7000);
        System.out.println("int");
        System.out.println(sb);
  sb.insert(4,'A');
        System.out.println(sb);
  sb.insert(5,true);
        System.out.println(sb);
  sb.insert(6,"CharSeq");
        System.out.println(sb);
  sb.insert(7,"CharSeq",2,6);
        System.out.println(sb);
  sb.insert(8,new char[]{'a','b','c'});
        System.out.println(sb);
  sb.insert(9,"String");
        System.out.println(sb);
  LinkedList<Integer>list = new LinkedList<>();
  list.add(10);
  list.add(30);
  sb.insert(10,list);
        System.out.println(sb);
  sb.insert(11,new char[]{65,66,67},0,3);
        System.out.println(sb);
    }

}
