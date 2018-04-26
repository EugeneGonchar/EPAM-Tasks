package by.tc.task01.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TxtFileReader {
	private BufferedReader reader = null;
    private String line = "";

    public TxtFileReader(){
        this(new File("src\\main\\resources", "appliances_db.txt"));
    }
    
    public TxtFileReader(File file){
        try{
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file)));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void readNextLine(){
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String getLine() {
    	return this.line;
    }
    
    public void reset() {
    	try {
			reader.reset();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
