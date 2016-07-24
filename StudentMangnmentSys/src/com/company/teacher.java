package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 192.168.3.34 on 6/12/2016.
 */
public class teacher {

    Scanner inp = new Scanner(System.in);


  ArrayList<String> list = new ArrayList<>();

  public void  mainMenu(){
    System.out.println("1. add Teacher");
    System.out.println("2. Show Teacher");
    String input =inp.next();
    if(input.matches("1")){
      addTeacher();
    }
    else if(input.matches("2")){
      showTeacher();
    }


  }

  public void  showTeacher(){
    System.out.println(list);

  }
  public  void addTeacher(){

        System.out.println("Enter Name");
        String name = inp.next();
        System.out.println(name);
        list.add(name);
    mainMenu();
      }

    }



