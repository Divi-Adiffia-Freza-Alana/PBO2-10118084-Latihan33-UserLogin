/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan33.userlogin;
import java.util.Scanner;
/**
 *
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk Userlogin

 */
public class User {
    Scanner Scanner = new Scanner (System.in);
    private String username;
    private String password;
    private boolean StatusAkun;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatusAkun() {
        return StatusAkun;
    }

    public void setStatusAkun(boolean StatusAkun) {
        this.StatusAkun = StatusAkun;
    }
    
    private boolean cekAkun(String username,String password){
        StatusAkun = username.equals("Rizki Adam") && password.equals("Terbaik");
        return StatusAkun;
        }
        
      private void hasilLogin(boolean StatusAkun,String Username){
        if (StatusAkun){
            System.out.println("\n*****HALL RIZKIADAM*****");
            System.out.println("Selamat Datang di Aplikasi Ini");
                    }
        else{
            System.out.println("\nOoops, Username atau Password anda salah");
        }
    }
    
    public void pengecekkanLogin(String username,String Password){
        cekAkun(username,password);
        hasilLogin(StatusAkun,username) ;
}
    
  }


