package javaBasico.Eventos_XML_JSON.xml;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ParsearXML {
    public static void main(String[] args) {

        //Copie un "datos.xml" fuera para que funcione
        File file = new File("datos.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            try {
                //Analizamos el documento
                Document document = documentBuilder.parse(file);//Aqui le paso el archivo XML

                //Obtenemos usuario y clave
                String usuario = document.getElementsByTagName("usuario").item(0).getTextContent();
                //Traigo el elemento atravez del TAG / item(0) por si es un ARRAY, como el caso de <videos> / getTextContent, es lo que hay adentro de la etiqueta o tag
                String clave = document.getElementsByTagName("clave").item(0).getTextContent();

                //Mostrar usuario y clave
                System.out.println("usuario: "+usuario+" ; clave: "+clave);

                //Vamos a mostrar el atributo "proveedor" -> <videos proveedor="vimeo">
                NamedNodeMap atributos = document.getElementsByTagName("videos").item(0).getAttributes();
                //Devuelve un array de atributos
                for (int i = 0 ; i < atributos.getLength() ; i++){
                    String atributoNombre = atributos.item(i).getNodeName();
                    String atributoValor = atributos.item(i).getNodeValue();

                    System.out.println("Nombre del atributo: "+ atributoNombre+" ; Valor del atributo: "+atributoValor);
                }

                //Mostramos los videos que hay asocioados
                NodeList videos = document.getElementsByTagName("videos");

                for (int i = 0 ; i < videos.getLength() ; i++){
                    Node video = videos.item(i);
                    System.out.println(video.getTextContent());
                }


            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
