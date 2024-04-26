package lib;

public class Tiempo implements Comparable<Tiempo> {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int a_horas, int a_minutos, int a_segundos) {
        this.horas = a_horas;
        this.minutos = a_minutos;
        this.segundos = a_segundos;
    }

    public Tiempo suma(Tiempo otroTiempo) {
        int totalHoras = this.horas + otroTiempo.horas;
        int totalMinutos = this.minutos + otroTiempo.minutos;
        int totalSegundos = this.segundos + otroTiempo.segundos;

        if (totalSegundos >= 60) {
            totalMinutos++;
            totalSegundos -= 60;
        }
        if (totalMinutos >= 60) {
            totalHoras++;
            totalMinutos -= 60;

        }
        return new Tiempo(totalHoras, totalMinutos, totalSegundos);
    }

    public Tiempo resta(Tiempo otroTiempo) {
        int totalHoras = this.horas - otroTiempo.horas;
        int totalMinutos = this.minutos - otroTiempo.minutos;
        int totalSegundos = this.segundos - otroTiempo.segundos;

        if (totalSegundos < 0) {
            totalMinutos--;
            totalSegundos += 60;
        }
        if (totalMinutos < 0) {
            totalHoras--;
            totalMinutos += 60;
        }

        return new Tiempo(Math.max(0, totalHoras), Math.max(0, totalMinutos), Math.max(0, totalSegundos));

    }

    public int compareTo(Tiempo otroTiempo) {
        if (this.horas != otroTiempo.horas) {
            return Integer.compare(this.horas, otroTiempo.horas);
        } else if (this.minutos != otroTiempo.minutos) {
            return Integer.compare(this.minutos, otroTiempo.minutos);
        } else {
            return Integer.compare(this.segundos, otroTiempo.segundos);
        }
    }

    public String toString() {
        return String.format("%dh %dm %ds", horas, minutos, segundos);
    }
}
