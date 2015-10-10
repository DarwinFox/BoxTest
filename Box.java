//******************************************************************************************
//Box.java		 	Author: Harrison Fox 
//
//Implements a class to represent a box including, dimensions, volume and if it is full.
//******************************************************************************************
import java.util.*;

public class Box{
	int height;
	int width;
	int depth;
	int volume;
	boolean full;
	String boxStatus;

	public Box(int tall, int wide, int deep){
		height = tall;
		width = wide;
		depth = deep;
		full = false;
	}

	public int setHeight(int tall){
		height = tall;
		return height;
	}

	public int getHeight(){
		return height;
	}

	public int setWidth(int wide){
		height = wide;
		return width;
	}

	public int getWidth(){
		return width;
	}

	public int setDepth(int deep){
		depth = deep;
		return depth;
	}

	public int getDepth(){
		return depth;
	}

	public int calcVolume(){
		volume = (height * width * depth);
		return volume;
	}

	public boolean fillBox(){
		full = true;
		return full;
	}

	public String toString(){

		if (full){
			boxStatus = "full";
		}
		else{
			boxStatus = "empty";
		}	

		return "Your box dimensions are Height: " + height + " Width: " + width + " Depth: " + depth + " Volume: " + volume + " and your box is " + boxStatus;

	
	}
}
