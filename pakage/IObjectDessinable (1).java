package package1;

import java.awt.Graphics;

public class IObjectDessinable {

	private final String objType;
	
	public IObjectDessinable (String s) {
		objType = s ;
	}
	
    public void dessiner (Graphics g) {
    	if (objType=="tarinCercel") {
    	    // dessiner la tête
        	leDebut.dessiner(g);
            for (Cercle c : lesCercles) {
                c.dessiner(g);
            }
    		
    	}
    	
    	
    	else {
    		   // dessiner le contour du visage
            g.drawOval(xhg, yhg, largeur, hauteur);

            // dessiner la bouche
            if (impassible) {
                g.drawLine(xhg + largeur / 4, yhg + (2 * hauteur) / 3,
                        xhg + (3 * largeur) / 4, yhg + (2 * hauteur) / 3);
            } else {
                g.drawArc(xhg + largeur / 4, yhg + (2 * hauteur) / 3,
                        largeur / 2, hauteur / 5, -45, -90);
            }

            // dessiner les yeux
            int largeurOeil = largeur / 5;
            int hauteurOeil = hauteur / 5;
            g.drawOval(xhg + largeurOeil, yhg + hauteurOeil, largeurOeil,
                    hauteurOeil);
            g.drawOval(xhg + 3 * largeurOeil, yhg + hauteurOeil, largeurOeil,
                    hauteurOeil);
    		
    	}
    }

	
	
	
}
