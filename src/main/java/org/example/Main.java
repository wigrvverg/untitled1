package org.example;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int[] arr = new int[5];
      for (int i = 0; i < 5; i++) {
         arr[i] = scanner.nextInt();
      }
      int count=0;
      for (int i = 0; i < 5; i++) {
      if (arr[i]%2==1) {
         count++;}}
         System.out.println(count);
      }
   }









