package com.nama.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpPostEx
{
	//https://www.javaguides.net/2023/03/java-httpclient-post-request-example.html

	    public static void main(String[] args) 
	    		 {

             try {
            	//  postEmp(1,"Ram",5000.0);
            	// postEmp(2,"Sita",6000.0);
            	//  getEmp(1);
            	//  putEmp(1,"Rama",5000.0);
            	//  putEmp(3,"Gita",8000.0);
            	//  getAllEmps();
            	  deleteEmp(2);
            	  getAllEmps();
            	
            	
			  } 
             catch (IOException | InterruptedException e) 
             {			
				e.printStackTrace();
			  }
            
          				
				      
	    }
	    
	    
	    static void postEmp(int empId,String empName,double empSalary) throws IOException, InterruptedException
	    {
	    	
	    	 // json formatted data
	        String json = new StringBuilder()
	                .append("{")
	                .append("\"empId\":\"").append(empId).append("\",")
	                .append("\"empName\":\"").append(empName).append("\",")
	                .append("\"empSalary\":\"").append(empSalary).append("\"")
	                .append("}").toString();

	        HttpClient client = HttpClient.newHttpClient();

	        HttpRequest request = HttpRequest.newBuilder()
	                .header("Content-Type", "application/json")
	                .uri(URI.create("http://localhost:8085/emp"))
	                .POST(HttpRequest.BodyPublishers.ofString(json))
	                .build();

	        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

	        System.out.println("Status code: " + response.statusCode());
	        System.out.println("\n Body: " + response.body());
	        
	      
	    	    	
	    }
	    
	    
	    static void getEmp(int id) throws IOException, InterruptedException
	    {
	    	 
	    	   HttpClient httpClient = HttpClient.newBuilder()
				         .version(HttpClient.Version.HTTP_2)
				         .connectTimeout(Duration.ofSeconds(10))
				         .build(); 
	    	   
	    	   String uri = "http://localhost:8085/emp/"+id;
				      
				            HttpRequest request = HttpRequest.newBuilder()
				            .GET()
				            .uri(URI.create(uri))
				            .build();                              
				            HttpResponse<String> response = httpClient.send(request,
				            HttpResponse.BodyHandlers.ofString()); 

				         System.out.println("Status code: " + response.statusCode());                            
				         System.out.println("Headers: " + response.headers().allValues("content-type"));
				         System.out.println(response.body());
		}
	    
	    static void deleteEmp(int id) throws IOException, InterruptedException
	    {
	    	  HttpClient httpClient = HttpClient.newBuilder()
				         .version(HttpClient.Version.HTTP_2)
				         .connectTimeout(Duration.ofSeconds(10))
				         .build(); 
	    	   
	    	   String uri = "http://localhost:8085/emp/"+id;
				      
				            HttpRequest request = HttpRequest.newBuilder()
				            .DELETE()
				            .uri(URI.create(uri))
				            .build();                              
				            HttpResponse<String> response = httpClient.send(request,
				            HttpResponse.BodyHandlers.ofString()); 

				         System.out.println("Status code: " + response.statusCode());                            
				         System.out.println("Headers: " + response.headers().allValues("content-type"));
				         System.out.println(response.body());
	    }
	    
	    static void getAllEmps() throws IOException, InterruptedException
	    {
	    	  HttpClient httpClient = HttpClient.newBuilder()
				         .version(HttpClient.Version.HTTP_2)
				         .connectTimeout(Duration.ofSeconds(10))
				         .build(); 
	    	   
	    	   String uri = "http://localhost:8085/emps";
				      
				            HttpRequest request = HttpRequest.newBuilder()
				            .GET()
				            .uri(URI.create(uri))
				            .build();                              
				            HttpResponse<String> response = httpClient.send(request,
				            HttpResponse.BodyHandlers.ofString()); 

				         System.out.println("Status code: " + response.statusCode());                            
				         System.out.println("Headers: " + response.headers().allValues("content-type"));
				         System.out.println(response.body());
	    }
	    
	    static void putEmp(int empId,String empName,double empSalary) throws IOException, InterruptedException
	    {
	    	
	    	 // json formatted data
	        String json = new StringBuilder()
	                .append("{")
	                .append("\"empId\":\"").append(empId).append("\",")
	                .append("\"empName\":\"").append(empName).append("\",")
	                .append("\"empSalary\":\"").append(empSalary).append("\"")
	                .append("}").toString();

	        HttpClient client = HttpClient.newHttpClient();

	        HttpRequest request = HttpRequest.newBuilder()
	                .header("Content-Type", "application/json")
	                .uri(URI.create("http://localhost:8085/emp"))
	                .PUT(HttpRequest.BodyPublishers.ofString(json))
	                .build();

	        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

	        System.out.println("Status code: " + response.statusCode());
	        System.out.println("\n Body: " + response.body());
	        
	      
	    	    	
	    }
	    
}


