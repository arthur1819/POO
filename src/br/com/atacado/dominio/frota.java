package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class frota extends BaseTransporte {

    private List<Veiculo> veiculos;

    public List<Veiculo> getVeiculos() {

        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {

        this.veiculos = veiculos;
    }

    public frota() {
    }

    public frota(int codigoTransporte, String descricao, LocalDate dataInsert) {

        super(codigoTransporte, descricao, dataInsert);
    }
}
