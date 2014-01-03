package com.Kei

import java.io._


class LogX {
    var pathdef = "/Users/keitaroemotion/dev/"
      
    def println{
    		print("\n")
    }
    
    def pln{
    		print("\n")
    }
    
    def p(t:String){
    		print(t)
    }
    
    def pTab(t:String){
    		print(t+"	")
    }
    
    def p{
    		print("")
    }
    
    def pln(text:String){
    		print(text+"\n")
    }
    
    def pln(text:Int){
    		print(text+"\n")
    }
    
    def err(e:Exception):Exception={
    		print(e.getMessage().toString+ "\n")
    		e
    }
    
    def err(msg:String):Exception={
    		print(msg.toString+ "\n")
    		new Exception(msg)
    }
    
    def err(e:Exception, text:String):Exception = {
    		print(e.getMessage.toString+"|"+text+ "\n")
    		e
    }
    
    def println(e:Exception, text:String){
    		print(e.getMessage.toString+"|"+text+ "\n")
    }
    
    def println(e:Exception){
    		print(e.getMessage.toString+ "\n")
    }
    
    def println(str:String){
    		print(str+"\n")
    }
      
    def GetMethodName:String={
		Thread.currentThread().getStackTrace()(2).toString()
	}
    def GetMethodName(idx:Int):String={
		Thread.currentThread().getStackTrace()(idx).toString()
	}
    
    
    var d = new DateX
    
	private def print(str:String){
	   
	    val mn = GetMethodName(4).replace('.', '|')
		val fw = new BufferedWriter( new FileWriter(pathdef+ d.popDateShort+ ".txt", true))
	    try {
	    		fw.append(d.popDateLong.toString+"|" + mn+"|"+str+"\n")
	    } finally {
	    		fw.close()
	    }
	}
    
  
}