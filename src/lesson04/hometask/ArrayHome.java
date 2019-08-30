package lesson04.hometask;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayHome {

    public  static void removeEl(ArrayList<String> list, int i)
        {
            String el = list.get(i);
            list.remove(i);

                if (list.get(i).equals(el))
                    {
                        System.out.println("Element was not removed");
                    }
                else
                    {
                        System.out.println("Element was removed");
                    }
        }

    public static void main(String[] args) {

        ArrayList<String> al1 = new ArrayList<String>();
        ArrayList<String> al2 = new ArrayList<String>(5);

        al1.add("Apple");
        al1.add("Feach");
        al1.add("Peachsdfdsf");
        al1.add("Asdsf");
        al1.add("Wjdfghfdhfg");

        al2.add("BApple");
        al2.add("DPeach");
        al2.add("Fl2Peach2");
        al2.add("Wl2Peach3");
        al2.add("Rl2Peach4");
        al2.add("Tl2Peach5");
        al2.add("Ql2Peach6");

        System.out.println("Before sorting al1");
        for(String iter : al1)
        {
            System.out.println(iter);
        }

Collections.sort(al1);
Collections.sort(al2);

removeEl(al1 ,0);

        System.out.println();
        System.out.println("After sorting al1");
        for(String iter : al1)
            {
                System.out.println(iter);
            }

        System.out.println();
        System.out.println("After sorting al1");
        for(String iter : al2)
        {
            System.out.println(iter);
        }

    }
}
