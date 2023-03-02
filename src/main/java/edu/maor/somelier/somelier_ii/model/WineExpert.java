package edu.maor.somelier.somelier_ii.model;

public class WineExpert {
    public static final String BLANCO = "BLANCO";
    public static final String ROSADO = "ROSADO";
    public static final String TINTO = "TINTO";

    public static final Wine[] BLANCO_WINES = {
            new Wine("Château de Climens", BLANCO, "res/wineso/chateauClimens.png"),
            new Wine("Pazo de Señoráns", BLANCO, "res/wines/pazoSenorans.webp"),
            new Wine("Albamar", BLANCO, "res/wines/albamar.webp")
    };

    public static final Wine[] ROSADO_WINES = {
            new Wine("Pícaro del Águila Clarete", ROSADO,"res/wines/picaroAguila.png"),
            new Wine("Le Rosé de Antídoto", ROSADO,"res/wines/roseAnti.png" ),
            new Wine("Viña Tondonia Rosado Gran Reserva", ROSADO,"res/wines/tondoniaRGR.png")
    };



    public static final Wine[] TINTO_WINES = {
            new Wine("Casa Ermita", TINTO, "img/wines/casasErmita.png"),
            new Wine("Finca Antigua", TINTO, "img/wines/fincaAntigua.png"),
            new Wine("Pesquera Reserva", TINTO, "img/wines/pesquera.webp")
    };

    public String[] getTypes(){
        return new String[]{BLANCO, ROSADO, TINTO};
    }

    public Wine[] getWineByType(String color){
        switch (color) {
            case "BLANCO":
                return BLANCO_WINES;
            case "ROSADO":
                return ROSADO_WINES;
            case "TINTO":
                return TINTO_WINES;
            default:
                return null;
        }
    }
}
