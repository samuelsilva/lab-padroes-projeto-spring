package one.digitalinnovation.gof.service;

import org.springframework.stereotype.Component;

import one.digitalinnovation.gof.model.Cliente;

@Component
public class ClienteObserver implements Observer {
    
    @Override
    public void update(Cliente cliente, String action) {
        System.out.println("Cliente " + action + ": " + cliente.getNome());
        // Aqui você pode adicionar lógica adicional para responder às mudanças.
    }
}
