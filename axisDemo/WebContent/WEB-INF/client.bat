
set Axis_Lib=F:\workspace\axisDemo\WebContent\WEB-INF\lib
set Java_Cmd=java -Djava.ext.dirs=%Axis_Lib%
set Output_Path=F:\workspace\axisDemo\src
set Package=com.exhui.axis.client
%Java_Cmd% org.apache.axis.wsdl.WSDL2Java -o%Output_Path% -p%Package% http://localhost:8080/axisDemo/services/webservcieDemo?wsdl