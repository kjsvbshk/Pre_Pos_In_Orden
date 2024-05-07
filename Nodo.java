public class Nodo {
    private Comparable <Object> valor;
    private Nodo izquierdo, derecho;


    public Nodo(Comparable <Object>valor){
        this.valor = valor;
        this.derecho = null;
        this.izquierdo = null;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }
    public Comparable<Object> getValor() {
        return valor;
    }
    public void setValor(Comparable<Object> valor) {
        this.valor = valor;
    }
    public void insertar(Comparable <Object> valor_N){
        if(valor_N.compareTo(this.valor)<0){
            if(this.izquierdo == null){
                this.izquierdo= new Nodo(valor_N);
            }else{
                this.izquierdo.insertar(valor_N);
            }
        }else if(valor_N.compareTo(this.valor)>0){
            if(this.derecho==null){
                this.derecho = new Nodo(valor_N);
            }else{
                this.derecho.insertar(valor_N);
            }
        }
    }

}