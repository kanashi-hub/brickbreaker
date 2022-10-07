import java.awt.*;

public class GeneradorDeMapa {
    public int mapa[][];
    public int anchoLadrillo;
    public int altoLadrillo;
    public GeneradorDeMapa(int row, int col){
        mapa = new int [row][col];
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                mapa[i][j]=1;
            }
        }
        anchoLadrillo=540/col;
        altoLadrillo=150/row;
    }
    public void dibujar(Graphics2D g){
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++){
            if(mapa[i][j]>0){
                g.setColor(Color.white);
                g.fillRect(j*anchoLadrillo + 80, i * altoLadrillo + 50,anchoLadrillo,altoLadrillo);
                g.setStroke(new BasicStroke(3));
                g.setColor(Color.blue);
                g.drawRect(j*anchoLadrillo + 80, i * altoLadrillo + 50,anchoLadrillo,altoLadrillo);
            }
            }
        }
    }
    public void setBrickValue(int value, int row, int col){
        mapa[row][col] = value;
    }

}
