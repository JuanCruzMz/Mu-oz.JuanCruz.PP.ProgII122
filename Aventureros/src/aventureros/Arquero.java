
package aventureros;


public class Arquero extends Aventurero implements Entrenable
{
    private int precision;

    
    public Arquero(String codigo, String nombre, Rango rango, int precision)
    {
        super(codigo, nombre, rango);
        
        if (precision <= 0)
        {
            throw new IllegalArgumentException("El valor de precisión del arquero debe ser mayor a cero");
        }
        else
        {
            this.precision = precision;
        }
    }

    
    public int getPrecision()
    {
        return precision;
    }

    
    @Override
    public void atacar()
    {
        System.out.println("Flechipollazo");
    }

    @Override
    public int calcularPoderDeCombate()
    {
        return this.precision * 3;
    }

    @Override
    public void entrenar()
    {
        System.out.println("Buenasss");
    }
}   