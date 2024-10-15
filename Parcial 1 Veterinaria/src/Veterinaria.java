import java.util.ArrayList;

public final class Veterinaria implements iAnimal, iVeterinario{
    private ArrayList<Animal> jaula;

    public Veterinaria() {
        this.jaula = new ArrayList<>();
    }

    public void darDeAlta(Animal animal) {
        jaula.add(animal);
    }

    public boolean darDeBaja(Animal animal) {
        if(jaula.remove(animal) == true) {
            return true; //Fue eliminado con exito
        }
        return false;
    }

    public boolean esterilizarGato(Gato gato) {
        if (gato.isEsterilizado() == false) {
            gato.setEsterilizado(true);
            return true; // El gato fue esterilizado
        }
        return false;
    }

    public void cargarVisitaPerro(String visita, Perro perro) {
        perro.getVisitas().add(visita);
    }

    public void cargarVisitaGato(String visita, Gato gato) {
        gato.getVisitas().add(visita);
    }

    public void confirmarToxina(Reptil reptil, boolean toxina) {
        reptil.setVenenoso(toxina);
    }

    public String alimentarse() {
        for (Animal animal : jaula) {
            return "El animal fue alimentado.";
        }
        return "El animal ya comio hoy.";
    }

    public String revisionVet() {
        for (Animal animal : jaula) {
            return "El animal fue revisado.";
        }
        return "El animal ya mejoro.";
    }

    public boolean vacunarPerro(Perro perro) {
        if (perro.isVacunado() == false) {
            perro.setVacunado(true);
            return true; // El perro fue vacunado
        }
        return false;
    }

    public boolean eliminarPorNumVet(Integer numero) {
        for (Animal animal : jaula) {
            if (animal.getNumVet().equals(numero)) {
                jaula.remove(animal);
                return true; // Se elimino correctamente
            }
        }
        return false;
    }

    public Integer contarPerros() {
        Integer contador = 0;
        for (Animal animal : jaula) {
            if(animal instanceof Perro) {
                contador++;
            }
        }
        return contador;
    }
}
