/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */

import java.util.Scanner;
public class Main {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        double armutFiyat =2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat =1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;
        double toplamFiyat =0;
        
        System.out.println("Armmut kaç kilo ? : ");
        armutKilo = scanner.nextDouble();
        
         System.out.println("Domates kaç kilo ? : ");
        domatesKilo = scanner.nextDouble();
        
         System.out.println("Elma kaç kilo ? : ");
        elmaKilo = scanner.nextDouble();
        
         System.out.println("Muz kaç kilo ? : ");
        muzKilo = scanner.nextDouble();
        
         System.out.println("Patlican  kaç kilo ? : ");
        patlicanKilo = scanner.nextDouble();
        
        
        
        toplamFiyat += armutFiyat*armutKilo + domatesFiyat*domatesKilo + muzFiyat*muzKilo + patlicanFiyat*patlicanKilo+ elmaFiyat*elmaKilo;
        
        System.out.println("Toplam Tutar : " + toplamFiyat + " TL");
                
        
           
    }
}
