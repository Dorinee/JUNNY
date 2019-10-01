package com.company;
//11650번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class One1650 {


    public static void main(String[] args) throws IOException {
        /*BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int po = Integer.parseInt(in.readLine());
        int HI[][]= new int[po][2];
        for(int i=0;i<po;i++){

            StringTokenizer stt = new StringTokenizer(in.readLine()," ");

            HI[i][0] = Integer.parseInt(stt.nextToken());
            HI[i][1] =  Integer.parseInt(stt.nextToken());
        }
        Arrays.sort(HI,new Comparator<int[]>(){
                    @Override
                    public int compare(final int[] a, final int[] b) {
                        if(a[0]==b[0]){
                            return Integer.compare(a[1],b[1]);
                        }
                        else{
                            return Integer.compare(a[0],b[0]);
                        }

                    }
                }
        );

        for(int i=0; i<po;i++){
            System.out.println(HI[i][0]+" "+HI[i][1]);
        }*/
    StudentInfo si = new StudentInfo(2);
    StudentPerson sp = new StudentPerson(si);
    EmployeeInfo ei = new EmployeeInfo(1);
    EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank);
        System.out.println(sp.info.grade);
        Integer id = 5;
        //Person <EmpInfo,Integer> p1 = new Person<>(new EmpInfo(3), id);
        //Person <EmpInfo,Integer> p1 = new Person<EmpInfo, Integer>(new EmpInfo(3), id);
        var p1 = new Person<EmpInfo, Integer>(new EmpInfo(10), id);
        System.out.println(p1.info.rank);
    }
}

class StudentInfo{
    public int grade;
    StudentInfo(int grade){this.grade = grade;}
}
class StudentPerson{
    public StudentInfo info;
    StudentPerson(StudentInfo info){ this.info = info;}
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){this.rank = rank;}
}
class EmployeePerson{
    public EmployeeInfo info;
    EmployeePerson(EmployeeInfo info){
        this.info = info;
    }
} // How to make these overlapping classes to GENERICS?
class EmpInfo{
    public int rank;
    EmpInfo(int rank){this.rank = rank;}
}
class Person<T,S>{
    public T info;
    public S id;
    Person(T info, S id){
        this.info = info;
        this.id = id;
    }
}