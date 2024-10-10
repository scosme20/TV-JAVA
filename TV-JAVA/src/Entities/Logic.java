package Entities;

public class Logic {
    private boolean estado;
    private int canal;
    private int volume;

    public Logic(boolean estado, int canal, int volume) {
        this.estado = estado;
        this.canal = canal;
        this.volume = volume;
    }

    public Logic(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }


    public Logic(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void ligada() {
        this.estado = true;
    }

    public void desligada() {
        this.estado = false;
    }

    public void aumentarVolume(int volume){
        if(this.volume + volume > 100){
            this.volume = 100;
        } else{
            this.volume += 100;
        }
    }

    public void abaixarVolume(int volume){
        if(this.volume + this.volume < 0){
            this.volume = 0;
        } else{
            this.volume -= this.volume;
        }
    }

    public void selecionarCanal(int canal){
        if(canal >= 1 && canal <= 999){
            this.canal = canal;
        } else {
            System.out.println("Insira um canal válido");
        }
    }
}
