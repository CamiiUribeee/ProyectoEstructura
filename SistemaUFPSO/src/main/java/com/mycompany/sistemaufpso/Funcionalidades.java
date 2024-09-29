
package com.mycompany.sistemaufpso;
import javax.swing.JOptionPane;

public class Funcionalidades {
    
    Escenario[] escenarios;
    String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
    
    public void crearEscenario() {
        String[] nombresEscenarios = {"GYM", "Teatro bellas artes", "Canchas sintéticas", "Restaurante escolar"};
        escenarios = new Escenario[4];
        
        // Datos que nos dió el profe 
        escenarios[0] = new Escenario(nombresEscenarios[0], new int[] {23, 78, 34, 23, 45, 23});
        escenarios[1] = new Escenario(nombresEscenarios[1], new int[] {67, 45, 67, 45, 46, 34});
        escenarios[2] = new Escenario(nombresEscenarios[2], new int[] {89, 23, 88, 66, 55, 56});
        escenarios[3] = new Escenario(nombresEscenarios[3], new int[] {54, 26, 48, 19, 21, 78});
    }
    
    public void llenarEscenariosManual() {
    String[] nombresEscenarios = {"GYM", "Teatro Bellas Artes", "Canchas sintéticas", "Restaurante escolar"};
    
    escenarios = new Escenario[4]; 
    
    // Recorrer cada escenario
    for (int i = 0; i < nombresEscenarios.length; i++) {
        int[] visitantesPorDia = new int[6]; // 6 días de la semana
        
        // Pedir el número de visitantes para cada día de la semana
        for (int j = 0; j < dias.length; j++) {
            String input = JOptionPane.showInputDialog(null, 
                "Ingrese la cantidad de visitantes para " + nombresEscenarios[i] + " el " + dias[j] + ":");
            
            // Convertir el input a entero y almacenarlo en el array
            try {
                visitantesPorDia[j] = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, ingrese un número válido.");
                j--; // Repetir el día si hubo un error
            }
        }
        
        // Crear un nuevo escenario con los valores ingresados
        escenarios[i] = new Escenario(nombresEscenarios[i], visitantesPorDia);
    }
    
    JOptionPane.showMessageDialog(null, "Matriz de visitantes llenada correctamente.");
}
    
    public String EscenarioMasVisitado() {
        Escenario MasVisitado = null;
        int maxVisitantes = 0;
        
        for (Escenario escenario : escenarios) {
            int totalVisitantes = escenario.getTotalVisitantes();
            if (totalVisitantes > maxVisitantes) {
                maxVisitantes = totalVisitantes;
                MasVisitado = escenario;
            }
        }
        
        return "1. El escenario más visitado es " + MasVisitado.getNombre() + " con " + maxVisitantes + " visitantes.\n";
    }
    
    public String[][] getDatosTabla() {
        // Devuelve los datos en el formato necesario para JTable
        String[][] datos = new String[escenarios.length][7]; // 4 escenarios, 7 columnas (nombre + lunes a sábado)

        for (int i = 0; i < escenarios.length; i++) {
            datos[i][0] = escenarios[i].getNombre(); // Nombre del escenario
            int[] visitantes = escenarios[i].getVisitantesPorDia();
            for (int j = 0; j < visitantes.length; j++) {
                datos[i][j + 1] = String.valueOf(visitantes[j]); // Visitantes de lunes a sábado
            }
        }
        return datos;
    }
    
    // Día más visitado en el restaurante escolar
    public String DiaMasVisitadoRestaurante() {
        Escenario restaurante = escenarios[3]; // Restaurante es el cuarto escenario
        int[] visitantes = restaurante.getVisitantesPorDia();
        int diaMax = 0;

        for (int i = 1; i < visitantes.length; i++) {
            if (visitantes[i] > visitantes[diaMax]) {
                diaMax = i;
            }
        }
        return "2. El día más visitado del Restaurante es " + dias[diaMax] + " con " + visitantes[diaMax] + " visitantes.\n";
    }
     
     // Escenario menos visitado durante toda la semana
    public String escenarioMenosVisitado() {
        Escenario menosVisitado = null;
        int minVisitantes = Integer.MAX_VALUE;

        for (Escenario escenario : escenarios) {
            int totalVisitantes = escenario.getTotalVisitantes();
            if (totalVisitantes < minVisitantes) {
                minVisitantes = totalVisitantes;
                menosVisitado = escenario;
            }
        }

        return "3. El escenario menos visitado es " + menosVisitado.getNombre() + " con " + minVisitantes + " visitantes.\n";
    }
    
     // Total de personas que visitan todos los escenarios durante la semana
    public String TotalVisitantesSemana() {
        int total = 0;
        for (Escenario escenario : escenarios) {
            total += escenario.getTotalVisitantes();
        }
        
        return "4. El total de visitantes en la semana fue de "+total +".\n";
    }
    // Promedio de visitantes en la semana
    public String PromedioVisitantesSemana() {
        double total = 0;
        for (Escenario escenario : escenarios) {
            total += escenario.getTotalVisitantes();
        }
        
        
        int numDias = escenarios[0].getVisitantesPorDia().length; // Número de días en la semana
        total = total / numDias;
        return "5. El promedio de visistantes es: "+total +".\n";
    }
    
    
    // Día de la semana que más tiene visitantes y el día que menos tiene
    public String DiaConMasYMenosVisitantes() {
        int[] totalPorDia = new int[6]; // Para los 6 días de la semana

        for (Escenario escenario : escenarios) {
            int[] visitantes = escenario.getVisitantesPorDia();
            for (int i = 0; i < visitantes.length; i++) {
                totalPorDia[i] += visitantes[i];
            }
        }

        int diaMax = 0;
        int diaMin = 0;

        for (int i = 1; i < totalPorDia.length; i++) {
            if (totalPorDia[i] > totalPorDia[diaMax]) {
                diaMax = i;
            }
            if (totalPorDia[i] < totalPorDia[diaMin]) {
                diaMin = i;
            }
        }

        return "6. El día con más visitantes es " + dias[diaMax] + " y el día con menos visitantes es " + dias[diaMin]+".\n";
    }

    // Día de la semana y escenario más y menos visitado
    public String DiaYEscenarioMasYMenosVisitado() {
        int maxVisitantes = 0;
        int minVisitantes = Integer.MAX_VALUE;
        Escenario escenarioMax = null;
        Escenario escenarioMin = null;
        int diaMax = 0;
        int diaMin = 0;

        for (Escenario escenario : escenarios) {
            int[] visitantes = escenario.getVisitantesPorDia();
            for (int i = 0; i < visitantes.length; i++) {
                if (visitantes[i] > maxVisitantes) {
                    maxVisitantes = visitantes[i];
                    escenarioMax = escenario;
                    diaMax = i;
                }
                if (visitantes[i] < minVisitantes) {
                    minVisitantes = visitantes[i];
                    escenarioMin = escenario;
                    diaMin = i;
                }
            }
        }

        return "7. El escenario más visitado es " + escenarioMax.getNombre() + " en " + dias[diaMax] + 
               ", y el escenario menos visitado es " + escenarioMin.getNombre() + " en " + dias[diaMin] +".\n";
    }
    
    public String EscenarioMasYmenosVisitado(){
        Escenario teatro = escenarios[1]; // Teatro es el segundo escenario
        int[] visitantes = teatro.getVisitantesPorDia();
        int diaMax = 0;
        int diaMin = 0;
        
        for (int i = 1; i < visitantes.length; i++) {
            if (visitantes[i] > visitantes[diaMax]) {
                diaMax = i;
            }
        }
        
        for (int i = 1; i < visitantes.length; i++) {
            if (visitantes[i] < visitantes[diaMax]) {
                diaMin = i;
            }
        }
        
        int totalVisitantes = 0;
        for (int i = 0; i < visitantes.length; i++) {
            totalVisitantes += visitantes[i];
        }

    
        double promedio = totalVisitantes / (double) visitantes.length;
        
        return "8. El teatro de bellas artes. El dia mas visitado es "+dias[diaMax]+" el dia menos visitado es "+dias[diaMin]+" el promedio de asistestes es "+promedio;
    }
    
    //A PARTIR DE AQUÍ INICIA EL MANEJO DE LA LISTA SIMPLE Y LA FUNCIONALIDAD DEL CINE 
    
    public String mostrarCarteleraPeli() {
        
        String[] peliculas = {"Venom", "Gladiador", "Avatar", "Joker", "Jurassic World"};
        StringBuilder cartelera = new StringBuilder("Cartelera de películas:\n"); //creo la cedena de texto
    
        for (int i = 0; i < peliculas.length; i++) {
            cartelera.append((i + 1) + ". " + peliculas[i] + "\n");
        }
    
        return cartelera.toString();
    }
    
}