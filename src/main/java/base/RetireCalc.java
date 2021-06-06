/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Harding
 */

package base;

import java.time.Year;
import java.util.Scanner;

public class RetireCalc {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    RetireCalc newCalc = new RetireCalc();
    int age = newCalc.howOld();
    int retirement = newCalc.whenRetire();
    int years = newCalc.yearsLeft(age, retirement);
    System.out.println(newCalc.retireYear(years));
  }

  public int howOld(){
    System.out.print("How old are you (In Years)? ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Not a valid number!");
      return howOld();
    }

    return Integer.parseInt(n);
  }

  public int whenRetire(){
    System.out.print("How old would you like to be when you retire? ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Not a valid number!");
      return whenRetire();
    }

    return Integer.parseInt(n);
  }

  public int yearsLeft(int age, int retireAge){
    int years = retireAge - age;
    System.out.printf("You have %d years left until you may retire.%n", years);
    return years;
  }

  public String retireYear(int years){
    return String.format("Because the current year is %d, you cannot retire until %d.", Year.now().getValue(), (Year.now().getValue() + years));
  }
}
