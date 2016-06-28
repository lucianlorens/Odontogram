package odontograma;

import ij.ImagePlus;
import ij.gui.ImageCanvas;
import ij.gui.ImageWindow;
import ij.io.FileSaver;
import ij.process.ColorProcessor;
import ij.process.ImageProcessor;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/*
 * @author lorensov
 */
public class Odontograma extends Dente {

    public static boolean contadorCheck(int contador) { //esse metodo checa para ver se o dente existe no odontograma ou nao
        switch (contador) {
            case 19: return false;
            case 20: return false;

            case 29: return false;
            case 30: return false;

            case 39: return false;
            case 40: return false;

            case 49: return false;
            case 50: return false;

            case 56: return false;
            case 57: return false;
            case 58: return false;
            case 59: return false;
            case 60: return false;

            case 66: return false;
            case 67: return false;
            case 68: return false;
            case 69: return false;
            case 70: return false;

            case 76: return false;
            case 77: return false;
            case 78: return false;
            case 79: return false;
            case 80: return false;
        }
        return true;
    }

    public static void main(String[] args) {

        ImagePlus odonto = new ImagePlus("Odontograma.png"); //carrega imagem
        ImageProcessor odontoProcessor = odonto.getProcessor(); //cria o processador da imagem
        BufferedImage odontoBuffer = odontoProcessor.getBufferedImage(); 
        //coloca a imagem do processador na memoria para alteracao local
        ColorProcessor odontoColor = new ColorProcessor (odontoBuffer);
            
        ArrayList<Dente> denteArray = new ArrayList<Dente>(); //uma array bruta com todos os objetos e sua construcao
        for (int contador = 11; contador < 86; contador++) { 
            if (contadorCheck(contador)) { denteArray.add(new Dente(contador)); } }
        
        int status = 0;
        int face = 0;

        for (int i = 0; i < 52; i++){

            if (status < 5){status++;}else{status=0;} //pintar mixado
            denteArray.get(i).setStatus(status); 
            
            if (face < 5){face++;}else{face=0;} //escolher faces variadas
            denteArray.get(i).setFace(0);
            
            if ( denteArray.get(i).getFace() == 0 ){
                for (int x = denteArray.get(i).Xstart(denteArray.get(i)); x <= denteArray.get(i).Xfinal(denteArray.get(i)); x++){
                    for (int y = denteArray.get(i).Ystart(denteArray.get(i)); (odontoColor.get(x,y) + 65794) == 0; y++){        

                         if ((odontoColor.get(x,y) + 65794) == 0) {
                             odontoBuffer.setRGB(x, y, denteArray.get(i).getStatus());
                         }
                    }
                }
            }
            /** This part of the code isn't working right
             *  because the Dente.java is not mapped fully right, so there are problem with the x's and y'x coordenates
            if (denteArray.get(i).getFace() == 1){
                for (int y = denteArray.get(i).Ystart(denteArray.get(i)); y <= denteArray.get(i).Xfinal(denteArray.get(i)); y++){
                    for (int x = denteArray.get(i).Xstart(denteArray.get(i)); (odontoColor.get(x,y) + 65794) == 0; x--){        

                         if ((odontoColor.get(x,y) + 65794) == 0) {
                             odontoBuffer.setRGB(x, y, denteArray.get(i).getStatus());
                         }
                    }
                }
             } 
            
            if (denteArray.get(i).getFace() == 2){
                for (int y = denteArray.get(i).Ystart(denteArray.get(i)); y <= denteArray.get(i).Xfinal(denteArray.get(i)); y++){
                    for (int x = denteArray.get(i).Xstart(denteArray.get(i)); (odontoColor.get(x,y) + 65794) == 0; x--){        
       
                         if ((odontoColor.get(x,y) + 65794) == 0) {
                             odontoBuffer.setRGB(x, y, denteArray.get(i).getStatus());
                         }
                    }
                }
            } */
        
            if ( denteArray.get(i).getFace() == 3){
                for (int x = denteArray.get(i).Xstart(denteArray.get(i)); x <= denteArray.get(i).Xfinal(denteArray.get(i)); x++){
                    for (int y = denteArray.get(i).Ystart(denteArray.get(i)); (odontoColor.get(x,y) + 65794) == 0; y--){        

                         if ((odontoColor.get(x,y) + 65794) == 0) {
                             odontoBuffer.setRGB(x, y, denteArray.get(i).getStatus());
                         }
                    }
                }
            }
        /** same problem up there
            if ( denteArray.get(i).getFace() == 4){
                for (int y = denteArray.get(i).Xstart(denteArray.get(i)); y <= denteArray.get(i).Yfinal(denteArray.get(i)); y++){
                    for (int x = denteArray.get(i).Xstart(denteArray.get(i)); (odontoColor.get(x,y) + 65794) == 0; x++){        

                         if ((odontoColor.get(x,y) + 65794) == 0) {
                             odontoBuffer.setRGB(x, y, denteArray.get(i).getStatus());
                         }
                    }
                }
            } */
    }
        
     /* for (int p = 0; p < 52; p++) { denteArray.get(p).relatorioDental(denteArray.get(p));  } */

        ImagePlus odontoPlus = new ImagePlus("Odontograma", odontoBuffer); //classe onde junta o buffer com imagem
        ImageCanvas odontoCanvas = new ImageCanvas(odontoPlus);
        ImageWindow odontoWindow = new ImageWindow(odontoPlus, odontoCanvas); //cria objeto janela usando o Canvas
        odontoWindow.paste(); //mostra janela
        
        FileSaver odontoSaver = new FileSaver(odontoPlus); //cria o salvador da imagem
        odontoSaver.saveAsPng("OdontoPaint.png"); //salva a imagem no endereco descrito
    }
}
