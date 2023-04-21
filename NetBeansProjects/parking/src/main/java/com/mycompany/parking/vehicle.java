package com.mycompany.parking;



import java.time.Duration;
import java.time.LocalDateTime;

public class vehicle {
    protected String matricula; // Matrícula del vehicle
    
    protected LocalDateTime dataHoraEntrada; // Hi desaré quan el vehicle entra al parking

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getHoraEntrada() {
        return dataHoraEntrada;
    }

    // Posa una hora d'entrada específica
    public void setDataHoraEntrada(LocalDateTime horaEntrada) {
        this.dataHoraEntrada = horaEntrada;
    }

    // Posa com hora d'entrada l'hora actual
    public void setDataHoraEntrada() {
        this.dataHoraEntrada = LocalDateTime.now();
    }

    public double calcularPreu() {
        LocalDateTime dataHoraActual = LocalDateTime.now();
        Duration durada = Duration.between(this.dataHoraEntrada,dataHoraActual);
        double preu = durada.getSeconds() * parking.PREU_MINUT;
        // La constant PREU_MINUT no està definida encara, substitueix-la pel valor 3.

        //double preu = durada.getSeconds() * 3;

        return preu; 
    } 
}


