package com.sample;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
            KnowledgeBase kbase = readKnowledgeBase();
            StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
            KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
            // go !
//            Message message = new Message();
//            message.setMessage("Hello World");
//            message.setStatus(Message.HELLO);
//            ksession.insert(message);
            ksession.fireAllRules();
            logger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static KnowledgeBase readKnowledgeBase() throws Exception {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("Sample.drl"), ResourceType.DRL);
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        return kbase;
    }

    public static class Age  {
    	private int value;
    	
    	public Age(int v){
    		value = v;
    	}
    	
		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}  	
  
    }
    
    public static class Budget {
    	private int value;
    	
    	public Budget(int c){
    		value = c;
    	}
		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		} 	
    }
    
    public static class Sex {
    	private int value;
    	
    	public Sex(int b){
    		value = b;
    	}	
    }
    
    public static class Entertainment {
    	private boolean value;
    	
    	public Entertainment(boolean n){
    		value = n;
    	}
		public boolean isValue() {
			return value;
		}

		public void setValue(boolean value) {
			this.value = value;
		} 	
    }
    
    public static class Acrophobia { //lek wysokosci
    	private boolean value;
    	
    	public Acrophobia(boolean l){
    		value = l;
    	}
		public boolean isValue() {
			return value;
		}

		public void setValue(boolean value) {
			this.value = value;
		}
    }
    
    public static class Sea { //morze czy gory 
    	private boolean value;
    	
    	public Sea(boolean b){
    		value = b;
    	}
		public boolean isValue() {
			return value;
		}

		public void setValue(boolean value) {
			this.value = value;
		}
    }
    
    public static class Warm { 
    	private boolean value;
    	
    	public Warm(boolean v){
    		value = v;
    	}
		public boolean isValue() {
			return value;
		}

		public void setValue(boolean value) {
			this.value = value;
		}
    }
    
    public static class Color {
    	private int value;
    	
    	public Color(int v){
    		setValue(v);
    	}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
    }
    
    public static class Culture { 
    	private int value;
    	
    	public Culture(int v){
    		setValue(v);
    	}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
    }
    
    public static class FearOfDeath {
    	private boolean value;
    	
    	public FearOfDeath(boolean b){
    		value = b;
    	}
		public boolean isValue() {
			return value;
		}

		public void setValue(boolean value) {
			this.value = value;
		}
    }
    
    public static class FarTravel{
    	private boolean value;
    	
    	public FarTravel(boolean b){
    		setValue(b);
    	}

		public boolean isValue() {
			return value;
		}

		public void setValue(boolean value) {
			this.value = value;
		}    	
    }
    
    public static class Fastfood{
    	private boolean value;
    	
    	public Fastfood(boolean v){
    		value = v;
    	}

		public boolean isValue() {
			return value;
		}

		public void setValue(boolean value) {
			this.value = value;
		}
    }
    
    public static class ChineseFood{
    	private boolean value;

    	public ChineseFood(boolean v){
    		value = v;
    	}
    	
		public boolean isValue() {
			return value;
		}

		public void setValue(boolean value) {
			this.value = value;
		}
    }
    
    public static class ExoticFruits{
    	public ExoticFruits(boolean value) {
			this.value = value;
		}

		private boolean value;

		public boolean isValue() {
			return value;
		}

		public void setValue(boolean value) {
			this.value = value;
		}
    }
}
