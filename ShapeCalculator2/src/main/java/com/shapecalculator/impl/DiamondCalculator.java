package com.shapecalculator.impl;

import com.shapecalculator.ShapeCalculator;

public class DiamondCalculator extends ShapeCalculator {

	public String calculateShape(Integer height, String label, Integer labelRow) throws Exception {
		String diamond = "";
		System.out.println("Entering calculateShape method");
		try{
			
			int labelLength = label.length();
	        int upperTriHeight = height - (height/2);
	        int lowerTriHeight = upperTriHeight - 1;
	        int lableRowFinal = labelRow != null? labelRow : (height/2);
	        String upperTri="", lowerTri="";
	        TriangleCalculator lowerTriangle = new TriangleCalculator();
	        TriangleCalculator upperTriangle = new TriangleCalculator();
	        if(lableRowFinal > upperTriHeight){
	        	upperTri = upperTriangle.getUpperTraingle(upperTriHeight, "", null);
	        	lowerTri = lowerTriangle.getLowerTraingle(lowerTriHeight, label, lableRowFinal-upperTriHeight);
	        }else{
	        	upperTri = upperTriangle.getUpperTraingle(upperTriHeight, label, labelRow);
	            lowerTri = lowerTriangle.getLowerTraingle(lowerTriHeight, "", null);
	        }
	        
	        //drawing lower triangle logic        
	        diamond = upperTri+lowerTri; 
			
		}catch(Exception e){
			System.out.println("Exception occurred : " + e.getMessage());
			throw e;
		}
		return diamond;
	}

}