package org.mypackage.hello;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class NameHandler {

    private Calendar fecha = Calendar.getInstance();
    private String name;
    private int mesA = fecha.get(Calendar.MONTH) + 1;
    private int anoA = fecha.get(Calendar.YEAR) - 1;
    private int sem;
    private int anoU;
    private int anoI;
    private int mes;
    private int ano;
    private char semI;

    public NameHandler() {

        name = null;

    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMesA() {
        return mesA;
    }

    public void setMesA(int mesA) {
        this.mesA = mesA;
    }

    public int getAnoA() {
        return anoA;
    }

    public void setAnoA(int anoA) {
        this.anoA = anoA;
    }

    public int getMes() {
        return Math.abs(mes + getMesA());
    }

    public void setMes(int mes) {
        this.mes = mes;
    }


    public int getAno() {
        return Math.abs(ano - getAnoA());
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getSem() {
        return Math.abs((sem - getAnoA()-1)*2)+1;
    }
    public void setSem(int sem) {
        this.sem = sem;
    }
    public int getAnoI() {
        return anoI;
        
    }

    public void setAnoI(int anoI) {
        this.anoI = anoI;
    }
    public char getSemI() {
        return semI;
        
    }

    public void setSemI(char semI) {
        this.semI = semI;
    }

    

    


    
    

}
