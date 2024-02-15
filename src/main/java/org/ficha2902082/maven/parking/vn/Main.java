package org.ficha2902082.maven.parking.vn;
//Importar dependencias 
import org.ficha2902082.maven.parking.vn.entities.Carro; 
import org.ficha2902082.maven.parking.vn.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.vn.entities.Cliente;
import org.ficha2902082.maven.parking.vn.entities.TipoDocumento;
public class Main {
    public static void main(String[] args) {
        //Crear dos instancias 
        // de la clase carro
        Carro carrito1 = new Carro();
        carrito1.placa = "ASB 345";
        carrito1.tipoVehiculo = TipoVehiculo.CAMIONETA;

        Carro carrito2 = new Carro();
        carrito2.placa = "DMK 765";
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;

        Carro carrito3 = new Carro();
        carrito3.placa = "COZ 92E";
        carrito3.tipoVehiculo = TipoVehiculo.MOTO; 

///////////////

        Cliente cliente1 = new Cliente();
        cliente1.nombre = "NICOLAS";
        cliente1.apellidos = "ROMERO";
        cliente1.tipoDocumento = TipoDocumento.CC;
        cliente1.numeroDocumento = 1014667051L;
        cliente1.celular = 3118482726L;

        //AÑADIR CARROS AL CLIENTE
        //Invocar llamar, ejecutar el metodo
        //El metodo AddCar
        cliente1.addCar(carrito1);
        cliente1.addCar(carrito2); 
        cliente1.addCar("ASD 456", TipoVehiculo.MOTO);

        System.out.println("Cliente:");
        System.out.println("documento:" + cliente1.numeroDocumento);
        System.out.println("tipoDocumento:" + cliente1.tipoDocumento);
        System.out.println("nombre:" + cliente1.nombre);
        System.out.println("apellido:" + cliente1.apellidos);
        System.out.println("celular:" + cliente1.celular);
        System.out.println("Vehiculos:");
        for( Carro c : cliente1.misCarros){
            System.out.println("placa:" + c.placa);
            System.out.println("tipo:" + c.tipoVehiculo);
            System.err.println("_____________");

        }








    }
}