
package aventureros;


public class Mago extends Aventurero
{
    private int mana;

    
    public Mago(String codigo, String nombre, Rango rango, int mana)
    {
        super(codigo, nombre, rango);
        
        if (mana <= 0)
        {
            throw new IllegalArgumentException("El valor de maná del mago debe ser mayor a cero");
        }
        else
        {
            this.mana = mana;
        }
    }

        
    public int getMana()
    {
        return mana;
    }

    @Override
    public void atacar()
    {
        System.out.println(getNombre() + "dice \"Fire ball!\" y te tira una fire ball. Daño: " + this.mana);
    }

    @Override
    public int calcularPoderDeCombate()
    {
        return this.mana + 10;
    }
}