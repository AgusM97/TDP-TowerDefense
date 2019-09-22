package Transformators;

import Game.Pair;

public class Transformator {
	
	/**Tansforma coordenadas isometricas a coordenadas 2d
	 * 
	 */
	public Pair isometricTo2D(Pair iso) {
		
		Pair temp2D=new Pair();
		temp2D.setX((2*iso.getY()+iso.getX())/2);
		temp2D.setY((2*iso.getY()-iso.getX())/2);
		return temp2D;
	}
	
	public Pair twoDToIso(Pair twoD) {
		
		Pair tempIso=new Pair();
		tempIso.setX(twoD.getX()-twoD.getY());
		tempIso.setY((twoD.getX()+twoD.getY())/2);
		return tempIso;
	}

}
