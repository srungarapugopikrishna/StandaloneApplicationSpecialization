package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gopi
 */
public class findip {
      public String ip() {
       
       try {
       java.net.InetAddress i = java.net.InetAddress.getLocalHost();
//       System.out.println(i);                  // name and IP address
//       System.out.println(i.getHostName());    // name
//       System.out.println(i.getHostAddress()); // IP address only
      String ip=i.getHostAddress();
      return ip;
       }
       catch(Exception e){e.printStackTrace();}
         return null;
     }
public static void main(String []args){}
    
}
