/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_s1si05a_3025;

/**
 *
 * @author acer
 * Putri Eka Nur Alifah / 21103025 / S1SI05A
 */
public class ProjectPlanner_3025 extends SalariedEmployee_3025{
    String nama_3025;
    int nip_3025, proyek_3025;
    double gaji_3025, komisi_3025, pajak_3025, gaji_pokok_3025;
    
    public double gaji_project() {
        pajak_3025 = (0.05 * gaji_pokok_3025);
        gaji_3025 = gaji_pokok_3025 + (komisi_3025 * proyek_3025) - pajak_3025;
        return gaji_3025;
    } 
    
    public void tampilDataProjectPlanner_3025(){
        System.out.println("Nama               : " + nama_3025);
        System.out.println("NIP                : " + nip_3025);
        System.out.println("Gaji Pokok         : " + gaji_3025);
        System.out.println("Komisi             : " + komisi_3025);
        System.out.println("Total Hasil Proyek : " + proyek_3025);
     }
}
