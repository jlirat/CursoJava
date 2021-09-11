import animals.Dog;
import animals.Horse;
import animals.Parrot;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import animals.Animal;
import animals.AnimalJson;
import animals.Cat;

public class Main {
    public static void main(String args[]) {
        String urlAccesoDatos = "https://gist.githubusercontent.com/davidcp22/d1967026b327ce66af7371725cea4c8a/raw/6fc6ca5f1eb5d9f0118b948362bc1d844f424c6b/animales.json";
        
        Dog bendi = new Dog("pug", 3, "beige");
        Dog oskar = new Dog("doberman", 9, "black");
        Cat ramiro = new Cat("malish", 1, "black");
        Parrot juancho = new Parrot("austrailian", 5, "green");
        bendi.namedAs("Bendi");
        oskar.namedAs("Oskar");
        juancho.namedAs("juancho");

        bendi.barking();
        bendi.setAge(4);
        System.out.println(String.format("%s is my weight", bendi.getWeight()));
        oskar.barking();
        ramiro.barking();
        juancho.barking();

        try{
            String json = readUrl(urlAccesoDatos);
            Type listType = new TypeToken<ArrayList<AnimalJson>>(){}.getType();
            List<AnimalJson> list = new Gson().fromJson(json, listType);

            ArrayList<Animal> lst = new ArrayList<>();

            for(AnimalJson animal: list) {
                switch(animal.Tipo) {
                    case  "Gato":
                        Cat gato = new Cat("mestizo", 1, "nose");
                        gato.setName(animal.Nombre);
                        gato.setObservacion(animal.Observacion);
                        gato.setId(animal.id);
                        lst.add(gato);
                        break;
                    case "Perro":
                        Dog perro = new Dog();
                        perro.setName(animal.Nombre);
                        perro.setObservacion(animal.Observacion);
                        perro.setId(animal.id);
                        lst.add(perro);
                        break;
                    case "Caballo":
                        Horse caballo = new Horse("mestizo", 1, "nose");
                        caballo.setName(animal.Nombre);
                        caballo.setObservacion(animal.Observacion);
                        caballo.setId(animal.id);
                        lst.add(caballo);
                        break;
                    case "Pajaro":
                        Parrot pajaro = new Parrot("mestizo", 1, "nose");
                        pajaro.setName(animal.Nombre);
                        pajaro.setObservacion(animal.Observacion);
                        pajaro.setId(animal.id);
                        lst.add(pajaro);
                        break;

                }
            }
            
            for(Animal animal:lst) {
                System.out.println(animal.getObservacion());
                if (animal instanceof Dog) {
                    ((Dog) animal).barking();
                } 
                if (animal instanceof Cat) {
                    ((Cat) animal).barking();
                }
                if (animal instanceof Horse) {
                    ((Horse) animal).barking();
                }
                if (animal instanceof Parrot) {
                    ((Parrot) animal).barking();
                }
            }
        } catch(Exception ex) {

        }
        

    }
    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read); 
    
            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }
}
