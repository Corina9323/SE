/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Gabriela
 * version 1.0
 */
public class Client {

   
    public static void main(String[] args) throws UnknownHostException, IOException {
  
       Socket ligneServeur = new Socket("localhost", 7777);
       //PrintWriter  out = new PrintWriter(ligneServeur.getOutputStream());
       PrintStream  out = new PrintStream(ligneServeur.getOutputStream());
       System.out.println("Entree le nom: ");
       InputStreamReader rd = new InputStreamReader(System.in);
       BufferedReader ed = new BufferedReader(rd);
       String temp =ed.readLine();
       out.println(temp);
       BufferedReader in = new BufferedReader(new InputStreamReader(ligneServeur.getInputStream()));
       //String tm = in.readLine();
       //System.out.println(tm);
       
       // String messageClient = "Mme. M";
       //String gt = in.readLine();
       //System.out.println(gt);

        //System.out.println(messageClient);
        System.out.println("La reponse du serveur : " + in.readLine());
        out.close();
        in.close();
        ligneServeur.close();
    }	

}












