package com.fynn.basetest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReverseSortLog {
	public static void main(String args[]){
		reverseSort();
	}
	
	@SuppressWarnings("static-access")
	public static void reverseSort(){
		Map<String,Integer> ipMap = new HashMap<String,Integer>();
		
		try {
			// read file content from file
            StringBuffer sb= new StringBuffer("");
            FileReader reader = new FileReader("d://temp.txt");
            BufferedReader br = new BufferedReader(reader);

            String str = null;
            while((str = br.readLine()) != null) {
            	  String[] strArray = str.split(":");
            	  if(strArray.length == 3 && strArray[0].equals("访问url")){
            		  String ip = strArray[2];
                	  if(ipMap.containsKey(ip)){
                		  Integer count = ipMap.get(ip); 
                		  count = count + 1;
                		  ipMap.put(ip, count);
                	  }else{
                		  ipMap.put(ip, 1);
                	  }
            	  }
            }
            
            br.close();
            reader.close();
            
            int order = 1;
            while(!ipMap.isEmpty()){
            	Integer maxCount = new Integer(0);
                String maxKey = "";
                
                for (String key : ipMap.keySet()) {
    	              Integer count = ipMap.get(key);
    	              if(count.compare(count, maxCount) >= 0){
    	            	  maxCount = count;
    	            	  maxKey = key;
    	              }
            	}
                
                sb.append((order++) + ":" + maxKey + ",appear times:" + ipMap.get(maxKey) +"\n");
                ipMap.remove(maxKey);
            }
            
            // write string to file
            FileWriter writer = new FileWriter("d://result.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(sb.toString());
            bw.close();
            writer.close();
		} catch(FileNotFoundException e) {
            e.printStackTrace();
      }catch(IOException e) {
            e.printStackTrace();
      }
	}
}
