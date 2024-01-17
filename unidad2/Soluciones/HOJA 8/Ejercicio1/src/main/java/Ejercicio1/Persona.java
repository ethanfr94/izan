package Ejercicio1;

public class Persona {
	private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
//  Un  constructor  que  inicializa  los  atributos  con  los  valores  pasados  como 
//argumentos
    public Persona(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }
  /*  Un  método  llamado  contraseña  que  devuelve  la  contraseña  de  la  persona 
(formada por la primera letra del nombre, las 3 primeras letras de apellido1 y la 
última letra de apellido2).
*/  
    public String contrasenia(){
    String contra="";
    char letra;
    if(nombre.length()>0){
        letra=nombre.charAt(0);
        contra=contra+letra;
    }
    if(apellido1.length()>=3){
        contra=contra+apellido1.substring(0,3);
    }else{
        contra=contra+apellido1;
    }
   
    
    if(apellido2.length()>0){
        letra=apellido2.charAt(apellido2.length()-1);
        contra=contra+letra;
    }
    return contra;
    }
 /*  Un método llamado dniValido que devuelve verdadero si el dni es válido y falso en 
otro caso. (Controlar que tenga 9 caracteres y la letra correspondiente)
NOTA: para calcular la letra se divide el número del dni entre 23 y el resto obtenido 
será  la  posición  de  la  letra  del  dni  en  la  siguiente  cadena 
“TRWAGMYFPDXBNJZSQVHLCKE”*/ 
    public boolean dniValido(){
        boolean resul=false;
        String clave="TRWAGMYFPDXBNJZSQVHLCKE";
        if(dni.length()==9){
            String dniNumeros=dni.substring(0, 8);
            char letraDni=dni.charAt(8);
            long num=Integer.parseInt(dniNumeros);
            int resto=(int)num%23;
            char letraValida=clave.charAt(resto);
            if (letraDni==letraValida)
                resul=true;
            
        }
    return resul;
    }
}
