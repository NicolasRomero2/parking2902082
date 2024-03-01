package org.ficha2902082.maven.parking.vn;

import java.util.List;
import java.util.ArrayList;

import org.ficha2902082.maven.parking.vn.entities.Registro;
import org.ficha2902082.maven.parking.vn.entities.Carro;
import org.ficha2902082.maven.parking.vn.entities.Cliente;
import org.ficha2902082.maven.parking.vn.entities.Cupo;
import org.ficha2902082.maven.parking.vn.entities.Empleado;
import org.ficha2902082.maven.parking.vn.entities.TipoDocumento;
import org.ficha2902082.maven.parking.vn.entities.TipoVehiculo;
import java.time.LocalDate;
import java.time.*;

public class Main {

    public static void main(String[] args){

        //Crear dos cupos 
        //Instanciar dos cupos

        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.0;
        cupito1.largo = 4.5;
        cupito1.letra = 'A';
        //istanciar dos carritos
        Cupo cupito2 = new Cupo('B', 5.0, 2.5);
        Carro carrito1 = new Carro("ABC123", TipoVehiculo.CARRO);
        Carro carrito2 = new Carro("DFG456", TipoVehiculo.CAMIONETA);
        Cliente clientesito1 = new Cliente("Nicolas", "Romero Lozano", TipoDocumento.TI, 1146124198L, 3068981473L);
        Empleado empleadito1 = new Empleado("Carlos", 1232324L);
        Empleado empleadito2 = new Empleado("Juan", 45692838923L);
        Empleado empleadito3 = new Empleado("Gabriel", 78992838L);
        Empleado empleadito4 = new Empleado("Felipe", 63458923L);
        Empleado empleadito5 = new Empleado("Martin", 9892838L);
        clientesito1.addCar(carrito1);
        clientesito1.addCar(carrito2);
        clientesito1.addCar("MNT789",TipoVehiculo.TAXI);

        //Declarar lista de registros

        List <Registro> misRegistros = new ArrayList<>();

        //Instanciar dos registros de entrada y salida (E/S)

        Registro registro1 = new Registro(
            LocalDate.of(2024, Month.JANUARY, 23) , 
            LocalTime.of(15, 30, 34),
            LocalDate.of(2024, Month.FEBRUARY, 1),
            LocalTime.of(6, 30, 23),
            50000.00,
            clientesito1.misCarros.get(0),
            cupito1,
            empleadito1);

        LocalDate fi1 = LocalDate.of(2023 , Month.DECEMBER, 24);
        LocalTime hi1 = LocalTime.of(11, 23, 40);

        LocalDate ff1 = LocalDate.of(2023 , Month.JANUARY, 24);
        LocalTime hif1 = LocalTime.of(22, 32, 40);
        Double valorR2 = 50000.0;

        Registro r2 = new Registro(fi1, hi1, ff1, hif1, valorR2, clientesito1.misCarros.get(0), cupito2, empleadito1);


        //Vinvular los registros a la lista de registros
        

        Registro registro2 = new Registro(
            LocalDate.of(2024,Month.JANUARY , 30),
            LocalTime.of(6,35,59),
            LocalDate.of(2024, Month.JULY, 29),
            LocalTime.of(7,45,12),
            75000.00,
            clientesito1.misCarros.get(1),
            cupito2,
            empleadito2        
        );

        Registro registro3 = new Registro(
            LocalDate.of(2024,Month.JANUARY , 30),
            LocalTime.of(6,35,59),
            LocalDate.of(2024, Month.JULY, 29),
            LocalTime.of(7,45,12),
            75000.00,
            clientesito1.misCarros.get(1),
            cupito2,
            empleadito3        
        );

        Registro registro4 = new Registro(
            LocalDate.of(2024,Month.JANUARY , 30),
            LocalTime.of(6,35,59),
            LocalDate.of(2024, Month.JULY, 29),
            LocalTime.of(7,45,12),
            75000.00,
            clientesito1.misCarros.get(1),
            cupito2,
            empleadito4        
        );

        Registro registro5 = new Registro(
            LocalDate.of(2024,Month.JANUARY , 30),
            LocalTime.of(6,35,59),
            LocalDate.of(2024, Month.JULY, 29),
            LocalTime.of(7,45,12),
            75000.00,
            clientesito1.misCarros.get(1),
            cupito1,
            empleadito5        
        );

        misRegistros.add(registro1);
        misRegistros.add(registro2);
        misRegistros.add(registro3);
        misRegistros.add(registro4);
        misRegistros.add(registro5);

        misRegistros.add(registro2);
        //recorrer la lista de registros
        for( Registro r : misRegistros ){
            System.out.println("Placa: " + 
                                r.carro.placa  +  "|" +
                                "Cupo: " +
                                r.cupo.letra + "|" +
                                "Valor: " +
                                r.valor +  "|"+
                                "Fecha Inicio: " +
                                r.fechaInicio.toString() + "|" +
                                "Empleado: " +
                                r.empleado.nombre+ "|"
                                +
                                "codigo: " +
                                r.empleado.codigo+ "|" 

            );
        }

    }

}          