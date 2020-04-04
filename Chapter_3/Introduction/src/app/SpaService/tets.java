package app.SpaService;

import java.util.Scanner;

public class tets {
   public static void main(String[] args) {
      SpaService firstService = new SpaService();
      SpaService secondService = new SpaService();
      firstService = getData(firstService);
      secondService = getData(secondService);
      System.out.println("First service details:");
      System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
      System.out.println("Second service details:");
      System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
   }

   public static SpaService getData(SpaService s) {
      String service;
      double price;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter service >> ");
      service = keyboard.nextLine();
      System.out.println("Enter price >> ");
      price = keyboard.nextDouble();
      keyboard.nextLine();
      s.setServiceDescription(service);
      s.setPrice(price);
      keyboard.close();
      return s;
   }
}