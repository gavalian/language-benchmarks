#include <iostream>
#include <stdlib.h>
#include <cmath>
#include <chrono>

int main(){
  int events = (int) 1e8;
  double x,y;
  int nThrows = 0;
  int nSuccess = 0;

  double factor = 1.0/( (double) RAND_MAX);
  auto start = std::chrono::high_resolution_clock::now();
  for(int i = 0; i < events; i++){
    x = rand()*factor;
    y = rand()*factor;
    nThrows++;
    if( x*x + y*y <= 1.0) nSuccess++;
  }
  auto finish = std::chrono::high_resolution_clock::now();
  std::chrono::duration<double> elapsed = finish - start;
  
  double pi = ( (double) 4.0*nSuccess )/((double) nThrows);
  printf("C++    : pi value =  %.6f time (sec) = %.4f\n", 4*nSuccess/((double) nThrows),elapsed.count());
  //printf("pi = %f %d %d\n",pi, nThrows,nSuccess);
  return 1;
}
