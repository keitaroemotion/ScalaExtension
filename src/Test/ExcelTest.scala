package Test


import org.apache.poi._
import org.apache.poi.hssf.usermodel._
import org.junit._

class ExcelTest {
				
  
      def mkList():List[List[String]]={
    		  	var list = List[List[String]]()
    		  	list = list.+:(List("101","1","111","1111","11111"))
    		  	list = list.+:(List("202","2","222","222222","22"))
    		  	list = list.+:(List("303","3","333","3333","3"))
    		  	list
      }
	  @Test def outputTest{
		  		var outdir = "/Users/keitaroemotion/dev/"
                new com.Kei.Excel().WriteFile(outdir,1,mkList,"aaa")
	  }
	  
	  
	  
	  
	  
  	  
	  
}