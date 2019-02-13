/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author jvega
 */
//This are nested clases

class NestedClass{  
 private int data=30;  
 class Inner extends NestedClass{ 
  //Super is not necessary   
  void msg(){System.out.println("data is "+super.data);}  
 }  
 
 
 public static void main(String args[]){  
  NestedClass obj = new NestedClass();  
  NestedClass.Inner in = obj.new Inner();  
  in.msg();  
 }
 
}  
