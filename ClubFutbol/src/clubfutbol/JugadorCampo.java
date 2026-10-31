/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubfutbol;

/**
 *
 * @author oscar
 */
public class JugadorCampo extends miembroEquipo{

    
    private String posicionTactica;
    private int golesMarcados;
    
    public JugadorCampo(String liga, int goles){
        
        super(liga);
        this.golesMarcados= goles;
    }
    
    public String getPosicionTactica() {
        return posicionTactica;
    }//Fin GetPosicionTactica
    
    public void setPosicionTactica(String posicionTactica) {
        if(posicionTactica.isBlank()){
            this.posicionTactica = "Sin Posicion";
        }
        else{
            this.posicionTactica = posicionTactica;
        }  
    }//Fin setPosicionTactica
    
    public int getGolesMarcados() {
        return golesMarcados;
    }//Fin getGoles Marcados
    
    public void setGolesMarcados(int golesMarcados) {
        if(golesMarcados<0){
            this.golesMarcados = 0;
            System.out.println("No pueden haber goles negativos");
        }else{
            this.golesMarcados = golesMarcados;
        }
    }//Fin setGolesMarcados
    
    public void disputarPartido(){
        int goles=0;
        System.out.println("Selecionado Oficial");
        System.out.println("------------------");
        
        iniciarPretemporada();
        System.out.printf("Jugador Proveniente de: %s, sale a la cancha",this.ligaOrigen);
        
        while(goles<=this.golesMarcados){
            if(goles %2 == 0){
                System.out.printf("Gol #%d Par anotado de pierna izquierda.\n",goles+1);
            }
            else{
                System.out.printf("Gol #%d Impar anotado de pierna derecha.\n",goles+1);
            }
            goles++;
        }//Fin de Ciclo While
        
        System.out.println("Prrrrrr.....Fin de Partido");
        
        setSumarMinutos(90);
    }//Fin Metodo DisputarPartido
}//Fin Class Jugador Campos
