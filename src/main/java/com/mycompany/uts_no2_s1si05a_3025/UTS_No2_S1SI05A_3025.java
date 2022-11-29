/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_s1si05a_3025;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author acer
 * Putri Eka Nur Alifah / 21103025 / S1SI05A
 */
public class UTS_No2_S1SI05A_3025 {

    public static void main(String[] args) {
        SalariedEmployee_3025 se = new SalariedEmployee_3025();
        CommissionEmployee_3025 ce = new CommissionEmployee_3025();
        ProjectPlanner_3025 pp = new ProjectPlanner_3025();
        System.out.println();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            se.nama_3025 = "Putri";
            se.nip_3025 = 201;
            se.gaji_3025 = 300000;
            
            ce.nama_3025 = "Eka";
            ce.nip_3025 = 202;
            ce.gaji_3025 = 3500000;
            ce.komisi_3025 = 250000;
            ce.penjualan_3025 = 27;
            
            pp.nama_3025 = "Nur";
            pp.nip_3025 = 203;
            pp.gaji_3025 = 3100000;
            pp.komisi_3025 = 300000;
            pp.proyek_3025 = 7;
            
            se.tampilDataSalariedEmployee_3025();
            System.out.println("");
            ce.tampilDataCommissionEmployee_3025();
            System.out.println("");
            pp.tampilDataProjectPlanner_3025();
            System.out.println("");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
