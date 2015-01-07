package com.sample;

import javax.swing.JOptionPane;

import org.eclipse.jdt.internal.core.SetContainerOperation;

public final class Ask{
	
	public static boolean yesNo(String question){		
		return JOptionPane.showConfirmDialog(null, question, "Pytanie", JOptionPane.YES_NO_OPTION) == 0;
	}
	
	public static int inputInt(String question){
		int a = -1;
		try{
			a = Integer.parseInt(JOptionPane.showInputDialog(question));
		}catch(NumberFormatException e){
			a = -1;
		}	
		
		return a;
	}
	
/*	public static String chooseOne(String question, String...args){
		Object ob = JOptionPane.showInputDialog(null, question, "Input", JOptionPane.INFORMATION_MESSAGE, null,
		args, args[0]);
		
		return ob.toString();
	}*/
	
	public static int chooseOne(String question, String...args){
		int n = JOptionPane.showOptionDialog(null,
			    question,
			    "Pytanie",
			    JOptionPane.YES_NO_CANCEL_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,
			    args,
			    args[0]);
		return n;
	}
	
	public static void answer(String value){
		JOptionPane.showMessageDialog(null, value, "Wiadomoœæ", JOptionPane.INFORMATION_MESSAGE); 
	}
	
}
