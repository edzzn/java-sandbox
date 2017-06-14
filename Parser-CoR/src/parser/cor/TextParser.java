/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.cor;

public class TextParser extends Parser{
 
  public TextParser(Parser successor){
    this.setSuccessor(successor);
  }
   
  @Override
  public void parse(String fileName) {
    if ( canHandleFile(fileName, ".txt")){
      System.out.println("A text parser is handling the file: "+fileName);
    }
    else{
      super.parse(fileName);
    }
     
  }
 
}