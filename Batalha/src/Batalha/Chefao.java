package Batalha;


import java.util.Random;

public class Chefao {

    Random rd = new Random();

    

    private boolean calcularChance(){
        //
        int  chanceDeAcerto = rd.nextInt(3);

        if (chanceDeAcerto == 1) {
            return true;
        }else return false;
    }
}
