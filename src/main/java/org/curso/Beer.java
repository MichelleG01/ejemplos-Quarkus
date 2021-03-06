package org.curso;

import org.curso.validador.NotExpired;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Beer {

    //Haciendo uso de las especificacion quarkus-hibernate-validator
    //Podemos realizar validaciones
    @NotNull
    @NotBlank
    private String name;
    @Min(100)
    private int capacity;

    //Haciendo uso de una anotacion propia para validacion
    @NotExpired
    @JsonbDateFormat("yyyy-MM-dd")
    private LocalDate expired;

    public Beer() {
    }

    public Beer(String name, int capacity, LocalDate expired) {
        this.name = name;
        this.capacity = capacity;
        this.expired = expired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LocalDate getExpired() {
        return expired;
    }

    public void setExpired(LocalDate expired) {
        this.expired = expired;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", expired=" + expired +
                '}';
    }
}
