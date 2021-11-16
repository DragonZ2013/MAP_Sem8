package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calc {
    public int SumOdd(int[] array){
        int ret_val = Arrays.stream(array).filter(x->x%2==1).sum();
        return ret_val;
    }



    public int ProductSquare(int[] array){
        int ret_val = Arrays.stream(array).filter(x->Math.floor(Math.sqrt(x))==Math.sqrt(x)).reduce(1,(num1,num2)->num1*num2);
        return ret_val;

    }

    private Boolean IsPerfect(int num){
        int sumdiv=0;
        for(int i=1;i<num;i++)
            if(num%i==0)
                sumdiv+=i;
        if(sumdiv==num)
            return true;
        return false;
    }

    public int MaxPerfect(int[] array){
        int ret_val = Arrays.stream(array).filter(x->this.IsPerfect(x)==true).reduce(0,(num1,num2)->num1>num2 ? num1:num2);
        return ret_val;
    }

    public List<Pair> MaxGrade(List<Pair<Student,Integer>> studentGrades){
        Student sTemp = new Student("temp1","temp2");
        Pair<Student,Integer> tempPair= new Pair<Student,Integer> (sTemp,0);
        int maxGradeStudent = studentGrades.stream().reduce(tempPair,(num1,num2)->num1.getP2()>num2.getP2() ? num1:num2).getP2();
        List retList = new ArrayList();
        retList =studentGrades.stream().filter(x->x.getP2()==maxGradeStudent).toList();
        return retList;
    }
}
