package com.pdf;

import java.io.FileOutputStream;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Pdfgenrator 
{
	 public static void main(String args[])
	 {
	        Document document = new Document(PageSize.A4);
	        document.addAuthor("Abhishek");
	        document.addTitle("Demo for Itext");
	        
	        System.out.println("document created....");
	       try
	       {
	    	PdfWriter.getInstance(document, new FileOutputStream("Helloworld.pdf"));
	    	System.out.println("writer instance created....");
		        document.open();
		        System.out.println("document open....");
		        Paragraph para=new Paragraph("Hello World!");
		        document.add(para);
		        System.out.println("para added to document....");
		       
	       }
	    catch (Exception e) 
	       {
	    	 System.out.println("e");
		}
	        document.close();
	        System.out.println("document closed....");
	 }
}
	       