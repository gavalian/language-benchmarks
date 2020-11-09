//package bench;

import  java.util.Random;
import java.lang.Math;

public class BenchmarkTrig {

  public void doBenchmark(boolean print){
    int nThrows = 0; int nSuccess = 0;
    double x, y;

    Random rnd = new Random();

    int events=(int)1e8;
    int nSuccessCos = 0;
    int nSuccessTan = 0;

    long time_rand = 0L;
    long time_acos = 0L;
    long time_atan = 0L;

    for (int i = 0; i < events; i++)   {
      //x = Math.random(); y = Math.random();     // Throw a dart
      long then = System.nanoTime();
      x = rnd.nextFloat();
      y = rnd.nextFloat();
      nThrows++;
      time_rand += (System.nanoTime() - then);
      double r = Math.sqrt(x*x+y*y);
      then = System.nanoTime();
      double theta_acos = Math.acos(x/r);
      if ( theta_acos<Math.PI*0.5 )  nSuccessCos++;
      time_acos += (System.nanoTime() - then);
      then = System.nanoTime();
      double theta_atan = Math.atan2(y,x);
      if ( theta_atan < Math.PI*0.5 )  nSuccessTan++;
      time_atan += (System.nanoTime() - then);
    }

    if(print==true){
      System.out.printf("JAVA   : area acos =  %.6f \n",4*nSuccessCos/((double) nThrows));
      System.out.printf("JAVA   : area atan =  %.6f \n",4*nSuccessTan/((double) nThrows));
      System.out.printf("JAVA   : time (rand) = %.4f sec\n", ((double) time_rand)/10e9 );
      System.out.printf("JAVA   : time (acos) = %.4f sec\n", ((double) time_acos)/10e9 );
      System.out.printf("JAVA   : time (atan) = %.4f sec\n", ((double) time_atan)/10e9 );
    }
  }

  public static void main(String[] args){
     BenchmarkTrig bench = new BenchmarkTrig();

     // this is warmup round printout is set to false
     System.out.println("warmup - round 1");
     bench.doBenchmark(false);
     System.out.println("warmup - round 2");
     bench.doBenchmark(false);
     //--- now benchmark round
     System.out.println("benchmark");
     bench.doBenchmark(true);

  }
}
