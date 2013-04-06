package Appi;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class TimeOPeration {


    public Time sumarTime(java.sql.Time hora1, java.sql.Time hora2) {
        return operacionTime(hora1, hora2, "+");
    }

    public Time sumarTime(List<java.sql.Time> horas) {
        long suma = 0;
        for (java.sql.Time hora : horas) {
            if (suma == 0) {
                suma = hora.getTime();
            } else {
                suma = operacionMilisegundos(getMilisegundosToTime(suma), hora, "+");
            }
        }
        return getMilisegundosToTime(suma);
    }

    public Time restarTime(java.sql.Time hora1, java.sql.Time hora2) {
        return operacionTime(hora1, hora2, "-");
    }

    private Time operacionTime(java.sql.Time hora1, java.sql.Time hora2, String operacion) {
        long lnMilisegundos = operacionMilisegundos(hora1, hora2, operacion);
        return new java.sql.Time(lnMilisegundos);
    }

    private long operacionMilisegundos(java.sql.Time hora1, java.sql.Time hora2, String operacion) {
        long time1 = getMilisegundosDesde1970(hora1);
        long time2 = getMilisegundosDesde1970(hora2);

        long timeTotal = 0;
        if (operacion.equals("+")) {
            timeTotal = time1 + time2;
        } else if (operacion.equals("-")) {
            timeTotal = time1 - time2;
        }

        java.util.Date utilDate = new java.util.Date("1970/01/01 " + milisegundosToStringHoras(timeTotal));
        long lnMilisegundos = utilDate.getTime();
        return lnMilisegundos;
    }

    private long getMilisegundosDesde1970(java.sql.Time hora) {
        long returnAux = 0;

        //creamos una fecha con la hora que nos pasan y fecha 1970/01/01
        java.util.Date fecha = new java.util.Date("1970/01/01 " + hora.toString());

        Calendar calendarIn = new GregorianCalendar();
        calendarIn.setTime(fecha);
        SimpleDateFormat sdf = new SimpleDateFormat();

        sdf.applyPattern("HH");
        calendarIn.set(Calendar.HOUR_OF_DAY, Integer.parseInt(sdf.format(fecha.getTime())));
        sdf.applyPattern("mm");
        calendarIn.set(Calendar.MINUTE, Integer.parseInt(sdf.format(fecha.getTime())));
        sdf.applyPattern("ss");
        calendarIn.set(Calendar.SECOND, Integer.parseInt(sdf.format(fecha.getTime())));

        returnAux = calendarIn.getTimeInMillis();

        // el java.sql.time hay que sumarle una hora
        // ya que java.sql.Time t = new java.sql.Time(0) = 01:00:00
        return returnAux + 3600000;
    }

    private Time getMilisegundosToTime(long milisegundos) {
        return new java.sql.Time(milisegundos);
    }

    private String milisegundosToStringHoras(long milisegundos) {
        String auxReturn;
        double milisegundosAux = milisegundos;

        Float horaD = new Float(milisegundosAux / 3600000);
        int hora = Math.round(horaD);

        Float restoHora = new Float(milisegundosAux % 3600000);

        Float minutoD = restoHora / 60000;
        int minuto = minutoD.intValue();

        Float restoMinutos = restoHora % 60000;

        Float segundosD = restoMinutos / 1000;
        int segundos = segundosD.intValue();

        auxReturn = hora + ":" + minuto + ":" + segundos;

        return auxReturn;
    }
    
    public double[] PrepararHoras(String ini, String fin) {
        double horas[] = new double[2];
        try {
            String[] tiempo_i,tiempo_f;
            
            System.out.println("ini: "+ini+" fin:"+fin);
            tiempo_i = ini.split(":");
            tiempo_f = fin.split(":");

            double  h_ini =Double.valueOf(tiempo_i[0]+"."+tiempo_i[1]);
            double  h_fin =Double.valueOf(tiempo_f[0]+"."+tiempo_f[1]);
            System.out.println("1: "+h_ini+" 2:"+h_fin);
            //System.out.println("h_ini: "+h_ini+" h_fin: "+h_fin);

            double HoraS = (int) h_ini;
            double HoraE = (int) h_fin;

            //System.out.println("HoraS: "+HoraS+" HoraE: "+HoraE);
            
            double MinS= redondear((h_ini-HoraS), 2)*100;
            double MinE= redondear(h_fin-HoraE,2)*100;
            
            //System.out.println("MinS: "+MinS+" MinE: "+MinE);

            HoraS=(HoraS*60)+MinS;
            HoraE=(HoraE*60)+MinE;
            horas[0]=HoraS;
            horas[1]=HoraE;
            } catch(Exception e) {
                System.out.println("Error en la preparacion de horas : "+ini+" + "+fin+" - "+e );
            }
        return horas;
     }
      public String SumaHoras(String ini, String fin) {
          String suma = "00:00";
          try {
            double horas[] = new double[2];
            horas = PrepararHoras(ini, fin);
            double Horas=0;
            double DblSumHora=0;
            double HoraS = horas[0];
            double HoraE = horas[1];
              //System.out.println("HoraS: "+HoraS+" HoraE: "+HoraE);

              Horas=redondear(HoraS+HoraE,2);

              DblSumHora=DblSumHora+Horas;

              //System.out.println("DblSumHora: "+DblSumHora);

              //Transformando a horas

              DblSumHora=(int) (DblSumHora/60)+((DblSumHora%60)/100);
              DblSumHora=redondear(DblSumHora, 2);
              suma=String.valueOf(DblSumHora);
              suma=suma.replace(".",":");
          } catch(Exception e){
              System.out.println("Error en la suma de horas : "+ini+" + "+fin+" - "+e );
          }
        return suma;
    }
    public String RestaHoras(String ini, String fin) {
          String resta = "00:00";
          try {
            double horas[] = new double[2];
            horas = PrepararHoras(ini, fin);
            double Horas=0;
            double DblRestHora=0;
            double HoraS = horas[0];
            double HoraE = horas[1];
              //System.out.println("HoraS: "+HoraS+" HoraE: "+HoraE);

              Horas=redondear(HoraS-HoraE,2);

              DblRestHora=DblRestHora+Horas;

              //System.out.println("DblSumHora: "+DblSumHora);

              //Transformando a horas

              DblRestHora=(int) (DblRestHora/60)+((DblRestHora%60)/100);
              DblRestHora=redondear(DblRestHora, 2);
              resta=String.valueOf(DblRestHora);
              resta=resta.replace(".",":");
          } catch(Exception e){
              System.out.println("Error en la resta de horas : "+ini+" + "+fin+" - "+e );
          }
        return resta;
    }
    public double redondear( double numero, int decimales )  {
        return Math.round(numero*Math.pow(10,decimales))/Math.pow(10,decimales);
    }

}
