package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BancApp {
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        ArrayList<Cuenta> listaCuentas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcionprincipal;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("[1] Mantenimiento de clientes");
            System.out.println("[2] Mantenimiento de cuentas");
            System.out.println("[0] Salir");
            System.out.print("Elige opción: ");
            opcionprincipal = sc.nextInt();
            sc.nextLine();

            switch (opcionprincipal) {

                case 1:
                    int opcion_clientes;
                    do {
                        System.out.println("\n--- MENU CLIENTES ---");
                        System.out.println("[1] Altas");
                        System.out.println("[2] Bajas");
                        System.out.println("[3] Modificaciones");
                        System.out.println("[4] Listado de clientes");
                        System.out.println("[0] Volver al menú principal");
                        System.out.print("Elige opción: ");
                        opcion_clientes = sc.nextInt();
                        sc.nextLine();

                        switch (opcion_clientes) {
                            case 1:
                                System.out.println("altas");
                                System.out.println("introduce el nombre del cliente");
                                String nombre = sc.nextLine();
                                System.out.println("introduce el apellido");
                                String apellido = sc.nextLine();

                                Cliente cliente1 = new Cliente(nombre,apellido);
                                listaClientes.add(cliente1);
                                System.out.println("añadido correctamente");

                                break;
                            case 2:
                                System.out.println("bajas");
                                System.out.println("introduce el nombre que quieres borrar");
                                String nombre_erase = sc.nextLine();
                                System.out.println("introduce el apellido que quieres borrar");
                                String apellidos_erase = sc.nextLine();

                                for (int i =0; i<listaClientes.size(); i++){
                                    Cliente nombre_borrar =listaClientes.get(i);
                                    if (nombre_borrar.getNombre().equalsIgnoreCase(nombre_erase) && nombre_borrar.getApellidos().equalsIgnoreCase(apellidos_erase)){
                                        listaClientes.remove(nombre_borrar);
                                        System.out.println("cliente eliminado correctamente");
                                        break;
                                    }
                                }

                                break;
                            case 3:
                                System.out.println("modificaciones");
                                for (int i =0; i<listaClientes.size(); i++){
                                    Cliente mostrar_ = listaClientes.get(i);
                                    System.out.println(mostrar_);

                                }
                                System.out.println("introduce el id");
                                String id_mod = sc.nextLine();
                                boolean encontrado = false;

                                // buscar cliente por id

                                for (int i =0; i<listaClientes.size(); i++){
                                    Cliente id_busc = listaClientes.get(i);

                                    if (id_busc.getId().equalsIgnoreCase(id_mod)){
                                        System.out.println("introduce el nombre");
                                        String nuevo_nombre = sc.nextLine();
                                        System.out.println("introduce el nuevo apellido");
                                        String nuevo_apellido = sc.nextLine();
                                        id_busc.setApellidos(nuevo_apellido);
                                        id_busc.setNombre(nuevo_nombre);

                                        System.out.println("usuario encontrado");
                                        encontrado = true;
                                        break;
                                    }
                                }

                            case 4:
                                System.out.println("listado de clientes");
                                System.out.println(" --- listado clientes ---");
                                for (int i =0; i<listaClientes.size(); i++){
                                    Cliente cliente = listaClientes.get(i);
                                    System.out.println(cliente);
                                    System.out.println(cliente.getId() +" - " +cliente.getNombre()+ " - "+cliente.getApellidos());
                                }
                                break;
                            case 0:
                                System.out.println("volver al menu principal");
                                break;
                            default:
                                System.out.println("opcion invalida");
                        }

                    } while (opcion_clientes != 0);
                    break;

                case 2:
                    int opcion_cuentas;
                    do {
                        System.out.println("\n--- MENU CUENTAS ---");
                        System.out.println("[1] Consultar cuentas cliente");
                        System.out.println("[2] Ver todas las cuentas");
                        System.out.println("[0] Volver al menu principal");
                        System.out.print("Elige opción: ");
                        opcion_cuentas = sc.nextInt();
                        sc.nextLine();

                        switch (opcion_cuentas) {
                            case 1:
                                System.out.println("CONSULTAR CUENTAS CLIENTE");

                                System.out.println("Introduce el nombre:");
                                String nombreBuscado = sc.nextLine();

                                System.out.println("Introduce los apellidos:");
                                String apellidosBuscados = sc.nextLine();

                                boolean tieneCuentas = false;

                                for (int i = 0; i < listaCuentas.size(); i++) {
                                    Cuenta c = listaCuentas.get(i);

                                    if (c.getTitular() != null &&
                                            c.getTitular().getNombre().equalsIgnoreCase(nombreBuscado) &&
                                            c.getTitular().getApellidos().equalsIgnoreCase(apellidosBuscados)) {

                                        System.out.println(c);
                                        tieneCuentas = true;
                                    }
                                }

                                if (!tieneCuentas) {
                                    System.out.println("Ese cliente no tiene cuentas asociadas.");
                                }

                                break;

                            break;
                            case 2:
                                System.out.println("ver todas las cuentas");
                                break;
                            case 0:
                                System.out.println("volver al menu principal");
                                break;
                            default:
                                System.out.println("opcion invalida");
                        }

                    } while (opcion_cuentas != 0);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcionprincipal != 0);

        sc.close();
    }
}
