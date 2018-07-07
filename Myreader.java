import java.io.*;
public  class Myreader{
    public void readfromfile(String fileName){
        FileReader fileReader=null;
        try{
            fileReader=new FileReader(fileName);
            int c;
            while((c=fileReader.read())!=-1){
                System.out.println(c);
            }
        }catch(FileNotFoundException fnfe){
                System.err.println(fnfe);
        } catch(IOException io){
        System.err.println(io);
        }finally{
        try{
            fileReader.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
        }
    } 


public void writeToAFile(String fileName,String input)
		throws IOException{
		FileWriter filewriter=new FileWriter("FileName");
		for(int i=0;i<input.length();i++){
			filewriter.write(input.charAt(i));
		}
		filewriter.close();
	}
}
		
