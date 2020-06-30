package dev;
import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

public class App {
  public static void main(String[] args) {
	ResourceBundle bundle = ResourceBundle.getBundle("application");
	String titre = bundle.getString("titre");
	
    String asciiArt = FigletFont.convertOneLine(titre);
    System.out.println(asciiArt);
    
    String environnement = ResourceBundle.getBundle("application").getString(
    		"environnement");
    System.out.println("Environnement : " + environnement);
  }
}
