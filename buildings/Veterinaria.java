package buildings;

import java.util.ArrayList;
import java.util.List;

import animals.*;
public class Veterinaria {
    List<Animal> pacientes;

    public Veterinaria() {
        pacientes = new ArrayList<>();
    }

    public Veterinaria(List<Animal> a) {
        pacientes = a;
    }

    public int cuantosPacientesHay() {
        if (pacientes!=null) {
            return pacientes.size();
        } else {
            return 0;
        }
    }
}
