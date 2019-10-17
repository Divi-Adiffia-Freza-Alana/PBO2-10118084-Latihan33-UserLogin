/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan33.userlogin;

import java.util.Scanner;



/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk Userlogin

 */
public class PBO210118084Latihan33UserLogin {
        
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner Scanner = new Scanner (System.in);
        User User = new User();
        String usName;
        String passWord;
        System.out.print("Masukkan Username = ");
        usName = Scanner.next();
        System.out.println("Masukkan Password = ");
        passWord = Scanner.next();
        User.pengecekkanLogin(usName, passWord);
        
    }
    
}
