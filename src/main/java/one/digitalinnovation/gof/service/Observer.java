package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

public interface Observer {
    void update(Cliente cliente, String action);
}
