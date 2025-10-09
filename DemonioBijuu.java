public class DemonioBijuu {
    private String habilidades; // Só a class DemonioBijuu pode acessar

    public String getHabilidades() { // método público para ACESSAR o atributo privado
        return habilidades;
    };

    public void setHabilidades(String habilidades) { // método público para MODIFICAR o atributo privado
        this.habilidades = habilidades;
    };
}


public