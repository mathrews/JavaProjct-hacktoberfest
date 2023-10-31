
public class Main {
	public static void main(String[] args) {
		System.out.println(capitalize("testecapitalize"));     
		System.out.println(capitalize("website"));          
		System.out.println(capitalize("@meuamiguinho"));    
		System.out.println(capitalize("essa frase completa."));
	}

	public static final String capitalize(String str) {  
		if (str == null || str.length() == 0) return str;  
		return str.substring(0, 1).toUpperCase() + str.substring(1);  
	} 

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}