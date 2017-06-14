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
public class CsvParser extends Parser {
 
  public CsvParser(Parser successor){
    this.setSuccessor(successor);
  }
   
  @Override
  public void parse(String fileName) {
    if ( canHandleFile(fileName, ".csv")){
      System.out.println("A CSV parser is handling the file: "+fileName);
    }
    else{
      super.parse(fileName);
    }
  }
 
}