package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
         Main.Divide(10, 0);
//        System.out.println(divided);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "python.py");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie","");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> element : studentFiles.entrySet()) {
            String studentName = element.getKey();
            String fileName = element.getValue();
            int points = 0;
            try {
                points = Main.CheckFileExtension(fileName);
            } catch (Exception e) {
//                e.printStackTrace();
            }
            System.out.println(studentName + " has filename "+ fileName +" got points : "+ points);
        }

    }

    public static void Divide(int x, int y)
    {
        if(y==0){
            try{
                throw new ArithmeticException("You are trying to divide by 0");
            } catch(ArithmeticException e){
                e.printStackTrace();
                System.out.println("Exception occured");
            }
        } else {
            System.out.println(x/y);
        }


    }

    public static int CheckFileExtension(String fileName)
    {

        if (fileName == null|| fileName.isEmpty()) {
            try {
                throw new Exception("The file submitted is null or an empty string");
            }catch(Exception e){
                e.printStackTrace();
                return -1;
            }
        }else if(fileName.contains(".java")){
            return 1;
        } else  {
            // Write code here!
            return 0;
        }
    }
}