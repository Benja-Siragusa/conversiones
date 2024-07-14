class evaluar {
    public static void main(String[] ar) {
        double f;
        f = calcula();
        mostrar(f);
    }

    static double calcula() {
        double x = 3.14159 / 4.0;
        return x * Math.sin(x) + 0.5;
    }

static void mostrar (double r)
{
System.out.println ("Valor de la función: "+ r) ;
}/* 

    termina la
    declaración de
    la clase*/
}
