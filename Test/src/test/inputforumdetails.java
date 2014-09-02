/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author G0pS
 */
 import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class inputforumdetails {
   // public static void main(String emp_id,String VName,String message){
    public static void main(String VName,String Ques1,String uname1,String Date1){   
  
	 try {
               
             
         String ip=new findip().ip();
                 String url1 ="http://"+ip+":8084/app2servlet/inputservlet";
		 String charset = "UTF-8";
		 String videoid = VName;
                 String Ques = Ques1;
                 String uname=uname1;
                 String Date=Date1;
		 String query = String.format("videoid=%s&Ques=%s&uname=%s&Date=%s",
                         URLEncoder.encode(videoid,charset),
                         URLEncoder.encode(Ques,charset),
                         URLEncoder.encode(uname,charset),
                          URLEncoder.encode(Date,charset));
//		 URL url = new URL("http://172.16.5.133:8084/app2servlet/inputservlet?videoid="+VName+"&emp_id="+emp_id+"&message="+message);
           //      URL url = new URL("http://192.168.6.162:8084/app2servlet/inputservlet?videoid="+VName+"&Ques="+Ques);
                 URL url = new URL(url1+"?"+query);
                
                 HttpURLConnection con =(HttpURLConnection) url.openConnection();
		 con.setRequestProperty("Accept-Charset", charset);
                System.out.println("1---1----1-----1");
		 con.setDoInput(true);
		 con.setDoOutput(true);
//		 con.setUseCaches(false);
		 con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//
//		 DataOutputStream printout = new DataOutputStream(con.getOutputStream());
//
//		 // This is the POST 
//		 String content ="email=jad939933@hotmail.com&pass=577383";
//
//
//		 printout.writeBytes(content);
//		 printout.flush();
//		 printout.close();
             try (DataInputStream input = new DataInputStream(con.getInputStream())) {
                 String str;
                 //Read the response
                 while (null != ((str = input.readLine()))) {
                 System.out.println("->---"+str);
                 }
             }


		 } catch (MalformedURLException ex) {
		 } catch (IOException ex) {
			 System.out.println("Exception---"+ex);
		 }
  }
}