/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Ricardo
 */
public class NewCreateHTML {
    public void generarHTML(){
        
        try {
            String ruta = "C:\\Users\\Administrador\\Documents\\NetBeansProjects\\filename.html";
            String contenido = "<html>\n" +
                                "    <head>\n" +
                                "          <title>imagenes ! </title>\n" +
                                "    </head>\n"
                    + "<body>\n"
                    + "<p>hola MUNDO</p>"
                    + "</body>\n"
                    + "</html>";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
        File htmlTemplateFile = new File("path/template.html");
        String htmlString = FileUtils.readFileToString(htmlTemplateFile);
        String title = "New Page";
        String body = "This is Body";
        htmlString = htmlString.replace("$title", title);
        htmlString = htmlString.replace("$body", body);
        File newHtmlFile = new File("path/new.html");
        FileUtils.writeStringToFile(newHtmlFile, htmlString);*/
    }
   }
