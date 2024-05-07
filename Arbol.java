public class Arbol {
    private Nodo primero;
    
    public Arbol() {
        this.primero = null;

    }
    public void insertar(Comparable <Object> valor){
        if (this.primero == null) {
            this.primero = new Nodo(valor);
            } else{
                this.primero.insertar(valor);
            }

    }

    public void ordenPreOrden(){
       this.preOrden(this.primero);
    }

    public void preOrden(Nodo Nod){
        if(Nod == null){
            return;
        }else{
          System.out.print(Nod.getValor()+", ");
            preOrden(Nod.getIzquierdo());
            preOrden(Nod.getDerecho());
            
        }

    }

    public void ordenInOrden(){
       this.InOrden(this.primero);
    }

    public void InOrden(Nodo Nod){
        if(Nod == null){
            return;
        }else{
            InOrden(Nod.getIzquierdo());
          System.out.print(Nod.getValor()+", ");
            InOrden(Nod.getDerecho());
            
        }
    }

    public void ordenPostOrden(){
       this.PostOrden(this.primero);
    }

    public void PostOrden(Nodo Nod){
        if(Nod == null){
            return;
        }else{
            PostOrden(Nod.getIzquierdo());
            PostOrden(Nod.getDerecho());
            System.out.print(Nod.getValor()+", ");
            
        }
    }

    public int Grado(){
        return Grado(this.primero);
    }
    private int Grado (Nodo n) {
        if(n == null){
            return 0;
        }
        int GradoN = 0;
        if(n.getIzquierdo() != null)GradoN++;
        if(n.getDerecho()!=null)GradoN++;
        int GradoIzq = Grado(n.getIzquierdo());
        int GradoDer = Grado(n.getDerecho());
        return Math.max(GradoN, Math.max(GradoIzq,GradoDer));
    }

    public int CalcularNivel(Comparable <Object> valorBuscado){
        return CalcularNivel(this.primero,valorBuscado,1);
    }

    private int CalcularNivel(Nodo nodo, Comparable <Object> valorBuscado, int nivelActual){
        if(nodo == null){
            return -1;
        }
        if(nodo.getValor().equals(valorBuscado)){
            return nivelActual;
        }
        int NivelIzq = CalcularNivel(nodo.getIzquierdo(), valorBuscado, nivelActual +1);
        int NivelDer = CalcularNivel(nodo.getDerecho(), valorBuscado, nivelActual+1);

        return Math.max(NivelIzq,NivelDer);
    }

    public int CalcularAltura(){
        return CalcularAltura(this.primero);
    }
    private int CalcularAltura(Nodo n){
        if(n == null){
            return -1;
        }
        int AlturaIzq = CalcularAltura(n.getIzquierdo());
        int AlturaDer = CalcularAltura(n.getDerecho());
        return 1+ Math.max(AlturaIzq, AlturaDer);
    }
}
