package ATV03;

public class Animais {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    boolean estado;
    private int caloria;
    private int forca;

    public Animais(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.estado = true;
        this.caloria = 10;
        this.forca = 10;
        System.out.println("O animal se chama " + nome + " é da classe " + classe + " da familia " + familia
                + ". O animal possui força de " + forca + ", caloria de " + caloria + " e idade de " + idade);
    }

    public void morrer() {
        this.forca = 0;
        this.estado = false;
        System.out.println("O animal morreu!!");
    }

  
    public void comer(){
        if (this.estado && this.caloria < 100) {
            this.caloria += 10;
            this.forca -= 2;
            System.out.println("O animal comeu e agora sua força é de " + forca + " e suas calorias valem " + caloria);
        }
    }

    public void correr() {
            if (this.estado && this.caloria > 0) {
                this.forca -= 5;
                this.caloria -= 5;
                System.out.println("O animal está correndo!! Agora sua força é de " + forca + " e suas calorias valem " + caloria);
            }
        }

    public void dormir() {
        if (this.estado) {
            this.forca += 10;
            this.caloria -= 2;
            System.out.println("O animal está dormindo agora! Sua força aumentou para " + forca
                    + " e suas calorias aumentaram para " + caloria);
        }
    }
}
