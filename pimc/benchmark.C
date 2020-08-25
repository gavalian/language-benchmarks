{
  
  int events = (int) 1e8;
  TRandom rndm;
  double x,y;
  int nThrows  = 0;
  int nSuccess = 0;
  TBenchmark benchmark;
  benchmark.Start("pi");
  for(int i = 0; i < events; i++){
    x = rndm.Rndm();
    y = rndm.Rndm();
    nThrows++;
    if((x*x+y*y)<=1.0) nSuccess++;
  }
  benchmark.Stop("pi");
  double pi = 4.0*((double ) nSuccess )/nThrows;
  printf("CINT   : pi value =  %.6f time (sec) = %.4f\n",pi,benchmark.GetRealTime("pi"));
}
