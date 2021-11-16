package Main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calc c = new Calc();
        int[] arr1 = {1,2,3,4,5,6,7,8,28,5,30};
        System.out.println(c.ProductSquare(arr1));
        System.out.println(c.SumOdd(arr1));
        System.out.println(c.MaxPerfect(arr1));

        Student student1 = new Student("Name1","Uni1");
        Student student2 = new Student("Name2","Uni2");
        Student student3 = new Student("Name3","Uni3");
        Student student4 = new Student("Name4","Uni4");
        Pair pair1= new Pair(student1,8);
        Pair pair2= new Pair(student2,6);
        Pair pair3= new Pair(student3,7);
        Pair pair4= new Pair(student4,8);
        List studList = new ArrayList();
        studList.add(pair1);
        studList.add(pair2);
        studList.add(pair3);
        studList.add(pair4);
        List retStuds = c.MaxGrade(studList);
        for(Object x: retStuds)
            System.out.println(x);


    }
}
