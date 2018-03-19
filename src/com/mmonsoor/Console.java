package com.mmonsoor;

import java.io.File;
import java.io.IOException;

/**
 * @Nouvelle classe représentant la console
 * @author MMonsoor
 *
 */

public class Console {
	
	
	/**
	 * Ouvrir un fichier
	 * @param fileName Nom du fichier (sans extension)
	 * @param extension Nom de l'extension
	 * @return Fichier ouvert
	 */
	static File openFile(String fileName,String extension) {
		// On teste si l'extension est égale à tmp
		if(extension.equals("tmp")) {
			System.out.println("L'extenion est correcte.");
			
			try {
				//On va créer un fichier temporaire
				File.createTempFile(fileName, extension);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			System.out.println("L'extenion n'est pas correcte.");
		}
		
		return null;
		
	}
	

}
