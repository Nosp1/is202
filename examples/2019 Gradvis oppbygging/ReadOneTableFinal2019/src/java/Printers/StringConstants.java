/*
 * Purpose of this interface is to have a tool to easier produce
 * web pages. 
 */
package Printers;

/**
 *
 * @author hallgeir
 */
public interface StringConstants {

        String DIV ="<div class = '%s'>";
        String FORM  = "<form action = '%s'  method = POST>";  
        String INP = "<input type='%s' & name='%s' & value='%s'>" +"<br>";
        String INPPROT = "<input type='%s' & name='%s' & value='%s' & readonly=\"readonly\" >" +"<br>";  
        String INPREAD = "<input type='%s' & name='%s' & value='%s' size= '%s' readonly>";
        String INPSUB = "<input type='%s' & name='%s' & value='%s'>" +"  ";
        String TABLE = "<table>";
        String INPSUB5 = "<button type='%s' & formaction='%s'> %s </button>";
        String INPSUB6 = "<button type='%s'  formaction='%s' value='%s'/>";
         
        
      
         
}
