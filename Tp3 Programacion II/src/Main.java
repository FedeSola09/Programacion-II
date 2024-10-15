public class Main
{
    public static void main(String[] args)
    {
//        // Punto 1
//        Autobus bondi = new Autobus(571, 30, TipoTransporte.AUTOBUS);
//        Tranvia subte = new Tranvia("Ruta 2", 80, TipoTransporte.TRANVIA);
//        Bicicleta cleta = new Bicicleta("A533B", TipoTransporte.BICICLETA);
//
//        String parada = "La rioja";
//        int nuevaVia = 223;
//        int altura = 7;
//
//        bondi.arrancar();
//        bondi.detener();
//        bondi.obtenerCapacidad();
//        bondi.anunciarParada(parada);
//        subte.arrancar();
//        subte.detener();
//        subte.obtenerCapacidad();
//        subte.cambiarVia(nuevaVia);
//        cleta.arrancar();
//        cleta.detener();
//        cleta.obtenerCapacidad();
//        cleta.ajustarAsiento(altura);

        // Punto 2
        Pato patito = new Pato(true, false, "cuack");
        Murcielago vampiro = new Murcielago(false, true, "ultrasonico");
        Pez nemo = new Pez(false, false, "bloop");

        System.out.println("PATO: ");
        System.out.println("Hambre:" + patito.hambre);
        System.out.println("Sueño:" + patito.sueño);
        System.out.println("Sonido:" + patito.sonido);
        patito.caminata();
        patito.vuelo();
        patito.natacion();
        System.out.println("MURCIELAGO: ");
        System.out.println("Hambre:" + vampiro.hambre);
        System.out.println("Sueño:" + vampiro.sueño);
        System.out.println("Sonido:" + vampiro.sonido);
        vampiro.caminata();
        vampiro.vuelo();
        System.out.println("PEZ: ");
        System.out.println("Hambre:" + nemo.hambre);
        System.out.println("Sueño:" + nemo.sueño);
        System.out.println("Sonido:" + nemo.sonido);
        nemo.natacion();

        // Punto 3
        VehiculoVarios camion = new VehiculoVarios("camion");
        camion.contarToneladas();
        VehiculoVarios auto = new VehiculoVarios("auto");
        auto.contarPasajeros();
        VehiculoVarios bici = new VehiculoVarios("bici");
        bici.contarPasajeros();
        camion.toString();
        auto.toString();
        bici.toString();

    }
}