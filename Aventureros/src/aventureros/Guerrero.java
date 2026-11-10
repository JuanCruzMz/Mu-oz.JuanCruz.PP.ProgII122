
package aventureros;


public class Guerrero extends Aventurero implements Entrenable
{
    private int fuerza;

    
    public Guerrero(String codigo, String nombre, Rango rango, int fuerza)
    {
        super(codigo, nombre, rango);
        
        if (fuerza <= 0)
        {
            throw new IllegalArgumentException("El valor de fuerza del guerrero debe ser mayor que cero.");
        }
        else
        {
            this.fuerza = fuerza;
        }
    }
    
    
    public int getFuerza()
    {
        return fuerza;
    }


    @Override
    public void atacar()
    {
        System.out.println(getNombre() + " ataca ferozmente con su espada. Fuerza: " + this.fuerza);
    }

    @Override
    public int calcularPoderDeCombate()
    {
        return this.fuerza * 2;
    }

    @Override
    public void entrenar()
    {
        System.out.println(getNombre() + " realiza un riguroso entrenamiento físico de combate.");
    }
}