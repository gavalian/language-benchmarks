import org.jlab.jnp.hipo4.data.Event;
import org.jlab.jnp.hipo4.data.Bank;
import org.jlab.jnp.hipo4.io.HipoReader;
import org.jlab.jnp.utils.benchmark.*;
import org.jlab.jnp.physics.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Analysis {

public static void run(String dataFile){
  HipoReader reader = new HipoReader();

  reader.open(dataFile);

  Event      event  = new Event();
  Bank       particle   = new Bank(reader.getSchemaFactory().getSchema("REC::Particle"));
  Bank       detector   = new Bank(reader.getSchemaFactory().getSchema("REC::Calorimeter"));
  // Loop over all events
  Map<Integer,List<Integer> > response = new HashMap<Integer, List<Integer> >();
  

  Vector3 vec = new Vector3();

  BenchmarkTimer btimer = new BenchmarkTimer("operation");


  int counterSf_gt_One = 0;
  int counterSf_lt_One = 0;
  int c1 = 0;
  int c2 = 0;
  int c3 = 0;
  int counter = 0;
  while(reader.hasNext()==true){

    reader.nextEvent(event);
    event.read(particle);
    event.read(detector);

    int nrows_d = detector.getRows();
    response.clear();
    btimer.resume();
    for(int i = 0; i < nrows_d; i++){
      int pindex = detector.getInt(1,i);
      if(response.containsKey(pindex)==false){
          response.put(pindex,new ArrayList<>());
        }
        response.get(pindex).add(i);
      }


      int nrows_p = particle.getRows();
      for(int p = 0; p < nrows_p; p++){
        c1++;
        int charge = particle.getInt(8,p);
        if(charge==0){
          c2++;
          double px = particle.getFloat(1,p);
          double py = particle.getFloat(2,p);
          double pz = particle.getFloat(3,p);
          vec.setXYZ(px,py,pz);
          double energy = 0.0;
          if(response.containsKey(p)==true){
            c3++;
            List<Integer> index = response.get(p);
            for(Integer ind : index){
                  energy += detector.getFloat(5,ind);
                }
           if(vec.mag()/energy>1.0){
              counterSf_gt_One++;
           } else {
              counterSf_lt_One++;
           }
           //System.out.printf("%12.5f\n", vec.mag()/energy);
         }
     }
  }
  btimer.pause();

  counter++;
}

System.out.println("processed counter = " + counter + " sf ratio " + counterSf_gt_One + " / " + counterSf_lt_One);
System.out.printf(" c1 / c2 / c3 = %d / %d /%d \n",c1,c2,c3);
System.out.println(btimer);

}

public static void main(String[] args){
  String dataFile = args[0];
  for(int i = 0; i < 5; i++){
    Analysis.run(dataFile);
  }
}
}
