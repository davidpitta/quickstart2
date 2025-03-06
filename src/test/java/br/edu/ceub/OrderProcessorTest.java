package br.edu.ceub;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderProcessorTest {

    @Test
    void computeTotal_lista_vazia_deve_retornar_zero() {
        // Preparar
        OrderProcessor orderProcessor = new OrderProcessor();
        String orderId = "id";
        ArrayList lista = new ArrayList();

        Order order = new Order(orderId, lista);

        //Executar
        double total = orderProcessor.computeTotal(order);

        // Verificar
        assertEquals(0, total);
    }

    @Test
    void computeTotal_lista_valor_250_deve_retornar_250() {
        // Preparar
        List<OrderItem> lista = List.of(
                new OrderItem("Produto A", 60.0, 1),
                new OrderItem("Produto B", 50.0, 2),
                new OrderItem("Produto C", 30.0, 3)
        );
        String orderId = "id";

        Order order = new Order(orderId, lista);
        OrderProcessor orderProcessor = new OrderProcessor();

        //Executar
        double total = orderProcessor.computeTotal(order);

        // Verificar
        assertEquals(250, total);
    }
}