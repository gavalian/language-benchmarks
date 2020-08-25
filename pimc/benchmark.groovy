//***************************************************
// Groovy script to calculate value of PI using
// Monte-Carlo method. 
//***************************************************
int nThrows = 0; int nSuccess = 0;
double x, y;
long then = System.nanoTime();
Random rnd = new Random();
int events=(int)1e8;
for (int i = 0; i < events; i++)   {
   //x = Math.random(); y = Math.random();     // Throw a dart
   x = rnd.nextFloat();
   y = rnd.nextFloat();
   nThrows++;
   if ( x*x + y*y <= 1 )  nSuccess++;
}
double itime = ((System.nanoTime() - then)/ ((double)1e9));
System.out.printf("GROOVY : pi value =  %.6f time (sec) = %.4f\n", 4*nSuccess/((double) nThrows),itime);

