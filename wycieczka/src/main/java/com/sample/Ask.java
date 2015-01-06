package com.sample;

import javax.swing.JOptionPane;

public final class Ask{
	
	public static boolean yesNo(String question, String title){		
		return JOptionPane.showConfirmDialog(null, question, title, JOptionPane.YES_NO_OPTION) == 0;
	}
	
	public static int inputInt(String question){		
		return Integer.parseInt(JOptionPane.showInputDialog(question));
	}
	
	public static String chooseOne(String question, String...args){
		Object ob = JOptionPane.showInputDialog(null, question, "Input", JOptionPane.INFORMATION_MESSAGE, null,
		args, args[0]);
		
		return ob.toString();
	}
	
/*	public static String chooseOne(String question, String...args){
		int n = JOptionPane.showOptionDialog(null,
			    question,
			    "Pytanie",
			    JOptionPane.YES_NO_CANCEL_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,
			    args,
			    args[0]);
		return "sasd";
	}*/
	
}
