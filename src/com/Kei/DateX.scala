package com.Kei

import java.util.Calendar

class DateX {
		var yearField:Int = 0;
		var monthField:Int = 0;
		var dayField:Int = 0;
  
		def popDateLong:String={
				popDate("yyyyMMddmmss")
		}
		
		def popDateShort:String={
				popDate("yyyyMMdd")
		}
		
		private def popDate(template:String):String={
			var dateFormat = new java.text.SimpleDateFormat(template)
			var cal = Calendar.getInstance()
			dateFormat.format(cal.getTime())
		}

		def Second:Int={
				new DateX().popDate("ss").toInt
    }
	
	def Minute:Int={
				new DateX().popDate("mm").toInt
    }
	
	def Hour:Int={
				new DateX().popDate("hh").toInt
    }
	
	def Day:Int={
				new DateX().popDate("dd").toInt
    }
	
	def Month:Int={
				new DateX().popDate("MM").toInt
    }
	def Year:Int={
				new DateX().popDate("yyyy").toInt
    }
	
}