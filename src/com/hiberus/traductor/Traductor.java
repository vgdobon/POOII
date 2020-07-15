package com.hiberus.traductor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Traductor {
        public String [] palabrasEspañol;//={"si","sino","para","mientras","cambiar"};
        public String [] palabrasIngles;//={"if","else","for","while","switch"};

        private boolean noEsta;

        public Traductor(){
            palabrasEspañol = readStringsFromFile("spanish-words.txt");
            palabrasIngles = readStringsFromFile("english-words.txt");
        }

        public String[] readStringsFromFile(String path) {
            try {
                List<String> strings = Files.readAllLines(Paths.get(path));
                return strings.toArray(new String[strings.size()]);
            } catch (IOException e) {
                return null;
            }
        }

    public void Buscar(String busquedaPalabra){
            int i;
            for (i = 0; i < palabrasEspañol.length; i++) {
                if(palabrasEspañol[i].equalsIgnoreCase(busquedaPalabra)){
                    System.out.println(DevuelveTraduccion(i,busquedaPalabra));
                    break;
                }
            }
            if(i==palabrasEspañol.length){
                System.out.println(NoEsta());
            }
        }

        public String DevuelveTraduccion(int i,String BusquedaPalabra){

            return BusquedaPalabra+" en ingles es: "+palabrasIngles[i];
        }

        public String NoEsta(){
            return "No aparece tu palabra";
        }

}
