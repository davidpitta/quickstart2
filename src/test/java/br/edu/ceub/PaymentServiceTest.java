package br.edu.ceub;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class PaymentServiceTest {

    @Test
    void processPayment_retorna_true_com_valores_corretos() {
        // Preparar
        List<OrderItem> lista = List.of(
                new OrderItem("Produto A", 60.0, 1),
                new OrderItem("Produto B", 50.0, 2),
                new OrderItem("Produto C", 30.0, 3)
        );
        String orderId = "id";

        Order order = new Order(orderId, lista);
        PaymentService paymentService = new PaymentService();

        //Executar
        boolean result = paymentService.processPayment(order, 250);

        // Verificar
        assertTrue(result);
    }

    @Test
    void processPayment_retorna_false_com_total_incorreto() {
        // Preparar
        List<OrderItem> lista = List.of(
                new OrderItem("Produto A", 60.0, 1),
                new OrderItem("Produto B", 50.0, 2),
                new OrderItem("Produto C", 30.0, 3)
        );
        String orderId = "id";

        Order order = new Order(orderId, lista);
        PaymentService paymentService = new PaymentService();

        //Executar
        boolean result = paymentService.processPayment(order, 140);

        // Verificar
        assertFalse(result);
    }
}