/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import  Domain.auto;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import otrointento.frmauto;
import threads.Carrera;

/**
 *
 * @author fabian
 */
public class XMLCarreraManager {
    
    //variables
    private Document document;
    private Element root;
    private String path;
    int i=1;

    public XMLCarreraManager(String path) throws IOException, JDOMException {
        //ruta en la que se encuentra el archivo XML
        this.path = path;
        
        File fileCarrera = new File(path);//esto es solo para hacer validacion
        if(fileCarrera.exists()){
            
            //1. EL ARCHIVO YA EXISTE, ENTONCES LO CARGO EN MEMORIA
            
            //toma la estructura de datos y las carga en memoria
            SAXBuilder saxBuilder = new SAXBuilder();
            saxBuilder.setIgnoringElementContentWhitespace(true);
            
            //carga la memoria
            this.document = saxBuilder.build(path);
            this.root = this.document.getRootElement();
        }
        else{
            //2. EL ARCHIVO NO EXISTE, ENTONCES LO CREO Y LUEGO LO CARGO EN MEMORIA
            
            //CREAMOS EL ELEMENTO RAIZ
            this.root = new Element("Carreras");
            
            //CREAMOS EL DOCUMENTO
            this.document = new Document(this.root);
            
            //GUARDAMOS EN DISCO DURO
            storeXML();
        }
    }//end constructor
    
    //almacena en disco duro nuestro documento xml en la ruta especificada
    private void storeXML() throws IOException{
        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.output(document, new PrintWriter(path));
    }
    
    //metodo para insertar un nuevo estudiante en el documento xml
    public void insertCarrea(frmauto carrera) throws IOException{
        //INSERTAMOS EN EL DOCUMENTO EN MEMORIA
        //para insertar en xml, primero se crean los elementos
        
        //crear el estudiante
        Element eCarrera = new Element("Carrera");
        frmauto f=new frmauto();
        //agregamos atributo
        eCarrera.setAttribute("Velocidad",""+carrera.getjTextField2().getText() );
        
        //crear el elemento nombre
        Element eName = new Element("name");
        eName.addContent("thread"+i);
        i++;
        //creamos el elemento nota
        Element eImagen = new Element("Imagen");
        if(carrera.getCheckbox().equals(true)){
           eImagen.addContent("Imagen"); 
        } else{
            eImagen.addContent("Figura");
        }
        
        //agregar al elemento student el contenido de nombre y nota
        eCarrera.addContent(eName);
        eCarrera.addContent(eImagen);
        
        //AGREGAMOS AL ROOT
        this.root.addContent(eCarrera);
        
        //FINALMENTE: GUARDAR EN DD
        storeXML();
    }//end insert
    
    
    //delete
    public void deleteCarrera() throws IOException{
        List elementList = this.root.getChildren();
        elementList.remove(1);
        
        //FINALMENTE: GUARDAR EN DD
        storeXML();
    }
    
  
}