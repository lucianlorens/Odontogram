/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odontograma;

/**
 *
 * @author lorensov
 */
public class Dente {
    private int numeroDente;
    private boolean existe;
    private int status; //0_white 16777215//1_red 16711680 //2_yellow 16776960 //3_green 65280 //4_blue 255
    private int face; //0_centro do dente //1_lado de cima //2_direita //3_baixo //4_esquerda
    
    
    public void setNumeroDente(int numeroDente){this.numeroDente = numeroDente;}

    public int getNumeroDente(){return numeroDente;}
    
    public void setExiste(boolean existe) {this.existe = existe;} //falta implementar a capacidade de pintar se o dente existe ou nao
    
    public boolean getExiste() {return existe;} //para isso precisa-se mapear o X,Y inicial do quadrado do dente e o X,Y final do quadrado do dente e pintar o quadrado todo de branco...
    // nao eh dificil, soh eh chato pra caralho!
    
    public void setFace(int region){this.face = region;}
    
    public int getFace(){return face;}
    
    public void setStatus(int status){this.status = status;}

    public int getStatus() {
            if (status == 1) return 16711680; //vermelho
            if (status == 2) return 16776960; //amarelo
            if (status == 3) return 65280; //verde
            if (status == 4) return 255; //azul
        return 16777215; //branco
    }

    //vermelho procedimentos a serem realizados RED
    //amarelo procedimento em andamento
    //verde procedimento concluido GREEN
    //azul tratamento bem feito BLUE
    public Dente() {}

    public Dente(int coordenates) {
        switch (coordenates) {
            case 11: this.numeroDente = 11; break;
            case 12: this.numeroDente = 12; break;
            case 13: this.numeroDente = 13; break;
            case 14: this.numeroDente = 14; break;
            case 15: this.numeroDente = 15; break;
            case 16: this.numeroDente = 16; break;
            case 17: this.numeroDente = 17; break;
            case 18: this.numeroDente = 18; break;

            case 21: this.numeroDente = 21; break;
            case 22: this.numeroDente = 22; break;
            case 23: this.numeroDente = 23; break;
            case 24: this.numeroDente = 24; break;
            case 25: this.numeroDente = 25; break;
            case 26: this.numeroDente = 26; break;
            case 27: this.numeroDente = 27; break;
            case 28: this.numeroDente = 28; break;

            case 31: this.numeroDente = 31; break;
            case 32: this.numeroDente = 32; break;
            case 33: this.numeroDente = 33; break;
            case 34: this.numeroDente = 34; break;
            case 35: this.numeroDente = 35; break;
            case 36: this.numeroDente = 36; break;
            case 37: this.numeroDente = 37; break;
            case 38: this.numeroDente = 38; break;

            case 41: this.numeroDente = 41; break;
            case 42: this.numeroDente = 42; break;
            case 43: this.numeroDente = 43; break;
            case 44: this.numeroDente = 44; break;
            case 45: this.numeroDente = 45; break;
            case 46: this.numeroDente = 46; break;
            case 47: this.numeroDente = 47; break;
            case 48: this.numeroDente = 48; break;

            case 51: this.numeroDente = 51; break;
            case 52: this.numeroDente = 52; break;
            case 53: this.numeroDente = 53; break;
            case 54: this.numeroDente = 54; break;
            case 55: this.numeroDente = 55; break;

            case 61: this.numeroDente = 61; break;
            case 62: this.numeroDente = 62; break;
            case 63: this.numeroDente = 63; break;
            case 64: this.numeroDente = 64; break;
            case 65: this.numeroDente = 65; break;

            case 71: this.numeroDente = 71; break;
            case 72: this.numeroDente = 72; break;
            case 73: this.numeroDente = 73; break;
            case 74: this.numeroDente = 74; break;
            case 75: this.numeroDente = 75; break;

            case 81: this.numeroDente = 81; break;
            case 82: this.numeroDente = 82; break;
            case 83: this.numeroDente = 83; break;
            case 84: this.numeroDente = 84; break;
            case 85: this.numeroDente = 85; break;

        }

    }

    public void relatorioDental(Dente dentinho) {
        System.out.println("_-__-__-__-__-__-__-__-__-__-_");
        System.out.println("O valor de " + dentinho + "  para referencia esta como: " + dentinho.getNumeroDente());
        System.out.println("A regiao: "+face+" esta com o status: "+status);
        System.out.println("O valor de " + dentinho + "  para exist esta como: " + dentinho.getExiste());

    }

    public int Xstart(Dente dentinho) { 
        switch (dentinho.numeroDente) {
            case 11:
                switch (dentinho.face){
                    case 0: return 407;
                    case 1: return 399; 
                    case 2: return 435;
                    case 3: return 399;
                    case 4: return 395; }
            case 12:
                switch (dentinho.face){
                    case 0: return 354;
                    case 1: return 346; 
                    case 2: return 382;
                    case 3: return 346;
                    case 4: return 343; }
            case 13:
                switch (dentinho.face){
                    case 0: return 302;
                    case 1: return 294; 
                    case 2: return 330;
                    case 3: return 294;
                    case 4: return 290; }
            case 14:
                switch (dentinho.face){
                    case 0: return 250;
                    case 1: return 241; 
                    case 2: return 277;
                    case 3: return 241;
                    case 4: return 238; }
            case 15:
                switch (dentinho.face){
                    case 0: return 197;
                    case 1: return 189; 
                    case 2: return 225;
                    case 3: return 189;
                    case 4: return 186; }
            case 16:
                switch (dentinho.face){
                    case 0: return 145;
                    case 1: return 137; 
                    case 2: return 173;
                    case 3: return 137;
                    case 4: return 133; }
            case 17:
                switch (dentinho.face){
                    case 0: return 92;
                    case 1: return 84; 
                    case 2: return 120;
                    case 3: return 84;
                    case 4: return 81; }
            case 18:
                switch (dentinho.face){
                    case 0: return 40;
                    case 1: return 32; 
                    case 2: return 68;
                    case 3: return 32;
                    case 4: return 29; }

                
            case 21:
                switch (dentinho.face){
                    case 0: return 478;
                    case 1: return 470; 
                    case 2: return 506;
                    case 3: return 470;
                    case 4: return 467; }
            case 22:
                switch (dentinho.face){
                    case 0: return 531;
                    case 1: return 523; 
                    case 2: return 559;
                    case 3: return 523;
                    case 4: return 519; }
            case 23:
                switch (dentinho.face){
                    case 0: return 583;
                    case 1: return 575; 
                    case 2: return 611;
                    case 3: return 575;
                    case 4: return 572; }
            case 24:
                switch (dentinho.face){
                    case 0: return 635;
                    case 1: return 627; 
                    case 2: return 663;
                    case 3: return 627;
                    case 4: return 624; }
            case 25:
                switch (dentinho.face){
                    case 0: return 688;
                    case 1: return 680; 
                    case 2: return 717;
                    case 3: return 680;
                    case 4: return 676; }
            case 26:
                switch (dentinho.face){
                    case 0: return 740;
                    case 1: return 732; 
                    case 2: return 768;
                    case 3: return 732;
                    case 4: return 729; }
            case 27:
                switch (dentinho.face){
                    case 0: return 793;
                    case 1: return 785;
                    case 2: return 821;
                    case 3: return 785;
                    case 4: return 781; }
            case 28:
                switch (dentinho.face){
                    case 0: return 845;
                    case 1: return 837; 
                    case 2: return 873;
                    case 3: return 837;
                    case 4: return 834; }

                
            case 31:
                switch (dentinho.face){
                    case 0: return 479;
                    case 1: return 471;
                    case 2: return 506;
                    case 3: return 471;
                    case 4: return 467; }
            case 32:
                switch (dentinho.face){
                    case 0: return 531;
                    case 1: return 523; 
                    case 2: return 559;
                    case 3: return 523;
                    case 4: return 519; }
            case 33:
               switch (dentinho.face){
                    case 0: return 583;
                    case 1: return 575;
                    case 2: return 611;
                    case 3: return 575;
                    case 4: return 572; }
            case 34:
                switch (dentinho.face){
                    case 0: return 636;
                    case 1: return 628;
                    case 2: return 663;
                    case 3: return 628;
                    case 4: return 624; }
            case 35:
                switch (dentinho.face){
                    case 0: return 688;
                    case 1: return 680;
                    case 2: return 716;
                    case 3: return 680;
                    case 4: return 676; }
            case 36:
                switch (dentinho.face){
                    case 0: return 740;
                    case 1: return 732; 
                    case 2: return 768;
                    case 3: return 732;
                    case 4: return 729; }
            case 37:
                switch (dentinho.face){
                    case 0: return 793;
                    case 1: return 785; 
                    case 2: return 821;
                    case 3: return 785;
                    case 4: return 781; }
            case 38:
                switch (dentinho.face){
                    case 0: return 845;
                    case 1: return 837; 
                    case 2: return 873;
                    case 3: return 837;
                    case 4: return 834; }

                
            case 41:
                switch (dentinho.face){
                    case 0: return 407;
                    case 1: return 399; 
                    case 2: return 434;
                    case 3: return 399;
                    case 4: return 395; }
            case 42:
                switch (dentinho.face){
                    case 0: return 354;
                    case 1: return 346; 
                    case 2: return 382;
                    case 3: return 346;
                    case 4: return 343; }
            case 43:
                switch (dentinho.face){
                    case 0: return 302;
                    case 1: return 294;
                    case 2: return 330;
                    case 3: return 294;
                    case 4: return 290; }
            case 44:
                switch (dentinho.face){
                    case 0: return 250;
                    case 1: return 242; 
                    case 2: return 277;
                    case 3: return 242;
                    case 4: return 238; }
            case 45:
               switch (dentinho.face){
                    case 0: return 197;
                    case 1: return 189; 
                    case 2: return 225;
                    case 3: return 189;
                    case 4: return 186; }
            case 46:
                switch (dentinho.face){
                    case 0: return 145;
                    case 1: return 137;
                    case 2: return 173;
                    case 3: return 137;
                    case 4: return 133; }
            case 47:
                switch (dentinho.face){
                    case 0: return 93;
                    case 1: return 85; 
                    case 2: return 120;
                    case 3: return 85;
                    case 4: return 81; }
            case 48:
                switch (dentinho.face){
                    case 0: return 40;
                    case 1: return 32; 
                    case 2: return 68;
                    case 3: return 32;
                    case 4: return 29; }

                
            case 51:
                switch (dentinho.face){
                    case 0: return 407;
                    case 1: return 399; 
                    case 2: return 435;
                    case 3: return 399;
                    case 4: return 395; }
            case 52:
                switch (dentinho.face){
                    case 0: return 354;
                    case 1: return 346; 
                    case 2: return 382;
                    case 3: return 346;
                    case 4: return 343; }
            case 53:
                switch (dentinho.face){
                    case 0: return 302;
                    case 1: return 294; 
                    case 2: return 330;
                    case 3: return 294;
                    case 4: return 290; }
            case 54:
                switch (dentinho.face){
                    case 0: return 249;
                    case 1: return 242; 
                    case 2: return 277;
                    case 3: return 242;
                    case 4: return 238; }
            case 55:
                switch (dentinho.face){
                    case 0: return 197;
                    case 1: return 189;
                    case 2: return 225;
                    case 3: return 189;
                    case 4: return 186; }

                
            case 61:
                switch (dentinho.face){
                    case 0: return 478;
                    case 1: return 471; 
                    case 2: return 506;
                    case 3: return 471;
                    case 4: return 467; }
            case 62:
                switch (dentinho.face){
                    case 0: return 531;
                    case 1: return 524; 
                    case 2: return 559;
                    case 3: return 524;
                    case 4: return 519; }
            case 63:
                switch (dentinho.face){
                    case 0: return 583;
                    case 1: return 577; 
                    case 2: return 611;
                    case 3: return 577;
                    case 4: return 572; }
            case 64:
               switch (dentinho.face){
                    case 0: return 636;
                    case 1: return 630; 
                    case 2: return 663;
                    case 3: return 630;
                    case 4: return 624; }
            case 65:
                switch (dentinho.face){
                    case 0: return 688;
                    case 1: return 682; 
                    case 2: return 716;
                    case 3: return 682;
                    case 4: return 677; }

                
            case 71:
                switch (dentinho.face){
                    case 0: return 479;
                    case 1: return 471; 
                    case 2: return 506;
                    case 3: return 471;
                    case 4: return 467; }
            case 72:
               switch (dentinho.face){
                    case 0: return 531;
                    case 1: return 523; 
                    case 2: return 559;
                    case 3: return 523;
                    case 4: return 519; }
            case 73:
               switch (dentinho.face){
                    case 0: return 583;
                    case 1: return 575;
                    case 2: return 611;
                    case 3: return 575;
                    case 4: return 572; }
            case 74:
               switch (dentinho.face){
                    case 0: return 636;
                    case 1: return 628;
                    case 2: return 663;
                    case 3: return 628;
                    case 4: return 624; }
            case 75:
               switch (dentinho.face){
                    case 0: return 688;
                    case 1: return 680;
                    case 2: return 716;
                    case 3: return 680;
                    case 4: return 677; }

               
            case 81:
                switch (dentinho.face){
                    case 0: return 407;
                    case 1: return 399; 
                    case 2: return 434;
                    case 3: return 399;
                    case 4: return 395; }
            case 82:
               switch (dentinho.face){
                    case 0: return 354;
                    case 1: return 346;
                    case 2: return 382;
                    case 3: return 346;
                    case 4: return 343; }
            case 83:
               switch (dentinho.face){
                    case 0: return 302;
                    case 1: return 294;
                    case 2: return 330;
                    case 3: return 294;
                    case 4: return 290; }
            case 84:
               switch (dentinho.face){
                    case 0: return 250;
                    case 1: return 242; 
                    case 2: return 277;
                    case 3: return 242;
                    case 4: return 238; }
            case 85:
               switch (dentinho.face){
                    case 0: return 197;
                    case 1: return 190; 
                    case 2: return 225;
                    case 3: return 190;
                    case 4: return 186; }
        }
        return 0;
    }

    public int Ystart(Dente dentinho) { //talvez ele soh retorne as coordenadas x,y iniciais do dente!
        switch (dentinho.numeroDente) {
            case 11:
                switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48; 
                    case 2: return 52;
                    case 3: return 88;
                    case 4: return 52; }
            case 12:
                switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48; 
                    case 2: return 52;
                    case 3: return 88;
                    case 4: return 52; }
            case 13:
               switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48; 
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }
            case 14:
               switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48; 
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }
            case 15:
               switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48;
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }
            case 16:
               switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48;
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }
            case 17:
               switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48;
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }
            case 18:
               switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48;
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }

               
            case 21:
                switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48;
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }
            case 22:
                switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48;
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }
            case 23:
               switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48;
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }
            case 24:
                switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48;
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }
            case 25:
               switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48;
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }
            case 26:
               switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48;
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }
            case 27:
               switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48;
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }
            case 28:
               switch (dentinho.face){
                    case 0: return 60;
                    case 1: return 48;
                    case 2: return 53;
                    case 3: return 88;
                    case 4: return 53; }

               
            case 31:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 32:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 33:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 34:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 35:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 36:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 37:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 38:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }

               
            case 41:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 42:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 43:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 44:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 45:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 46:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 47:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }
            case 48:
               switch (dentinho.face){
                    case 0: return 128;
                    case 1: return 116; 
                    case 2: return 121;
                    case 3: return 155;
                    case 4: return 121; }

               
            case 51:
               switch (dentinho.face){
                    case 0: return 273;
                    case 1: return 261; 
                    case 2: return 266;
                    case 3: return 301;
                    case 4: return 266; }
            case 52:
               switch (dentinho.face){
                    case 0: return 273;
                    case 1: return 261; 
                    case 2: return 266;
                    case 3: return 301;
                    case 4: return 266; }
            case 53:
               switch (dentinho.face){
                    case 0: return 273;
                    case 1: return 261; 
                    case 2: return 266;
                    case 3: return 301;
                    case 4: return 266; }
            case 54:
               switch (dentinho.face){
                    case 0: return 273;
                    case 1: return 261; 
                    case 2: return 266;
                    case 3: return 301;
                    case 4: return 266; }
            case 55:
               switch (dentinho.face){
                    case 0: return 273;
                    case 1: return 261; 
                    case 2: return 266;
                    case 3: return 301;
                    case 4: return 266; }

               
            case 61:
               switch (dentinho.face){
                    case 0: return 273;
                    case 1: return 261; 
                    case 2: return 266;
                    case 3: return 301;
                    case 4: return 266; }
            case 62:
               switch (dentinho.face){
                    case 0: return 273;
                    case 1: return 261; 
                    case 2: return 266;
                    case 3: return 301;
                    case 4: return 266; }
            case 63:
               switch (dentinho.face){
                    case 0: return 273;
                    case 1: return 261; 
                    case 2: return 266;
                    case 3: return 301;
                    case 4: return 266; }
            case 64:
               switch (dentinho.face){
                    case 0: return 273;
                    case 1: return 261; 
                    case 2: return 266;
                    case 3: return 301;
                    case 4: return 266; }
            case 65:
                switch (dentinho.face){
                    case 0: return 273;
                    case 1: return 261; 
                    case 2: return 266;
                    case 3: return 301;
                    case 4: return 266; }

                
            case 71:
               switch (dentinho.face){
                    case 0: return 341;
                    case 1: return 329; 
                    case 2: return 334;
                    case 3: return 369;
                    case 4: return 334; }
            case 72:
               switch (dentinho.face){
                    case 0: return 341;
                    case 1: return 329; 
                    case 2: return 334;
                    case 3: return 369;
                    case 4: return 334; }
            case 73:
                switch (dentinho.face){
                    case 0: return 341;
                    case 1: return 329; 
                    case 2: return 334;
                    case 3: return 369;
                    case 4: return 334; }
            case 74:
               switch (dentinho.face){
                    case 0: return 341;
                    case 1: return 329; 
                    case 2: return 334;
                    case 3: return 369;
                    case 4: return 334; }
            case 75:
               switch (dentinho.face){
                    case 0: return 341;
                    case 1: return 329; 
                    case 2: return 334;
                    case 3: return 369;
                    case 4: return 334; }

               
            case 81:
               switch (dentinho.face){
                    case 0: return 341;
                    case 1: return 329; 
                    case 2: return 334;
                    case 3: return 369;
                    case 4: return 334; }
            case 82:
               switch (dentinho.face){
                    case 0: return 341;
                    case 1: return 329; 
                    case 2: return 334;
                    case 3: return 369;
                    case 4: return 334; }
            case 83:
                switch (dentinho.face){
                    case 0: return 341;
                    case 1: return 329; 
                    case 2: return 334;
                    case 3: return 369;
                    case 4: return 334; }
            case 84:
                switch (dentinho.face){
                    case 0: return 341;
                    case 1: return 329; 
                    case 2: return 334;
                    case 3: return 369;
                    case 4: return 334; }
            case 85:
                switch (dentinho.face){
                    case 0: return 341;
                    case 1: return 329; 
                    case 2: return 334;
                    case 3: return 369;
                    case 4: return 334; }
             }
        return 0;
    }
    
    public int Xfinal(Dente dentinho) { //talvez ele soh retorne as coordenadas x,y iniciais do dente!
        switch (dentinho.numeroDente) {
            case 11:
                switch (dentinho.face){
                    case 0: return 423;
                    case 1: return 431; 
                    case 2: return 435;
                    case 3: return 431;
                    case 4: return 395; }
            case 12:
                switch (dentinho.face){
                    case 0: return 371;
                    case 1: return 379; 
                    case 2: return 382;
                    case 3: return 379;
                    case 4: return 342;}
            case 13:
                switch (dentinho.face){
                    case 0: return 318;
                    case 1: return 327; 
                    case 2: return 330;
                    case 3: return 327;
                    case 4: return 290;}
            case 14:
                switch (dentinho.face){
                    case 0: return 266;
                    case 1: return 274; 
                    case 2: return 277;
                    case 3: return 274;
                    case 4: return 238;}
            case 15:
                switch (dentinho.face){
                    case 0: return 214;
                    case 1: return 225; 
                    case 2: return 222;
                    case 3: return 225;
                    case 4: return 186;}
            case 16:
                switch (dentinho.face){
                    case 0: return 161;
                    case 1: return 169; 
                    case 2: return 173;
                    case 3: return 169;
                    case 4: return 133;}
            case 17:
                switch (dentinho.face){
                    case 0: return 109;
                    case 1: return 117; 
                    case 2: return 120;
                    case 3: return 117;
                    case 4: return 81;}
            case 18:
                switch (dentinho.face){
                    case 0: return 57;
                    case 1: return 64;
                    case 2: return 68;
                    case 3: return 64;
                    case 4: return 29;}
                

            case 21:
                switch (dentinho.face){
                    case 0: return 495;
                    case 1: return 503; 
                    case 2: return 506;
                    case 3: return 503;
                    case 4: return 467;}
            case 22:
                switch (dentinho.face){
                    case 0: return 547;
                    case 1: return 555; 
                    case 2: return 559;
                    case 3: return 555;
                    case 4: return 519;}
            case 23:
                switch (dentinho.face){
                    case 0: return 600;
                    case 1: return 608; 
                    case 2: return 611;
                    case 3: return 608;
                    case 4: return 572;}
            case 24:
                switch (dentinho.face){
                    case 0: return 652;
                    case 1: return 660; 
                    case 2: return 663;
                    case 3: return 660;
                    case 4: return 624;}
            case 25:
                switch (dentinho.face){
                    case 0: return 704;
                    case 1: return 713; 
                    case 2: return 716;
                    case 3: return 713;
                    case 4: return 676;}
            case 26:
                switch (dentinho.face){
                    case 0: return 757;
                    case 1: return 765; 
                    case 2: return 768;
                    case 3: return 765;
                    case 4: return 729;}
            case 27:
                switch (dentinho.face){
                    case 0: return 809;
                    case 1: return 817; 
                    case 2: return 821;
                    case 3: return 817;
                    case 4: return 781;}
            case 28:
                switch (dentinho.face){
                    case 0: return 862;
                    case 1: return 869; 
                    case 2: return 873;
                    case 3: return 869;
                    case 4: return 834;}
                

            case 31:
                switch (dentinho.face){
                    case 0: return 495;
                    case 1: return 503; 
                    case 2: return 506;
                    case 3: return 503;
                    case 4: return 467;}
            case 32:
                switch (dentinho.face){
                    case 0: return 547;
                    case 1: return 555; 
                    case 2: return 559;
                    case 3: return 555;
                    case 4: return 519;}
            case 33:
                switch (dentinho.face){
                    case 0: return 600;
                    case 1: return 555; 
                    case 2: return 559;
                    case 3: return 555;
                    case 4: return 519;}
            case 34:
                switch (dentinho.face){
                    case 0: return 652;
                    case 1: return 660;
                    case 2: return 663;
                    case 3: return 660;
                    case 4: return 624;}
            case 35:
                switch (dentinho.face){
                    case 0: return 704;
                    case 1: return 712;
                    case 2: return 716;
                    case 3: return 712;
                    case 4: return 676;}
            case 36:
                switch (dentinho.face){
                    case 0: return 757;
                    case 1: return 765;
                    case 2: return 768;
                    case 3: return 765;
                    case 4: return 729;}
            case 37:
                switch (dentinho.face){
                    case 0: return 809;
                    case 1: return 821; 
                    case 2: return 817;
                    case 3: return 821;
                    case 4: return 781;}
            case 38:
                switch (dentinho.face){
                    case 0: return 861;
                    case 1: return 873; 
                    case 2: return 870;
                    case 3: return 873;
                    case 4: return 833;}


            case 41:
                switch (dentinho.face){
                    case 0: return 423;
                    case 1: return 431; 
                    case 2: return 435;
                    case 3: return 431;
                    case 4: return 395;}
            case 42:
                switch (dentinho.face){
                    case 0: return 371;
                    case 1: return 379;
                    case 2: return 383;
                    case 3: return 379;
                    case 4: return 343;}
            case 43:
                switch (dentinho.face){
                    case 0: return 318;
                    case 1: return 326;
                    case 2: return 330;
                    case 3: return 326;
                    case 4: return 290;}
            case 44:
                switch (dentinho.face){
                    case 0: return 266;
                    case 1: return 274; 
                    case 2: return 277;
                    case 3: return 274;
                    case 4: return 238;}
            case 45:
                switch (dentinho.face){
                    case 0: return 213;
                    case 1: return 222;
                    case 2: return 255;
                    case 3: return 222;
                    case 4: return 186;}
            case 46:
                switch (dentinho.face){
                    case 0: return 161;
                    case 1: return 169;
                    case 2: return 173;
                    case 3: return 169;
                    case 4: return 133;}
            case 47:
                switch (dentinho.face){
                    case 0: return 109;
                    case 1: return 117;
                    case 2: return 120;
                    case 3: return 117;
                    case 4: return 81;}
            case 48:
                switch (dentinho.face){
                    case 0: return 56;
                    case 1: return 65; 
                    case 2: return 68;
                    case 3: return 65;
                    case 4: return 28;}
                

            case 51:
                switch (dentinho.face){
                    case 0: return 423;
                    case 1: return 431; 
                    case 2: return 435;
                    case 3: return 431;
                    case 4: return 395;}
            case 52:
                switch (dentinho.face){
                    case 0: return 371;
                    case 1: return 379; 
                    case 2: return 382;
                    case 3: return 379;
                    case 4: return 343;}
            case 53:
                switch (dentinho.face){
                    case 0: return 318;
                    case 1: return 326; 
                    case 2: return 330;
                    case 3: return 326;
                    case 4: return 290;}
            case 54:
                switch (dentinho.face){
                    case 0: return 266;
                    case 1: return 274; 
                    case 2: return 277;
                    case 3: return 274;
                    case 4: return 238;}
            case 55:
                switch (dentinho.face){
                    case 0: return 214;
                    case 1: return 222; 
                    case 2: return 225;
                    case 3: return 222;
                    case 4: return 186;}
                

            case 61:
                switch (dentinho.face){
                    case 0: return 495;
                    case 1: return 503;
                    case 2: return 506;
                    case 3: return 503;
                    case 4: return 467;}
            case 62:
                switch (dentinho.face){
                    case 0: return 547;
                    case 1: return 555;
                    case 2: return 559;
                    case 3: return 555;
                    case 4: return 519;}
            case 63:
                switch (dentinho.face){
                    case 0: return 600;
                    case 1: return 608;
                    case 2: return 611;
                    case 3: return 608;
                    case 4: return 572;}
            case 64:
                switch (dentinho.face){
                    case 0: return 652;
                    case 1: return 660; 
                    case 2: return 663;
                    case 3: return 660;
                    case 4: return 624;}
            case 65:
                switch (dentinho.face){
                    case 0: return 704;
                    case 1: return 713;
                    case 2: return 716;
                    case 3: return 713;
                    case 4: return 676;}
                

            case 71:
                switch (dentinho.face){
                    case 0: return 495;
                    case 1: return 503;
                    case 2: return 506;
                    case 3: return 503;
                    case 4: return 0;}
            case 72:
                switch (dentinho.face){
                    case 0: return 547;
                    case 1: return 555;
                    case 2: return 559;
                    case 3: return 555;
                    case 4: return 519;}
            case 73:
                switch (dentinho.face){
                    case 0: return 600;
                    case 1: return 608;
                    case 2: return 611;
                    case 3: return 608;
                    case 4: return 572;}
            case 74:
                switch (dentinho.face){
                    case 0: return 652;
                    case 1: return 660; 
                    case 2: return 663;
                    case 3: return 660;
                    case 4: return 624;}
            case 75:
                switch (dentinho.face){
                    case 0: return 704;
                    case 1: return 713;
                    case 2: return 716;
                    case 3: return 713;
                    case 4: return 676;}
                

            case 81:
                switch (dentinho.face){
                    case 0: return 423;
                    case 1: return 431;
                    case 2: return 435;
                    case 3: return 431;
                    case 4: return 395;}
            case 82:
                switch (dentinho.face){
                    case 0: return 371;
                    case 1: return 379; 
                    case 2: return 382;
                    case 3: return 379;
                    case 4: return 343;}
            case 83:
                switch (dentinho.face){
                    case 0: return 318;
                    case 1: return 326;
                    case 2: return 330;
                    case 3: return 326;
                    case 4: return 290;}
            case 84:
                switch (dentinho.face){
                    case 0: return 266;
                    case 1: return 274;
                    case 2: return 277;
                    case 3: return 274;
                    case 4: return 238;}
            case 85:
                switch (dentinho.face){
                    case 0: return 214;
                    case 1: return 222;
                    case 2: return 225;
                    case 3: return 222;
                    case 4: return 186;}
        }
        return 0;
    }

    public int Yfinal(Dente dentinho) { //talvez ele soh retorne as coordenadas x,y iniciais do dente!
        switch (dentinho.numeroDente) {
            case 11:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                
            case 12:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;
            case 13:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;
            case 14:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;
            case 15:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;
            case 16:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;
            case 17:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;
            case 18:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;

                
            case 21:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;
            case 22:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;
            case 23:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;
            case 24:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;
            case 25:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;
            case 26:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;
            case 27:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;
            case 28:
                switch (dentinho.face){
                    case 0: return 76;
                    case 1: return 48; 
                    case 2: return 84;
                    case 3: return 88;
                    case 4: return 84;}
                return 76;

                
            case 31:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
            case 32:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;
            case 33:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;
            case 34:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;
            case 35:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;
            case 36:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;
            case 37:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;
            case 38:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;

                
            case 41:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;
            case 42:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;
            case 43:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;
            case 44:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;
            case 45:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;
            case 46:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;
            case 47:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;
            case 48:
                switch (dentinho.face){
                    case 0: return 144;
                    case 1: return 116; 
                    case 2: return 151;
                    case 3: return 155;
                    case 4: return 151;}
                return 144;

                
            case 51:
                switch (dentinho.face){
                    case 0: return 289;
                    case 1: return 262; 
                    case 2: return 297;
                    case 3: return 301;
                    case 4: return 297;}
            case 52:
                switch (dentinho.face){
                    case 0: return 289;
                    case 1: return 262; 
                    case 2: return 297;
                    case 3: return 301;
                    case 4: return 297;}
                return 289;
            case 53:
                switch (dentinho.face){
                    case 0: return 289;
                    case 1: return 262; 
                    case 2: return 297;
                    case 3: return 301;
                    case 4: return 297;}
                return 289;
            case 54:
                switch (dentinho.face){
                    case 0: return 289;
                    case 1: return 262; 
                    case 2: return 297;
                    case 3: return 301;
                    case 4: return 297;}
                return 289;
            case 55:
                switch (dentinho.face){
                    case 0: return 289;
                    case 1: return 262; 
                    case 2: return 297;
                    case 3: return 301;
                    case 4: return 297;}
                return 289;

                
            case 61:
                switch (dentinho.face){
                    case 0: return 289;
                    case 1: return 262; 
                    case 2: return 297;
                    case 3: return 301;
                    case 4: return 297;}
                return 289;
            case 62:
                switch (dentinho.face){
                    case 0: return 289;
                    case 1: return 262; 
                    case 2: return 297;
                    case 3: return 301;
                    case 4: return 297;}
                return 289;
            case 63:
                switch (dentinho.face){
                    case 0: return 289;
                    case 1: return 262; 
                    case 2: return 297;
                    case 3: return 301;
                    case 4: return 297;}
                return 289;
            case 64:
                switch (dentinho.face){
                    case 0: return 289;
                    case 1: return 262; 
                    case 2: return 297;
                    case 3: return 301;
                    case 4: return 297;}
                return 289;
            case 65:
                switch (dentinho.face){
                    case 0: return 289;
                    case 1: return 262; 
                    case 2: return 297;
                    case 3: return 301;
                    case 4: return 297;}
                return 289;

                
            case 71:
                switch (dentinho.face){
                    case 0: return 357;
                    case 1: return 329; 
                    case 2: return 365;
                    case 3: return 369;
                    case 4: return 365;}
            case 72:
                switch (dentinho.face){
                    case 0: return 357;
                    case 1: return 329; 
                    case 2: return 365;
                    case 3: return 369;
                    case 4: return 365;}
            case 73:
                switch (dentinho.face){
                    case 0: return 357;
                    case 1: return 329; 
                    case 2: return 365;
                    case 3: return 369;
                    case 4: return 365;}
            case 74:
                switch (dentinho.face){
                    case 0: return 357;
                    case 1: return 329; 
                    case 2: return 365;
                    case 3: return 369;
                    case 4: return 365;}
            case 75:
                switch (dentinho.face){
                    case 0: return 357;
                    case 1: return 329; 
                    case 2: return 365;
                    case 3: return 369;
                    case 4: return 365;}
                return 357;

                
            case 81:
                switch (dentinho.face){
                    case 0: return 357;
                    case 1: return 329; 
                    case 2: return 365;
                    case 3: return 369;
                    case 4: return 365;}
                return 357;
            case 82:
                switch (dentinho.face){
                    case 0: return 357;
                    case 1: return 329; 
                    case 2: return 365;
                    case 3: return 369;
                    case 4: return 365;}
                return 357;
            case 83:
                switch (dentinho.face){
                    case 0: return 357;
                    case 1: return 329; 
                    case 2: return 365;
                    case 3: return 369;
                    case 4: return 365;}
                return 357;
            case 84:
                switch (dentinho.face){
                    case 0: return 357;
                    case 1: return 329; 
                    case 2: return 365;
                    case 3: return 369;
                    case 4: return 365;}
                return 357;
            case 85:
                switch (dentinho.face){
                    case 0: return 357;
                    case 1: return 329; 
                    case 2: return 365;
                    case 3: return 369;
                    case 4: return 365;}
                return 357;
        }
        return 0;
    }
    
    
    //falta implementar a recepcao de parametros e resposta dos metodos 
    public void printCenter(Dente dentinho){
         /*if ( dentinho.getFace() == 0 ){
                for (int x = dentinho.Xstart(dentinho); x <= dentinho.Xfinal(dentinho); x++){
                    for (int y = dentinho.Ystart(dentinho); (odontoColor.get(x,y) + 65794) == 0; y++){
                         if ((odontoColor.get(x,y) + 65794) == 0) {
                             odontoBuffer.setRGB(x, y, dentinho.getStatus());
                         }
                    }
                }
            }*/
    }
    
    public void printUp(Dente dentinho) { 
            /*
            if (dentinho.getFace() == 1 ){
                for (int x = dentinho.Xstart(dentinho); x <= dentinho.Xfinal(dentinho); x++){
                    for (int y = dentinho.Ystart(dentinho); (odontoColor.get(x,y) + 65794) == 0; y++){        
                         if ((odontoColor.get(x,y) + 65794) == 0) {
                             odontoBuffer.setRGB(x, y, dentinho.getStatus());
                         }
                    }
                }
            } */        
    }
    
    public void printRight(Dente dentinho) { //trapezio da direita
        /* if (dentinho.getFace() == 2){
                for (int y = dentinho.Ystart(dentinho); y <= dentinho.Xfinal(dentinho); y++){
                    for (int x = dentinho.Xstart(dentinho); (odontoColor.get(x,y) + 65794) == 0; x--){              
                         if ((odontoColor.get(x,y) + 65794) == 0) {
                             odontoBuffer.setRGB(x, y, dentinho.getStatus());
                         }
                    }
                }
            } */ 
    }

    public void printLeft(Dente dentinho) { //trapezio da esquerda
        /* if (dentinho.getFace() == 4){
                for (int y = dentinho.Xstart(dentinho); y <= dentinho.Yfinal(dentinho); y++){
                    for (int x = dentinho.Xstart(dentinho); (odontoColor.get(x,y) + 65794) == 0; x++){
                         if ((odontoColor.get(x,y) + 65794) == 0) {
                             odontoBuffer.setRGB(x, y, dentinho.getStatus());
                         }
                    }
                }
            }  */
        
    }

}