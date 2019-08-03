package com.coding;



import java.util.*;

public class Main {


    public static void main(String[] args)  {
        // write your code here


        ArrayList<MyData> list = new ArrayList<>();
        list.add(new MyData(1998,12,21));
        list.add(new MyData(1998,12,11));
        list.add(new MyData(2000,1,21));
        list.add(new MyData(1995,3,21));
        list.add(new MyData(1998,5,11));

        Collections.sort(list);


        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}

class MyData implements Comparable<MyData>{
    int date,month,year ;

    public MyData(int year, int month, int date) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyData myDate) {

        int x = this.year - myDate.year ;
        if(x==0){
            x = this.month - myDate.month;
            if(x==0){
                x = this.date = myDate.date;
                return x;
            }else {
                return x;
            }

        }else {
            return x;
        }

    }
}


