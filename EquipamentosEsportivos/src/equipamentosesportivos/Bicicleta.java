
package equipamentosesportivos;

   class Bicicleta extends EquipamentosEsportivos {

    private String tipo;

    public Bicicleta(String nome, double precoAluguel, String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int definirDurabilidade() {
        return 50;
    }

    String getNome() {
        return null;
      
    }
} 

