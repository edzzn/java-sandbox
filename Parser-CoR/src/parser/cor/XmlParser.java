/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.cor;

/**
 *
 * @author Estudiante
 */
public class XmlParser extends Parser {
   
  @Override
  public void parse(String fileName) {
    if ( canHandleFile(fileName, ".xml")){
      System.out.println("A XML parser is handling the file: "+fileName);
    }
    else{
      super.parse(fileName);
    }
  }
 
}